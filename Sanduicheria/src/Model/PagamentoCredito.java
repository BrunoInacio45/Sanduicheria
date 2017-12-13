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
public class PagamentoCredito implements PagamentoCommand {

    @Override
    public String processaCompra(Pedido pedido) {//Pagamento a vista simplesmente

        pedido.setVlrnota(pedido.getVlrnota() + (pedido.getVlrnota() * 0.09f));
        pedido.setValorPago(pedido.getVlrnota());
        return "O valor cobrado foi:" + pedido.getVlrnota();
    }

}
