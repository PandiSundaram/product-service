package com.pandi.project.productservice.ProductServiceDao;

import com.pandi.project.productservice.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Product,String> {
}
