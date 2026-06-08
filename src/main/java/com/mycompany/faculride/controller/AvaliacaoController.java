/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.controller;
import com.mycompany.faculride.dao.AvaliacaoDAO;
import com.mycompany.faculride.model.Avaliacao;
import java.sql.ResultSet;
/**
 *
 * @author livia
 */

public class AvaliacaoController {

    private AvaliacaoDAO avaliacaoDAO =
    new AvaliacaoDAO();


    public void avaliarMotorista(
        Avaliacao avaliacao
    ) {

        avaliacaoDAO.salvar(
            avaliacao
        );
    }


    public ResultSet listarAvaliacoes() {

    return avaliacaoDAO.listarAvaliacoes();

}
    public double calcularMedia(
        String motorista
) {

    return avaliacaoDAO.calcularMedia(
        motorista
    );
}
}