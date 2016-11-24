/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Comment.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllComments", query = "select myComment from Comment myComment"),
		@NamedQuery(name = "findCommentByCommentcontent", query = "select myComment from Comment myComment where myComment.commentcontent = ?1"),
		@NamedQuery(name = "findCommentByCommentcontentContaining", query = "select myComment from Comment myComment where myComment.commentcontent like ?1"),
		@NamedQuery(name = "findCommentByCommentdate", query = "select myComment from Comment myComment where myComment.commentdate = ?1"),
		@NamedQuery(name = "findCommentByCommentdateAfter", query = "select myComment from Comment myComment where myComment.commentdate > ?1"),
		@NamedQuery(name = "findCommentByCommentdateBefore", query = "select myComment from Comment myComment where myComment.commentdate < ?1"),
		@NamedQuery(name = "findCommentByCommentid", query = "select myComment from Comment myComment where myComment.commentid = ?1"),
		@NamedQuery(name = "findCommentByPrimaryKey", query = "select myComment from Comment myComment where myComment.commentid = ?1") })

@Table(schema = "public", name = "comment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Comment")

public class Comment implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The commentid. */

	@Column(name = "commentid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer commentid;
	
	/** The commentcontent. */

	@Column(name = "commentcontent", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String commentcontent;
	
	/** The commentdate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "commentdate", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar commentdate;

	/** The activity. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "activityid", referencedColumnName = "activityid", nullable = false) })
	@XmlTransient
	Activity activity;
	
	/** The yourtaskuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;

	/**
	 * Sets the commentid.
	 *
	 * @param commentid the new commentid
	 */
	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	/**
	 * Gets the commentid.
	 *
	 * @return the commentid
	 */
	public Integer getCommentid() {
		return this.commentid;
	}

	/**
	 * Sets the commentcontent.
	 *
	 * @param commentcontent the new commentcontent
	 */
	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}

	/**
	 * Gets the commentcontent.
	 *
	 * @return the commentcontent
	 */
	public String getCommentcontent() {
		return this.commentcontent;
	}

	/**
	 * Sets the commentdate.
	 *
	 * @param commentdate the new commentdate
	 */
	public void setCommentdate(Calendar commentdate) {
		this.commentdate = commentdate;
	}

	/**
	 * Gets the commentdate.
	 *
	 * @return the commentdate
	 */
	public Calendar getCommentdate() {
		return this.commentdate;
	}

	/**
	 * Sets the activity.
	 *
	 * @param activity the new activity
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	/**
	 * Gets the activity.
	 *
	 * @return the activity
	 */
	@JsonIgnore
	public Activity getActivity() {
		return activity;
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
	 * Instantiates a new comment.
	 */
	public Comment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Comment that) {
		setCommentid(that.getCommentid());
		setCommentcontent(that.getCommentcontent());
		setCommentdate(that.getCommentdate());
		setActivity(that.getActivity());
		setYourtaskuser(that.getYourtaskuser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("commentid=[").append(commentid).append("] ");
		buffer.append("commentcontent=[").append(commentcontent).append("] ");
		buffer.append("commentdate=[").append(commentdate).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((commentid == null) ? 0 : commentid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Comment))
			return false;
		Comment equalCheck = (Comment) obj;
		if ((commentid == null && equalCheck.commentid != null) || (commentid != null && equalCheck.commentid == null))
			return false;
		if (commentid != null && !commentid.equals(equalCheck.commentid))
			return false;
		return true;
	}
}
