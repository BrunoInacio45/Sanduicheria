/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
// codprod = 4
public class SanduicheVegetariano extends Sanduiche {

    public SanduicheVegetariano(int codprod, String descrprod, float vlrprod, int qtdprod) {
        super(codprod, descrprod, vlrprod, qtdprod);
    }

    public float getVlrprod() {
        return c.getPrecoProduto(-2);
    }

//    public String getDescricao() {
//        return "Sanduiche Vegetariano: Pão Francês, alface, rúcula, mussarela, tomate seco, milho, ovo frito";
//    }
}
