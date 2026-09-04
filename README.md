# Task Tracker

A small Java 25 REST service built with [Javalin](https://javalin.io/). The
application currently provides a health check endpoint and is structured for
future task-tracking APIs.

## Requirements

- Java 25 or newer
- Apache Maven 3.9 or newer

The Maven project is located in the `tasktracker/` directory.

## Run the Application

From the repository root:

```bash
mvn -f tasktracker/pom.xml compile exec:java \
 -Dexec.mainClass=com.freshmemba.tasktracker.App
```

The server starts on port `7000`.

Check that it is running:

```bash
curl http://localhost:7000/health
```

Expected response:

```text
OK
```

The service currently allows cross-origin requests from any origin.

## Test

Run the test suite from the repository root:

```bash
mvn -f tasktracker/pom.xml test
```

## Project Layout

```text
tasktracker/
|-- pom.xml
`-- src/
 |-- main/java/com/freshmemba/tasktracker/App.java
 `-- test/java/com/freshmemba/tasktracker/AppTest.java
```

## Current API

| Method | Path | Description |
| --- | --- | --- |
| `GET` | `/health` | Returns `OK` when the service is available. |

## Dependencies

- Javalin for the web server
- Jackson Databind for JSON serialization
- SLF4J Simple for logging
- JUnit for tests
