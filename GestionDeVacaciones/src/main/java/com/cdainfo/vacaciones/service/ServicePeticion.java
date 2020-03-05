package com.cdainfo.vacaciones.service;

import java.util.List;

import com.cdainfo.vacaciones.entity.EmpleadoLicencia;



public interface ServicePeticion {
	
	List<EmpleadoLicencia> traerTodas();
    List<EmpleadoLicencia> findAllBySolicitud();
	EmpleadoLicencia findByNumeroPeticion(Integer idtipo );
	
	void guardar(EmpleadoLicencia peticion);
	
	List<EmpleadoLicencia> getPeticionesByEmail(String email);


}
