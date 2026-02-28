package com.forumAPI.forum.controller;


import com.forumAPI.forum.entity.perfil.Perfil;
import com.forumAPI.forum.entity.perfil.PerfilDTO;
import com.forumAPI.forum.services.PerfilService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("perfil")
public class PerfilController {
    @Autowired
    private PerfilService perfilService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Perfil cadastraPerfil(@RequestBody @Valid PerfilDTO perfilDTO){
        return perfilService.criaPerfil(perfilDTO);
    }


}
