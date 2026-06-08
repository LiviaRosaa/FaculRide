/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.dao;

import com.mycompany.faculride.model.Usuario;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author livia
 */
public class UsuarioDAO {

   public void salvar(Usuario usuario) {

    String sql =
        "INSERT INTO usuario (nome, email, curso, senha) "
      + "VALUES (?, ?, ?, ?)";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            usuario.getNome()
        );

        stmt.setString(
            2,
            usuario.getEmail()
        );

        stmt.setString(
            3,
            usuario.getCurso()
        );

        stmt.setString(
            4,
            usuario.getSenha()
        );

        System.out.println(
            "Salvando usuário..."
        );

        int linhas =
            stmt.executeUpdate();

        System.out.println(
            "Linhas inseridas: "
            + linhas
        );

        stmt.close();
        conn.close();

    } catch (SQLException e) {

        System.out.println(
            "Erro ao salvar usuário:"
        );

        e.printStackTrace();

    }
}

    public Usuario login(
        String email,
        String senha
) {

    String sql =
            "SELECT * FROM usuario "
            + "WHERE email = ? AND senha = ?";

    try {

        Connection conn =
                ConnectionFactory.getConnection();

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setString(1, email);
        stmt.setString(2, senha);

        ResultSet rs =
                stmt.executeQuery();

        if (rs.next()) {

            Usuario usuario =
                    new Usuario();

            usuario.setId(
                    rs.getInt("id")
            );

            usuario.setNome(
                    rs.getString("nome")
            );

            usuario.setEmail(
                    rs.getString("email")
            );

            usuario.setCurso(
                    rs.getString("curso")
            );

            usuario.setSenha(
                    rs.getString("senha")
            );

            rs.close();
            stmt.close();
            conn.close();

            return usuario;
        }

        rs.close();
        stmt.close();
        conn.close();

    } catch (SQLException e) {

        e.printStackTrace();
    }

    return null;
}
}