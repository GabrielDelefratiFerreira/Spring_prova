package com.example.ElielProva.Repositories;

import com.example.ElielProva.Models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}