package com.example.BDPostgres.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigomateria;
    private String nombremateria;
    private String Profesor;

    @ManyToOne
    @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesor;

    @ManyToMany(mappedBy = "materias")
    private List<Estudiante> estudiantes;

    public Materia() {
    }

    public Materia(long codigomateria, String nombremateria, String profesor) {
        this.codigomateria = codigomateria;
        this.nombremateria = nombremateria;
        this.Profesor = profesor;
    }

    public long getCodigomateria() {
        return codigomateria;
    }

    public void setCodigomateria(long codigomateria) {
        this.codigomateria = codigomateria;
    }

    public String getNombremateria() {
        return nombremateria;
    }

    public void setNombremateria(String nombremateria) {
        this.nombremateria = nombremateria;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String profesor) {
        this.Profesor = profesor;
    }
}
