package com.cdainfo.vacaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.vacaciones.entity.EmpleadoLicencia;
//import com.cdainfo.vacaciones.estados.EstadoImp;




@Repository
public interface PeticionRepository extends JpaRepository<EmpleadoLicencia,Integer> {
	List<EmpleadoLicencia> findAllBySolicitud();
	
	//List<Peticion> findAllByDiaAltaAndTipoDeLicenciaAndCantidadDias(String diaAlta, String tipoDeLicencia,Date cantidadDias);
	Optional<EmpleadoLicencia> findByNumeroPeticion(Integer idtipo);
	List<EmpleadoLicencia> findAllByEmpleado(Integer idempleado);



}