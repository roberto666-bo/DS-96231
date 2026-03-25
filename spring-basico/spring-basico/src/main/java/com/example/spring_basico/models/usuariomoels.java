package com.example.spring_basico.models;

import org.hibernate.tool.schema.spi.GenerationTarget;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usuariomoels {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    
    public usuariomoels(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }



}
