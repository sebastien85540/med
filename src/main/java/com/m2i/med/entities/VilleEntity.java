package com.m2i.med.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ville", schema = "medical", catalog = "")
public class VilleEntity {
    private int id;
    private String nom;
    private int codePostal;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "code_postal")
    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VilleEntity that = (VilleEntity) o;
        return id == that.id && codePostal == that.codePostal && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, codePostal);
    }
}
