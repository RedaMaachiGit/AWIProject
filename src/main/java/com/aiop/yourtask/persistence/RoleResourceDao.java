package com.aiop.yourtask.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class RoleResourceDao implements RoleResourceDaoInterface<RoleResource, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;


	public RoleResourceDao() {
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
		configuration.addAnnotatedClass(RoleResource.class); 
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

	public void persist(RoleResource entity) {
		getCurrentSession().save(entity);
	}

	public void update(RoleResource entity) {
		getCurrentSession().update(entity);
	}

	public RoleResource findByIdPK(RoleResourcePK entityPK) {
		RoleResource roleresource = (RoleResource) getCurrentSession().get(RoleResource.class, entityPK);
		return roleresource; 
	}

	public void delete(RoleResource entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<RoleResource> findAll() {
		List<RoleResource> roleresources = (List<RoleResource>) getCurrentSession().createQuery("from RoleResource").list();
		return roleresources;
	}

	public void deleteAll() {
		List<RoleResource> entityList = findAll();
		for (RoleResource entity : entityList) {
			delete(entity);
		}
	}
	
	/* MARCHE PAS A VOIR
	public List<RoleResource> findByRole(Role entity) {
		int roleresourceId = entity.getRoleId();
		List<RoleResource> roleresources = (List<RoleResource>) getCurrentSession().createQuery("from RoleResource where roleResourceId = " + roleresourceId).list();
		return roleresources; 
	}*/

	public List<RoleResource> findByRole(Role entity) {
		int roleresourceId = entity.getRoleId();
		List<RoleResource> allroleresources = (List<RoleResource>) getCurrentSession().createQuery("from RoleResource").list();
		
		List<RoleResource> roleresources = new ArrayList<>();
		for(RoleResource item : allroleresources){
			if(item.getRoleResourcePK().getRoleId() == roleresourceId) {
				roleresources.add(item);
			}
		}
		return roleresources;
	}
	
}