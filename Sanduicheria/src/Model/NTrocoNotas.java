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
public class NTrocoNotas extends TrocoNotas {

    public NTrocoNotas(double value) {
        super(value);

    }

    @Override
    public void notasTroco(double troco, ArrayList<String> s) {
//        Long qtdNotas = Math.round(troco / this.getNotaMoeda());
        int qtdNotas = (int) (troco / this.getNotaMoeda());
//        System.out.println(troco / this.getNotaMoeda());
        double resto = troco % this.getNotaMoeda();

        if (resto != 0 && this.getNext() != null) {
//            this.getNotas().add(qtdNotas + " de" + getNotaMoeda());
            if (qtdNotas != 0) {
                s.add(qtdNotas + " de " + getNotaMoeda());
            }
//            System.out.println(qtdNotas + " de" + getNotaMoeda());
//            System.out.println("Resto: " + resto);
            this.getNext().notasTroco(resto, s);
        } else {
//            this.getNotas().add(qtdNotas + " de " + getNotaMoeda() + "\n");
            s.add(qtdNotas + " de " + getNotaMoeda());
//            System.out.println(qtdNotas + " de " + getNotaMoeda());
//            System.out.println("Resto: " + resto);
        }

    }

}
