package com.era.views;

public abstract class PrincipJFrame extends BaseJFrame {    
    
    public PrincipJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();                
        
        jMenMaxsMins.setVisible(false);
                                                                
        jMenItTipsPags.setVisible(false);        
        
        this.maximizedWindow();
    }
                                
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jP1 = new javax.swing.JPanel();
        jBPtoVta = new javax.swing.JButton();
        jBVtas = new javax.swing.JButton();
        jBComps = new javax.swing.JButton();
        jBEmps = new javax.swing.JButton();
        jBProvs = new javax.swing.JButton();
        jBProds = new javax.swing.JButton();
        jBCots = new javax.swing.JButton();
        jBPrevComp = new javax.swing.JButton();
        jBPtoVta2 = new javax.swing.JButton();
        jButtonPedidos = new javax.swing.JButton();
        jButtonPedidos1 = new javax.swing.JButton();
        jBReporteCaja = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenBar1 = new javax.swing.JMenuBar();
        jMMSis = new javax.swing.JMenu();
        jMenLogin = new javax.swing.JMenu();
        jMenItLogear = new javax.swing.JMenuItem();
        jMenItDeslog = new javax.swing.JMenuItem();
        jMenItCamEmp = new javax.swing.JMenuItem();
        jMMUsr = new javax.swing.JMenu();
        jMenItEstacs = new javax.swing.JMenuItem();
        jMenItPermEstacs = new javax.swing.JMenuItem();
        jMenLogs = new javax.swing.JMenu();
        jMenItLogCorr = new javax.swing.JMenuItem();
        jMLogSis = new javax.swing.JMenu();
        jMVLogSys = new javax.swing.JMenuItem();
        jMDelLog = new javax.swing.JMenuItem();
        jMLogProd = new javax.swing.JMenuItem();
        jMenBDs = new javax.swing.JMenu();
        jMenConfigFil = new javax.swing.JMenuItem();
        jMMRep = new javax.swing.JMenu();
        jMEstacs = new javax.swing.JMenuItem();
        jMResp = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenItSal = new javax.swing.JMenuItem();
        jMenInvents = new javax.swing.JMenu();
        jMenComps = new javax.swing.JMenu();
        jMenItManProvs = new javax.swing.JMenuItem();
        jMenItComps = new javax.swing.JMenuItem();
        jMCXP = new javax.swing.JMenuItem();
        jMImpProvs = new javax.swing.JMenuItem();
        jMPrevioComp = new javax.swing.JMenuItem();
        jMMRepCom = new javax.swing.JMenu();
        jMRepProv = new javax.swing.JMenuItem();
        jMRepCom = new javax.swing.JMenuItem();
        jMenCXP = new javax.swing.JMenuItem();
        jMRepOr = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMInven = new javax.swing.JMenu();
        jMVProd = new javax.swing.JMenuItem();
        jMenItKits = new javax.swing.JMenuItem();
        jMLotPed = new javax.swing.JMenuItem();
        jMenItConceps = new javax.swing.JMenuItem();
        jMMInvenImpor = new javax.swing.JMenu();
        jMInvenImpo = new javax.swing.JMenuItem();
        jMImpExistAlm = new javax.swing.JMenuItem();
        jMImpAlma = new javax.swing.JMenuItem();
        jMMClas = new javax.swing.JMenu();
        jMenIt1 = new javax.swing.JMenuItem();
        jMTip = new javax.swing.JMenuItem();
        jMenItMarcs = new javax.swing.JMenuItem();
        jMenItFabs = new javax.swing.JMenuItem();
        jMenItCols = new javax.swing.JMenuItem();
        jMenItPesos = new javax.swing.JMenuItem();
        jMenItMeds = new javax.swing.JMenuItem();
        jMenItUnids = new javax.swing.JMenuItem();
        jMModel = new javax.swing.JMenuItem();
        jMenMaxsMins = new javax.swing.JMenu();
        jMenItProdsBajMin = new javax.swing.JMenuItem();
        jMenItProdsArrMax = new javax.swing.JMenuItem();
        jMenItDefEstacs = new javax.swing.JMenuItem();
        jMenTraspas = new javax.swing.JMenu();
        jMenItTraspas = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenItIngr = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMMUbic = new javax.swing.JMenu();
        jMenItAlmas = new javax.swing.JMenuItem();
        jMenIt5 = new javax.swing.JMenuItem();
        jMenItLugs = new javax.swing.JMenuItem();
        jMUbiAd = new javax.swing.JMenuItem();
        jMMRepProd = new javax.swing.JMenu();
        jMenProds = new javax.swing.JMenuItem();
        jMKard = new javax.swing.JMenuItem();
        jMenVtas = new javax.swing.JMenu();
        jMMClien = new javax.swing.JMenuItem();
        jMenItVtas = new javax.swing.JMenuItem();
        jMenuItemRemisiones = new javax.swing.JMenuItem();
        jMenCotsT = new javax.swing.JMenuItem();
        jMenuItemPedidos = new javax.swing.JMenuItem();
        jMenItTipsPags = new javax.swing.JMenuItem();
        jMConcepPags = new javax.swing.JMenuItem();
        jMCXC = new javax.swing.JMenuItem();
        jMenItTouch = new javax.swing.JMenuItem();
        jMImpCliens = new javax.swing.JMenuItem();
        jMMRepVta = new javax.swing.JMenu();
        jMRepCli = new javax.swing.JMenuItem();
        jMenVtasR = new javax.swing.JMenuItem();
        jMenCXCR = new javax.swing.JMenuItem();
        jMRepCot = new javax.swing.JMenuItem();
        jMRepVend = new javax.swing.JMenuItem();
        jMFluj = new javax.swing.JMenuItem();
        jMActivos = new javax.swing.JMenu();
        jMZon = new javax.swing.JMenuItem();
        jMSucursal = new javax.swing.JMenuItem();
        jMClasificacion = new javax.swing.JMenuItem();
        jMResponsable = new javax.swing.JMenuItem();
        jMActivo = new javax.swing.JMenuItem();
        jMConcepNot = new javax.swing.JMenuItem();
        jMenItMons = new javax.swing.JMenuItem();
        jMeItImps = new javax.swing.JMenuItem();
        jMICuentaContable = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMSist = new javax.swing.JMenu();
        jMenIt4 = new javax.swing.JMenuItem();
        jMenItDatsGenEmp = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenItImpres = new javax.swing.JMenuItem();
        jMConfAd = new javax.swing.JMenuItem();
        jMMAyu = new javax.swing.JMenu();
        jMAcerc = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
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
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLImg.setBackground(new java.awt.Color(255, 255, 255));
        jLImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLImgKeyPressed(evt);
            }
        });
        jPanel1.add(jLImg, java.awt.BorderLayout.CENTER);

        jP1.setBackground(new java.awt.Color(204, 255, 204));
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });

        jBPtoVta.setBackground(new java.awt.Color(255, 255, 255));
        jBPtoVta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPtoVta.setForeground(new java.awt.Color(0, 102, 0));
        jBPtoVta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pos.png"))); // NOI18N
        jBPtoVta.setText("POS");
        jBPtoVta.setToolTipText("Punto de venta (U)");
        jBPtoVta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPtoVtaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPtoVtaMouseExited(evt);
            }
        });
        jBPtoVta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPtoVtaActionPerformed(evt);
            }
        });
        jBPtoVta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBPtoVtaKeyPressed(evt);
            }
        });

        jBVtas.setBackground(new java.awt.Color(255, 255, 255));
        jBVtas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBVtas.setForeground(new java.awt.Color(0, 102, 0));
        jBVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vtas2.png"))); // NOI18N
        jBVtas.setText("Ventas");
        jBVtas.setToolTipText("Módulo de ventas (V)");
        jBVtas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVtasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVtasMouseExited(evt);
            }
        });
        jBVtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVtasActionPerformed(evt);
            }
        });
        jBVtas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVtasKeyPressed(evt);
            }
        });

        jBComps.setBackground(new java.awt.Color(255, 255, 255));
        jBComps.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBComps.setForeground(new java.awt.Color(0, 102, 0));
        jBComps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comprs2.png"))); // NOI18N
        jBComps.setText("Compras");
        jBComps.setToolTipText("Módulo de compras y órdenes (O)");
        jBComps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCompsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCompsMouseExited(evt);
            }
        });
        jBComps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCompsActionPerformed(evt);
            }
        });
        jBComps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCompsKeyPressed(evt);
            }
        });

        jBEmps.setBackground(new java.awt.Color(255, 255, 255));
        jBEmps.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBEmps.setForeground(new java.awt.Color(0, 102, 0));
        jBEmps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/manemp.png"))); // NOI18N
        jBEmps.setText("Clientes");
        jBEmps.setToolTipText("Módulo de clientes (E)");
        jBEmps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEmpsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEmpsMouseExited(evt);
            }
        });
        jBEmps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpsActionPerformed(evt);
            }
        });
        jBEmps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBEmpsKeyPressed(evt);
            }
        });

        jBProvs.setBackground(new java.awt.Color(255, 255, 255));
        jBProvs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProvs.setForeground(new java.awt.Color(0, 102, 0));
        jBProvs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/provs.png"))); // NOI18N
        jBProvs.setText("Proveedores");
        jBProvs.setToolTipText("Módulo de proveedores (P)");
        jBProvs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProvsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProvsMouseExited(evt);
            }
        });
        jBProvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProvsActionPerformed(evt);
            }
        });
        jBProvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBProvsKeyPressed(evt);
            }
        });

        jBProds.setBackground(new java.awt.Color(255, 255, 255));
        jBProds.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProds.setForeground(new java.awt.Color(0, 102, 0));
        jBProds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prods.png"))); // NOI18N
        jBProds.setText("Producto");
        jBProds.setToolTipText("Módulo de productos (R)");
        jBProds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProdsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProdsMouseExited(evt);
            }
        });
        jBProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProdsActionPerformed(evt);
            }
        });
        jBProds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBProdsKeyPressed(evt);
            }
        });

        jBCots.setBackground(new java.awt.Color(255, 255, 255));
        jBCots.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBCots.setForeground(new java.awt.Color(0, 102, 0));
        jBCots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cots.png"))); // NOI18N
        jBCots.setText("Cotizaciones");
        jBCots.setToolTipText("Módulo de cotizaciones (C)");
        jBCots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCotsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCotsMouseExited(evt);
            }
        });
        jBCots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCotsActionPerformed(evt);
            }
        });
        jBCots.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCotsKeyPressed(evt);
            }
        });

        jBPrevComp.setBackground(new java.awt.Color(255, 255, 255));
        jBPrevComp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPrevComp.setForeground(new java.awt.Color(0, 102, 0));
        jBPrevComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Prevcom.png"))); // NOI18N
        jBPrevComp.setText("Previo de compra");
        jBPrevComp.setToolTipText("Módulo de previo de compra (B)");
        jBPrevComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPrevCompMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPrevCompMouseExited(evt);
            }
        });
        jBPrevComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrevCompActionPerformed(evt);
            }
        });
        jBPrevComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBPrevCompKeyPressed(evt);
            }
        });

        jBPtoVta2.setBackground(new java.awt.Color(255, 255, 255));
        jBPtoVta2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPtoVta2.setForeground(new java.awt.Color(0, 102, 0));
        jBPtoVta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ci.png"))); // NOI18N
        jBPtoVta2.setToolTipText("Interfaz");
        jBPtoVta2.setLabel("Join Data");
        jBPtoVta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPtoVta2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPtoVta2MouseExited(evt);
            }
        });
        jBPtoVta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPtoVta2ActionPerformed(evt);
            }
        });
        jBPtoVta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBPtoVta2KeyPressed(evt);
            }
        });

        jButtonPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPedidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPedidos.setForeground(new java.awt.Color(0, 102, 0));
        jButtonPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comprs2.png"))); // NOI18N
        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.setToolTipText("Módulo de compras y órdenes (O)");
        jButtonPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPedidosMouseExited(evt);
            }
        });
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });
        jButtonPedidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonPedidosKeyPressed(evt);
            }
        });

        jButtonPedidos1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPedidos1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPedidos1.setForeground(new java.awt.Color(0, 102, 0));
        jButtonPedidos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abon.png"))); // NOI18N
        jButtonPedidos1.setText("Pagos");
        jButtonPedidos1.setToolTipText("Módulo de compras y órdenes (O)");
        jButtonPedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidos1ActionPerformed(evt);
            }
        });

        jBReporteCaja.setBackground(new java.awt.Color(255, 255, 255));
        jBReporteCaja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBReporteCaja.setForeground(new java.awt.Color(0, 102, 0));
        jBReporteCaja.setText("Reporte Caja");
        jBReporteCaja.setEnabled(false);
        jBReporteCaja.setMaximumSize(new java.awt.Dimension(109, 37));
        jBReporteCaja.setMinimumSize(new java.awt.Dimension(109, 37));
        jBReporteCaja.setPreferredSize(new java.awt.Dimension(109, 37));
        jBReporteCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReporteCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addComponent(jBPrevComp)
                        .addGap(5, 5, 5)
                        .addComponent(jBPtoVta2)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonPedidos)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonPedidos1)
                        .addGap(5, 5, 5)
                        .addComponent(jBReporteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addComponent(jBPtoVta)
                        .addGap(5, 5, 5)
                        .addComponent(jBVtas)
                        .addGap(5, 5, 5)
                        .addComponent(jBComps)
                        .addGap(5, 5, 5)
                        .addComponent(jBEmps)
                        .addGap(5, 5, 5)
                        .addComponent(jBProvs)
                        .addGap(5, 5, 5)
                        .addComponent(jBProds)
                        .addGap(5, 5, 5)
                        .addComponent(jBCots)))
                .addGap(211, 211, 211))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jBPtoVta))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jBVtas))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jBComps))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jBEmps))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jBProvs))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jBProds))
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jBCots)))
                .addGap(3, 3, 3)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPedidos1)
                    .addComponent(jBReporteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBPrevComp)
                            .addComponent(jBPtoVta2)
                            .addComponent(jButtonPedidos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jP1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        jMenBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenBar1KeyPressed(evt);
            }
        });

        jMMSis.setMnemonic('s');
        jMMSis.setText("Sistema");
        jMMSis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMSisKeyPressed(evt);
            }
        });

        jMenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logi.png"))); // NOI18N
        jMenLogin.setMnemonic('l');
        jMenLogin.setText("Sesión");
        jMenLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenLoginKeyPressed(evt);
            }
        });

        jMenItLogear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenItLogear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/login.png"))); // NOI18N
        jMenItLogear.setText("Cambiar sesión");
        jMenItLogear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItLogearActionPerformed(evt);
            }
        });
        jMenItLogear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItLogearKeyPressed(evt);
            }
        });
        jMenLogin.add(jMenItLogear);

        jMenItDeslog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenItDeslog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Logout.png"))); // NOI18N
        jMenItDeslog.setMnemonic('d');
        jMenItDeslog.setText("Suspender");
        jMenItDeslog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItDeslogActionPerformed(evt);
            }
        });
        jMenItDeslog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItDeslogKeyPressed(evt);
            }
        });
        jMenLogin.add(jMenItDeslog);

        jMenItCamEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cambemp.png"))); // NOI18N
        jMenItCamEmp.setMnemonic('c');
        jMenItCamEmp.setText("Cambiar de empresa");
        jMenItCamEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItCamEmpActionPerformed(evt);
            }
        });
        jMenItCamEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItCamEmpKeyPressed(evt);
            }
        });
        jMenLogin.add(jMenItCamEmp);

        jMMSis.add(jMenLogin);

        jMMUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/estacs.png"))); // NOI18N
        jMMUsr.setMnemonic('u');
        jMMUsr.setText("Usuarios");
        jMMUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMUsrKeyPressed(evt);
            }
        });

        jMenItEstacs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/defusr.png"))); // NOI18N
        jMenItEstacs.setMnemonic('e');
        jMenItEstacs.setText("Definir usuarios");
        jMenItEstacs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItEstacsActionPerformed(evt);
            }
        });
        jMenItEstacs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItEstacsKeyPressed(evt);
            }
        });
        jMMUsr.add(jMenItEstacs);

        jMenItPermEstacs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/permusr.png"))); // NOI18N
        jMenItPermEstacs.setMnemonic('p');
        jMenItPermEstacs.setText("Permisos usuarios");
        jMenItPermEstacs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItPermEstacsActionPerformed(evt);
            }
        });
        jMMUsr.add(jMenItPermEstacs);

        jMMSis.add(jMMUsr);

        jMenLogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log.png"))); // NOI18N
        jMenLogs.setMnemonic('g');
        jMenLogs.setText("Logs");
        jMenLogs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenLogsKeyPressed(evt);
            }
        });

        jMenItLogCorr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logcorr.png"))); // NOI18N
        jMenItLogCorr.setMnemonic('l');
        jMenItLogCorr.setText("Log correos");
        jMenItLogCorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItLogCorrActionPerformed(evt);
            }
        });
        jMenItLogCorr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItLogCorrKeyPressed(evt);
            }
        });
        jMenLogs.add(jMenItLogCorr);

        jMLogSis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logsist.png"))); // NOI18N
        jMLogSis.setMnemonic('g');
        jMLogSis.setText("Log sistema");
        jMLogSis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogSisKeyPressed(evt);
            }
        });

        jMVLogSys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logsist.png"))); // NOI18N
        jMVLogSys.setMnemonic('v');
        jMVLogSys.setText("Ver log sistema");
        jMVLogSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVLogSysActionPerformed(evt);
            }
        });
        jMVLogSys.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMVLogSysKeyPressed(evt);
            }
        });
        jMLogSis.add(jMVLogSys);

        jMDelLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dellogsis.png"))); // NOI18N
        jMDelLog.setMnemonic('b');
        jMDelLog.setText("Borrar log");
        jMDelLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDelLogActionPerformed(evt);
            }
        });
        jMDelLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMDelLogKeyPressed(evt);
            }
        });
        jMLogSis.add(jMDelLog);

        jMenLogs.add(jMLogSis);

        jMLogProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogProd.setMnemonic('l');
        jMLogProd.setText("Log productos");
        jMLogProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogProdActionPerformed(evt);
            }
        });
        jMLogProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogProdKeyPressed(evt);
            }
        });
        jMenLogs.add(jMLogProd);

        jMMSis.add(jMenLogs);

        jMenBDs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/basdats.png"))); // NOI18N
        jMenBDs.setMnemonic('b');
        jMenBDs.setText("Base de datos");
        jMenBDs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenBDsKeyPressed(evt);
            }
        });

        jMenConfigFil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/archconfg.png"))); // NOI18N
        jMenConfigFil.setMnemonic('a');
        jMenConfigFil.setText("Archivo de configuración");
        jMenConfigFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenConfigFilActionPerformed(evt);
            }
        });
        jMenConfigFil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenConfigFilKeyPressed(evt);
            }
        });
        jMenBDs.add(jMenConfigFil);

        jMMSis.add(jMenBDs);

        jMMRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repgen.png"))); // NOI18N
        jMMRep.setText("Reportes");
        jMMRep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMRepKeyPressed(evt);
            }
        });

        jMEstacs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rptusr.png"))); // NOI18N
        jMEstacs.setMnemonic('t');
        jMEstacs.setText("Usuarios");
        jMEstacs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEstacsActionPerformed(evt);
            }
        });
        jMEstacs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMEstacsKeyPressed(evt);
            }
        });
        jMMRep.add(jMEstacs);

        jMResp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/represp.png"))); // NOI18N
        jMResp.setMnemonic('d');
        jMResp.setText("Respaldos");
        jMResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRespActionPerformed(evt);
            }
        });
        jMResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRespKeyPressed(evt);
            }
        });
        jMMRep.add(jMResp);

        jMMSis.add(jMMRep);

        jMenuItem6.setText("Cerrar Sesión");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMMSis.add(jMenuItem6);

        jMenItSal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenItSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jMenItSal.setText("Salir");
        jMenItSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItSalActionPerformed(evt);
            }
        });
        jMenItSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItSalKeyPressed(evt);
            }
        });
        jMMSis.add(jMenItSal);

        jMenBar1.add(jMMSis);

        jMenInvents.setMnemonic('M');
        jMenInvents.setText("Módulos");
        jMenInvents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenInventsKeyPressed(evt);
            }
        });

        jMenComps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comprs2.png"))); // NOI18N
        jMenComps.setMnemonic('o');
        jMenComps.setText("Compras");
        jMenComps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenCompsKeyPressed(evt);
            }
        });

        jMenItManProvs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        jMenItManProvs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/provs.png"))); // NOI18N
        jMenItManProvs.setMnemonic('a');
        jMenItManProvs.setText("Proveedores");
        jMenItManProvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItManProvsActionPerformed(evt);
            }
        });
        jMenItManProvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItManProvsKeyPressed(evt);
            }
        });
        jMenComps.add(jMenItManProvs);

        jMenItComps.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
        jMenItComps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ordcom.png"))); // NOI18N
        jMenItComps.setMnemonic('c');
        jMenItComps.setText("Órdenes/Compras");
        jMenItComps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItCompsActionPerformed(evt);
            }
        });
        jMenItComps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItCompsKeyPressed(evt);
            }
        });
        jMenComps.add(jMenItComps);

        jMCXP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cxp.png"))); // NOI18N
        jMCXP.setMnemonic('X');
        jMCXP.setText("CXP");
        jMCXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCXPActionPerformed(evt);
            }
        });
        jMCXP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCXPKeyPressed(evt);
            }
        });
        jMenComps.add(jMCXP);

        jMImpProvs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMImpProvs.setText("Importar catálogo de proveedores desde excel");
        jMImpProvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMImpProvsActionPerformed(evt);
            }
        });
        jMImpProvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMImpProvsKeyPressed(evt);
            }
        });
        jMenComps.add(jMImpProvs);

        jMPrevioComp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        jMPrevioComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Prevcom.png"))); // NOI18N
        jMPrevioComp.setText("Previo de compra");
        jMPrevioComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrevioCompActionPerformed(evt);
            }
        });
        jMenComps.add(jMPrevioComp);

        jMMRepCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repgen.png"))); // NOI18N
        jMMRepCom.setText("Reportes");
        jMMRepCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMRepComKeyPressed(evt);
            }
        });

        jMRepProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rptprov.png"))); // NOI18N
        jMRepProv.setText("Proveedores");
        jMRepProv.setToolTipText("p");
        jMRepProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepProvActionPerformed(evt);
            }
        });
        jMRepProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepProvKeyPressed(evt);
            }
        });
        jMMRepCom.add(jMRepProv);

        jMRepCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repcom.png"))); // NOI18N
        jMRepCom.setMnemonic('o');
        jMRepCom.setText("Compras");
        jMRepCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepComActionPerformed(evt);
            }
        });
        jMRepCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepComKeyPressed(evt);
            }
        });
        jMMRepCom.add(jMRepCom);

        jMenCXP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rptcxp.png"))); // NOI18N
        jMenCXP.setMnemonic('c');
        jMenCXP.setText("CXP");
        jMenCXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenCXPActionPerformed(evt);
            }
        });
        jMenCXP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenCXPKeyPressed(evt);
            }
        });
        jMMRepCom.add(jMenCXP);

        jMRepOr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repord.png"))); // NOI18N
        jMRepOr.setMnemonic('m');
        jMRepOr.setText("Órdenes de compra");
        jMRepOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepOrActionPerformed(evt);
            }
        });
        jMRepOr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepOrKeyPressed(evt);
            }
        });
        jMMRepCom.add(jMRepOr);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Prevcom.png"))); // NOI18N
        jMenuItem4.setText("Previo de compra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMMRepCom.add(jMenuItem4);

        jMenComps.add(jMMRepCom);

        jMenInvents.add(jMenComps);

        jMInven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/inven.png"))); // NOI18N
        jMInven.setMnemonic('p');
        jMInven.setText("Inventarios");
        jMInven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMInvenKeyPressed(evt);
            }
        });

        jMVProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jMVProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prods.png"))); // NOI18N
        jMVProd.setMnemonic('P');
        jMVProd.setText("Productos");
        jMVProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVProdActionPerformed(evt);
            }
        });
        jMVProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMVProdKeyPressed(evt);
            }
        });
        jMInven.add(jMVProd);

        jMenItKits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/kits.png"))); // NOI18N
        jMenItKits.setMnemonic('i');
        jMenItKits.setText("Kits");
        jMenItKits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItKitsActionPerformed(evt);
            }
        });
        jMenItKits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItKitsKeyPressed(evt);
            }
        });
        jMInven.add(jMenItKits);

        jMLotPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lotped.png"))); // NOI18N
        jMLotPed.setText("Lotes y pedimentos");
        jMLotPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLotPedActionPerformed(evt);
            }
        });
        jMLotPed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLotPedKeyPressed(evt);
            }
        });
        jMInven.add(jMLotPed);

        jMenItConceps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/conceps.png"))); // NOI18N
        jMenItConceps.setMnemonic('t');
        jMenItConceps.setText("Conceptos");
        jMenItConceps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItConcepsActionPerformed(evt);
            }
        });
        jMenItConceps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItConcepsKeyPressed(evt);
            }
        });
        jMInven.add(jMenItConceps);

        jMMInvenImpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/import.png"))); // NOI18N
        jMMInvenImpor.setText("Importaciones");
        jMMInvenImpor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMInvenImporKeyPressed(evt);
            }
        });

        jMInvenImpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMInvenImpo.setMnemonic('I');
        jMInvenImpo.setText("Importar catálogo de productos desde excel");
        jMInvenImpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInvenImpoActionPerformed(evt);
            }
        });
        jMMInvenImpor.add(jMInvenImpo);

        jMImpExistAlm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMImpExistAlm.setMnemonic('p');
        jMImpExistAlm.setText("Importar existencias por almacén");
        jMImpExistAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMImpExistAlmActionPerformed(evt);
            }
        });
        jMImpExistAlm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMImpExistAlmKeyPressed(evt);
            }
        });
        jMMInvenImpor.add(jMImpExistAlm);

        jMImpAlma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMImpAlma.setMnemonic('o');
        jMImpAlma.setText("Importar almacenes");
        jMImpAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMImpAlmaActionPerformed(evt);
            }
        });
        jMImpAlma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMImpAlmaKeyPressed(evt);
            }
        });
        jMMInvenImpor.add(jMImpAlma);

        jMInven.add(jMMInvenImpor);

        jMMClas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasifs.png"))); // NOI18N
        jMMClas.setText("Clasificaciones");
        jMMClas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMClasKeyPressed(evt);
            }
        });

        jMenIt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/claslin.png"))); // NOI18N
        jMenIt1.setMnemonic('l');
        jMenIt1.setText("Líneas");
        jMenIt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenIt1ActionPerformed(evt);
            }
        });
        jMenIt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenIt1KeyPressed(evt);
            }
        });
        jMMClas.add(jMenIt1);

        jMTip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tips.png"))); // NOI18N
        jMTip.setMnemonic('s');
        jMTip.setText("Tipos");
        jMTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMTipActionPerformed(evt);
            }
        });
        jMTip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMTipKeyPressed(evt);
            }
        });
        jMMClas.add(jMTip);

        jMenItMarcs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasmarc.png"))); // NOI18N
        jMenItMarcs.setMnemonic('m');
        jMenItMarcs.setText("Marcas");
        jMenItMarcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItMarcsActionPerformed(evt);
            }
        });
        jMenItMarcs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItMarcsKeyPressed(evt);
            }
        });
        jMMClas.add(jMenItMarcs);

        jMenItFabs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasfab.png"))); // NOI18N
        jMenItFabs.setMnemonic('f');
        jMenItFabs.setText("Fabricantes");
        jMenItFabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItFabsActionPerformed(evt);
            }
        });
        jMenItFabs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItFabsKeyPressed(evt);
            }
        });
        jMMClas.add(jMenItFabs);

        jMenItCols.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clascol.png"))); // NOI18N
        jMenItCols.setMnemonic('c');
        jMenItCols.setText("Colores");
        jMenItCols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItColsActionPerformed(evt);
            }
        });
        jMenItCols.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItColsKeyPressed(evt);
            }
        });
        jMMClas.add(jMenItCols);

        jMenItPesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/claspes.png"))); // NOI18N
        jMenItPesos.setMnemonic('p');
        jMenItPesos.setText("Pesos");
        jMenItPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItPesosActionPerformed(evt);
            }
        });
        jMenItPesos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItPesosKeyPressed(evt);
            }
        });
        jMMClas.add(jMenItPesos);

        jMenItMeds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasmed.png"))); // NOI18N
        jMenItMeds.setMnemonic('e');
        jMenItMeds.setText("Medidas");
        jMenItMeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItMedsActionPerformed(evt);
            }
        });
        jMenItMeds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItMedsKeyPressed(evt);
            }
        });
        jMMClas.add(jMenItMeds);

        jMenItUnids.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasunid.png"))); // NOI18N
        jMenItUnids.setMnemonic('u');
        jMenItUnids.setText("Unidades");
        jMenItUnids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItUnidsActionPerformed(evt);
            }
        });
        jMenItUnids.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItUnidsKeyPressed(evt);
            }
        });
        jMMClas.add(jMenItUnids);

        jMModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/models.png"))); // NOI18N
        jMModel.setMnemonic('s');
        jMModel.setText("Modelos");
        jMModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMModelActionPerformed(evt);
            }
        });
        jMModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMModelKeyPressed(evt);
            }
        });
        jMMClas.add(jMModel);

        jMInven.add(jMMClas);

        jMenMaxsMins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/maxmin.png"))); // NOI18N
        jMenMaxsMins.setMnemonic('a');
        jMenMaxsMins.setText("Máximos y mínimos");
        jMenMaxsMins.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenMaxsMinsKeyPressed(evt);
            }
        });

        jMenItProdsBajMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prodabajmin.png"))); // NOI18N
        jMenItProdsBajMin.setMnemonic('p');
        jMenItProdsBajMin.setText("Productos debajo del mínimo");
        jMenItProdsBajMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItProdsBajMinActionPerformed(evt);
            }
        });
        jMenItProdsBajMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItProdsBajMinKeyPressed(evt);
            }
        });
        jMenMaxsMins.add(jMenItProdsBajMin);

        jMenItProdsArrMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prodarrimax.png"))); // NOI18N
        jMenItProdsArrMax.setMnemonic('r');
        jMenItProdsArrMax.setText("Productos arriba del máximo");
        jMenItProdsArrMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItProdsArrMaxActionPerformed(evt);
            }
        });
        jMenItProdsArrMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItProdsArrMaxKeyPressed(evt);
            }
        });
        jMenMaxsMins.add(jMenItProdsArrMax);

        jMenItDefEstacs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/usrmax.png"))); // NOI18N
        jMenItDefEstacs.setMnemonic('d');
        jMenItDefEstacs.setText("Definir usuarios Max. Min.");
        jMenItDefEstacs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItDefEstacsActionPerformed(evt);
            }
        });
        jMenItDefEstacs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItDefEstacsKeyPressed(evt);
            }
        });
        jMenMaxsMins.add(jMenItDefEstacs);

        jMInven.add(jMenMaxsMins);

        jMenTraspas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/movalma.png"))); // NOI18N
        jMenTraspas.setMnemonic('r');
        jMenTraspas.setText("Movimientos almacenes");
        jMenTraspas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenTraspasKeyPressed(evt);
            }
        });

        jMenItTraspas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/traspas.png"))); // NOI18N
        jMenItTraspas.setMnemonic('t');
        jMenItTraspas.setText("Traspasos");
        jMenItTraspas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItTraspasActionPerformed(evt);
            }
        });
        jMenItTraspas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItTraspasKeyPressed(evt);
            }
        });
        jMenTraspas.add(jMenItTraspas);

        jMenuItem7.setText("Pendientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenTraspas.add(jMenuItem7);

        jMenItIngr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ingrsal.png"))); // NOI18N
        jMenItIngr.setMnemonic('i');
        jMenItIngr.setText("Entradas / Salidas");
        jMenItIngr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItIngrActionPerformed(evt);
            }
        });
        jMenItIngr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItIngrKeyPressed(evt);
            }
        });
        jMenTraspas.add(jMenItIngr);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repgen.png"))); // NOI18N
        jMenu5.setLabel("Reportes");

        jMenuItem9.setText("Traspasos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenTraspas.add(jMenu5);

        jMInven.add(jMenTraspas);

        jMMUbic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ubics.png"))); // NOI18N
        jMMUbic.setMnemonic('i');
        jMMUbic.setText("Ubicaciones");
        jMMUbic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMUbicKeyPressed(evt);
            }
        });

        jMenItAlmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/almas.png"))); // NOI18N
        jMenItAlmas.setMnemonic('a');
        jMenItAlmas.setText("Almacenes");
        jMenItAlmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItAlmasActionPerformed(evt);
            }
        });
        jMenItAlmas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItAlmasKeyPressed(evt);
            }
        });
        jMMUbic.add(jMenItAlmas);

        jMenIt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/anaqs.png"))); // NOI18N
        jMenIt5.setMnemonic('q');
        jMenIt5.setText("Anaqueles");
        jMenIt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenIt5ActionPerformed(evt);
            }
        });
        jMenIt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenIt5KeyPressed(evt);
            }
        });
        jMMUbic.add(jMenIt5);

        jMenItLugs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lugs.png"))); // NOI18N
        jMenItLugs.setMnemonic('l');
        jMenItLugs.setText("Lugares");
        jMenItLugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItLugsActionPerformed(evt);
            }
        });
        jMenItLugs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItLugsKeyPressed(evt);
            }
        });
        jMMUbic.add(jMenItLugs);

        jMUbiAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ubiad.png"))); // NOI18N
        jMUbiAd.setMnemonic('u');
        jMUbiAd.setText("Ubicaciones adicionales");
        jMUbiAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUbiAdActionPerformed(evt);
            }
        });
        jMUbiAd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMUbiAdKeyPressed(evt);
            }
        });
        jMMUbic.add(jMUbiAd);

        jMInven.add(jMMUbic);

        jMMRepProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repgen.png"))); // NOI18N
        jMMRepProd.setText("Reportes");
        jMMRepProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMRepProdKeyPressed(evt);
            }
        });

        jMenProds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repprods.png"))); // NOI18N
        jMenProds.setMnemonic('p');
        jMenProds.setText("Productos");
        jMenProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenProdsActionPerformed(evt);
            }
        });
        jMenProds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenProdsKeyPressed(evt);
            }
        });
        jMMRepProd.add(jMenProds);

        jMKard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repkar.png"))); // NOI18N
        jMKard.setMnemonic('k');
        jMKard.setText("Kardex");
        jMKard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMKardActionPerformed(evt);
            }
        });
        jMKard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMKardKeyPressed(evt);
            }
        });
        jMMRepProd.add(jMKard);

        jMInven.add(jMMRepProd);

        jMenInvents.add(jMInven);

        jMenVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vtas2.png"))); // NOI18N
        jMenVtas.setMnemonic('v');
        jMenVtas.setText("Ventas");
        jMenVtas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenVtasKeyPressed(evt);
            }
        });

        jMMClien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        jMMClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/manemp.png"))); // NOI18N
        jMMClien.setMnemonic('m');
        jMMClien.setText("Clientes");
        jMMClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMClienActionPerformed(evt);
            }
        });
        jMMClien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMClienKeyPressed(evt);
            }
        });
        jMenVtas.add(jMMClien);

        jMenItVtas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        jMenItVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vtas.png"))); // NOI18N
        jMenItVtas.setMnemonic('v');
        jMenItVtas.setText("Ventas");
        jMenItVtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItVtasActionPerformed(evt);
            }
        });
        jMenItVtas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItVtasKeyPressed(evt);
            }
        });
        jMenVtas.add(jMenItVtas);

        jMenuItemRemisiones.setText("Remisiones");
        jMenuItemRemisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemisionesActionPerformed(evt);
            }
        });
        jMenVtas.add(jMenuItemRemisiones);

        jMenCotsT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenCotsT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cots.png"))); // NOI18N
        jMenCotsT.setMnemonic('C');
        jMenCotsT.setText("Cotizaciones");
        jMenCotsT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenCotsTActionPerformed(evt);
            }
        });
        jMenCotsT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenCotsTKeyPressed(evt);
            }
        });
        jMenVtas.add(jMenCotsT);

        jMenuItemPedidos.setText("Pedidos");
        jMenuItemPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPedidosActionPerformed(evt);
            }
        });
        jMenVtas.add(jMenuItemPedidos);

        jMenItTipsPags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tipspags.png"))); // NOI18N
        jMenItTipsPags.setMnemonic('t');
        jMenItTipsPags.setText("Tipos de pagos");
        jMenItTipsPags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItTipsPagsActionPerformed(evt);
            }
        });
        jMenItTipsPags.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItTipsPagsKeyPressed(evt);
            }
        });
        jMenVtas.add(jMenItTipsPags);

        jMConcepPags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tipspags.png"))); // NOI18N
        jMConcepPags.setMnemonic('n');
        jMConcepPags.setText("Conceptos de pagos");
        jMConcepPags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConcepPagsActionPerformed(evt);
            }
        });
        jMConcepPags.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMConcepPagsKeyPressed(evt);
            }
        });
        jMenVtas.add(jMConcepPags);

        jMCXC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cxc.png"))); // NOI18N
        jMCXC.setMnemonic('c');
        jMCXC.setText("CXC");
        jMCXC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCXCActionPerformed(evt);
            }
        });
        jMCXC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCXCKeyPressed(evt);
            }
        });
        jMenVtas.add(jMCXC);

        jMenItTouch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        jMenItTouch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pos.png"))); // NOI18N
        jMenItTouch.setMnemonic('t');
        jMenItTouch.setText("Punto de venta");
        jMenItTouch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItTouchActionPerformed(evt);
            }
        });
        jMenItTouch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItTouchKeyPressed(evt);
            }
        });
        jMenVtas.add(jMenItTouch);

        jMImpCliens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMImpCliens.setMnemonic('i');
        jMImpCliens.setText("Importar catálogo de clientes desde excel");
        jMImpCliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMImpCliensActionPerformed(evt);
            }
        });
        jMImpCliens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMImpCliensKeyPressed(evt);
            }
        });
        jMenVtas.add(jMImpCliens);

        jMMRepVta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repgen.png"))); // NOI18N
        jMMRepVta.setText("Reportes");
        jMMRepVta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMRepVtaKeyPressed(evt);
            }
        });

        jMRepCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rptcli.png"))); // NOI18N
        jMRepCli.setMnemonic('c');
        jMRepCli.setText("Clientes");
        jMRepCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepCliActionPerformed(evt);
            }
        });
        jMRepCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepCliKeyPressed(evt);
            }
        });
        jMMRepVta.add(jMRepCli);

        jMenVtasR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repvta.png"))); // NOI18N
        jMenVtasR.setMnemonic('v');
        jMenVtasR.setText("Ventas");
        jMenVtasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenVtasRActionPerformed(evt);
            }
        });
        jMenVtasR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenVtasRKeyPressed(evt);
            }
        });
        jMMRepVta.add(jMenVtasR);

        jMenCXCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rptcxc.png"))); // NOI18N
        jMenCXCR.setMnemonic('x');
        jMenCXCR.setText("CXC");
        jMenCXCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenCXCRActionPerformed(evt);
            }
        });
        jMenCXCR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenCXCRKeyPressed(evt);
            }
        });
        jMMRepVta.add(jMenCXCR);

        jMRepCot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repcots.png"))); // NOI18N
        jMRepCot.setMnemonic('t');
        jMRepCot.setText("Cotizaciones");
        jMRepCot.setToolTipText("");
        jMRepCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepCotActionPerformed(evt);
            }
        });
        jMRepCot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepCotKeyPressed(evt);
            }
        });
        jMMRepVta.add(jMRepCot);

        jMRepVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repvend.png"))); // NOI18N
        jMRepVend.setMnemonic('n');
        jMRepVend.setText("Vendedores");
        jMRepVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepVendActionPerformed(evt);
            }
        });
        jMRepVend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepVendKeyPressed(evt);
            }
        });
        jMMRepVta.add(jMRepVend);

        jMFluj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repfluj.png"))); // NOI18N
        jMFluj.setMnemonic('f');
        jMFluj.setText("Flujo");
        jMFluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFlujActionPerformed(evt);
            }
        });
        jMFluj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMFlujKeyPressed(evt);
            }
        });
        jMMRepVta.add(jMFluj);

        jMenVtas.add(jMMRepVta);

        jMenInvents.add(jMenVtas);

        jMActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/280activos.png"))); // NOI18N
        jMActivos.setText("Activos");

        jMZon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/zon.png"))); // NOI18N
        jMZon.setMnemonic('z');
        jMZon.setText("Zonas");
        jMZon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMZonActionPerformed(evt);
            }
        });
        jMZon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMZonKeyPressed(evt);
            }
        });
        jMActivos.add(jMZon);

        jMSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/281sucursal.png"))); // NOI18N
        jMSucursal.setText("Sucursales");
        jMSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSucursalActionPerformed(evt);
            }
        });
        jMActivos.add(jMSucursal);

        jMClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/30clasificaciones.png"))); // NOI18N
        jMClasificacion.setText("Clasificaciones");
        jMClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClasificacionActionPerformed(evt);
            }
        });
        jMActivos.add(jMClasificacion);

        jMResponsable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/282responsable.png"))); // NOI18N
        jMResponsable.setText("Responsables");
        jMResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMResponsableActionPerformed(evt);
            }
        });
        jMActivos.add(jMResponsable);

        jMActivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/280activos.png"))); // NOI18N
        jMActivo.setText("Activo");
        jMActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMActivoActionPerformed(evt);
            }
        });
        jMActivos.add(jMActivo);

        jMenInvents.add(jMActivos);

        jMConcepNot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/concepnot.png"))); // NOI18N
        jMConcepNot.setText("Conceptos notas de crédito");
        jMConcepNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConcepNotActionPerformed(evt);
            }
        });
        jMConcepNot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMConcepNotKeyPressed(evt);
            }
        });
        jMenInvents.add(jMConcepNot);

        jMenItMons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mons.png"))); // NOI18N
        jMenItMons.setMnemonic('o');
        jMenItMons.setText("Monedas");
        jMenItMons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItMonsActionPerformed(evt);
            }
        });
        jMenItMons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItMonsKeyPressed(evt);
            }
        });
        jMenInvents.add(jMenItMons);

        jMeItImps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impues.png"))); // NOI18N
        jMeItImps.setMnemonic('m');
        jMeItImps.setText("Impuestos");
        jMeItImps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeItImpsActionPerformed(evt);
            }
        });
        jMeItImps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMeItImpsKeyPressed(evt);
            }
        });
        jMenInvents.add(jMeItImps);

        jMICuentaContable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/30clasificaciones.png"))); // NOI18N
        jMICuentaContable.setText("Cuentas contables");
        jMICuentaContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICuentaContableActionPerformed(evt);
            }
        });
        jMenInvents.add(jMICuentaContable);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/285catalogobancos.png"))); // NOI18N
        jMenuItem5.setText("Bancos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenInvents.add(jMenuItem5);

        jMenBar1.add(jMenInvents);

        jMSist.setMnemonic('c');
        jMSist.setText("Configuraciones");
        jMSist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMSistKeyPressed(evt);
            }
        });

        jMenIt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corrs.png"))); // NOI18N
        jMenIt4.setMnemonic('o');
        jMenIt4.setText("Correos electrónicos");
        jMenIt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenIt4ActionPerformed(evt);
            }
        });
        jMenIt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenIt4KeyPressed(evt);
            }
        });
        jMSist.add(jMenIt4);

        jMenItDatsGenEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/datsgralempre.png"))); // NOI18N
        jMenItDatsGenEmp.setMnemonic('t');
        jMenItDatsGenEmp.setText("Datos generales de la empresa");
        jMenItDatsGenEmp.setToolTipText("");
        jMenItDatsGenEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItDatsGenEmpActionPerformed(evt);
            }
        });
        jMenItDatsGenEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItDatsGenEmpKeyPressed(evt);
            }
        });
        jMSist.add(jMenItDatsGenEmp);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fol.png"))); // NOI18N
        jMenuItem3.setText("Series y consecutivos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMSist.add(jMenuItem3);

        jMenItImpres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impres.png"))); // NOI18N
        jMenItImpres.setMnemonic('m');
        jMenItImpres.setText("Impresoras");
        jMenItImpres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItImpresActionPerformed(evt);
            }
        });
        jMenItImpres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItImpresKeyPressed(evt);
            }
        });
        jMSist.add(jMenItImpres);

        jMConfAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/confgral.png"))); // NOI18N
        jMConfAd.setMnemonic('n');
        jMConfAd.setText("Configuraciones generales");
        jMConfAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConfAdActionPerformed(evt);
            }
        });
        jMConfAd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMConfAdKeyPressed(evt);
            }
        });
        jMSist.add(jMConfAd);

        jMenBar1.add(jMSist);

        jMMAyu.setMnemonic('y');
        jMMAyu.setText("Ayuda");
        jMMAyu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMAyuKeyPressed(evt);
            }
        });

        jMAcerc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/acerd.png"))); // NOI18N
        jMAcerc.setMnemonic('a');
        jMAcerc.setText("Acerca de...");
        jMAcerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAcercActionPerformed(evt);
            }
        });
        jMAcerc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMAcercKeyPressed(evt);
            }
        });
        jMMAyu.add(jMAcerc);

        jMenBar1.add(jMMAyu);

        setJMenuBar(jMenBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                   
            
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
                            
    }//GEN-LAST:event_formKeyPressed
                        
            
    private void jMenIt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenIt4ActionPerformed
                
    }//GEN-LAST:event_jMenIt4ActionPerformed

        
    private void jMenBar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenBar1KeyPressed
                       
    }//GEN-LAST:event_jMenBar1KeyPressed
        
    private void jMMSisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMSisKeyPressed
                        
    }//GEN-LAST:event_jMMSisKeyPressed
        
    private void jMenIt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenIt4KeyPressed
                        
    }//GEN-LAST:event_jMenIt4KeyPressed
                    
    private void jMMClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMClienActionPerformed
                        
    }//GEN-LAST:event_jMMClienActionPerformed
        
    private void jMMClienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMClienKeyPressed
        
    }//GEN-LAST:event_jMMClienKeyPressed
        
    private void jMenItManProvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItManProvsActionPerformed
                    
    }//GEN-LAST:event_jMenItManProvsActionPerformed
   
    private void jMenItManProvsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItManProvsKeyPressed
        
    }//GEN-LAST:event_jMenItManProvsKeyPressed
    
    private void jMenItPermEstacsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItPermEstacsActionPerformed
            
    }//GEN-LAST:event_jMenItPermEstacsActionPerformed
                   
    private void jMenItEstacsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItEstacsKeyPressed
                      
    }//GEN-LAST:event_jMenItEstacsKeyPressed
        
    private void jMenItEstacsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItEstacsActionPerformed
    
        
        
    }//GEN-LAST:event_jMenItEstacsActionPerformed
        
    private void jMenLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenLoginKeyPressed
                
    }//GEN-LAST:event_jMenLoginKeyPressed
    
    private void jMenItLogearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItLogearActionPerformed
                        
    }//GEN-LAST:event_jMenItLogearActionPerformed
    
    private void jMenItLogearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItLogearKeyPressed
                    
    }//GEN-LAST:event_jMenItLogearKeyPressed
                
    private void jMenBDsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenBDsKeyPressed
               
    }//GEN-LAST:event_jMenBDsKeyPressed
        
    private void jMenItSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItSalKeyPressed
    
    }//GEN-LAST:event_jMenItSalKeyPressed
        
    private void jMenItSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItSalActionPerformed
                
    }//GEN-LAST:event_jMenItSalActionPerformed
                                            
    private void jMenCompsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenCompsKeyPressed
                        
    }//GEN-LAST:event_jMenCompsKeyPressed
            
    private void jMenItCompsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItCompsKeyPressed
                        
    }//GEN-LAST:event_jMenItCompsKeyPressed
    
    private void jMenItCompsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItCompsActionPerformed
                    
    }//GEN-LAST:event_jMenItCompsActionPerformed
          
    private void jMenCotsTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenCotsTKeyPressed
               
    }//GEN-LAST:event_jMenCotsTKeyPressed
    
    private void jMenCotsTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenCotsTActionPerformed
                
    }//GEN-LAST:event_jMenCotsTActionPerformed
            
    private void jMenVtasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenVtasKeyPressed
               
    }//GEN-LAST:event_jMenVtasKeyPressed

    private void jMenItVtasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItVtasKeyPressed
                        
    }//GEN-LAST:event_jMenItVtasKeyPressed
        
    private void jMenItVtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItVtasActionPerformed
                
    }//GEN-LAST:event_jMenItVtasActionPerformed
            
    private void jMenItTouchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItTouchKeyPressed
                        
    }//GEN-LAST:event_jMenItTouchKeyPressed
                           
    private void jMenItTouchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItTouchActionPerformed
                
    }//GEN-LAST:event_jMenItTouchActionPerformed
    
    private void jMenInventsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenInventsKeyPressed
    
    }//GEN-LAST:event_jMenInventsKeyPressed
       
    private void jMenItConcepsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItConcepsKeyPressed
   
    }//GEN-LAST:event_jMenItConcepsKeyPressed
       
    private void jMenItConcepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItConcepsActionPerformed
       
    }//GEN-LAST:event_jMenItConcepsActionPerformed
        
    private void jMeItImpsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMeItImpsKeyPressed
    
    }//GEN-LAST:event_jMeItImpsKeyPressed
    
    private void jMeItImpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeItImpsActionPerformed
    
    }//GEN-LAST:event_jMeItImpsActionPerformed
        
    private void jMenItLugsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItLugsKeyPressed
   
    }//GEN-LAST:event_jMenItLugsKeyPressed
      
    private void jMenItLugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItLugsActionPerformed
    
    }//GEN-LAST:event_jMenItLugsActionPerformed
        
    private void jMenIt5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenIt5KeyPressed
    
    }//GEN-LAST:event_jMenIt5KeyPressed
   
    private void jMenIt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenIt5ActionPerformed
        
    }//GEN-LAST:event_jMenIt5ActionPerformed
   
    private void jMenItMedsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItMedsKeyPressed
     
    }//GEN-LAST:event_jMenItMedsKeyPressed
        
    private void jMenItMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItMedsActionPerformed
        
    }//GEN-LAST:event_jMenItMedsActionPerformed
        
    private void jMenItMonsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItMonsKeyPressed
    
    }//GEN-LAST:event_jMenItMonsKeyPressed
    
    private void jMenItMonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItMonsActionPerformed
    
    }//GEN-LAST:event_jMenItMonsActionPerformed
     
    private void jMenItAlmasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItAlmasKeyPressed

    }//GEN-LAST:event_jMenItAlmasKeyPressed
    
    private void jMenItAlmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItAlmasActionPerformed

    }//GEN-LAST:event_jMenItAlmasActionPerformed
        
    private void jMenItUnidsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItUnidsKeyPressed
        
    }//GEN-LAST:event_jMenItUnidsKeyPressed
    
    private void jMenItUnidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItUnidsActionPerformed

    }//GEN-LAST:event_jMenItUnidsActionPerformed
        
    private void jMenItPesosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItPesosKeyPressed
    
    }//GEN-LAST:event_jMenItPesosKeyPressed
    
    private void jMenItPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItPesosActionPerformed
    
    }//GEN-LAST:event_jMenItPesosActionPerformed
       
    private void jMenItColsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItColsKeyPressed

    }//GEN-LAST:event_jMenItColsKeyPressed
        
    private void jMenItColsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItColsActionPerformed
     
    }//GEN-LAST:event_jMenItColsActionPerformed
        
    private void jMenItFabsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItFabsKeyPressed
    
    }//GEN-LAST:event_jMenItFabsKeyPressed
        
    private void jMenItFabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItFabsActionPerformed
     
    }//GEN-LAST:event_jMenItFabsActionPerformed
        
    private void jMenItMarcsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItMarcsKeyPressed
    
    }//GEN-LAST:event_jMenItMarcsKeyPressed
        
    private void jMenItMarcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItMarcsActionPerformed
        
    }//GEN-LAST:event_jMenItMarcsActionPerformed
        
    private void jMenIt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenIt1KeyPressed
        
    }//GEN-LAST:event_jMenIt1KeyPressed
        
    private void jMenIt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenIt1ActionPerformed
        
    }//GEN-LAST:event_jMenIt1ActionPerformed
        
    private void jMVProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMVProdKeyPressed
    
    }//GEN-LAST:event_jMVProdKeyPressed

        
    private void jMVProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVProdActionPerformed
                
    }//GEN-LAST:event_jMVProdActionPerformed
        
    private void jMenMaxsMinsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenMaxsMinsKeyPressed
                    
    }//GEN-LAST:event_jMenMaxsMinsKeyPressed
        
    private void jMenItProdsBajMinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItProdsBajMinKeyPressed
                    
    }//GEN-LAST:event_jMenItProdsBajMinKeyPressed

        
    private void jMenItProdsBajMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItProdsBajMinActionPerformed
                        
    }//GEN-LAST:event_jMenItProdsBajMinActionPerformed

        
    private void jMenItDefEstacsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItDefEstacsKeyPressed
                       
    }//GEN-LAST:event_jMenItDefEstacsKeyPressed

        
    private void jMenItDefEstacsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItDefEstacsActionPerformed
                        
    }//GEN-LAST:event_jMenItDefEstacsActionPerformed
        
    private void jMenItKitsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItKitsKeyPressed
                        
    }//GEN-LAST:event_jMenItKitsKeyPressed

        
    private void jMenItKitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItKitsActionPerformed
                     
    }//GEN-LAST:event_jMenItKitsActionPerformed
        
    private void jMenItProdsArrMaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItProdsArrMaxKeyPressed
               
    }//GEN-LAST:event_jMenItProdsArrMaxKeyPressed
        
    private void jMenItProdsArrMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItProdsArrMaxActionPerformed
                    
    }//GEN-LAST:event_jMenItProdsArrMaxActionPerformed
        
    private void jMenItTraspasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItTraspasActionPerformed
                        
    }//GEN-LAST:event_jMenItTraspasActionPerformed
    
    private void jMenTraspasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenTraspasKeyPressed
                
    }//GEN-LAST:event_jMenTraspasKeyPressed
    
    private void jMenItTraspasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItTraspasKeyPressed
            
    }//GEN-LAST:event_jMenItTraspasKeyPressed
    
    private void jMenItIngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItIngrActionPerformed
                        
    }//GEN-LAST:event_jMenItIngrActionPerformed
    
    private void jMenItIngrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItIngrKeyPressed
                
    }//GEN-LAST:event_jMenItIngrKeyPressed
            
    private void jMenItDatsGenEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItDatsGenEmpKeyPressed
                        
    }//GEN-LAST:event_jMenItDatsGenEmpKeyPressed
        
    private void jMenItDatsGenEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItDatsGenEmpActionPerformed
                        
    }//GEN-LAST:event_jMenItDatsGenEmpActionPerformed
    
    private void jMenLogsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenLogsKeyPressed
                        
    }//GEN-LAST:event_jMenLogsKeyPressed
        
    private void jMenItLogCorrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItLogCorrKeyPressed
                       
    }//GEN-LAST:event_jMenItLogCorrKeyPressed

        
    private void jMenItLogCorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItLogCorrActionPerformed
                        
    }//GEN-LAST:event_jMenItLogCorrActionPerformed

        
    private void jMenItTipsPagsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItTipsPagsKeyPressed
        
       
    }//GEN-LAST:event_jMenItTipsPagsKeyPressed

        
    private void jMenItTipsPagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItTipsPagsActionPerformed
        
        
    }//GEN-LAST:event_jMenItTipsPagsActionPerformed
        
        
    private void jMenItImpresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItImpresKeyPressed
                
    }//GEN-LAST:event_jMenItImpresKeyPressed
        
    private void jMenItImpresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItImpresActionPerformed
        
        
    }//GEN-LAST:event_jMenItImpresActionPerformed

    
        
                
    private void jMVLogSysKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMVLogSysKeyPressed
                
    }//GEN-LAST:event_jMVLogSysKeyPressed

        
    private void jMVLogSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVLogSysActionPerformed
                        
    }//GEN-LAST:event_jMVLogSysActionPerformed

        
    private void jMConfAdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMConfAdKeyPressed
                    
    }//GEN-LAST:event_jMConfAdKeyPressed

        
    private void jMConfAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConfAdActionPerformed
             
        
    }//GEN-LAST:event_jMConfAdActionPerformed

        
    private void jMCXCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCXCActionPerformed
             
        
    }//GEN-LAST:event_jMCXCActionPerformed

        
    private void jMCXCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCXCKeyPressed
            
        
    }//GEN-LAST:event_jMCXCKeyPressed

            
    private void jMCXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCXPActionPerformed
                     
    }//GEN-LAST:event_jMCXPActionPerformed
        
    private void jMCXPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCXPKeyPressed
                        
    }//GEN-LAST:event_jMCXPKeyPressed
                    
    private void jMenConfigFilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenConfigFilKeyPressed
               
    }//GEN-LAST:event_jMenConfigFilKeyPressed

        
    private void jMenConfigFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenConfigFilActionPerformed
                     
    }//GEN-LAST:event_jMenConfigFilActionPerformed
            
        
        
    private void jMenItDeslogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItDeslogKeyPressed
                    
    }//GEN-LAST:event_jMenItDeslogKeyPressed

        
    private void jMenItDeslogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItDeslogActionPerformed
                        
    }//GEN-LAST:event_jMenItDeslogActionPerformed
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
               
    }//GEN-LAST:event_formMouseMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
                    
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
       
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void jMenItCamEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItCamEmpKeyPressed
                
    }//GEN-LAST:event_jMenItCamEmpKeyPressed

        
    private void jMenItCamEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItCamEmpActionPerformed
                        
    }//GEN-LAST:event_jMenItCamEmpActionPerformed

        
    private void jMenCXCRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenCXCRKeyPressed
                
    }//GEN-LAST:event_jMenCXCRKeyPressed

        
    private void jMenCXCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenCXCRActionPerformed
             
        
    }//GEN-LAST:event_jMenCXCRActionPerformed

        
    private void jMenCXPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenCXPKeyPressed
                
    }//GEN-LAST:event_jMenCXPKeyPressed

        
    private void jMenCXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenCXPActionPerformed
             
        
    }//GEN-LAST:event_jMenCXPActionPerformed

     
    private void jMenVtasRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenVtasRKeyPressed
                
    }//GEN-LAST:event_jMenVtasRKeyPressed

        
    private void jMenVtasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenVtasRActionPerformed
             
        
    }//GEN-LAST:event_jMenVtasRActionPerformed

                
    private void jMenProdsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenProdsKeyPressed
                
        
    }//GEN-LAST:event_jMenProdsKeyPressed

        
    private void jMenProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenProdsActionPerformed
             
        
    }//GEN-LAST:event_jMenProdsActionPerformed

        
    private void jMLogSisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogSisKeyPressed
            
        
    }//GEN-LAST:event_jMLogSisKeyPressed

        
    private void jMDelLogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMDelLogKeyPressed
                
    }//GEN-LAST:event_jMDelLogKeyPressed

        
    private void jMDelLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDelLogActionPerformed
                        
    }//GEN-LAST:event_jMDelLogActionPerformed

        
    private void jMInvenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMInvenKeyPressed
            
    }//GEN-LAST:event_jMInvenKeyPressed

        
        
        
    private void jMUbiAdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMUbiAdKeyPressed
            
        
    }//GEN-LAST:event_jMUbiAdKeyPressed

        
    private void jMUbiAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUbiAdActionPerformed
             
    }//GEN-LAST:event_jMUbiAdActionPerformed

        
    private void jMSistKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMSistKeyPressed
        
        
    }//GEN-LAST:event_jMSistKeyPressed

        
    private void jMMUsrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMUsrKeyPressed
                
    }//GEN-LAST:event_jMMUsrKeyPressed

    
        
    
    private void jMEstacsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMEstacsKeyPressed
            
        
    }//GEN-LAST:event_jMEstacsKeyPressed

    
    private void jMEstacsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEstacsActionPerformed
                        
    }//GEN-LAST:event_jMEstacsActionPerformed

        
    private void jMMUbicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMUbicKeyPressed
               
    }//GEN-LAST:event_jMMUbicKeyPressed

        
    private void jMLogProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogProdKeyPressed
                
    }//GEN-LAST:event_jMLogProdKeyPressed

        
    private void jMMClasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMClasKeyPressed
            
        
    }//GEN-LAST:event_jMMClasKeyPressed

        
    private void jMLogProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogProdActionPerformed
                
    }//GEN-LAST:event_jMLogProdActionPerformed

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
           

    
        
    private void jMRepCotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepCotKeyPressed
        
        
    }//GEN-LAST:event_jMRepCotKeyPressed

        
    private void jMRepCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepCotActionPerformed
        
        
    }//GEN-LAST:event_jMRepCotActionPerformed

        
        
        
    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
        
    }//GEN-LAST:event_formWindowStateChanged

        
        
        
        
        
        
            
        
        
        
    
    
        
        
    
    
    private void jBPtoVtaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBPtoVtaKeyPressed
        
        
    }//GEN-LAST:event_jBPtoVtaKeyPressed

        
    private void jBPtoVtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPtoVtaActionPerformed
        
        
    }//GEN-LAST:event_jBPtoVtaActionPerformed

        
    private void jBVtasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVtasKeyPressed
           
        
    }//GEN-LAST:event_jBVtasKeyPressed
    
            
    private void jBVtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVtasActionPerformed
                
    }//GEN-LAST:event_jBVtasActionPerformed

        
    private void jBCompsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCompsKeyPressed
                
    }//GEN-LAST:event_jBCompsKeyPressed

        
    private void jBCompsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCompsActionPerformed
        
        
    }//GEN-LAST:event_jBCompsActionPerformed

        
    private void jBEmpsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBEmpsKeyPressed
        
        
    }//GEN-LAST:event_jBEmpsKeyPressed

    
    private void jBProvsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBProvsKeyPressed
        
        
    }//GEN-LAST:event_jBProvsKeyPressed

        
    private void jBEmpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpsActionPerformed
                
        
    }//GEN-LAST:event_jBEmpsActionPerformed

        
    private void jBProvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProvsActionPerformed
                
    }//GEN-LAST:event_jBProvsActionPerformed

        
    private void jBProdsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBProdsKeyPressed
        
        
    }//GEN-LAST:event_jBProdsKeyPressed

        
    private void jBCotsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCotsKeyPressed
        
        
    }//GEN-LAST:event_jBCotsKeyPressed

        
    private void jBProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProdsActionPerformed
        
        
    }//GEN-LAST:event_jBProdsActionPerformed

        
    private void jBCotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCotsActionPerformed
        
        
    }//GEN-LAST:event_jBCotsActionPerformed

       
        
        
    private void jMRepVendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepVendKeyPressed
        
        
    }//GEN-LAST:event_jMRepVendKeyPressed

        
    private void jMRepVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepVendActionPerformed
        
        
    }//GEN-LAST:event_jMRepVendActionPerformed

        
    private void jMMAyuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMAyuKeyPressed
                    
    }//GEN-LAST:event_jMMAyuKeyPressed

        
    private void jMAcercKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMAcercKeyPressed
                
    }//GEN-LAST:event_jMAcercKeyPressed

        
    private void jMAcercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAcercActionPerformed
        
        
    }//GEN-LAST:event_jMAcercActionPerformed

            
    private void jMRepComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepComActionPerformed
        
        
    }//GEN-LAST:event_jMRepComActionPerformed

        
    private void jMRepComKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepComKeyPressed
        
        
    }//GEN-LAST:event_jMRepComKeyPressed
    
    private void jMRepOrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepOrKeyPressed
        
                
    }//GEN-LAST:event_jMRepOrKeyPressed

        
    private void jMRepOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepOrActionPerformed
                
    }//GEN-LAST:event_jMRepOrActionPerformed

        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
    }//GEN-LAST:event_formWindowClosing

        
    private void jMKardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMKardActionPerformed
        
        
    }//GEN-LAST:event_jMKardActionPerformed

        
    private void jMKardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMKardKeyPressed
        
        
    }//GEN-LAST:event_jMKardKeyPressed

        
    private void jBPtoVtaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPtoVtaMouseEntered
                
    }//GEN-LAST:event_jBPtoVtaMouseEntered

        
    private void jBVtasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVtasMouseEntered
                
        
    }//GEN-LAST:event_jBVtasMouseEntered

        
    private void jBCompsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCompsMouseEntered
        
        
    }//GEN-LAST:event_jBCompsMouseEntered

        
    private void jBEmpsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEmpsMouseEntered
        
        
    }//GEN-LAST:event_jBEmpsMouseEntered

       
    private void jBProvsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProvsMouseEntered
        
        
    }//GEN-LAST:event_jBProvsMouseEntered

       
    private void jBProdsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProdsMouseEntered
                
    }//GEN-LAST:event_jBProdsMouseEntered

        
    private void jBCotsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCotsMouseEntered
                
    }//GEN-LAST:event_jBCotsMouseEntered

        
    private void jBPtoVtaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPtoVtaMouseExited
                
    }//GEN-LAST:event_jBPtoVtaMouseExited

        
    private void jBVtasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVtasMouseExited
        
        
    }//GEN-LAST:event_jBVtasMouseExited

        
    private void jBCompsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCompsMouseExited
                
    }//GEN-LAST:event_jBCompsMouseExited

        
    private void jBEmpsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEmpsMouseExited
        
        
    }//GEN-LAST:event_jBEmpsMouseExited

        
    private void jBProvsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProvsMouseExited
        
        
    }//GEN-LAST:event_jBProvsMouseExited

        
    private void jBProdsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProdsMouseExited
        
        
    }//GEN-LAST:event_jBProdsMouseExited

        
    private void jBCotsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCotsMouseExited
        
        
    }//GEN-LAST:event_jBCotsMouseExited

        
       
        
        
        
    private void jMRespKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRespKeyPressed
        
        
    }//GEN-LAST:event_jMRespKeyPressed

        
    private void jMRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRespActionPerformed
        
        
    }//GEN-LAST:event_jMRespActionPerformed

        
    private void jMFlujKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMFlujKeyPressed
        
        
    }//GEN-LAST:event_jMFlujKeyPressed

        
    private void jMFlujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFlujActionPerformed
        
        
    }//GEN-LAST:event_jMFlujActionPerformed

    

    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
        
    }//GEN-LAST:event_jP1KeyPressed

    
    private void jLImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLImgKeyPressed
       
        
    }//GEN-LAST:event_jLImgKeyPressed
        
    
        
        
        
        
        
        
    private void jMModelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMModelKeyPressed
        
        
    }//GEN-LAST:event_jMModelKeyPressed

        
    private void jMModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMModelActionPerformed
        
        
    }//GEN-LAST:event_jMModelActionPerformed

        
        
        
        
        
        
        
        
        
        
        
    private void jMLotPedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLotPedKeyPressed
            
    }//GEN-LAST:event_jMLotPedKeyPressed

        
    private void jMLotPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLotPedActionPerformed
        
        
    }//GEN-LAST:event_jMLotPedActionPerformed

        
    private void jMMRepComKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMRepComKeyPressed
        
        
    }//GEN-LAST:event_jMMRepComKeyPressed

        
    private void jMMRepVtaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMRepVtaKeyPressed
        
        
    }//GEN-LAST:event_jMMRepVtaKeyPressed

        
    private void jMMRepProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMRepProdKeyPressed
        
        
    }//GEN-LAST:event_jMMRepProdKeyPressed

        
    private void jMMRepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMRepKeyPressed
        
        
    }//GEN-LAST:event_jMMRepKeyPressed

        
        
        
    private void jMTipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMTipKeyPressed
        
        
    }//GEN-LAST:event_jMTipKeyPressed

        
    private void jMTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTipActionPerformed
        
        
    }//GEN-LAST:event_jMTipActionPerformed

        
      
        
    private void jMMInvenImporKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMInvenImporKeyPressed
        
        
    }//GEN-LAST:event_jMMInvenImporKeyPressed

        
       
             
                                                
                                        
        
        
        
        
       
    private void jMImpCliensKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpCliensKeyPressed
        
        
    }//GEN-LAST:event_jMImpCliensKeyPressed

    
    private void jMImpCliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpCliensActionPerformed
             
        
    }//GEN-LAST:event_jMImpCliensActionPerformed

        
        
    private void jMImpProvsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpProvsKeyPressed
        
        
    }//GEN-LAST:event_jMImpProvsKeyPressed

       
        
    private void jMImpProvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpProvsActionPerformed
        
                
    }//GEN-LAST:event_jMImpProvsActionPerformed

        
        
        
       
    private void jMZonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMZonKeyPressed
            
        
    }//GEN-LAST:event_jMZonKeyPressed

        
        
    private void jMZonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMZonActionPerformed
        
        
    }//GEN-LAST:event_jMZonActionPerformed

        
            
                
        
        
        
        
        
        
    private void jMRepCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepCliKeyPressed
        
        
    }//GEN-LAST:event_jMRepCliKeyPressed

        
    private void jMRepCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepCliActionPerformed
                
        
    }//GEN-LAST:event_jMRepCliActionPerformed

        
    private void jMRepProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepProvKeyPressed
        
        
    }//GEN-LAST:event_jMRepProvKeyPressed

        
    private void jMRepProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepProvActionPerformed
                
        
    }//GEN-LAST:event_jMRepProvActionPerformed

        
        
        
        
        
        
        
        
        
       
      
        
        
        
        
    
        
        
    private void jMConcepNotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMConcepNotKeyPressed
                  
        
    }//GEN-LAST:event_jMConcepNotKeyPressed

        
    private void jMConcepNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConcepNotActionPerformed
             
        
    }//GEN-LAST:event_jMConcepNotActionPerformed

        
    private void jMImpExistAlmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpExistAlmKeyPressed
        
        
    }//GEN-LAST:event_jMImpExistAlmKeyPressed

        
        
    private void jMImpExistAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpExistAlmActionPerformed
        
        
        
    }//GEN-LAST:event_jMImpExistAlmActionPerformed

        
        
    
    private void jMImpAlmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpAlmaKeyPressed
           
        
    }//GEN-LAST:event_jMImpAlmaKeyPressed

        
    private void jMImpAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpAlmaActionPerformed
        
                
    }//GEN-LAST:event_jMImpAlmaActionPerformed

        
        
        
       
        
        
        
        
        
    
        
        
        
        
        
        
        
            
        
        
        
        
        
        
        
                
    
        
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            
        
    }//GEN-LAST:event_formWindowActivated

        
    private void jMConcepPagsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMConcepPagsKeyPressed
            
        
    }//GEN-LAST:event_jMConcepPagsKeyPressed

        
    private void jMConcepPagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConcepPagsActionPerformed
                
        
    }//GEN-LAST:event_jMConcepPagsActionPerformed

        
            
        
            
    private void jBPrevCompMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrevCompMouseEntered
                
        
    }//GEN-LAST:event_jBPrevCompMouseEntered

        
    private void jBPrevCompMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrevCompMouseExited
        
    }//GEN-LAST:event_jBPrevCompMouseExited

        
    private void jBPrevCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrevCompActionPerformed
        
    }//GEN-LAST:event_jBPrevCompActionPerformed

        
    private void jBPrevCompKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBPrevCompKeyPressed
            
        
    }//GEN-LAST:event_jBPrevCompKeyPressed

            
    private void jMPrevioCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrevioCompActionPerformed
        
        
        
    }//GEN-LAST:event_jMPrevioCompActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    private void jMInvenImpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInvenImpoActionPerformed
        
    }//GEN-LAST:event_jMInvenImpoActionPerformed

    private void jBPtoVta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPtoVta2MouseEntered
        
    }//GEN-LAST:event_jBPtoVta2MouseEntered

    private void jBPtoVta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPtoVta2MouseExited
        
    }//GEN-LAST:event_jBPtoVta2MouseExited

    private void jBPtoVta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPtoVta2ActionPerformed
        
        
    }//GEN-LAST:event_jBPtoVta2ActionPerformed

    private void jBPtoVta2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBPtoVta2KeyPressed
        
    }//GEN-LAST:event_jBPtoVta2KeyPressed

    private void jMSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSucursalActionPerformed
        
    }//GEN-LAST:event_jMSucursalActionPerformed

    private void jMClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClasificacionActionPerformed
        
    }//GEN-LAST:event_jMClasificacionActionPerformed

    private void jMResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMResponsableActionPerformed
        
    }//GEN-LAST:event_jMResponsableActionPerformed

    private void jMActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMActivoActionPerformed
        
    }//GEN-LAST:event_jMActivoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMICuentaContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICuentaContableActionPerformed
       
    }//GEN-LAST:event_jMICuentaContableActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
     
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItemPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPedidosActionPerformed


    }//GEN-LAST:event_jMenuItemPedidosActionPerformed


  
    private void jMenuItemRemisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemisionesActionPerformed
        
        
    }//GEN-LAST:event_jMenuItemRemisionesActionPerformed

    private void jButtonPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPedidosMouseEntered
        
    }//GEN-LAST:event_jButtonPedidosMouseEntered

    private void jButtonPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPedidosMouseExited
        
    }//GEN-LAST:event_jButtonPedidosMouseExited

    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
                
        
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    private void jButtonPedidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonPedidosKeyPressed
        
    }//GEN-LAST:event_jButtonPedidosKeyPressed

    private void jButtonPedidos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPedidos1MouseEntered
        
    }//GEN-LAST:event_jButtonPedidos1MouseEntered

    private void jButtonPedidos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPedidos1MouseExited
        
    }//GEN-LAST:event_jButtonPedidos1MouseExited

    private void jButtonPedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidos1ActionPerformed
                
    }//GEN-LAST:event_jButtonPedidos1ActionPerformed

    private void jButtonPedidos1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonPedidos1KeyPressed
    
    }//GEN-LAST:event_jButtonPedidos1KeyPressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jBReporteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReporteCajaActionPerformed
     
    }//GEN-LAST:event_jBReporteCajaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBComps;
    protected javax.swing.JButton jBCots;
    protected javax.swing.JButton jBEmps;
    protected javax.swing.JButton jBPrevComp;
    protected javax.swing.JButton jBProds;
    protected javax.swing.JButton jBProvs;
    protected javax.swing.JButton jBPtoVta;
    protected javax.swing.JButton jBPtoVta2;
    protected javax.swing.JButton jBReporteCaja;
    protected javax.swing.JButton jBVtas;
    protected javax.swing.JButton jButtonPedidos;
    protected javax.swing.JButton jButtonPedidos1;
    private javax.swing.JCheckBox jCheckBox1;
    protected javax.swing.JLabel jLImg;
    private javax.swing.JLayeredPane jLayeredPane1;
    protected javax.swing.JMenuItem jMAcerc;
    protected javax.swing.JMenuItem jMActivo;
    protected javax.swing.JMenu jMActivos;
    protected javax.swing.JMenuItem jMCXC;
    protected javax.swing.JMenuItem jMCXP;
    protected javax.swing.JMenuItem jMClasificacion;
    protected javax.swing.JMenuItem jMConcepNot;
    protected javax.swing.JMenuItem jMConcepPags;
    protected javax.swing.JMenuItem jMConfAd;
    protected javax.swing.JMenuItem jMDelLog;
    protected javax.swing.JMenuItem jMEstacs;
    protected javax.swing.JMenuItem jMFluj;
    protected javax.swing.JMenuItem jMICuentaContable;
    protected javax.swing.JMenuItem jMImpAlma;
    protected javax.swing.JMenuItem jMImpCliens;
    protected javax.swing.JMenuItem jMImpExistAlm;
    protected javax.swing.JMenuItem jMImpProvs;
    protected javax.swing.JMenu jMInven;
    protected javax.swing.JMenuItem jMInvenImpo;
    protected javax.swing.JMenuItem jMKard;
    protected javax.swing.JMenuItem jMLogProd;
    protected javax.swing.JMenu jMLogSis;
    protected javax.swing.JMenuItem jMLotPed;
    protected javax.swing.JMenu jMMAyu;
    protected javax.swing.JMenu jMMClas;
    protected javax.swing.JMenuItem jMMClien;
    protected javax.swing.JMenu jMMInvenImpor;
    protected javax.swing.JMenu jMMRep;
    protected javax.swing.JMenu jMMRepCom;
    protected javax.swing.JMenu jMMRepProd;
    protected javax.swing.JMenu jMMRepVta;
    protected javax.swing.JMenu jMMSis;
    protected javax.swing.JMenu jMMUbic;
    protected javax.swing.JMenu jMMUsr;
    protected javax.swing.JMenuItem jMModel;
    protected javax.swing.JMenuItem jMPrevioComp;
    protected javax.swing.JMenuItem jMRepCli;
    protected javax.swing.JMenuItem jMRepCom;
    protected javax.swing.JMenuItem jMRepCot;
    protected javax.swing.JMenuItem jMRepOr;
    protected javax.swing.JMenuItem jMRepProv;
    protected javax.swing.JMenuItem jMRepVend;
    protected javax.swing.JMenuItem jMResp;
    protected javax.swing.JMenuItem jMResponsable;
    protected javax.swing.JMenu jMSist;
    protected javax.swing.JMenuItem jMSucursal;
    protected javax.swing.JMenuItem jMTip;
    protected javax.swing.JMenuItem jMUbiAd;
    protected javax.swing.JMenuItem jMVLogSys;
    protected javax.swing.JMenuItem jMVProd;
    protected javax.swing.JMenuItem jMZon;
    protected javax.swing.JMenuItem jMeItImps;
    protected javax.swing.JMenu jMenBDs;
    protected javax.swing.JMenuBar jMenBar1;
    protected javax.swing.JMenuItem jMenCXCR;
    protected javax.swing.JMenuItem jMenCXP;
    protected javax.swing.JMenu jMenComps;
    protected javax.swing.JMenuItem jMenConfigFil;
    protected javax.swing.JMenuItem jMenCotsT;
    protected javax.swing.JMenu jMenInvents;
    protected javax.swing.JMenuItem jMenIt1;
    protected javax.swing.JMenuItem jMenIt4;
    protected javax.swing.JMenuItem jMenIt5;
    protected javax.swing.JMenuItem jMenItAlmas;
    protected javax.swing.JMenuItem jMenItCamEmp;
    protected javax.swing.JMenuItem jMenItCols;
    protected javax.swing.JMenuItem jMenItComps;
    protected javax.swing.JMenuItem jMenItConceps;
    protected javax.swing.JMenuItem jMenItDatsGenEmp;
    protected javax.swing.JMenuItem jMenItDefEstacs;
    protected javax.swing.JMenuItem jMenItDeslog;
    protected javax.swing.JMenuItem jMenItEstacs;
    protected javax.swing.JMenuItem jMenItFabs;
    protected javax.swing.JMenuItem jMenItImpres;
    protected javax.swing.JMenuItem jMenItIngr;
    protected javax.swing.JMenuItem jMenItKits;
    protected javax.swing.JMenuItem jMenItLogCorr;
    protected javax.swing.JMenuItem jMenItLogear;
    protected javax.swing.JMenuItem jMenItLugs;
    protected javax.swing.JMenuItem jMenItManProvs;
    protected javax.swing.JMenuItem jMenItMarcs;
    protected javax.swing.JMenuItem jMenItMeds;
    protected javax.swing.JMenuItem jMenItMons;
    protected javax.swing.JMenuItem jMenItPermEstacs;
    protected javax.swing.JMenuItem jMenItPesos;
    protected javax.swing.JMenuItem jMenItProdsArrMax;
    protected javax.swing.JMenuItem jMenItProdsBajMin;
    protected javax.swing.JMenuItem jMenItSal;
    protected javax.swing.JMenuItem jMenItTipsPags;
    protected javax.swing.JMenuItem jMenItTouch;
    protected javax.swing.JMenuItem jMenItTraspas;
    protected javax.swing.JMenuItem jMenItUnids;
    protected javax.swing.JMenuItem jMenItVtas;
    protected javax.swing.JMenu jMenLogin;
    protected javax.swing.JMenu jMenLogs;
    protected javax.swing.JMenu jMenMaxsMins;
    protected javax.swing.JMenuItem jMenProds;
    protected javax.swing.JMenu jMenTraspas;
    protected javax.swing.JMenu jMenVtas;
    protected javax.swing.JMenuItem jMenVtasR;
    protected javax.swing.JMenu jMenu1;
    protected javax.swing.JMenu jMenu2;
    protected javax.swing.JMenu jMenu3;
    protected javax.swing.JMenu jMenu5;
    protected javax.swing.JMenuBar jMenuBar1;
    protected javax.swing.JMenuItem jMenuItem3;
    protected javax.swing.JMenuItem jMenuItem4;
    protected javax.swing.JMenuItem jMenuItem5;
    protected javax.swing.JMenuItem jMenuItem6;
    protected javax.swing.JMenuItem jMenuItem7;
    protected javax.swing.JMenuItem jMenuItem9;
    protected javax.swing.JMenuItem jMenuItemPedidos;
    protected javax.swing.JMenuItem jMenuItemRemisiones;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
   
}

