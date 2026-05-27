/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.controller;
import com.mycompany.faculride.dao.UsuarioDAO;
import com.mycompany.faculride.model.Usuario;
/**
 *
 * @author livia
 */

public class UsuarioController {

    private UsuarioDAO usuarioDAO =
    new UsuarioDAO();

    public void cadastrarUsuario(Usuario usuario) {

        usuarioDAO.salvar(usuario);

    }

    public Usuario login(
        String email,
        String senha
    ) {

        return usuarioDAO.login(
            email,
            senha
        );
    }
}
