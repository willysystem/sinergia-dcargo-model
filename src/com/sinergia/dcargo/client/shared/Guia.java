package com.sinergia.dcargo.client.shared;

import javax.persistence.GenerationType;


/**
 * @generated
 */
@javax.persistence.Entity
public class Guia implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -309215877L;
	/**
	 * @generated
	 */
	private Long id;
	/**
	 * @generated
	 */
	private Integer nroGuia;

	/**
	 * @generated
	 */
	private Double totalPeso;
	/**
	 * @generated
	 */
	private Integer totalCantidad;
	/**
	 * @generated
	 */
	private String adjunto;

	/**
	 * @generated
	 */
	private String nroFactura;
	/**
	 * @generated
	 */
	private java.util.Date fechaRegistro;

	/**
	 * @generated
	 */
	private Double totalMinimo;
	/**
	 * @generated
	 */
	private java.util.Date fechaEntrega;
	/**
	 * @generated
	 */
	private String ciEntrega;

	/**
	 * @generated
	 */
	private LugarDato lugarConsignatario;
	/**
	 * @generated
	 */
	private LugarDato lugarRemitente;
	/**
	 * @generated
	 */
	private LugarDato lugarConsignatarioOtro;

	/**
	 * @generated
	 */
	private Conocimiento conocimiento;
	/**
	 * @generated
	 */
	private TipoPago tipoPago;

	/**
	 * @generated
	 */
	private String novedadEntrega;
	/**
	 * @generated
	 */
	private String resumenContenido;
	/**
	 * @generated
	 */
	private Double saldoDestino;
	/**
	 * @generated
	 */
	private Double pagoOrigen;

	/**
	 * @generated
	 */
	private java.util.Date fecha;

	/**
	 * @generated
	 */
	private Double totalGuia;

	/**
	 * @generated
	 */
	private Boolean activo;

	/**
	 * @generated
	 */
	private String notaEntrega;

	/**
	 * @generated
	 */
	private Integer nro;

	/**
	 * @generated
	 */
	private String origen;
	/**
	 * @generated
	 */
	private String destino;
	/**
	 * @generated
	 */
	private String remitente;
	/**
	 * @generated
	 */
	private String consignatario;

	/**
	 * @generated
	 */
	public Guia() {
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Guia" + " id=" + id + " nroGuia=" + nroGuia + " totalPeso="
				+ totalPeso + " totalCantidad=" + totalCantidad + " adjunto="
				+ adjunto + " activo=" + activo + " nroFactura=" + nroFactura
				+ " fechaRegistro=" + fechaRegistro + " totalMinimo="
				+ totalMinimo + " fechaEntrega=" + fechaEntrega + " ciEntrega="
				+ ciEntrega + " novedadEntrega=" + novedadEntrega
				+ " resumenContenido=" + resumenContenido + " saldoDestino="
				+ saldoDestino + " pagoOrigen=" + pagoOrigen + " fecha="
				+ fecha + " totalGuia=" + totalGuia + " notaEntrega="
				+ notaEntrega + " nro=" + nro + " origen=" + origen
				+ " destino=" + destino + " remitente=" + remitente
				+ " consignatario=" + consignatario;
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
	public Integer getNroGuia() {
		return this.nroGuia;
	}

	/**
	 * @generated
	 */
	public void setNroGuia(Integer nroGuia) {
		this.nroGuia = nroGuia;
	}

	/**
	 * @generated
	 */
	public Double getTotalPeso() {
		return this.totalPeso;
	}

	/**
	 * @generated
	 */
	public void setTotalPeso(Double totalPeso) {
		this.totalPeso = totalPeso;
	}

	/**
	 * @generated
	 */
	public Integer getTotalCantidad() {
		return this.totalCantidad;
	}

	/**
	 * @generated
	 */
	public void setTotalCantidad(Integer totalCantidad) {
		this.totalCantidad = totalCantidad;
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
	public String getNroFactura() {
		return this.nroFactura;
	}

	/**
	 * @generated
	 */
	public void setNroFactura(String nroFactura) {
		this.nroFactura = nroFactura;
	}

	/**
	 * @generated
	 */
	public java.util.Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	/**
	 * @generated
	 */
	public void setFechaRegistro(java.util.Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @generated
	 */
	public Double getTotalMinimo() {
		return this.totalMinimo;
	}

	/**
	 * @generated
	 */
	public void setTotalMinimo(Double totalMinimo) {
		this.totalMinimo = totalMinimo;
	}

	/**
	 * @generated
	 */
	public java.util.Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	/**
	 * @generated
	 */
	public void setFechaEntrega(java.util.Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	/**
	 * @generated
	 */
	public String getCiEntrega() {
		return this.ciEntrega;
	}

	/**
	 * @generated
	 */
	public void setCiEntrega(String ciEntrega) {
		this.ciEntrega = ciEntrega;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public LugarDato getLugarConsignatario() {
		return this.lugarConsignatario;
	}

	/**
	 * @generated
	 */
	public void setLugarConsignatario(LugarDato lugarConsignatario) {
		this.lugarConsignatario = lugarConsignatario;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public LugarDato getLugarRemitente() {
		return this.lugarRemitente;
	}

	/**
	 * @generated
	 */
	public void setLugarRemitente(LugarDato lugarRemitente) {
		this.lugarRemitente = lugarRemitente;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public LugarDato getLugarConsignatarioOtro() {
		return this.lugarConsignatarioOtro;
	}

	/**
	 * @generated
	 */
	public void setLugarConsignatarioOtro(LugarDato lugarConsignatarioOtro) {
		this.lugarConsignatarioOtro = lugarConsignatarioOtro;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public Conocimiento getConocimiento() {
		return this.conocimiento;
	}

	/**
	 * @generated
	 */
	public void setConocimiento(Conocimiento conocimiento) {
		this.conocimiento = conocimiento;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne
	public TipoPago getTipoPago() {
		return this.tipoPago;
	}

	/**
	 * @generated
	 */
	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}

	/**
	 * @generated
	 */
	public String getNovedadEntrega() {
		return this.novedadEntrega;
	}

	/**
	 * @generated
	 */
	public void setNovedadEntrega(String novedadEntrega) {
		this.novedadEntrega = novedadEntrega;
	}

	/**
	 * @generated
	 */
	public String getResumenContenido() {
		return this.resumenContenido;
	}

	/**
	 * @generated
	 */
	public void setResumenContenido(String resumenContenido) {
		this.resumenContenido = resumenContenido;
	}

	/**
	 * @generated
	 */
	public Double getSaldoDestino() {
		return this.saldoDestino;
	}

	/**
	 * @generated
	 */
	public void setSaldoDestino(Double saldoDestino) {
		this.saldoDestino = saldoDestino;
	}

	/**
	 * @generated
	 */
	public Double getPagoOrigen() {
		return this.pagoOrigen;
	}

	/**
	 * @generated
	 */
	public void setPagoOrigen(Double pagoOrigen) {
		this.pagoOrigen = pagoOrigen;
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
	public Double getTotalGuia() {
		return this.totalGuia;
	}

	/**
	 * @generated
	 */
	public void setTotalGuia(Double totalGuia) {
		this.totalGuia = totalGuia;
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
	public String getNotaEntrega() {
		return this.notaEntrega;
	}

	/**
	 * @generated
	 */
	public void setNotaEntrega(String notaEntrega) {
		this.notaEntrega = notaEntrega;
	}

	/**
	 * @generated
	 */
	@javax.persistence.Transient
	public Integer getNro() {
		return this.nro;
	}

	/**
	 * @generated
	 */
	public void setNro(Integer nro) {
		this.nro = nro;
	}

	/**
	 * @generated
	 */
	@javax.persistence.Transient
	public String getOrigen() {
		return this.origen;
	}

	/**
	 * @generated
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @generated
	 */
	@javax.persistence.Transient
	public String getDestino() {
		return this.destino;
	}

	/**
	 * @generated
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @generated
	 */
	@javax.persistence.Transient
	public String getRemitente() {
		return this.remitente;
	}

	/**
	 * @generated
	 */
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	/**
	 * @generated
	 */
	@javax.persistence.Transient
	public String getConsignatario() {
		return this.consignatario;
	}

	/**
	 * @generated
	 */
	public void setConsignatario(String consignatario) {
		this.consignatario = consignatario;
	}
}