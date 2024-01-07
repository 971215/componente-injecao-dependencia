package com.minhaempresa.desafio.service;

import org.springframework.stereotype.Service;

import com.minhaempresa.desafio.entities.Order;

@Service
public class ShippingService {

	public Double shipment(Order order) {
		
		if (order.getBasic() < 100) {
			return 20.0;
		}
		
		if (order.getBasic() <= 200) {
			return 12.0;
		}

		return 0.0;
	}
	
}
