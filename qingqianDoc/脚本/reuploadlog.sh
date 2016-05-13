#!/bin/sh

filename=/opt/sitvnew/reupload/lsresult.log

/opt/sitvnew/reupload/ftpls.sh >> $filename

today=`date --date="1 days ago" +%Y%m%d`

logfilenaccess='access_'$today'_20.log'

logfilenlogon='logon_'$today'_20.log'

logfilenplay='play_'$today'_20.log'

#logfilenauth='auth_'$today'_20.log'

#logfilenboclient='boclient_'$today'_20.log'

#logfilenorder='order_'$today'_20.log'

echo begin checking

ret=`grep -c $logfilenaccess $filename`
if [ $ret -eq 0 ]; then
    echo $logfilenaccess not exist
    /opt/sitvnew/reupload/upload.sh $logfilenaccess
else
    echo $logfilenaccess exist
fi

ret=`grep -c $logfilenplay $filename`
if [ $ret -eq 0 ]; then
    echo $logfilenplay not exist
    /opt/sitvnew/reupload/upload.sh $logfilenplay
else
    echo $logfilenplay exist
fi


ret=`grep -c $logfilenlogon $filename`
if [ $ret -eq 0 ]; then
    echo $logfilenlogon not exist
    /opt/sitvnew/reupload/upload.sh $logfilenlogon
else
    echo $logfilenlogon exist
fi


#ret=`grep -c $logfilenauth $filename`
#if [ $ret -eq 0 ]; then
#    echo $logfilenaut not exist
#    /opt/sitvnew/reupload/upload.sh $logfilenauth
#else
#    echo $logfilenauth exist
#fi



#ret=`grep -c $logfilenboclient $filename`
#if [ $ret -eq 0 ]; then
#    echo $logfilenboclient not exist
#    /opt/sitvnew/reupload/upload.sh $logfilenboclient
#else
#    echo $logfilenboclient exist
#fi



#ret=`grep -c $logfilenorder $filename`
#if [ $ret -eq 0 ]; then
#    echo $logfilenorder not exist
#    /opt/sitvnew/reupload/upload.sh $logfilenorder
#else
#    echo $logfilenorder exist
#fi


rm -rf $filename
