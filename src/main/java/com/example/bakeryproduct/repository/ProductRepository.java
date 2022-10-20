package com.example.bakeryproduct.repository;

import com.example.bakeryproduct.model.Product;
import com.example.bakeryproduct.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findProductByType(Type type);
    Product findProductByName(String name);
}
