/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
// codprod = 7
public class AdicionalErvasFinas extends Adicional {

    public AdicionalErvasFinas(Produto sanduiche) {
        super(sanduiche);
    }

//    @Override
//    public String getDescricao() {
//        return sanduiche.getDescricao() + " com Ervas Finas";
//    }
//
//    @Override
//    public float getPreco() {
//        return sanduiche.getPreco() + c.getPrecoProduto(-6);
//    }
    @Override
    public float getVlrprod() {
        return sanduiche.getVlrprod() + c.getPrecoProduto(-6);
    }

}
