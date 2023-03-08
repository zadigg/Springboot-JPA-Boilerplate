
# Spring Boot Boilerplate Module

This module provides a set of templates and examples for implementing common database relationships using Spring Boot and JPA.

## Supported Relationship Types

-   One-to-One with Primary Key (PK)
-   One-to-One with Foreign Key (FK)
-   One-to-Many
-   Many-to-Many
-   Many-to-Many with Extra Columns

## Setup

1.  Clone this repository: `https://github.com/zadigg/Springboot-JPA-Boilerplate`
2.  Import the project into your favorite IDE (Eclipse, IntelliJ, etc.)
3.  Set up your MySQL database by creating a new schema and user with appropriate privileges
4.  Edit the `application.properties` file to include your database credentials and schema name
5.  Build and run the project

## Usage

This module provides a set of templates and examples for implementing common database relationships using Spring Boot and JPA.

### One-to-One with Primary Key (PK)

This relationship maps one entity to another using a shared primary key.

To implement a one-to-one relationship with PK, follow these steps:

1.  Create two entity classes with matching primary keys.
2.  Add a `@OneToOne` annotation to the primary key field in the parent entity class, and a `@PrimaryKeyJoinColumn` annotation to the matching field in the child entity class.

### One-to-One with Foreign Key (FK)

This relationship maps one entity to another using a foreign key.

To implement a one-to-one relationship with FK, follow these steps:

1.  Create two entity classes with a shared foreign key field.
2.  Add a `@OneToOne` annotation to the foreign key field in the parent entity class, and a `@JoinColumn` annotation to the matching field in the child entity class.


### One-to-Many

This relationship maps one entity to multiple other entities.

To implement a one-to-many relationship, follow these steps:

1.  Create two entity classes, one representing the parent entity and the other representing the child entity.
2.  Add a `@OneToMany` annotation to the parent entity class, and a `@ManyToOne` annotation to the child entity class.

### Many-to-Many

This relationship maps multiple entities to multiple other entities.

To implement a many-to-many relationship, follow these steps:

1.  Create two entity classes, one representing the parent entity and the other representing the child entity.
2.  Add a `@ManyToMany` annotation to both entity classes.

### Many-to-Many with Extra Columns

This relationship maps multiple entities to multiple other entities, with additional data stored in an intermediary table.

To implement a many-to-many relationship with extra columns, follow these steps:

1.  Create three entity classes, one representing the parent entity, one representing the child entity, and one representing the intermediary table.
2.  Add a `@OneToMany` annotation to the intermediary table entity class, with `@ManyToOne` annotations on both the parent and child entity classes.
3.  In the parent and child entity classes, add a `@ManyToMany` annotation that references the intermediary table entity class.


## Author

This project was created by Abel Negash.
