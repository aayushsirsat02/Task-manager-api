# Task Manager API
A simple Task Manager API built with Spring Boot.

## Features

- Create, update, and delete tasks
- Assign tasks to users
- Mark tasks as completed
- View all tasks

## Technology Stack & Dependencies

This project uses the following core dependencies (see `pom.xml`):

- **Spring Boot Starter Web**: For building RESTful web services
- **Spring Boot Starter Data JPA**: For data persistence
- **MySQL Connector/J**: For connecting to a MySQL database
- **Lombok**: For reducing boilerplate code
- **Spring Boot Starter Test**: For testing

Java 17 is required.

## Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL (ensure you have a running MySQL database)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/aayushsirsat02/Task-manager-api.git
   cd Task-manager-api
   ```

2. Configure your database in `application.properties`.

3. Build and run the project:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

All endpoints are prefixed with `/api/tasks`:

| Method | Endpoint                | Description                |
|--------|-------------------------|----------------------------|
| GET    | `/api/tasks`            | List all tasks             |
| POST   | `/api/tasks`            | Create a new task          |
| PUT    | `/api/tasks/{id}`       | Update a task              |
| DELETE | `/api/tasks/{id}`       | Delete a task              |

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

This project is open-source. Feel free to use it as you wish.
