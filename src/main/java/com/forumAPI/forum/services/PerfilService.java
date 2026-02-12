package com.forumAPI.forum.services;

import com.forumAPI.forum.entity.perfil.Perfil;
import com.forumAPI.forum.entity.perfil.PerfilDTO;
import com.forumAPI.forum.entity.perfil.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository repository;

    public Perfil criaPerfil(PerfilDTO p){
        Perfil perfil = new Perfil();
        perfil.setNome(p.nome());
        System.out.println(perfil.getNome());
        return repository.save(perfil);
    }
}
