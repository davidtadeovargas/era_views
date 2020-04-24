package com.era.views;


public class VOrdsJFrame extends BaseJFrame 
{
    
    public VOrdsJFrame() 
    {
        initComponents();
        
        
        
    }
           
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jBAbr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jCVerT = new javax.swing.JCheckBox();
        jBActua = new javax.swing.JButton();
        jBTab1 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Orden(es) (Ctrl+SUPR)");
        jBDel.setNextFocusableComponent(jBActua);
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 100, 30));

        jBAbr.setBackground(new java.awt.Color(255, 255, 255));
        jBAbr.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBAbr.setForeground(new java.awt.Color(0, 102, 0));
        jBAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        jBAbr.setText("Abrir");
        jBAbr.setToolTipText("Abrir + Orden(es) (Ctrl+A)");
        jBAbr.setNextFocusableComponent(jBDel);
        jP1.add(jBAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Orden", "Proyecto", "Proveedor", "Importe", "Impuesto", "Total", "Realizo", "Fecha", "Sucursal", "No. Caja", "Usuario", "Nombre Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBAbr);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTab);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1000, 500));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Órdenes de Compra");
        jP1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jCVerT);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 100, 30));

        jCVerT.setBackground(new java.awt.Color(255, 255, 255));
        jCVerT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCVerT.setText("Ver Todas F4");
        jCVerT.setNextFocusableComponent(jTab);
        jP1.add(jCVerT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 210, -1));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar Registros (F5)");
        jBActua.setNextFocusableComponent(jBSal);
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 110, 30));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 10, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar Todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTab);
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbr;
    private javax.swing.JButton jBActua;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTod;
    private javax.swing.JCheckBox jCVerT;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}
