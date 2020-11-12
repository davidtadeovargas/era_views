package com.era.views;


public abstract class AbonosJFrame extends BaseJFrame {

    
    
    protected AbonosJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymentTable1 = new com.era.views.tables.PaymentTable();
        jPanel2 = new javax.swing.JPanel();
        jBCancel = new javax.swing.JButton();
        jBTimbrar = new javax.swing.JButton();
        jBComprobar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        paymentTable = new com.era.views.tables.PaymentTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paymentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(paymentTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBCancel.setBackground(new java.awt.Color(255, 255, 255));
        jBCancel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCancel.setForeground(new java.awt.Color(0, 102, 0));
        jBCancel.setText("Cancelar");
        jBCancel.setToolTipText("");
        jBCancel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jBCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 120, 30));

        jBTimbrar.setBackground(new java.awt.Color(255, 255, 255));
        jBTimbrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTimbrar.setForeground(new java.awt.Color(0, 102, 0));
        jBTimbrar.setText("Timbrar");
        jBTimbrar.setToolTipText("");
        jBTimbrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jBTimbrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 120, 30));

        jBComprobar.setBackground(new java.awt.Color(255, 255, 255));
        jBComprobar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBComprobar.setForeground(new java.awt.Color(0, 102, 0));
        jBComprobar.setText("Comprobar");
        jBComprobar.setToolTipText("");
        jBComprobar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jBComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 120, 30));

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(paymentTable);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 640, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBCancel;
    protected javax.swing.JButton jBComprobar;
    protected javax.swing.JButton jBTimbrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    protected com.era.views.tables.PaymentTable paymentTable;
    private com.era.views.tables.PaymentTable paymentTable1;
    // End of variables declaration//GEN-END:variables
}
