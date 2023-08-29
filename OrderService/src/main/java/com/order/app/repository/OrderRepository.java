package com.order.app.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.app.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	List<Order> findByUserId(int userId);

}
