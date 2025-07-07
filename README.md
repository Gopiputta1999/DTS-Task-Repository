# DTS-Task-Management
Simple task management application which allows users to fetch, create, update, delete tasks for users.

#Technologies Used
Backend :
Java 
Spring Boot
MySQL

Frontend :
ReactJS
CSS

#Features 
- Create, Update, delete, fetch tasks.
- Change task status
- view task details
- Animated background for better user-experience
- Clean, simple, modular codebase for better maintainability.

## How to run the project
### Backend
- open git bash
- git clone https://github.com/Gopiputta1999/DTS-Task-Repository.git
- cd DTS-Task-Repository
- ./mvnw spring-boot:run
### Frontend
- cd [frontend folder]
- npm install
- npm start
Frontend will run on default port : https://localhost:3000


  | Method | Endpoint                 | Description              |
| ------ | ------------------------ | ------------------------ |
| GET    | `/api/tasks/{ID}`        | Fetch task details by ID |
| GET    | `/api/tasks`             | Fetch all tasks          |
| POST   | `/api/tasks`             | Create a new task        |
| PUT    | `/api/tasks/{ID}/status` | Update task status by ID |
| DELETE | `/api/tasks/{ID}`        | Delete task by ID        |


