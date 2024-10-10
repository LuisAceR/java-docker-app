#Alumno: Luis Jair Acevedo Rubio
#Matricula: 360777

FROM openjdk:11-jdk-slim

WORKDIR /app

RUN apt-get update && apt-get install -y git

RUN git clone https://github.com/LuisAceR/java-docker-app.git .

RUN javac Randommensajes.java

CMD ["java", "Randommensajes"]