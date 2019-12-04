package com.example.AFIP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import com.example.Repository.Repository;
import com.example.Entity.UsuariosEntity;
import com.example.Repository.DeAmbosRepository;
import com.example.Repository.ImpuestosRepository;
import com.example.Repository.Repository;






@RestController
public class Controller {
	
	  @Autowired
	    Repository repository;
	  @Autowired
	    ImpuestosRepository impuestosrepository;
	  @Autowired
	    DeAmbosRepository deAmbosrepository;
	  
	  
	  
	  
	  @GetMapping("/usuario/")
	    public List<UsuariosEntity> getIdCuil() {
	        return repository.findAll();  }
	        
	     //   @PostMapping("/alumno/add")
	        //public Alumno create(@RequestBody Alumno body) {
	          //  return alumnoRepository.save(body);
	      
	            
	            
	            
	    }


//}
