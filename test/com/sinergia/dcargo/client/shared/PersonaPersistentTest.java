package com.sinergia.dcargo.client.shared;

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
	public Office office;

	/**
	 * @generated
	 */
	public Office office1;

	/**
	 * @generated
	 */
	public Office office2;

	/**
	 * @generated
	 */
	public Office office3;

	/**
	 * @generated
	 */
	public Office office4;

	/**
	 * @generated
	 */
	public Office office5;

	/**
	 * @generated
	 */
	public Office office6;

	/**
	 * @generated
	 */
	public Office office7;

	/**
	 * @generated
	 */
	public Office office8;

	/**
	 * @generated
	 */
	public PersonaPersistentTest() {
		persistenceHelper = com.sinergia.dcargo.util.HibernateHelper.getInstance();
	}

	/**
	 * @generated
	 */
	private void initObjects() {
		javax.persistence.EntityManager entityManager = persistenceHelper
				.getEntityManager();
		javax.persistence.EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		usuario = new com.sinergia.dcargo.client.shared.User();
		user = new com.sinergia.dcargo.client.shared.User();
		user1 = new com.sinergia.dcargo.client.shared.User();
		user2 = new com.sinergia.dcargo.client.shared.User();
		user3 = new com.sinergia.dcargo.client.shared.User();
		user4 = new com.sinergia.dcargo.client.shared.User();
		user5 = new com.sinergia.dcargo.client.shared.User();
		user6 = new com.sinergia.dcargo.client.shared.User();
		office = new com.sinergia.dcargo.client.shared.Office();
		office1 = new com.sinergia.dcargo.client.shared.Office();
		office2 = new com.sinergia.dcargo.client.shared.Office();
		office3 = new com.sinergia.dcargo.client.shared.Office();
		office4 = new com.sinergia.dcargo.client.shared.Office();
		office5 = new com.sinergia.dcargo.client.shared.Office();
		office6 = new com.sinergia.dcargo.client.shared.Office();
		office7 = new com.sinergia.dcargo.client.shared.Office();
		office8 = new com.sinergia.dcargo.client.shared.Office();
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
		office.setName("SANTA CRUZ");
		office1.setName("COCHABAMBA");
		office2.setName("LA PAZ");
		office3.setName("SUCRE");
		office4.setName("MONTERO");
		office5.setName("ORURO");
		office6.setName("CHAPARE");
		office7.setName("TARIJA");
		office8.setName("EL ALTO");
		entityManager.persist(usuario);
		entityManager.persist(user);
		entityManager.persist(user1);
		entityManager.persist(user2);
		entityManager.persist(user3);
		entityManager.persist(user4);
		entityManager.persist(user5);
		entityManager.persist(user6);
		entityManager.persist(office);
		entityManager.persist(office1);
		entityManager.persist(office2);
		entityManager.persist(office3);
		entityManager.persist(office4);
		entityManager.persist(office5);
		entityManager.persist(office6);
		entityManager.persist(office7);
		entityManager.persist(office8);
		user2.setOffice(office6);
		office6.getUsers().add(user2);
		user3.setOffice(office4);
		office4.getUsers().add(user3);
		user5.setOffice(office);
		office.getUsers().add(user5);
		user6.setOffice(office8);
		office8.getUsers().add(user6);
		office1.getUsers().add(usuario);
		usuario.setOffice(office1);
		office1.getUsers().add(user4);
		user4.setOffice(office1);
		office2.getUsers().add(user);
		user.setOffice(office2);
		office3.getUsers().add(user1);
		user1.setOffice(office3);
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