FROM centos
MAINTAINER chances-lixr
LABEL Vendor="CentOS"
LABEL License=GPLv2
LABEL Version 10.1.16


RUN yum -y install --setopt=tsflags=nodocs epel-release && \
    yum -y install --setopt=tsflags=nodocs libaio bind-utils pwgen psmisc hostname && \
    yum -y erase vim-minimal && \
    yum -y update && yum clean all

RUN mkdir -p /usr/local/mysql/;groupadd mysql;useradd -g mysql mysql;
RUN mkdir -p /usr/share/mysql/;
ADD ./mysql/ /usr/local/mysql/
ADD my.cnf /etc/
RUN cp /usr/local/mysql/bin/* /usr/bin/ ; cp -R /usr/local/mysql/share/ /usr/share/mysql/
RUN cd /usr/local/mysql/;chown -R mysql .;chgrp -R mysql .;

COPY docker-entrypoint.sh /

ENTRYPOINT ["/docker-entrypoint.sh"]
VOLUME /var/lib/mysql

# By default will run as random user on openshift and the mysql user (27)
# everywhere else
#USER 27

EXPOSE 3306
CMD ["mysqld_safe"]
