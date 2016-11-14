package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ActivityDao implements ActivityDaoInterface<Activity, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public ActivityDao() {
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
		configuration.addAnnotatedClass(Activity.class); 
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

	public void persist(Activity entity) {
		getCurrentSession().save(entity);
	}

	public void update(Activity entity) {
		getCurrentSession().update(entity);
	}

	public Activity findById(Integer id) {
		Activity activity = (Activity) getCurrentSession().get(Activity.class, id);
		return activity; 
	}

	public void delete(Activity entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Activity> findAll() {
		List<Activity> activities = (List<Activity>) getCurrentSession().createQuery("from Activity").list();
		return activities;
	}

	public void deleteAll() {
		List<Activity> entityList = findAll();
		for (Activity entity : entityList) {
			delete(entity);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Activity> findByUser(User user) {
		int userId = user.getUserId();
		List<Activity> activities = (List<Activity>) getCurrentSession().createQuery("from Activity where userId = " + userId).list();
		return activities; 
	}
}