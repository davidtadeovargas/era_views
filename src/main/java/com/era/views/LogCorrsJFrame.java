package com.era.views;


public class LogCorrsJFrame extends BaseJFrame 
{
    public LogCorrsJFrame() 
    {        
        initComponents();
        
        
    }

    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostT = new javax.swing.JButton();
        jBLimp = new javax.swing.JButton();
        jBActua = new javax.swing.JButton();
        jBTab1 = new javax.swing.JButton();
        jBRep = new javax.swing.JButton();

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
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTab);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Log de correos:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "De", "A", "No Documento", "Tipo Documento", "Estado", "Motivo", "Fecha envio", "Sucursal", "No.Caja", "Usuario", "Nombre usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 890, 240));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMostT);
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 610, 20));

        jBMostT.setBackground(new java.awt.Color(255, 255, 255));
        jBMostT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMostT.setForeground(new java.awt.Color(0, 102, 0));
        jBMostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMostT.setText("Mostrar F4");
        jBMostT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMostT.setNextFocusableComponent(jBLimp);
        jP1.add(jBMostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 140, 20));

        jBLimp.setBackground(new java.awt.Color(255, 255, 255));
        jBLimp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBLimp.setForeground(new java.awt.Color(0, 102, 0));
        jBLimp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/limp.png"))); // NOI18N
        jBLimp.setText("Limpiar");
        jBLimp.setToolTipText("Limpiar el LOG de Correos Enviados");
        jBLimp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBLimp.setNextFocusableComponent(jBActua);
        jP1.add(jBLimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 120, 30));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar Registros (F5)");
        jBActua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBActua.setName(""); // NOI18N
        jBActua.setNextFocusableComponent(jBRep);
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 120, 30));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 10, 20));

        jBRep.setBackground(new java.awt.Color(255, 255, 255));
        jBRep.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBRep.setForeground(new java.awt.Color(0, 102, 0));
        jBRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/visor.png"))); // NOI18N
        jBRep.setText("Reporte");
        jBRep.setToolTipText("Reporte de Clientes (F9)");
        jBRep.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBRep.setNextFocusableComponent(jBSal);
        jP1.add(jBRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
   
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActua;
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBLimp;
    private javax.swing.JButton jBMostT;
    private javax.swing.JButton jBRep;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}
