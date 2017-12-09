/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public abstract class TrocoNotas {

    private TrocoNotas next;
    private double notaMoeda;
    private final ArrayList<String> notas = new ArrayList<String>();

    public TrocoNotas(double notaMoeda) {

        this.notaMoeda = notaMoeda;

    }

    public double getNotaMoeda() {
        return notaMoeda;
    }

    public void setNotaMoeda(double notaMoeda) {
        this.notaMoeda = notaMoeda;
    }

    public TrocoNotas getNext() {
        return next;
    }

    public void setNext(TrocoNotas next) {
        this.next = next;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public abstract void notasTroco(double troco, ArrayList<String> s);

}
