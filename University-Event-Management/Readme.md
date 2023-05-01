# Event Management Api
## Requirements
- IntelliJ IDEA
- Java Version 17
- Maven
- H2
- Server Port: 8080

## Swagger UI and H2 database console Url for different Endpoints and database
- http://localhost:8080/swagger-ui/index.html#/
- http://localhost:8080/h2-console/

## API Endpoints

### Endpoints for Student Model
- localhost:8080/api/v1/UMS/add-student
- localhost:8080/api/v1/UMS/update-student-department/id/{id}/department/{department}
- localhost:8080/api/v1/UMS/delete-student/id/{id}
- localhost:8080/api/v1/UMS/get-all-student
- localhost:8080/api/v1/UMS/getStudent-by-id/id/{id}

### Endpoints for Event Model
- localhost:8080/api/v1/UMS/add-event
- localhost:8080/api/v1/UMS/update-event/eventId/{eventId}
- localhost:8080/api/v1/UMS/delete-event/eventId/{eventId}
- localhost:8080/api/v1/UMS/get-all-event

##  Steps to Run the Code:
- Download the Source code.
- Import your Source code into you intelliJ idea.
- Wait for the library to load.
- Run the code and try to hit the different end points.

#### OR
- Simply hit the above swagger url it is already deployed on the aws server

## Note:
- H2 database is used in this project.



