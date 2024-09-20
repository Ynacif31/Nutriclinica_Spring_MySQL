package com.ygor.nutriclinica.nutriclinica.services;

import com.ygor.nutriclinica.nutriclinica.entities.Paciente;
import com.ygor.nutriclinica.nutriclinica.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> findAll() {
        return repository.findAll();
    }

    public Paciente pacienteSave(Paciente id){
        return repository.save(id);
    }
}
