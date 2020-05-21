package com.era.views;


public class SelCorrJFrame extends BaseJFrame
{
    public SelCorrJFrame(final String idTextTitleWindow) 
    {           
        super(idTextTitleWindow);
        
        initComponents();

        
    }

    
        
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jP1 = new javax.swing.JPanel();
        jCCo1 = new javax.swing.JCheckBox();
        jTCo1 = new javax.swing.JTextField();
        jTCo2 = new javax.swing.JTextField();
        jCCo2 = new javax.swing.JCheckBox();
        jTCo3 = new javax.swing.JTextField();
        jCCo3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBSal = new javax.swing.JButton();
        jBEnvi = new javax.swing.JButton();
        jCGua = new javax.swing.JCheckBox();
        jLDat = new javax.swing.JLabel();
        jBTab1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCCo1.setBackground(new java.awt.Color(255, 255, 255));
        jCCo1.setSelected(true);
        jCCo1.setNextFocusableComponent(jTCo2);
        jP1.add(jCCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo1.setNextFocusableComponent(jCCo1);
        jP1.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 210, 20));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo2.setNextFocusableComponent(jCCo2);
        jP1.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, 20));

        jCCo2.setBackground(new java.awt.Color(255, 255, 255));
        jCCo2.setNextFocusableComponent(jTCo3);
        jP1.add(jCCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jTCo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo3.setNextFocusableComponent(jCCo3);
        jP1.add(jTCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, 20));

        jCCo3.setBackground(new java.awt.Color(255, 255, 255));
        jCCo3.setNextFocusableComponent(jCGua);
        jP1.add(jCCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel1.setText("Correo 3:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        jLabel2.setText("*Correo 1:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jLabel3.setText("Correo 2:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jTCo1);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, -1, 110));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTab);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 100, 30));

        jBEnvi.setBackground(new java.awt.Color(255, 255, 255));
        jBEnvi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBEnvi.setForeground(new java.awt.Color(0, 102, 0));
        jBEnvi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corrs.png"))); // NOI18N
        jBEnvi.setText("Enviar");
        jBEnvi.setToolTipText("Enviar");
        jBEnvi.setNextFocusableComponent(jBSal);
        jP1.add(jBEnvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 100, 30));

        jCGua.setBackground(new java.awt.Color(255, 255, 255));
        jCGua.setText("Guardar correos F2");
        jCGua.setNextFocusableComponent(jBEnvi);
        jP1.add(jCGua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 150, -1));

        jLDat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLDat.setText("Datos de documento:");
        jP1.add(jLDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 530, -1));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 10, 20));

        getContentPane().add(jP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEnvi;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JCheckBox jCCo1;
    private javax.swing.JCheckBox jCCo2;
    private javax.swing.JCheckBox jCCo3;
    private javax.swing.JCheckBox jCGua;
    private javax.swing.JLabel jLDat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCo1;
    private javax.swing.JTextField jTCo2;
    private javax.swing.JTextField jTCo3;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}
