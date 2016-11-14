package com.aiop.yourtask.persistence;

import java.io.Serializable;
import java.util.List;

public interface RoleResourceDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findByIdPK(RoleResourcePK entity);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();

	
	public List<RoleResource> findByRole(Role entity);

}