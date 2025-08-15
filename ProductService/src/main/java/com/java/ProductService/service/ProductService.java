package com.java.ProductService.service;

import com.java.ProductService.model.ProductRequest;
import com.java.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
