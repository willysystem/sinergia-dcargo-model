package com.sinergia.dcargo.client.shared;

import javax.persistence.GenerationType;


/**
 * @generated
 */
@javax.persistence.Entity
public class TipoPago implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 62002274L;
	/**
	 * @generated
	 */
	private Long id;

	/**
	 * @generated
	 */
	private Guia guia;

	/**
	 * @generated
	 */
	private String descripcion;

	/**
	 * @generated
	 */
	public TipoPago() {
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
	public String toString() {
		return "TipoPago" + " id=" + id + " descripcion=" + descripcion;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne(mappedBy = "tipoPago")
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
	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * @generated
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}