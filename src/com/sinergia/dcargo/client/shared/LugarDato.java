package com.sinergia.dcargo.client.shared;

import javax.persistence.GenerationType;


/**
 * @generated
 */
@javax.persistence.Entity
public class LugarDato implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -1127151822L;
	/**
	 * @generated
	 */
	private Long id;

	/**
	 * @generated
	 */
	private Cliente cliente;
	/**
	 * @generated
	 */
	private Oficina oficina;
	/**
	 * @generated
	 */
	private Usuario usuario;

	/**
	 * @generated
	 */
	private java.util.Set<Guia> guias = new java.util.HashSet<Guia>();
	/**
	 * @generated
	 */
	private java.util.Set<Guia> guias1 = new java.util.HashSet<Guia>();
	/**
	 * @generated
	 */
	private java.util.Set<Guia> guias2 = new java.util.HashSet<Guia>();

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
	public String toString() {
		return "LugarDato" + " id=" + id;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	 * @generated
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public Oficina getOficina() {
		return this.oficina;
	}

	/**
	 * @generated
	 */
	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public Usuario getUsuario() {
		return this.usuario;
	}

	/**
	 * @generated
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @generated
	 */
	public LugarDato() {
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "lugarConsignatario")
	public java.util.Set<Guia> getGuias() {
		return this.guias;
	}

	/**
	 * @generated
	 */
	public void setGuias(java.util.Set<Guia> guias) {
		this.guias = guias;
	}

	/**
	 * @generated
	 */
	public void addGuias(Guia guias) {
		getGuias().add(guias);
		guias.setLugarConsignatario(this);
	}

	/**
	 * @generated
	 */
	public void removeGuias(Guia guias) {
		getGuias().remove(guias);
		guias.setLugarConsignatario(null);
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "lugarRemitente")
	public java.util.Set<Guia> getGuias1() {
		return this.guias1;
	}

	/**
	 * @generated
	 */
	public void setGuias1(java.util.Set<Guia> guias1) {
		this.guias1 = guias1;
	}

	/**
	 * @generated
	 */
	public void addGuias1(Guia guias1) {
		getGuias1().add(guias1);
		guias1.setLugarRemitente(this);
	}

	/**
	 * @generated
	 */
	public void removeGuias1(Guia guias1) {
		getGuias1().remove(guias1);
		guias1.setLugarRemitente(null);
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "lugarConsignatarioOtro")
	public java.util.Set<Guia> getGuias2() {
		return this.guias2;
	}

	/**
	 * @generated
	 */
	public void setGuias2(java.util.Set<Guia> guias2) {
		this.guias2 = guias2;
	}

	/**
	 * @generated
	 */
	public void addGuias2(Guia guias2) {
		getGuias2().add(guias2);
		guias2.setLugarConsignatarioOtro(this);
	}

	/**
	 * @generated
	 */
	public void removeGuias2(Guia guias2) {
		getGuias2().remove(guias2);
		guias2.setLugarConsignatarioOtro(null);
	}
}