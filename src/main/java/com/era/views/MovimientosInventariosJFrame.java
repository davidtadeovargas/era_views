package com.era.views;


public abstract class MovimientosInventariosJFrame extends BaseJFrame {
    
    public MovimientosInventariosJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
    
    
    
    
    
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNueva = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBMosT = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jBBusc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBTab1 = new javax.swing.JButton();
        jBTab2 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jLNot = new javax.swing.JLabel();
        jLNotCli = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMovimientos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartidas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setMinimumSize(new java.awt.Dimension(1292, 300));
        jP1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(130, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonNueva.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNueva.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonNueva.setForeground(new java.awt.Color(0, 102, 0));
        jButtonNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jButtonNueva.setText("Nueva");
        jButtonNueva.setToolTipText("Nuev Pedido (Ctrl+N). Presionando (Alt y este Botón) Puedes Tomar la Cotización Seleccionada como Machote para una Nueva cotización");
        jButtonNueva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButtonNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 102, 0));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("Salir (ESC)");
        jButtonSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonSalir.setNextFocusableComponent(jTableMovimientos);
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, 30));

        jP1.add(jPanel1);
        jPanel1.setBounds(1160, 30, 130, 340);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Encabezados:");
        jP1.add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 17);

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBMosT);
        jBMosT.setBounds(1020, 230, 140, 20);

        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldBuscar.setNextFocusableComponent(jBMosT);
        jP1.add(jTextFieldBuscar);
        jTextFieldBuscar.setBounds(160, 230, 860, 20);

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTextFieldBuscar);
        jP1.add(jBBusc);
        jBBusc.setBounds(20, 230, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Partidas:");
        jP1.add(jLabel2);
        jLabel2.setBounds(20, 270, 170, 17);

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1);
        jBTab1.setBounds(10, 30, 10, 20);

        jBTab2.setBackground(new java.awt.Color(0, 153, 153));
        jBTab2.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab2);
        jBTab2.setBounds(10, 290, 10, 20);

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTableMovimientos);
        jP1.add(jBTod);
        jBTod.setBounds(1030, 12, 130, 18);

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setFocusable(false);
        jP1.add(jLNot);
        jLNot.setBounds(20, 250, 300, 20);

        jLNotCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNotCli.setForeground(new java.awt.Color(204, 0, 0));
        jLNotCli.setFocusable(false);
        jP1.add(jLNotCli);
        jLNotCli.setBounds(300, 250, 860, 20);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jTableMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID", "Almacén", "Concepto", "Cant. Total", "E/S", "Usuario", "Sucursal", "No. Caja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMovimientos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableMovimientos.setGridColor(new java.awt.Color(255, 255, 255));
        jTableMovimientos.setInheritsPopupMenu(true);
        jTableMovimientos.setNextFocusableComponent(jBBusc);
        jTableMovimientos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jTableMovimientos);

        jPanel2.add(jScrollPane2);

        jP1.add(jPanel2);
        jPanel2.setBounds(20, 30, 1140, 200);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Producto", "Unidad", "Cantidad", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(jTablePartidas);

        jPanel3.add(jScrollPane1);

        jP1.add(jPanel3);
        jPanel3.setBounds(20, 290, 1140, 190);

        getContentPane().add(jP1);
        jP1.setBounds(10, 11, 1292, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBMosT;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTab2;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jButtonNueva;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLNot;
    private javax.swing.JLabel jLNotCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMovimientos;
    private javax.swing.JTable jTablePartidas;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables

}
