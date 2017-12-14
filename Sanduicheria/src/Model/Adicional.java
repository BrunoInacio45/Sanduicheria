/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
public abstract class Adicional extends AbstractProduto {

    protected AbstractProduto sanduiche;

//    public Adicional(int codprod, String descrprod, float vlrprod, int qtdprod) {
////        /super(codprod, descrprod, vlrprod, qtdprod);
//    }
    public Adicional(AbstractProduto sanduiche) {
        this.sanduiche = sanduiche;
    }

    public AbstractProduto getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(Produto sanduiche) {
        this.sanduiche = sanduiche;
    }

}
