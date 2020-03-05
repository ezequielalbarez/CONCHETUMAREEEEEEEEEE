package com.cdainfo.vacaciones.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "emp_lic")
public class EmpleadoLicencia {

	@Id
	@Column(name = "emp_licnro")// es la pk de la tabla solo sirve para eso
	private Integer numeroPeticion;

	@Column(name = "elfechadesde")
	private Date diaAlta;

	@Column(name = "elfechahasta")
	private Date diaHasta;

	@Column(name = "empleado")
	private Integer idempleado;

	@Column(name = "elcantdias")
	private Integer cantdiasxlicencia;

	@Column(name = "tdnro")
	private Integer idtipo;// numero de la solicitud

	public Integer getCantdiasxlicencia() {
		return cantdiasxlicencia;
	}

	public void setCantdiasxlicencia(Integer cantdiasxlicencia) {
		this.cantdiasxlicencia = cantdiasxlicencia;
	}

	public Integer getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(Integer idempleado) {
		this.idempleado = idempleado;
	}

	public Integer getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}

	public Date getDiaAlta() {
		return diaAlta;
	}

	public void setDiaAlta(Date diaAlta) {
		this.diaAlta = diaAlta;
	}

	public Date getDiaHasta() {
		return diaHasta;
	}

	public void setDiaHasta(Date diaHasta) {
		this.diaHasta = diaHasta;
	}

	public void setNumeroPeticion(Integer numeroPeticion) {
		this.numeroPeticion = numeroPeticion;
	}

	public long getNumeroPeticion() {
		return numeroPeticion;
	}

	public void setNumeroPeticion(int numeroPeticion) {
		this.numeroPeticion = numeroPeticion;
	}

	@Override
	public String toString() {
		return "EmpleadoLicencia{" +
				"numeroPeticion=" + numeroPeticion +
				", diaAlta=" + diaAlta +
				", diaHasta=" + diaHasta +
				", idempleado=" + idempleado +
				", cantdiasxlicencia=" + cantdiasxlicencia +
				", idtipo=" + idtipo +
				'}';
	}
}