FROM ubuntu

MAINTAINER Carlos Barbero <carlosrgomes@gmail.com>

RUN apt-get update && \
	apt-get -y install wget && \
	wget --no-check-certificate https://googledrive.com/host/0B-pq-jjAzsDpQzBJTE41YVNORFE  -O was7.tar.gz && \
	wget --no-check-certificate https://googledrive.com/host/0B-pq-jjAzsDpcTZ1RHU3a1pyUVU -O drivers.tar.gz && \ 
	tar -xzvf was7.tar.gz && \ 
	rm -rf was7.tar.gz &&  mv IBM /opt/ && \  
	tar -xzvf drivers.tar.gz && mv drivers /opt/ && \
	rm -rf drivers.tar.gz && \
	apt-get clean
	
EXPOSE 2809  9402 9403 9353 9633 9100 9401 7276 7286 5558 5578 5060 5061 8880 9060 9043 9443 9080 9060 7777 443

ENTRYPOINT ["/opt/IBM/WebSphere/AppServer/bin/startServer.sh", "server1"]