package com.sinergia.dcargo.client.shared;

import javax.persistence.GenerationType;


/**
 * @generated
 */
@javax.persistence.Entity
public class Cliente implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1342176997L;
	/**
	 * @generated
	 */
	private Long id;
	/**
	 * @generated
	 */
	private String nombre;

	/**
	 * @generated
	 */
	private String direccion;
	/**
	 * @generated
	 */
	private String telefono;
	/**
	 * @generated
	 */
	private String nit;
	/**
	 * @generated
	 */
	private String ci;

	/**
	 * @generated
	 */
	private java.util.Set<LugarDatos> lugaresDatos = new java.util.HashSet<LugarDatos>();

	/**
	 * @generated
	 */
	private Integer codigo;

	/**
	 * @generated
	 */
	public Cliente() {
	}

	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public String toString() {
		return "Cliente" + " id=" + id + " nombre=" + nombre + " direccion="
				+ direccion + " telefono=" + telefono + " nit=" + nit + " ci="
				+ ci + " codigo=" + codigo;
	}

	/**
	 * @generated
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * @generated
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @generated
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * @generated
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @generated
	 */
	public String getNit() {
		return this.nit;
	}

	/**
	 * @generated
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}

	/**
	 * @generated
	 */
	public String getCi() {
		return this.ci;
	}

	/**
	 * @generated
	 */
	public void setCi(String ci) {
		this.ci = ci;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "cliente")
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
		lugaresDatos.setCliente(this);
	}

	/**
	 * @generated
	 */
	public void removeLugaresDatos(LugarDatos lugaresDatos) {
		getLugaresDatos().remove(lugaresDatos);
		lugaresDatos.setCliente(null);
	}

	/**
	 * @generated
	 */
	public Integer getCodigo() {
		return this.codigo;
	}

	/**
	 * @generated
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}