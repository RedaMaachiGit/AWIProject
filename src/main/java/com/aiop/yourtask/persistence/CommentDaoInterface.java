package com.aiop.yourtask.persistence;

import java.io.Serializable;
import java.util.List;

public interface CommentDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();
	
	public List<T> findByUser(User user);
	
	public List<T> findByActivity(Activity activity);
	
}