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
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity cadastrar(@RequestBody @Valid TopicosDTO dto, UriComponentsBuilder uriBuilder){
         var topico = new Topico(dto);
         repository.save(topico);

         var uri = uriBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
         
         return ResponseEntity.created(uri).body(new DadosMedicoAtualizado(topico));
    }

    @GetMapping
    public ResponseEntity<Page<TopicoListagem>> listarTopico(@PageableDefault(size = 10, sort = {"titulo"}) Pageable pageable){
        var page = repository.findAll(pageable)
                .map(TopicoListagem::new);
        return ResponseEntity.ok(page);

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
    public ResponseEntity atualizar(@RequestBody @Valid TopicoDadosAtualizacao dados){
        var topico = repository.getReferenceById(dados.id());
        topico.atualizarDados(dados);

        return ResponseEntity.ok(new DadosMedicoAtualizado(topico));
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletarTopico(@PathVariable Long id){
        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity detalhar(@PathVariable Long id){
       var topico = repository.getReferenceById(id);
        return ResponseEntity.ok(new TopicoListagem(topico));
    }
}


