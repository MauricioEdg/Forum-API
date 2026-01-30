package com.forumAPI.forum.entity.resposta;

import com.forumAPI.forum.entity.topico.Topico;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name="resposta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String mensagem;
    @NotBlank
    private Topico topico;
    private LocalDateTime data;
    @NotBlank
    private String autor;
    @NotBlank
    private String solucao;

}
