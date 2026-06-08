/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.dao;

import com.mycompany.faculride.model.Solicitacao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author livia
 */
public class SolicitacaoDAO {

   public void salvar(
        Solicitacao solicitacao
) {

    String sql =
        "INSERT INTO solicitacao "
      + "(passageiro, motorista, status, id_carona) "
      + "VALUES (?, ?, ?, ?)";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            solicitacao.getPassageiro()
        );

        stmt.setString(
            2,
            solicitacao.getMotorista()
        );

        stmt.setString(
            3,
            solicitacao.getStatus()
        );
        
        stmt.setInt(
            4,
            solicitacao.getId_carona()
        );

        stmt.executeUpdate();

        stmt.close();
        conn.close();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}
   
  public ResultSet listarSolicitacoesRecebidas(
        String motorista
) {

    String sql =
        "SELECT s.id, s.id_carona, s.passageiro, s.status, "
      + "c.origem, c.destino, c.horario, c.valor "
      + "FROM solicitacao s "
      + "JOIN carona c "
      + "ON s.id_carona = c.id "
      + "WHERE s.motorista = ?";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            motorista
        );

        return stmt.executeQuery();

    } catch (SQLException e) {

        e.printStackTrace();
    }

    return null;
}
   
  public ResultSet listarSolicitacoesEnviadas(
        String passageiro
) {

    String sql =
        "SELECT s.status, "
      + "s.id, c.motorista, c.origem, c.destino, "
      + "c.horario, c.valor "
      + "FROM solicitacao s "
      + "JOIN carona c "
      + "ON s.id_carona = c.id "
      + "WHERE s.passageiro = ?";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            passageiro
        );

        return stmt.executeQuery();

    } catch (SQLException e) {

        e.printStackTrace();
    }

    return null;
}

    public void aceitarSolicitacao(
        Solicitacao solicitacao
) {

    String sql =
        "UPDATE solicitacao "
      + "SET status = ? "
      + "WHERE id = ?";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            "Aceita"
        );

        stmt.setInt(
            2,
            solicitacao.getId()
        );

        stmt.executeUpdate();

        stmt.close();
        conn.close();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}

    public void recusarSolicitacao(
        Solicitacao solicitacao
) {

    String sql =
        "UPDATE solicitacao "
      + "SET status = ? "
      + "WHERE id = ?";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setString(
            1,
            "Recusada"
        );

        stmt.setInt(
            2,
            solicitacao.getId()
        );

        stmt.executeUpdate();

        stmt.close();
        conn.close();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}
    public void excluir(
        int id
) {

    String sql =
        "DELETE FROM solicitacao "
      + "WHERE id = ?";

    try {

        Connection conn =
            ConnectionFactory.getConnection();

        PreparedStatement stmt =
            conn.prepareStatement(sql);

        stmt.setInt(
            1,
            id
        );

        stmt.executeUpdate();

        stmt.close();
        conn.close();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}
    }

    
