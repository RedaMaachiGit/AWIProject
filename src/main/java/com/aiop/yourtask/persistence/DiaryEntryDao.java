package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DiaryEntryDao implements DiaryEntryDaoInterface<DiaryEntry, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public DiaryEntryDao() {
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
		configuration.addAnnotatedClass(DiaryEntry.class); 
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

	public void persist(DiaryEntry entity) {
		getCurrentSession().save(entity);
	}

	public void update(DiaryEntry entity) {
		getCurrentSession().update(entity);
	}

	public DiaryEntry findById(Integer id) {
		DiaryEntry diaryentry = (DiaryEntry) getCurrentSession().get(DiaryEntry.class, id);
		return diaryentry; 
	}

	public void delete(DiaryEntry entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<DiaryEntry> findAll() {
		List<DiaryEntry> diaryentries = (List<DiaryEntry>) getCurrentSession().createQuery("from DiaryEntry").list();
		return diaryentries;
	}

	public void deleteAll() {
		List<DiaryEntry> entityList = findAll();
		for (DiaryEntry entity : entityList) {
			delete(entity);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<DiaryEntry> findByDiary(Diary diary) {
		int diaryId = diary.getDiaryId();
		List<DiaryEntry> diaryentries = (List<DiaryEntry>) getCurrentSession().createQuery("from DiaryEntry where diaryId = " + diaryId).list();
		return diaryentries; 
	}
	
}