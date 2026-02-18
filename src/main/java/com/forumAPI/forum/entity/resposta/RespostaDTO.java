package com.forumAPI.forum.entity.resposta;

import java.time.LocalDateTime;

public record RespostaDTO(
        String mensagem,
        LocalDateTime data_criacao,
        Long topicoId,
        Long autorId,
        Boolean solucao
) {}
