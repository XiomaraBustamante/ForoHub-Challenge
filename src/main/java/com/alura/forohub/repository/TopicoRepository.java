package com.alura.forohub.repository;

import com.alura.forohub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    // Regla de negocio: No permitir duplicados con mismo título y mensaje
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}