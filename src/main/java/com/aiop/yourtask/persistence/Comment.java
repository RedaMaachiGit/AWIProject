package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="commentId")
	private int commentId;

	@Column(name="commentContent")
	private String commentContent;
	
	@Column(name="commentDate")
	private Date commentDate;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="activityId")
	private int activityId;
		
	public Comment() {}

	public Comment(int commentId, String commentContent, Date commentDate, int userId, int activityId) {
		this.commentId = commentId;
		this.commentContent = commentContent;
		this.commentDate = commentDate;
		this.userId = userId;
		this.activityId = activityId;
	}

	public Comment(String commentContent, Date commentDate, int userId, int activityId) {
		this.commentContent = commentContent;
		this.commentDate = commentDate;
		this.userId = userId;
		this.activityId = activityId;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + ", commentDate=" + commentDate
				+ ", userId=" + userId + ", activityId=" + activityId + "]";
	}
	
	
}