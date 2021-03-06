/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AbstractProduto;
import Model.Adicional;
import Model.AdicionalCreamCheese;
import Model.AdicionalErvasFinas;
import Model.AdicionalMolhoAgridoce;
import Model.NTrocoNotas;
import Model.PagamentoAVista;
import Model.PagamentoCredito;
import Model.PagamentoDebito;
import Model.Pedido;
import Model.PedidoItem;
import Model.Produto;

import Model.TrocoNotas;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 */
public class CadastroDePedidos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDePedidos
     */
    private Pedido ped;
    private Vector<PedidoItem> itens;

    public CadastroDePedidos(String codcli) {
        initComponents();
        this.populaComboBoxProdutos();
        this.populaComboBoxAdicionais();
        this.iniciaPedido(codcli);
    }

    private static CadastroDePedidos cadastroPedidos;

    private CadastroDePedidos() {
        cadastroPedidos = this;
        initComponents();
    }

    private void iniciaPedido(String codcli) {
        int nroPed = Math.abs((int) new Date().getTime());
        this.ped = new Pedido(nroPed, 0, codcli, 0); // pedido inicia com valor zero
        this.itens = new Vector();
        this.lbNroPed.setText(Integer.toString(nroPed));
        this.lbCli.setText(codcli);
        this.lbStatus.setText("Nenhum Item adicionado");
        this.lbValorTotal.setText("R$ 0,00");
        this.cbAdicional.setVisible(false);
        LbTPago.setVisible(false);
        TPago.setVisible(false);
    }

    private void populaComboBoxProdutos() {
        ArrayList<Produto> prods = Produto.getProdutos();
        for (Produto p : prods) {
            cbItens.addItem(p);
        }
    }

    private void populaComboBoxAdicionais() {
        ArrayList<Produto> adds = Produto.getAdicionais();
        cbAdicional.addItem(new Produto(-10, "-", 0, 0));
        for (Produto p : adds) {
            cbAdicional.addItem(p);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbItens = new javax.swing.JComboBox<>();
        tfQtdItem = new javax.swing.JTextField();
        btAddItem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbNroPed = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbCli = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        cbAdicional = new javax.swing.JComboBox<>();
        TPago = new javax.swing.JTextField();
        LbTPago = new javax.swing.JLabel();
        RdCredito = new javax.swing.JRadioButton();
        RdDebito = new javax.swing.JRadioButton();
        RdAVista = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cadastro de Pedidos");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbItensActionPerformed(evt);
            }
        });

        btAddItem.setText("Add Item");
        btAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddItemActionPerformed(evt);
            }
        });

        jLabel2.setText("Nro Pedido");

        lbNroPed.setText("jLabel3");

        jLabel3.setText("Cliente:");

        lbCli.setText("jLabel4");

        jLabel4.setText("Status:");

        lbStatus.setText("jLabel5");

        jLabel5.setText("Valor Total:");

        lbValorTotal.setText("jLabel6");

        TPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPagoActionPerformed(evt);
            }
        });

        LbTPago.setText("Total Pago:");

        btnGroup.add(RdCredito);
        RdCredito.setText("Credito");
        RdCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdCreditoActionPerformed(evt);
            }
        });

        btnGroup.add(RdDebito);
        RdDebito.setText("Debito");
        RdDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdDebitoActionPerformed(evt);
            }
        });

        btnGroup.add(RdAVista);
        RdAVista.setText("À vista");
        RdAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdAVistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1)
                .addGap(127, 281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LbTPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TPago, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbValorTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(109, 109, 109)
                                .addComponent(lbStatus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCli))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbNroPed))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbItens, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(118, 118, 118)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfQtdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(RdCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RdDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(RdAVista))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbNroPed))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbCli))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQtdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RdAVista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RdDebito)
                        .addGap(14, 14, 14)
                        .addComponent(RdCredito)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbTPago)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAddItem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValorTotal)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(jButton1))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddItemActionPerformed
        // TODO add your handling code here:

        int codProdAdd = ((Produto) this.cbItens.getSelectedItem()).getCodprod();
        float vlrProdAdd = ((Produto) this.cbItens.getSelectedItem()).getVlrprod(); // valor do prod a ser adicionado no pedido
        int qtdProdAdd = Integer.parseInt(this.tfQtdItem.getText());
        String descProd = "";// qtdade do prod
        descProd = ((Produto) this.cbItens.getSelectedItem()).getDescrprod();
//        float novoValorPed = this.ped.getVlrnota() + vlrProdAdd * qtdProdAdd;
//        this.ped.setVlrnota(novoValorPed);

        if (this.cbAdicional.isVisible() && ((Produto) this.cbAdicional.getSelectedItem()).getCodprod() != -10) {
            AbstractProduto prod = ((Produto) this.cbItens.getSelectedItem());// cod produto a ser adicionado no pedido
            if (codProdAdd == -1 || codProdAdd == -2 || codProdAdd == -3) {
                Produto adicional = (((Produto) this.cbAdicional.getSelectedItem()));
                if (adicional.getCodprod() == -4) {
                    prod = new AdicionalCreamCheese(prod);

                } else if (adicional.getCodprod() == -6) {
                    prod = new AdicionalErvasFinas(prod);
                } else if (adicional.getCodprod() == -5) {

                }

                descProd = prod.getDescrprod();
                vlrProdAdd = prod.getVlrprod();
            }
        }

        float novoValorPed = this.ped.getVlrnota() + vlrProdAdd * qtdProdAdd;
//        this.ped.setVlrnota(novoValorPed);
        // atualiza o valor da nota
        this.ped.setVlrnota(novoValorPed);
        itens.add(new PedidoItem(this.ped.getNuped(), codProdAdd, qtdProdAdd, vlrProdAdd, descProd));
        this.lbStatus.setText("Item " + ((Produto) this.cbItens.getSelectedItem()).toString() + " foi adicionado ao pedido");

        this.lbValorTotal.setText("R$ " + novoValorPed + "\n");
        this.tfQtdItem.setText("");
        this.cbItens.setSelectedIndex(0);
    }//GEN-LAST:event_btAddItemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        int flag = 0;
        String aux = "";
        if (RdAVista.isSelected() && !RdDebito.isSelected() && !RdCredito.isSelected()) {
            this.ped.setValorPago(Float.parseFloat(TPago.getText()));
            aux = ped.executarPagamento(new PagamentoAVista());

            flag++;
        } else if (!RdAVista.isSelected() && RdDebito.isSelected() && !RdCredito.isSelected()) {
            aux = ped.executarPagamento(new PagamentoDebito());

            flag++;
        } else if (!RdAVista.isSelected() && !RdDebito.isSelected() && RdCredito.isSelected()) {
            aux = ped.executarPagamento(new PagamentoCredito());
            flag++;
        }
        JOptionPane.showMessageDialog(null, aux);
        if (flag == 1) {
            this.SalvaPedidoBanco();
            this.SalvaItensPedidoBanco();
            this.EncerraPedido();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbItensActionPerformed

        if (((Produto) this.cbItens.getSelectedItem()).getCodprod() == -1 || ((Produto) this.cbItens.getSelectedItem()).getCodprod() == -2 || ((Produto) this.cbItens.getSelectedItem()).getCodprod() == -3) {
            this.cbAdicional.setVisible(true);
        } else {
            this.cbAdicional.setVisible(false);
        }
    }//GEN-LAST:event_cbItensActionPerformed

    private void TPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPagoActionPerformed

    private void RdCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdCreditoActionPerformed
        // TODO add your handling code here:
        TPago.setVisible(false);
        LbTPago.setVisible(false);
    }//GEN-LAST:event_RdCreditoActionPerformed

    private void RdDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdDebitoActionPerformed
        // TODO add your handling code here:
        TPago.setVisible(false);
        LbTPago.setVisible(false);
    }//GEN-LAST:event_RdDebitoActionPerformed

    private void RdAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdAVistaActionPerformed
        // TODO add your handling code here:
        TPago.setVisible(true);
        LbTPago.setVisible(true);
    }//GEN-LAST:event_RdAVistaActionPerformed

    private void SalvaPedidoBanco() {
        this.ped.gravaPedido();
    }

    private void SalvaItensPedidoBanco() {
        for (PedidoItem ped : this.itens) {
            ped.cadastraItemPed();
        }
    }

    private void EncerraPedido() {
        this.dispose();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cadastroPedidos = new CadastroDePedidos();
                cadastroPedidos.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTPago;
    private javax.swing.JRadioButton RdAVista;
    private javax.swing.JRadioButton RdCredito;
    private javax.swing.JRadioButton RdDebito;
    private javax.swing.JTextField TPago;
    private javax.swing.JButton btAddItem;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Produto> cbAdicional;
    private javax.swing.JComboBox<Produto> cbItens;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbCli;
    private javax.swing.JLabel lbNroPed;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JTextField tfQtdItem;
    // End of variables declaration//GEN-END:variables

}
