package com.forumAPI.forum.entity.resposta;

import com.forumAPI.forum.entity.topico.Topico;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String mensagem;
    @ManyToOne
    private Topico topico;
    private LocalDateTime data;
    @NotBlank
    private String autor;
    @NotBlank
    private String solucao;

}
