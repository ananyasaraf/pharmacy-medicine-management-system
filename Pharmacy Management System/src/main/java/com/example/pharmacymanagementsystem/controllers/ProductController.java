package com.example.pharmacymanagementsystem.controllers;
import com.example.pharmacymanagementsystem.models.Product;
import com.example.pharmacymanagementsystem.repositories.ProductRepository;
import com.example.pharmacymanagementsystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

   @GetMapping("/search")
    public List<Product> searchProductsByName(@RequestParam String name) {
       return productRepository.findByNameContaining(name);
   }
    @GetMapping("/high-quantity")
    public List<Product> getProductsWithHighQuantity(@RequestParam int quantity) {
        return productRepository.findByQuantityGreaterThan(quantity);
    }

    @DeleteMapping("/by-name")
    public void deleteProductByName(@RequestParam String name) {
        productRepository.deleteByName(name);
    }


    }

