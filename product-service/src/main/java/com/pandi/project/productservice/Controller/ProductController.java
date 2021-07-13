package com.pandi.project.productservice.Controller;


import com.pandi.project.productservice.Models.Product;
import com.pandi.project.productservice.ProductServiceDao.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    Repository repository;


     @PostMapping
     public ResponseEntity createproduct(@RequestBody Product product){

         System.out.println(product);

        repository.save(product);

        return ResponseEntity.status(201).build();

     }

     @GetMapping
     public ResponseEntity findproduct(){
          List<Product> products = repository.findAll();
        return ResponseEntity.status(200).body(products);
     }




}
