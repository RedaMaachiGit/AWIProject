
package com.aiop.yourtask.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class OrderProductPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public OrderProductPK() {
	}

	/**
	 */

	@Column(name = "orderid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer orderid;
	/**
	 */

	@Column(name = "productid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer productid;

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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("OrderProductPK");
		sb.append(" orderid: ").append(getOrderid());
		sb.append(" productid: ").append(getProductid());
		return sb.toString();
	}
}
