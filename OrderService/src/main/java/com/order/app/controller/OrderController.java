package com.order.app.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.app.JwtUtil;
import com.order.app.model.AuthenticationRequest;
import com.order.app.model.AuthenticationResponse;
import com.order.app.model.Order;
import com.order.app.service.MyUserDetails;
import com.order.app.service.OrderServiceImpl;


import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200/"})
public class OrderController  {

	@Autowired
	private OrderServiceImpl orderServiceImpl;
	

	 @Autowired
		private AuthenticationManager authenticationManager;
		
		@Autowired
		private MyUserDetails userDetailsService;
		
		@Autowired
		private JwtUtil jwtTokeUtil;



	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	
	// Post order
	@ApiOperation("add order method")
	@PostMapping("/order/{userId}")
	public Order addOrder(@PathVariable("userId") int userId,@RequestBody Order order) {
		logger.trace("add order method accessed");
		return orderServiceImpl.addOrder(userId, order);		
	}
	

	@PostMapping("/authenticate")
	@ApiOperation("autyenticate method accessed")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)throws Exception{
		try { authenticationManager.authenticate(
				 new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		}
		
		catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password",e);
		}
		final UserDetails userDetails=userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		System.out.println(userDetails);
		System.out.println("hii");
		final String jwt=jwtTokeUtil.generateToken(userDetails);
	
		
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
	

	// get all Order
	@ApiOperation("get all order method")
	@GetMapping("/allorder")
	public List<Order> getAllOrder() {
		logger.trace("get all order method accessed");
		List<Order> OrderList = orderServiceImpl.getAllOrder();

		return OrderList;
	}

	// get All Order by OrderId
	@ApiOperation("get order by Id method")
	@GetMapping("/allorder/{orderId}")
	public Order getOrderById(@PathVariable("orderId") int orderId) {
		logger.trace("get order by Id method accessed");
	        Order order=orderServiceImpl.getOrderById(orderId);
		return order;
	}

  	//Delete Order By id
	@ApiOperation("Delete order by orderId")
	@DeleteMapping("/allorder/{orderId}")
	public String deleteOrderById(@PathVariable("OrderId") int orderId) {
		logger.trace("Delete order by orderId method accessed");
		return orderServiceImpl.deleteOrderById(orderId);
	}
	
	// get All Order by OrderId
	@ApiOperation("get all orders by user Id method")
	@GetMapping("/allorder/byuser/{userId}")
	public List<Order> getOrderByUserId(@PathVariable("userId") int userId) {
		logger.trace("get order by Id method accessed");
		return orderServiceImpl.getOrdersByUserId(userId);
		
	}
	
	//cancel order by order Id
	@ApiOperation("cancel order by order Id method")
	@PutMapping("/allorder/cancelorder/{orderId}")
	public Order cancelOrderByOrderId(@PathVariable("orderId") int orderId) {
		logger.trace("cancel order by order Id method");
		return orderServiceImpl.cancelOrderByOrderId(orderId);
		
	}


	
}