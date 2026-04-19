# Inventory Management System

## Overview

Backend service built with Spring Boot to manage products and inventory through RESTful APIs. The application follows a layered architecture and supports full CRUD operations.

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven

## Features

* Create, read, update, and delete products
* Structured backend using Controller–Service–Repository layers
* Persistent storage with PostgreSQL
* API testing using Postman
* Input validation for request data
* Global exception handling with proper HTTP responses
* API testing using Postman

## API Endpoints

| Method | Endpoint       | Description            |
| ------ | -------------- | ---------------------- |
| POST   | /products      | Create product         |
| GET    | /products      | Retrieve all products  |
| GET    | /products/{id} | Retrieve product by ID |
| PUT    | /products/{id} | Update product         |
| DELETE | /products/{id} | Delete product         |

## Sample Request

**POST /products**

```json
{
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 75000,
  "quantity": 10
}
```

## Error Handling

The application uses global exception handling to return meaningful error responses.

Example response:

```json
{
  "timestamp": "2026-01-01T10:00:00",
  "message": "Product not found with id: 999",
  "status": 404
}
```

## How to Run

1. Clone the repository
2. Configure PostgreSQL in `application.properties`
3. Build and run the application
4. Test endpoints using Postman


```md id="5n3kqv"
## Future Enhancements

* Authentication and authorization
* Deployment
```

## Author

Manu Kumar H N
