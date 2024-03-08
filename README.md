# DatabricksAPI

This Scala application sends JSON data to the Databricks REST API.

## Prerequisites

- Java Development Kit (JDK) installed
- Scala build tool (SBT) installed
- Access to a Databricks instance with appropriate permissions

## Setup

1. Clone this repository to your local machine:

2. Update `application.conf`:

    - Open the `application.conf` file in the `src/main/resources` directory.
    - Update the `databricksUrl` and `databricksToken` values with your Databricks endpoint and access token respectively.
    - Save the changes.

## Running the Application

1. Open a terminal and navigate to the project directory.

2. Compile the Scala code:
> sbt compile

3. Run the application:
> sbt run

This will execute the `DatabricksAPI` object, which sends data to your Databricks instance and stores it in the Databricks File System (DBFS).