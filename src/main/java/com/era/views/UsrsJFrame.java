package com.era.views;

public abstract class UsrsJFrame extends BaseJFrame {
    

    
    public UsrsJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jTEstac = new javax.swing.JTextField();
        jBNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new com.era.views.tables.UsersTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostT = new javax.swing.JButton();
        jBCargImg = new javax.swing.JButton();
        jBDelImg = new javax.swing.JButton();
        jTDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCHabDesc = new javax.swing.JCheckBox();
        jBVe = new javax.swing.JButton();
        jScrollImg = new javax.swing.JScrollPane();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTEstad = new javax.swing.JTextField();
        jTCall = new javax.swing.JTextField();
        jTCol = new javax.swing.JTextField();
        jTCP = new javax.swing.JTextField();
        jTTel = new javax.swing.JTextField();
        jTCel = new javax.swing.JTextField();
        jTPai = new javax.swing.JTextField();
        jBGuar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTNoInt = new javax.swing.JTextField();
        jTNoExt = new javax.swing.JTextField();
        jCAdmCaj = new javax.swing.JCheckBox();
        jBTab1 = new javax.swing.JButton();
        jCVend = new javax.swing.JCheckBox();
        jBLim = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTCiu = new javax.swing.JTextField();
        jTComi = new javax.swing.JTextField();
        jCPto = new javax.swing.JCheckBox();
        jTxtAlmacen = new javax.swing.JTextField();
        jBtnAlmacen = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JTContrasenia = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jTCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del5.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Usuario(s) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBSal);
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
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("*Contraseña:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 190, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jPanImg);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 120, 30));

        jTEstac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstac.setNextFocusableComponent(jTDesc);
        jTEstac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEstacFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEstacFocusLost(evt);
            }
        });
        jTEstac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEstacKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTEstacKeyTyped(evt);
            }
        });
        jP1.add(jTEstac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 20));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo Usuario (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jTab);
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
        });
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Ciudad:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Desc. en ventas y comisión");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Usuario", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 640, 280));

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
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 140, 20));

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
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 360, 20));

        jBMostT.setBackground(new java.awt.Color(255, 255, 255));
        jBMostT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMostT.setForeground(new java.awt.Color(0, 102, 0));
        jBMostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMostT.setText("Mostrar F4");
        jBMostT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMostT.setNextFocusableComponent(jBDel);
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
        jP1.add(jBMostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 140, 20));

        jBCargImg.setBackground(new java.awt.Color(255, 255, 255));
        jBCargImg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBCargImg.setText("Cargar");
        jBCargImg.setToolTipText("Cargar Imágen");
        jBCargImg.setNextFocusableComponent(jBDelImg);
        jBCargImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCargImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCargImgMouseExited(evt);
            }
        });
        jBCargImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargImgActionPerformed(evt);
            }
        });
        jBCargImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCargImgKeyPressed(evt);
            }
        });
        jP1.add(jBCargImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 70, -1));

        jBDelImg.setBackground(new java.awt.Color(255, 255, 255));
        jBDelImg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBDelImg.setText("Borrar");
        jBDelImg.setToolTipText("Borrar Imágen");
        jBDelImg.setNextFocusableComponent(jBVe);
        jBDelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDelImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDelImgMouseExited(evt);
            }
        });
        jBDelImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelImgActionPerformed(evt);
            }
        });
        jBDelImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDelImgKeyPressed(evt);
            }
        });
        jP1.add(jBDelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 60, -1));

        jTDesc.setText("0");
        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDesc.setNextFocusableComponent(jTComi);
        jTDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescFocusLost(evt);
            }
        });
        jTDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDescKeyTyped(evt);
            }
        });
        jP1.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("*Código usuario:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jCHabDesc.setBackground(new java.awt.Color(255, 255, 255));
        jCHabDesc.setSelected(true);
        jCHabDesc.setText("Hab. Descuento");
        jCHabDesc.setNextFocusableComponent(jCAdmCaj);
        jCHabDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCHabDescKeyPressed(evt);
            }
        });
        jP1.add(jCHabDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        jBVe.setBackground(new java.awt.Color(255, 255, 255));
        jBVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVe.setToolTipText("Ver Imágen Completa");
        jBVe.setNextFocusableComponent(jTEstac);
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
        jP1.add(jBVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 20, 20));

        jScrollImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollImgKeyPressed(evt);
            }
        });

        jPanImg.setNextFocusableComponent(jBCargImg);
        jPanImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanImgMouseExited(evt);
            }
        });
        jPanImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanImgKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addGap(0, 148, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jScrollImg.setViewportView(jPanImg);

        jP1.add(jScrollImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 150, 150));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Teléfono:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Nombre de usuario:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Colonia:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 190, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Celular:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 190, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("CP:");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 190, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("No. exterior:");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jTEstad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstad.setNextFocusableComponent(jTCP);
        jTEstad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEstadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEstadFocusLost(evt);
            }
        });
        jTEstad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEstadKeyPressed(evt);
            }
        });
        jP1.add(jTEstad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 190, 20));

        jTCall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCall.setNextFocusableComponent(jTNoExt);
        jTCall.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCallFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCallFocusLost(evt);
            }
        });
        jTCall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCallKeyPressed(evt);
            }
        });
        jP1.add(jTCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 190, 20));

        jTCol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCol.setNextFocusableComponent(jTTel);
        jTCol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTColFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTColFocusLost(evt);
            }
        });
        jTCol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTColKeyPressed(evt);
            }
        });
        jP1.add(jTCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, 20));

        jTCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCP.setNextFocusableComponent(jTNom);
        jTCP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCPFocusLost(evt);
            }
        });
        jTCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCPKeyPressed(evt);
            }
        });
        jP1.add(jTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 190, 20));

        jTTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTel.setNextFocusableComponent(jTCel);
        jTTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTelFocusLost(evt);
            }
        });
        jTTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTelKeyPressed(evt);
            }
        });
        jP1.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 190, 20));

        jTCel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCel.setNextFocusableComponent(jTPai);
        jTCel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCelFocusLost(evt);
            }
        });
        jTCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCelKeyPressed(evt);
            }
        });
        jP1.add(jTCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 190, 20));

        jTPai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPai.setNextFocusableComponent(jTCiu);
        jTPai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPaiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPaiFocusLost(evt);
            }
        });
        jTPai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPaiKeyPressed(evt);
            }
        });
        jP1.add(jTPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 20));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar Cambios (Ctrl+G)");
        jBGuar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBGuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGuarMouseExited(evt);
            }
        });
        jBGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuarActionPerformed(evt);
            }
        });
        jBGuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGuarKeyPressed(evt);
            }
        });
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 120, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Calle:");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 190, -1));

        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNom.setNextFocusableComponent(jCHabDesc);
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
        jP1.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 390, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("País:");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("No. interior:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, -1));

        jTNoInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoInt.setNextFocusableComponent(jTCol);
        jTNoInt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoIntFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoIntFocusLost(evt);
            }
        });
        jTNoInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoIntKeyPressed(evt);
            }
        });
        jP1.add(jTNoInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, 20));

        jTNoExt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExt.setNextFocusableComponent(jTNoInt);
        jTNoExt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoExtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoExtFocusLost(evt);
            }
        });
        jTNoExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoExtKeyPressed(evt);
            }
        });
        jP1.add(jTNoExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        jCAdmCaj.setBackground(new java.awt.Color(255, 255, 255));
        jCAdmCaj.setText("Administrador");
        jCAdmCaj.setNextFocusableComponent(jCVend);
        jCAdmCaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAdmCajActionPerformed(evt);
            }
        });
        jCAdmCaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCAdmCajKeyPressed(evt);
            }
        });
        jP1.add(jCAdmCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, -1));

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
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 10, 20));

        jCVend.setBackground(new java.awt.Color(255, 255, 255));
        jCVend.setText("Vendedor");
        jCVend.setNextFocusableComponent(jCPto);
        jCVend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCVendKeyPressed(evt);
            }
        });
        jP1.add(jCVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 100, -1));

        jBLim.setBackground(new java.awt.Color(255, 255, 255));
        jBLim.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBLim.setForeground(new java.awt.Color(0, 102, 0));
        jBLim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/limp.png"))); // NOI18N
        jBLim.setText("Limpiar");
        jBLim.setToolTipText("Limpiar todos los Campos (F6)");
        jBLim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBLim.setNextFocusableComponent(jBNew);
        jBLim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimMouseExited(evt);
            }
        });
        jBLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimActionPerformed(evt);
            }
        });
        jBLim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBLimKeyPressed(evt);
            }
        });
        jP1.add(jBLim, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 120, -1));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTab);
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
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 130, 18));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Almacen:");
        jP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, -1));

        jTCiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiu.setNextFocusableComponent(jTEstad);
        jTCiu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCiuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCiuFocusLost(evt);
            }
        });
        jTCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCiuKeyPressed(evt);
            }
        });
        jP1.add(jTCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, 20));

        jTComi.setText("0");
        jTComi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTComi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTComiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTComiFocusLost(evt);
            }
        });
        jTComi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTComiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTComiKeyTyped(evt);
            }
        });
        jP1.add(jTComi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 90, 20));

        jCPto.setBackground(new java.awt.Color(255, 255, 255));
        jCPto.setText("Punto de venta");
        jCPto.setToolTipText("Este usuario solo usa el punto de venta");
        jCPto.setNextFocusableComponent(jTab);
        jCPto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPtoActionPerformed(evt);
            }
        });
        jCPto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCPtoKeyPressed(evt);
            }
        });
        jP1.add(jCPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 130, -1));
        jP1.add(jTxtAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 120, -1));

        jBtnAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        jBtnAlmacen.setText("...");
        jBtnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlmacenActionPerformed(evt);
            }
        });
        jP1.add(jBtnAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Estado:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 190, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Series");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jP1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));
        jP1.add(JTContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 190, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Correo:");
        jP1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 132, 190, -1));

        jTCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCorreo.setNextFocusableComponent(jTNom);
        jTCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCorreoFocusLost(evt);
            }
        });
        jTCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCorreoKeyPressed(evt);
            }
        });
        jP1.add(jTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 190, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
    
      
    }//GEN-LAST:event_jBDelActionPerformed

    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    
    }//GEN-LAST:event_formKeyPressed
    
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed


    }//GEN-LAST:event_jBDelKeyPressed


    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed


    }//GEN-LAST:event_jP1KeyPressed


    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed


    }//GEN-LAST:event_jBSalActionPerformed


    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed


    }//GEN-LAST:event_jBSalKeyPressed


    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed


    }//GEN-LAST:event_jBNewKeyPressed


    private void jTEstacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstacKeyPressed


    }//GEN-LAST:event_jTEstacKeyPressed


    private void jTEstacFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstacFocusGained


    }//GEN-LAST:event_jTEstacFocusGained

    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed


    }//GEN-LAST:event_jTabKeyPressed

    private void jTEstacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstacFocusLost



    }//GEN-LAST:event_jTEstacFocusLost

        
    
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
    

    }//GEN-LAST:event_jBNewActionPerformed


    private void jTEstacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstacKeyTyped



    }//GEN-LAST:event_jTEstacKeyTyped


    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed


    }//GEN-LAST:event_jBBuscKeyPressed


    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained


    }//GEN-LAST:event_jTBuscFocusGained


    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed



    }//GEN-LAST:event_jTBuscKeyPressed


    private void jBMostTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMostTKeyPressed


    }//GEN-LAST:event_jBMostTKeyPressed


    private void jBMostTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostTActionPerformed



    }//GEN-LAST:event_jBMostTActionPerformed


    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed

        

    }//GEN-LAST:event_jBBuscActionPerformed


    private void jPanImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanImgKeyPressed


    }//GEN-LAST:event_jPanImgKeyPressed


    private void jBCargImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargImgActionPerformed


    }//GEN-LAST:event_jBCargImgActionPerformed


    private void jBCargImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCargImgKeyPressed


    }//GEN-LAST:event_jBCargImgKeyPressed


    private void jBDelImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelImgActionPerformed


    }//GEN-LAST:event_jBDelImgActionPerformed

    
    private void jBDelImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelImgKeyPressed


    }//GEN-LAST:event_jBDelImgKeyPressed


    private void jTDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescKeyTyped


    }//GEN-LAST:event_jTDescKeyTyped

    
    private void jTDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescFocusGained

    

    }//GEN-LAST:event_jTDescFocusGained

    
    private void jTDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescKeyPressed

    

    }//GEN-LAST:event_jTDescKeyPressed

    
    private void jTDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescFocusLost

        

    }//GEN-LAST:event_jTDescFocusLost

    
    private void jCHabDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCHabDescKeyPressed
    

    }//GEN-LAST:event_jCHabDescKeyPressed


    private void jBVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVeActionPerformed



    }//GEN-LAST:event_jBVeActionPerformed


    private void jBVeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVeKeyPressed


    }//GEN-LAST:event_jBVeKeyPressed


    private void jScrollImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollImgKeyPressed


    }//GEN-LAST:event_jScrollImgKeyPressed


    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved


    }//GEN-LAST:event_formMouseWheelMoved


    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged


    }//GEN-LAST:event_formMouseDragged


    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved


    }//GEN-LAST:event_formMouseMoved


    private void jTCallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCallKeyPressed


    }//GEN-LAST:event_jTCallKeyPressed

    
    private void jTColKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTColKeyPressed

    
    }//GEN-LAST:event_jTColKeyPressed

    
    private void jTCPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCPKeyPressed

    
    }//GEN-LAST:event_jTCPKeyPressed

    
    private void jTTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelKeyPressed

    
    }//GEN-LAST:event_jTTelKeyPressed

    
    private void jTCelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCelKeyPressed

    
    }//GEN-LAST:event_jTCelKeyPressed

    
    private void jTPaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPaiKeyPressed

    
    }//GEN-LAST:event_jTPaiKeyPressed

    
    private void jTEstadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstadKeyPressed

    
    }//GEN-LAST:event_jTEstadKeyPressed

    
    private void jTCallFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCallFocusGained

    
    }//GEN-LAST:event_jTCallFocusGained

    
    private void jTColFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTColFocusGained

    
    }//GEN-LAST:event_jTColFocusGained

    
    private void jTCPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCPFocusGained

    
    }//GEN-LAST:event_jTCPFocusGained

    
    private void jTTelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelFocusGained

    
    }//GEN-LAST:event_jTTelFocusGained

    
    private void jTCelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCelFocusGained

    

    }//GEN-LAST:event_jTCelFocusGained

    
    private void jTPaiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPaiFocusGained

    
    }//GEN-LAST:event_jTPaiFocusGained

    
    private void jTEstadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFocusGained

    
    }//GEN-LAST:event_jTEstadFocusGained

   
    private void jTNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusGained

   
    }//GEN-LAST:event_jTNomFocusGained

   
    private void jTNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyPressed

   
    }//GEN-LAST:event_jTNomKeyPressed

   
    private void jTNoExtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoExtKeyPressed

   
    }//GEN-LAST:event_jTNoExtKeyPressed

   
    private void jTNoIntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoIntKeyPressed

   
    }//GEN-LAST:event_jTNoIntKeyPressed

   
    private void jTNoExtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoExtFocusGained

   
    }//GEN-LAST:event_jTNoExtFocusGained

   
    private void jTNoIntFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoIntFocusGained

   
    }//GEN-LAST:event_jTNoIntFocusGained

   
    private void jBGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuarActionPerformed

   
    }//GEN-LAST:event_jBGuarActionPerformed

   
    private void jCAdmCajKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCAdmCajKeyPressed

   
    }//GEN-LAST:event_jCAdmCajKeyPressed

   
   
   
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited

   

    }//GEN-LAST:event_jBBuscMouseExited

    
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered

    

    }//GEN-LAST:event_jBBuscMouseEntered

    
    private void jCVendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCVendKeyPressed

    
    }//GEN-LAST:event_jCVendKeyPressed

    
    private void jBLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimActionPerformed

    

    }//GEN-LAST:event_jBLimActionPerformed

    
    private void jBLimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBLimKeyPressed

    
    }//GEN-LAST:event_jBLimKeyPressed

    
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed

        

    }//GEN-LAST:event_jBTodActionPerformed

    
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

    

    }//GEN-LAST:event_jBTodKeyPressed

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    
    }//GEN-LAST:event_formWindowClosing

    
    private void jPanImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanImgMouseEntered
        

    }//GEN-LAST:event_jPanImgMouseEntered


    private void jPanImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanImgMouseExited



    }//GEN-LAST:event_jPanImgMouseExited


    private void jTCiuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCiuFocusGained



    }//GEN-LAST:event_jTCiuFocusGained


    private void jTCiuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCiuKeyPressed


    }//GEN-LAST:event_jTCiuKeyPressed


    private void jBLimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimMouseEntered



    }//GEN-LAST:event_jBLimMouseEntered


    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered


    }//GEN-LAST:event_jBTodMouseEntered


    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered


    }//GEN-LAST:event_jBNewMouseEntered


    private void jBGuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseEntered


    }//GEN-LAST:event_jBGuarMouseEntered


    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered


    }//GEN-LAST:event_jBDelMouseEntered


    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered


    }//GEN-LAST:event_jBSalMouseEntered

    private void jBMostTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseEntered


    }//GEN-LAST:event_jBMostTMouseEntered


    private void jBCargImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargImgMouseEntered


    }//GEN-LAST:event_jBCargImgMouseEntered


    private void jBDelImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelImgMouseEntered


    }//GEN-LAST:event_jBDelImgMouseEntered


    private void jBVeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeMouseEntered


    }//GEN-LAST:event_jBVeMouseEntered


    private void jBLimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimMouseExited


    }//GEN-LAST:event_jBLimMouseExited


    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited


    }//GEN-LAST:event_jBTodMouseExited


    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited


    }//GEN-LAST:event_jBNewMouseExited


    private void jBGuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseExited


    }//GEN-LAST:event_jBGuarMouseExited


    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited


    }//GEN-LAST:event_jBDelMouseExited


    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited


    }//GEN-LAST:event_jBSalMouseExited


    private void jBMostTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseExited


    }//GEN-LAST:event_jBMostTMouseExited


    private void jBCargImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargImgMouseExited


    }//GEN-LAST:event_jBCargImgMouseExited


    private void jBDelImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelImgMouseExited


    }//GEN-LAST:event_jBDelImgMouseExited


    private void jBVeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeMouseExited


    }//GEN-LAST:event_jBVeMouseExited

    
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost

        

    }//GEN-LAST:event_jTBuscFocusLost


    private void jTColFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTColFocusLost



    }//GEN-LAST:event_jTColFocusLost


    private void jTPaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPaiFocusLost


    }//GEN-LAST:event_jTPaiFocusLost


    private void jTNoIntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoIntFocusLost


    }//GEN-LAST:event_jTNoIntFocusLost


    private void jTCPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCPFocusLost


    }//GEN-LAST:event_jTCPFocusLost


    private void jTCiuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCiuFocusLost


    }//GEN-LAST:event_jTCiuFocusLost


    private void jTNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusLost


    }//GEN-LAST:event_jTNomFocusLost


    private void jTTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelFocusLost


    }//GEN-LAST:event_jTTelFocusLost


    private void jTEstadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFocusLost


    }//GEN-LAST:event_jTEstadFocusLost


    private void jTCallFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCallFocusLost


    }//GEN-LAST:event_jTCallFocusLost


    private void jTCelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCelFocusLost


    }//GEN-LAST:event_jTCelFocusLost


    private void jTNoExtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoExtFocusLost


    }//GEN-LAST:event_jTNoExtFocusLost

    
    private void jBGuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuarKeyPressed

    
    }//GEN-LAST:event_jBGuarKeyPressed

    
    private void jTComiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTComiFocusGained

    
    }//GEN-LAST:event_jTComiFocusGained

    
    private void jTComiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTComiFocusLost

    

    }//GEN-LAST:event_jTComiFocusLost

    
    private void jTComiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTComiKeyPressed

    
    }//GEN-LAST:event_jTComiKeyPressed

   
    private void jTComiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTComiKeyTyped

   

    }//GEN-LAST:event_jTComiKeyTyped

    
    private void jCPtoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPtoKeyPressed

    
    }//GEN-LAST:event_jCPtoKeyPressed

    
    private void jCPtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPtoActionPerformed

    

    }//GEN-LAST:event_jCPtoActionPerformed
    
    private void jCAdmCajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAdmCajActionPerformed

    
    }//GEN-LAST:event_jCAdmCajActionPerformed

    private void jBtnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlmacenActionPerformed
    
    }//GEN-LAST:event_jBtnAlmacenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCorreoFocusGained
        
    }//GEN-LAST:event_jTCorreoFocusGained

    private void jTCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCorreoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCorreoFocusLost

    private void jTCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCorreoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCorreoKeyPressed

    private void jBTab1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab1KeyPressed

    }//GEN-LAST:event_jBTab1KeyPressed

    private void jBTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab1ActionPerformed

    }//GEN-LAST:event_jBTab1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JPasswordField JTContrasenia;
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBCargImg;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBDelImg;
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBLim;
    protected javax.swing.JButton jBMostT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBTab1;
    protected javax.swing.JButton jBTod;
    protected javax.swing.JButton jBVe;
    protected javax.swing.JButton jBtnAlmacen;
    protected javax.swing.JButton jButton1;
    protected javax.swing.JCheckBox jCAdmCaj;
    protected javax.swing.JCheckBox jCHabDesc;
    protected javax.swing.JCheckBox jCPto;
    protected javax.swing.JCheckBox jCVend;
    protected javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanImg;
    protected javax.swing.JScrollPane jScrollImg;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTCP;
    protected javax.swing.JTextField jTCall;
    protected javax.swing.JTextField jTCel;
    protected javax.swing.JTextField jTCiu;
    protected javax.swing.JTextField jTCol;
    protected javax.swing.JTextField jTComi;
    protected javax.swing.JTextField jTCorreo;
    protected javax.swing.JTextField jTDesc;
    protected javax.swing.JTextField jTEstac;
    protected javax.swing.JTextField jTEstad;
    protected javax.swing.JTextField jTNoExt;
    protected javax.swing.JTextField jTNoInt;
    protected javax.swing.JTextField jTNom;
    protected javax.swing.JTextField jTPai;
    protected javax.swing.JTextField jTTel;
    protected com.era.views.tables.UsersTable jTab;
    protected javax.swing.JTextField jTxtAlmacen;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
