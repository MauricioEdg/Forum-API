package com.forumAPI.forum.services;

import com.forumAPI.forum.entity.curso.Curso;
import com.forumAPI.forum.entity.curso.CursoRepository;
import com.forumAPI.forum.entity.topico.Topico;
import com.forumAPI.forum.entity.topico.TopicoRepository;
import com.forumAPI.forum.entity.topico.TopicosDTO;
import com.forumAPI.forum.entity.usuario.Usuario;
import com.forumAPI.forum.entity.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepo;

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private CursoRepository cursoRepo;

    public Topico criar(TopicosDTO dto){

        Usuario autor = usuarioRepo.findById(dto.autorId()).orElseThrow();
        Curso curso = cursoRepo.findById(dto.cursoId()).orElseThrow();

        Topico topico = new Topico();
        topico.setTitulo(dto.titulo());
        topico.setMensagem(dto.mensagem());
        topico.setData_criacao(dto.data_criacao());
        topico.setStatus(dto.status());
        topico.setAutor(autor);
        topico.setCurso(curso);

        return topicoRepo.save(topico);
    }
}

