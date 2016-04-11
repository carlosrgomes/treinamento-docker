# Imagem Base
FROM  ubuntu

# Created by
MAINTAINER Carlos Barbero <carlosrgomes@gmail.com>

ENV APACHE_SERVERNAME="localhos"t
ENV APACHE_SERVERADMIN="admin@localhost"
ENV APACHE_DOCUMENTROOT="/var/www"
ENV APACHE_RUN_USER="www-data"
ENV APACHE_RUN_GROUP="www-data"
ENV APACHE_LOG_DIR="/var/web/log/apache2"
ENV APACHE_PID_FILE="/var/run/apache2.pid"
ENV APACHE_RUN_DIR="/var/run/apache2"
ENV APACHE_LOCK_DIR="/var/lock/apache2"

VOLUME /var/www/html/

#Command linux update, install apache, clear apt-get and remove libs from install
RUN apt-get update && \ 
    apt-get install -y apache2 && \
    apt-get clean && \ 
    rm -rf /var/lib/apt/lists/*

#Expose port
EXPOSE 80

#Commad principal process
CMD ["/usr/sbin/apache2", "-D", "FOREGROUND"]



    
