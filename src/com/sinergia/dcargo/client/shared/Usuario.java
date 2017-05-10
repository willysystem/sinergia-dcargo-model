package com.sinergia.dcargo.client.shared;


/**
 * @generated
 */
@javax.persistence.Entity
public class Usuario extends Persona implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 348744729L;

	/**
	 * @generated
	 */
	private Oficina office;

	/**
	 * @generated
	 */
	private String contrasenia;

	/**
	 * @generated
	 */
	private java.util.Date fechaExpiracion;

	/**
	 * @generated
	 */
	private Boolean activo;

	/**
	 * @generated
	 */
	private Boolean administrador;

	/**
	 * @generated
	 */
	private String nombreUsuario;

	/**
	 * @generated
	 */
	private java.util.Set<LugarDato> lugaresDatos = new java.util.HashSet<LugarDato>();

	/**
	 * @generated
	 */
	public String toString() {
		return "Usuario" + " nombreUsuario=" + nombreUsuario + " contrasenia="
				+ contrasenia + " fechaExpiracion=" + fechaExpiracion
				+ " activo=" + activo + " administrador=" + administrador;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public Oficina getOffice() {
		return this.office;
	}

	/**
	 * @generated
	 */
	public void setOffice(Oficina office) {
		this.office = office;
	}

	/**
	 * @generated
	 */
	public Usuario() {
	}

	/**
	 * @generated
	 */
	public String getContrasenia() {
		return this.contrasenia;
	}

	/**
	 * @generated
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * @generated
	 */
	public java.util.Date getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	/**
	 * @generated
	 */
	public void setFechaExpiracion(java.util.Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	/**
	 * @generated
	 */
	public Boolean getActivo() {
		return this.activo;
	}

	/**
	 * @generated
	 */
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	/**
	 * @generated
	 */
	public Boolean getAdministrador() {
		return this.administrador;
	}

	/**
	 * @generated
	 */
	public void setAdministrador(Boolean administrador) {
		this.administrador = administrador;
	}

	/**
	 * @generated
	 */
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	/**
	 * @generated
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "usuario")
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
		lugaresDatos.setUsuario(this);
	}

	/**
	 * @generated
	 */
	public void removeLugaresDatos(LugarDato lugaresDatos) {
		getLugaresDatos().remove(lugaresDatos);
		lugaresDatos.setUsuario(null);
	}
}