
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

/**
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
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "commentid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer commentid;
	/**
	 */

	@Column(name = "commentcontent", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String commentcontent;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "commentdate", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar commentdate;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "activityid", referencedColumnName = "activityid", nullable = false) })
	@XmlTransient
	Activity activity;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;

	/**
	 */
	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	/**
	 */
	public Integer getCommentid() {
		return this.commentid;
	}

	/**
	 */
	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}

	/**
	 */
	public String getCommentcontent() {
		return this.commentcontent;
	}

	/**
	 */
	public void setCommentdate(Calendar commentdate) {
		this.commentdate = commentdate;
	}

	/**
	 */
	public Calendar getCommentdate() {
		return this.commentdate;
	}

	/**
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	/**
	 */
	@JsonIgnore
	public Activity getActivity() {
		return activity;
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
	public Comment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("commentid=[").append(commentid).append("] ");
		buffer.append("commentcontent=[").append(commentcontent).append("] ");
		buffer.append("commentdate=[").append(commentdate).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((commentid == null) ? 0 : commentid.hashCode()));
		return result;
	}

	/**
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
