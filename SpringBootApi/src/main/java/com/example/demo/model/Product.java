package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Gera automaticamente getters, setters, equals, hashcode e toString
@AllArgsConstructor  // Gera o construtor com todos os atributos
@NoArgsConstructor  // Gera o construtor vazio
@Entity  // Define como entidade JPA
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;
}