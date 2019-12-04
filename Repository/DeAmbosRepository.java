package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.DeAmbosEntity;



	public interface DeAmbosRepository extends JpaRepository<DeAmbosEntity ,Long> {

	    List<DeAmbosEntity> findAllByNameLike(Long clave_fiscal);

	    List<DeAmbosEntity> findAllByNameLikeOrSurnameLike(Long id_impuestos);

}


