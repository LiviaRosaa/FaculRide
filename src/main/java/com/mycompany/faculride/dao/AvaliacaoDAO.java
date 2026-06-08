/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.dao;

import com.mycompany.faculride.model.Avaliacao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author livia
 */
public class AvaliacaoDAO {

   public void salvar(
        Avaliacao avaliacao
) {
System.out.println("SALVANDO AVALIAÇÃO");
    String sql =
        "INSERT INTO avaliacao "
      + "(motorista, nota) "
      + "VALUES (?, ?)";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            avaliacao.getMotorista()
        );

        stmt.setInt(
            2,
            avaliacao.getNota()
        );

        stmt.executeUpdate();

        stmt.close();
        conn.close();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}

    public ResultSet listarAvaliacoes() {

    String sql =
        "SELECT * FROM avaliacao";

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
    public double calcularMedia(
        String motorista
) {

    String sql =
        "SELECT AVG(nota) AS media "
      + "FROM avaliacao "
      + "WHERE motorista = ?";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            motorista
        );

        ResultSet rs =
            stmt.executeQuery();

        if (rs.next()) {

            return rs.getDouble(
                "media"
            );
        }

    } catch (SQLException e) {

        e.printStackTrace();
    }

    return 0;
}
}
