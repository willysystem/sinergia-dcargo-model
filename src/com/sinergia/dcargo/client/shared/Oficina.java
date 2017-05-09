package com.sinergia.dcargo.client.shared;

import javax.persistence.GenerationType;


/**
 * @generated
 */
@javax.persistence.Entity
public class Oficina implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -1064520202L;
	/**
	 * @generated
	 */
	private Long id;
	/**
	 * @generated
	 */
	private java.util.Set<Usuario> users = new java.util.HashSet<Usuario>();

	/**
	 * @generated
	 */
	private String nombre;

	/**
	 * @generated
	 */
	private java.util.Set<LugarDatos> lugaresDatos = new java.util.HashSet<LugarDatos>();

	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	public Long getId() {
		return this.id;
	}

	/**
	 * @generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "office")
	public java.util.Set<Usuario> getUsers() {
		return this.users;
	}

	/**
	 * @generated
	 */
	public void setUsers(java.util.Set<Usuario> users) {
		this.users = users;
	}

	/**
	 * @generated
	 */
	public void addUsers(Usuario users) {
		getUsers().add(users);
		users.setOffice(this);
	}

	/**
	 * @generated
	 */
	public void removeUsers(Usuario users) {
		getUsers().remove(users);
		users.setOffice(null);
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Oficina" + " id=" + id + " nombre=" + nombre;
	}

	/**
	 * @generated
	 */
	public Oficina() {
	}

	/**
	 * @generated
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @generated
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "oficina")
	public java.util.Set<LugarDatos> getLugaresDatos() {
		return this.lugaresDatos;
	}

	/**
	 * @generated
	 */
	public void setLugaresDatos(java.util.Set<LugarDatos> lugaresDatos) {
		this.lugaresDatos = lugaresDatos;
	}

	/**
	 * @generated
	 */
	public void addLugaresDatos(LugarDatos lugaresDatos) {
		getLugaresDatos().add(lugaresDatos);
		lugaresDatos.setOficina(this);
	}

	/**
	 * @generated
	 */
	public void removeLugaresDatos(LugarDatos lugaresDatos) {
		getLugaresDatos().remove(lugaresDatos);
		lugaresDatos.setOficina(null);
	}
}