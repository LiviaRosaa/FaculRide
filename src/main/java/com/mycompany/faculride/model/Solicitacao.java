/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.model;

/**
 *
 * @author livia
 */
public class Solicitacao {

    private int id;
    private String status;

    public Solicitacao() {}

    public Solicitacao(int id, String status, Usuario passageiro, Carona carona) {
        this.id = id;
        this.status = status;
    }

    // Métodos 
    public void enviarSolicitacao() {}

    public void responderSolicitacao() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

}
