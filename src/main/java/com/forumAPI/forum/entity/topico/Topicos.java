package com.forumAPI.forum.entity.topico;

import java.time.LocalDateTime;

public record Topicos(
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        StatusMensagemEnum status,
        String autor,
        String curso

) {
}
