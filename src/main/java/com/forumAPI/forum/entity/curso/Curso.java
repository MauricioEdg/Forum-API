package com.forumAPI.forum.entity.curso;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Table(name = "curso")
@Entity(name="Curso")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String categoria;

    public Curso(CursosDTO c) {
        this.nome = c.nome();
        this.categoria = c.categoria();
    }


}
