#!/bin/bash
# 初始化基础变量
test_dir=/opt/test/lixr/mysqltest/
file_size=500
test_file=/opt/test/lixr/tools/sysbench-0.5/sysbench/tests/db/oltp.lua
update_file=/opt/test/lixr/tools/sysbench-0.5/sysbench/tests/db/update_index.lua
nom=" --mysql-db=sbtest --mysql-socket=/opt/mysql/mysql.sock --mysql-host=localhost --mysql-port=3307 --mysql-user=root --mysql-password=123456 --oltp-tables-count=10 --oltp-table-size=10000000"
for th in 8 16 32 64 128 256 512 1024;do
    #sysbench --test=${test_file} --num-threads=${th} --oltp-read-only=on  --oltp-test-mode=nontrx  --report-interval=5  $nom --max-time=600  run > ${th}-600-5.7-read
    #sysbench --test=${test_file} --num-threads=${th} --report-interval=5 --oltp-dist-type=uniform --rand-init=on --oltp-test-mode=nontrx --oltp-nontrx-mode=select --oltp-read-only=on --oltp-skip-trx=on --max-time=600  run > ${th}-600-5.7-read-simple
    sysbench --test=${test_file} --num-threads=${th} --report-interval=5 --oltp-dist-type=uniform --rand-init=on --oltp-test-mode=nontrx --oltp-nontrx-mode=complex --oltp-read-only=on --oltp-skip-trx=on --max-time=600  run > ${th}-600-5.7-read-complex
	sysbench --test=${test_file} --num-threads=${th} --report-interval=5 --oltp-dist-type=uniform --rand-init=on --oltp-test-mode=nontrx --oltp-nontrx-mode=complex --oltp-read-only=off --oltp-skip-trx=on --max-time=600  run > ${th}-600-5.7-mix-complex
    sysbench --test=${update_file} --num-threads=${th} --report-interval=5 --oltp-dist-type=uniform --rand-init=on --oltp-read-only=off --max-time=600  run > ${th}-600-5.7-update
done