package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.usuario.Usuario;
import com.forumAPI.forum.entity.usuario.UsuarioDTO;
import com.forumAPI.forum.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario cadastraUsuario(@RequestBody @Valid UsuarioDTO usuario){
        return service.criaUsuario(usuario);
    }

}
