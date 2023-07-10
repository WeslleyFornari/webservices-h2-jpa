package com.weslleyfornari.webservicesh2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weslleyfornari.webservicesh2.entities.Order;
import com.weslleyfornari.webservicesh2.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService orderServiço; // INJEÇÃO DE DEPENDENCIA

// -------------------------------------------------------------------------------------------------------------
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> lista = orderServiço.findAll();
		return ResponseEntity.ok().body(lista);
	}
// -------------------------------------------------------------------------------------------------------------

	@GetMapping(value= "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
	   Order ordem = orderServiço.findById(id);
	   return ResponseEntity.ok().body(ordem);
   }
// -------------------------------------------------------------------------------------------------------------	
	
	
}
