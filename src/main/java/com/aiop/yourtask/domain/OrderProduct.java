
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

/**
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
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "orderid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer orderid;
	/**
	 */

	@Column(name = "productid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer productid;
	/**
	 */

	@Column(name = "quantity", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer quantity;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "orderid", referencedColumnName = "orderid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Order order;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "productid", referencedColumnName = "productid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Product product;

	/**
	 */
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	/**
	 */
	public Integer getOrderid() {
		return this.orderid;
	}

	/**
	 */
	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	/**
	 */
	public Integer getProductid() {
		return this.productid;
	}

	/**
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 */
	public Integer getQuantity() {
		return this.quantity;
	}

	/**
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 */
	@JsonIgnore
	public Order getOrder() {
		return order;
	}

	/**
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 */
	@JsonIgnore
	public Product getProduct() {
		return product;
	}

	/**
	 */
	public OrderProduct() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orderid=[").append(orderid).append("] ");
		buffer.append("productid=[").append(productid).append("] ");
		buffer.append("quantity=[").append(quantity).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((orderid == null) ? 0 : orderid.hashCode()));
		result = (int) (prime * result + ((productid == null) ? 0 : productid.hashCode()));
		return result;
	}

	/**
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
