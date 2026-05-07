# Portfolio Backend

A RESTful API built with Spring Boot that powers my personal developer portfolio. Exposes structured data about my projects, skills, interests, and goals from an H2 in-memory database.

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven

---

## Getting Started

### Prerequisites
- Java 17+
- Maven
- Eclipse or IntelliJ IDEA

### Run Locally
1. Clone the repository
```bash
   git clone https://github.com/RyPel13/my-portfolio-backend.git
```
2. Open the project in Eclipse
3. Run as Spring Boot Application
4. API will be available at `http://localhost:8080`

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/person` | Returns developer profile |
| GET | `/projects` | Returns all projects |
| GET | `/projects?language=Java` | Returns projects filtered by language |
| GET | `/projects/{id}` | Returns a single project by ID |
| GET | `/interests` | Returns all interests |
| GET | `/goals` | Returns all goals |
| GET | `/goals/achieved` | Returns achieved goals only |
| GET | `/goals/pending` | Returns pending goals only |

---

## Project Structure

---

## Database

This project uses an H2 in-memory database seeded on startup via `data.sql`. Data resets on every restart.

To view the H2 console while the app is running:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(leave blank)*

---

## Frontend

The React frontend that consumes this API can be found here:
[my-portfolio-frontend](https://github.com/RyPel13/my-portfolio-frontend)

---

## Author

**Ryan Pelto**
- GitHub: [@RyPel13](https://github.com/RyPel13)
- LinkedIn: [ryan-pelto](https://www.linkedin.com/in/ryan-pelto-48a6341a1/)