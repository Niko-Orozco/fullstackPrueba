package com.co.personalsoft.usuario.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioDTO {
	
	private Integer id;

	private String nombre;
	
	private String apellido; 
	
	private String fechaDeNacimiento; 
	
	private String estadoCivil; 
	
	private String tieneHermanos; 
	
	private String estado; 
	
	private String roles;
	
}
