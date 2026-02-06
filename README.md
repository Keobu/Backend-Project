# 🛒 E-commerce Backend System

A robust Spring Boot backend for an E-commerce platform, featuring JWT security, role-based access control (RBAC), and integration with third-party APIs for image management and email notifications.

## 🚀 Features
- **Security**: Stateless authentication using JWT.
- **User Management**: Registration (with Resend welcome email), Login, and Avatar management via Cloudinary.
- **Product & Inventory**: Full CRUD operations for products (Create, Read, Delete).
- **Third-Party Integrations**:
    - **Cloudinary**: For professional image hosting and management.
    - **Resend**: For automated welcome emails and manual notification tests.

## 🛠 Tech Stack
- **Java 21** & **Spring Boot 4.x**
- **PostgreSQL** (Database)
- **Spring Security** (JWT)
- **Maven** (Dependency management)

## ⚙️ Environment Variables
To run this project, you will need to add the following environment variables to your IDE (IntelliJ) or system:

| Variable | Description |
| :--- | :--- |
| `DB_URL` | JDBC URL for your PostgreSQL database |
| `DB_USER` | Database username |
| `DB_PASSWORD` | Database password |
| `JWT_SECRET` | A long, complex string for JWT signing |
| `CLAUDINARY_NAME` | Your Cloudinary Cloud Name |
| `CLAUDINARY_KEY` | Your Cloudinary API Key |
| `CLAUDINARY_SECRET` | Your Cloudinary API Secret |
| `RESEND_API_KEY` | Your Resend API Key (starts with `re_`) |

## 🏁 Getting Started
1. Clone the repository.
2. Configure the **Environment Variables** mentioned above.
3. Build the project: `./mvnw clean install`
4. Run the application: `./mvnw spring-boot:run`
5. The API will be available at `http://localhost:8080`

## 📬 Postman Collection
A complete Postman collection is included to test all endpoints (Auth, User, Product, Other).
- **File Location**: `./Ecommerce-Project.postman_collection.json`
- **How to use**:
    1. Import the JSON file into Postman.
    2. Run the `Login` request to receive a JWT.
    3. The collection is configured to use **Bearer Token** for protected routes.