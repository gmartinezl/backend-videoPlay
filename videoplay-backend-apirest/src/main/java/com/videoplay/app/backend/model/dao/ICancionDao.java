package com.videoplay.app.backend.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.videoplay.app.backend.model.entity.Cancion;

public interface ICancionDao extends CrudRepository<Cancion, Long>{
	

}
