package com.firstproject.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.simpleWebApp.model.Product;
import com.firstproject.simpleWebApp.repository.ProductRepo;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;           // Spring data JPA with H2 database ( so we dont need hardcode data)

    // private List<Product> products = new ArrayList<>(Arrays.asList( 
    //     new Product(101, "Asus", 50000),
    //     new Product(102, "HP", 46000),
    //     new Product(103, "Acer", 60000)
    //     ));

    public List<Product> getAllProducts(){

        return repo.findAll();                       // spring data jpa reduces the no. lines 
        // return products;
    }

    public Product getProductById(int prodID) {

        return repo.findById(prodID).orElse(new Product());

        // return products.stream()
        //         .filter(p -> p.getId() == prodID)
        //         .findFirst().orElse(new Product(100, "Not item",0));
    }

    public void addproduct(Product prod){

         repo.save(prod);

        // products.add(prod);
    }

    public void updateProduct(Product prod) {

        repo.save(prod);

        // int index=-1;
        // for(int i=0; i<products.size(); i++){
        //     if(products.get(i).getId() == prod.getId())
        //         index = i;
        // }

        // if(index!= -1)
        //     products.set(index, prod);
        
    }

    public void deleteProduct(int prodId) {

        repo.deleteById(prodId);

        // Product prod = getProductById(prodId);
        // products.remove(prod);


        // int index=-1;
        // for(int i=0; i<products.size(); i++){
        //     if(products.get(i).getId() == prodId)
        //         index = i;
        // }

        // if(index!= -1)
        //     products.remove(index);
    }
    
}
