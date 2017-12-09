/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConexaoBancoDeDados;
import Model.Pedido;
import Model.PedidoItem;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 */
public class NotaDeCompras extends javax.swing.JFrame {

    /**
     * Creates new form NotaDeCompras
     */
    ArrayList<Pedido> pedidos = null;

    public NotaDeCompras() {
        initComponents();

        pedidos = (ArrayList) ConexaoBancoDeDados.getInstance().getPedidos();

        for (Pedido pd : pedidos) {
            JComboPedidos.addItem(Integer.toString(pd.getNuped()));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vlrTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vlrTroco = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JComboPedidos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JProdTable = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        vlrPago = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Características do Pedido");

        jLabel2.setText("Valor total:");

        vlrTotal.setText("0");

        jLabel4.setText("Troco:");

        vlrTroco.setText("0");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JComboPedidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        JProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro. Pedido", "Descrição Prod", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(JProdTable);

        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel6.setText("Pago:");

        vlrPago.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JComboPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(vlrPago))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vlrTroco))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(64, 64, 64)
                                    .addComponent(vlrTotal))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vlrTotal))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vlrPago))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vlrTroco))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

        vlrTotal.setText("0");
        vlrPago.setText("0");
        vlrTroco.setText("0");
        ArrayList<PedidoItem> x = ConexaoBancoDeDados.getInstance().getItensPedido(Integer.parseInt(JComboPedidos.getSelectedItem().toString()));
        ArrayList<Pedido> ped = ConexaoBancoDeDados.getInstance().getPedidos();
        for (Pedido pedx : ped) {
            if (pedx.getNuped() == Integer.parseInt(JComboPedidos.getSelectedItem().toString())) {
                vlrTotal.setText("R$ " + String.valueOf(pedx.getVlrnota()));
                vlrPago.setText("R$ " + String.valueOf(pedx.getValorPago()));
                vlrTroco.setText("R$ " + String.valueOf(pedx.getValorPago() - pedx.getVlrnota()));
            }
        }

        DefaultTableModel model = (DefaultTableModel) JProdTable.getModel();
        model.setRowCount(0);
        for (PedidoItem pe : x) {
            model.addRow(new Object[]{pe.getNuped(), ConexaoBancoDeDados.getInstance().getDescProduto(pe.getCodprod()), pe.getQtdprod(), pe.getQtdprod() * ConexaoBancoDeDados.getInstance().getPrecoProduto(pe.getCodprod())});
//            System.out.println(pe.getNuped() + " " + ConexaoBancoDeDados.getInstance().getDescProduto(pe.getCodprod()) + " " + pe.getQtdprod());
        }

        //DefaultTableModel model = (DefaultTableModel) JProdTable.getModel();
        //model.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
    }//GEN-LAST:event_searchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboPedidos;
    private javax.swing.JTable JProdTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JLabel vlrPago;
    private javax.swing.JLabel vlrTotal;
    private javax.swing.JLabel vlrTroco;
    // End of variables declaration//GEN-END:variables
}
