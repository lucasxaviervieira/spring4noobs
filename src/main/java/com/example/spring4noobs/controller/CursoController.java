package com.example.spring4noobs.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.spring4noobs.model.Curso;
import com.example.spring4noobs.service.CursoService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController("/")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @PostMapping("/curso")
    public void create(@RequestBody Curso curso) {
        service.create(curso);
    }

    @GetMapping("/curso")
    public List<Curso> read() {
        return service.read();
    }

    @GetMapping("/curso/{id}")
    public ResponseEntity<Curso> readOne(@PathVariable Long id) {
        return ResponseEntity.ok(service.readOne(id));
    }

    @PutMapping("curso/{id}/{nome}")
    public ResponseEntity<String> update(@PathVariable("nome") String nomeCurso, @PathVariable("id") Long id) {
        service.update(nomeCurso, id);
        return ResponseEntity.ok("Nome do curso alterado");
    }

    @DeleteMapping("/curso/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

}
