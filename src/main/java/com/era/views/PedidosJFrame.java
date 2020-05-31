package com.era.views;


public abstract class PedidosJFrame extends BaseJFrame {
    
    public PedidosJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
    
    
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonGenerarPDF = new javax.swing.JButton();
        jButtonNueva = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jBVer = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonFacturar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonVerPDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBMosT = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBBusc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLNot = new javax.swing.JLabel();
        jLNotCli = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartidas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setMinimumSize(new java.awt.Dimension(1292, 300));
        jP1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(130, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGenerarPDF.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGenerarPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonGenerarPDF.setForeground(new java.awt.Color(0, 102, 0));
        jButtonGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/genpdf.png"))); // NOI18N
        jButtonGenerarPDF.setText("Generar PDF");
        jButtonGenerarPDF.setToolTipText("Generar PDF");
        jButtonGenerarPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGenerarPDF.setNextFocusableComponent(jButtonNueva);
        jPanel1.add(jButtonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jButtonNueva.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNueva.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonNueva.setForeground(new java.awt.Color(0, 102, 0));
        jButtonNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jButtonNueva.setText("Nueva");
        jButtonNueva.setToolTipText("Nuev Pedido (Ctrl+N). Presionando (Alt y este Botón) Puedes Tomar la Cotización Seleccionada como Machote para una Nueva cotización");
        jButtonNueva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNueva.setNextFocusableComponent(jBVer);
        jPanel1.add(jButtonNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, 30));

        jButtonAbrir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAbrir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAbrir.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        jButtonAbrir.setText("Abrir");
        jButtonAbrir.setToolTipText("Abrir (es) (Ctrl+A)");
        jButtonAbrir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButtonAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 30));

        jBVer.setBackground(new java.awt.Color(255, 255, 255));
        jBVer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVer.setForeground(new java.awt.Color(0, 102, 0));
        jBVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ver.png"))); // NOI18N
        jBVer.setText("Ver");
        jBVer.setToolTipText("Ver Pedido(es)");
        jBVer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVer.setNextFocusableComponent(jButtonFacturar);
        jPanel1.add(jBVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 30));

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/can.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar (F6)");
        jButtonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCancelar.setNextFocusableComponent(jButtonActualizar);
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 30));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 102, 0));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("Salir (ESC)");
        jButtonSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonSalir.setNextFocusableComponent(jTablePedidos);
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 130, 30));

        jButtonFacturar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFacturar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonFacturar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonFacturar.setText("Factura");
        jButtonFacturar.setNextFocusableComponent(jButtonCancelar);
        jPanel1.add(jButtonFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, 30));

        jButtonActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setToolTipText("Actualizar registros (F5)");
        jButtonActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonActualizar.setNextFocusableComponent(jButtonVerPDF);
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 130, 30));

        jButtonVerPDF.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVerPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonVerPDF.setForeground(new java.awt.Color(0, 102, 0));
        jButtonVerPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jButtonVerPDF.setText("Ver PDF");
        jButtonVerPDF.setToolTipText("Ver PDF (Alt+F)");
        jButtonVerPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonVerPDF.setName(""); // NOI18N
        jButtonVerPDF.setNextFocusableComponent(jButtonSalir);
        jPanel1.add(jButtonVerPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, 30));

        jP1.add(jPanel1);
        jPanel1.setBounds(1160, 30, 130, 340);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pedidos:");
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

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jP1.add(jTBusc);
        jTBusc.setBounds(160, 230, 860, 20);

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc);
        jBBusc.setBounds(20, 230, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Partidas:");
        jP1.add(jLabel2);
        jLabel2.setBounds(20, 270, 170, 17);

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

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Serie", "Folio", "Cod. Pedido", "Serie", "Cod.Cliente", "Observaciones", "SubTotal", "Impuesto", "Total", "Total Descuento", "Descripción", "Fecha Creación", "Fecha Modificación", "Fecha Vencimiento", "Fecha entrega", "Fecha documento", "Sucursal", "No. Caja", "Usuario", "Nombre Usuario", "Estado", "Motivo", "Venta", "Serie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePedidos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTablePedidos.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePedidos.setInheritsPopupMenu(true);
        jTablePedidos.setNextFocusableComponent(jBBusc);
        jTablePedidos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jTablePedidos);

        jPanel2.add(jScrollPane2);

        jP1.add(jPanel2);
        jPanel2.setBounds(20, 30, 1140, 200);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cotización", "Qty", "Producto", "Unidad", "Lista", "Descripción", "Precio", "Desc.%", "Almacén", "Importe", "%Impuesto", "Total Impuesto", "Importe Descuento", "Serie Producto", "Comentario Serie", "Es Kit", "Talla", "Color", "Back Order", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setInheritsPopupMenu(true);
        jTablePartidas.setNextFocusableComponent(jButtonGenerarPDF);
        jScrollPane1.setViewportView(jTablePartidas);

        jPanel3.add(jScrollPane1);

        jP1.add(jPanel3);
        jPanel3.setBounds(20, 290, 1140, 190);

        getContentPane().add(jP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1292, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBVer;
    protected javax.swing.JButton jButtonAbrir;
    protected javax.swing.JButton jButtonActualizar;
    protected javax.swing.JButton jButtonCancelar;
    protected javax.swing.JButton jButtonFacturar;
    protected javax.swing.JButton jButtonGenerarPDF;
    protected javax.swing.JButton jButtonNueva;
    protected javax.swing.JButton jButtonSalir;
    protected javax.swing.JButton jButtonVerPDF;
    protected javax.swing.JLabel jLNot;
    protected javax.swing.JLabel jLNotCli;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTablePartidas;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables

}
