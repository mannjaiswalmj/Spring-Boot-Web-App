package com.firstproject.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.simpleWebApp.model.Product;
import com.firstproject.simpleWebApp.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProduct(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{prodId}")                //pathVariable will used whenever we want match {prodId} with int prodID
    public Product getProductByID(@PathVariable int prodId){            
        return service.getProductById(prodId);
    }

    @PostMapping("/product")
    public void addproduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addproduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    
    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }


}
