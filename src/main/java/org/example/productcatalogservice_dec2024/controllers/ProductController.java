package org.example.productcatalogservice_dec2024.controllers;

import org.example.productcatalogservice_dec2024.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getAllProducts() {

        Product product = new Product();
        product.setId(2L);
        product.setDescription("iPhone");
        product.setName("iPhone X");

        List<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable Long id) {
        Product product = new Product();
        product.setId(id);
        return product;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return product;
    }
}
