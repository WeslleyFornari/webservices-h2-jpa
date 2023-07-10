package com.weslleyfornari.webservicesh2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weslleyfornari.webservicesh2.entities.Order;
import com.weslleyfornari.webservicesh2.repositories.OrderRepository;

@Service
public class OrderService {
	
    @Autowired
	private OrderRepository orderRepositorio; // INJEÇÃO DE DEPENDENCIA
    
    
 // --------------------------------------------------------------------------------------------------------------------   
    public List<Order> findAll(){
    	return orderRepositorio.findAll();
    }
 // --------------------------------------------------------------------------------------------------------------------   
    
    public Order findById(Long id) {
    	Optional<Order> usuario = orderRepositorio.findById(id);
    	return usuario.get(); 
    }
 // ---------------------------------------------------------------------------------------------------------------------   
    
    
    
}
