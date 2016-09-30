#!/bin/bash
 
export JAVA_HOME=/opt/product/tools/jdk1.8.0_51
export PATH=$JAVA_HOME/bin:$PATH
if [ ! -L /opt/product/data/apps/epg/resource ] ;then
ln -s /opt/product/data/epg-data/cms-picture/ /opt/product/data/apps/epg/resource
fi
if [ ! -L /opt/product/data/apps/epg/template ] ;then
ln -s /opt/product/data/epg-data/cms-template/runtime/  /opt/product/data/apps/epg/template
fi
sh /opt/product/tools/tomcat-epg/bin/catalina.sh run


