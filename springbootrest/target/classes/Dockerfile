FROM barbero/jdk8

MAINTAINER Carlos Barbero <carlosrgomes@gmail.com>

ADD ${project.artifactId}-${project.version}.${project.packaging} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
