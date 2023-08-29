package com.order.app.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "OrderTable")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;

	
	private LocalDate orderDate;

	

	private Double amountPaid;


	private String modeOfPayment;
	
	 @OneToMany(cascade = CascadeType.PERSIST,
		        orphanRemoval = true)
	private List<ItemsAddedInCart> items;

	
	private String orderStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id",referencedColumnName = "id")
	private Address address;
	
	private String username;
	

	private int userId;

	

	public Order(int orderId, LocalDate orderDate, Double amountPaid, String modeOfPayment,
			List<ItemsAddedInCart> items, String orderStatus, Address address, String username, int userId) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.amountPaid = amountPaid;
		this.modeOfPayment = modeOfPayment;
		this.items = items;
		this.orderStatus = orderStatus;
		this.address = address;
		this.username = username;
		this.userId = userId;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<ItemsAddedInCart> getItems() {
		return items;
	}

	public void setItems(List<ItemsAddedInCart> items) {
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	


	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}