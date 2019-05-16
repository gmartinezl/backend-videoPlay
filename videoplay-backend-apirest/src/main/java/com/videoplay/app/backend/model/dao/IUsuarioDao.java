package com.videoplay.app.backend.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.videoplay.app.backend.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	

}
