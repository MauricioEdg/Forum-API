package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.topico.Topico;
import com.forumAPI.forum.entity.topico.TopicoRepository;
import com.forumAPI.forum.entity.topico.TopicosDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topico")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid TopicosDTO topicos){
        repository.save(new Topico(topicos));

    }

}
