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
    private int id_carona;
    private String passageiro;
    private String motorista;
    private String status;

    public Solicitacao() {}

    public Solicitacao(int id, int id_carona, String status, String passageiro, String motorista, Carona carona) {
        this.id = id;
        this.id_carona= id_carona;
        this.passageiro = passageiro;
        this.motorista = motorista;
        this.status = status;
    }

    // Métodos 
    public void enviarSolicitacao() {}

    public void responderSolicitacao() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public int getId_carona() { return id_carona; }
    public void setId_carona(int id_carona) { this.id_carona = id_carona; }
    
    public String getPassageiro() { return passageiro; }
    public void setPassageiro(String passageiro) { this.passageiro = passageiro; }
    
    public String getMotorista() { return motorista; }
    public void setMotorista(String motorista) { this.motorista = motorista; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

}
