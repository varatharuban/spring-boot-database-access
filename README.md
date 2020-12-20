# spring-boot-database-access (Spring boot - Database access)
**Generate project skeleton by using Spring Initializr**
Add following dependencies.
- Spring Web
- MySQL Driver
- Spring Data JPA

**Un-Zip the downloaded project skeleton in your workspace, and execute following command in command prompt.**
mvn eclipse:clean eclipse:eclipse

**Import the project into eclipse IDE.**

**Create following packages.**
- controller
- service
- service.impl
- entity
- repository

**JPA & Spring boot JPA releated annotations**
- @Entity
- @Table
- @MappedSuperclass
- @Repository

**Use the following JSON data when test the API**
```
{
    "title": "Five Point Someone",
    "language" : "English",
    "author" : "Santhosh K. Sivan",
    "pages" : 236
}
```
