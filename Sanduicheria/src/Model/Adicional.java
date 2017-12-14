/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
public abstract class Adicional extends Produto {

    protected Produto sanduiche;

    public Produto getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(Produto sanduiche) {
        this.sanduiche = sanduiche;
    }

    public Adicional(Produto sanduiche) {
        this.sanduiche = sanduiche;
    }

}
