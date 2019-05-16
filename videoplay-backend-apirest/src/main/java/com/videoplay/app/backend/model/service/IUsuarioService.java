package com.videoplay.app.backend.model.service;

import java.util.List;
import com.videoplay.app.backend.model.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);


}
