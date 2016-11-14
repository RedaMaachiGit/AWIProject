package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class CommentDao implements CommentDaoInterface<Comment, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public CommentDao() {
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
		configuration.addAnnotatedClass(Comment.class); 
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

	public void persist(Comment entity) {
		getCurrentSession().save(entity);
	}

	public void update(Comment entity) {
		getCurrentSession().update(entity);
	}

	public Comment findById(Integer id) {
		Comment comment = (Comment) getCurrentSession().get(Comment.class, id);
		return comment; 
	}

	public void delete(Comment entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Comment> findAll() {
		List<Comment> comments = (List<Comment>) getCurrentSession().createQuery("from Comment").list();
		return comments;
	}

	public void deleteAll() {
		List<Comment> entityList = findAll();
		for (Comment entity : entityList) {
			delete(entity);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Comment> findByUser(User user) {
		int userId = user.getUserId();
		List<Comment> comments = (List<Comment>) getCurrentSession().createQuery("from Comment where userId = " + userId).list();
		return comments; 
	}
	
	@SuppressWarnings("unchecked")
	public List<Comment> findByActivity(Activity activity) {
		int activityId = activity.getActivityId();
		List<Comment> comments = (List<Comment>) getCurrentSession().createQuery("from Comment where activityId = " + activityId).list();
		return comments; 
	}
	
}