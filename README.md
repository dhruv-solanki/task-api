# Task Application

A simple Spring Boot application built using Java 21 with support for REST APIs, validation, and database operations using JPA and H2.

## 🚀 Tech Stack

* Java 21
* Spring Boot 4.0.4
* Spring Web MVC
* Spring Data JPA
* H2 In-Memory Database
* Maven

## 📦 Dependencies

* spring-boot-starter-webmvc
* spring-boot-starter-data-jpa
* spring-boot-starter-validation
* H2 Database
* Spring Boot Test (JPA, Validation, WebMVC)

## ⚙️ Setup & Run

1. Clone the repository:

   ```bash
   git clone <your-repo-url>
   cd task
   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

## 🌐 Access

* Application: http://localhost:8080
* H2 Console: http://localhost:8080/h2-console

## 🗄️ H2 Database Config

Default settings (can be customized in `application.properties`):

* JDBC URL: `jdbc:h2:mem:testdb`
* Username: `sa`
* Password: (leave empty)

## 📁 Project Structure

* `controller` – REST controllers
* `service` – Business logic
* `repository` – JPA repositories
* `entity` – Database entities

## 📌 Notes

* Uses in-memory H2 database (data resets on restart)
* Suitable for learning and small demos

---
