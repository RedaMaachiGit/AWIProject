package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Activity;
import com.aiop.yourtask.persistence.Comment;
import com.aiop.yourtask.persistence.CommentDao;
import com.aiop.yourtask.persistence.User;

public class CommentService {

	private static CommentDao commentDao;

	public CommentService() {
		commentDao = new CommentDao();
	}

	public void persist(Comment entity) {
		commentDao.openCurrentSessionwithTransaction();
		commentDao.persist(entity);
		commentDao.closeCurrentSessionwithTransaction();
	}

	public void update(Comment entity) {
		commentDao.openCurrentSessionwithTransaction();
		commentDao.update(entity);
		commentDao.closeCurrentSessionwithTransaction();
	}

	public Comment findById(int id) {
		commentDao.openCurrentSession();
		Comment comment = commentDao.findById(id);
		commentDao.closeCurrentSession();
		return comment;
	}

	/*
	public void delete(int id) {
		commentDao.openCurrentSessionwithTransaction();
		Comment comment = commentDao.findById(id);
		commentDao.delete(comment);
		commentDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Comment entity) {
		commentDao.openCurrentSessionwithTransaction();
		commentDao.delete(entity);
		commentDao.closeCurrentSessionwithTransaction();
	}

	public List<Comment> findAll() {
		commentDao.openCurrentSession();
		List<Comment> comments = commentDao.findAll();
		commentDao.closeCurrentSession();
		return comments;
	}

	public void deleteAll() {
		commentDao.openCurrentSessionwithTransaction();
		commentDao.deleteAll();
		commentDao.closeCurrentSessionwithTransaction();
	}

	public CommentDao commentDao() {
		return commentDao;
	}
	
	
	public List<Comment> findByUser(User user) {
		commentDao.openCurrentSession();
		List<Comment> comments = commentDao.findByUser(user);
		commentDao.closeCurrentSession();
		return comments;
	}

	public List<Comment> findByActivity(Activity activity) {
		commentDao.openCurrentSession();
		List<Comment> comments = commentDao.findByActivity(activity);
		commentDao.closeCurrentSession();
		return comments;
	}
	
}
