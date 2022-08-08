package com.co.personalsoft.usuario.service;

import java.util.Collections;
import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.personalsoft.usuario.dto.UsuarioDTO;
import com.co.personalsoft.usuario.persistencia.UsuarioDAO;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public String crearUsuario(UsuarioDTO usuario) {
		try {
			return usuarioDAO.crearUsuario(usuario);
		} catch (PersistenceException e) {
			return "error al guardar los datos";
		}
	}
	
	@Override
	public UsuarioDTO editarUsuario(UsuarioDTO usuario) {
		try {
			return usuarioDAO.editarUsuario(usuario);
		} catch (PersistenceException e) {
			return null;
		}
	}
	
	@Override
	public List<UsuarioDTO> listarUsuario() {
		try {
			return usuarioDAO.listarUsuario();
		} catch (PersistenceException e) {
			return Collections.emptyList();
		}
	}
}
