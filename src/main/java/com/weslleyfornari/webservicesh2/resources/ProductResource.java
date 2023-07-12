package com.weslleyfornari.webservicesh2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weslleyfornari.webservicesh2.entities.Product;
import com.weslleyfornari.webservicesh2.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService produtoServiço; // INJEÇÃO DE DEPENDENCIA

// -------------------------------------------------------------------------------------------------------------
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> lista = produtoServiço.findAll();
		return ResponseEntity.ok().body(lista);
	}
// -------------------------------------------------------------------------------------------------------------

	@GetMapping(value= "/{id}") // MAPEA POR ID
	public ResponseEntity<Product> findById(@PathVariable Long id){
	   Product obj = produtoServiço.findById(id);
	   return ResponseEntity.ok().body(obj);
    }
// -------------------------------------------------------------------------------------------------------------	
	
	
}
