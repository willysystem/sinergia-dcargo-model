package com.sinergia.dcargo.model;

import com.sinergia.dcargo.util.MD5;


/**
 * @generated
 */
public class PersonaPersistentTest extends junit.framework.TestCase {
	/**
	 * @generated
	 */
	private com.sinergia.dcargo.util.HibernateHelper persistenceHelper;

	/**
	 * @generated
	 */
	public User usuario;

	/**
	 * @generated
	 */
	public User user;

	/**
	 * @generated
	 */
	public User user1;

	/**
	 * @generated
	 */
	public User user2;

	/**
	 * @generated
	 */
	public User user3;

	/**
	 * @generated
	 */
	public User user4;

	/**
	 * @generated
	 */
	public User user5;

	/**
	 * @generated
	 */
	public User user6;

	/**
	 * @generated
	 */
	public PersonaPersistentTest() {
		persistenceHelper = com.sinergia.dcargo.util.HibernateHelper
				.getInstance();
	}

	/**
	 * @generated
	 */
	private void initObjects() {
		javax.persistence.EntityManager entityManager = persistenceHelper
				.getEntityManager();
		javax.persistence.EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		usuario = new com.sinergia.dcargo.model.User();
		user = new com.sinergia.dcargo.model.User();
		user1 = new com.sinergia.dcargo.model.User();
		user2 = new com.sinergia.dcargo.model.User();
		user3 = new com.sinergia.dcargo.model.User();
		user4 = new com.sinergia.dcargo.model.User();
		user5 = new com.sinergia.dcargo.model.User();
		user6 = new com.sinergia.dcargo.model.User();
		usuario.setUser("900009");
		usuario.setPassword(MD5.md5("EPLACER"));
		usuario.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		usuario.setActive(true);
		usuario.setAdministrator(true);
		usuario.setSurnames("PLACER ROSSENDI");
		usuario.setNames("DAVID");
		user.setUser("100004");
		user.setPassword(MD5.md5("EPLACER"));
		user.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		user.setActive(true);
		user.setAdministrator(true);
		user.setSurnames("ANTEZANA");
		user.setNames("JUAN");
		user1.setUser("900008");
		user1.setPassword(MD5.md5("EPLACER"));
		user1.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		user1.setActive(true);
		user1.setAdministrator(true);
		user1.setSurnames("PLACER");
		user1.setNames("EDDY");
		user2.setUser("900010");
		user2.setPassword(MD5.md5("EPLACER"));
		user2.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		user2.setActive(false);
		user2.setAdministrator(false);
		user2.setSurnames("TELLEZ");
		user2.setNames("BLANCA");
		user3.setUser("900010");
		user3.setPassword(MD5.md5("EPLACER"));
		user3.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		user3.setActive(true);
		user3.setAdministrator(true);
		user3.setSurnames("QUIROGA");
		user3.setNames("CLAUDIA");
		user4.setUser("900012");
		user4.setPassword(MD5.md5("EPLACER"));
		user4.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		user4.setActive(true);
		user4.setAdministrator(true);
		user4.setNames("DITO");
		user5.setUser("900013");
		user5.setPassword(MD5.md5("EPLACER"));
		user5.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		user5.setActive(true);
		user5.setAdministrator(true);
		user5.setSurnames("MONTECINOS");
		user5.setNames("DANIELA");
		user6.setUser("900014");
		user6.setPassword(MD5.md5("EPLACER"));
		user6.setExpirationDate(new java.util.Date("2/2/2020 00:00:00"));
		user6.setActive(true);
		user6.setAdministrator(true);
		user6.setNames("JUAN");
		entityManager.persist(usuario);
		entityManager.persist(user);
		entityManager.persist(user1);
		entityManager.persist(user2);
		entityManager.persist(user3);
		entityManager.persist(user4);
		entityManager.persist(user5);
		entityManager.persist(user6);
		tx.commit();
		entityManager.close();
	}

	/**
	 * @generated
	 */
	protected void tearDown() throws Exception {
		if (persistenceHelper != null) {
			persistenceHelper.close();
		}
		super.tearDown();
	}

	/**
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();
		initObjects();
	}

	/**
	 * @generated
	 */
	public void test1() throws Exception {
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "PersonaPersistentTest";
	}
}