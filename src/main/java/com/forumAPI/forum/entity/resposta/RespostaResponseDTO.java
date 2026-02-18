package com.forumAPI.forum.entity.resposta;

import java.time.LocalDateTime;

public record RespostaResponseDTO(
        Long id,
        String mensagem,
        LocalDateTime data_criacao,
        Long autorId,
        Long topicoId,
        Boolean solucao
) {
    public RespostaResponseDTO(Resposta r){
        this(
                r.getId(),
                r.getMensagem(),
                r.getData_criacao(),
                r.getAutor().getId(),
                r.getTopico().getId(),
                r.getSolucao()
        );
    }
}
