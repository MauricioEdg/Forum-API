package com.forumAPI.forum.entity.perfil;

import jakarta.validation.constraints.NotBlank;

public record PerfilDTO(
        Long id,
        @NotBlank
        String nome

) {
}
