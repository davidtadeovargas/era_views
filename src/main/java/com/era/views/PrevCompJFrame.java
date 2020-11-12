package com.era.views;

public abstract class PrevCompJFrame extends BaseJFrame 
{
    public PrevCompJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);        
        
        initComponents();
        
        postInitComponents();
    }
    
    
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jBNew = new javax.swing.JButton();
        jBAbr = new javax.swing.JButton();
        jBVer = new javax.swing.JButton();
        jBCan = new javax.swing.JButton();
        jBActua = new javax.swing.JButton();
        jBPDF = new javax.swing.JButton();
        jBDirCots = new javax.swing.JButton();
        jBVta = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jBGenPDF = new javax.swing.JButton();
        jBPonSer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBMosT = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBBusc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLNot = new javax.swing.JLabel();
        jLNotCli = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab2 = new javax.swing.JTable();
        jMostFalSer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setMinimumSize(new java.awt.Dimension(1292, 300));
        jP1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(130, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nueva");
        jBNew.setToolTipText("Nuevo previo de compra (Ctrl+N). Presionando (Alt y este Botón) Puedes Tomar el previo de compra Seleccionado como Machote para una Nuevo previo de compra");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jBVer);
        jPanel1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jBAbr.setBackground(new java.awt.Color(255, 255, 255));
        jBAbr.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBAbr.setForeground(new java.awt.Color(0, 102, 0));
        jBAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        jBAbr.setText("Abrir");
        jBAbr.setToolTipText("Abrir previo de compra (Ctrl+A)");
        jBAbr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jBAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, 30));

        jBVer.setBackground(new java.awt.Color(255, 255, 255));
        jBVer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVer.setForeground(new java.awt.Color(0, 102, 0));
        jBVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ver.png"))); // NOI18N
        jBVer.setText("Ver");
        jBVer.setToolTipText("Ver previo de compra");
        jBVer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVer.setNextFocusableComponent(jBCan);
        jPanel1.add(jBVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 30));

        jBCan.setBackground(new java.awt.Color(255, 255, 255));
        jBCan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCan.setForeground(new java.awt.Color(0, 102, 0));
        jBCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/can.png"))); // NOI18N
        jBCan.setText("Cancelar");
        jBCan.setToolTipText("Cancelar previo de compra");
        jBCan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jBCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 30));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar Registros (F5)");
        jBActua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBActua.setNextFocusableComponent(jBPDF);
        jPanel1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, 30));

        jBPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jBPDF.setText("Ver PDF");
        jBPDF.setToolTipText("Ver PDF (Alt+F)");
        jBPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBPDF.setName(""); // NOI18N
        jBPDF.setNextFocusableComponent(jBDirCots);
        jPanel1.add(jBPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 30));

        jBDirCots.setBackground(new java.awt.Color(255, 255, 255));
        jBDirCots.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirCots.setForeground(new java.awt.Color(0, 102, 0));
        jBDirCots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dircot.png"))); // NOI18N
        jBDirCots.setText("Previos");
        jBDirCots.setToolTipText("Directorio de previo de compra(F9)");
        jBDirCots.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirCots.setName(""); // NOI18N
        jPanel1.add(jBDirCots, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, 30));

        jBVta.setBackground(new java.awt.Color(255, 255, 255));
        jBVta.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVta.setForeground(new java.awt.Color(0, 102, 0));
        jBVta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fac.png"))); // NOI18N
        jBVta.setText("Compra");
        jBVta.setToolTipText("Convertir en compra lo(s) previo(s) de compra");
        jBVta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVta.setNextFocusableComponent(jBSal);
        jPanel1.add(jBVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 130, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTab1);
        jPanel1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 130, 30));

        jBGenPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBGenPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGenPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBGenPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jBGenPDF.setText("Generar");
        jBGenPDF.setToolTipText("Generar PDF de previo de compra");
        jBGenPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBGenPDF.setNextFocusableComponent(jBNew);
        jPanel1.add(jBGenPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 130, 30));

        jBPonSer.setBackground(new java.awt.Color(255, 255, 255));
        jBPonSer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBPonSer.setForeground(new java.awt.Color(0, 102, 0));
        jBPonSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fac.png"))); // NOI18N
        jBPonSer.setText("Series");
        jBPonSer.setToolTipText("Insertar las series a las partidas del previo\n");
        jBPonSer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jBPonSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 130, 30));

        jP1.add(jPanel1);
        jPanel1.setBounds(1160, 30, 130, 330);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Previos de compra:");
        jP1.add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 17);

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jTab2);
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

        jTab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Previo compra", "Serie", "Cod.Cliente", "Observaciones", "SubTotal", "Impuesto", "Total", "Total Descuento", "Estado", "Fecha creación", "Fecha modificación", "Fecha vencimiento", "Fecha entrega", "Fecha documento", "Sucursal", "No. Caja", "Usuario", "Nombre Usuario", "Estado", "Motivo", "Compra", "Serie", "No. Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTab1.setGridColor(new java.awt.Color(255, 255, 255));
        jTab1.setInheritsPopupMenu(true);
        jTab1.setNextFocusableComponent(jBBusc);
        jTab1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTab1);

        jPanel2.add(jScrollPane2);

        jP1.add(jPanel2);
        jPanel2.setBounds(20, 30, 1140, 200);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jTab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cotización", "Qty", "Producto", "Unidad", "Descripción", "Precio", "Desc.%", "Almacén", "Importe", "%Impuesto", "Total Impuesto", "Importe Descuento", "Serie Producto", "Comentario Serie", "Es Kit", "Talla", "Color", "Back Order", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab2.setGridColor(new java.awt.Color(255, 255, 255));
        jTab2.setInheritsPopupMenu(true);
        jTab2.setNextFocusableComponent(jBGenPDF);
        jScrollPane1.setViewportView(jTab2);

        jPanel3.add(jScrollPane1);

        jP1.add(jPanel3);
        jPanel3.setBounds(20, 290, 1140, 190);

        jMostFalSer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMostFalSer.setForeground(new java.awt.Color(204, 0, 0));
        jMostFalSer.setFocusable(false);
        jP1.add(jMostFalSer);
        jMostFalSer.setBounds(640, 10, 390, 20);

        getContentPane().add(jP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1310, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBAbr;
    protected javax.swing.JButton jBActua;
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBCan;
    protected javax.swing.JButton jBDirCots;
    protected javax.swing.JButton jBGenPDF;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBPDF;
    protected javax.swing.JButton jBPonSer;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBVer;
    protected javax.swing.JButton jBVta;
    protected javax.swing.JLabel jLNot;
    protected javax.swing.JLabel jLNotCli;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jMostFalSer;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTab1;
    private javax.swing.JTable jTab2;
    // End of variables declaration//GEN-END:variables

}
