package com.forumAPI.forum.services;

import com.forumAPI.forum.entity.perfil.Perfil;
import com.forumAPI.forum.entity.perfil.PerfilRepository;
import com.forumAPI.forum.entity.usuario.Usuario;
import com.forumAPI.forum.entity.usuario.UsuarioDTO;
import com.forumAPI.forum.entity.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private PerfilRepository perfilRepository;



    public Usuario criaUsuario(UsuarioDTO u){
        Perfil perfil = perfilRepository.findById(u.perfilId()).orElseThrow();

        Usuario usuario = new Usuario();
        usuario.setEmail(u.email());
        usuario.setNome(u.nome());
        usuario.setSenha(u.senha());
        usuario.setPerfil(perfil);

        return repository.save(usuario);
    }

}
