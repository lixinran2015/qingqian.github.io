#!/bin/bash
#created by wangkn at 2016-03-15
#function:delete data from the database's table which is specified

#-----------------------------Setting----Start-------------------------------
#setting the values of database specified
DBUser=root
DBPasswd=chances
DBName=sc_epg_release4_read
DelDays=210

#setting the paths
ShellFilePath=/opt/product/sitv/shell
BackupPath=/opt/product/sitv/shell/backup/
LogFile=/opt/product/sitv/shell/log/db_backup.log

#setting the data
BackDay=`date +%y%m%d`
BackTime=`date '+%Y-%m-%d %H:%M:%S'`
DumpFile="$BackupPath"backup_epg_content_schedule_$BackDay.sql
#-----------------------------Setting----End-------------------------------

#-----------------------------backup-----Start------------------------------
#dump database
if [ -f $DumpFile ]
then
   echo "$BackTime [$DumpFile] The Backup File exists,Can't Backup epg_content_schedule!" >> $LogFile
else
   /usr/bin/mysqldump -u$DBUser -p$DBPasswd -e --max_allowed_packet=1048576 --net_buffer_length=16384 --default-character-set=utf8 -t $DBName epg_content_schedule --where="TO_DAYS(NOW())-TO_DAYS(END_TIME)>=$DelDays" > $DumpFile
   echo "$BackTime [$DumpFile] Backup epg_content_schedule Success!" >> $LogFile
fi
#-----------------------------backup-----End---------------------------------

#-----------------------------Delete-----Start-------------------------------
/usr/bin/mysql -u$DBUser -p$DBPasswd -e "
use $DBName
delete from epg_content_schedule where TO_DAYS(NOW())-TO_DAYS(END_TIME)>=$DelDays;
quit
"
if [ $? -eq 0 ]
then
   echo "$BackTime Delete epg_content_schedule Data Success!">>$LogFile
else
   echo "$BackTime Delete epg_content_schedule Data Failed!">>$LogFile
fi
#-----------------------------Delete-----End---------------------------------
exit 0;
