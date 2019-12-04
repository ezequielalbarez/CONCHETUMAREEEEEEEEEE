package com.example.AFIP;

public class Impuestos {

	private Long id_impuestos;
	private String descripcion;
	private String fecha;

	public Long getId_impuestos() {
		return id_impuestos;
	}

	public void setId_impuestos(Long id_impuestos) {
		this.id_impuestos = id_impuestos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
