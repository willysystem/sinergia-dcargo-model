package com.sinergia.dcargo.client.shared;

import javax.persistence.GenerationType;


/**
 * @generated
 */
@javax.persistence.Entity
public class LugarDatos implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -581967999L;
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
	private Guia guia;
	/**
	 * @generated
	 */
	private Guia guia1;
	/**
	 * @generated
	 */
	private Guia guia2;

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
	public String toString() {
		return "LugarDatos" + " id=" + id;
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
	public LugarDatos() {
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne(mappedBy = "lugarConsignatario")
	public Guia getGuia() {
		return this.guia;
	}

	/**
	 * @generated
	 */
	public void setGuia(Guia guia) {
		this.guia = guia;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne(mappedBy = "lugarRemitente")
	public Guia getGuia1() {
		return this.guia1;
	}

	/**
	 * @generated
	 */
	public void setGuia1(Guia guia1) {
		this.guia1 = guia1;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne(mappedBy = "lugarConsignatarioOtro")
	public Guia getGuia2() {
		return this.guia2;
	}

	/**
	 * @generated
	 */
	public void setGuia2(Guia guia2) {
		this.guia2 = guia2;
	}
}