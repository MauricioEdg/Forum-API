package com.forumAPI.forum.entity.curso;

import jakarta.validation.constraints.NotBlank;

public record CursosDTO(
        @NotBlank
        String nome,
        @NotBlank
        String categoria

) {
}
