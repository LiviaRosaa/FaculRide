/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.dao;

import com.mycompany.faculride.model.Carona;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author livia
 */
public class CaronaDAO {

   public void salvar(Carona carona) {

    String sql =
        "INSERT INTO carona "
      + "(motorista, origem, destino, horario, valor, status) "
      + "VALUES (?, ?, ?, ?, ?, ?)";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            carona.getMotorista()
        );

        stmt.setString(
            2,
            carona.getOrigem()
        );

        stmt.setString(
            3,
            carona.getDestino()
        );

        stmt.setString(
            4,
            carona.getHorario()
        );

        stmt.setDouble(
            5,
            carona.getValor()
        );

        stmt.setString(
            6,
            carona.getStatus()
        );

        System.out.println(
            "Salvando carona..."
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
            "Erro ao salvar carona:"
        );

        e.printStackTrace();
    }
}

    public ResultSet listarCaronas() {

   String sql =
        "SELECT * FROM carona "
      + "WHERE status = 'Disponível'";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        return stmt.executeQuery();

    } catch (SQLException e) {

        e.printStackTrace();
    }

    return null;
}

    public void atualizarStatus(
        Carona carona
) {

    String sql =
        "UPDATE carona "
      + "SET status = ? "
      + "WHERE id = ?";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            carona.getStatus()
        );

        stmt.setInt(
            2,
            carona.getId()
        );

        int linhas =
            stmt.executeUpdate();

        System.out.println(
            "Linhas atualizadas: "
            + linhas
        );

        stmt.close();
        conn.close();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}
   
}
