package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ScinfoDao implements ScinfoDaoInterface<Scinfo, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public ScinfoDao() {
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
		configuration.addAnnotatedClass(Scinfo.class); 
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

	public void persist(Scinfo entity) {
		getCurrentSession().save(entity);
	}

	public void update(Scinfo entity) {
		getCurrentSession().update(entity);
	}

	public Scinfo findById(Integer id) {
		Scinfo scinfo = (Scinfo) getCurrentSession().get(Scinfo.class, id);
		return scinfo; 
	}

	public void delete(Scinfo entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Scinfo> findAll() {
		List<Scinfo> scinfos = (List<Scinfo>) getCurrentSession().createQuery("from Scinfo").list();
		return scinfos;
	}

	public void deleteAll() {
		List<Scinfo> entityList = findAll();
		for (Scinfo entity : entityList) {
			delete(entity);
		}
	}
	
	public Scinfo findByUser(User user) {
		int scinfoId = user.getUserId();
		Scinfo scinfo = findById(scinfoId);
		return scinfo; 
	}
	
	
}