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
public class PagamentoAVista implements PagamentoCommand {

    @Override
    public String processaCompra(Pedido pedido) {//Pagamento a vista simplesmente
        ArrayList<String> aux = new ArrayList();
        pedido.getTrocoEmNotas().notasTroco(pedido.calcTroco(), aux);
        String troco = "Pagamento à vista:\nTroco:\n";
        for (String y : aux) {
            troco = troco + y + "\n";
        }
        return troco;
    }

}
