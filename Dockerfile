#Buscando imagem base do jdk
FROM maven:3-openjdk-17-slim AS builder

WORKDIR /app

#Copiando pom.xml para baixar as dependências
COPY pom.xml .

#Baixa as dependências do Maven
RUN mvn dependency:go-offline -B

#Copia todo fonte
COPY src ./src

#Compilando projeto
RUN mvn package

FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]


