package com.era.views;

public abstract class ImpresJFrame extends BaseJFrame 
{
    public ImpresJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();                
        
        postInitComponents();
    }

    
    
       
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jBUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new com.era.views.tables.UserTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMosT = new javax.swing.JButton();
        jComImpTick = new com.era.views.comboboxes.PrinterCombobox();
        jBProbTick = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComImpFact = new com.era.views.comboboxes.PrinterCombobox();
        jBProbFac = new javax.swing.JButton();
        jC52m = new javax.swing.JCheckBox();
        jCCort = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Impresora Facturas:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 170, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 120, 30));

        jBUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jBUpdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBUpdate.setForeground(new java.awt.Color(0, 102, 0));
        jBUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBUpdate.setText("Actualizar");
        jBUpdate.setToolTipText("Nueva Asociaciòn (Ctrl+N)");
        jBUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBUpdate.setNextFocusableComponent(jTab);
        jP1.add(jBUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Usuarios:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Usuario", "Impresora Facturas", "Impresora Tickets", "52mm", "Corte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 630, 280));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 19));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 350, 20));

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosT.setName(""); // NOI18N
        jP1.add(jBMosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 140, 19));

        jComImpTick.setNextFocusableComponent(jC52m);
        jP1.add(jComImpTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 20));

        jBProbTick.setBackground(new java.awt.Color(255, 255, 255));
        jBProbTick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProbTick.setText("Probar");
        jBProbTick.setNextFocusableComponent(jComImpFact);
        jP1.add(jBProbTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Impresora Tickets:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jComImpFact.setNextFocusableComponent(jBProbFac);
        jP1.add(jComImpFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 160, 20));

        jBProbFac.setBackground(new java.awt.Color(255, 255, 255));
        jBProbFac.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProbFac.setText("Probar");
        jBProbFac.setNextFocusableComponent(jBUpdate);
        jP1.add(jBProbFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 20));

        jC52m.setBackground(new java.awt.Color(255, 255, 255));
        jC52m.setText("52mm");
        jC52m.setNextFocusableComponent(jCCort);
        jP1.add(jC52m, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 70, 20));

        jCCort.setBackground(new java.awt.Color(255, 255, 255));
        jCCort.setText("Corte");
        jCCort.setNextFocusableComponent(jBProbTick);
        jP1.add(jCCort, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 55, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBProbFac;
    protected javax.swing.JButton jBProbTick;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBUpdate;
    protected javax.swing.JCheckBox jC52m;
    protected javax.swing.JCheckBox jCCort;
    protected com.era.views.comboboxes.PrinterCombobox jComImpFact;
    protected com.era.views.comboboxes.PrinterCombobox jComImpTick;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    protected com.era.views.tables.UserTable jTab;
    // End of variables declaration//GEN-END:variables

}
