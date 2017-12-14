/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAo.ConexaoBancoDeDados;
import java.util.ArrayList;

/**
 *
 */
public class Produto extends AbstractProduto {

    public Produto(int codprod, String descrprod, float vlrprod, int qtdprod) {
        super(codprod, descrprod, vlrprod, qtdprod);
    }

    @Override
    public float getVlrprod() {
        return this.vlrprod;
    }

    @Override
    public String getDescrprod() {
        return this.descrprod;

    }

}
