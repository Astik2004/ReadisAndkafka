package com.astik.reddis.redistut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astik.reddis.redistut.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
