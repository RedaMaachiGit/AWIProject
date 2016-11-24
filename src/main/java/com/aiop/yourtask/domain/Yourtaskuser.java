/*
 * 
 */

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

// TODO: Auto-generated Javadoc
/**
 * The Class Yourtaskuser.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllYourtaskusers", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser"),
		@NamedQuery(name = "findAllCompanys", query = "select myYourtaskuser from Yourtaskuser myYourtaskuser where myYourtaskuser.usertype = 'sc'"),
		//TODO correct query maybe not COMPANY the keyword
		//@NamedQuery(name = "findCompanyBySIRET", query = "SELECT myYourtaskuser FROM Yourtaskuser myYourtaskuser JOIN myYourtaskuser.scinfo info WHERE info.scinfosiret = ?1"),
		@NamedQuery(name = "findCompanyBySIRET", query = "SELECT user FROM Scinfo myScinfo JOIN myScinfo.yourtaskuser user WHERE myScinfo.scinfosiret = ?1"),
		//select o from Employee o where o.departments.departmentId is null or o.departments.departmentId=:departmentId
		//END TO DO
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
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The userid. */

	@Column(name = "userid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer userid;
	
	/** The userdateofbirth. */
	@Temporal(TemporalType.DATE)
	@Column(name = "userdateofbirth", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar userdateofbirth;
	
	/** The userphonenumber. */

	@Column(name = "userphonenumber", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userphonenumber;
	
	/** The useremail. */

	@Column(name = "useremail", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String useremail;
	
	/** The userstreetnumber. */

	@Column(name = "userstreetnumber", length = 5, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userstreetnumber;
	
	/** The userzipcode. */

	@Column(name = "userzipcode", length = 10, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userzipcode;
	
	/** The usercity. */

	@Column(name = "usercity", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String usercity;
	
	/** The userusername. */

	@Column(name = "userusername", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userusername;
	
	/** The userpassword. */

	@Column(name = "userpassword", length = 200, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userpassword;
	
	/** The usertoken. */

	@Column(name = "usertoken", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String usertoken;
	
	/** The userlastconnectiondate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "userlastconnectiondate", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar userlastconnectiondate;
	
	/** The usertype. */

	@Column(name = "usertype", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String usertype;
	
	/** The useriban. */

	@Column(name = "useriban", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String useriban;

	/** The role. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "roleid", referencedColumnName = "roleid", nullable = false) })
	@XmlTransient
	Role role;
	
	/** The suinfos. */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Suinfo> suinfos;
	
	/** The notifications. */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Notification> notifications;
	
	/** The scinfos. */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Scinfo> scinfos;
	
	/** The orders for useridsc. */
	@OneToMany(mappedBy = "yourtaskuserByUseridsc", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Order> ordersForUseridsc;
	
	/** The activities. */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Activity> activities;
	
	/** The diaries. */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Diary> diaries;
	
	/** The products. */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Product> products;
	
	/** The comments. */
	@OneToMany(mappedBy = "yourtaskuser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Comment> comments;
	
	/** The orders for userid. */
	@OneToMany(mappedBy = "yourtaskuserByUseridsc", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Order> ordersForUserid;

	/**
	 * Sets the userid.
	 *
	 * @param userid the new userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * Gets the userid.
	 *
	 * @return the userid
	 */
	public Integer getUserid() {
		return this.userid;
	}

	/**
	 * Sets the userdateofbirth.
	 *
	 * @param userdateofbirth the new userdateofbirth
	 */
	public void setUserdateofbirth(Calendar userdateofbirth) {
		this.userdateofbirth = userdateofbirth;
	}

	/**
	 * Gets the userdateofbirth.
	 *
	 * @return the userdateofbirth
	 */
	public Calendar getUserdateofbirth() {
		return this.userdateofbirth;
	}

	/**
	 * Sets the userphonenumber.
	 *
	 * @param userphonenumber the new userphonenumber
	 */
	public void setUserphonenumber(String userphonenumber) {
		this.userphonenumber = userphonenumber;
	}

	/**
	 * Gets the userphonenumber.
	 *
	 * @return the userphonenumber
	 */
	public String getUserphonenumber() {
		return this.userphonenumber;
	}

	/**
	 * Sets the useremail.
	 *
	 * @param useremail the new useremail
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	/**
	 * Gets the useremail.
	 *
	 * @return the useremail
	 */
	public String getUseremail() {
		return this.useremail;
	}

	/**
	 * Sets the userstreetnumber.
	 *
	 * @param userstreetnumber the new userstreetnumber
	 */
	public void setUserstreetnumber(String userstreetnumber) {
		this.userstreetnumber = userstreetnumber;
	}

	/**
	 * Gets the userstreetnumber.
	 *
	 * @return the userstreetnumber
	 */
	public String getUserstreetnumber() {
		return this.userstreetnumber;
	}

	/**
	 * Sets the userzipcode.
	 *
	 * @param userzipcode the new userzipcode
	 */
	public void setUserzipcode(String userzipcode) {
		this.userzipcode = userzipcode;
	}

	/**
	 * Gets the userzipcode.
	 *
	 * @return the userzipcode
	 */
	public String getUserzipcode() {
		return this.userzipcode;
	}

	/**
	 * Sets the usercity.
	 *
	 * @param usercity the new usercity
	 */
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}

	/**
	 * Gets the usercity.
	 *
	 * @return the usercity
	 */
	public String getUsercity() {
		return this.usercity;
	}

	/**
	 * Sets the userusername.
	 *
	 * @param userusername the new userusername
	 */
	public void setUserusername(String userusername) {
		this.userusername = userusername;
	}

	/**
	 * Gets the userusername.
	 *
	 * @return the userusername
	 */
	public String getUserusername() {
		return this.userusername;
	}

	/**
	 * Sets the userpassword.
	 *
	 * @param userpassword the new userpassword
	 */
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	/**
	 * Gets the userpassword.
	 *
	 * @return the userpassword
	 */
	public String getUserpassword() {
		return this.userpassword;
	}

	/**
	 * Sets the usertoken.
	 *
	 * @param usertoken the new usertoken
	 */
	public void setUsertoken(String usertoken) {
		this.usertoken = usertoken;
	}

	/**
	 * Gets the usertoken.
	 *
	 * @return the usertoken
	 */
	public String getUsertoken() {
		return this.usertoken;
	}

	/**
	 * Sets the userlastconnectiondate.
	 *
	 * @param userlastconnectiondate the new userlastconnectiondate
	 */
	public void setUserlastconnectiondate(Calendar userlastconnectiondate) {
		this.userlastconnectiondate = userlastconnectiondate;
	}

	/**
	 * Gets the userlastconnectiondate.
	 *
	 * @return the userlastconnectiondate
	 */
	public Calendar getUserlastconnectiondate() {
		return this.userlastconnectiondate;
	}

	/**
	 * Sets the usertype.
	 *
	 * @param usertype the new usertype
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	/**
	 * Gets the usertype.
	 *
	 * @return the usertype
	 */
	public String getUsertype() {
		return this.usertype;
	}

	/**
	 * Sets the useriban.
	 *
	 * @param useriban the new useriban
	 */
	public void setUseriban(String useriban) {
		this.useriban = useriban;
	}

	/**
	 * Gets the useriban.
	 *
	 * @return the useriban
	 */
	public String getUseriban() {
		return this.useriban;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	@JsonIgnore
	public Role getRole() {
		return role;
	}

	/**
	 * Sets the suinfos.
	 *
	 * @param suinfos the new suinfos
	 */
	public void setSuinfos(Set<Suinfo> suinfos) {
		this.suinfos = suinfos;
	}

	/**
	 * Gets the suinfos.
	 *
	 * @return the suinfos
	 */
	@JsonIgnore
	public Set<Suinfo> getSuinfos() {
		if (suinfos == null) {
			suinfos = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Suinfo>();
		}
		return suinfos;
	}

	/**
	 * Sets the notifications.
	 *
	 * @param notifications the new notifications
	 */
	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}

	/**
	 * Gets the notifications.
	 *
	 * @return the notifications
	 */
	@JsonIgnore
	public Set<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Notification>();
		}
		return notifications;
	}

	/**
	 * Sets the scinfos.
	 *
	 * @param scinfos the new scinfos
	 */
	public void setScinfos(Set<Scinfo> scinfos) {
		this.scinfos = scinfos;
	}

	/**
	 * Gets the scinfos.
	 *
	 * @return the scinfos
	 */
	@JsonIgnore
	public Set<Scinfo> getScinfos() {
		if (scinfos == null) {
			scinfos = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Scinfo>();
		}
		return scinfos;
	}

	/**
	 * Sets the orders for useridsc.
	 *
	 * @param ordersForUseridsc the new orders for useridsc
	 */
	public void setOrdersForUseridsc(Set<Order> ordersForUseridsc) {
		this.ordersForUseridsc = ordersForUseridsc;
	}

	/**
	 * Gets the orders for useridsc.
	 *
	 * @return the orders for useridsc
	 */
	@JsonIgnore
	public Set<Order> getOrdersForUseridsc() {
		if (ordersForUseridsc == null) {
			ordersForUseridsc = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Order>();
		}
		return ordersForUseridsc;
	}

	/**
	 * Sets the activities.
	 *
	 * @param activities the new activities
	 */
	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	/**
	 * Gets the activities.
	 *
	 * @return the activities
	 */
	@JsonIgnore
	public Set<Activity> getActivities() {
		if (activities == null) {
			activities = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Activity>();
		}
		return activities;
	}

	/**
	 * Sets the diaries.
	 *
	 * @param diaries the new diaries
	 */
	public void setDiaries(Set<Diary> diaries) {
		this.diaries = diaries;
	}

	/**
	 * Gets the diaries.
	 *
	 * @return the diaries
	 */
	@JsonIgnore
	public Set<Diary> getDiaries() {
		if (diaries == null) {
			diaries = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diary>();
		}
		return diaries;
	}

	/**
	 * Sets the products.
	 *
	 * @param products the new products
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	@JsonIgnore
	public Set<Product> getProducts() {
		if (products == null) {
			products = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Product>();
		}
		return products;
	}

	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	@JsonIgnore
	public Set<Comment> getComments() {
		if (comments == null) {
			comments = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Comment>();
		}
		return comments;
	}

	/**
	 * Sets the orders for userid.
	 *
	 * @param ordersForUserid the new orders for userid
	 */
	public void setOrdersForUserid(Set<Order> ordersForUserid) {
		this.ordersForUserid = ordersForUserid;
	}

	/**
	 * Gets the orders for userid.
	 *
	 * @return the orders for userid
	 */
	@JsonIgnore
	public Set<Order> getOrdersForUserid() {
		if (ordersForUserid == null) {
			ordersForUserid = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Order>();
		}
		return ordersForUserid;
	}

	/**
	 * Instantiates a new yourtaskuser.
	 */
	public Yourtaskuser() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
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
	 * @return the string
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((userid == null) ? 0 : userid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
