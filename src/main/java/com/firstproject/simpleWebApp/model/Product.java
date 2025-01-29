package com.firstproject.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // It will give getter and setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    
    @Id
    private int id;
    private String name;
    private int price;
   
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}
