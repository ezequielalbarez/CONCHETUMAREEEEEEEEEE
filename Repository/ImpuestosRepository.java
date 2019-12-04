package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.ImpuestosEntity;



public interface ImpuestosRepository extends JpaRepository<ImpuestosEntity ,Long> {

	    List<ImpuestosEntity> findAllByNameLike(Long id_impuestos);

	    List<ImpuestosEntity> findAllByNameLikeOrSurnameLike(String descripcion, String fecha);

}
