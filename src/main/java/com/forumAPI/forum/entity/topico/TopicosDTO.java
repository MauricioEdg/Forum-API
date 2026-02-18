package com.forumAPI.forum.entity.topico;


import com.forumAPI.forum.entity.curso.CursosDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record TopicosDTO(
        String titulo,
        String mensagem,
        LocalDateTime data_criacao,
        StatusMensagemEnum status,
        Long autorId,
        Long cursoId
) {}
