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
	private String nroConocimiento;
	/**
	 * @generated
	 */
	private java.util.Date fecha;
	/**
	 * @generated
	 */
	private Double multa;
	/**
	 * @generated
	 */
	private Integer dias;
	/**
	 * @generated
	 */
	private String observacion;
	/**
	 * @generated
	 */
	private String adjunto;
	/**
	 * @generated
	 */
	private Boolean activo;

	/**
	 * @generated
	 */
	private Transportista transportista;

	/**
	 * @generated
	 */
	public Conocimiento() {
	}

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
		return "Conocimiento" + " id=" + id + " nroConocimiento="
				+ nroConocimiento + " fecha=" + fecha + " multa=" + multa
				+ " dias=" + dias + " observacion=" + observacion + " adjunto="
				+ adjunto + " activo=" + activo;
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

	/**
	 * @generated
	 */
	public String getNroConocimiento() {
		return this.nroConocimiento;
	}

	/**
	 * @generated
	 */
	public void setNroConocimiento(String nroConocimiento) {
		this.nroConocimiento = nroConocimiento;
	}

	/**
	 * @generated
	 */
	public java.util.Date getFecha() {
		return this.fecha;
	}

	/**
	 * @generated
	 */
	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @generated
	 */
	public Double getMulta() {
		return this.multa;
	}

	/**
	 * @generated
	 */
	public void setMulta(Double multa) {
		this.multa = multa;
	}

	/**
	 * @generated
	 */
	public Integer getDias() {
		return this.dias;
	}

	/**
	 * @generated
	 */
	public void setDias(Integer dias) {
		this.dias = dias;
	}

	/**
	 * @generated
	 */
	public String getObservacion() {
		return this.observacion;
	}

	/**
	 * @generated
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	/**
	 * @generated
	 */
	public String getAdjunto() {
		return this.adjunto;
	}

	/**
	 * @generated
	 */
	public void setAdjunto(String adjunto) {
		this.adjunto = adjunto;
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
	@javax.persistence.ManyToOne
	public Transportista getTransportista() {
		return this.transportista;
	}

	/**
	 * @generated
	 */
	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}
}