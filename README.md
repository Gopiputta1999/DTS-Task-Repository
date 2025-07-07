# DTS Task Management Application

A simple task management application that allows users to **create**, **fetch**, **update**, and **delete** tasks with a clean, responsive UI and an animated background for a better user experience.

---

## Technologies Used

### Backend
- **Java**
- **Spring Boot**
- **MySQL**

### Frontend
- **ReactJS**
- **CSS**

---

## Features

- Create, update, delete, and fetch tasks.
- Change task status (Pending, In Progress, Completed).
- View detailed information for each task.
- Animated background for an enhanced user experience.
- Clean, modular codebase for easy scalability and maintainability.

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
## Api Documentation 
- GET /api/tasks/{ID}            - Fetches task details by ID
- GET /api/tasks                 - fetches all the task details
- POST /api/tasks                - Creates new tasks
- PUT  /api/tasks/{ID}/status    - Updates task details by ID
- DELETE /api/tasks{ID}          - Delete task details by ID.




