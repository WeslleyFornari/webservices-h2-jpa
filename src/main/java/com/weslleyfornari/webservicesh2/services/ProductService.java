package com.weslleyfornari.webservicesh2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weslleyfornari.webservicesh2.entities.Product;
import com.weslleyfornari.webservicesh2.repositories.ProductRepository;

@Service
public class ProductService {
	
    @Autowired
	private ProductRepository produtoRepositorio; // INJEÇÃO DE DEPENDENCIA
    
    
 // --------------------------------------------------------------------------------------------------------------------   
    public List<Product> findAll(){
    	return produtoRepositorio.findAll();
    }
 // --------------------------------------------------------------------------------------------------------------------   
    
    public Product findById(Long id) {
    	Optional<Product> obj = produtoRepositorio.findById(id);
    	return obj.get(); 
    }
 // ---------------------------------------------------------------------------------------------------------------------   
    
    
    
}
