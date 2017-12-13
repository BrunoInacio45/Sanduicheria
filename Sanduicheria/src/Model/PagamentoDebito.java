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
public class PagamentoDebito implements PagamentoCommand {

    @Override
    public String processaCompra(Pedido pedido) {//Pagamento a vista simplesmente
        pedido.setValorPago(pedido.getVlrnota());
        return "Obrigado pela preferencia";
    }

}
