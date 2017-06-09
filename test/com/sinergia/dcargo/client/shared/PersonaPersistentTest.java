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
	public TipoPago tipoPago;

	/**
	 * @generated
	 */
	public TipoPago tipoPago1;

	/**
	 * @generated
	 */
	public TipoPago tipoPago2;

	/**
	 * @generated
	 */
	public TipoPago tipoPago3;

	/**
	 * @generated
	 */
	public Unidad unidad;

	/**
	 * @generated
	 */
	public Unidad unidad1;

	/**
	 * @generated
	 */
	public Unidad unidad2;

	/**
	 * @generated
	 */
	public Unidad unidad3;

	/**
	 * @generated
	 */
	public Unidad unidad4;

	/**
	 * @generated
	 */
	public Unidad unidad5;

	/**
	 * @generated
	 */
	public Unidad unidad6;

	/**
	 * @generated
	 */
	public Unidad unidad7;

	/**
	 * @generated
	 */
	public Precio precio;

	/**
	 * @generated
	 */
	public Precio precio1;

	/**
	 * @generated
	 */
	public Precio precio2;

	/**
	 * @generated
	 */
	public Precio precio3;

	/**
	 * @generated
	 */
	public Precio precio4;

	/**
	 * @generated
	 */
	public Precio precio5;

	/**
	 * @generated
	 */
	public Precio precio6;

	/**
	 * @generated
	 */
	public Precio precio7;

	/**
	 * @generated
	 */
	public Precio precio8;

	/**
	 * @generated
	 */
	public Precio precio9;

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
		tipoPago = new com.sinergia.dcargo.client.shared.TipoPago();
		tipoPago1 = new com.sinergia.dcargo.client.shared.TipoPago();
		tipoPago2 = new com.sinergia.dcargo.client.shared.TipoPago();
		tipoPago3 = new com.sinergia.dcargo.client.shared.TipoPago();
		unidad = new com.sinergia.dcargo.client.shared.Unidad();
		unidad1 = new com.sinergia.dcargo.client.shared.Unidad();
		unidad2 = new com.sinergia.dcargo.client.shared.Unidad();
		unidad3 = new com.sinergia.dcargo.client.shared.Unidad();
		unidad4 = new com.sinergia.dcargo.client.shared.Unidad();
		unidad5 = new com.sinergia.dcargo.client.shared.Unidad();
		unidad6 = new com.sinergia.dcargo.client.shared.Unidad();
		unidad7 = new com.sinergia.dcargo.client.shared.Unidad();
		precio = new com.sinergia.dcargo.client.shared.Precio();
		precio1 = new com.sinergia.dcargo.client.shared.Precio();
		precio2 = new com.sinergia.dcargo.client.shared.Precio();
		precio3 = new com.sinergia.dcargo.client.shared.Precio();
		precio4 = new com.sinergia.dcargo.client.shared.Precio();
		precio5 = new com.sinergia.dcargo.client.shared.Precio();
		precio6 = new com.sinergia.dcargo.client.shared.Precio();
		precio7 = new com.sinergia.dcargo.client.shared.Precio();
		precio8 = new com.sinergia.dcargo.client.shared.Precio();
		precio9 = new com.sinergia.dcargo.client.shared.Precio();
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
		user2.setNombreUsuario("900011");
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
		tipoPago.setDescripcion("Cancelado");
		tipoPago1.setDescripcion("En destino");
		tipoPago2.setDescripcion("CC Origen");
		tipoPago3.setDescripcion("Origen-Dest");
		unidad.setAbreviatura("Kg.");
		unidad1.setAbreviatura("Lt.");
		unidad2.setAbreviatura("Bu.");
		unidad3.setAbreviatura("Vo");
		unidad4.setAbreviatura("Va");
		unidad5.setAbreviatura("m3");
		unidad6.setAbreviatura("QQ");
		unidad7.setAbreviatura("Ni");
		precio.setDescripcion("30 ctv.");
		precio.setPrecio(0.3);
		precio1.setDescripcion("40 ctv.");
		precio1.setPrecio(0.4);
		precio2.setDescripcion("50 ctv.");
		precio2.setPrecio(0.5);
		precio3.setDescripcion("50 m3");
		precio3.setPrecio(50.0);
		precio4.setDescripcion("70 m3");
		precio4.setPrecio(70.0);
		precio5.setDescripcion("100 m3");
		precio5.setPrecio(100.0);
		precio6.setDescripcion("120 m3");
		precio6.setPrecio(120.0);
		precio7.setDescripcion("35 ctv");
		precio7.setPrecio(0.35);
		precio8.setDescripcion("12 qq");
		precio8.setPrecio(12.0);
		precio9.setDescripcion("80 m3");
		precio9.setPrecio(80.0);
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
		entityManager.persist(tipoPago);
		entityManager.persist(tipoPago1);
		entityManager.persist(tipoPago2);
		entityManager.persist(tipoPago3);
		entityManager.persist(unidad);
		entityManager.persist(unidad1);
		entityManager.persist(unidad2);
		entityManager.persist(unidad3);
		entityManager.persist(unidad4);
		entityManager.persist(unidad5);
		entityManager.persist(unidad6);
		entityManager.persist(unidad7);
		entityManager.persist(precio);
		entityManager.persist(precio1);
		entityManager.persist(precio2);
		entityManager.persist(precio3);
		entityManager.persist(precio4);
		entityManager.persist(precio5);
		entityManager.persist(precio6);
		entityManager.persist(precio7);
		entityManager.persist(precio8);
		entityManager.persist(precio9);
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