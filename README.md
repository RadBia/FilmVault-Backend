# FilmVault-Spring

FilmVault-Spring is a web application that allows users to store and manage a collection of movies. The project utilizes Spring Boot technology and MySQL database.

## System Requirements

Before getting started with the project, make sure your system meets the following requirements:

- Java 8 or higher
- Maven 3.6.3 or higher
- MySQL 5.7 or higher
- Your favorite IDE (IntelliJ, Eclipse, etc.)

## Installation Instructions

1. Clone the repository to your local environment:
git clone https://github.com/k2esone/filmvault-spring.git

2. Open the project in your preferred IDE.

3. Configure the MySQL database connection by editing the `application.properties` file located in the `src/main/resources` folder. Modify the values of the properties `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` to reflect your local database settings.

4. Run the following command to install the required Maven dependencies:
mvn install

5. Start the application by running the command:
mvn spring-boot:run

6. The application should be accessible at [http://localhost:8080](http://localhost:8080).

## API Documentation

FilmVault-Spring application provides an API for movie management. The full API documentation can be found at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) after running the application.

## Contributing

If you would like to contribute to the development of FilmVault-Spring project, you can follow these steps:

1. Clone the repository to your computer:
git clone https://github.com/k2esone/filmvault-spring.git

2. Create a new branch for your changes:
git checkout -b your_branch_name

3. Make your changes and commit them:
git commit -m "Description of your changes"

4. Push your changes to the remote repository:
git push origin your_branch_name

5. Open a pull request (PR) on GitHub to submit your changes to the project's main branch.

## Authors

- k2esone,
- RadBia,
- dwydm, 
- MWolok,
- Mateuszcell
