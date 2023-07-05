package com.weslleyfornari.webservicesh2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weslleyfornari.webservicesh2.entities.User;
import com.weslleyfornari.webservicesh2.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userServiço; // INJEÇÃO DE DEPENDENCIA

// -------------------------------------------------------------------------------------------------------------
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> lista = userServiço.findAll();
		return ResponseEntity.ok().body(lista);
	}
// -------------------------------------------------------------------------------------------------------------

	@GetMapping(value= "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
	   User usuario = userServiço.findById(id);
	   return ResponseEntity.ok().body(usuario);
    }
// -------------------------------------------------------------------------------------------------------------	
	
	
}
