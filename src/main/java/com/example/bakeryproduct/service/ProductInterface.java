package com.example.bakeryproduct.service;

import com.example.bakeryproduct.model.Product;
import com.example.bakeryproduct.dto.ProductDto;

public interface ProductInterface {
    Product addProduct(ProductDto productDto);
}
