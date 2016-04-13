# Imagem Base
FROM  ubuntu

# Created by
MAINTAINER Carlos Barbero <carlosrgomes@gmail.com>

ENV APACHE_CONFDIR /etc/apache2
ENV APACHE_ENVVARS $APACHE_CONFDIR/envvars
# and then a few more from $APACHE_CONFDIR/envvars itself
ENV APACHE_RUN_USER www-data
ENV APACHE_RUN_GROUP www-data
ENV APACHE_RUN_DIR /var/run/apache2
ENV APACHE_PID_FILE $APACHE_RUN_DIR/apache2.pid
ENV APACHE_LOCK_DIR /var/lock/apache2
ENV APACHE_LOG_DIR /var/log/apache2
#ENV APACHE_DOCUMENTROOT="/var/www"


#VOLUME /var/www/html/

#Command linux update, install apache, clear apt-get and remove libs from install
RUN mkdir -p $APACHE_RUN_DIR $APACHE_LOCK_DIR $APACHE_LOG_DIR && \ 
	apt-get update && \ 
    apt-get install -y apache2 && \
    apt-get clean 
	
#Expose port
EXPOSE 80

#Commad principal process
ENTRYPOINT ["/usr/sbin/apache2", "-D", "FOREGROUND"]



    
