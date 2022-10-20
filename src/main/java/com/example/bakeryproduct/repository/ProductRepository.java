package com.example.bakeryproduct.repository;

import com.example.bakeryproduct.model.Product;
import com.example.bakeryproduct.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findProductByType(Type type);
    List<Product> findProductByName(String name);
}
