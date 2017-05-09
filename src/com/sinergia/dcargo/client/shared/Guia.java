package com.sinergia.dcargo.client.shared;


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
	private String nroGuia;

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
	private Boolean nulo;
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
	private Integer totalMinimo;
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
	private LugarDatos lugarConsignatario;
	/**
	 * @generated
	 */
	private LugarDatos lugarRemitente;
	/**
	 * @generated
	 */
	private LugarDatos lugarConsignatarioOtro;

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
	public Guia() {
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Guia" + " id=" + id + " nroGuia=" + nroGuia + " totalPeso="
				+ totalPeso + " totalCantidad=" + totalCantidad + " adjunto="
				+ adjunto + " nulo=" + nulo + " nroFactura=" + nroFactura
				+ " fechaRegistro=" + fechaRegistro + " totalMinimo="
				+ totalMinimo + " fechaEntrega=" + fechaEntrega + " ciEntrega="
				+ ciEntrega + " novedadEntrega=" + novedadEntrega
				+ " resumenContenido=" + resumenContenido + " saldoDestino="
				+ saldoDestino + " pagoOrigen=" + pagoOrigen;
	}

	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
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
	public String getNroGuia() {
		return this.nroGuia;
	}

	/**
	 * @generated
	 */
	public void setNroGuia(String nroGuia) {
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
	public Boolean getNulo() {
		return this.nulo;
	}

	/**
	 * @generated
	 */
	public void setNulo(Boolean nulo) {
		this.nulo = nulo;
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
	public Integer getTotalMinimo() {
		return this.totalMinimo;
	}

	/**
	 * @generated
	 */
	public void setTotalMinimo(Integer totalMinimo) {
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
	@javax.persistence.OneToOne
	public LugarDatos getLugarConsignatario() {
		return this.lugarConsignatario;
	}

	/**
	 * @generated
	 */
	public void setLugarConsignatario(LugarDatos lugarConsignatario) {
		this.lugarConsignatario = lugarConsignatario;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne
	public LugarDatos getLugarRemitente() {
		return this.lugarRemitente;
	}

	/**
	 * @generated
	 */
	public void setLugarRemitente(LugarDatos lugarRemitente) {
		this.lugarRemitente = lugarRemitente;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne
	public LugarDatos getLugarConsignatarioOtro() {
		return this.lugarConsignatarioOtro;
	}

	/**
	 * @generated
	 */
	public void setLugarConsignatarioOtro(LugarDatos lugarConsignatarioOtro) {
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
}