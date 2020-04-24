package com.era.views;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public class CxpJFrame extends javax.swing.JFrame 
{
    public CxpJFrame() 
    {
        initComponents();
        
        jTab1.getColumnModel().getColumn(17).setMinWidth(0);
        jTab1.getColumnModel().getColumn(17).setMaxWidth(0);
        
        jTab1.getColumnModel().getColumn(3).setPreferredWidth(160);
        jTab1.getColumnModel().getColumn(4).setPreferredWidth(300);
        jTab1.getColumnModel().getColumn(10).setPreferredWidth(160);
        jTab1.getColumnModel().getColumn(11).setPreferredWidth(160);
        jTab1.getColumnModel().getColumn(15).setPreferredWidth(300);
        
        jTab2.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTab2.getColumnModel().getColumn(7).setPreferredWidth(400);
        
        this.getRootPane().setDefaultButton(jBAbon);
        
        jTab1.getTableHeader().setReorderingAllowed(false);
        jTab2.getTableHeader().setReorderingAllowed(false);
        
        this.setLocationRelativeTo(null);
        
        jTab1.setAutoResizeMode(0);
        jTab2.setAutoResizeMode(0);
        
        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)jTab1.getModel());
        jTab1.setRowSorter      (trs);
        trs.setSortsOnUpdates   (true);
        
        jTProv.grabFocus();
        
        jTab1.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,       null);
        jTab1.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,      null);
        jTab2.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,       null);
        jTab2.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,      null);
    }

    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBAbon = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab2 = new javax.swing.JTable();
        jCPe = new javax.swing.JCheckBox();
        jCCo = new javax.swing.JCheckBox();
        jBVerA = new javax.swing.JButton();
        jTProv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jBProv = new javax.swing.JButton();
        jCVen = new javax.swing.JCheckBox();
        jBActua = new javax.swing.JButton();
        jBVis = new javax.swing.JButton();
        jBTab1 = new javax.swing.JButton();
        jBTab2 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jTClas = new javax.swing.JTextField();
        jBClas = new javax.swing.JButton();
        jTClasDescrip = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTDia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTCond = new javax.swing.JTextField();
        jBLib = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAbon.setBackground(new java.awt.Color(255, 255, 255));
        jBAbon.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBAbon.setForeground(new java.awt.Color(0, 102, 0));
        jBAbon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abona.png"))); // NOI18N
        jBAbon.setText("Abonar");
        jBAbon.setToolTipText("Abonar");
        jBAbon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBAbon.setNextFocusableComponent(jBVerA);
        jBAbon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAbonMouseExited(evt);
            }
        });
        jBAbon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbonActionPerformed(evt);
            }
        });
        jBAbon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAbonKeyPressed(evt);
            }
        });
        jP1.add(jBAbon, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTProv);
        jBSal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalMouseExited(evt);
            }
        });
        jBSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalActionPerformed(evt);
            }
        });
        jBSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSalKeyPressed(evt);
            }
        });
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("A:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 40, -1));

        jTab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Folio", "Serie", "Proveedor", "Nombre del Proveedor", "Subtotal", "Impuesto", "Total", "Total Abonos", "Pendiente Liquidar", "Fecha", "Fecha Vencimiento", "Sucursal", "Caja", "Usuario", "Nombre de Usuario", "Estado", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab1.setGridColor(new java.awt.Color(255, 255, 255));
        jTab1.setNextFocusableComponent(jTab2);
        jTab1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTab1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab1);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 830, 230));

        jTab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Fecha", "Compra", "Tipo Doc", "Producto", "Qty", "Unidad", "Descripción", "Descuento", "Moneda", "Impuesto", "Precio", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab2.setGridColor(new java.awt.Color(255, 255, 255));
        jTab2.setNextFocusableComponent(jBLib);
        jTab2.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTab2KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTab2);
        jTab2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 950, 170));

        jCPe.setBackground(new java.awt.Color(255, 255, 255));
        jCPe.setSelected(true);
        jCPe.setText("PE");
        jCPe.setNextFocusableComponent(jCCo);
        jCPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPeActionPerformed(evt);
            }
        });
        jCPe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCPeKeyPressed(evt);
            }
        });
        jP1.add(jCPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 80, -1));

        jCCo.setBackground(new java.awt.Color(255, 255, 255));
        jCCo.setText("CO");
        jCCo.setName(""); // NOI18N
        jCCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCoActionPerformed(evt);
            }
        });
        jCCo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCoKeyPressed(evt);
            }
        });
        jP1.add(jCCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 80, -1));

        jBVerA.setBackground(new java.awt.Color(255, 255, 255));
        jBVerA.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVerA.setForeground(new java.awt.Color(0, 102, 0));
        jBVerA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abon.png"))); // NOI18N
        jBVerA.setText("Abonos");
        jBVerA.setToolTipText("Ver Todos los Abonos de Compra(s) (F2)");
        jBVerA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVerA.setNextFocusableComponent(jBActua);
        jBVerA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVerAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVerAMouseExited(evt);
            }
        });
        jBVerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerAActionPerformed(evt);
            }
        });
        jBVerA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVerAKeyPressed(evt);
            }
        });
        jP1.add(jBVerA, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, 30));

        jTProv.setBackground(new java.awt.Color(204, 255, 204));
        jTProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProv.setNextFocusableComponent(jBProv);
        jTProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTProvFocusLost(evt);
            }
        });
        jTProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTProvKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTProvKeyTyped(evt);
            }
        });
        jP1.add(jTProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("De:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 40, -1));

        jTNom.setEditable(false);
        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNom.setNextFocusableComponent(jTClas);
        jTNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomFocusLost(evt);
            }
        });
        jTNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNomKeyPressed(evt);
            }
        });
        jP1.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 230, 20));

        jBProv.setBackground(new java.awt.Color(255, 255, 255));
        jBProv.setText("...");
        jBProv.setToolTipText("Buscar Proveedor(es)");
        jBProv.setNextFocusableComponent(jTNom);
        jBProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProvMouseExited(evt);
            }
        });
        jBProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProvActionPerformed(evt);
            }
        });
        jBProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBProvKeyPressed(evt);
            }
        });
        jP1.add(jBProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 30, 20));

        jCVen.setBackground(new java.awt.Color(255, 255, 255));
        jCVen.setText("Vencido a:");
        jCVen.setNextFocusableComponent(jTDia);
        jCVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCVenActionPerformed(evt);
            }
        });
        jCVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCVenKeyPressed(evt);
            }
        });
        jP1.add(jCVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 90, -1));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar Registros (F5)");
        jBActua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBActua.setNextFocusableComponent(jBVis);
        jBActua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBActuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBActuaMouseExited(evt);
            }
        });
        jBActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActuaActionPerformed(evt);
            }
        });
        jBActua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBActuaKeyPressed(evt);
            }
        });
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 120, 30));

        jBVis.setBackground(new java.awt.Color(255, 255, 255));
        jBVis.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVis.setForeground(new java.awt.Color(0, 102, 0));
        jBVis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/visor.png"))); // NOI18N
        jBVis.setText("Reporte");
        jBVis.setToolTipText("Reporte (F6)");
        jBVis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVis.setNextFocusableComponent(jBSal);
        jBVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVisMouseExited(evt);
            }
        });
        jBVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisActionPerformed(evt);
            }
        });
        jBVis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVisKeyPressed(evt);
            }
        });
        jP1.add(jBVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 120, 30));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jBTab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTab1ActionPerformed(evt);
            }
        });
        jBTab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTab1KeyPressed(evt);
            }
        });
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 10, 20));

        jBTab2.setBackground(new java.awt.Color(0, 153, 153));
        jBTab2.setToolTipText("Mostrar Tabla en Grande");
        jBTab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTab2ActionPerformed(evt);
            }
        });
        jBTab2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTab2KeyPressed(evt);
            }
        });
        jP1.add(jBTab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 10, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTab1);
        jBTod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBTodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBTodMouseExited(evt);
            }
        });
        jBTod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTodActionPerformed(evt);
            }
        });
        jBTod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTodKeyPressed(evt);
            }
        });
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 102, 130, 18));

        jTClas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClas.setNextFocusableComponent(jBClas);
        jTClas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTClasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTClasFocusLost(evt);
            }
        });
        jTClas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTClasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClasKeyTyped(evt);
            }
        });
        jP1.add(jTClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, 20));

        jBClas.setBackground(new java.awt.Color(255, 255, 255));
        jBClas.setText("...");
        jBClas.setToolTipText("Buscar Clasificación(es)");
        jBClas.setNextFocusableComponent(jTClasDescrip);
        jBClas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBClasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBClasMouseExited(evt);
            }
        });
        jBClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClasActionPerformed(evt);
            }
        });
        jBClas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBClasKeyPressed(evt);
            }
        });
        jP1.add(jBClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 30, 20));

        jTClasDescrip.setEditable(false);
        jTClasDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClasDescrip.setNextFocusableComponent(jTCond);
        jTClasDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTClasDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTClasDescripFocusLost(evt);
            }
        });
        jTClasDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTClasDescripKeyPressed(evt);
            }
        });
        jP1.add(jTClasDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 230, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Proveedor:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        jTDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDia.setText("30");
        jTDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDia.setNextFocusableComponent(jTab1);
        jTDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDiaFocusLost(evt);
            }
        });
        jTDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDiaKeyTyped(evt);
            }
        });
        jP1.add(jTDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 30, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Clasificación:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jTCond.setEditable(false);
        jTCond.setBackground(new java.awt.Color(255, 255, 204));
        jTCond.setForeground(new java.awt.Color(0, 153, 0));
        jTCond.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCond.setFocusable(false);
        jTCond.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCondFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCondFocusLost(evt);
            }
        });
        jTCond.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCondKeyPressed(evt);
            }
        });
        jP1.add(jTCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 380, 20));

        jBLib.setBackground(new java.awt.Color(255, 255, 255));
        jBLib.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBLib.setForeground(new java.awt.Color(0, 102, 0));
        jBLib.setText("Liberar");
        jBLib.setToolTipText("Liberar saldo del (los) proveedor(s)");
        jBLib.setName(""); // NOI18N
        jBLib.setNextFocusableComponent(jBAbon);
        jBLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLibMouseExited(evt);
            }
        });
        jBLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLibActionPerformed(evt);
            }
        });
        jBLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBLibKeyPressed(evt);
            }
        });
        jP1.add(jBLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    
        
    }//GEN-LAST:event_formKeyPressed
    
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

    
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

    
    
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
        
    }//GEN-LAST:event_formMouseWheelMoved

    
    
    
    
    
    
    
    
    
    
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    
        
    }//GEN-LAST:event_formWindowClosing

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
   
    private void jTFolBancFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFolBancFocusGained
        
        
    }//GEN-LAST:event_jTFolBancFocusGained

    
    
    private void jTFolBancFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFolBancFocusLost
        
        
        
    }//GEN-LAST:event_jTFolBancFocusLost

    
    
    private void jTFolBancKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFolBancKeyPressed
        
    
        
    }//GEN-LAST:event_jTFolBancKeyPressed

    
    
    private void jTFolBancKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFolBancKeyTyped
        
        
        
    }//GEN-LAST:event_jTFolBancKeyTyped

    
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed

    
    }//GEN-LAST:event_jP1KeyPressed

    
    private void jBLibKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBLibKeyPressed

    
    }//GEN-LAST:event_jBLibKeyPressed

    
    private void jBLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLibActionPerformed

    
    }//GEN-LAST:event_jBLibActionPerformed

    
    private void jBLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLibMouseExited

    
    }//GEN-LAST:event_jBLibMouseExited

    
    private void jBLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLibMouseEntered

    
    }//GEN-LAST:event_jBLibMouseEntered

    
    private void jTCondKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCondKeyPressed

    
    }//GEN-LAST:event_jTCondKeyPressed

    
    private void jTCondFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCondFocusLost

    
    }//GEN-LAST:event_jTCondFocusLost

    
    private void jTCondFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCondFocusGained

    
    }//GEN-LAST:event_jTCondFocusGained

    
    private void jTDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDiaKeyTyped

    
    }//GEN-LAST:event_jTDiaKeyTyped

    
    private void jTDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDiaKeyPressed

        
    }//GEN-LAST:event_jTDiaKeyPressed

    
    private void jTDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDiaFocusLost

    
    }//GEN-LAST:event_jTDiaFocusLost

    
    private void jTDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDiaFocusGained

    
    }//GEN-LAST:event_jTDiaFocusGained

    
    private void jTClasDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClasDescripKeyPressed

    
    }//GEN-LAST:event_jTClasDescripKeyPressed

    
    private void jTClasDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasDescripFocusLost

    
    }//GEN-LAST:event_jTClasDescripFocusLost

    
    private void jTClasDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasDescripFocusGained

    
    }//GEN-LAST:event_jTClasDescripFocusGained

    
    private void jBClasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBClasKeyPressed

    
    }//GEN-LAST:event_jBClasKeyPressed

    
    private void jBClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClasActionPerformed

    
    }//GEN-LAST:event_jBClasActionPerformed

    
    private void jBClasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClasMouseExited

    
    }//GEN-LAST:event_jBClasMouseExited

    
    private void jBClasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClasMouseEntered

    
    }//GEN-LAST:event_jBClasMouseEntered

    
    private void jTClasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClasKeyTyped

    
    }//GEN-LAST:event_jTClasKeyTyped

    
    private void jTClasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClasKeyPressed

    
    }//GEN-LAST:event_jTClasKeyPressed

    
    private void jTClasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasFocusLost

    
    }//GEN-LAST:event_jTClasFocusLost

    
    private void jTClasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasFocusGained

    
    }//GEN-LAST:event_jTClasFocusGained

    
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

    
    }//GEN-LAST:event_jBTodKeyPressed

    
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed

    
    }//GEN-LAST:event_jBTodActionPerformed

    
    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited

    
    }//GEN-LAST:event_jBTodMouseExited

    
    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered

    
    }//GEN-LAST:event_jBTodMouseEntered

    
    private void jBTab2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab2KeyPressed

    
    }//GEN-LAST:event_jBTab2KeyPressed

    
    private void jBTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab2ActionPerformed

    
    }//GEN-LAST:event_jBTab2ActionPerformed

    
    private void jBTab1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab1KeyPressed

    
    }//GEN-LAST:event_jBTab1KeyPressed

    
    private void jBTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab1ActionPerformed

    
    }//GEN-LAST:event_jBTab1ActionPerformed

    
    private void jBVisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVisKeyPressed

    
    }//GEN-LAST:event_jBVisKeyPressed

    
    private void jBVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisActionPerformed

    
    }//GEN-LAST:event_jBVisActionPerformed

    
    private void jBVisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisMouseExited

    
    }//GEN-LAST:event_jBVisMouseExited

    
    private void jBVisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisMouseEntered

    
    }//GEN-LAST:event_jBVisMouseEntered

    
    private void jBActuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActuaKeyPressed

    
    }//GEN-LAST:event_jBActuaKeyPressed

    
    private void jBActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActuaActionPerformed

    
    }//GEN-LAST:event_jBActuaActionPerformed

    
    private void jBActuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseExited

    
    }//GEN-LAST:event_jBActuaMouseExited

    
    private void jBActuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseEntered

    
    }//GEN-LAST:event_jBActuaMouseEntered

    
    private void jCVenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCVenKeyPressed

    
    }//GEN-LAST:event_jCVenKeyPressed

    
    private void jCVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCVenActionPerformed

    
    }//GEN-LAST:event_jCVenActionPerformed

    
    private void jBProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBProvKeyPressed

    
    }//GEN-LAST:event_jBProvKeyPressed

   
    private void jBProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProvActionPerformed

   
    }//GEN-LAST:event_jBProvActionPerformed

   
    private void jBProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProvMouseExited

   
    }//GEN-LAST:event_jBProvMouseExited

   
    private void jBProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProvMouseEntered

   
    }//GEN-LAST:event_jBProvMouseEntered

   
    private void jTNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyPressed

   
    }//GEN-LAST:event_jTNomKeyPressed

   
    private void jTNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusLost

   
    }//GEN-LAST:event_jTNomFocusLost

   
    private void jTNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusGained

   
    }//GEN-LAST:event_jTNomFocusGained

   
    private void jTProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProvKeyTyped

   
    }//GEN-LAST:event_jTProvKeyTyped

   
    private void jTProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProvKeyPressed

   
    }//GEN-LAST:event_jTProvKeyPressed

   
    private void jTProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProvFocusLost

   
    }//GEN-LAST:event_jTProvFocusLost

   
    private void jTProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProvFocusGained

   
    }//GEN-LAST:event_jTProvFocusGained

   
    private void jDTDeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDTDeKeyPressed

   
    }//GEN-LAST:event_jDTDeKeyPressed

   
    private void jDTDePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDTDePropertyChange

   
    }//GEN-LAST:event_jDTDePropertyChange

    private void jDTAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDTAKeyPressed

    }//GEN-LAST:event_jDTAKeyPressed

   
    private void jDTAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDTAPropertyChange

   
    }//GEN-LAST:event_jDTAPropertyChange

   
    private void jBVerAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVerAKeyPressed

   
    }//GEN-LAST:event_jBVerAKeyPressed

   
    private void jBVerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerAActionPerformed
   
    }//GEN-LAST:event_jBVerAActionPerformed

   
    private void jBVerAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerAMouseExited

   
    }//GEN-LAST:event_jBVerAMouseExited

   
    private void jBVerAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerAMouseEntered

   
    }//GEN-LAST:event_jBVerAMouseEntered

   
    private void jCCoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCoKeyPressed

   
    }//GEN-LAST:event_jCCoKeyPressed

   
    private void jCCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCoActionPerformed

   
    }//GEN-LAST:event_jCCoActionPerformed

   
    private void jCPeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPeKeyPressed

   
    }//GEN-LAST:event_jCPeKeyPressed

    
    private void jCPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPeActionPerformed

    
    }//GEN-LAST:event_jCPeActionPerformed

    
    private void jTab2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTab2KeyPressed

    
    }//GEN-LAST:event_jTab2KeyPressed

    private void jTab1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTab1KeyPressed

    }//GEN-LAST:event_jTab1KeyPressed

    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed

    }//GEN-LAST:event_jBSalKeyPressed

    
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed

    
    }//GEN-LAST:event_jBSalActionPerformed

    
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited

    
    }//GEN-LAST:event_jBSalMouseExited

    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered

    
    }//GEN-LAST:event_jBSalMouseEntered

    private void jBAbonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAbonKeyPressed

    }//GEN-LAST:event_jBAbonKeyPressed

    private void jBAbonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbonActionPerformed
    

    }//GEN-LAST:event_jBAbonActionPerformed

    
    private void jBAbonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAbonMouseExited

    
    }//GEN-LAST:event_jBAbonMouseExited

           
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbon;
    private javax.swing.JButton jBActua;
    private javax.swing.JButton jBClas;
    private javax.swing.JButton jBLib;
    private javax.swing.JButton jBProv;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTab2;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBVerA;
    private javax.swing.JButton jBVis;
    private javax.swing.JCheckBox jCCo;
    private javax.swing.JCheckBox jCPe;
    private javax.swing.JCheckBox jCVen;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTClas;
    private javax.swing.JTextField jTClasDescrip;
    private javax.swing.JTextField jTCond;
    private javax.swing.JTextField jTDia;
    private javax.swing.JTextField jTNom;
    private javax.swing.JTextField jTProv;
    private javax.swing.JTable jTab1;
    private javax.swing.JTable jTab2;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
