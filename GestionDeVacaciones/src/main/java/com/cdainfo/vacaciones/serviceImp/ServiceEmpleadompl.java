
package com.cdainfo.vacaciones.serviceImp;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdainfo.vacaciones.entity.Empleado;
import com.cdainfo.vacaciones.entity.EmpleadoLicencia;
import com.cdainfo.vacaciones.repository.EmpleadoRepository;
import com.cdainfo.vacaciones.service.ServiceEmpleado;

@Service
public class ServiceEmpleadompl implements ServiceEmpleado {

	@Autowired
	EmpleadoRepository empleadoRepository;

	EmpleadoLicencia peticion;

	@Override
	public List<Empleado> traerTodos() {
		return empleadoRepository.findAll();
	}


	public Empleado grabar(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	public void borrar(Empleado empleado) {
		empleadoRepository.delete(empleado);
	}

	/*
	 * @Override public Empleado findByFiltro(Integer lider, Integer id, String
	 * user) { Optional<Empleado> mail = empleadoRepository.findByUser(user);
	 * Optional<Empleado> empleadoscomunes = empleadoRepository.findById(id); if
	 * (empleadoscomunes.isPresent()) { return mail.get(); } else {
	 * Optional<Empleado> lideres = empleadoRepository.findByLider(lider);
	 * 
	 * return lideres.get(); } }
	 */

	@Override
	public Empleado buscarPorEmail(String email) {
		Optional<Empleado> empleado = empleadoRepository.findByEmail(email);//busca por email 

		if (empleado.isPresent()) {//si el empleado existe
			return (Empleado)empleado.get();//retorna el empleado
		} else {
			System.out.println("Usuario " + email + "no fue encontrado");
		}
		return null;
	}



	public void traerUsuario(Empleado empleado) {
		// TODO Auto-generated method stub
	}

	@Override
	public Empleado findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
