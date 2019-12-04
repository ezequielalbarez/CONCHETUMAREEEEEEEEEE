package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.UsuariosEntity;

public interface Repository extends JpaRepository<UsuariosEntity,Long> {

	    List<UsuariosEntity> findAllByNameLike(String nombre);

	    List<UsuariosEntity> findAllByNameLikeOrSurnameLike(String nombre, String apellido);

}








