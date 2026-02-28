package com.forumAPI.forum.entity.topico;



import java.time.LocalDateTime;

public record TopicosDTO(
        String titulo,
        String mensagem,
        LocalDateTime data_criacao,
        StatusMensagemEnum status,
        Long autorId,
        Long cursoId
) {}
