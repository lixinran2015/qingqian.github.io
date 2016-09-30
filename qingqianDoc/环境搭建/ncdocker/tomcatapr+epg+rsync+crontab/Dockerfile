FROM tomcat:apr3
MAINTAINER chances-lixr
VOLUME [ "/opt/product/data/" ]
ADD epg.xml /opt/product/tools/tomcat-epg/conf/Catalina/localhost/
WORKDIR /opt/product/tools/tomcat-epg/bin
ADD all.sh /root/
RUN chmod +x /root/all.sh
ENTRYPOINT ["/root/all.sh"]
CMD ["/usr/sbin/init"]
