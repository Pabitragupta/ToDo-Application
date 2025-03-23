# 📝 To-Do Application

A simple yet efficient **To-Do Application** built using **Spring Boot, Thymeleaf, MySQL, and Lombok**. 
This application allows users to **add, mark as complete, undo, and delete tasks** seamlessly.

---

## 🚀 Features
- ✅ **Add tasks** with a title.
- 🔄 **Mark tasks as complete** (with undo option).
- 🗑️ **Delete tasks**.
- 🎨 **Clean and responsive UI** with Bootstrap.
- 💾 **MySQL database** for storing tasks.
- ⚡ **Spring Boot backend** for handling requests.
- 🏷️ **Thymeleaf for dynamic UI rendering**.

---

## 🏗️ Tech Stack
| Technology  | Purpose |
|-------------|---------|
| **Spring Boot** | Backend API & Business Logic |
| **Thymeleaf** | UI Templating Engine |
| **MySQL** | Database for storing tasks |
| **Lombok** | Reduces boilerplate code in Java |
| **Bootstrap 4** | Enhancing UI & Responsiveness |

---

## 📂 Project Structure
ToDo_App/
│── src/main/java/com/example/ToDo_App/
│   ├── controller/         # Handles HTTP requests
│   │   ├── TaskController.java
│   ├── service/            # Business logic
│   │   ├── TaskService.java
│   ├── model/              # Task entity
│   │   ├── Task.java
│   ├── repository/         # Data persistence (JPA Repository)
│   │   ├── TaskRepository.java
│── src/main/resources/
│   ├── templates/          # Thymeleaf HTML files
│   │   ├── index.html
│   ├── static/css/         # Custom CSS files
│   │   ├── styles.css
│── application.properties  # Database & Server configurations
│── pom.xml                 # Dependencies

---
