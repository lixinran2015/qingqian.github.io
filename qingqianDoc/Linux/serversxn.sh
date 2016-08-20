#!/bin/bash
# 初始化基础变量
test_dir=/data
res_dir=${test_dir}/result
res_sum=${res_dir}/sum.log
file_size=500
mem_total=$(free -g|awk 'NR==2{print $2}')
cpu_core_count=$(grep -c processor /proc/cpuinfo)
# 检查系统和软件包
[ -f /etc/debian_version ] || exit $?
dpkg-query -s sysbench || apt-get -y --force-yes install sysbench
# 创建基础目录
cd $test_dir || exit $?
mkdir -pv $res_dir
# 记录一些基本信息
hostname | tee ${res_sum}
sysbench --version | tee -a ${res_sum}
date | tee -a ${res_sum}
uname -a | tee -a ${res_sum}
head /proc/cpuinfo | grep 'model name' | awk -F': ' '{print $2}' | tee -a ${res_sum}
# 测试CPU性能
for cc in $(seq ${cpu_core_count});do 
    sysbench --batch --test=cpu --cpu-max-prime=20000 --num-threads=${cc} run > $res_dir/cpu-bm-c${cc}.log
done
# 测试内存读写性能
for bs in 1 4;do
    sysbench --batch --test=memory --memory-block-size=${bs}K --memory-scope=global --memory-total-size=${mem_total}G --memory-oper=read run > $res_dir/mem-r-s${bs}.log
    sysbench --batch --test=memory --memory-block-size=${bs}K --memory-scope=global --memory-total-size=${mem_total}G --memory-oper=write run > $res_dir/mem-w-s${bs}.log
done
# 测试硬盘IO
sysbench --batch --test=fileio --file-total-size=${file_size}G prepare
for md in "direct" "O_DIRECT" "O_DSYNC" "O_SYNC" "string";do
for fm in "rndrd" "rndwr" "rndrw" "seqrd" "seqwr";do
for th in 1 4 8 16 32;do
    sysbench --batch --test=fileio --file-total-size=${file_size}G --num-threads=${th} --file-extra-flags=${md} --file-test-mode=${fm} \
    --file-block-size=4K --rand-init=on --max-time=300 --max-requests=0 run > $res_dir/io-${th}-${md}-${fm}.log
done
done
done
sysbench --batch --test=fileio --file-total-size=${file_size}G cleanup 
# 输出结果
grep 'execution time' $res_dir/*.log | awk -F':' '{print $1,$3}' | tee -a ${res_sum}