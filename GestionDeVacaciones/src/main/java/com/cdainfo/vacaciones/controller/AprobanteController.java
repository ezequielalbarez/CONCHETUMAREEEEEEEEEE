package com.cdainfo.vacaciones.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cdainfo.vacaciones.entity.EmpleadoLicencia;

import com.cdainfo.vacaciones.serviceImp.SevicePeticionImpl;



@Controller
@RequestMapping("/aprobante")
public class AprobanteController {
	


	@Autowired
	SevicePeticionImpl servicepeticion;
	
	
	@GetMapping("/peticion") // trae la peticion
	public String peticion(Model model) {
		model.addAttribute("peticion", new EmpleadoLicencia());
		return "peticion";
	}

	@PostMapping("/cargarPeticion") // carga la peticion
	public String peticion(@ModelAttribute EmpleadoLicencia peticion) {
		return "peticionEnviada";
	} 
	@GetMapping("/lista") //trae los usuarios
	 public String getAlltraerTodos(Model model) {
	 List<EmpleadoLicencia> lista = servicepeticion.findAllBySolicitud();
	 model.addAttribute("ListaPeticiones", lista);
	 return "alta";
	 }
	
    	
}
