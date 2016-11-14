package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_product")
public class OrderProduct {
	
	@EmbeddedId
	private OrderProductPK orderProductPK;
	
	@Column(name="quantity")
	private int quantity;
	
	public OrderProduct() {}

	public OrderProduct(OrderProductPK orderProductPK, int quantity) {
		this.orderProductPK = orderProductPK;
		this.quantity = quantity;
	}

	public OrderProductPK getOrderProductPK() {
		return orderProductPK;
	}

	public void setOrderProductPK(OrderProductPK orderProductPK) {
		this.orderProductPK = orderProductPK;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderProduct [orderProductPK=" + orderProductPK + ", quantity=" + quantity + "]";
	}
	
	

	
}