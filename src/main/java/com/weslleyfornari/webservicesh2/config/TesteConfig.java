package com.weslleyfornari.webservicesh2.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.weslleyfornari.webservicesh2.entities.Category;
import com.weslleyfornari.webservicesh2.entities.Order;
import com.weslleyfornari.webservicesh2.entities.Product;
import com.weslleyfornari.webservicesh2.entities.User;
import com.weslleyfornari.webservicesh2.entities.enums.OrderStatus;
import com.weslleyfornari.webservicesh2.repositories.CategoryRepository;
import com.weslleyfornari.webservicesh2.repositories.OrderRepository;
import com.weslleyfornari.webservicesh2.repositories.ProductRepository;
import com.weslleyfornari.webservicesh2.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	@Autowired // INJEÇÃO DE DEPENDENCIA DA CLASSE "USER REPOSITORIO"
	private UserRepository userRepositorio;

	@Autowired // INJEÇÃO DE DEPENDENCIA DA CLASSE "ORDER REPOSITORIO"
	private OrderRepository orderRepositorio;
	
	@Autowired // INJEÇÃO DE DEPENDENCIA DA CLASSE "ORDER REPOSITORIO"
	private CategoryRepository categoryRepositorio;
	
	@Autowired // INJEÇÃO DE DEPENDENCIA DA CLASSE "ORDER REPOSITORIO"
	private ProductRepository produtoRepositorio;
	
// --------------------------------------------------------------------------------------------------------------	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

		categoryRepositorio.saveAll(Arrays.asList(cat1, cat2, cat3));
		produtoRepositorio.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); // OBJETO u1
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); //OBJETO u2
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED,  u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

		
		userRepositorio.saveAll(Arrays.asList(u1, u2)); // SALVA OS OBJETOS NO H2
		orderRepositorio.saveAll(Arrays.asList(o1,o2,o3));

		
	}

}
