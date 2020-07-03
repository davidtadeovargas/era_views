package com.era.views;

import java.util.List;



public class CanVtasJFrame extends BaseJFrame
{
    public CanVtasJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBCancel = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMosT = new javax.swing.JButton();
        jTMot = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBCancel.setBackground(new java.awt.Color(255, 255, 255));
        jBCancel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCancel.setForeground(new java.awt.Color(0, 102, 0));
        jBCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/can.png"))); // NOI18N
        jBCancel.setText("Cancelar");
        jBCancel.setToolTipText("Cancelar Venta(s) (Ctrl+SUPR)");
        jBCancel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCancel.setName(""); // NOI18N
        jBCancel.setNextFocusableComponent(jBSal);
        jP1.add(jBCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jBBusc);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ventas:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("*Motivo:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jTMot);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 740, 250));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setToolTipText("Se busca por los campos: tipo de documento, folio, serie, nombre de cliente, usuario, nombre de usuario");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 19));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 460, 20));

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jTab);
        jP1.add(jBMosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 140, 19));

        jTMot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMot.setNextFocusableComponent(jBCancel);
        jP1.add(jTMot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 570, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBCancel;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBSal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTMot;
    protected javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

    @Override
    public List<?> getItemsToLoadInTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clearFields() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadModelInFields(Object ObjectModel) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
