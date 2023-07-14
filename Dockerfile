FROM openjdk:17
EXPOSE 8686
COPY target/*.jar employee_mongoapp.jar
ENTRYPOINT ["java","-jar","/employee_mongoapp.jar"]
