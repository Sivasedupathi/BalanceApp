# Balance App

Balance App is a Spring Boot application that provides APIs for managing customer accounts and retrieving account balances. It uses MySQL as the database and includes RESTful endpoints for interacting with the application.

## Features

- Retrieve account balance by customer ID.
- Register new customers in the database.
- Uses Spring Data JPA for database interactions.
- Configurable database connection via `application.properties`.

## Project Structure

```
Balance App/
├── build.gradle                  # Gradle build configuration
├── gradlew                       # Gradle wrapper script for Unix
├── gradlew.bat                   # Gradle wrapper script for Windows
├── settings.gradle               # Gradle settings
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── BalanceApp/
│   │   │       ├── BalanceAppApplication.java      # Main application class
│   │   │       ├── Customer.java                  # Entity for customer table
│   │   │       ├── CustomerAccount.java      # Entity for customer_account table
│   │   │       ├── CustomerAccountController.java # REST con account operations
│   │   │       ├── CustomerAccountRepository.java # Repository forunt table
│   │   │       ├── CustomerAccountService.java    # Service account operations
│   │   │       ├── CustomerRepository.java        # Repository customer table
│   │   │       └── ResponseHandler.java           # Util gene API responses
│   │   ├── resources/
│   │   │   ├── application.properties             # Application configuration
│   │   │   ├── data.sql                           # Sample data for database
│   │   │   └── schema.sql                         # Database schema
│   └── test/                                      # Test cases (empty)
├── .idea/                                         # IntelliJ IDEA project files
├── .gradle/                                       # Gradle cache and build files
├── build/                                         # Build output directory
└── gradle/                                        # Gradle wrapper files
```

## Prerequisites

- Java 11 or higher
- Gradle
- MySQL database

## Setup

1. Clone the repository:
    ```bash
    git clone <repository-url>
    cd Balance-App
    ```

2. Configure the database connection in `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/Mydatabase
    spring.datasource.username=root
    spring.datasource.password=Getsetgo@123
    ```

3. Create the required database schema and tables using `src/main/resources/schema.sql`.

4. Load sample data using `src/main/resources/data.sql` (optional).

## Build and Run

1. Build the project using Gradle:
    ```bash
    ./gradlew build
    ```

2. Run the application:
    ```bash
    ./gradlew bootRun
    ```

## Application Availability

The application will be available at [http://localhost:8080](http://localhost:8080).

## API Endpoints

### Get Account Balance

- **URL:** `/balance/{id}`
- **Method:** `GET`
- **Response:**
  - `200 OK`: Returns the account balance.
  - `500 Internal Server Error`: Customer not registered.

### Register Customer

- **URL:** `/balance/register`
- **Method:** `POST`
- **Body:**
  ```json
  {
        "cardNo": "12345",
        "name": "John Doe",
        "password": "password123"
  }
  ```
- **Response:**
  - `200 OK`: Successfully registered.

## Dependencies

- Spring Boot
- Spring Data JPA
- MySQL Connector
- Lombok

## License

This project is licensed under the MIT License.
