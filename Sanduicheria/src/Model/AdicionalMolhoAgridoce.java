/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
// codprod = 8
public class AdicionalMolhoAgridoce extends Adicional {

    public AdicionalMolhoAgridoce(Produto sanduiche) {
        super(sanduiche);
    }
//
//    @Override
//    public String getDescricao() {
//        return sanduiche.getDescricao() + " com Molho agridoce";
//    }
//
//    @Override
//    public float getPreco() {
//        return sanduiche.getPreco() + c.getPrecoProduto(-5);
//    }

    @Override
    public float getVlrprod() {
        return sanduiche.getVlrprod() + c.getPrecoProduto(-5);
    }

}
