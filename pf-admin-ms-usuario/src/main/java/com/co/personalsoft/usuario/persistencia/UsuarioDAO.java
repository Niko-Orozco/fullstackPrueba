package com.co.personalsoft.usuario.persistencia;

import java.util.List;

import com.co.personalsoft.usuario.dto.UsuarioDTO;

public interface UsuarioDAO {

	String crearUsuario(UsuarioDTO usuario);

	UsuarioDTO editarUsuario(UsuarioDTO usuario);

	List<UsuarioDTO> listarUsuario();

}
