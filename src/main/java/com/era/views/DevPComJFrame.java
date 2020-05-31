package com.era.views;


public abstract class DevPComJFrame extends BaseJFrame
{        
            
    public DevPComJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        maximizedWindow();
        
        postInitComponents();
        
        
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jTProv.grabFocus();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNoDoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTCodCom = new javax.swing.JTextField();
        jTNomProv = new javax.swing.JTextField();
        jTProv = new javax.swing.JTextField();
        jTFec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTEst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTObserv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTNoSer = new javax.swing.JTextField();
        jTSubTot = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTImp = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jBGuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTMot = new javax.swing.JTextField();
        jLNot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTMot);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 120, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Cantidad", "Unidad", "Almacén", "Descripción", "Costo", "Descuento", "Desc. Adicional", "Impuesto", "Moneda", "Importe", "Devueltos", "Cant. Devolución", "Lote", "Pedimento", "Caducidad", "ID", "Es Kit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBGuar);
        jScrollPane1.setViewportView(jTab);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1090, 240));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Cod. Proveedor:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 110, -1));

        jLabel6.setText("Cod. Proveedor:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        jTNoDoc.setEditable(false);
        jTNoDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoDoc.setNextFocusableComponent(jTab);
        jPanel4.add(jTNoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 120, 20));

        jLabel3.setText("Nombre Proveedor:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, -1));

        jLabel2.setText("Fecha:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 80, -1));

        jLabel20.setText("Observaciones:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));

        jTCodCom.setEditable(false);
        jTCodCom.setForeground(new java.awt.Color(51, 51, 255));
        jTCodCom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCodCom.setNextFocusableComponent(jTab);
        jPanel4.add(jTCodCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 160, 20));

        jTNomProv.setEditable(false);
        jTNomProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNomProv.setNextFocusableComponent(jTab);
        jPanel4.add(jTNomProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 380, 20));

        jTProv.setEditable(false);
        jTProv.setBackground(new java.awt.Color(204, 255, 204));
        jTProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProv.setNextFocusableComponent(jTab);
        jPanel4.add(jTProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, 20));

        jTFec.setEditable(false);
        jTFec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTFec.setNextFocusableComponent(jTab);
        jPanel4.add(jTFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 130, 20));

        jLabel5.setText("Cod. Compra:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 80, -1));

        jTEst.setEditable(false);
        jTEst.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTEst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEst.setNextFocusableComponent(jTab);
        jPanel4.add(jTEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 90, 20));

        jLabel7.setText("Serie:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, -1));

        jLabel21.setText("No. Documento:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jTObserv.setEditable(false);
        jTObserv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTObserv.setNextFocusableComponent(jTab);
        jPanel4.add(jTObserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 380, 20));

        jLabel8.setText("Estado:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, -1));

        jTNoSer.setEditable(false);
        jTNoSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoSer.setNextFocusableComponent(jTab);
        jPanel4.add(jTNoSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 160, 20));

        jP1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 790, 110));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(51, 51, 0));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 160, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Sub Total:");
        jP1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 110, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Impuesto:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 110, -1));

        jTImp.setEditable(false);
        jTImp.setBackground(new java.awt.Color(204, 255, 204));
        jTImp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTImp.setForeground(new java.awt.Color(51, 51, 0));
        jTImp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTImp.setText("$0.00");
        jP1.add(jTImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, 160, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Total:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 110, -1));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTTot.setForeground(new java.awt.Color(51, 51, 0));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, 160, 30));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, 30));

        jLabel1.setText("*Motivo de Devolución:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 130, -1));

        jTMot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMot.setNextFocusableComponent(jTProv);
        jP1.add(jTMot, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 410, 20));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setText("DEVOLUCIÓN PARCIAL COMPRA");
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 790, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLNot;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel20;
    protected javax.swing.JLabel jLabel21;
    protected javax.swing.JLabel jLabel26;
    protected javax.swing.JLabel jLabel27;
    protected javax.swing.JLabel jLabel28;
    protected javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanel4;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField jTCodCom;
    protected javax.swing.JTextField jTEst;
    protected javax.swing.JTextField jTFec;
    protected javax.swing.JTextField jTImp;
    protected javax.swing.JTextField jTMot;
    protected javax.swing.JTextField jTNoDoc;
    protected javax.swing.JTextField jTNoSer;
    protected javax.swing.JTextField jTNomProv;
    protected javax.swing.JTextField jTObserv;
    protected javax.swing.JTextField jTProv;
    protected javax.swing.JTextField jTSubTot;
    protected javax.swing.JTextField jTTot;
    protected javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables
}
