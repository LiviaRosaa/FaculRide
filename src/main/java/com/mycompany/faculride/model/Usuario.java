/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.model;

/**
 *
 * @author livia
 */
public class Usuario {
    private String nome;
    private String email;
    private String curso;
    private String senha;

    public Usuario() {}

    public Usuario(String nome, String email, String curso, String senha) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.senha = senha;
    }

    // Métodos
    public void login() {}

    public void cadastrar() {}

    public void atualizarConta() {}

    public void excluirConta() {}

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}