package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DeAmbosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clave_fiscal;
	
	 @Column(name = "nombre") //columna de base de datos :)
	    private Long id_impuestos;
	




}
