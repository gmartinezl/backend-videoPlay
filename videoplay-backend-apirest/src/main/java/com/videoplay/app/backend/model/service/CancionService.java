package com.videoplay.app.backend.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.videoplay.app.backend.model.dao.ICancionDao;
import com.videoplay.app.backend.model.entity.Cancion;

@Service
public class CancionService implements ICancionService{

	@Autowired
	private ICancionDao cancionDao;
	
	@Transactional(readOnly = true)
	public List<Cancion> findAll() {
		return (List<Cancion>) cancionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cancion findById(Long id) {
		return cancionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cancion save(Cancion cancion) {
		return cancionDao.save(cancion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		cancionDao.deleteById(id);
		
	}

}
