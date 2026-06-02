/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.view;

import connection.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author livia
 */
public class TesteConexao {

    public static void main(String[] args) {

        try {

            Connection conn =
                    ConnectionFactory.getConnection();

            System.out.println(
                    "Conectado com sucesso!"
            );

            conn.close();

        } catch (Exception e) {

            System.out.println(
                    "Erro: " + e.getMessage()
            );
        }
    }
}
