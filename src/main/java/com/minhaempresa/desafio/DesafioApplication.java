package com.minhaempresa.desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.minhaempresa.desafio.entities.Order;
import com.minhaempresa.desafio.service.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	private OrderService orderService;

	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034, 150.00, 20.00);
		System.out.println("Pedido código: "+order.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order));
		
		Order order2 = new Order(2282, 800.00, 10.00);
		System.out.println("Pedido código: "+order2.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order2));
		
		Order order3 = new Order(1309, 95.90, 00.00);
		System.out.println("Pedido código: "+order3.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order3));
	}

}
