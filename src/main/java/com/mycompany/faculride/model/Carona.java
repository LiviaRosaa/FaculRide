/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.model;

import java.time.LocalDateTime;

/**
 *
 * @author livia
 */
public class Carona {

    private int id;
    private String motorista;
    private String origem;
    private String destino;
    private String horario;
    private double valor;
    private String status;

    public Carona() {}

    public Carona(int id, String origem, String destino, String horario, double valor, String status, String motorista) {
        this.id = id;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.horario = horario;
        this.valor = valor;
        this.status = status;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }

    public String getMotorista() { return motorista; }
    public void setMotorista(String motorista) { this.motorista = motorista; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

}