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
    private String motorista;

    public Avaliacao() {}

    public Avaliacao(int id, int nota, String motorista, Usuario passageiro) {
        this.id = id;
        this.nota = nota;
        this.motorista = motorista;
    }

    // Método
    public void avaliar() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getNota() { return nota; }
    public void setNota(int nota) { this.nota = nota; }

    public String getMotorista() { return motorista; }
    public void setMotorista(String motorista) { this.motorista = motorista; }

}