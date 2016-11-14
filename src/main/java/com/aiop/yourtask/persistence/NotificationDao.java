package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class NotificationDao implements NotificationDaoInterface<Notification, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public NotificationDao() {
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
		configuration.addAnnotatedClass(Notification.class); 
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

	public void persist(Notification entity) {
		getCurrentSession().save(entity);
	}

	public void update(Notification entity) {
		getCurrentSession().update(entity);
	}

	public Notification findById(Integer id) {
		Notification notification = (Notification) getCurrentSession().get(Notification.class, id);
		return notification; 
	}

	public void delete(Notification entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Notification> findAll() {
		List<Notification> notifications = (List<Notification>) getCurrentSession().createQuery("from Notification").list();
		return notifications;
	}

	public void deleteAll() {
		List<Notification> entityList = findAll();
		for (Notification entity : entityList) {
			delete(entity);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Notification> findByUser(User user) {
		int userId = user.getUserId();
		List<Notification> notifications = (List<Notification>) getCurrentSession().createQuery("from Notification where userId = " + userId).list();
		return notifications; 
	}
}