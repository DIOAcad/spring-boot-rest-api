package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Padrão Factory para criar produtos
    public Product createProduct(String name, Double price) {
        return new Product(null, name, price);  // O ID será gerado pelo banco de dados
    }

    // Método para salvar um produto usando JPA
    public Product save(Product product) {
        return productRepository.save(product);
    }

    // Método para buscar produto por ID usando JPA
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}
