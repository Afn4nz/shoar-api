# Shoar - Your Expert Consultation App

Shoar is an application designed to simplify the process of seeking expert consultation for your work-related questions. It connects you with experienced professionals, retirees, and experts in your field to provide you with the guidance and advice you need.

## Features

- **Expert Consultation**: Get answers to your questions from industry experts, retirees, and senior professionals in your field.
- **Time-Saving**: Instead of searching for the right expert on social media platforms, Shoar helps you get your answers quickly through expert consultations.
- **Competitive Advantage**: Leveraging artificial intelligence technologies, Shoar ensures that you are connected with the most suitable expert to find your comprehensive answer.

## How It Works

1. **Ask Your Question**: Simply post your question within the app, providing details about your query and the expertise you're seeking.
2. **Find the Right Expert**: Shoar's AI algorithms analyze your question and match you with the most relevant expert in your field.
3. **Get Your Answer**: Once connected with the expert, you'll receive comprehensive guidance and advice to address your query effectively.

**With Shoar, you have years of expertise at your fingertips.**

## Running the Application

To run Shoar locally, follow these steps:

### Prerequisites

- Java Development Kit (JDK) installed
- Spring Boot installed
- SQL Server installed
- Shoar source code

### Configuration

1. Open the `application.properties` file in the `src/main/resources` directory.

2. Add the following configurations for your SQL Server database:

   ```properties
   spring.datasource.url=jdbc:sqlserver://your-sql-server-host:1433/your-database-name
   spring.datasource.username=your-username
   spring.datasource.password=your-password

   
## API Endpoints

### 1. Get All Categories

- **Endpoint:** `http://localhost:8081/shoar/categories/get-all`
- **Method:** `GET`
- **Description:** Retrieve a list of all categories.

### 2. Get All Consultants by Category

- **Endpoint:** `http://localhost:8081/shoar/consultants/get-all-by-category/{category}`
- **Method:** `GET`
- **Description:** Retrieve all consultants based on a specific category.
