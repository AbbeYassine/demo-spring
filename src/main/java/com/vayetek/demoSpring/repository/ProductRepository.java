package com.vayetek.demoSpring.repository;

import com.vayetek.demoSpring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
