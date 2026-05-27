/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.controller;
import com.mycompany.faculride.dao.SolicitacaoDAO;
import com.mycompany.faculride.model.Solicitacao;
/**
 *
 * @author livia
 */

public class SolicitacaoController {
    
    private SolicitacaoDAO solicitacaoDAO =
    new SolicitacaoDAO();

   public void solicitarVaga(
        Solicitacao solicitacao
    ) {

        solicitacaoDAO.salvar(
            solicitacao
        );
    }


    public void aceitarSolicitacao(
        Solicitacao solicitacao
    ) {

        solicitacaoDAO
        .aceitarSolicitacao(
            solicitacao
        );
    }


    public void recusarSolicitacao(
        Solicitacao solicitacao
    ) {

        solicitacaoDAO
        .recusarSolicitacao(
            solicitacao
        );
    }
}
