package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.curso.Curso;
import com.forumAPI.forum.entity.curso.CursoRepository;
import com.forumAPI.forum.entity.curso.CursosDTO;
import com.forumAPI.forum.services.CursoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("curso")
public class CursoController {

    private CursoService service;

    @ResponseStatus(HttpStatus.CREATED)
    public Curso cadastrar(@RequestBody @Valid CursosDTO dto) {
        return service.criar(dto);
    }
}