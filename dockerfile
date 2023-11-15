FROM tomcat:9
ADD GymsvgApp-1.0-SNAPSHOT.war  /usr/local/tomcat/webapps
EXPOSE 8080
CMD  ["catalina.sh", "run"]
