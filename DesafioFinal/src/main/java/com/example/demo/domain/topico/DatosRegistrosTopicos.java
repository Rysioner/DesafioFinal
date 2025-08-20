package com.example.demo.domain.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public record DatosRegistrosTopicos(

        @NotBlank String titulo,
        @NotBlank String mensaje,
        @Future LocalDateTime fecha_de_creacion,
        @NotBlank String status,
        @NotBlank String autor,
        @NotBlank String curso
) {}
