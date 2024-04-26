# DBPracticeService

This project implements a practice service written in Java that utilizes the H2 database for persistence.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) 11 or above. You can download it from [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/).
* Git version control system. You can install it from [https://git-scm.com/downloads](https://git-scm.com/downloads)

### Installation

1. Clone the repository:

```bash
git clone https://github.com/k1fl1k/DBPracticeService.git
```

2. Navigate to the project directory:

```bash
cd DBPracticeService
```

## Project Structure

* `com/k1fl1k/dbpractice/java`: Contains the Java source code for the application logic.
* `com/k1fl1k/dbpractice/java/DAO`: Contains DAO class files and resources.
* `com/k1fl1k/dbpractice/java/database`: The project's database file.
* `com/k1fl1k/dbpractice/java/entity`: The project's entity files.
* `com/k1fl1k/dbpractice/java/service`: The project's service layer.

## Database Configuration

The application uses an in-memory H2 database by default. You can configure the database connection details in the `application.properties` file located in `src/main/resources`.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
