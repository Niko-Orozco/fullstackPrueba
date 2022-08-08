package com.co.personalsoft.usuario.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.personalsoft.usuario.dto.UsuarioDTO;
import com.co.personalsoft.usuario.service.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = { "Servicio Usuarios" })
@RestController
@CrossOrigin
@RequestMapping("/api-admin-ms-usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

    @ApiOperation(value = "Motodo para adicionar usuarios", nickname = "crearUsuario")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200", response = String.class),
            @ApiResponse(code = 400, message = "400")
    })
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearUsuario(
            @RequestBody
            @NotNull()
            UsuarioDTO usuario) {
            return new ResponseEntity<>(usuarioService.crearUsuario(usuario), HttpStatus.OK);
    }
    
    @ApiOperation(value = "Motodo para adicionar usuarios", nickname = "editarUsuarios")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200", response = UsuarioDTO.class),
            @ApiResponse(code = 400, message = "400")
    })
    @PostMapping(value = "/editar-usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UsuarioDTO> editarUsuario(
            @RequestBody
            @NotNull()
            UsuarioDTO usuario) {
            return new ResponseEntity<>(usuarioService.editarUsuario(usuario), HttpStatus.OK);
    }
    
    @ApiOperation(value = "Motodo para adicionar usuarios", nickname = "listarUsuario")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200", response = UsuarioDTO.class),
            @ApiResponse(code = 400, message = "400")
    })
    @GetMapping(value = "/listar-usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UsuarioDTO>> listarUsuario() {
            return new ResponseEntity<>(usuarioService.listarUsuario(), HttpStatus.OK);
    }
}
