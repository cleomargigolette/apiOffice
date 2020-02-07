package com.api.raccoltoemoraes.controller;

import com.api.raccoltoemoraes.domain.Consultor;
import com.api.raccoltoemoraes.service.consultor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultor")
public class ControllerConsultor {

    @Autowired
    private ServiceBuscarConsultorPeloID buscarConsultorPeloID;

    @Autowired
    private ServiceSalvarConsultor salvarConsultor;

    @Autowired
    private ServiceEditarConsultor editarConsultor;

    @Autowired
    private ServiceBuscarTodosConsultores buscarTodosConsultores;

    @Autowired
    private ServiceDeletarConsultor deletarConsultor;

    @Autowired
    private ServiceBuscarTodosConsultoresAtivos buscarTodosConsultoresAtivos;

    @PostMapping()
    public ResponseEntity<Consultor> salvarConsultor(Consultor consultor) {
        return ResponseEntity.status(201).body(salvarConsultor.salvar(consultor));
    }

    @GetMapping("/id")
    public ResponseEntity<Consultor> buscarConsultorPeloId(@PathVariable Long id) {
        return ResponseEntity.status(200).body(buscarConsultorPeloID.buscaPeloId(id));
    }

    @GetMapping
    public ResponseEntity<List<Consultor>> buscarTodosConsultores() {
        return ResponseEntity.status(200).body(buscarTodosConsultores.buscaTodosConsultores());
    }

    @GetMapping("/ativos")
    public ResponseEntity<List<Consultor>> buscarTodosConsultoresAtivos() {
        return ResponseEntity.status(200).body(buscarTodosConsultoresAtivos.buscarTodosAtivos());
    }
}
