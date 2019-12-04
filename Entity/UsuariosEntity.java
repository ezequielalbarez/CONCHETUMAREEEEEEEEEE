package com.example.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class UsuariosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCuil;
	
	 @Column(name = "nombre") //columna de base de datos :)
	    private String nombre;
	 
	 @Column(name = "apellido") // en rojo es del nombre de la columna :)
	   private String apellido;
	 
	 @Column(name = "fecha")
	   private Date fecha;

	 @Column(name = "dni")
	   private String dni;

}


