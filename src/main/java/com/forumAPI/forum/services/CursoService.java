package com.forumAPI.forum.services;

import com.forumAPI.forum.entity.curso.Curso;
import com.forumAPI.forum.entity.curso.CursoRepository;
import com.forumAPI.forum.entity.curso.CursosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;

    public Curso criar(CursosDTO dto){
        Curso curso = new Curso();
        curso.setNome(dto.nome());
        curso.setCategoria(dto.categoria());

        return repository.save(curso);
    }
}
