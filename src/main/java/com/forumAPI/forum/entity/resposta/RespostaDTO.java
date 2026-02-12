package com.forumAPI.forum.entity.resposta;

import java.time.LocalDateTime;

public record RespostaDTO(
        String mensagem,
        Long topicoId,
        Long autorId,
        Boolean solucao
) {}
