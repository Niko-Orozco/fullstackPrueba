package com.co.personalsoft.usuario.persistencia;

import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.co.personalsoft.usuario.dto.UsuarioDTO;
import com.co.personalsoft.usuario.utils.ConstantesUsuarios;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
       
    @Override
    public String crearUsuario(UsuarioDTO usuario) {
        String sql = ConstantesUsuarios.CREAR_USUARIO;
        try {
        	guardarDatos(usuario, sql);
        	return "Usuario Creado Exitosamente";
        } catch (PersistenceException e) {
			log.error("Error en la creacions del nuevo usuario");
			throw e;
		}
    }

    @Override
    public UsuarioDTO editarUsuario(UsuarioDTO usuario) {
		String sql = ConstantesUsuarios.EDITAR_USUARIO + usuario.getId();
		try {
        	guardarDatos(usuario, sql);
        	return usuario;
        } catch (PersistenceException e) {
			log.error("Error en la atualizaion del usuario");
			throw e;
		}
    }

    @Override
    public List<UsuarioDTO> listarUsuario() {
    	String sql = ConstantesUsuarios.LISTAR_USUARIO;
		try {
        	return jdbcTemplate.query(
				sql,
				new BeanPropertyRowMapper<>(UsuarioDTO.class)
        	);
        } catch (PersistenceException e) {
			log.error("Error al listar los usuarios");
			throw e;
		}
    }
    
    private void guardarDatos(UsuarioDTO usuario, String sql) {
    	jdbcTemplate.update(
	        sql,
	        new Object[] {
	            usuario.getNombre(),
	            usuario.getApellido(),
	            usuario.getFechaDeNacimiento(),
	            usuario.getEstadoCivil(),
	            usuario.getTieneHermanos(),
	            usuario.getEstado(),
	            usuario.getRoles(),
	        }
    	);
    }

}
