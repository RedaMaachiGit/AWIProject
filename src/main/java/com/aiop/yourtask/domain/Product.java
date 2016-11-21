
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

/**
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
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "productid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer productid;
	/**
	 */

	@Column(name = "productname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String productname;
	/**
	 */

	@Column(name = "productdescription", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String productdescription;
	/**
	 */

	@Column(name = "productimage", length = 150)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String productimage;
	/**
	 */

	@Column(name = "productprice", scale = 17, precision = 17, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal productprice;
	/**
	 */

	@Column(name = "productavailablequantity", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer productavailablequantity;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;
	/**
	 */
	@OneToMany(mappedBy = "product", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.OrderProduct> orderProducts;

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
	public void setProductname(String productname) {
		this.productname = productname;
	}

	/**
	 */
	public String getProductname() {
		return this.productname;
	}

	/**
	 */
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	/**
	 */
	public String getProductdescription() {
		return this.productdescription;
	}

	/**
	 */
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}

	/**
	 */
	public String getProductimage() {
		return this.productimage;
	}

	/**
	 */
	public void setProductprice(BigDecimal productprice) {
		this.productprice = productprice;
	}

	/**
	 */
	public BigDecimal getProductprice() {
		return this.productprice;
	}

	/**
	 */
	public void setProductavailablequantity(Integer productavailablequantity) {
		this.productavailablequantity = productavailablequantity;
	}

	/**
	 */
	public Integer getProductavailablequantity() {
		return this.productavailablequantity;
	}

	/**
	 */
	public void setYourtaskuser(Yourtaskuser yourtaskuser) {
		this.yourtaskuser = yourtaskuser;
	}

	/**
	 */
	@JsonIgnore
	public Yourtaskuser getYourtaskuser() {
		return yourtaskuser;
	}

	/**
	 */
	public void setOrderProducts(Set<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

	/**
	 */
	@JsonIgnore
	public Set<OrderProduct> getOrderProducts() {
		if (orderProducts == null) {
			orderProducts = new java.util.LinkedHashSet<com.aiop.yourtask.domain.OrderProduct>();
		}
		return orderProducts;
	}

	/**
	 */
	public Product() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((productid == null) ? 0 : productid.hashCode()));
		return result;
	}

	/**
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
