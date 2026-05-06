/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.model;

/**
 *
 * @author livia
 */
public class Avaliacao {

    private int id;
    private int nota;
    private String comentario;

    public Avaliacao() {}

    public Avaliacao(int id, int nota, String comentario, Usuario motorista, Usuario passageiro) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
    }

    // Método
    public void avaliar() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getNota() { return nota; }
    public void setNota(int nota) { this.nota = nota; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

}