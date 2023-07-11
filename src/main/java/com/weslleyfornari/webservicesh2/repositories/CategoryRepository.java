package com.weslleyfornari.webservicesh2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyfornari.webservicesh2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
