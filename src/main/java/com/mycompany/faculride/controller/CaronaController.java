/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculride.controller;
import com.mycompany.faculride.dao.CaronaDAO;
import com.mycompany.faculride.model.Carona;
/**
 *
 * @author livia
 */

public class CaronaController {

    private CaronaDAO caronaDAO =
    new CaronaDAO();


    public void oferecerCarona(
        Carona carona
    ) {

        caronaDAO.salvar(carona);

    }


    public void listarCaronas() {

        caronaDAO.listarCaronas();

    }


    public void atualizarStatus(
        Carona carona
    ) {

        caronaDAO.atualizarStatus(
            carona
        );
    }
}