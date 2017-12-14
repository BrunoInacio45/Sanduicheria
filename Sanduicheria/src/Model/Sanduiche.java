/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConexaoBancoDeDados;

/**
 *
 */
public abstract class Sanduiche extends Produto {

    protected ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();

    public Sanduiche(int codprod, String descrprod, float vlrprod, int qtdprod) {
        super(codprod, descrprod, vlrprod, qtdprod);
    }

}
