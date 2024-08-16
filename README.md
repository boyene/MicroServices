# 🌐 Employee and Department Web Services

## 📋 Table of Contents
- [📖 Overview](#overview)
- [🚀 Features](#features)
- [🛠️ Tech Stack](#tech-stack)
- [⚙️ Setup & Installation](#setup--installation)
- [📚 API Endpoints](#api-endpoints)
- [🔍 Screenshots](#screenshots)
- [🙌 Contribution](#contribution)
- [📞 Contact](#contact)

## 📖 Overview
## 📖 Overview

Welcome to the **Employee and Department Management API**! This application provides a comprehensive solution for managing employee and department data through a set of RESTful APIs.

### **Employee Management** 🌟
- **Create**: Add new employee records with details such as name, salary, and department. ✨
- **Retrieve**: Fetch a list of all employees or query specific employee details by ID. 🔍
- **Update**: Modify employee information, including full updates or partial changes. ✏️
- **Delete**: Remove employee records as needed. 🗑️

### **Department Management** 🌟
- **Create**: Add new department records with relevant details. ✨
- **Retrieve**: Obtain a list of all departments or get specific department details by ID. 🔍
- **Update**: Adjust department information through full or partial updates. ✏️
- **Delete**: Remove department records from the system. 🗑️

This API provides a streamlined and efficient way to handle employee and department information, ensuring that managing your organization's data is both straightforward and effective.


## 🚀 Features For Employee
- 🌟 Create and manage employee records
- 📜 Retrieve a list of all employees
- 🔍 Retrieve an employee by ID
- ✏️ Update employee information
- 🗑️ Delete an employee record

 ## ⚔️ Features For Department
- 🌟 Create and manage department records
- 📜 Retrieve a list of all departments
- 🔍 Retrieve an department by ID
- ✏️ Update department information
- 🗑️ Delete an department record

## 🛠️ Tech Stack
- **Backend:** Spring Boot, Java
- **Dependencies:** Spring Web, DevTools, JPA, MySQL,ModelMapper
- **Build Tool:** Maven,PostMan

## ⚙️ Setup & Installation

### ⚔️ Prerequisites
- Java 17 or 21
- Maven

### Steps

1. **Clone the repository:**
    ```bash
    git clone https://github.com/boyene/Mcroservices.git
    cd Mcroservices
    ```

2. **Build the project:**
    ```bash
    mvn clean install
    ```

3. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

## 📚 API Endpoints

### 🌐Employee Web Service Endpoints

#### 📜 Retrieve All Employees
- **URL:** `GET /Employee/`
- **Example:**
    ```bash
    GET "http://localhost:8080/Employee/"
    ```

#### 🔍 Retrieve an Employee by ID
- **URL:** `GET /Employee/{EmployeeId}`
- **Path Variables:**
  - `EmployeeId`: Long
- **Example:**
    ```bash
    GET "http://localhost:8080/Employee/1"
    ```

#### ✏️ Update an Employee
- **URL:** `PUT /Employee/update/{EmployeeId}`
- **Path Variables:**
  - `EmployeeId`: Long
- **Request Body:** Employee JSON
- **Example:**
    ```bash
    PUT "http://localhost:8080/Employee/update/1" -H "Content-Type: application/json" -d '{"name":"John Smith","salary":55000}'
    ```

#### 🛠️ Update Employee by One Column
- **URL:** `PATCH /Employee/updateByColumn/{EmployeeId}`
- **Path Variables:**
  - `EmployeeId`: Long
- **Request Body:** Employee JSON (only fields to update)
- **Example:**
    ```bash
    PATCH "http://localhost:8080/Employee/updateByColumn/1" -H "Content-Type: application/json" -d '{"name":"John Smith"}'
    ```

#### 🗑️ Delete an Employee
- **URL:** `DELETE /Employee/deleteById/{EmployeeId}`
- **Path Variables:**
  - `EmployeeId`: Long
- **Example:**
    ```bash
    DELETE "http://localhost:8080/Employee/deleteById/1"
    ```

### 🌐Department Web Service Endpoints

#### 🌟 Save Department
- **URL:** `POST /department/save`
- **Request Body:** Department JSON
- **Example:**
    ```bash
    POST "http://localhost:8080/department/save" -H "Content-Type: application/json" -d '{"name":"HR"}'
    ```

#### 🔍 Get Department by ID
- **URL:** `GET /department/getBy/{departmentId}`
- **Path Variables:**
  - `departmentId`: Long
- **Example:**
    ```bash
    GET "http://localhost:8080/department/getBy/1"
    ```

#### ✏️ Update Department by ID
- **URL:** `PUT /department/updateById/{departmentId}`
- **Path Variables:**
  - `departmentId`: Long
- **Request Body:** Department JSON
- **Example:**
    ```bash
    PUT "http://localhost:8080/department/updateById/1" -H "Content-Type: application/json" -d '{"name":"Finance"}'
    ```

#### 🛠️ Update Department by Column
- **URL:** `PATCH /department/updateByColumn/{departmentId}`
- **Path Variables:**
  - `departmentId`: Long
- **Request Body:** Department JSON (only fields to update)
- **Example:**
    ```bash
    PATCH "http://localhost:8080/department/updateByColumn/1" -H "Content-Type: application/json" -d '{"name":"Finance"}'
    ```

#### 🗑️ Delete Department by ID
- **URL:** `DELETE /department/delete/k?departmentId={departmentId}`
- **Request Params:**
  - `departmentId`: Long
- **Example:**
    ```bash
    DELETE "http://localhost:8080/department/delete/k?departmentId=1"
    ```

## 🔍 Screenshots
### Example: Using API Get All Employees With Department

![Get All Employees API](https://res.cloudinary.com/dzmws75jp/image/upload/v1723822280/Screenshot_35_qpqv7i.png)


## 🙌 Contribution
Contributions are welcome! Feel free to open issues or submit pull requests. Make sure to follow the contribution guidelines.

## 📞 Contact
For any inquiries or support, please reach out:
- 📧 Email: [boyeneyellakrishna@gmail.com](mailto:boyeneyellakrishna@gmail.com)
