package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DiaryResourceDao implements DiaryResourceDaoInterface<DiaryResource, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public DiaryResourceDao() {
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
		configuration.addAnnotatedClass(DiaryResource.class); 
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

	public void persist(DiaryResource entity) {
		getCurrentSession().save(entity);
	}

	public void update(DiaryResource entity) {
		getCurrentSession().update(entity);
	}

	public DiaryResource findById(Integer id) {
		DiaryResource diaryresource = (DiaryResource) getCurrentSession().get(DiaryResource.class, id);
		return diaryresource; 
	}

	public void delete(DiaryResource entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<DiaryResource> findAll() {
		List<DiaryResource> diaryresources = (List<DiaryResource>) getCurrentSession().createQuery("from DiaryResource").list();
		return diaryresources;
	}

	public void deleteAll() {
		List<DiaryResource> entityList = findAll();
		for (DiaryResource entity : entityList) {
			delete(entity);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<DiaryResource> findByDiaryEntry(DiaryEntry diaryEntry) {
		int diaryEntryId = diaryEntry.getDiaryEntryId();
		List<DiaryResource> diaryresources = (List<DiaryResource>) getCurrentSession().createQuery("from DiaryResource where diaryEntryId = " + diaryEntryId).list();
		return diaryresources; 
	}
	
}