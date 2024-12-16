package com.example.spring4noobs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "4noobs_tb")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCurso;
    private String nomeCurso;
    private String autorCurso;
    private String linkCurso;

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getAutorCurso() {
        return autorCurso;
    }

    public void setAutorCurso(String autorCurso) {
        this.autorCurso = autorCurso;
    }

    public String getLinkCurso() {
        return linkCurso;
    }

    public void setLinkCurso(String linkCurso) {
        this.linkCurso = linkCurso;
    }

}
