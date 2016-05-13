#/bin/bash
#author wangkn
#date 2016-04-25
#function:installing mysql

#设置变量值
RpmPath=/usr/src

#安装可能用到的依赖包
yum -y install make gcc-c++ cmake bison-devel  ncurses-devel glibc* net-tools

#如果机器上已经安装的有mysql则卸载
  yum -y remove  mariadb-libs*
  yum -y remove mysql-lib*
  yum -y remove mysql
  yum -y remove mysql-server
  rm -rf /var/lib/mysql
  rm -rf /etc/my.cnf
  rm -rf /usr/lib64/mysql/
  rm -rf /var/log/mysqld.log
  rm -rf /root/.mysql_secret
  
#安装mysql
echo "*******************Start installing mysql******************"
rpm -ivh $RpmPath/mysql-community-common-5.7.12-1.el7.x86_64.rpm
rpm -ivh $RpmPath/mysql-community-libs-5.7.12-1.el7.x86_64.rpm
rpm -ivh $RpmPath/mysql-community-client-5.7.12-1.el7.x86_64.rpm
rpm -ivh $RpmPath/mysql-community-server-5.7.12-1.el7.x86_64.rpm
echo "*******************END installing mysql***********************"
echo ""

#修改配置文件位置,添加配置
echo "*******************Start setting my.cnf***********************"
cp /usr/share/mysql/my-default.cnf /etc/my.cnf
sed -i '$a lower_case_table_names=1' /etc/my.cnf
sed -i '$a datadir=/var/lib/mysql' /etc/my.cnf
sed -i '$a socket=/var/lib/mysql/mysql.sock' /etc/my.cnf
sed -i '$a symbolic-links=0\n' /etc/my.cnf
sed -i '$a [mysqld_safe]' /etc/my.cnf
sed -i '$a log-error=/var/log/mysqld.log' /etc/my.cnf
sed -i '$a pid-file=/var/run/mysqld/mysqld.pid' /etc/my.cnf
echo "*******************END setting my.cnf***********************"
echo ""

echo "*******************Start init mysql again***********************"
rm -rf /var/lib/mysql/*
rm -rf /var/lock/subsys/mysql
#重新初始化
/usr/sbin/mysqld --initialize-insecure --user=mysql
chown -R mysql:mysql /var/lib/mysql/
echo "*******************END init mysql again**************************"
echo ""

systemctl start mysqld
#设置root密码
/usr/bin/mysqladmin -uroot password  'chances'
#新增一个允许远程登录的用户
/usr/bin/mysql -uroot -pchances -e "
use mysql 
grant all privileges on *.* to 'admin'@'%' identified by 'admin1234' with grant option;
flush privileges;
quit
"

#设置开机自动启动
/sbin/chkconfig mysqld on
mysql_status=`systemctl list-unit-files|grep mysql|awk '{print$2}'`

#如果上个命令执行后有输出值，则输出Success，否则输出Failed
if [ "$mysql_status" = "enabled" ];then
   echo "*************************************************************************************************"
   echo "*		Install mysql Success!								*"
   echo "*		The default password for root is chances					*"
   echo "*		The default password for admin is admin1234					*"
   echo "*		Notice:root can't login remote,if you want to login remote use admin please!	*"
   echo "*************************************************************************************************"
else
   echo "*****************************************************************"
   echo "*		Install mysql Failed!				*"
   echo "******************************************************************"
fi

exit 0;
