package com.weslleyfornari.webservicesh2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyfornari.webservicesh2.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
