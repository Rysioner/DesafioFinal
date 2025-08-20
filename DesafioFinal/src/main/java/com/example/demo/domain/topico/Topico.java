package com.example.demo.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name="topicos")
@Entity(name="topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha_de_creacion;
    private String status;
    private String autor;
    private String curso;

    public Topico(DatosRegistrosTopicos datos) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fecha_de_creacion = fecha_de_creacion;
        this.status = status;
        this.autor = autor;
        this.curso = curso;
    }

    public void actualizarInformaciones(@Valid DatosActualizacionTopico datos) {
        if (datos.titulo() != null){
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() != null){
            this.mensaje = datos.mensaje();
        }
        if (datos.fecha_de_creacion() != null){
            this.fecha_de_creacion = datos.fecha_de_creacion();
        }
        if (datos.status() != null){
            this.status = datos.status();
        }
        if (datos.autor() != null){
            this.autor = datos.autor();
        }
        if (datos.curso() != null){
            this.curso = datos.curso();
        }

    }
    public void eliminar(){
        this.status = "cerrado";}
}
