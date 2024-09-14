# Virtual-Classroom-Project
1.Introduction<br/>
2.Features<br/>
3.Technologies Used<br/>
4.Architecture<br/>
5.Setup Instructions<br/>
6.Backend: Spring Boot Configuration<br/>
7.Frontend: React Setup<br/>
8.Running the Application<br/>
9.Future Enhancements

## Introduction
The Virtual Classroom Project is a web application designed to help instructors manage virtual classes and allow students to join, access course materials, and participate in discussions on lectures. It is a full-stack project that includes both backend and frontend components.

## Features
Class Management: Instructors can create, read, update, and delete classes, units (Books), and sessions (Chapters).<br/>
Lecture Access: Students can access materials for each lecture within a session.<br/>
Discussions: Students can add nested comments on lectures to engage in discussions.
Enrollment Control: Only enrolled students are allowed to join and participate in classes.<br/>
Authentication: Basic authentication is implemented to manage user roles (admin/instructor/student).<br/>

## Technologies Used
Backend:<br/>
Java 17 and Spring Boot
MySQL for data storage
JPA/Hibernate for database interaction
Spring Security for authentication and authorization<br/>
Frontend:<br/>
React for building the user interface
Axios for making HTTP requests
React Router for navigation

## Architecture
The project is divided into two main parts:

### Backend: REST API built with Spring Boot that handles business logic, data persistence, and user management.
### Frontend: React app that interacts with the backend API, allowing users to navigate between pages and perform actions such as enrolling in classes or commenting on lectures.

## Setup Instructions
### Prerequisites
Java 17<br/>
Node.js and npm<br/>
MySQL<br/>
Maven<br/>
### 1. Clone the Repository
git clone https://github.com/your-username/virtual-classroom.git
cd virtual-classroom

## Backend: Spring Boot Configuration
### 1. Set Up MySQL Database
Create a database named virtual_classroom in MySQL.<br/>
In src/main/resources/application.properties, update your MySQL database credentials<br/>
spring.datasource.url=jdbc:mysql://localhost:3306/virtual_classroom<br/>
spring.datasource.username=your_mysql_username<br/>
spring.datasource.password=your_mysql_password<br/>
spring.jpa.hibernate.ddl-auto=update<br/>
### 2. Run the Spring Boot Application
Navigate to the backend directory and run the application:<br/>
mvn spring-boot:run<br/>
Backend will run at http://localhost:8080.

## Frontend: React Setup
### 1. Install Dependencies
Navigate to the frontend directory and install the required packages:<br/>
cd frontend<br/>
npm install
### 2. Start the React Application
Run the following command to start the React app:<br/>
npm start<br/>
The app will be accessible at http://localhost:3000.

## Running the Application
Start the Backend: Run the Spring Boot application as described in the backend setup.
Start the Frontend: Run the React app using npm start.<br/>
Access the Application:<br/>
#### Frontend: http://localhost:3000
#### Backend API: http://localhost:8080

## Future Enhancements
JWT Authentication: Upgrade authentication to use JWT tokens for improved security.<br/>
Real-Time Notifications: Implement real-time notifications for discussions and updates.<br/>
File Upload: Add the ability for instructors to upload files such as PDFs, videos, and other learning materials.<br/>
Admin Dashboard: Provide an admin dashboard for better class and user management.

## Contributing
We welcome contributions! To contribute to this project, follow these steps:

Fork the repository.<br/>
Create a new branch (git checkout -b feature-branch-name).<br/>
Make your changes.<br/>
Commit your changes (git commit -m 'Add new feature').<br/>
Push to the branch (git push origin feature-branch-name).<br/>
Open a pull request.<br/>
Please make sure to update tests as appropriate.

## Contact
If you have any questions or need support, feel free to reach out via mayurimohite1421@gmail.com.
