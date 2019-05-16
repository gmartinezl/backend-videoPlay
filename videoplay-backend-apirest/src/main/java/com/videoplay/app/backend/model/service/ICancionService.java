package com.videoplay.app.backend.model.service;

import java.util.List;

import com.videoplay.app.backend.model.entity.Cancion;

public interface ICancionService {
	
	public List <Cancion> findAll();
	
	public Cancion findById(Long id);
	
	public Cancion save(Cancion cancion);
	
	public void delete(Long id);

}
