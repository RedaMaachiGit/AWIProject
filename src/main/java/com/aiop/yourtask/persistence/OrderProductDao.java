package com.aiop.yourtask.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class OrderProductDao implements OrderProductDaoInterface<OrderProduct, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public OrderProductDao() {
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(OrderProduct.class); 
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}
	
	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void persist(OrderProduct entity) {
		getCurrentSession().save(entity);
	}

	public void update(OrderProduct entity) {
		getCurrentSession().update(entity);
	}

	public OrderProduct findByIdPK(OrderProductPK entityPK) {
		OrderProduct orderproduct = (OrderProduct) getCurrentSession().get(OrderProduct.class, entityPK);
		return orderproduct; 
	}

	public void delete(OrderProduct entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<OrderProduct> findAll() {
		List<OrderProduct> orderproducts = (List<OrderProduct>) getCurrentSession().createQuery("from OrderProduct").list();
		return orderproducts;
	}

	public void deleteAll() {
		List<OrderProduct> entityList = findAll();
		for (OrderProduct entity : entityList) {
			delete(entity);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<OrderProduct> findByOrder(Order entity) {
		int orderproductId = entity.getOrderId();
		List<OrderProduct> allorderproducts = (List<OrderProduct>) getCurrentSession().createQuery("from OrderProduct").list();
		
		List<OrderProduct> orderproducts = new ArrayList<>();
		for(OrderProduct item : allorderproducts){
			if(item.getOrderProductPK().getOrderId() == orderproductId) {
				orderproducts.add(item);
			}
		}
		return orderproducts;
	}
}