/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Yourtaskuser;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Class used to test the basic Data Store Functionality.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class YourtaskuserDAOTest {
	
	/** The DAO being tested, injected by Spring. */
	private YourtaskuserDAO dataStore;

	/**
	 * Instantiates a new YourtaskuserDAOTest.
	 *
	 */
	public YourtaskuserDAOTest() {
	}

	/**
	* Method to test Yourtaskuser domain object.
	*
	*/
	@Rollback(false)
	@Test
	public void Yourtaskuser() {
		Yourtaskuser instance = new Yourtaskuser();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested.
	 *
	 * @param dataStore the new data store
	 */
	@Autowired
	public void setDataStore(YourtaskuserDAO dataStore) {
		this.dataStore = dataStore;
	}
}
