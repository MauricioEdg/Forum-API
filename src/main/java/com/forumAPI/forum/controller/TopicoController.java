package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.topico.*;
import com.forumAPI.forum.services.TopicoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public Page<TopicoListagem> listarTopico(@PageableDefault(size = 10, sort = {"titulo"}) Pageable pageable){
        return repository.findAll(pageable)
                .map(TopicoListagem::new);

    }
    @GetMapping("/{id}")
    public ResponseEntity<TopicoListagem> buscaPorId(@PathVariable Long id){
        Topico topico = repository.findById(id)
                .orElseThrow(()->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "topico nao encontrado")
                        );
        return ResponseEntity.ok(new TopicoListagem(topico));
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid TopicoDadosAtualizacao dados){
        var topico = repository.getReferenceById(dados.id());
        topico.atualizarDados(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void deletarTopico(@PathVariable Long id){
        repository.deleteById(id);
    }
}


