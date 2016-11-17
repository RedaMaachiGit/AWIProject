
package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
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
		@NamedQuery(name = "findAllYourtaskusers", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser"),
		@NamedQuery(name = "findYourtaskuserByPrimaryKey", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userid = ?1"),
		@NamedQuery(name = "findYourtaskuserByUsercity", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.usercity = ?1"),
		@NamedQuery(name = "findYourtaskuserByUsercityContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.usercity like ?1"),
		@NamedQuery(name = "findYourtaskuserByUserdateofbirth", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userdateofbirth = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserdateofbirthAfter", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userdateofbirth > ?1"),
		@NamedQuery(name = "findYourtaskuserByUserdateofbirthBefore", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userdateofbirth < ?1"),
		@NamedQuery(name = "findYourtaskuserByUseremail", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.useremail = ?1"),
		@NamedQuery(name = "findYourtaskuserByUseremailContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.useremail like ?1"),
		@NamedQuery(name = "findYourtaskuserByUseriban", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.useriban = ?1"),
		@NamedQuery(name = "findYourtaskuserByUseribanContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.useriban like ?1"),
		@NamedQuery(name = "findYourtaskuserByUserid", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userid = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserlastconnectiondate", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userlastconnectiondate = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserlastconnectiondateAfter", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userlastconnectiondate > ?1"),
		@NamedQuery(name = "findYourtaskuserByUserlastconnectiondateBefore", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userlastconnectiondate < ?1"),
		@NamedQuery(name = "findYourtaskuserByUserpassword", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userpassword = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserpasswordContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userpassword like ?1"),
		@NamedQuery(name = "findYourtaskuserByUserphonenumber", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userphonenumber = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserphonenumberContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userphonenumber like ?1"),
		@NamedQuery(name = "findYourtaskuserByUserstreetnumber", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userstreetnumber = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserstreetnumberContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userstreetnumber like ?1"),
		@NamedQuery(name = "findYourtaskuserByUsertoken", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.usertoken = ?1"),
		@NamedQuery(name = "findYourtaskuserByUsertokenContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.usertoken like ?1"),
		@NamedQuery(name = "findYourtaskuserByUsertype", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.usertype = ?1"),
		@NamedQuery(name = "findYourtaskuserByUsertypeContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.usertype like ?1"),
		@NamedQuery(name = "findYourtaskuserByUserusername", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userusername = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserusernameContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userusername like ?1"),
		@NamedQuery(name = "findYourtaskuserByUserzipcode", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userzipcode = ?1"),
		@NamedQuery(name = "findYourtaskuserByUserzipcodeContaining", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.userzipcode like ?1") })

@Table(schema = "public", name = "yourtaskuser")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Yourtaskuser")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Yourtaskuser implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "userid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer userid;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "userdateofbirth", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar userdateofbirth;
	/**
	 */

	@Column(name = "userphonenumber", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userphonenumber;
	/**
	 */

	@Column(name = "useremail", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String useremail;
	/**
	 */

	@Column(name = "userstreetnumber", length = 5, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userstreetnumber;
	/**
	 */

	@Column(name = "userzipcode", length = 10, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userzipcode;
	/**
	 */

	@Column(name = "usercity", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String usercity;
	/**
	 */

	@Column(name = "userusername", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userusername;
	/**
	 */

	@Column(name = "userpassword", length = 200, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userpassword;
	/**
	 */

	@Column(name = "usertoken", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String usertoken;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "userlastconnectiondate", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar userlastconnectiondate;
	/**
	 */

	@Column(name = "usertype", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String usertype;
	/**
	 */

	@Column(name = "useriban", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String useriban;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "roleid", referencedColumnName = "roleid", nullable = false) })
	@XmlTransient
	Role role;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Suinfo> suinfos;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Notification> notifications;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Scinfo> scinfos;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuserByUseridsc", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Order> ordersForUseridsc;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Activity> activities;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Diary> diaries;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Product> products;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Comment> comments;
	/**
	 */
	@OneToMany(mappedBy = "yourtaskuserByUseridsc", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Order> ordersForUserid;

	/**
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 */
	public Integer getUserid() {
		return this.userid;
	}

	/**
	 */
	public void setUserdateofbirth(Calendar userdateofbirth) {
		this.userdateofbirth = userdateofbirth;
	}

	/**
	 */
	public Calendar getUserdateofbirth() {
		return this.userdateofbirth;
	}

	/**
	 */
	public void setUserphonenumber(String userphonenumber) {
		this.userphonenumber = userphonenumber;
	}

	/**
	 */
	public String getUserphonenumber() {
		return this.userphonenumber;
	}

	/**
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	/**
	 */
	public String getUseremail() {
		return this.useremail;
	}

	/**
	 */
	public void setUserstreetnumber(String userstreetnumber) {
		this.userstreetnumber = userstreetnumber;
	}

	/**
	 */
	public String getUserstreetnumber() {
		return this.userstreetnumber;
	}

	/**
	 */
	public void setUserzipcode(String userzipcode) {
		this.userzipcode = userzipcode;
	}

	/**
	 */
	public String getUserzipcode() {
		return this.userzipcode;
	}

	/**
	 */
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}

	/**
	 */
	public String getUsercity() {
		return this.usercity;
	}

	/**
	 */
	public void setUserusername(String userusername) {
		this.userusername = userusername;
	}

	/**
	 */
	public String getUserusername() {
		return this.userusername;
	}

	/**
	 */
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	/**
	 */
	public String getUserpassword() {
		return this.userpassword;
	}

	/**
	 */
	public void setUsertoken(String usertoken) {
		this.usertoken = usertoken;
	}

	/**
	 */
	public String getUsertoken() {
		return this.usertoken;
	}

	/**
	 */
	public void setUserlastconnectiondate(Calendar userlastconnectiondate) {
		this.userlastconnectiondate = userlastconnectiondate;
	}

	/**
	 */
	public Calendar getUserlastconnectiondate() {
		return this.userlastconnectiondate;
	}

	/**
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	/**
	 */
	public String getUsertype() {
		return this.usertype;
	}

	/**
	 */
	public void setUseriban(String useriban) {
		this.useriban = useriban;
	}

	/**
	 */
	public String getUseriban() {
		return this.useriban;
	}

	/**
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 */
	@JsonIgnore
	public Role getRole() {
		return role;
	}

	/**
	 */
	public void setSuinfos(Set<Suinfo> suinfos) {
		this.suinfos = suinfos;
	}

	/**
	 */
	@JsonIgnore
	public Set<Suinfo> getSuinfos() {
		if (suinfos == null) {
			suinfos = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Suinfo>();
		}
		return suinfos;
	}

	/**
	 */
	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}

	/**
	 */
	@JsonIgnore
	public Set<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Notification>();
		}
		return notifications;
	}

	/**
	 */
	public void setScinfos(Set<Scinfo> scinfos) {
		this.scinfos = scinfos;
	}

	/**
	 */
	@JsonIgnore
	public Set<Scinfo> getScinfos() {
		if (scinfos == null) {
			scinfos = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Scinfo>();
		}
		return scinfos;
	}

	/**
	 */
	public void setOrdersForUseridsc(Set<Order> ordersForUseridsc) {
		this.ordersForUseridsc = ordersForUseridsc;
	}

	/**
	 */
	@JsonIgnore
	public Set<Order> getOrdersForUseridsc() {
		if (ordersForUseridsc == null) {
			ordersForUseridsc = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Order>();
		}
		return ordersForUseridsc;
	}

	/**
	 */
	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	/**
	 */
	@JsonIgnore
	public Set<Activity> getActivities() {
		if (activities == null) {
			activities = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Activity>();
		}
		return activities;
	}

	/**
	 */
	public void setDiaries(Set<Diary> diaries) {
		this.diaries = diaries;
	}

	/**
	 */
	@JsonIgnore
	public Set<Diary> getDiaries() {
		if (diaries == null) {
			diaries = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diary>();
		}
		return diaries;
	}

	/**
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	/**
	 */
	@JsonIgnore
	public Set<Product> getProducts() {
		if (products == null) {
			products = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Product>();
		}
		return products;
	}

	/**
	 */
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	/**
	 */
	@JsonIgnore
	public Set<Comment> getComments() {
		if (comments == null) {
			comments = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Comment>();
		}
		return comments;
	}

	/**
	 */
	public void setOrdersForUserid(Set<Order> ordersForUserid) {
		this.ordersForUserid = ordersForUserid;
	}

	/**
	 */
	@JsonIgnore
	public Set<Order> getOrdersForUserid() {
		if (ordersForUserid == null) {
			ordersForUserid = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Order>();
		}
		return ordersForUserid;
	}

	/**
	 */
	public Yourtaskuser() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Yourtaskuser that) {
		setUserid(that.getUserid());
		setUserdateofbirth(that.getUserdateofbirth());
		setUserphonenumber(that.getUserphonenumber());
		setUseremail(that.getUseremail());
		setUserstreetnumber(that.getUserstreetnumber());
		setUserzipcode(that.getUserzipcode());
		setUsercity(that.getUsercity());
		setUserusername(that.getUserusername());
		setUserpassword(that.getUserpassword());
		setUsertoken(that.getUsertoken());
		setUserlastconnectiondate(that.getUserlastconnectiondate());
		setUsertype(that.getUsertype());
		setUseriban(that.getUseriban());
		setRole(that.getRole());
		setSuinfos(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Suinfo>(that.getSuinfos()));
		setNotifications(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Notification>(that.getNotifications()));
		setScinfos(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Scinfo>(that.getScinfos()));
		setOrdersForUseridsc(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Order>(that.getOrdersForUseridsc()));
		setActivities(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Activity>(that.getActivities()));
		setDiaries(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diary>(that.getDiaries()));
		setProducts(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Product>(that.getProducts()));
		setComments(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Comment>(that.getComments()));
		setOrdersForUserid(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Order>(that.getOrdersForUserid()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("userid=[").append(userid).append("] ");
		buffer.append("userdateofbirth=[").append(userdateofbirth).append("] ");
		buffer.append("userphonenumber=[").append(userphonenumber).append("] ");
		buffer.append("useremail=[").append(useremail).append("] ");
		buffer.append("userstreetnumber=[").append(userstreetnumber).append("] ");
		buffer.append("userzipcode=[").append(userzipcode).append("] ");
		buffer.append("usercity=[").append(usercity).append("] ");
		buffer.append("userusername=[").append(userusername).append("] ");
		buffer.append("userpassword=[").append(userpassword).append("] ");
		buffer.append("usertoken=[").append(usertoken).append("] ");
		buffer.append("userlastconnectiondate=[").append(userlastconnectiondate).append("] ");
		buffer.append("usertype=[").append(usertype).append("] ");
		buffer.append("useriban=[").append(useriban).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((userid == null) ? 0 : userid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Yourtaskuser))
			return false;
		Yourtaskuser equalCheck = (Yourtaskuser) obj;
		if ((userid == null && equalCheck.userid != null) || (userid != null && equalCheck.userid == null))
			return false;
		if (userid != null && !userid.equals(equalCheck.userid))
			return false;
		return true;
	}
}
