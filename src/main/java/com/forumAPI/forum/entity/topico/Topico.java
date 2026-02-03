package com.forumAPI.forum.entity.topico;

import com.forumAPI.forum.entity.curso.Curso;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Table(name="topico")
@Entity(name="Topico")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
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
    @Enumerated(EnumType.STRING)
    private StatusMensagemEnum status;
    @NotBlank
    private String autor;
    @ManyToOne
    private Curso curso;


    public Topico(TopicosDTO topicos) {
        this.titulo = topicos.titulo();
        this.mensagem = topicos.mensagem();
        this.data = topicos.dataCriacao();
        this.status = topicos.status();
        this.autor = topicos.autor();
        this.curso = new Curso(topicos.curso());
    }
}
