package com.forumAPI.forum.services;

import com.forumAPI.forum.entity.resposta.Resposta;
import com.forumAPI.forum.entity.resposta.RespostaDTO;
import com.forumAPI.forum.entity.resposta.RespostaRepository;
import com.forumAPI.forum.entity.topico.Topico;
import com.forumAPI.forum.entity.topico.TopicoRepository;
import com.forumAPI.forum.entity.usuario.Usuario;
import com.forumAPI.forum.entity.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private TopicoRepository topicoRepository;

    public Resposta criaResposta(RespostaDTO r){
        Usuario usuario = usuarioRepository.findById(r.autorId()).orElseThrow();
        Topico topico = topicoRepository.findById(r.topicoId()).orElseThrow();

        Resposta resposta = new Resposta();
        resposta.setMensagem(r.mensagem());
        resposta.setData_criacao(r.data_criacao());
        resposta.setAutor(usuario);
        resposta.setTopico(topico);
        resposta.setSolucao(r.solucao());

        return respostaRepository.save(resposta);
    }
}
