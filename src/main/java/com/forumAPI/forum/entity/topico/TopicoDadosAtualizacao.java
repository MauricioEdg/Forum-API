package com.forumAPI.forum.entity.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicoDadosAtualizacao(
        @NotNull
        Long id,
        String titulo,
        String mensagem,
        StatusMensagemEnum status) {
}
