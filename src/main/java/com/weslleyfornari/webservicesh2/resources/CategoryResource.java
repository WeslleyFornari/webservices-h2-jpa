package com.weslleyfornari.webservicesh2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.weslleyfornari.webservicesh2.entities.Category;
import com.weslleyfornari.webservicesh2.services.CategoryService;

@RestController
@RequestMapping(value = "/categories") // HTTP://
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryServiço; // INJEÇÃO DE DEPENDENCIA

// -------------------------------------------------------------------------------------------------------------
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> lista = categoryServiço.findAll();
		return ResponseEntity.ok().body(lista);
	}
// -------------------------------------------------------------------------------------------------------------

	@GetMapping(value= "/{id}") // MAPEA POR ID
	public ResponseEntity<Category> findById(@PathVariable Long id){
	   Category obj = categoryServiço.findById(id);
	   return ResponseEntity.ok().body(obj);
    }
// -------------------------------------------------------------------------------------------------------------	
	
	
}
