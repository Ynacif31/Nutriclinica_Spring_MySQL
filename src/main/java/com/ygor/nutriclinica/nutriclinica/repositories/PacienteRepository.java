package com.ygor.nutriclinica.nutriclinica.repositories;

import com.ygor.nutriclinica.nutriclinica.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
