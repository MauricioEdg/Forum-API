package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.topico.Topico;
import com.forumAPI.forum.entity.topico.TopicoRepository;
import com.forumAPI.forum.entity.topico.TopicosDTO;
import com.forumAPI.forum.services.TopicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topico")
public class TopicoController {

    @Autowired
    private TopicoService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Topico cadastrar(@RequestBody @Valid TopicosDTO dto){
        return service.criar(dto);
    }
}


