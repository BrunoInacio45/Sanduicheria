/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
// codprod = 3
public class SanduicheArabe extends Produto {

    public SanduicheArabe(int codprod, String descrprod, float vlrprod, int qtdprod) {
        super(codprod, descrprod, vlrprod, qtdprod);
    }

    @Override
    public float getVlrprod() {
        return c.getPrecoProduto(-1);
    }

//    public String getDescricao() {
//        return "Sanduiche Árabe (Kebab): Pão Sírio, carne assada, molho de Kefir, rúcula";
//    }
}
