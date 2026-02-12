package com.forumAPI.forum.entity.usuario;

import com.forumAPI.forum.entity.perfil.Perfil;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Table(name = "usuario")
@Entity(name = "Usuario")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @Email
    private String email;
    @NotBlank
    private String senha;
    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

}
