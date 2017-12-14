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
 * @author Nicolas
 */
public abstract class AbstractProduto {

    private int codprod;
    protected String descrprod;
    protected float vlrprod;
    private int qtdprod;

    protected ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();

    public AbstractProduto(int codprod, String descrprod, float vlrprod, int qtdprod) {
        this.codprod = codprod;
        this.descrprod = descrprod;
        this.vlrprod = vlrprod;
        this.qtdprod = qtdprod;
    }

    public AbstractProduto() {

    }

    @Override
    public String toString() {
        return this.descrprod;
    }

    public abstract String getDescrprod();

    public void setDescrprod(String descrprod) {
        this.descrprod = descrprod;
    }

    public abstract float getVlrprod();

    public void setVlrprod(float vlrprod) {
        this.vlrprod = vlrprod;
    }

    public int getQtdprod() {
        return qtdprod;
    }

    public void setQtdprod(int qtdprod) {
        this.qtdprod = qtdprod;
    }

    public int getCodprod() {
        return codprod;
    }

    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }

    public static ArrayList<Produto> getProdutos() {
        return ConexaoBancoDeDados.getInstance().getProdutos();
    }

    public static ArrayList<Produto> getAdicionais() {
        return ConexaoBancoDeDados.getInstance().getAdicionais();
    }

}
