package com.forumAPI.forum.entity.topico;

import com.forumAPI.forum.entity.topico.StatusMensagemEnum;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String mensagem;
    @NotNull
    private LocalDateTime data;
    @NotNull
    private StatusMensagemEnum status;
    @NotBlank
    private String autor;
    @NotBlank
    private String curso;


}
