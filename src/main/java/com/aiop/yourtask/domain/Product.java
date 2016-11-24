/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

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
 * The Class Product.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllProducts", query = "select myProduct from Product myProduct"),
		//TODO right request
		@NamedQuery(name = "findProductByCompany", query = "select myProduct from Product myProduct"),
		@NamedQuery(name = "findProductByPrimaryKey", query = "select myProduct from Product myProduct where myProduct.productid = ?1"),
		@NamedQuery(name = "findProductByProductavailablequantity", query = "select myProduct from Product myProduct where myProduct.productavailablequantity = ?1"),
		@NamedQuery(name = "findProductByProductdescription", query = "select myProduct from Product myProduct where myProduct.productdescription = ?1"),
		@NamedQuery(name = "findProductByProductdescriptionContaining", query = "select myProduct from Product myProduct where myProduct.productdescription like ?1"),
		@NamedQuery(name = "findProductByProductid", query = "select myProduct from Product myProduct where myProduct.productid = ?1"),
		@NamedQuery(name = "findProductByProductimage", query = "select myProduct from Product myProduct where myProduct.productimage = ?1"),
		@NamedQuery(name = "findProductByProductimageContaining", query = "select myProduct from Product myProduct where myProduct.productimage like ?1"),
		@NamedQuery(name = "findProductByProductname", query = "select myProduct from Product myProduct where myProduct.productname = ?1"),
		@NamedQuery(name = "findProductByProductnameContaining", query = "select myProduct from Product myProduct where myProduct.productname like ?1"),
		@NamedQuery(name = "findProductByProductprice", query = "select myProduct from Product myProduct where myProduct.productprice = ?1") })

@Table(schema = "public", name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Product")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Product implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The productid. */

	@Column(name = "productid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer productid;
	
	/** The productname. */

	@Column(name = "productname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String productname;
	
	/** The productdescription. */

	@Column(name = "productdescription", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String productdescription;
	
	/** The productimage. */

	@Column(name = "productimage", length = 150)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String productimage;
	
	/** The productprice. */

	@Column(name = "productprice", scale = 17, precision = 17, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal productprice;
	
	/** The productavailablequantity. */

	@Column(name = "productavailablequantity", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer productavailablequantity;

	/** The yourtaskuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;
	
	/** The order products. */
	@OneToMany(mappedBy = "product", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.OrderProduct> orderProducts;

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
	 * Sets the productname.
	 *
	 * @param productname the new productname
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}

	/**
	 * Gets the productname.
	 *
	 * @return the productname
	 */
	public String getProductname() {
		return this.productname;
	}

	/**
	 * Sets the productdescription.
	 *
	 * @param productdescription the new productdescription
	 */
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	/**
	 * Gets the productdescription.
	 *
	 * @return the productdescription
	 */
	public String getProductdescription() {
		return this.productdescription;
	}

	/**
	 * Sets the productimage.
	 *
	 * @param productimage the new productimage
	 */
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}

	/**
	 * Gets the productimage.
	 *
	 * @return the productimage
	 */
	public String getProductimage() {
		return this.productimage;
	}

	/**
	 * Sets the productprice.
	 *
	 * @param productprice the new productprice
	 */
	public void setProductprice(BigDecimal productprice) {
		this.productprice = productprice;
	}

	/**
	 * Gets the productprice.
	 *
	 * @return the productprice
	 */
	public BigDecimal getProductprice() {
		return this.productprice;
	}

	/**
	 * Sets the productavailablequantity.
	 *
	 * @param productavailablequantity the new productavailablequantity
	 */
	public void setProductavailablequantity(Integer productavailablequantity) {
		this.productavailablequantity = productavailablequantity;
	}

	/**
	 * Gets the productavailablequantity.
	 *
	 * @return the productavailablequantity
	 */
	public Integer getProductavailablequantity() {
		return this.productavailablequantity;
	}

	/**
	 * Sets the yourtaskuser.
	 *
	 * @param yourtaskuser the new yourtaskuser
	 */
	public void setYourtaskuser(Yourtaskuser yourtaskuser) {
		this.yourtaskuser = yourtaskuser;
	}

	/**
	 * Gets the yourtaskuser.
	 *
	 * @return the yourtaskuser
	 */
	@JsonIgnore
	public Yourtaskuser getYourtaskuser() {
		return yourtaskuser;
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
	 * Instantiates a new product.
	 */
	public Product() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Product that) {
		setProductid(that.getProductid());
		setProductname(that.getProductname());
		setProductdescription(that.getProductdescription());
		setProductimage(that.getProductimage());
		setProductprice(that.getProductprice());
		setProductavailablequantity(that.getProductavailablequantity());
		setYourtaskuser(that.getYourtaskuser());
		setOrderProducts(new java.util.LinkedHashSet<com.aiop.yourtask.domain.OrderProduct>(that.getOrderProducts()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("productid=[").append(productid).append("] ");
		buffer.append("productname=[").append(productname).append("] ");
		buffer.append("productdescription=[").append(productdescription).append("] ");
		buffer.append("productimage=[").append(productimage).append("] ");
		buffer.append("productprice=[").append(productprice).append("] ");
		buffer.append("productavailablequantity=[").append(productavailablequantity).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((productid == null) ? 0 : productid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product equalCheck = (Product) obj;
		if ((productid == null && equalCheck.productid != null) || (productid != null && equalCheck.productid == null))
			return false;
		if (productid != null && !productid.equals(equalCheck.productid))
			return false;
		return true;
	}
}
