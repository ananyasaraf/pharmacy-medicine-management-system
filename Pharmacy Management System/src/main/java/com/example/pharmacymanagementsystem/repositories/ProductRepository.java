package com.example.pharmacymanagementsystem.repositories;
import com.example.pharmacymanagementsystem.models.Product;
import com.example.pharmacymanagementsystem.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface ProductRepository extends JpaRepository<Product, Integer> {
  List<Product> findByNameContaining(String name);
  List<Product> findByQuantityGreaterThan(int quantity);
  void deleteByName(String name);
}


