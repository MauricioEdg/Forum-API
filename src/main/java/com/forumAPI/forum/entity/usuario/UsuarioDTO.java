package com.forumAPI.forum.entity.usuario;

import com.forumAPI.forum.entity.perfil.Perfil;
import com.forumAPI.forum.entity.perfil.PerfilDTO;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDTO(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String senha,
        Long perfilId
) {
}
