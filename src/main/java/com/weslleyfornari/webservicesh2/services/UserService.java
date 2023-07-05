package com.weslleyfornari.webservicesh2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weslleyfornari.webservicesh2.entities.User;
import com.weslleyfornari.webservicesh2.repositories.UserRepository;

@Service
public class UserService {
	
    @Autowired
	private UserRepository userRepositorio; // INJEÇÃO DE DEPENDENCIA
    
    
 // --------------------------------------------------------------------------------------------------------------------   
    public List<User> findAll(){
    	return userRepositorio.findAll();
    }
 // --------------------------------------------------------------------------------------------------------------------   
    
    public User findById(Long id) {
    	Optional<User> usuario = userRepositorio.findById(id);
    	return usuario.get(); 
    }
 // ---------------------------------------------------------------------------------------------------------------------   
    
    
    
}
