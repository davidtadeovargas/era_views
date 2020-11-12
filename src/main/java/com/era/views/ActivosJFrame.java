package com.era.views;



public abstract class ActivosJFrame extends BaseJFrame
{
    public ActivosJFrame(final String idTextTitleWindow)
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        this.getRootPane().setDefaultButton(jBNew);
        
        postInitComponents();
    }

    
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jCSucursal = new javax.swing.JComboBox();
        jCZona = new javax.swing.JComboBox();
        jTZona = new javax.swing.JTextField();
        jTSucursal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jBNew = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jBBusc = new javax.swing.JButton();
        jBMosT = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jCResponsable = new javax.swing.JComboBox();
        jCClasificacion = new javax.swing.JComboBox();
        jTClasificacion = new javax.swing.JTextField();
        jTResponsable = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTReferencia = new javax.swing.JTextField();
        jBSer = new javax.swing.JButton();
        jTSerProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Activos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 230, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "#Referencia", "Descripción", "Zona", "Sucursal", "Clasificación", "Responsable"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 780, 290));

        jLabel14.setText("Sucursal:");
        jP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, -1));

        jCSucursal.setNextFocusableComponent(jCClasificacion);
        jP1.add(jCSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 90, 20));

        jCZona.setNextFocusableComponent(jCSucursal);
        jP1.add(jCZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, 20));

        jTZona.setEditable(false);
        jTZona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 160, 20));

        jTSucursal.setEditable(false);
        jTSucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 160, 20));

        jLabel17.setText("Zona:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, -1));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo Almacén (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jBDel);
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 20));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Almacen(es) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBBusc);
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, 20));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 140, 20));

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jBSal);
        jP1.add(jBMosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 140, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 250, 20));

        jLabel15.setText("Responsable:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        jCResponsable.setNextFocusableComponent(jTReferencia);
        jP1.add(jCResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, 20));

        jCClasificacion.setNextFocusableComponent(jCResponsable);
        jP1.add(jCClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 90, 20));

        jTClasificacion.setEditable(false);
        jTClasificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, 20));

        jTResponsable.setEditable(false);
        jTResponsable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 160, 20));

        jLabel18.setText("Clasificación:");
        jP1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Serie:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 140, -1));

        jTDescripcion.setNextFocusableComponent(jBNew);
        jP1.add(jTDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 350, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("*Descripción:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 140, -1));

        jTReferencia.setNextFocusableComponent(jTDescripcion);
        jP1.add(jTReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 170, -1));

        jBSer.setBackground(new java.awt.Color(255, 255, 255));
        jBSer.setText("...");
        jBSer.setToolTipText("Buscar Cliente(s)");
        jP1.add(jBSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, 20));

        jTSerProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*#Referencia:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

          
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBSer;
    protected javax.swing.JComboBox jCClasificacion;
    protected javax.swing.JComboBox jCResponsable;
    protected javax.swing.JComboBox jCSucursal;
    protected javax.swing.JComboBox jCZona;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel17;
    protected javax.swing.JLabel jLabel18;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTClasificacion;
    protected javax.swing.JTextField jTDescripcion;
    protected javax.swing.JTextField jTReferencia;
    protected javax.swing.JTextField jTResponsable;
    protected javax.swing.JTextField jTSerProd;
    protected javax.swing.JTextField jTSucursal;
    protected javax.swing.JTextField jTZona;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}
