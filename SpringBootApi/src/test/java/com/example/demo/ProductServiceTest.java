package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    private Product product;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        product = new Product();
        product.setId(1L);
        product.setName("Product Name");
        product.setPrice(100.00);
    }

    @Test
    public void testCreateProduct() {
        when(productRepository.save(any(Product.class))).thenReturn(product);
        Product createdProduct = productService.createProduct(product.getName(), product.getPrice());

        assertNotNull(createdProduct);
        assertEquals(product.getId(), createdProduct.getId());
    }

    @Test
    public void testGetProductById() {
        // Arrange: configure o produto e o repositório simulado
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product"); // Adicione outros atributos conforme necessário

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        // Act: chame o método a ser testado
        Product foundProduct = productService.getProductById(1L);

        // Assert: verifique os resultados
        assertNotNull(foundProduct);
        assertEquals(product.getId(), foundProduct.getId());
        assertEquals(product.getName(), foundProduct.getName()); // Verifique outros atributos, se necessário
    }


}
