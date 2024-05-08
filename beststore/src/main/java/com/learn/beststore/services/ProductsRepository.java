package com.learn.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
