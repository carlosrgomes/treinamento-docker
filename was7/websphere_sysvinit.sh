#!/bin/bash
#
# Simple startup script for IBM WebSphere Application Server
#
# chkconfig: - 85 15
# description: IBM WebSphere Applicaton Server is a powerful \
# middleware platform for connecting web-based applications and \
# servers.

# Path to the WebSphere starup and shutdown scripts
startscript=/opt/IBM/WebSphere/AppServer/bin/startServer.sh
shutscript=/opt/IBM/WebSphere/AppServer/bin/stopServer.sh
prog="the WebSphere Application Server"
RETVAL=0

# modify the following line as needed to reflect any custom Java
# installation directory
PATH=/opt/IBM/WebSphere/AppServer/java/bin:$PATH

# Function to start the server 
start() {
  echo -n $"Starting $prog: "
  $startscript server1
  RETVAL=$?
  echo
  return $RETVAL
}

# Function to stop the server
stop() {
  echo -n $"Stopping $prog: "
  $shutscript server1
  RETVAL=$?
  echo
  return $RETVAL
}

# See how we were called.
case "$1" in
  start)
    start
    ;;
  stop)
    stop
    ;;
  restart)
    stop
    start
    ;;
*)
  echo $"Usage: $0 {start|stop|restart}"
  exit 1
esac

exit $RETVAL
