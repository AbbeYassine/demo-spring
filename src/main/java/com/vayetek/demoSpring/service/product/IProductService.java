package com.vayetek.demoSpring.service.product;

import com.vayetek.demoSpring.model.Product;

import java.util.List;


public interface IProductService {
    Product add(Product product);
    List<Product> getAll();
}
