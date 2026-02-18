package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.topico.Topico;
import com.forumAPI.forum.entity.topico.TopicoListagem;
import com.forumAPI.forum.entity.topico.TopicoRepository;
import com.forumAPI.forum.entity.topico.TopicosDTO;
import com.forumAPI.forum.services.TopicoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topico")
public class TopicoController {

    @Autowired
    private TopicoService service;
    @Autowired
    private TopicoRepository repository;
    @PostMapping
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public Topico cadastrar(@RequestBody @Valid TopicosDTO dto){
        return service.criar(dto);
    }

    @GetMapping
    public Page<TopicoListagem> listarTopico(@PageableDefault(size = 10, sort = {"nome"}) Pageable pageable){
        return repository.findAll(pageable)
                .map(TopicoListagem::new);

    }
}


