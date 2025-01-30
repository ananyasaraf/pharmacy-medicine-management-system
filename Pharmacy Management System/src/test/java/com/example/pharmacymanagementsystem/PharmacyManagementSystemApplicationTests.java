package com.example.pharmacymanagementsystem;

import com.example.pharmacymanagementsystem.models.Product;
import com.example.pharmacymanagementsystem.repositories.ProductRepository;
import com.example.pharmacymanagementsystem.services.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class PharmacyManagementSystemApplicationTests {
@Mock
private ProductRepository productRepository;
@InjectMocks
private ProductService productService;

    @Test
    public void contextLoads() {
    List<Product> products = productService.getAllProducts();
    assertFalse(products.isEmpty());
    }

}
