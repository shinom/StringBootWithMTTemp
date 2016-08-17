package com.example.repository.tenant;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.tenant.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findOneByName(String name);
}
