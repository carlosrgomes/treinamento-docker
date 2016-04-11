FROM ubuntu
MAINTAINER Carlos Barbero <carlosrgomes@gmail.com>

RUN    apt-get update && \
	apt-get -y install wget && \
	wget --no-check-certificate https://googledrive.com/host/0B-pq-jjAzsDpQzBJTE41YVNORFE -O was7.tar.gz && \
	wget --no-check-certificate https://googledrive.com/host/0B-pq-jjAzsDpcTZ1RHU3a1pyUVU -O drivers.tar.gz && \ 
	tar -xzvf was7.tar.gz && \ 
	rm -rf was7.tar.gz &&  mv IBM /opt/ && \  
	tar -xzvf drivers.tar.gz && mv drivers /opt/ && \
	rm -rf drivers.tar.gz
	
EXPOSE 2809  9402 9403 9353 9633 9100 9401 7276 7286 5558 5578 5060 5061 8880 9060 9043 9443 9080 9060 7777 443

ENTRYPOINT ["/opt/IBM/WebSphere/AppServer/bin/startServer.sh", "server1"]

#ENTRYPOINT ["/opt/IBM/WebSphere/AppServer/java/bin/java","-Declipse.security","-Dwas.status.socket=49637","-Dosgi.install.area=/opt/IBM/WebSphere/AppServer","-Dosgi.configuration.area=/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/configuration","-Djava.awt.headless=true","-Dosgi.framework.extensions=com.ibm.cds,com.ibm.ws.eclipse.adaptors","-Xshareclasses:name=webspherev70_%g,groupAccess,nonFatal","-Xscmx50M","-Xbootclasspath/p:/opt/IBM/WebSphere/AppServer/java/jre/lib/ext/ibmorb.jar:/opt/IBM/WebSphere/AppServer/java/jre/lib/ext/ibmext.jar","-classpath","/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/properties:/opt/IBM/WebSphere/AppServer/properties:/opt/IBM/WebSphere/AppServer/lib/startup.jar:/opt/IBM/WebSphere/AppServer/lib/bootstrap.jar:/opt/IBM/WebSphere/AppServer/lib/jsf-nls.jar:/opt/IBM/WebSphere/AppServer/lib/lmproxy.jar:/opt/IBM/WebSphere/AppServer/lib/urlprotocols.jar:/opt/IBM/WebSphere/AppServer/deploytool/itp/batchboot.jar:/opt/IBM/WebSphere/AppServer/deploytool/itp/batch2.jar:/opt/IBM/WebSphere/AppServer/java/lib/tools.jar","-Dibm.websphere.internalClassAccessMode=allow","-Xms50m","-Xmx256m","-Xcompressedrefs","-Dws.ext.dirs=/opt/IBM/WebSphere/AppServer/java/lib:/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/classes:/opt/IBM/WebSphere/AppServer/classes:/opt/IBM/WebSphere/AppServer/lib:/opt/IBM/WebSphere/AppServer/installedChannels:/opt/IBM/WebSphere/AppServer/lib/ext:/opt/IBM/WebSphere/AppServer/web/help:/opt/IBM/WebSphere/AppServer/deploytool/itp/plugins/com.ibm.etools.ejbdeploy/runtime","-Dderby.system.home=/opt/IBM/WebSphere/AppServer/derby","-Dcom.ibm.itp.location=/opt/IBM/WebSphere/AppServer/bin","-Djava.util.logging.configureByServer=true","-Duser.install.root=/opt/IBM/WebSphere/AppServer/profiles/AppSrv01","-Djavax.management.builder.initial=com.ibm.ws.management.PlatformMBeanServerBuilder","-Dwas.install.root=/opt/IBM/WebSphere/AppServer","-Dpython.cachedir=/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/temp/cachedir","-Djava.util.logging.manager=com.ibm.ws.bootstrap.WsLogManager","-Dserver.root=/opt/IBM/WebSphere/AppServer/profiles/AppSrv01","-Dcom.ibm.security.jgss.debug=off","-Dcom.ibm.security.krb5.Krb5Debug=off","-Xquickstart","-Djava.security.auth.login.config=/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/properties/wsjaas.conf","-Djava.security.policy=/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/properties/server.policy","com.ibm.wsspi.bootstrap.WSPreLauncher","-nosplash","-application","com.ibm.ws.bootstrap.WSLauncher","com.ibm.ws.runtime.WsServer","/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/config","cell1","node1","server1"]
