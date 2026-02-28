package com.forumAPI.forum.entity.perfil;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PerfilDTO(
        Long id,
        @NotBlank
        String nome,
        @NotNull
        String senha

) {
}
