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
	public Usuario usuario;

	/**
	 * @generated
	 */
	public Usuario user;

	/**
	 * @generated
	 */
	public Usuario user1;

	/**
	 * @generated
	 */
	public Usuario user2;

	/**
	 * @generated
	 */
	public Usuario user3;

	/**
	 * @generated
	 */
	public Usuario user4;

	/**
	 * @generated
	 */
	public Usuario user5;

	/**
	 * @generated
	 */
	public Usuario user6;

	/**
	 * @generated
	 */
	public Oficina office;

	/**
	 * @generated
	 */
	public Oficina office1;

	/**
	 * @generated
	 */
	public Oficina office2;

	/**
	 * @generated
	 */
	public Oficina office3;

	/**
	 * @generated
	 */
	public Oficina office4;

	/**
	 * @generated
	 */
	public Oficina office5;

	/**
	 * @generated
	 */
	public Oficina office6;

	/**
	 * @generated
	 */
	public Oficina office7;

	/**
	 * @generated
	 */
	public Oficina office8;

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
		usuario = new com.sinergia.dcargo.client.shared.Usuario();
		user = new com.sinergia.dcargo.client.shared.Usuario();
		user1 = new com.sinergia.dcargo.client.shared.Usuario();
		user2 = new com.sinergia.dcargo.client.shared.Usuario();
		user3 = new com.sinergia.dcargo.client.shared.Usuario();
		user4 = new com.sinergia.dcargo.client.shared.Usuario();
		user5 = new com.sinergia.dcargo.client.shared.Usuario();
		user6 = new com.sinergia.dcargo.client.shared.Usuario();
		office = new com.sinergia.dcargo.client.shared.Oficina();
		office1 = new com.sinergia.dcargo.client.shared.Oficina();
		office2 = new com.sinergia.dcargo.client.shared.Oficina();
		office3 = new com.sinergia.dcargo.client.shared.Oficina();
		office4 = new com.sinergia.dcargo.client.shared.Oficina();
		office5 = new com.sinergia.dcargo.client.shared.Oficina();
		office6 = new com.sinergia.dcargo.client.shared.Oficina();
		office7 = new com.sinergia.dcargo.client.shared.Oficina();
		office8 = new com.sinergia.dcargo.client.shared.Oficina();
		usuario.setNombreUsuario("900009");
		usuario.setContrasenia(MD5.md5("EPLACER"));
		usuario.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		usuario.setActivo(true);
		usuario.setAdministrador(true);
		usuario.setApellidos("PLACER ROSSENDI");
		usuario.setNombres("DAVID");
		user.setNombreUsuario("100004");
		user.setContrasenia(MD5.md5("EPLACER"));
		user.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		user.setActivo(true);
		user.setAdministrador(true);
		user.setApellidos("ANTEZANA");
		user.setNombres("JUAN");
		user1.setNombreUsuario("900008");
		user1.setContrasenia(MD5.md5("EPLACER"));
		user1.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		user1.setActivo(true);
		user1.setAdministrador(true);
		user1.setApellidos("PLACER");
		user1.setNombres("EDDY");
		user2.setNombreUsuario("900010");
		user2.setContrasenia(MD5.md5("EPLACER"));
		user2.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		user2.setActivo(false);
		user2.setAdministrador(false);
		user2.setApellidos("TELLEZ");
		user2.setNombres("BLANCA");
		user3.setNombreUsuario("900010");
		user3.setContrasenia(MD5.md5("EPLACER"));
		user3.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		user3.setActivo(true);
		user3.setAdministrador(true);
		user3.setApellidos("QUIROGA");
		user3.setNombres("CLAUDIA");
		user4.setNombreUsuario("900012");
		user4.setContrasenia(MD5.md5("EPLACER"));
		user4.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		user4.setActivo(true);
		user4.setAdministrador(true);
		user4.setNombres("DITO");
		user5.setNombreUsuario("900013");
		user5.setContrasenia(MD5.md5("EPLACER"));
		user5.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		user5.setActivo(true);
		user5.setAdministrador(true);
		user5.setApellidos("MONTECINOS");
		user5.setNombres("DANIELA");
		user6.setNombreUsuario("900014");
		user6.setContrasenia(MD5.md5("EPLACER"));
		user6.setFechaExpiracion(new java.util.Date("2/2/2020 00:00:00"));
		user6.setActivo(true);
		user6.setAdministrador(true);
		user6.setNombres("JUAN");
		office.setNombre("SANTA CRUZ");
		office1.setNombre("COCHABAMBA");
		office2.setNombre("LA PAZ");
		office3.setNombre("SUCRE");
		office4.setNombre("MONTERO");
		office5.setNombre("ORURO");
		office6.setNombre("CHAPARE");
		office7.setNombre("TARIJA");
		office8.setNombre("EL ALTO");
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