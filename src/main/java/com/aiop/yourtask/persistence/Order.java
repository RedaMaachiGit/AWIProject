package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderId")
	private int orderId;

	@Column(name="orderDate")
	private Date orderDate;
	
	@Column(name="orderShippingcost")
	private double orderShippingcost;
	
	@Column(name="orderPrice")
	private int orderPrice;
	
	@Column(name="orderState")
	private String orderState;
	
	@Column(name="userId")
	private int userId;
	

	
	public Order() {}



	public Order(int orderId, Date orderDate, double orderShippingcost, int orderPrice, String orderState, int userId) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderShippingcost = orderShippingcost;
		this.orderPrice = orderPrice;
		this.orderState = orderState;
		this.userId = userId;
	}



	public Order(Date orderDate, double orderShippingcost, int orderPrice, String orderState, int userId) {
		super();
		this.orderDate = orderDate;
		this.orderShippingcost = orderShippingcost;
		this.orderPrice = orderPrice;
		this.orderState = orderState;
		this.userId = userId;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public double getOrderShippingcost() {
		return orderShippingcost;
	}



	public void setOrderShippingcost(double orderShippingcost) {
		this.orderShippingcost = orderShippingcost;
	}



	public int getOrderPrice() {
		return orderPrice;
	}



	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}



	public String getOrderState() {
		return orderState;
	}



	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderShippingcost=" + orderShippingcost
				+ ", orderPrice=" + orderPrice + ", orderState=" + orderState + ", userId=" + userId + "]";
	}
	
	
	
}