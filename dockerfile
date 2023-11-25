FROM tomcat:9
COPY GymsvgApp-1.0-SNAPSHOT.war  /usr/local/tomcat/webapps
EXPOSE 8080
CMD  ["catalina.sh", "run"]
