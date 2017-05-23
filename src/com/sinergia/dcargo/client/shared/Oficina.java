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
	private java.util.Set<LugarDato> lugaresDatos = new java.util.HashSet<LugarDato>();

	/**
	 * @generated
	 */
	private java.util.Set<Conocimiento> conocimientosOrigen = new java.util.HashSet<Conocimiento>();
	/**
	 * @generated
	 */
	private java.util.Set<Conocimiento> conocimientosDestino = new java.util.HashSet<Conocimiento>();

	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
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
	public java.util.Set<LugarDato> getLugaresDatos() {
		return this.lugaresDatos;
	}

	/**
	 * @generated
	 */
	public void setLugaresDatos(java.util.Set<LugarDato> lugaresDatos) {
		this.lugaresDatos = lugaresDatos;
	}

	/**
	 * @generated
	 */
	public void addLugaresDatos(LugarDato lugaresDatos) {
		getLugaresDatos().add(lugaresDatos);
		lugaresDatos.setOficina(this);
	}

	/**
	 * @generated
	 */
	public void removeLugaresDatos(LugarDato lugaresDatos) {
		getLugaresDatos().remove(lugaresDatos);
		lugaresDatos.setOficina(null);
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "oficinaOrigen")
	public java.util.Set<Conocimiento> getConocimientosOrigen() {
		return this.conocimientosOrigen;
	}

	/**
	 * @generated
	 */
	public void setConocimientosOrigen(
			java.util.Set<Conocimiento> conocimientosOrigen) {
		this.conocimientosOrigen = conocimientosOrigen;
	}

	/**
	 * @generated
	 */
	public void addConocimientosOrigen(Conocimiento conocimientosOrigen) {
		getConocimientosOrigen().add(conocimientosOrigen);
		conocimientosOrigen.setOficinaOrigen(this);
	}

	/**
	 * @generated
	 */
	public void removeConocimientosOrigen(Conocimiento conocimientosOrigen) {
		getConocimientosOrigen().remove(conocimientosOrigen);
		conocimientosOrigen.setOficinaOrigen(null);
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "oficinaDestino")
	public java.util.Set<Conocimiento> getConocimientosDestino() {
		return this.conocimientosDestino;
	}

	/**
	 * @generated
	 */
	public void setConocimientosDestino(
			java.util.Set<Conocimiento> conocimientosDestino) {
		this.conocimientosDestino = conocimientosDestino;
	}

	/**
	 * @generated
	 */
	public void addConocimientosDestino(Conocimiento conocimientosDestino) {
		getConocimientosDestino().add(conocimientosDestino);
		conocimientosDestino.setOficinaDestino(this);
	}

	/**
	 * @generated
	 */
	public void removeConocimientosDestino(Conocimiento conocimientosDestino) {
		getConocimientosDestino().remove(conocimientosDestino);
		conocimientosDestino.setOficinaDestino(null);
	}
}