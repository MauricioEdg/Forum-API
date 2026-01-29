package com.forumAPI.forum.controller;

import com.forumAPI.forum.topico.Topicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topico")
public class TopicoController {

    @PostMapping
    public void cadastrar(@RequestBody Topicos topicos){
        System.out.println(topicos);
    }

}
