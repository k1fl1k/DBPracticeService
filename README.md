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

3. Build the project using Maven:

```bash
mvn clean package
```

This will create a JAR file in the `target` directory.

## Running the application

1. Start the H2 database server:

```bash
java -cp h2-*.jar org.h2.tools.Server -tcp -webAllowOthers
```

2. Run the application:

```bash
java -jar target/DBPracticeService-1.0.0-SNAPSHOT.jar
```

Replace `1.0.0-SNAPSHOT` with the actual version number if it's different.

## Project Structure

* `src/main/java`: Contains the Java source code for the application logic.
* `src/main/resources`: Contains configuration files and resources.
* `pom.xml`: The project's Maven configuration file.

## Database Configuration

The application uses an in-memory H2 database by default. You can configure the database connection details in the `application.properties` file located in `src/main/resources`.

## Contributing

We welcome contributions to this project. Please refer to the CONTRIBUTING.md file for guidelines on how to contribute.

## License

This project is licensed under the Apache License 2.0. See the LICENSE file for details.
