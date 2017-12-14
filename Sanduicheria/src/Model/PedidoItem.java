/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAo.ConexaoBancoDeDados;

/**
 *
 */
public class PedidoItem {

    private int nuped;
    private int codprod;
    private int qtdprod;
    private float vlrAdic;
    private String descAdic;

    public String getDescAdic() {
        return descAdic;
    }

    public float getVlrAdic() {
        return vlrAdic;
    }

    public void setVlrAdic(float vlrAdic) {
        this.vlrAdic = vlrAdic;
    }

    public void setDescAdic(String descAdic) {
        this.descAdic = descAdic;
    }
    public ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();

    public PedidoItem(int nuped, int codprod, int qtdprod, float vlrAdic, String descAdic) {
        this.nuped = nuped;
        this.codprod = codprod;
        this.qtdprod = qtdprod;
        this.vlrAdic = vlrAdic;
        this.descAdic = descAdic;
    }

    public String toString() {
        return "Item: " + Integer.toString(this.codprod) + " Quantidade: " + Integer.toString(this.qtdprod);
    }

    public int getNuped() {
        return nuped;
    }

    public void setNuped(int nuped) {
        this.nuped = nuped;
    }

    public int getCodprod() {
        return codprod;
    }

    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }

    public int getQtdprod() {
        return qtdprod;
    }

    public void setQtdprod(int qtdprod) {
        this.qtdprod = qtdprod;
    }

    public void cadastraItemPed() {
        c.cadastraItemPed(this.nuped, this.codprod, this.qtdprod, this.vlrAdic, this.descAdic);
    }
}
