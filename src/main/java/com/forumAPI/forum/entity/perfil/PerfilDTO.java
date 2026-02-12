package com.forumAPI.forum.entity.perfil;

import jakarta.validation.constraints.NotBlank;

public record PerfilDTO(
        @NotBlank
        String nome
) {
}
