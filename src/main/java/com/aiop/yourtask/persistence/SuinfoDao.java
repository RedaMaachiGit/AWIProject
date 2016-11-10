package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SuinfoDao implements SuinfoDaoInterface<Suinfo, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public SuinfoDao() {
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
		configuration.addAnnotatedClass(Suinfo.class); 
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

	public void persist(Suinfo entity) {
		getCurrentSession().save(entity);
	}

	public void update(Suinfo entity) {
		getCurrentSession().update(entity);
	}

	public Suinfo findById(Integer id) {
		Suinfo suinfo = (Suinfo) getCurrentSession().get(Suinfo.class, id);
		return suinfo; 
	}

	public void delete(Suinfo entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Suinfo> findAll() {
		List<Suinfo> suinfos = (List<Suinfo>) getCurrentSession().createQuery("from Suinfo").list();
		return suinfos;
	}

	public void deleteAll() {
		List<Suinfo> entityList = findAll();
		for (Suinfo entity : entityList) {
			delete(entity);
		}
	}
	
	public Suinfo findByUser(User user) {
		int suinfoId = user.getUserId();
		Suinfo suinfo = findById(suinfoId);
		return suinfo; 
	}
	
	
}