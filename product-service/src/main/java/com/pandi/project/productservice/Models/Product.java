package com.pandi.project.productservice.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @org.springframework.data.annotation.Id
    String Id;
    String name;
    String description;
    BigDecimal price;

}
