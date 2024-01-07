package com.minhaempresa.desafio.service;

import org.springframework.stereotype.Service;

import com.minhaempresa.desafio.entities.Order;

@Service
public class OrderService {

	private ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public Double total(Order order) {
		Double shippingCost = shippingService.shipment(order);
		Double discountAmount = order.getDiscount() / 100 * order.getBasic();
		return order.getBasic() - discountAmount + shippingCost;
	}

}
