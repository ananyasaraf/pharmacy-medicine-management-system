# pharmacy-medicine-management-system
# Pharmacy Management System

            ![Java](https://img.shields.io/badge/Java-17-blue)
            ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green)
            ![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)
            ![License](https://img.shields.io/badge/License-MIT-brightgreen)
            
            A comprehensive pharmacy management system built with Java Spring Boot backend and HTML/CSS/JS frontend, designed to streamline pharmacy operations and inventory management.
            
            ## Features
            
            - **User Authentication**
              - Secure login system
              - Session management
            - **Product Management**
              - CRUD operations for pharmaceutical products
              - Real-time inventory tracking
            - **Sales Management**
              - Sales transaction recording
              - Sales report generation
            - **Dashboard**
              - Overview of key metrics
              - Inventory alerts and notifications
            
            ## Technology Stack
            
            **Backend**
            - Java 17
            - Spring Boot 3.1
            - Spring Data JPA
            - MySQL Database
            - Maven
            
            **Frontend**
            - HTML5
            - CSS3
            - JavaScript (ES6)
            - Bootstrap 5
            
            **Database**
            - MySQL 8.0
            - JDBC for database connectivity
            
            ## Installation

1. **Clone Repository**
   ```bash
   git clone https://github.com/yourusername/pharmacy-management-system.git


2. Database Setup
            CREATE DATABASE pharmacy_db;
            USE pharmacy_db;
            CREATE TABLE products (
            id INT AUTO_INCREMENT PRIMARY KEY,
            name VARCHAR(100) NOT NULL,
            quantity INT NOT NULL,
            price DECIMAL(10,2) NOT NULL);

3. Configure Application
Update src/main/resources/application.properties:
           spring.datasource.url=jdbc:mysql://localhost:3306/pharmacy_db
           spring.datasource.username=yourusername
           spring.datasource.password=yourpassword
           spring.jpa.hibernate.ddl-auto=update

4. Build & Run
           mvn clean install
           java -jar target/pharmacy-management-system-0.0.1-SNAPSHOT.jar

5. Access Frontend
  Open frontend/index.html in your browser




API Documentation
Products Endpoints
Method	Endpoint	Description
GET	/api/products	Get all products
POST	/api/products	Create new product
PUT	/api/products/{id}	Update product
DELETE	/api/products/{id}	Delete product
  
  sample
                    POST /api/products
                    Content-Type: application/json
                    
                    {
                      "name": "Paracetamol",
                      "quantity": 100,
                      "price": 5.99
                    }


Contributing
      Fork the project
      
      Create your feature branch (git checkout -b feature/AmazingFeature)
      
      Commit your changes (git commit -m 'Add some AmazingFeature')
      
      Push to the branch (git push origin feature/AmazingFeature)
      
      Open a Pull Request
