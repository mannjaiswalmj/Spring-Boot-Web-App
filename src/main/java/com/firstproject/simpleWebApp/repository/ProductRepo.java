package com.firstproject.simpleWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.simpleWebApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

// Jpa -> [Java Persistence API] it is a standard which has been implemented by ORM tools(like Hibernate, Eclispelink)
//  so that shifting from one ORM tools to another will be easier

// ORM -> [Object Relational(table) Mapping] is a programming technique that connects a relational database 
// to an object-oriented programming language (basically it converts over data into Table)
// some famous ORM tools : Hibernate, Eclipselink, Apache JPA

//H2 is a database [like MYSQL], used for learning purpose
