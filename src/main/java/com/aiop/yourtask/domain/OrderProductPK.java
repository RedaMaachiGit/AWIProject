/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderProductPK.
 */
public class OrderProductPK implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new order product PK.
	 */
	public OrderProductPK() {
	}

	/** The orderid. */

	@Column(name = "orderid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer orderid;
	
	/** The productid. */

	@Column(name = "productid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer productid;

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
		if (!(obj instanceof OrderProductPK))
			return false;
		OrderProductPK equalCheck = (OrderProductPK) obj;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("OrderProductPK");
		sb.append(" orderid: ").append(getOrderid());
		sb.append(" productid: ").append(getProductid());
		return sb.toString();
	}
}
