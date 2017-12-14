/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
// codprod = 5
public class SanduicheXTudo extends Sanduiche {

    public SanduicheXTudo(int codprod, String descrprod, float vlrprod, int qtdprod) {
        super(codprod, descrprod, vlrprod, qtdprod);
    }

    public float getVlrprod() {
        return c.getPrecoProduto(-3);
    }

//    public String getDescricao() {
//        return "X-Tudo  Pão, filet mignon, alface, tomate, hamburger, salsicha, ovo frito, milho, batata palha, bacon, mussarela, presunto";
//    }
}
