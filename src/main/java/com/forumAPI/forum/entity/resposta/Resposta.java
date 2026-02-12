package com.forumAPI.forum.entity.resposta;

import com.forumAPI.forum.entity.topico.Topico;
import com.forumAPI.forum.entity.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Table(name="resposta")
@Entity(name="Resposta")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String mensagem;
    private LocalDateTime data;
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;
    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;
    private Boolean solucao;

}
