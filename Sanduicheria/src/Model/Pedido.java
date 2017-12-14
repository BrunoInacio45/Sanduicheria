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
public class Pedido {

    private int nuped;
    private float vlrnota;
    private String codcli;
    private double valorPago;
    private TrocoNotas trocoEmNotas;

    public ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();

    public Pedido(int nuped, float vlrnota, String codcli, double vlrPago) {
        this.nuped = nuped;
        this.vlrnota = vlrnota;
        this.codcli = codcli;
        this.valorPago = vlrPago;
        this.trocoEmNotas = this.createChain();

    }

    public int getNuped() {
        return nuped;
    }

    public void setNuped(int nuped) {
        this.nuped = nuped;
    }

    public float getVlrnota() {
        return vlrnota;
    }

    public void setVlrnota(float vlrnota) {
        this.vlrnota = vlrnota;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public ConexaoBancoDeDados getC() {
        return c;
    }

    public void setC(ConexaoBancoDeDados c) {
        this.c = c;
    }

    public double calcTroco() {
        return this.valorPago - this.vlrnota;

    }

    public TrocoNotas getTrocoEmNotas() {
        return trocoEmNotas;
    }

    public void setTrocoEmNotas(TrocoNotas trocoEmNotas) {
        this.trocoEmNotas = trocoEmNotas;
    }

    public void gravaPedido() {
        c.cadastraPedido(this.nuped, this.vlrnota, this.codcli, this.valorPago);
    }

    public TrocoNotas createChain() {
        TrocoNotas n100 = new NTrocoNotas(100.0d);
        TrocoNotas n50 = new NTrocoNotas(50.0d);
        TrocoNotas n20 = new NTrocoNotas(20.0d);
        TrocoNotas n10 = new NTrocoNotas(10.0d);
        TrocoNotas n5 = new NTrocoNotas(5.0d);
        TrocoNotas n2 = new NTrocoNotas(2.0d);
        TrocoNotas n1 = new NTrocoNotas(1.0d);
        TrocoNotas n05 = new NTrocoNotas(0.5d);
        TrocoNotas n025 = new NTrocoNotas(0.25d);
        TrocoNotas n010 = new NTrocoNotas(0.1d);
        TrocoNotas n005 = new NTrocoNotas(0.05d);

        n100.setNext(n50);
        n50.setNext(n20);
        n20.setNext(n10);
        n10.setNext(n5);
        n5.setNext(n2);
        n2.setNext(n1);
        n1.setNext(n05);
        n05.setNext(n025);
        n025.setNext(n010);
        n010.setNext(n005);

        return n100;

    }

    public String executarPagamento(PagamentoCommand pagamento) {
        return pagamento.processaCompra(this);
    }

//    public void teste(){
//        while(this.getTrocoEmNotas().getNext()!=null){
//            System.out.println(this.getTrocoEmNotas().getNext().getNotaMoeda());
//
//        }
//
//
//
//    }
//
    /*
    public ArrayList<PedidoItem> getItensPedido(){
        return c.getItensPedido(this.nuped);
    }*/
}
