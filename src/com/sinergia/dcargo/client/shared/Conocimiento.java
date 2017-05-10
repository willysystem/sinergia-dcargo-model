package com.sinergia.dcargo.client.shared;

import javax.persistence.GenerationType;


/**
 * @generated
 */
@javax.persistence.Entity
public class Conocimiento implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1927983240L;
	/**
	 * @generated
	 */
	private Long id;

	/**
	 * @generated
	 */
	private java.util.Set<Guia> guias = new java.util.HashSet<Guia>();

	/**
	 * @generated
	 */
	public Conocimiento() {
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
		return "Conocimiento" + " id=" + id;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "conocimiento")
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
		guias.setConocimiento(this);
	}

	/**
	 * @generated
	 */
	public void removeGuias(Guia guias) {
		getGuias().remove(guias);
		guias.setConocimiento(null);
	}
}