package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.curso.Curso;
import com.forumAPI.forum.entity.curso.CursosDTO;
import com.forumAPI.forum.services.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("curso")
public class CursoController {

    @Autowired
    private CursoService service;

    @PostMapping
    public Curso cadastrar(@RequestBody @Valid CursosDTO dto) {
        return service.criar(dto);
    }
}