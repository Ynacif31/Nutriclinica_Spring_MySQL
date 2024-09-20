package com.ygor.nutriclinica.nutriclinica.resources;

import com.ygor.nutriclinica.nutriclinica.entities.Paciente;
import com.ygor.nutriclinica.nutriclinica.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {

    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity<List<Paciente>> findAll() {
        List<Paciente> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
