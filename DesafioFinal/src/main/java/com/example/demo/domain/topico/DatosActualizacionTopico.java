package com.example.demo.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizacionTopico(
        @NotNull Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_de_creacion,
        String status,
        String autor,
        String curso
) {
}
