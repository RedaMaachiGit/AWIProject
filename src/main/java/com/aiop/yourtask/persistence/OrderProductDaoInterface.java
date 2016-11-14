package com.aiop.yourtask.persistence;

import java.io.Serializable;
import java.util.List;

public interface OrderProductDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findByIdPK(OrderProductPK entity);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();
	
	public List<OrderProduct> findByOrder(Order entity);

}