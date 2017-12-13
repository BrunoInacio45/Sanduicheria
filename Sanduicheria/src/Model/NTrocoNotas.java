/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;
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
        DecimalFormat dm = new DecimalFormat("#0.00");
        DecimalFormat dn = new DecimalFormat("#0");
//        Long qtdNotas = Math.round(troco / this.getNotaMoeda());
        int qtdNotas = (int) (troco / this.getNotaMoeda());
//        System.out.println(troco / this.getNotaMoeda());
        double resto = troco % this.getNotaMoeda();

        if (resto != 0.0d && this.getNext() != null && resto >= 0.05d) {
//            this.getNotas().add(qtdNotas + " de" + getNotaMoeda());
            if (qtdNotas != 0) {
                if (this.getNotaMoeda() > 1.0d) {
                    s.add(qtdNotas + " nota(s) de " + dn.format(getNotaMoeda()));
                } else {
                    s.add(qtdNotas + " moeda(s) de " + dm.format(getNotaMoeda()));
                }
            }
//            System.out.println(qtdNotas + " de" + getNotaMoeda());
//            System.out.println("Resto: " + resto);
            this.getNext().notasTroco(resto, s);
        } else {
//            this.getNotas().add(qtdNotas + " de " + getNotaMoeda() + "\n");

            if (this.getNotaMoeda() > 1.0d) {
                s.add(qtdNotas + " nota(s) de " + dn.format(getNotaMoeda()));
            } else {
                s.add(qtdNotas + " moeda(s) de " + dm.format(getNotaMoeda()));
            }

//            System.out.println(qtdNotas + " de " + getNotaMoeda());
//            System.out.println("Resto: " + resto);
        }

    }

}
