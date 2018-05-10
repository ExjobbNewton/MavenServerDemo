FROM openjdk:jre-alpine

COPY /target/MavenServerDemo.war /opt/MavenServerDemo.war

EXPOSE 8080

# preferIPv4Stack is needed to keep wildfly-swarm happy
ENTRYPOINT ["java", "-Djava.net.preferIPv4Stack=true", "-jar", "/opt/MavenServerDemo.war"]