#!/bin/bash
#created by wangkn at 2016-03-15
#function:delete data from the database's table which is specified

#-----------------------------Setting----Start-------------------------------
#setting the values of database specified
DBUser=root
DBPasswd=chances
DBName=sc_epg_release4_read

#setting the paths
ShellFilePath=/opt/product/sitv/shell
BackupPath=/opt/product/sitv/shell/backup/
LogFile=/opt/product/sitv/shell/log/db_backup.log

#setting the data
BackDay=`date +%y%m%d`
BackTime=`date '+%Y-%m-%d %H:%M:%S'`
DumpFile="$BackupPath"backup_epg_category_item_$BackDay.sql
#-----------------------------Setting----End-------------------------------

#-----------------------------backup-----Start------------------------------
#dump database
if [ -f $DumpFile ]
then
   echo "$BackTime [$DumpFile] The Backup File exists,Can't Backup epg_category_item!" >> $LogFile
else
   /usr/bin/mysqldump -u$DBUser -p$DBPasswd -e --max_allowed_packet=1048576 --net_buffer_length=16384 --default-character-set=utf8 -t $DBName epg_category_item --where="status=0" > $DumpFile
   echo "$BackTime [$DumpFile] Backup epg_category_item Success!" >> $LogFile
fi
#-----------------------------backup-----End---------------------------------

#-----------------------------Delete-----Start-------------------------------
/usr/bin/mysql -u$DBUser -p$DBPasswd -e "
use $DBName
delete from epg_category_item where status=0;
quit
"
if [ $? -eq 0 ]
then
   echo "$BackTime Delete epg_category_item Data Success!">>$LogFile
else
   echo "$BackTime Delete epg_category_item Data Failed!">>$LogFile
fi
#-----------------------------Delete-----End---------------------------------
exit 0;
