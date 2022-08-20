FROM arm64v8/openjdk:17-ea-16-jdk
COPY appservice.01.jar app.jar
CMD java -Dspring.profiles.active=cloud  -jar *.jar

EXPOSE 8088