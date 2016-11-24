/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllOrders", query = "select myOrder from Order myOrder"),
		@NamedQuery(name = "findOrderByOrderdate", query = "select myOrder from Order myOrder where myOrder.orderdate = ?1"),
		@NamedQuery(name = "findOrderByOrderdateAfter", query = "select myOrder from Order myOrder where myOrder.orderdate > ?1"),
		@NamedQuery(name = "findOrderByOrderdateBefore", query = "select myOrder from Order myOrder where myOrder.orderdate < ?1"),
		@NamedQuery(name = "findOrderByOrderid", query = "select myOrder from Order myOrder where myOrder.orderid = ?1"),
		@NamedQuery(name = "findOrderByOrderprice", query = "select myOrder from Order myOrder where myOrder.orderprice = ?1"),
		@NamedQuery(name = "findOrderByOrdershippingcost", query = "select myOrder from Order myOrder where myOrder.ordershippingcost = ?1"),
		@NamedQuery(name = "findOrderByOrderstate", query = "select myOrder from Order myOrder where myOrder.orderstate = ?1"),
		@NamedQuery(name = "findOrderByOrderstateContaining", query = "select myOrder from Order myOrder where myOrder.orderstate like ?1"),
		@NamedQuery(name = "findOrderByPrimaryKey", query = "select myOrder from Order myOrder where myOrder.orderid = ?1") })

@Table(schema = "public", name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Order")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Order implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The orderid. */

	@Column(name = "orderid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer orderid;
	
	/** The orderdate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "orderdate", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar orderdate;
	
	/** The ordershippingcost. */

	@Column(name = "ordershippingcost", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal ordershippingcost;
	
	/** The orderprice. */

	@Column(name = "orderprice", scale = 17, precision = 17, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal orderprice;
	
	/** The orderstate. */

	@Column(name = "orderstate", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String orderstate;

	/** The yourtaskuser by useridsc. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "useridsc", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuserByUseridsc;
	
	/** The yourtaskuser by userid. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuserByUserid;
	
	/** The order products. */
	@OneToMany(mappedBy = "order", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.OrderProduct> orderProducts;

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
	 * Sets the orderdate.
	 *
	 * @param orderdate the new orderdate
	 */
	public void setOrderdate(Calendar orderdate) {
		this.orderdate = orderdate;
	}

	/**
	 * Gets the orderdate.
	 *
	 * @return the orderdate
	 */
	public Calendar getOrderdate() {
		return this.orderdate;
	}

	/**
	 * Sets the ordershippingcost.
	 *
	 * @param ordershippingcost the new ordershippingcost
	 */
	public void setOrdershippingcost(BigDecimal ordershippingcost) {
		this.ordershippingcost = ordershippingcost;
	}

	/**
	 * Gets the ordershippingcost.
	 *
	 * @return the ordershippingcost
	 */
	public BigDecimal getOrdershippingcost() {
		return this.ordershippingcost;
	}

	/**
	 * Sets the orderprice.
	 *
	 * @param orderprice the new orderprice
	 */
	public void setOrderprice(BigDecimal orderprice) {
		this.orderprice = orderprice;
	}

	/**
	 * Gets the orderprice.
	 *
	 * @return the orderprice
	 */
	public BigDecimal getOrderprice() {
		return this.orderprice;
	}

	/**
	 * Sets the orderstate.
	 *
	 * @param orderstate the new orderstate
	 */
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}

	/**
	 * Gets the orderstate.
	 *
	 * @return the orderstate
	 */
	public String getOrderstate() {
		return this.orderstate;
	}

	/**
	 * Sets the yourtaskuser by useridsc.
	 *
	 * @param yourtaskuserByUseridsc the new yourtaskuser by useridsc
	 */
	public void setYourtaskuserByUseridsc(Yourtaskuser yourtaskuserByUseridsc) {
		this.yourtaskuserByUseridsc = yourtaskuserByUseridsc;
	}

	/**
	 * Gets the yourtaskuser by useridsc.
	 *
	 * @return the yourtaskuser by useridsc
	 */
	@JsonIgnore
	public Yourtaskuser getYourtaskuserByUseridsc() {
		return yourtaskuserByUseridsc;
	}

	/**
	 * Sets the yourtaskuser by userid.
	 *
	 * @param yourtaskuserByUserid the new yourtaskuser by userid
	 */
	public void setYourtaskuserByUserid(Yourtaskuser yourtaskuserByUserid) {
		this.yourtaskuserByUserid = yourtaskuserByUserid;
	}

	/**
	 * Gets the yourtaskuser by userid.
	 *
	 * @return the yourtaskuser by userid
	 */
	@JsonIgnore
	public Yourtaskuser getYourtaskuserByUserid() {
		return yourtaskuserByUserid;
	}

	/**
	 * Sets the order products.
	 *
	 * @param orderProducts the new order products
	 */
	public void setOrderProducts(Set<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

	/**
	 * Gets the order products.
	 *
	 * @return the order products
	 */
	@JsonIgnore
	public Set<OrderProduct> getOrderProducts() {
		if (orderProducts == null) {
			orderProducts = new java.util.LinkedHashSet<com.aiop.yourtask.domain.OrderProduct>();
		}
		return orderProducts;
	}

	/**
	 * Instantiates a new order.
	 */
	public Order() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Order that) {
		setOrderid(that.getOrderid());
		setOrderdate(that.getOrderdate());
		setOrdershippingcost(that.getOrdershippingcost());
		setOrderprice(that.getOrderprice());
		setOrderstate(that.getOrderstate());
		setYourtaskuserByUseridsc(that.getYourtaskuserByUseridsc());
		setYourtaskuserByUserid(that.getYourtaskuserByUserid());
		setOrderProducts(new java.util.LinkedHashSet<com.aiop.yourtask.domain.OrderProduct>(that.getOrderProducts()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orderid=[").append(orderid).append("] ");
		buffer.append("orderdate=[").append(orderdate).append("] ");
		buffer.append("ordershippingcost=[").append(ordershippingcost).append("] ");
		buffer.append("orderprice=[").append(orderprice).append("] ");
		buffer.append("orderstate=[").append(orderstate).append("] ");

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
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Order))
			return false;
		Order equalCheck = (Order) obj;
		if ((orderid == null && equalCheck.orderid != null) || (orderid != null && equalCheck.orderid == null))
			return false;
		if (orderid != null && !orderid.equals(equalCheck.orderid))
			return false;
		return true;
	}
}
