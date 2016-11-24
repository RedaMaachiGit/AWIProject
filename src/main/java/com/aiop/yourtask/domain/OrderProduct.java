/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderProduct.
 */
@IdClass(com.aiop.yourtask.domain.OrderProductPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllOrderProducts", query = "select myOrderProduct from OrderProduct myOrderProduct"),
		@NamedQuery(name = "findOrderProductByPrimaryKey", query = "select myOrderProduct from OrderProduct myOrderProduct where myOrderProduct.orderid = ?1 and myOrderProduct.productid = ?2") })

@Table(schema = "public", name = "order_product")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "OrderProduct")

public class OrderProduct implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The orderid. */

	@Column(name = "orderid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer orderid;
	
	/** The productid. */

	@Column(name = "productid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer productid;
	
	/** The quantity. */

	@Column(name = "quantity", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer quantity;

	/** The order. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "orderid", referencedColumnName = "orderid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Order order;
	
	/** The product. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "productid", referencedColumnName = "productid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Product product;

	/**
	 * Sets the orderid.
	 *
	 * @param orderid the new orderid
	 */
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	/**
	 * Gets the orderid.
	 *
	 * @return the orderid
	 */
	public Integer getOrderid() {
		return this.orderid;
	}

	/**
	 * Sets the productid.
	 *
	 * @param productid the new productid
	 */
	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	/**
	 * Gets the productid.
	 *
	 * @return the productid
	 */
	public Integer getProductid() {
		return this.productid;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return this.quantity;
	}

	/**
	 * Sets the order.
	 *
	 * @param order the new order
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * Gets the order.
	 *
	 * @return the order
	 */
	@JsonIgnore
	public Order getOrder() {
		return order;
	}

	/**
	 * Sets the product.
	 *
	 * @param product the new product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * Gets the product.
	 *
	 * @return the product
	 */
	@JsonIgnore
	public Product getProduct() {
		return product;
	}

	/**
	 * Instantiates a new order product.
	 */
	public OrderProduct() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(OrderProduct that) {
		setOrderid(that.getOrderid());
		setProductid(that.getProductid());
		setQuantity(that.getQuantity());
		setOrder(that.getOrder());
		setProduct(that.getProduct());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orderid=[").append(orderid).append("] ");
		buffer.append("productid=[").append(productid).append("] ");
		buffer.append("quantity=[").append(quantity).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((orderid == null) ? 0 : orderid.hashCode()));
		result = (int) (prime * result + ((productid == null) ? 0 : productid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof OrderProduct))
			return false;
		OrderProduct equalCheck = (OrderProduct) obj;
		if ((orderid == null && equalCheck.orderid != null) || (orderid != null && equalCheck.orderid == null))
			return false;
		if (orderid != null && !orderid.equals(equalCheck.orderid))
			return false;
		if ((productid == null && equalCheck.productid != null) || (productid != null && equalCheck.productid == null))
			return false;
		if (productid != null && !productid.equals(equalCheck.productid))
			return false;
		return true;
	}
}
