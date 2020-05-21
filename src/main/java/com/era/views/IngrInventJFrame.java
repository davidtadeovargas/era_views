package com.era.views;


public class IngrInventJFrame extends BaseJFrame {
    
    public IngrInventJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();
                
        
        
                             
    }
        
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePartidas = new javax.swing.JTable();
        jTextFieldProducto = new javax.swing.JTextField();
        jButtonProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldConcepto = new javax.swing.JTextField();
        jButtonBuscarConceptos = new javax.swing.JButton();
        jTextFieldDescripcionConcepto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldExistenciaGral = new javax.swing.JTextField();
        jBTab1 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jComboBoxUnidad = new javax.swing.JComboBox();
        jTUnid = new javax.swing.JTextField();
        jRadioButtonSalida = new javax.swing.JRadioButton();
        jRadioButtonEntrada = new javax.swing.JRadioButton();
        jBPrec = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComTall = new javax.swing.JComboBox();
        jTTall = new javax.swing.JTextField();
        jComColo = new javax.swing.JComboBox();
        jTColo = new javax.swing.JTextField();
        jComboBoxAlmacenes = new javax.swing.JComboBox();
        jTDescripAlma = new javax.swing.JTextField();
        jBExisAlma = new javax.swing.JButton();
        jTextFieldCosto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLote = new javax.swing.JTextField();
        jTextFieldPedimento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTComenSer = new javax.swing.JTextField();
        jTSerProd = new javax.swing.JTextField();
        jBCarSer = new javax.swing.JButton();
        jTCarSer = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jBtnReferencia = new javax.swing.JButton();
        jTextFieldReferencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMonedas = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jButtonQuitar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 102, 0));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("Salir (ESC)");
        jButtonSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonSalir.setNextFocusableComponent(jTextFieldProducto);
        jP1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 110, -1));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setText("Agregar");
        jBNew.setToolTipText("Nuevo Ingreso/Salida (Ctrl+N)");
        jBNew.setNextFocusableComponent(jButtonQuitar);
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingresos:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, -1));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "E/S", "Cod. Producto", "Descripción", "Unidad", "Cantidad", "Cod. Concepto", "Activo", "Lote", "Pedimento", "Fecha Caducidad", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jTablePartidas);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 820, 250));

        jTextFieldProducto.setBackground(new java.awt.Color(255, 255, 153));
        jTextFieldProducto.setToolTipText("Ctrl+B búsqueda avanzada");
        jTextFieldProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldProducto.setNextFocusableComponent(jButtonProducto);
        jP1.add(jTextFieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 20));

        jButtonProducto.setBackground(new java.awt.Color(255, 255, 255));
        jButtonProducto.setText("...");
        jButtonProducto.setToolTipText("Buscar Producto(s)");
        jButtonProducto.setName(""); // NOI18N
        jButtonProducto.setNextFocusableComponent(jTextFieldDescripcion);
        jP1.add(jButtonProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 30, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Costo entrada:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 140, 20));

        jTextFieldDescripcion.setEditable(false);
        jTextFieldDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldDescripcion.setNextFocusableComponent(jTextFieldExistenciaGral);
        jP1.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Almacén:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, -1));

        jTextFieldCantidad.setText("1");
        jTextFieldCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCantidad.setNextFocusableComponent(jTextFieldConcepto);
        jP1.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("*Cantidad:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 80, 20));

        jTextFieldConcepto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldConcepto.setNextFocusableComponent(jButtonBuscarConceptos);
        jP1.add(jTextFieldConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 110, 20));

        jButtonBuscarConceptos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarConceptos.setText("...");
        jButtonBuscarConceptos.setToolTipText("Buscar Producto(s)");
        jButtonBuscarConceptos.setNextFocusableComponent(jTextFieldDescripcionConcepto);
        jP1.add(jButtonBuscarConceptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 30, 20));

        jTextFieldDescripcionConcepto.setEditable(false);
        jTextFieldDescripcionConcepto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldDescripcionConcepto.setNextFocusableComponent(jTextFieldProducto);
        jP1.add(jTextFieldDescripcionConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 140, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("*Cod. Producto:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

        jTextFieldExistenciaGral.setEditable(false);
        jTextFieldExistenciaGral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldExistenciaGral.setNextFocusableComponent(jComboBoxUnidad);
        jP1.add(jTextFieldExistenciaGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 90, 20));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 10, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 130, 18));

        jComboBoxUnidad.setNextFocusableComponent(jTUnid);
        jP1.add(jComboBoxUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 20));

        jTUnid.setEditable(false);
        jTUnid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUnid.setNextFocusableComponent(jComTall);
        jP1.add(jTUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 90, 20));

        jRadioButtonSalida.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonSalida.setText("Salida");
        jRadioButtonSalida.setName(""); // NOI18N
        jRadioButtonSalida.setNextFocusableComponent(jComboBoxMonedas);
        jP1.add(jRadioButtonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 90, -1));

        jRadioButtonEntrada.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonEntrada.setSelected(true);
        jRadioButtonEntrada.setText("Entrada");
        jRadioButtonEntrada.setNextFocusableComponent(jRadioButtonSalida);
        jP1.add(jRadioButtonEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 90, -1));

        jBPrec.setBackground(new java.awt.Color(255, 255, 255));
        jBPrec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPrec.setText("$");
        jBPrec.setToolTipText("Lista de Precios y Costeos");
        jBPrec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBPrec.setNextFocusableComponent(jTextFieldLote);
        jP1.add(jBPrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 70, 20));

        jLabel16.setText("Talla:");
        jP1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, -1));

        jLabel15.setText("Color:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, -1));

        jComTall.setNextFocusableComponent(jTTall);
        jP1.add(jComTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 90, 20));

        jTTall.setEditable(false);
        jTTall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTall.setNextFocusableComponent(jComColo);
        jP1.add(jTTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 90, 20));

        jComColo.setNextFocusableComponent(jTColo);
        jP1.add(jComColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 90, 20));

        jTColo.setEditable(false);
        jTColo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTColo.setNextFocusableComponent(jBPrec);
        jP1.add(jTColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 90, 20));

        jComboBoxAlmacenes.setNextFocusableComponent(jTDescripAlma);
        jP1.add(jComboBoxAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 90, 20));

        jTDescripAlma.setEditable(false);
        jTDescripAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripAlma.setNextFocusableComponent(jRadioButtonEntrada);
        jP1.add(jTDescripAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 100, 20));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jP1.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 10, 20));

        jTextFieldCosto.setText("$0.00");
        jTextFieldCosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCosto.setNextFocusableComponent(jTextFieldConcepto);
        jP1.add(jTextFieldCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 140, 20));

        jLabel17.setText("Unidad:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("*Concepto:");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 100, 20));

        jTextFieldLote.setToolTipText("Lote");
        jTextFieldLote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldLote.setNextFocusableComponent(jTextFieldPedimento);
        jP1.add(jTextFieldLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 90, 20));

        jTextFieldPedimento.setToolTipText("Pedimento");
        jTextFieldPedimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTextFieldPedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, 20));

        jLabel11.setText("Existencia general:");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        jLabel12.setText("Lote:");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 90, -1));

        jLabel13.setText("Pedimento:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 90, -1));

        jLabel14.setText("Importar números de serie:");
        jP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 190, 20));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 10, 20));

        jTSerProd.setEditable(false);
        jTSerProd.setFocusable(false);
        jP1.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 10, 20));

        jBCarSer.setBackground(new java.awt.Color(255, 255, 255));
        jBCarSer.setText("..");
        jBCarSer.setToolTipText("Buscar archivo EXCEL para series con dos columnas");
        jP1.add(jBCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 20));

        jTCarSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 160, 20));

        jLabel18.setText("Fecha caducidad:");
        jP1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 190, 20));

        jBtnReferencia.setText("jButton1");
        jP1.add(jBtnReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 20, 20));

        jTextFieldReferencia.setEditable(false);
        jP1.add(jTextFieldReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 120, 20));

        jLabel1.setText("Activo");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 40, -1));

        jComboBoxMonedas.setName(""); // NOI18N
        jComboBoxMonedas.setNextFocusableComponent(jTextFieldCosto);
        jP1.add(jComboBoxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 80, 20));

        jLabel9.setText("Fecha:");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 80, 20));

        jButtonQuitar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonQuitar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonQuitar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonQuitar.setText("Quitar");
        jButtonQuitar.setNextFocusableComponent(jButtonAceptar);
        jP1.add(jButtonQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 110, 30));

        jButtonAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setNextFocusableComponent(jButtonSalir);
        jP1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 110, 30));

        jLabel19.setText("Moneda:");
        jP1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
         
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCarSer;
    private javax.swing.JButton jBExisAlma;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBPrec;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBtnReferencia;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonBuscarConceptos;
    private javax.swing.JButton jButtonProducto;
    private javax.swing.JButton jButtonQuitar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox jComColo;
    private javax.swing.JComboBox jComTall;
    private javax.swing.JComboBox jComboBoxAlmacenes;
    private javax.swing.JComboBox jComboBoxMonedas;
    private javax.swing.JComboBox jComboBoxUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JRadioButton jRadioButtonEntrada;
    private javax.swing.JRadioButton jRadioButtonSalida;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCarSer;
    private javax.swing.JTextField jTColo;
    private javax.swing.JTextField jTComenSer;
    private javax.swing.JTextField jTDescripAlma;
    private javax.swing.JTextField jTSerProd;
    private javax.swing.JTextField jTTall;
    private javax.swing.JTextField jTUnid;
    private javax.swing.JTable jTablePartidas;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldConcepto;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDescripcionConcepto;
    private javax.swing.JTextField jTextFieldExistenciaGral;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldPedimento;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldReferencia;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
