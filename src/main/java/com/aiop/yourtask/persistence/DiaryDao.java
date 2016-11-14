package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DiaryDao implements DiaryDaoInterface<Diary, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public DiaryDao() {
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
		configuration.addAnnotatedClass(Diary.class); 
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

	public void persist(Diary entity) {
		getCurrentSession().save(entity);
	}

	public void update(Diary entity) {
		getCurrentSession().update(entity);
	}

	public Diary findById(Integer id) {
		Diary diary = (Diary) getCurrentSession().get(Diary.class, id);
		return diary; 
	}

	public void delete(Diary entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Diary> findAll() {
		List<Diary> diaries = (List<Diary>) getCurrentSession().createQuery("from Diary").list();
		return diaries;
	}

	public void deleteAll() {
		List<Diary> entityList = findAll();
		for (Diary entity : entityList) {
			delete(entity);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Diary> findByUser(User user) {
		int userId = user.getUserId();
		List<Diary> diaries = (List<Diary>) getCurrentSession().createQuery("from Diary where userId = " + userId).list();
		return diaries; 
	}
	
	@SuppressWarnings("unchecked")
	public List<Diary> findByActivity(Activity activity) {
		int activityId = activity.getActivityId();
		List<Diary> diaries = (List<Diary>) getCurrentSession().createQuery("from Diary where activityId = " + activityId).list();
		return diaries; 
	}
	
}