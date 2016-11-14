package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class GoalDao implements GoalDaoInterface<Goal, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public GoalDao() {
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
		configuration.addAnnotatedClass(Goal.class); 
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

	public void persist(Goal entity) {
		getCurrentSession().save(entity);
	}

	public void update(Goal entity) {
		getCurrentSession().update(entity);
	}

	public Goal findById(Integer id) {
		Goal goal = (Goal) getCurrentSession().get(Goal.class, id);
		return goal; 
	}

	public void delete(Goal entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Goal> findAll() {
		List<Goal> goals = (List<Goal>) getCurrentSession().createQuery("from Goal").list();
		return goals;
	}

	public void deleteAll() {
		List<Goal> entityList = findAll();
		for (Goal entity : entityList) {
			delete(entity);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Goal> findByDiary(Diary diary) {
		int diaryId = diary.getDiaryId();
		List<Goal> goals = (List<Goal>) getCurrentSession().createQuery("from Goal where diaryId = " + diaryId).list();
		return goals; 
	}
	
}