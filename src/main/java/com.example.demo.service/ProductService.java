package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> listProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer id) { return productRepository.findById(id); }

     public Product addProduct(Product product){
        return productRepository.save(product);
     }

    public void deleteProduct(Integer id){
         productRepository.deleteById(id);
    }
}
