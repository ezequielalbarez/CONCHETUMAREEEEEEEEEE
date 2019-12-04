package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class ImpuestosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_impuestos;
	
	 @Column(name = "descripcion") //columna de base de datos :)
	    private String descripcion;
	 
	   @Column(name = "fecha")
	   private String fecha;

}




