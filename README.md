\# Inventory Management System



\## Overview



Backend service built with Spring Boot to manage products and inventory through RESTful APIs. The application follows a layered architecture and supports full CRUD operations.



\## Tech Stack



\* Java

\* Spring Boot

\* Spring Data JPA

\* PostgreSQL

\* Maven



\## Features



\* Create, read, update, and delete products

\* Structured backend using Controller–Service–Repository layers

\* Persistent storage with PostgreSQL

\* API testing using Postman



\## API Endpoints



| Method | Endpoint       | Description            |

| ------ | -------------- | ---------------------- |

| POST   | /products      | Create product         |

| GET    | /products      | Retrieve all products  |

| GET    | /products/{id} | Retrieve product by ID |

| PUT    | /products/{id} | Update product         |

| DELETE | /products/{id} | Delete product         |



\## Sample Request



POST /products



```json

{

&#x20; "name": "Laptop",

&#x20; "description": "Gaming laptop",

&#x20; "price": 75000,

&#x20; "quantity": 10

}

```



\## How to Run



1\. Clone the repository

2\. Configure PostgreSQL in `application.properties`

3\. Build and run the application

4\. Test endpoints using Postman



\## Future Enhancements



\* Input validation

\* Exception handling

\* Authentication and authorization

\* Deployment



\## Author



Manu Kumar H N



