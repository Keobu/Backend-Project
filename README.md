# 🛒 E-commerce Backend System

A robust Spring Boot backend for an E-commerce platform, featuring JWT security, role-based access control (RBAC), and integration with third-party APIs for image management and email notifications.

## 🚀 Features
- **Security**: Stateless authentication using JWT.
- **RBAC**: Three distinct roles: `ADMIN`, `VENDOR`, and `CUSTOMER`.
- **User Management**: Registration, Login, and Avatar management via Cloudinary.
- **Product & Inventory**: Category and Product management with role-restricted actions.
- **Order System**: Cart management and order placement.
- **Third-Party Integrations**:
    - **Cloudinary**: For professional image hosting.
    - **Resend**: For automated welcome emails.

## 🛠 Tech Stack
- **Java 17** & **Spring Boot 3.x**
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
A complete Postman collection is included in the root folder as `ecommerce_collection.json`. It includes example payloads, headers, and authentication tokens for all endpoints.