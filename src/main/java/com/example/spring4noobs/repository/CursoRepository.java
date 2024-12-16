package com.example.spring4noobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring4noobs.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
