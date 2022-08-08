package com.co.personalsoft.usuario.service;

import java.util.List;

import com.co.personalsoft.usuario.dto.UsuarioDTO;

public interface UsuarioService {

	String crearUsuario(UsuarioDTO usuario);
	
	UsuarioDTO editarUsuario(UsuarioDTO usuario);
	
	List<UsuarioDTO> listarUsuario();
	
}
