package com.co.personalsoft.usuario.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConstantesUsuarios {

	public static final String LISTAR_USUARIO = "SELECT * FROM USUARIOS";
	
	public static final String CREAR_USUARIO = "INSERT INTO usuarios("
            + "nombre, "
            + "apellido, "
            + "fechaDeNacimiento, "
            + "estadoCivil, "
            + "tieneHermanos, "
            + "estado, "
            + "roles) "
            + "values(?,?,?,?,?,?,?)";
	
	public static final String EDITAR_USUARIO = "UPDATE USUARIOS SET "
			+ "nombre=?, "
			+ "apellido=?, "
			+ "fechaDeNacimiento=?, "
			+ "estadoCivil=?, "
			+ "tieneHermanos=?, "
			+ "estado=?, "
			+ "roles=? "
			+ "WHERE id=";
}
