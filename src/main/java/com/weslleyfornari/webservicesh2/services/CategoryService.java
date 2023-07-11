package com.weslleyfornari.webservicesh2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weslleyfornari.webservicesh2.entities.Category;
import com.weslleyfornari.webservicesh2.repositories.CategoryRepository;

@Service
public class CategoryService {
	
    @Autowired
	private CategoryRepository categoryRepositorio; // INJEÇÃO DE DEPENDENCIA
    
    
 // --------------------------------------------------------------------------------------------------------------------   
    public List<Category> findAll(){
    	return categoryRepositorio.findAll();
    }
 // --------------------------------------------------------------------------------------------------------------------   
    
    public Category findById(Long id) {
    	Optional<Category> obj = categoryRepositorio.findById(id);
    	return obj.get(); 
    }
 // ---------------------------------------------------------------------------------------------------------------------   
    
    
    
}
