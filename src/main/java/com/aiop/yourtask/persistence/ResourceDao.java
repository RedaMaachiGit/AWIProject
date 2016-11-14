package com.aiop.yourtask.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ResourceDao implements ResourceDaoInterface<Resource, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public ResourceDao() {
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
		configuration.addAnnotatedClass(Resource.class); 
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

	public void persist(Resource entity) {
		getCurrentSession().save(entity);
	}

	public void update(Resource entity) {
		getCurrentSession().update(entity);
	}

	public Resource findById(Integer id) {
		Resource resource = (Resource) getCurrentSession().get(Resource.class, id);
		return resource; 
	}

	public void delete(Resource entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Resource> findAll() {
		List<Resource> resources = (List<Resource>) getCurrentSession().createQuery("from Resource").list();
		return resources;
	}

	public void deleteAll() {
		List<Resource> entityList = findAll();
		for (Resource entity : entityList) {
			delete(entity);
		}
	}
	
	
	public Resource findByRoleResource(RoleResource entity) {
		int resourceId = entity.getRoleResourcePK().getResourceId();
		Resource resource = (Resource) getCurrentSession().get(Resource.class, resourceId);
		return resource; 
	}
	
	
}