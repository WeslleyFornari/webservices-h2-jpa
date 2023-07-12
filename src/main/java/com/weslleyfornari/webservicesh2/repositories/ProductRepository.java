package com.weslleyfornari.webservicesh2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyfornari.webservicesh2.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
