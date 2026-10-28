# GustosValen API - Backend Component

A professional, enterprise-grade RESTful API built with Java and Spring Boot to manage preferences and flavor profiles. This project demonstrates clean code architecture, data encapsulation, and robust exception handling.

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Framework:** Spring Boot
* **Database:** MySQL
* **Libraries:** Lombok (for boilerplate reduction), MapStruct / Custom Mappers
* **Architecture:** Layered Architecture (Controller, Service, Repository, Entity)

## 🏗️ Architectural Patterns & Best Practices
* **DTO Pattern:** Implements Data Transfer Objects (`GustosValenDTO`) to decouple the database entities from the HTTP request/response payloads.
* **Global Exception Handling:** Utilizes a `@ControllerAdvice` controller (`GlobalExceptionHandler`) to capture runtime errors (such as `SaborNotFoundException`) and return consistent, clean JSON error responses to the client.
* **Interface-Driven Design:** Services and DAOs are decoupled using Java interfaces (`IGustosValenServicio`, `IGustosValenDao`) to ensure scalability and ease of testing.
