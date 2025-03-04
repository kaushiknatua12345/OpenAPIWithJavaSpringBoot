# OpenAPI Documentation using Java Spring Boot
This project demonstrates how to create an OpenAPI documentation using Spring Boot, and display it using Swagger UI.
## Table of Contents

- [Swagger Documentation](#Swagger)
- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Accessing the OpenAPI Documentation](#accessing-the-openapi-documentation)
- [License](#license)

## Swagger
To view Swagger.json file in UI mode, click the link: <a href="https://raw.githubusercontent.com/kaushiknatua12345/OpenAPIWithJavaSpringBoot/refs/heads/master/src/main/resources/static/api-docs.json">Swagger Documentation</a>

## Introduction

This project is a Spring Boot application that provides OpenAPI documentation using Swagger UI. It includes example endpoints and DTOs to demonstrate how to document your API.

## Features

- Spring Boot application
- OpenAPI documentation with Swagger UI
- Example endpoints and DTOs
- Exception handling with custom error responses

## Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher

## Installation

1. Clone the repository:
```bash
git clone https://github.com/your-username/SpringBootOpenAPIExample.git
cd SpringBootOpenAPIExample
```

2. Build the project using Maven
```
mvn clean install
```

## Running the Application

1. Run the Spring Boot application:
```
mvn spring-boot:run
```
2. The application will start on port 8080 by default.

## Accessing the OpenAPI Documentation

1. Open your browser and navigate to the following URL to access the Swagger UI:
```
http://localhost:8080/swagger-ui.html
```

2. You can also access the raw OpenAPI JSON documentation at:
```
http://localhost:8080/v3/api-docs
```
   
## License
This project is licensed under the Apache 2.0 License. See the <a href="http://www.apache.org/licenses/LICENSE-2.0.html">LICENSE</a> file for details.
