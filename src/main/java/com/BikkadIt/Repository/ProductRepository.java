package com.BikkadIt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
