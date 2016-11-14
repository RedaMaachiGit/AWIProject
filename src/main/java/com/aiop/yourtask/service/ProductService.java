package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.OrderProduct;
import com.aiop.yourtask.persistence.Product;
import com.aiop.yourtask.persistence.ProductDao;
import com.aiop.yourtask.persistence.User;

public class ProductService {

	private static ProductDao productDao;

	public ProductService() {
		productDao = new ProductDao();
	}

	public void persist(Product entity) {
		productDao.openCurrentSessionwithTransaction();
		productDao.persist(entity);
		productDao.closeCurrentSessionwithTransaction();
	}

	public void update(Product entity) {
		productDao.openCurrentSessionwithTransaction();
		productDao.update(entity);
		productDao.closeCurrentSessionwithTransaction();
	}

	public Product findById(int id) {
		productDao.openCurrentSession();
		Product product = productDao.findById(id);
		productDao.closeCurrentSession();
		return product;
	}

	/*
	public void delete(int id) {
		productDao.openCurrentSessionwithTransaction();
		Product product = productDao.findById(id);
		productDao.delete(product);
		productDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Product entity) {
		productDao.openCurrentSessionwithTransaction();
		productDao.delete(entity);
		productDao.closeCurrentSessionwithTransaction();
	}

	public List<Product> findAll() {
		productDao.openCurrentSession();
		List<Product> products = productDao.findAll();
		productDao.closeCurrentSession();
		return products;
	}

	public void deleteAll() {
		productDao.openCurrentSessionwithTransaction();
		productDao.deleteAll();
		productDao.closeCurrentSessionwithTransaction();
	}

	public ProductDao productDao() {
		return productDao;
	}
	
	
	public List<Product> findByUser(User user) {
		productDao.openCurrentSession();
		List<Product> products = productDao.findByUser(user);
		productDao.closeCurrentSession();
		return products;
	}
	
	public Product findByOrderProduct(OrderProduct entity) {
		productDao.openCurrentSession();
		Product product = productDao.findByOrderProduct(entity);
		productDao.closeCurrentSession();
		return product;
	}
}
