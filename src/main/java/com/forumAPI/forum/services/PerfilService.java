package com.forumAPI.forum.services;

import com.forumAPI.forum.entity.perfil.Perfil;
import com.forumAPI.forum.entity.perfil.PerfilDTO;
import com.forumAPI.forum.entity.perfil.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public Perfil criaPerfil(PerfilDTO p){
        Perfil perfil = new Perfil();
        perfil.setNome(p.nome());
        perfil.setSenha(encoder.encode(p.senha()));
        return repository.save(perfil);
    }
}
