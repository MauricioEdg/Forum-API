package com.forumAPI.forum.entity.topico;

import java.time.LocalDateTime;

public record TopicoListagem(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime data_criação,
        String status,
        String autor,
        String curso
) {
    public TopicoListagem(Topico topico){
        this(
                topico.getId(), 
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getData_criacao(),
                topico.getStatus().name(),
                topico.getAutor().getNome(),
                topico.getCurso().getNome()
        );
    }
}
