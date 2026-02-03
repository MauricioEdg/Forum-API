package com.forumAPI.forum.entity.topico;


import com.forumAPI.forum.entity.curso.CursosDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record TopicosDTO(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        LocalDateTime dataCriacao,
        @NotNull
        StatusMensagemEnum status,
        String autor,
        @NotNull
        @Valid
        CursosDTO curso

) {
}
