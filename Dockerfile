FROM maven:3.6.3-openjdk-8
COPY . .
RUN mvn -Dmaven.test.skip clean install
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

