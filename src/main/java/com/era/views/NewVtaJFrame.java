package com.era.views;


public abstract class NewVtaJFrame extends BaseJFrame
{        
    
    public NewVtaJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
                    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartidas = new com.era.views.tables.PartvtaTable();
        jTSubTot = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        campo_impuesto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jBNew = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jTTotDesc = new javax.swing.JTextField();
        jLTipVta = new javax.swing.JLabel();
        jTTotSald = new javax.swing.JTextField();
        jLTotSald = new javax.swing.JLabel();
        jLNot = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        campo_retencion = new javax.swing.JTextField();
        btnPrevio = new javax.swing.JButton();
        jBCustomer = new javax.swing.JButton();
        jLabelCustomer = new javax.swing.JLabel();
        jBHeader = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelAddress = new javax.swing.JLabel();
        jLabelAddress2 = new javax.swing.JLabel();
        jLabelAddress3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setEnabled(false);
        jP1.setFocusable(false);
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, -1));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setNextFocusableComponent(jBGuar);
        jTablePartidas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTablePartidas);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 980, 130));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(51, 51, 0));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 120, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Retención:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 110, 20));

        campo_impuesto.setEditable(false);
        campo_impuesto.setBackground(new java.awt.Color(204, 255, 204));
        campo_impuesto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        campo_impuesto.setForeground(new java.awt.Color(51, 51, 0));
        campo_impuesto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campo_impuesto.setText("$0.00");
        campo_impuesto.setNextFocusableComponent(jBGuar);
        jP1.add(campo_impuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 120, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Descuento:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 110, 20));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTTot.setForeground(new java.awt.Color(51, 51, 0));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 120, 20));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Producto");
        jBNew.setToolTipText("Nueva Partida (Ctrl+N)");
        jBNew.setNextFocusableComponent(jBDel);
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jBDel.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Total:");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 110, 20));

        jTTotDesc.setEditable(false);
        jTTotDesc.setBackground(new java.awt.Color(204, 255, 204));
        jTTotDesc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTTotDesc.setForeground(new java.awt.Color(51, 51, 0));
        jTTotDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTotDesc.setText("$0.00");
        jTTotDesc.setNextFocusableComponent(jBGuar);
        jP1.add(jTTotDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 120, 20));

        jLTipVta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLTipVta.setText("VENTA A CRÉDITO");
        jLTipVta.setFocusable(false);
        jP1.add(jLTipVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 410, -1));

        jTTotSald.setEditable(false);
        jTTotSald.setBackground(new java.awt.Color(255, 204, 204));
        jTTotSald.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTTotSald.setForeground(new java.awt.Color(51, 51, 0));
        jTTotSald.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTotSald.setText("$0.00");
        jTTotSald.setNextFocusableComponent(jBGuar);
        jP1.add(jTTotSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 120, 20));

        jLTotSald.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLTotSald.setForeground(new java.awt.Color(204, 0, 51));
        jLTotSald.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTotSald.setText("Total a pagar:");
        jP1.add(jLTotSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 160, 20));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setText("NUEVA FACTURA");
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 270, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Sub Total:");
        jP1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 110, 20));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Impuesto:");
        jP1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 110, 20));

        campo_retencion.setEditable(false);
        campo_retencion.setBackground(new java.awt.Color(204, 255, 204));
        campo_retencion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        campo_retencion.setForeground(new java.awt.Color(51, 51, 0));
        campo_retencion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campo_retencion.setText("$0.00");
        campo_retencion.setNextFocusableComponent(jBGuar);
        jP1.add(campo_retencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 120, 20));

        btnPrevio.setBackground(new java.awt.Color(255, 255, 255));
        btnPrevio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPrevio.setForeground(new java.awt.Color(0, 102, 0));
        btnPrevio.setText("Previo");
        jP1.add(btnPrevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 30));

        jBCustomer.setBackground(new java.awt.Color(255, 255, 255));
        jBCustomer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCustomer.setForeground(new java.awt.Color(0, 102, 0));
        jBCustomer.setText("Cliente");
        jBCustomer.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jBCustomer.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 20));

        jLabelCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCustomer.setText("Cliente");
        jP1.add(jLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 490, 30));

        jBHeader.setBackground(new java.awt.Color(255, 255, 255));
        jBHeader.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBHeader.setForeground(new java.awt.Color(0, 102, 0));
        jBHeader.setText("Datos");
        jBHeader.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jBHeader.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 110, 20));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 460, 110));

        jLabelAddress.setText("Dirección");
        jP1.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 490, -1));

        jLabelAddress2.setText("Dirección 2");
        jP1.add(jLabelAddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, -1));

        jLabelAddress3.setText("Dirección 3");
        jP1.add(jLabelAddress3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
            
       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnPrevio;
    protected javax.swing.JTextField campo_impuesto;
    protected javax.swing.JTextField campo_retencion;
    protected javax.swing.JButton jBCustomer;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBHeader;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLNot;
    protected javax.swing.JLabel jLTipVta;
    protected javax.swing.JLabel jLTotSald;
    protected javax.swing.JLabel jLabel27;
    protected javax.swing.JLabel jLabel28;
    protected javax.swing.JLabel jLabel33;
    protected javax.swing.JLabel jLabel51;
    protected javax.swing.JLabel jLabel52;
    protected javax.swing.JLabel jLabelAddress;
    protected javax.swing.JLabel jLabelAddress2;
    protected javax.swing.JLabel jLabelAddress3;
    protected javax.swing.JLabel jLabelCustomer;
    private javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTSubTot;
    protected javax.swing.JTextField jTTot;
    protected javax.swing.JTextField jTTotDesc;
    protected javax.swing.JTextField jTTotSald;
    protected com.era.views.tables.PartvtaTable jTablePartidas;
    protected javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
