package com.aiop.yourtask.service;

import java.util.List;

import com.aiop.yourtask.persistence.Order;
import com.aiop.yourtask.persistence.OrderProduct;
import com.aiop.yourtask.persistence.OrderProductDao;
import com.aiop.yourtask.persistence.OrderProductPK;

public class OrderProductService {

	private static OrderProductDao orderproductDao;

	public OrderProductService() {
		orderproductDao = new OrderProductDao();
	}

	public void persist(OrderProduct entity) {
		orderproductDao.openCurrentSessionwithTransaction();
		orderproductDao.persist(entity);
		orderproductDao.closeCurrentSessionwithTransaction();
	}

	public void update(OrderProduct entity) {
		orderproductDao.openCurrentSessionwithTransaction();
		orderproductDao.update(entity);
		orderproductDao.closeCurrentSessionwithTransaction();
	}

	public OrderProduct findByIdPK(OrderProductPK entityPK) {
		orderproductDao.openCurrentSession();
		OrderProduct orderproduct = orderproductDao.findByIdPK(entityPK);
		orderproductDao.closeCurrentSession();
		return orderproduct;
	}

	/*
	public void delete(int id) {
		orderproductDao.openCurrentSessionwithTransaction();
		OrderProduct orderproduct = orderproductDao.findById(id);
		orderproductDao.delete(orderproduct);
		orderproductDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(OrderProduct entity) {
		orderproductDao.openCurrentSessionwithTransaction();
		orderproductDao.delete(entity);
		orderproductDao.closeCurrentSessionwithTransaction();
	}

	public List<OrderProduct> findAll() {
		orderproductDao.openCurrentSession();
		List<OrderProduct> orderproducts = orderproductDao.findAll();
		orderproductDao.closeCurrentSession();
		return orderproducts;
	}

	public void deleteAll() {
		orderproductDao.openCurrentSessionwithTransaction();
		orderproductDao.deleteAll();
		orderproductDao.closeCurrentSessionwithTransaction();
	}

	public OrderProductDao orderproductDao() {
		return orderproductDao;
	}
	

	public List<OrderProduct> findByOrder(Order entity) {
		orderproductDao.openCurrentSession();
		List<OrderProduct> orderproducts = orderproductDao.findByOrder(entity);
		orderproductDao.closeCurrentSession();
		return orderproducts;
	}
	
	
}
