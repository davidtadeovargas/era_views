package com.era.views;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ComprJFrame extends BaseJFrame 
{
    public ComprJFrame(final String idTextTitleWindow) 
    {       
        super(idTextTitleWindow);
        
        initComponents();
                
        javax.swing.ButtonGroup bG = new javax.swing.ButtonGroup();
        bG.add(jRComp);
        bG.add(jROrd);
        bG.add(jRTod);
                
        jTableCompras.getTableHeader().setReorderingAllowed(false);
        tabla_partidas.getTableHeader().setReorderingAllowed(false);
        
        jTableCompras.setAutoResizeMode(0);
        
        tabla_partidas.setAutoResizeMode(0);
        
        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)jTableCompras.getModel());
        jTableCompras.setRowSorter(trs);
        trs.setSortsOnUpdates(true);
        
        jBNew.grabFocus();
        
        jTableCompras.getColumnModel().getColumn(0).setPreferredWidth(77);
        jTableCompras.getColumnModel().getColumn(1).setPreferredWidth(81);
        jTableCompras.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTableCompras.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTableCompras.getColumnModel().getColumn(6).setPreferredWidth(350);
        jTableCompras.getColumnModel().getColumn(8).setPreferredWidth(150);
        jTableCompras.getColumnModel().getColumn(9).setPreferredWidth(150);
        jTableCompras.getColumnModel().getColumn(10).setPreferredWidth(150);
        jTableCompras.getColumnModel().getColumn(11).setPreferredWidth(150);
        jTableCompras.getColumnModel().getColumn(12).setPreferredWidth(150);
        jTableCompras.getColumnModel().getColumn(14).setPreferredWidth(120);
        jTableCompras.getColumnModel().getColumn(15).setPreferredWidth(120);
        jTableCompras.getColumnModel().getColumn(16).setPreferredWidth(170);
        jTableCompras.getColumnModel().getColumn(17).setPreferredWidth(170);
        jTableCompras.getColumnModel().getColumn(19).setPreferredWidth(150);
        jTableCompras.getColumnModel().getColumn(22).setPreferredWidth(150);
        
        tabla_partidas.getColumnModel().getColumn(3).setPreferredWidth(400);        
        tabla_partidas.getColumnModel().getColumn(4).setPreferredWidth(40);
        tabla_partidas.getColumnModel().getColumn(5).setPreferredWidth(110);
        tabla_partidas.getColumnModel().getColumn(10).setPreferredWidth(110);
        tabla_partidas.getColumnModel().getColumn(11).setPreferredWidth(120);
        tabla_partidas.getColumnModel().getColumn(14).setPreferredWidth(140);
        tabla_partidas.getColumnModel().getColumn(17).setPreferredWidth(140);
        tabla_partidas.getColumnModel().getColumn(18).setPreferredWidth(190);
        tabla_partidas.getColumnModel().getColumn(19).setPreferredWidth(190);
        tabla_partidas.getColumnModel().getColumn(20).setPreferredWidth(190);
        
        jTableCompras.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTableCompras.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);                
        tabla_partidas.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        tabla_partidas.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);                                       
    }
        
    
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBNew = new javax.swing.JButton();
        jBDev = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCompras = new javax.swing.JTable();
        jBVe = new javax.swing.JButton();
        jBCan = new javax.swing.JButton();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostT = new javax.swing.JButton();
        jBDevPar = new javax.swing.JButton();
        jBVer = new javax.swing.JButton();
        jBCarg = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_partidas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBActua = new javax.swing.JButton();
        jBImp = new javax.swing.JButton();
        jBTab1 = new javax.swing.JButton();
        jBTab2 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jBDirOr = new javax.swing.JButton();
        jBVePDF = new javax.swing.JButton();
        jBRecOr = new javax.swing.JButton();
        jPRadio = new javax.swing.JPanel();
        jRComp = new javax.swing.JRadioButton();
        jRTod = new javax.swing.JRadioButton();
        jROrd = new javax.swing.JRadioButton();
        jLNot = new javax.swing.JLabel();
        jBGenPDF = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boton_primera = new javax.swing.JButton();
        boton_anterior = new javax.swing.JButton();
        boton_siguiente = new javax.swing.JButton();
        label_pagina = new javax.swing.JLabel();
        boton_ultima = new javax.swing.JButton();
        jButtonAbrir1 = new javax.swing.JButton();
        jBNotC = new javax.swing.JButton();

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
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
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

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nueva Compra (Ctrl+N). Presionando (Alt y este Botón) puedes Tomar una Compra como Machote para una Nueva");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jBNotC);
        jBNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNewMouseExited(evt);
            }
        });
        jBNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewActionPerformed(evt);
            }
        });
        jBNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBNewKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBNewKeyReleased(evt);
            }
        });
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 140, 30));

        jBDev.setBackground(new java.awt.Color(255, 255, 255));
        jBDev.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDev.setForeground(new java.awt.Color(0, 102, 0));
        jBDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devs.png"))); // NOI18N
        jBDev.setText("Devolución");
        jBDev.setToolTipText("Devolución Completa de Compra Completa (F2)");
        jBDev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDev.setNextFocusableComponent(jBDevPar);
        jBDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDevMouseExited(evt);
            }
        });
        jBDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevActionPerformed(evt);
            }
        });
        jBDev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDevKeyPressed(evt);
            }
        });
        jP1.add(jBDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Partidas:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jRComp);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 140, 30));

        jTableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Tipo", "Código", "Serie", "No. Documento", "Cod.Proveedor", "Nombre Proveedor", "Importe", "Moneda", "Fecha Creación", "Fecha Documento", "Fecha Entrega", "Ultima Modificación", "Estado", "Motivo", "Qty.Recibidas", "Cod.Ordén", "Asignada N.C.", "Pago N.C.", "Sucursal", "No. Caja", "Usuario", "Nombre Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompras.setGridColor(new java.awt.Color(255, 255, 255));
        jTableCompras.setNextFocusableComponent(jBBusc);
        jTableCompras.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComprasMouseClicked(evt);
            }
        });
        jTableCompras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableComprasKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCompras);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 960, 300));

        jBVe.setBackground(new java.awt.Color(255, 255, 255));
        jBVe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVe.setForeground(new java.awt.Color(0, 102, 0));
        jBVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ver.png"))); // NOI18N
        jBVe.setText("Ver ");
        jBVe.setToolTipText("Ver Órdenen/Compra(s) (F11)");
        jBVe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVe.setName(""); // NOI18N
        jBVe.setNextFocusableComponent(jBVer);
        jBVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVeMouseExited(evt);
            }
        });
        jBVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVeActionPerformed(evt);
            }
        });
        jBVe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVeKeyPressed(evt);
            }
        });
        jP1.add(jBVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 140, 30));

        jBCan.setBackground(new java.awt.Color(255, 255, 255));
        jBCan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCan.setForeground(new java.awt.Color(0, 102, 0));
        jBCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/can.png"))); // NOI18N
        jBCan.setText("Cancelar");
        jBCan.setToolTipText("Cancelar Venta(s) (Ctrl+SUPR)");
        jBCan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCan.setName(""); // NOI18N
        jBCan.setNextFocusableComponent(jBDev);
        jBCan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCanMouseExited(evt);
            }
        });
        jBCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCanActionPerformed(evt);
            }
        });
        jBCan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCanKeyPressed(evt);
            }
        });
        jP1.add(jBCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 140, 30));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jBBusc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBuscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBuscMouseExited(evt);
            }
        });
        jBBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscActionPerformed(evt);
            }
        });
        jBBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBBuscKeyPressed(evt);
            }
        });
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMostT);
        jTBusc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBuscFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBuscFocusLost(evt);
            }
        });
        jTBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscKeyPressed(evt);
            }
        });
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 670, 20));

        jBMostT.setBackground(new java.awt.Color(255, 255, 255));
        jBMostT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMostT.setForeground(new java.awt.Color(0, 102, 0));
        jBMostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMostT.setText("Mostrar F4");
        jBMostT.setNextFocusableComponent(jBCan);
        jBMostT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMostTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMostTMouseExited(evt);
            }
        });
        jBMostT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostTActionPerformed(evt);
            }
        });
        jBMostT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBMostTKeyPressed(evt);
            }
        });
        jP1.add(jBMostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 140, 20));

        jBDevPar.setBackground(new java.awt.Color(255, 255, 255));
        jBDevPar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDevPar.setForeground(new java.awt.Color(0, 102, 0));
        jBDevPar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devpar.png"))); // NOI18N
        jBDevPar.setText("Parcial");
        jBDevPar.setToolTipText("Devolución Parcial de Compra (F8)");
        jBDevPar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDevPar.setNextFocusableComponent(jBNew);
        jBDevPar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDevParMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDevParMouseExited(evt);
            }
        });
        jBDevPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevParActionPerformed(evt);
            }
        });
        jBDevPar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDevParKeyPressed(evt);
            }
        });
        jP1.add(jBDevPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 140, 30));

        jBVer.setBackground(new java.awt.Color(255, 255, 255));
        jBVer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVer.setForeground(new java.awt.Color(0, 102, 0));
        jBVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/verarch.png"))); // NOI18N
        jBVer.setText("Ver Archivo(s)");
        jBVer.setToolTipText("Ver archivos asociados a la compra");
        jBVer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVer.setNextFocusableComponent(jBCarg);
        jBVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVerMouseExited(evt);
            }
        });
        jBVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerActionPerformed(evt);
            }
        });
        jBVer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVerKeyPressed(evt);
            }
        });
        jP1.add(jBVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 140, 30));

        jBCarg.setBackground(new java.awt.Color(255, 255, 255));
        jBCarg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBCarg.setForeground(new java.awt.Color(0, 102, 0));
        jBCarg.setText("Cargar");
        jBCarg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCarg.setNextFocusableComponent(jBDel);
        jBCarg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCargMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCargMouseExited(evt);
            }
        });
        jBCarg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargActionPerformed(evt);
            }
        });
        jBCarg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCargKeyPressed(evt);
            }
        });
        jP1.add(jBCarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, -1, -1));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setText("Borrar");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBActua);
        jBDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDelMouseExited(evt);
            }
        });
        jBDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelActionPerformed(evt);
            }
        });
        jBDel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDelKeyPressed(evt);
            }
        });
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 250, 60, 20));

        tabla_partidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Compra", "Producto", "Descripción", "Cantidad", "Cant. Recibidas", "Devueltos", "Unidad", "Almacén", "Costo", "Desc.", "Desc. Adicional", "Impuesto", "Importe", "Fecha", "Lote", "Pedimento", "Caducidad", "Serie Producto", "Comentario Serie", "Garantía", "Activo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_partidas.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_partidas.setNextFocusableComponent(jBCan);
        tabla_partidas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabla_partidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_partidasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_partidas);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 960, 160));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Órdenes/compras:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, -1));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar Registros (F5)");
        jBActua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBActua.setNextFocusableComponent(jBImp);
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
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 140, 30));

        jBImp.setBackground(new java.awt.Color(255, 255, 255));
        jBImp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBImp.setForeground(new java.awt.Color(0, 102, 0));
        jBImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impres.png"))); // NOI18N
        jBImp.setText("Imprimir");
        jBImp.setToolTipText("Imprimir Compra(s)  (Ctrl+P)");
        jBImp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBImp.setName(""); // NOI18N
        jBImp.setNextFocusableComponent(jBVePDF);
        jBImp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBImpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBImpMouseExited(evt);
            }
        });
        jBImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImpActionPerformed(evt);
            }
        });
        jBImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBImpKeyPressed(evt);
            }
        });
        jP1.add(jBImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 300, 140, 30));

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
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 10, 20));

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
        jP1.add(jBTab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 10, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros en la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTableCompras);
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
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 12, 130, 18));

        jBDirOr.setBackground(new java.awt.Color(255, 255, 255));
        jBDirOr.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirOr.setForeground(new java.awt.Color(0, 102, 0));
        jBDirOr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dir.png"))); // NOI18N
        jBDirOr.setText("Órdenes");
        jBDirOr.setToolTipText("Directorio de Órdenes de Compra");
        jBDirOr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirOr.setNextFocusableComponent(jBSal);
        jBDirOr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDirOrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDirOrMouseExited(evt);
            }
        });
        jBDirOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDirOrActionPerformed(evt);
            }
        });
        jBDirOr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDirOrKeyPressed(evt);
            }
        });
        jP1.add(jBDirOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 390, 140, 30));

        jBVePDF.setBackground(new java.awt.Color(255, 255, 255));
        jBVePDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVePDF.setForeground(new java.awt.Color(0, 102, 0));
        jBVePDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jBVePDF.setText("Ver PDF");
        jBVePDF.setToolTipText("Ver PDF de Compra(s) (Alt+F)");
        jBVePDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVePDF.setName(""); // NOI18N
        jBVePDF.setNextFocusableComponent(jBGenPDF);
        jBVePDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVePDFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVePDFMouseExited(evt);
            }
        });
        jBVePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVePDFActionPerformed(evt);
            }
        });
        jBVePDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVePDFKeyPressed(evt);
            }
        });
        jP1.add(jBVePDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, 140, 30));

        jBRecOr.setBackground(new java.awt.Color(255, 255, 255));
        jBRecOr.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBRecOr.setForeground(new java.awt.Color(0, 102, 0));
        jBRecOr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/record.png"))); // NOI18N
        jBRecOr.setText("Recibir orden");
        jBRecOr.setToolTipText("Recibir Orden de Compra");
        jBRecOr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBRecOr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBRecOrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBRecOrMouseExited(evt);
            }
        });
        jBRecOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRecOrActionPerformed(evt);
            }
        });
        jBRecOr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBRecOrKeyPressed(evt);
            }
        });
        jP1.add(jBRecOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 420, 140, 30));

        jPRadio.setBackground(new java.awt.Color(255, 255, 255));
        jPRadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPRadioKeyPressed(evt);
            }
        });
        jPRadio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRComp.setBackground(new java.awt.Color(255, 255, 255));
        jRComp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRComp.setText("Compras");
        jRComp.setNextFocusableComponent(jROrd);
        jRComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCompActionPerformed(evt);
            }
        });
        jRComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRCompKeyPressed(evt);
            }
        });
        jPRadio.add(jRComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 79, -1));

        jRTod.setBackground(new java.awt.Color(255, 255, 255));
        jRTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRTod.setSelected(true);
        jRTod.setText("Todo");
        jRTod.setNextFocusableComponent(jTableCompras);
        jRTod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTodActionPerformed(evt);
            }
        });
        jRTod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRTodKeyPressed(evt);
            }
        });
        jPRadio.add(jRTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 60, -1));

        jROrd.setBackground(new java.awt.Color(255, 255, 255));
        jROrd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jROrd.setText("Órdenes");
        jROrd.setNextFocusableComponent(jRTod);
        jROrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jROrdActionPerformed(evt);
            }
        });
        jROrd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jROrdKeyPressed(evt);
            }
        });
        jPRadio.add(jROrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 0, 79, -1));

        jP1.add(jPRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 250, 20));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 380, 20));

        jBGenPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBGenPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGenPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBGenPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jBGenPDF.setText("Generar");
        jBGenPDF.setToolTipText("Generar PDF de documento");
        jBGenPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBGenPDF.setName(""); // NOI18N
        jBGenPDF.setNextFocusableComponent(jBDirOr);
        jBGenPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGenPDFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGenPDFMouseExited(evt);
            }
        });
        jBGenPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenPDFActionPerformed(evt);
            }
        });
        jBGenPDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGenPDFKeyPressed(evt);
            }
        });
        jP1.add(jBGenPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 360, 140, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        boton_primera.setBackground(new java.awt.Color(255, 255, 255));
        boton_primera.setText("<<");
        boton_primera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_primeraActionPerformed(evt);
            }
        });

        boton_anterior.setBackground(new java.awt.Color(255, 255, 255));
        boton_anterior.setText("<");
        boton_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_anteriorActionPerformed(evt);
            }
        });

        boton_siguiente.setBackground(new java.awt.Color(255, 255, 255));
        boton_siguiente.setText(">");
        boton_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_siguienteActionPerformed(evt);
            }
        });

        label_pagina.setText("Página");

        boton_ultima.setBackground(new java.awt.Color(255, 255, 255));
        boton_ultima.setText(">>");
        boton_ultima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ultimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_primera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_siguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_ultima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_pagina)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_primera)
                    .addComponent(boton_anterior)
                    .addComponent(boton_siguiente)
                    .addComponent(label_pagina)
                    .addComponent(boton_ultima))
                .addContainerGap())
        );

        jP1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 350, 50));

        jButtonAbrir1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAbrir1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAbrir1.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAbrir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        jButtonAbrir1.setText("Abrir");
        jButtonAbrir1.setToolTipText("Abrir cotizaciòn(es) (Ctrl+A)");
        jButtonAbrir1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAbrir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAbrir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAbrir1MouseExited(evt);
            }
        });
        jButtonAbrir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrir1ActionPerformed(evt);
            }
        });
        jButtonAbrir1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAbrir1KeyPressed(evt);
            }
        });
        jP1.add(jButtonAbrir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 140, 30));

        jBNotC.setBackground(new java.awt.Color(255, 255, 255));
        jBNotC.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNotC.setForeground(new java.awt.Color(0, 102, 0));
        jBNotC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/notcred.png"))); // NOI18N
        jBNotC.setText("Not.crédito");
        jBNotC.setToolTipText("Nota de crédito de proveedor");
        jBNotC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNotC.setNextFocusableComponent(jBVe);
        jBNotC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNotCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNotCMouseExited(evt);
            }
        });
        jBNotC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNotCActionPerformed(evt);
            }
        });
        jBNotC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBNotCKeyPressed(evt);
            }
        });
        jP1.add(jBNotC, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
        
                
                    
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
        
        
    }//GEN-LAST:event_jBNewActionPerformed

        
    
    private void jBDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevActionPerformed
               
        
    }//GEN-LAST:event_jBDevActionPerformed
       
       
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
   
        
    }//GEN-LAST:event_formKeyPressed

        
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed

    
        
    }//GEN-LAST:event_jBNewKeyPressed

       
    private void jBDevKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDevKeyPressed

   
        
    }//GEN-LAST:event_jBDevKeyPressed

       
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
    
        
    }//GEN-LAST:event_jP1KeyPressed

        
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
    
        
    }//GEN-LAST:event_jBSalKeyPressed

        
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
    
        
    }//GEN-LAST:event_jBSalActionPerformed

    
        
    private void jBVeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVeKeyPressed
        
    
        
    }//GEN-LAST:event_jBVeKeyPressed

        
    private void jBVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVeActionPerformed

    
                                                                    
    }//GEN-LAST:event_jBVeActionPerformed

           
    private void jBCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCanActionPerformed
               
        
    }//GEN-LAST:event_jBCanActionPerformed

        
    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained
        
    
        
    }//GEN-LAST:event_jTBuscFocusGained

       
    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed
    
        
    }//GEN-LAST:event_jTBuscKeyPressed

    
    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed
        
    
        
    }//GEN-LAST:event_jBBuscKeyPressed

            
    private void jBMostTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMostTKeyPressed
        
        
        
    }//GEN-LAST:event_jBMostTKeyPressed
        
        
    
    private void jBMostTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostTActionPerformed
    
        
    }//GEN-LAST:event_jBMostTActionPerformed

        
    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed
                                                
    
        
    }//GEN-LAST:event_jBBuscActionPerformed

        
    private void jBDevParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevParActionPerformed
        
    
        
    }//GEN-LAST:event_jBDevParActionPerformed

        
    private void jBDevParKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDevParKeyPressed
        
    
        
    }//GEN-LAST:event_jBDevParKeyPressed

    
    private void jBVerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVerKeyPressed
        
    
        
    }//GEN-LAST:event_jBVerKeyPressed

        
    private void jBCargKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCargKeyPressed
        
    
        
    }//GEN-LAST:event_jBCargKeyPressed

        
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed
        
    
        
    }//GEN-LAST:event_jBDelKeyPressed

    
    private void jBCargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargActionPerformed
        
    
        
    }//GEN-LAST:event_jBCargActionPerformed

        
    private void jBVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerActionPerformed
            
        
    }//GEN-LAST:event_jBVerActionPerformed

        
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
                                                                   
        
    }//GEN-LAST:event_jBDelActionPerformed

        
    private void jBActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActuaActionPerformed

    

    }//GEN-LAST:event_jBActuaActionPerformed

        
    private void jBActuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActuaKeyPressed

    

    }//GEN-LAST:event_jBActuaKeyPressed

        
    private void jBImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImpActionPerformed

    

    }//GEN-LAST:event_jBImpActionPerformed

        
    private void jBImpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBImpKeyPressed

    

    }//GEN-LAST:event_jBImpKeyPressed
        
                
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
        
    }//GEN-LAST:event_formMouseWheelMoved

       
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

      
    private void jBTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab1ActionPerformed

    

    }//GEN-LAST:event_jBTab1ActionPerformed

        
    private void jBTab1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab1KeyPressed

    

    }//GEN-LAST:event_jBTab1KeyPressed

        
    private void jBTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab2ActionPerformed

    

    }//GEN-LAST:event_jBTab2ActionPerformed

        
    private void jBTab2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab2KeyPressed
    

    }//GEN-LAST:event_jBTab2KeyPressed
    
    
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited

               
        
    }//GEN-LAST:event_jBBuscMouseExited

    
   
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
        
   
        
    }//GEN-LAST:event_jBBuscMouseEntered

    
    
       
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed

        
    }//GEN-LAST:event_jBTodActionPerformed

        
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

    

    }//GEN-LAST:event_jBTodKeyPressed

    
        
    private void jTableComprasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableComprasKeyPressed

    

    }//GEN-LAST:event_jTableComprasKeyPressed

        
    private void jTableComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComprasMouseClicked

    

    }//GEN-LAST:event_jTableComprasMouseClicked
    
    private void tabla_partidasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_partidasKeyPressed



    }//GEN-LAST:event_tabla_partidasKeyPressed

        

    private void jBVePDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVePDFKeyPressed
        

        
    }//GEN-LAST:event_jBVePDFKeyPressed

    
    private void jBDirOrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDirOrKeyPressed
        
    
        
    }//GEN-LAST:event_jBDirOrKeyPressed

        
    private void jBDirOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDirOrActionPerformed
        
    
        
    }//GEN-LAST:event_jBDirOrActionPerformed

        
    private void jBVePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVePDFActionPerformed
        
    
        
    }//GEN-LAST:event_jBVePDFActionPerformed

        
    private void jBRecOrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBRecOrKeyPressed
        
    
        
    }//GEN-LAST:event_jBRecOrKeyPressed

    
    private void jBRecOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRecOrActionPerformed
        
    
                
    }//GEN-LAST:event_jBRecOrActionPerformed

        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    
        
    }//GEN-LAST:event_formWindowClosing

        
    private void jPRadioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPRadioKeyPressed
                
    
        
    }//GEN-LAST:event_jPRadioKeyPressed

        
    private void jRCompKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRCompKeyPressed
        
    
        
    }//GEN-LAST:event_jRCompKeyPressed

        
    private void jROrdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jROrdKeyPressed
        
    
        
    }//GEN-LAST:event_jROrdKeyPressed

        
    private void jRTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRTodKeyPressed
        
    
        
    }//GEN-LAST:event_jRTodKeyPressed

       
    private void jRCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCompActionPerformed
    
                
    }//GEN-LAST:event_jRCompActionPerformed

    
    private void jROrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jROrdActionPerformed
        
    }//GEN-LAST:event_jROrdActionPerformed

    
    
    private void jRTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTodActionPerformed
        
    
        
    }//GEN-LAST:event_jRTodActionPerformed

    
   
    private void jBMostTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseEntered
        
   
        
    }//GEN-LAST:event_jBMostTMouseEntered

    
   
    private void jBCanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCanMouseEntered
        
        
    }//GEN-LAST:event_jBCanMouseEntered

    
   
    private void jBDevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevMouseEntered
        
   
        
    }//GEN-LAST:event_jBDevMouseEntered

       
    private void jBDevParMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevParMouseEntered
        
    
        
    }//GEN-LAST:event_jBDevParMouseEntered

        
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
    
        
    }//GEN-LAST:event_jBNewMouseEntered

        
    private void jBVeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeMouseEntered
        
    
        
    }//GEN-LAST:event_jBVeMouseEntered

    
    
    
    private void jBVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerMouseEntered
        
    
        
    }//GEN-LAST:event_jBVerMouseEntered

        
    private void jBCargMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargMouseEntered
        
    
        
    }//GEN-LAST:event_jBCargMouseEntered

        
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
    
        
    }//GEN-LAST:event_jBDelMouseEntered

        
    private void jBActuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseEntered
        
    
        
    }//GEN-LAST:event_jBActuaMouseEntered

        
    private void jBImpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBImpMouseEntered
        
    
        
    }//GEN-LAST:event_jBImpMouseEntered

    
    
    
    
    
    private void jBVePDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVePDFMouseEntered
        
    
        
    }//GEN-LAST:event_jBVePDFMouseEntered

    
    
    private void jBDirOrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDirOrMouseEntered
        
    
        
    }//GEN-LAST:event_jBDirOrMouseEntered

    
    
    private void jBRecOrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRecOrMouseEntered
        
    
    }//GEN-LAST:event_jBRecOrMouseEntered

    
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
    }//GEN-LAST:event_jBSalMouseEntered

    

    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered
        

        
    }//GEN-LAST:event_jBTodMouseEntered

    

    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited
        

        
    }//GEN-LAST:event_jBTodMouseExited

    
    private void jBMostTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseExited
        
    
        
    }//GEN-LAST:event_jBMostTMouseExited

        
    private void jBCanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCanMouseExited
        
    
        
    }//GEN-LAST:event_jBCanMouseExited

    
   
    private void jBDevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevMouseExited
        
   
        
    }//GEN-LAST:event_jBDevMouseExited

       
    private void jBDevParMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevParMouseExited
        
    
        
    }//GEN-LAST:event_jBDevParMouseExited

    
   
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
   
        
    }//GEN-LAST:event_jBNewMouseExited

       
    private void jBVeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeMouseExited
        
    
        
    }//GEN-LAST:event_jBVeMouseExited

    
        
    private void jBVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerMouseExited
        
    
        
    }//GEN-LAST:event_jBVerMouseExited

    
   
    private void jBCargMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargMouseExited
        
   
        
    }//GEN-LAST:event_jBCargMouseExited

        
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
    
        
    }//GEN-LAST:event_jBDelMouseExited

        
    private void jBActuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseExited
        
    
        
    }//GEN-LAST:event_jBActuaMouseExited

        
    private void jBImpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBImpMouseExited
        
    
        
    }//GEN-LAST:event_jBImpMouseExited
       
        
    private void jBVePDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVePDFMouseExited
        
    
        
    }//GEN-LAST:event_jBVePDFMouseExited

    
    
    private void jBDirOrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDirOrMouseExited
        
    
        
    }//GEN-LAST:event_jBDirOrMouseExited

        
    private void jBRecOrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRecOrMouseExited
        
    
        
    }//GEN-LAST:event_jBRecOrMouseExited

    
   
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
        
    }//GEN-LAST:event_jBSalMouseExited

    
  
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost

  
        
    }//GEN-LAST:event_jTBuscFocusLost

    
  
    private void jBNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyReleased
        
  
        
    }//GEN-LAST:event_jBNewKeyReleased

      
    private void jBNotCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNotCMouseEntered

    

    }//GEN-LAST:event_jBNotCMouseEntered

        
    private void jBNotCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNotCMouseExited

    

    }//GEN-LAST:event_jBNotCMouseExited

        
    private void jBNotCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNotCActionPerformed

    

    }//GEN-LAST:event_jBNotCActionPerformed

        
    private void jBNotCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNotCKeyPressed

    

    }//GEN-LAST:event_jBNotCKeyPressed

    
       
    private void jBGenPDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGenPDFMouseEntered
        
    
        
    }//GEN-LAST:event_jBGenPDFMouseEntered

        
    private void jBGenPDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGenPDFMouseExited
        
    
        
    }//GEN-LAST:event_jBGenPDFMouseExited

    
  
    private void jBGenPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenPDFActionPerformed
        
  
        
    }//GEN-LAST:event_jBGenPDFActionPerformed

    
  
    private void jBGenPDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGenPDFKeyPressed
        
  
        
    }//GEN-LAST:event_jBGenPDFKeyPressed

    
  
    private void jBCanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCanKeyPressed
        
        
    }//GEN-LAST:event_jBCanKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void boton_ultimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ultimaActionPerformed
        
    }//GEN-LAST:event_boton_ultimaActionPerformed

    private void boton_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_siguienteActionPerformed
        
    }//GEN-LAST:event_boton_siguienteActionPerformed

    private void boton_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_anteriorActionPerformed
        
    }//GEN-LAST:event_boton_anteriorActionPerformed

    private void boton_primeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_primeraActionPerformed
        
    }//GEN-LAST:event_boton_primeraActionPerformed

    private void jButtonAbrir1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAbrir1KeyPressed

        
    }//GEN-LAST:event_jButtonAbrir1KeyPressed

    private void jButtonAbrir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrir1ActionPerformed

        
    }//GEN-LAST:event_jButtonAbrir1ActionPerformed

    private void jButtonAbrir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrir1MouseExited

        
    }//GEN-LAST:event_jButtonAbrir1MouseExited

    private void jButtonAbrir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrir1MouseEntered

        
    }//GEN-LAST:event_jButtonAbrir1MouseEntered
                        
            
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_anterior;
    private javax.swing.JButton boton_primera;
    private javax.swing.JButton boton_siguiente;
    private javax.swing.JButton boton_ultima;
    private javax.swing.JButton jBActua;
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBCan;
    private javax.swing.JButton jBCarg;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBDev;
    private javax.swing.JButton jBDevPar;
    private javax.swing.JButton jBDirOr;
    private javax.swing.JButton jBGenPDF;
    private javax.swing.JButton jBImp;
    private javax.swing.JButton jBMostT;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBNotC;
    private javax.swing.JButton jBRecOr;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTab2;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBVe;
    private javax.swing.JButton jBVePDF;
    private javax.swing.JButton jBVer;
    private javax.swing.JButton jButtonAbrir1;
    private javax.swing.JLabel jLNot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPRadio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRComp;
    private javax.swing.JRadioButton jROrd;
    private javax.swing.JRadioButton jRTod;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTableCompras;
    private javax.swing.JLabel label_pagina;
    private javax.swing.JTable tabla_partidas;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Empresas extends javax.swing.JFrame */
