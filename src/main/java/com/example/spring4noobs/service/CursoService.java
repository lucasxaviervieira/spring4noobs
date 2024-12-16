package com.example.spring4noobs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring4noobs.model.Curso;
import com.example.spring4noobs.repository.CursoRepository;

@Service
public class CursoService {

    private final CursoRepository repository;

    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }

    public void create(Curso curso) {
        repository.save(curso);
    }

    public List<Curso> read() {
        return repository.findAll();
    }

    public Curso readOne(Long idCurso) {
        return repository.findById(idCurso).get();
    }

    public void update(String nomeCurso, Long id) {
        Curso cursoExistente = readOne(id);
        cursoExistente.setNomeCurso(nomeCurso);
        repository.save(cursoExistente);
    }

    public void delete(Long idCurso) {
        repository.deleteById(idCurso);
    }
}
