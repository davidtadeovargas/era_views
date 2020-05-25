package com.era.views;


public abstract class PedidoJFrame extends BaseJFrame {
    
    public PedidoJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
    
          
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartidas = new javax.swing.JTable();
        jButtonAddPartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jPClien = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldSerieCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscarPedidos = new javax.swing.JButton();
        jButtonBorrarPartida = new javax.swing.JButton();
        jTextFieldImpuesto = new javax.swing.JTextField();
        jTextFieldSubtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jBTab1 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jPOtr = new javax.swing.JPanel();
        jCheckboxMostrarArchivos = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaObservaciones = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jComboboxMonedas = new javax.swing.JComboBox();
        jComboBoxSerie = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jPParts = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldProducto = new javax.swing.JTextField();
        jButtonBuscarProducto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldListaPrecio = new javax.swing.JTextField();
        jButtonBuscarListaPrecio = new javax.swing.JButton();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxUnidades = new javax.swing.JComboBox();
        jTextFieldUnidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldExistenciaGral = new javax.swing.JTextField();
        jSImg = new javax.swing.JScrollPane();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jBVeGran = new javax.swing.JButton();
        jBGranDescrip = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDescuento = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldSerieProducto = new javax.swing.JTextField();
        jBComenSer = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jTextFieldEsKit = new javax.swing.JTextField();
        jComboBoxAlmacenes = new javax.swing.JComboBox();
        jTextFieldDescripcionAlmacenes = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jBExisAlma = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jTextFieldExistenciaAlmacen = new javax.swing.JTextField();
        jButtonImpuestos = new javax.swing.JButton();
        jTextFieldCodigoOpcional = new javax.swing.JTextField();
        jLblCodigoOpcional = new javax.swing.JLabel();
        jTAlma2 = new javax.swing.JTextField();
        jTextFieldTotalDescuento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTComenSer = new javax.swing.JTextField();
        jTGara = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jTLot = new javax.swing.JTextField();
        jTPedimen = new javax.swing.JTextField();
        jTCadu = new javax.swing.JTextField();
        jTCantLot = new javax.swing.JTextField();
        jLNot = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxVendedores = new javax.swing.JComboBox<String>();
        jTextFieldReferencia = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jButtonGenerarPDF = new javax.swing.JButton();

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
        jButtonSalir.setNextFocusableComponent(jTextFieldProducto);
        jP1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 120, 30));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Qty", "Recibir", "Producto", "Unidad", "Lista", "Descripción", "Precio", "Desc.%", "Almacén", "Importe", "%Impuesto", "Total Impuesto", "Importe Descuento", "Serie Producto", "Comentario Serie", "Garantía", "Es Kit", "Lote", "Pedimento", "Caducidad", "Cod.Impuesto", "Codigo opcional", "Backorder"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePartidas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setNextFocusableComponent(jButtonGuardar);
        jTablePartidas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTablePartidas);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1110, 160));

        jButtonAddPartida.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddPartida.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAddPartida.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAddPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jButtonAddPartida.setText("Nueva");
        jButtonAddPartida.setToolTipText("Nueva Partida (Ctrl+N)");
        jButtonAddPartida.setNextFocusableComponent(jButtonBorrarPartida);
        jP1.add(jButtonAddPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Impuesto:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 160, -1));

        jButtonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setToolTipText("Guardar");
        jButtonGuardar.setNextFocusableComponent(jButtonSalir);
        jP1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, 30));

        jPClien.setBackground(new java.awt.Color(255, 255, 255));
        jPClien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPClien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Nombre cliente:");
        jPClien.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, -1));

        jLabel17.setText("*Código cliente:");
        jPClien.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, 20));

        jButtonBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarCliente.setText("...");
        jButtonBuscarCliente.setToolTipText("Buscar Cliente(s)");
        jButtonBuscarCliente.setNextFocusableComponent(jTextFieldSerieCliente);
        jPClien.add(jButtonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 30, 20));

        jTextFieldCliente.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCliente.setNextFocusableComponent(jButtonBuscarCliente);
        jPClien.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 90, 20));

        jTextFieldSerieCliente.setEditable(false);
        jTextFieldSerieCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldSerieCliente.setNextFocusableComponent(jTextFieldNombre);
        jPClien.add(jTextFieldSerieCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 60, 20));

        jLabel2.setText("Fecha entrega:");
        jPClien.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 130, -1));

        jButtonBuscarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarPedidos.setText("...");
        jButtonBuscarPedidos.setToolTipText("Buscar Cotización");
        jPClien.add(jButtonBuscarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 30, 20));

        jP1.add(jPClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 680, 90));

        jButtonBorrarPartida.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBorrarPartida.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonBorrarPartida.setForeground(new java.awt.Color(0, 102, 0));
        jButtonBorrarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jButtonBorrarPartida.setText("Borrar");
        jButtonBorrarPartida.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jButtonBorrarPartida.setName(""); // NOI18N
        jButtonBorrarPartida.setNextFocusableComponent(jTablePartidas);
        jP1.add(jButtonBorrarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 20));

        jTextFieldImpuesto.setEditable(false);
        jTextFieldImpuesto.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldImpuesto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldImpuesto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldImpuesto.setText("$0.00");
        jTextFieldImpuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldImpuesto.setNextFocusableComponent(jButtonGuardar);
        jP1.add(jTextFieldImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 200, 20));

        jTextFieldSubtotal.setEditable(false);
        jTextFieldSubtotal.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldSubtotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldSubtotal.setText("$0.00");
        jTextFieldSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldSubtotal.setNextFocusableComponent(jButtonGuardar);
        jP1.add(jTextFieldSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 200, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Descuento:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 190, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sub Total:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 120, -1));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotal.setText("$0.00");
        jTextFieldTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldTotal.setNextFocusableComponent(jButtonGuardar);
        jP1.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, 200, 20));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 10, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar Todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 342, 130, 18));

        jPOtr.setBackground(new java.awt.Color(255, 255, 255));
        jPOtr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Encabezado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPOtr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckboxMostrarArchivos.setBackground(new java.awt.Color(255, 255, 255));
        jCheckboxMostrarArchivos.setText("Mostrar archivos ");
        jCheckboxMostrarArchivos.setNextFocusableComponent(jComboboxMonedas);
        jPOtr.add(jCheckboxMostrarArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 130, 20));

        jLabel29.setForeground(new java.awt.Color(51, 0, 255));
        jLabel29.setText("F4");
        jPOtr.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 30, -1));

        jLabel20.setText("Observaciones:");
        jPOtr.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, -1));

        jTextAreaObservaciones.setColumns(20);
        jTextAreaObservaciones.setLineWrap(true);
        jTextAreaObservaciones.setRows(5);
        jTextAreaObservaciones.setNextFocusableComponent(jCheckboxMostrarArchivos);
        jScrollPane4.setViewportView(jTextAreaObservaciones);

        jPOtr.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 90));

        jLabel11.setText("Cod. moneda:");
        jPOtr.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, -1));

        jComboboxMonedas.setName(""); // NOI18N
        jComboboxMonedas.setNextFocusableComponent(jComboBoxSerie);
        jPOtr.add(jComboboxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, 20));

        jComboBoxSerie.setNextFocusableComponent(jComboBoxVendedores);
        jPOtr.add(jComboBoxSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 140, 20));

        jLabel24.setText("*Serie:");
        jPOtr.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 100, -1));

        jP1.add(jPOtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 370, 150));

        jPParts.setBackground(new java.awt.Color(255, 255, 255));
        jPParts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPParts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Producto:");
        jPParts.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jTextFieldProducto.setBackground(new java.awt.Color(255, 255, 153));
        jTextFieldProducto.setToolTipText("Ctrl+B búsqueda avanzada");
        jTextFieldProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldProducto.setNextFocusableComponent(jButtonBuscarProducto);
        jPParts.add(jTextFieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 20));

        jButtonBuscarProducto.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarProducto.setText("...");
        jButtonBuscarProducto.setToolTipText("Buscar Producto(s)");
        jButtonBuscarProducto.setName(""); // NOI18N
        jButtonBuscarProducto.setNextFocusableComponent(jTextFieldCantidad);
        jPParts.add(jButtonBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 30, 20));

        jLabel13.setText("Descripción:");
        jPParts.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel18.setText("Almacén:");
        jPParts.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        jTextFieldPrecio.setText("$0.00");
        jTextFieldPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldPrecio.setNextFocusableComponent(jTextFieldListaPrecio);
        jPParts.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 70, 20));

        jTextFieldDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldDescripcion.setNextFocusableComponent(jTextFieldPrecio);
        jPParts.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 630, 20));

        jLabel8.setText("L.Precio:");
        jPParts.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, -1));

        jTextFieldListaPrecio.setText("1");
        jTextFieldListaPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldListaPrecio.setNextFocusableComponent(jButtonBuscarListaPrecio);
        jPParts.add(jTextFieldListaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 60, 20));

        jButtonBuscarListaPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarListaPrecio.setText("jButton1");
        jButtonBuscarListaPrecio.setToolTipText("Buscar Listas de Precio");
        jButtonBuscarListaPrecio.setNextFocusableComponent(jTextFieldDescuento);
        jPParts.add(jButtonBuscarListaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 30, 20));

        jTextFieldCantidad.setText("1.0");
        jTextFieldCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCantidad.setNextFocusableComponent(jComboBoxUnidades);
        jPParts.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 60, 20));

        jLabel22.setText("Cantidad:");
        jPParts.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 60, -1));

        jLabel6.setText("%Desc:");
        jPParts.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 50, -1));

        jComboBoxUnidades.setNextFocusableComponent(jTextFieldUnidad);
        jPParts.add(jComboBoxUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 70, 20));

        jTextFieldUnidad.setEditable(false);
        jTextFieldUnidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldUnidad.setNextFocusableComponent(jTextFieldExistenciaGral);
        jPParts.add(jTextFieldUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 80, 20));

        jLabel3.setText("Existencia Alm:");
        jPParts.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 90, -1));

        jTextFieldExistenciaGral.setEditable(false);
        jTextFieldExistenciaGral.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldExistenciaGral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldExistenciaGral.setNextFocusableComponent(jTextFieldDescripcion);
        jPParts.add(jTextFieldExistenciaGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 20));

        jPanImg.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addGap(0, 258, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jSImg.setViewportView(jPanImg);

        jPParts.add(jSImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 260, -1));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVeGran.setToolTipText("Ver Imágen  de Producto Completa");
        jBVeGran.setNextFocusableComponent(jButtonAddPartida);
        jPParts.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 144, 30, 20));

        jBGranDescrip.setBackground(new java.awt.Color(0, 153, 153));
        jBGranDescrip.setToolTipText("Ver/Modificar Descripción en Grande");
        jPParts.add(jBGranDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 10, 20));

        jLabel10.setText("Unidad:");
        jPParts.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 50, -1));

        jTextFieldDescuento.setText("0");
        jTextFieldDescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldDescuento.setNextFocusableComponent(jComboBoxAlmacenes);
        jPParts.add(jTextFieldDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 70, 20));

        jLabel23.setText("Serie:");
        jPParts.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 100, 20));

        jTextFieldSerieProducto.setToolTipText("Flecha abajo para ver las series existentes");
        jTextFieldSerieProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTextFieldSerieProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 260, 20));

        jBComenSer.setBackground(new java.awt.Color(0, 153, 153));
        jBComenSer.setToolTipText("Comentario de la Serie");
        jBComenSer.setNextFocusableComponent(jBVeGran);
        jPParts.add(jBComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 10, 20));

        jLabel50.setText("Es Kit:");
        jPParts.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 50, 20));

        jTextFieldEsKit.setEditable(false);
        jTextFieldEsKit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldEsKit.setNextFocusableComponent(jTextFieldSerieProducto);
        jPParts.add(jTextFieldEsKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, 20));

        jComboBoxAlmacenes.setNextFocusableComponent(jTextFieldDescripcionAlmacenes);
        jPParts.add(jComboBoxAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, 20));

        jTextFieldDescripcionAlmacenes.setEditable(false);
        jTextFieldDescripcionAlmacenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldDescripcionAlmacenes.setNextFocusableComponent(jTextFieldEsKit);
        jPParts.add(jTextFieldDescripcionAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, 20));

        jLabel27.setText("Precio:");
        jPParts.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, -1));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jPParts.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 10, 20));

        jLabel46.setText("Existencia:");
        jPParts.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 70, -1));

        jTextFieldExistenciaAlmacen.setEditable(false);
        jTextFieldExistenciaAlmacen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldExistenciaAlmacen.setNextFocusableComponent(jButtonAddPartida);
        jPParts.add(jTextFieldExistenciaAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 50, 20));

        jButtonImpuestos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonImpuestos.setText("+");
        jPParts.add(jButtonImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, 20));
        jPParts.add(jTextFieldCodigoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 210, 30));

        jLblCodigoOpcional.setText("Observacion Partida:");
        jPParts.add(jLblCodigoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        jP1.add(jPParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1110, 176));

        jTAlma2.setEditable(false);
        jTAlma2.setFocusable(false);
        jP1.add(jTAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 10, -1));

        jTextFieldTotalDescuento.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldTotalDescuento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldTotalDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotalDescuento.setText("$0.00");
        jTextFieldTotalDescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldTotalDescuento.setNextFocusableComponent(jButtonGuardar);
        jP1.add(jTextFieldTotalDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, 200, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Total:");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 190, 20));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 10));

        jTGara.setEditable(false);
        jTGara.setFocusable(false);
        jP1.add(jTGara, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 10, -1));

        jTId.setEditable(false);
        jTId.setFocusable(false);
        jP1.add(jTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 10, -1));

        jTLot.setEditable(false);
        jTLot.setFocusable(false);
        jP1.add(jTLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 10, -1));

        jTPedimen.setEditable(false);
        jTPedimen.setFocusable(false);
        jP1.add(jTPedimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 10, -1));

        jTCadu.setEditable(false);
        jTCadu.setFocusable(false);
        jP1.add(jTCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 10, -1));

        jTCantLot.setEditable(false);
        jTCantLot.setText("0");
        jTCantLot.setFocusable(false);
        jP1.add(jTCantLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 10, -1));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 440, 30));

        jLabel19.setText("Vendedor:");
        jP1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        jComboBoxVendedores.setNextFocusableComponent(jTextFieldProducto);
        jP1.add(jComboBoxVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, 20));

        jTextFieldReferencia.setEditable(false);
        jP1.add(jTextFieldReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, 20));

        jLabel47.setText("Referencia:");
        jP1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jButtonGenerarPDF.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGenerarPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonGenerarPDF.setForeground(new java.awt.Color(0, 102, 0));
        jButtonGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/genpdf.png"))); // NOI18N
        jButtonGenerarPDF.setText("Previo PDF");
        jButtonGenerarPDF.setToolTipText("Generar PDF");
        jP1.add(jButtonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
           
        
               
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComenSer;
    private javax.swing.JButton jBExisAlma;
    private javax.swing.JButton jBGranDescrip;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBVeGran;
    private javax.swing.JButton jButtonAddPartida;
    private javax.swing.JButton jButtonBorrarPartida;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonBuscarListaPrecio;
    private javax.swing.JButton jButtonBuscarPedidos;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JButton jButtonGenerarPDF;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonImpuestos;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckboxMostrarArchivos;
    private javax.swing.JComboBox jComboBoxAlmacenes;
    private javax.swing.JComboBox jComboBoxSerie;
    private javax.swing.JComboBox jComboBoxUnidades;
    private javax.swing.JComboBox<String> jComboBoxVendedores;
    private javax.swing.JComboBox jComboboxMonedas;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLNot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblCodigoOpcional;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPClien;
    private javax.swing.JPanel jPOtr;
    private javax.swing.JPanel jPParts;
    private javax.swing.JPanel jPanImg;
    private javax.swing.JScrollPane jSImg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTAlma2;
    private javax.swing.JTextField jTCadu;
    private javax.swing.JTextField jTCantLot;
    private javax.swing.JTextField jTComenSer;
    private javax.swing.JTextField jTGara;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTLot;
    private javax.swing.JTextField jTPedimen;
    private javax.swing.JTable jTablePartidas;
    private javax.swing.JTextArea jTextAreaObservaciones;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodigoOpcional;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDescripcionAlmacenes;
    private javax.swing.JTextField jTextFieldDescuento;
    private javax.swing.JTextField jTextFieldEsKit;
    private javax.swing.JTextField jTextFieldExistenciaAlmacen;
    private javax.swing.JTextField jTextFieldExistenciaGral;
    private javax.swing.JTextField jTextFieldImpuesto;
    private javax.swing.JTextField jTextFieldListaPrecio;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldReferencia;
    private javax.swing.JTextField jTextFieldSerieCliente;
    private javax.swing.JTextField jTextFieldSerieProducto;
    private javax.swing.JTextField jTextFieldSubtotal;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldTotalDescuento;
    private javax.swing.JTextField jTextFieldUnidad;
    // End of variables declaration//GEN-END:variables

}
