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
		return "TipoPago" + " id=" + id;
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
}