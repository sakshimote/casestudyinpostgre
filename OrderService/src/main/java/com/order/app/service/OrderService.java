package com.order.app.service;

import java.util.List;

import com.order.app.model.Address;
import com.order.app.model.Order;

public interface OrderService {


	public List<Order> getAllOrder();

	public Order getOrderById(int orderId);

	public String deleteOrderById(int OrderId);

	public Order addOrder(int cartId, Order order);

	public List<Order> getOrdersByUserId(int userId);

	public Order cancelOrderByOrderId(int orderId);

	
	
	
	
}
