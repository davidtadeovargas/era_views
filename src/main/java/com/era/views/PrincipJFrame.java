package com.era.views;

public class PrincipJFrame extends BaseJFrame {    
    
    public PrincipJFrame() {
        
        initComponents();                
        
        jMContra.setVisible(false);
        jMTabCompa.setVisible(false);
        jMenMaxsMins.setVisible(false);
        jMCosts.setVisible(false);
                                                                
        this.jMenCatGral.setVisible(false);
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
        jMUsr = new javax.swing.JMenuItem();
        jMenItPermEstacs = new javax.swing.JMenuItem();
        jMen2 = new javax.swing.JMenu();
        jMenItCambClavSeg = new javax.swing.JMenuItem();
        jMMAplic = new javax.swing.JMenu();
        jMCarpAp = new javax.swing.JMenuItem();
        jMCatMsj = new javax.swing.JMenuItem();
        jMMsj = new javax.swing.JMenuItem();
        jMChatC = new javax.swing.JMenuItem();
        jMChat = new javax.swing.JMenuItem();
        jMNotic = new javax.swing.JMenuItem();
        jMForLin = new javax.swing.JMenuItem();
        jMenLogs = new javax.swing.JMenu();
        jMenItLogCorr = new javax.swing.JMenuItem();
        jMLogRes = new javax.swing.JMenuItem();
        jMLogSis = new javax.swing.JMenu();
        jMVLogSys = new javax.swing.JMenuItem();
        jMDelLog = new javax.swing.JMenuItem();
        jMMLogR = new javax.swing.JMenu();
        jMLogProd = new javax.swing.JMenuItem();
        jMLogK = new javax.swing.JMenuItem();
        jMLogLin = new javax.swing.JMenuItem();
        jMLogMarc = new javax.swing.JMenuItem();
        jMLogFab = new javax.swing.JMenuItem();
        jMLogColo = new javax.swing.JMenuItem();
        jMLogClas = new javax.swing.JMenuItem();
        jMLogPes = new javax.swing.JMenuItem();
        jMLogMed = new javax.swing.JMenuItem();
        jMLogUnid = new javax.swing.JMenuItem();
        jMLogMon = new javax.swing.JMenuItem();
        jMLogImpu = new javax.swing.JMenuItem();
        jMLogConcep = new javax.swing.JMenuItem();
        jMLogAlma = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMLogLug = new javax.swing.JMenuItem();
        jMLogUbiE = new javax.swing.JMenuItem();
        jMLogMod = new javax.swing.JMenuItem();
        jMLogTall = new javax.swing.JMenuItem();
        jMLogTip = new javax.swing.JMenuItem();
        jMLogCatAct = new javax.swing.JMenuItem();
        jMLogActFij = new javax.swing.JMenuItem();
        jMLogCatGral = new javax.swing.JMenuItem();
        jMLogClasCli = new javax.swing.JMenuItem();
        jMLogClasProv = new javax.swing.JMenuItem();
        jMLogConcepNot = new javax.swing.JMenuItem();
        jMLogGara = new javax.swing.JMenuItem();
        jMLogGir = new javax.swing.JMenuItem();
        jMLogZon = new javax.swing.JMenuItem();
        jMLogConcepPags = new javax.swing.JMenuItem();
        jMenBDs = new javax.swing.JMenu();
        jMenItModBD = new javax.swing.JMenuItem();
        jMenConfigFil = new javax.swing.JMenuItem();
        jMMRep = new javax.swing.JMenu();
        jMEstacs = new javax.swing.JMenuItem();
        jMResp = new javax.swing.JMenuItem();
        jMRepLogCo = new javax.swing.JMenuItem();
        jMEstadisCor = new javax.swing.JMenuItem();
        jMMUtil = new javax.swing.JMenu();
        jMEnviA = new javax.swing.JMenuItem();
        jMArchC = new javax.swing.JMenuItem();
        jMCuade = new javax.swing.JMenuItem();
        jMApFav = new javax.swing.JMenuItem();
        jMCalc = new javax.swing.JMenuItem();
        jMEasCon = new javax.swing.JMenuItem();
        jMRevo = new javax.swing.JMenuItem();
        jMActSis = new javax.swing.JMenuItem();
        jMenItResps = new javax.swing.JMenuItem();
        jMenIActualizacion = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenItSal = new javax.swing.JMenuItem();
        jMenInvents = new javax.swing.JMenu();
        jMenComps = new javax.swing.JMenu();
        jMenItManProvs = new javax.swing.JMenuItem();
        jMClasProv = new javax.swing.JMenuItem();
        jMRubr = new javax.swing.JMenuItem();
        jMClasJerP = new javax.swing.JMenuItem();
        jMenItComps = new javax.swing.JMenuItem();
        jMCXP = new javax.swing.JMenuItem();
        jMContra = new javax.swing.JMenuItem();
        jMImpProvs = new javax.swing.JMenuItem();
        jMExpoProvs = new javax.swing.JMenuItem();
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
        jMTallCol = new javax.swing.JMenuItem();
        jMenuMarcMod = new javax.swing.JMenuItem();
        jMTabCompa = new javax.swing.JMenuItem();
        jMenItConceps = new javax.swing.JMenuItem();
        jMMInvenImpor = new javax.swing.JMenu();
        jMInvenImpo = new javax.swing.JMenuItem();
        jMInvenImpoSer = new javax.swing.JMenuItem();
        jMImpExistAlm = new javax.swing.JMenuItem();
        jMImpAlma = new javax.swing.JMenuItem();
        jMMInvenExpor = new javax.swing.JMenu();
        jMInvenExpor = new javax.swing.JMenuItem();
        jMExpoSer = new javax.swing.JMenuItem();
        jMExpExisAlm = new javax.swing.JMenuItem();
        jMExpAlma = new javax.swing.JMenuItem();
        jMMClas = new javax.swing.JMenu();
        jMenIt1 = new javax.swing.JMenuItem();
        jMTip = new javax.swing.JMenuItem();
        jMenItMarcs = new javax.swing.JMenuItem();
        jMenItFabs = new javax.swing.JMenuItem();
        jMenItCols = new javax.swing.JMenuItem();
        jMClasProd = new javax.swing.JMenuItem();
        jMJeraProd = new javax.swing.JMenuItem();
        jMenItPesos = new javax.swing.JMenuItem();
        jMenItMeds = new javax.swing.JMenuItem();
        jMenItUnids = new javax.swing.JMenuItem();
        jMModel = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
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
        jMCosts = new javax.swing.JMenuItem();
        jMenProds = new javax.swing.JMenuItem();
        jMKard = new javax.swing.JMenuItem();
        jMenVtas = new javax.swing.JMenu();
        jMMClien = new javax.swing.JMenuItem();
        jMClasCli = new javax.swing.JMenuItem();
        jMClasJer = new javax.swing.JMenuItem();
        jMenItVtas = new javax.swing.JMenuItem();
        jMenuItemRemisiones = new javax.swing.JMenuItem();
        jMenCotsT = new javax.swing.JMenuItem();
        jMenuItemPedidos = new javax.swing.JMenuItem();
        jMenItTipsPags = new javax.swing.JMenuItem();
        jMConcepPags = new javax.swing.JMenuItem();
        jMCXC = new javax.swing.JMenuItem();
        jMenCatGral = new javax.swing.JMenuItem();
        jMenItTouch = new javax.swing.JMenuItem();
        jMImpCliens = new javax.swing.JMenuItem();
        jMExpoCliens = new javax.swing.JMenuItem();
        jMMRepVta = new javax.swing.JMenu();
        jMRepCli = new javax.swing.JMenuItem();
        jMenVtasR = new javax.swing.JMenuItem();
        jMenCXCR = new javax.swing.JMenuItem();
        jMRepCot = new javax.swing.JMenuItem();
        jMRepVend = new javax.swing.JMenuItem();
        jMFluj = new javax.swing.JMenuItem();
        jMRepBackO = new javax.swing.JMenuItem();
        jMAsoc = new javax.swing.JMenuItem();
        jMActivos = new javax.swing.JMenu();
        jMZon = new javax.swing.JMenuItem();
        jMSucursal = new javax.swing.JMenuItem();
        jMClasificacion = new javax.swing.JMenuItem();
        jMResponsable = new javax.swing.JMenuItem();
        jMActivo = new javax.swing.JMenuItem();
        jMConta = new javax.swing.JMenu();
        jMActFij = new javax.swing.JMenuItem();
        jMCatActFij = new javax.swing.JMenuItem();
        jMTipAct = new javax.swing.JMenuItem();
        jMRepConta = new javax.swing.JMenuItem();
        jMConcepNot = new javax.swing.JMenuItem();
        jMFlujAct = new javax.swing.JMenuItem();
        jMCatGara = new javax.swing.JMenuItem();
        jMGir = new javax.swing.JMenuItem();
        jMenItMons = new javax.swing.JMenuItem();
        jMeItImps = new javax.swing.JMenuItem();
        jMICuentaContable = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMSist = new javax.swing.JMenu();
        jMenIt4 = new javax.swing.JMenuItem();
        jMenItDatsGenEmp = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenItImpres = new javax.swing.JMenuItem();
        jMenCambIco = new javax.swing.JMenuItem();
        jMConfAd = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
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

        jMUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/usrcon.png"))); // NOI18N
        jMUsr.setText("Usuarios conectados");
        jMUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUsrActionPerformed(evt);
            }
        });
        jMUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMUsrKeyPressed(evt);
            }
        });
        jMMUsr.add(jMUsr);

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

        jMen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/contra.png"))); // NOI18N
        jMen2.setMnemonic('l');
        jMen2.setText("Claves");
        jMen2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMen2KeyPressed(evt);
            }
        });

        jMenItCambClavSeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cambclav.png"))); // NOI18N
        jMenItCambClavSeg.setMnemonic('c');
        jMenItCambClavSeg.setText("Cambiar clave de seguridad");
        jMenItCambClavSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItCambClavSegActionPerformed(evt);
            }
        });
        jMenItCambClavSeg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItCambClavSegKeyPressed(evt);
            }
        });
        jMen2.add(jMenItCambClavSeg);

        jMMSis.add(jMen2);

        jMMAplic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aplica.png"))); // NOI18N
        jMMAplic.setMnemonic('a');
        jMMAplic.setText("Aplicación");
        jMMAplic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMAplicKeyPressed(evt);
            }
        });

        jMCarpAp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dirap.png"))); // NOI18N
        jMCarpAp.setMnemonic('c');
        jMCarpAp.setText("Directorio aplicación");
        jMCarpAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCarpApActionPerformed(evt);
            }
        });
        jMCarpAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCarpApKeyPressed(evt);
            }
        });
        jMMAplic.add(jMCarpAp);

        jMCatMsj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/catmens2.png"))); // NOI18N
        jMCatMsj.setText("Catálogo de mensajes");
        jMCatMsj.setToolTipText("a");
        jMCatMsj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCatMsjActionPerformed(evt);
            }
        });
        jMCatMsj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCatMsjKeyPressed(evt);
            }
        });
        jMMAplic.add(jMCatMsj);

        jMMsj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msjs.png"))); // NOI18N
        jMMsj.setMnemonic('m');
        jMMsj.setText("Mensajes");
        jMMsj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMsjActionPerformed(evt);
            }
        });
        jMMsj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMsjKeyPressed(evt);
            }
        });
        jMMAplic.add(jMMsj);

        jMChatC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/chatcorp.png"))); // NOI18N
        jMChatC.setMnemonic('h');
        jMChatC.setText("Easy message");
        jMChatC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMChatCActionPerformed(evt);
            }
        });
        jMChatC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMChatCKeyPressed(evt);
            }
        });
        jMMAplic.add(jMChatC);

        jMChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cht.png"))); // NOI18N
        jMChat.setMnemonic('t');
        jMChat.setText("Easy talk");
        jMChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMChatActionPerformed(evt);
            }
        });
        jMChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMChatKeyPressed(evt);
            }
        });
        jMMAplic.add(jMChat);

        jMNotic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/news.png"))); // NOI18N
        jMNotic.setText("Avisos y noticias");
        jMNotic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNoticActionPerformed(evt);
            }
        });
        jMNotic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMNoticKeyPressed(evt);
            }
        });
        jMMAplic.add(jMNotic);

        jMForLin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/forlin.png"))); // NOI18N
        jMForLin.setText("Foro en línea");
        jMForLin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMForLinActionPerformed(evt);
            }
        });
        jMForLin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMForLinKeyPressed(evt);
            }
        });
        jMMAplic.add(jMForLin);

        jMMSis.add(jMMAplic);

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

        jMLogRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logresp.png"))); // NOI18N
        jMLogRes.setMnemonic('r');
        jMLogRes.setText("Log respaldos");
        jMLogRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogResActionPerformed(evt);
            }
        });
        jMLogRes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogResKeyPressed(evt);
            }
        });
        jMenLogs.add(jMLogRes);

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

        jMMLogR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lograst.png"))); // NOI18N
        jMMLogR.setMnemonic('o');
        jMMLogR.setText("Logs rastreo");
        jMMLogR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMLogRKeyPressed(evt);
            }
        });

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
        jMMLogR.add(jMLogProd);

        jMLogK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogK.setMnemonic('o');
        jMLogK.setText("Log kits");
        jMLogK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogKActionPerformed(evt);
            }
        });
        jMLogK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogKKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogK);

        jMLogLin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogLin.setMnemonic('o');
        jMLogLin.setText("Log líneas");
        jMLogLin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogLinActionPerformed(evt);
            }
        });
        jMLogLin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogLinKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogLin);

        jMLogMarc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogMarc.setMnemonic('m');
        jMLogMarc.setText("Log marcas");
        jMLogMarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogMarcActionPerformed(evt);
            }
        });
        jMLogMarc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogMarcKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogMarc);

        jMLogFab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogFab.setMnemonic('f');
        jMLogFab.setText("Log fabricantes");
        jMLogFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogFabActionPerformed(evt);
            }
        });
        jMLogFab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogFabKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogFab);

        jMLogColo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogColo.setMnemonic('c');
        jMLogColo.setText("Log colores");
        jMLogColo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogColoActionPerformed(evt);
            }
        });
        jMLogColo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogColoKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogColo);

        jMLogClas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogClas.setMnemonic('a');
        jMLogClas.setText("Log clasificación extra productos");
        jMLogClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogClasActionPerformed(evt);
            }
        });
        jMLogClas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogClasKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogClas);

        jMLogPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogPes.setMnemonic('p');
        jMLogPes.setText("Log pesos");
        jMLogPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogPesActionPerformed(evt);
            }
        });
        jMLogPes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogPesKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogPes);

        jMLogMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogMed.setMnemonic('m');
        jMLogMed.setText("Log medidas");
        jMLogMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogMedActionPerformed(evt);
            }
        });
        jMLogMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogMedKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogMed);

        jMLogUnid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogUnid.setMnemonic('u');
        jMLogUnid.setText("Log unidades");
        jMLogUnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogUnidActionPerformed(evt);
            }
        });
        jMLogUnid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogUnidKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogUnid);

        jMLogMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogMon.setMnemonic('m');
        jMLogMon.setText("Log monedas");
        jMLogMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogMonActionPerformed(evt);
            }
        });
        jMLogMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogMonKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogMon);

        jMLogImpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogImpu.setMnemonic('i');
        jMLogImpu.setText("Log impuestos");
        jMLogImpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogImpuActionPerformed(evt);
            }
        });
        jMLogImpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogImpuKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogImpu);

        jMLogConcep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogConcep.setMnemonic('o');
        jMLogConcep.setText("Log conceptos");
        jMLogConcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogConcepActionPerformed(evt);
            }
        });
        jMLogConcep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogConcepKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogConcep);

        jMLogAlma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogAlma.setMnemonic('l');
        jMLogAlma.setText("Log almacenes");
        jMLogAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogAlmaActionPerformed(evt);
            }
        });
        jMLogAlma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogAlmaKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogAlma);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMenuItem1.setMnemonic('q');
        jMenuItem1.setText("Log anaqueles");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });
        jMMLogR.add(jMenuItem1);

        jMLogLug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogLug.setMnemonic('g');
        jMLogLug.setText("Log lugares");
        jMLogLug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogLugActionPerformed(evt);
            }
        });
        jMLogLug.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogLugKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogLug);

        jMLogUbiE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogUbiE.setMnemonic('c');
        jMLogUbiE.setText("Log ubicaciones extra");
        jMLogUbiE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogUbiEActionPerformed(evt);
            }
        });
        jMLogUbiE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogUbiEKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogUbiE);

        jMLogMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogMod.setMnemonic('o');
        jMLogMod.setText("Log modelos");
        jMLogMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogModActionPerformed(evt);
            }
        });
        jMLogMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogModKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogMod);

        jMLogTall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogTall.setMnemonic('l');
        jMLogTall.setText("Log tallas");
        jMLogTall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogTallActionPerformed(evt);
            }
        });
        jMLogTall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogTallKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogTall);

        jMLogTip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogTip.setText("Log tipos");
        jMLogTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogTipActionPerformed(evt);
            }
        });
        jMLogTip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogTipKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogTip);

        jMLogCatAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogCatAct.setText("Log catálogo activo fijo");
        jMLogCatAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogCatActActionPerformed(evt);
            }
        });
        jMLogCatAct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogCatActKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogCatAct);

        jMLogActFij.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogActFij.setText("Log tipo activo fijo");
        jMLogActFij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogActFijActionPerformed(evt);
            }
        });
        jMLogActFij.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogActFijKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogActFij);

        jMLogCatGral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogCatGral.setText("Log catálogo general");
        jMLogCatGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogCatGralActionPerformed(evt);
            }
        });
        jMLogCatGral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogCatGralKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogCatGral);

        jMLogClasCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogClasCli.setText("Log clasificación clientes");
        jMLogClasCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogClasCliActionPerformed(evt);
            }
        });
        jMLogClasCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogClasCliKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogClasCli);

        jMLogClasProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogClasProv.setText("Log clasificación proveedores");
        jMLogClasProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogClasProvActionPerformed(evt);
            }
        });
        jMLogClasProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogClasProvKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogClasProv);

        jMLogConcepNot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogConcepNot.setText("Log conceptos nota de crédito");
        jMLogConcepNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogConcepNotActionPerformed(evt);
            }
        });
        jMLogConcepNot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogConcepNotKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogConcepNot);

        jMLogGara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogGara.setText("Log garantías");
        jMLogGara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogGaraActionPerformed(evt);
            }
        });
        jMLogGara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogGaraKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogGara);

        jMLogGir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogGir.setText("Log giros");
        jMLogGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogGirActionPerformed(evt);
            }
        });
        jMLogGir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogGirKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogGir);

        jMLogZon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogZon.setText("Log zonas");
        jMLogZon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogZonActionPerformed(evt);
            }
        });
        jMLogZon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogZonKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogZon);

        jMLogConcepPags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogConcepPags.setText("Log concepto pagos");
        jMLogConcepPags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogConcepPagsActionPerformed(evt);
            }
        });
        jMLogConcepPags.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMLogConcepPagsKeyPressed(evt);
            }
        });
        jMMLogR.add(jMLogConcepPags);

        jMenLogs.add(jMMLogR);

        jMMSis.add(jMenLogs);

        jMenBDs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/basdats.png"))); // NOI18N
        jMenBDs.setMnemonic('b');
        jMenBDs.setText("Base de datos");
        jMenBDs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenBDsKeyPressed(evt);
            }
        });

        jMenItModBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/conect.png"))); // NOI18N
        jMenItModBD.setMnemonic('m');
        jMenItModBD.setText("Conexiones a bases de datos");
        jMenItModBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItModBDActionPerformed(evt);
            }
        });
        jMenItModBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItModBDKeyPressed(evt);
            }
        });
        jMenBDs.add(jMenItModBD);

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

        jMRepLogCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/replogcor.png"))); // NOI18N
        jMRepLogCo.setMnemonic('l');
        jMRepLogCo.setText("Log correos");
        jMRepLogCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepLogCoActionPerformed(evt);
            }
        });
        jMRepLogCo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepLogCoKeyPressed(evt);
            }
        });
        jMMRep.add(jMRepLogCo);

        jMEstadisCor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/replogcor.png"))); // NOI18N
        jMEstadisCor.setText("Estadísticas de correo");
        jMEstadisCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEstadisCorActionPerformed(evt);
            }
        });
        jMEstadisCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMEstadisCorKeyPressed(evt);
            }
        });
        jMMRep.add(jMEstadisCor);

        jMMSis.add(jMMRep);

        jMMUtil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/util.png"))); // NOI18N
        jMMUtil.setText("Utilerías");
        jMMUtil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMUtilKeyPressed(evt);
            }
        });

        jMEnviA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/env.png"))); // NOI18N
        jMEnviA.setMnemonic('e');
        jMEnviA.setText("Enviar/Descargar archivo(s)");
        jMEnviA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEnviAActionPerformed(evt);
            }
        });
        jMEnviA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMEnviAKeyPressed(evt);
            }
        });
        jMMUtil.add(jMEnviA);

        jMArchC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/archcomp.png"))); // NOI18N
        jMArchC.setMnemonic('h');
        jMArchC.setText("Easy drive");
        jMArchC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMArchCActionPerformed(evt);
            }
        });
        jMArchC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMArchCKeyPressed(evt);
            }
        });
        jMMUtil.add(jMArchC);

        jMCuade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cuade.png"))); // NOI18N
        jMCuade.setMnemonic('u');
        jMCuade.setText("Cuaderno");
        jMCuade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCuadeActionPerformed(evt);
            }
        });
        jMCuade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCuadeKeyPressed(evt);
            }
        });
        jMMUtil.add(jMCuade);

        jMApFav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/apfav.png"))); // NOI18N
        jMApFav.setMnemonic('a');
        jMApFav.setText("Aplicación favorita");
        jMApFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMApFavActionPerformed(evt);
            }
        });
        jMApFav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMApFavKeyPressed(evt);
            }
        });
        jMMUtil.add(jMApFav);

        jMCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calc.png"))); // NOI18N
        jMCalc.setMnemonic('c');
        jMCalc.setText("Calculadora");
        jMCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCalcActionPerformed(evt);
            }
        });
        jMCalc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCalcKeyPressed(evt);
            }
        });
        jMMUtil.add(jMCalc);

        jMEasCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/easyconve.png"))); // NOI18N
        jMEasCon.setText("Easy convertidor");
        jMEasCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEasConActionPerformed(evt);
            }
        });
        jMEasCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMEasConKeyPressed(evt);
            }
        });
        jMMUtil.add(jMEasCon);

        jMMSis.add(jMMUtil);

        jMRevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/revosis.png"))); // NOI18N
        jMRevo.setText("Revocación");
        jMRevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRevoActionPerformed(evt);
            }
        });
        jMRevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRevoKeyPressed(evt);
            }
        });
        jMMSis.add(jMRevo);

        jMActSis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actsis.png"))); // NOI18N
        jMActSis.setText("Activar sistema");
        jMActSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMActSisActionPerformed(evt);
            }
        });
        jMActSis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMActSisKeyPressed(evt);
            }
        });
        jMMSis.add(jMActSis);

        jMenItResps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/respal.png"))); // NOI18N
        jMenItResps.setMnemonic('s');
        jMenItResps.setText("Respaldos");
        jMenItResps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItRespsActionPerformed(evt);
            }
        });
        jMenItResps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenItRespsKeyPressed(evt);
            }
        });
        jMMSis.add(jMenItResps);

        jMenIActualizacion.setText("Actualización");
        jMMSis.add(jMenIActualizacion);

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

        jMClasProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasifs.png"))); // NOI18N
        jMClasProv.setMnemonic('l');
        jMClasProv.setText("Clasificaciones proveedores");
        jMClasProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClasProvActionPerformed(evt);
            }
        });
        jMClasProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMClasProvKeyPressed(evt);
            }
        });
        jMenComps.add(jMClasProv);

        jMRubr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasrub.png"))); // NOI18N
        jMRubr.setText("Clasificaciones rubro");
        jMRubr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRubrActionPerformed(evt);
            }
        });
        jMRubr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRubrKeyPressed(evt);
            }
        });
        jMenComps.add(jMRubr);

        jMClasJerP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasjeraprov.png"))); // NOI18N
        jMClasJerP.setText("Clasificaciones jerárquicas");
        jMClasJerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClasJerPActionPerformed(evt);
            }
        });
        jMClasJerP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMClasJerPKeyPressed(evt);
            }
        });
        jMenComps.add(jMClasJerP);

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

        jMContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/contracu.png"))); // NOI18N
        jMContra.setMnemonic('c');
        jMContra.setText("Contra recibos");
        jMContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMContraActionPerformed(evt);
            }
        });
        jMContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMContraKeyPressed(evt);
            }
        });
        jMenComps.add(jMContra);

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

        jMExpoProvs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/expexe.png"))); // NOI18N
        jMExpoProvs.setText("Exportar catálogo de proveedores a excel");
        jMExpoProvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExpoProvsActionPerformed(evt);
            }
        });
        jMExpoProvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMExpoProvsKeyPressed(evt);
            }
        });
        jMenComps.add(jMExpoProvs);

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

        jMTallCol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tallcol.png"))); // NOI18N
        jMTallCol.setMnemonic('t');
        jMTallCol.setText("Tallas y colores");
        jMTallCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMTallColActionPerformed(evt);
            }
        });
        jMTallCol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMTallColKeyPressed(evt);
            }
        });
        jMInven.add(jMTallCol);

        jMenuMarcMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/modmarc.png"))); // NOI18N
        jMenuMarcMod.setText("Marcas y modelos");
        jMenuMarcMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMarcModActionPerformed(evt);
            }
        });
        jMenuMarcMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuMarcModKeyPressed(evt);
            }
        });
        jMInven.add(jMenuMarcMod);

        jMTabCompa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tabcompa.png"))); // NOI18N
        jMTabCompa.setMnemonic('v');
        jMTabCompa.setText("Ver tabla de compatibilidades");
        jMTabCompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMTabCompaActionPerformed(evt);
            }
        });
        jMTabCompa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMTabCompaKeyPressed(evt);
            }
        });
        jMInven.add(jMTabCompa);

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

        jMInvenImpoSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impcatser.png"))); // NOI18N
        jMInvenImpoSer.setMnemonic('m');
        jMInvenImpoSer.setText("Importar catálogo de series y comentarios por producto");
        jMInvenImpoSer.setToolTipText("");
        jMInvenImpoSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInvenImpoSerActionPerformed(evt);
            }
        });
        jMInvenImpoSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMInvenImpoSerKeyPressed(evt);
            }
        });
        jMMInvenImpor.add(jMInvenImpoSer);

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

        jMMInvenExpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/export.png"))); // NOI18N
        jMMInvenExpor.setText("Exportaciones");
        jMMInvenExpor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMMInvenExporKeyPressed(evt);
            }
        });

        jMInvenExpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/expexe.png"))); // NOI18N
        jMInvenExpor.setText("Exportar catálogo de productos a excel");
        jMInvenExpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInvenExporActionPerformed(evt);
            }
        });
        jMInvenExpor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMInvenExporKeyPressed(evt);
            }
        });
        jMMInvenExpor.add(jMInvenExpor);

        jMExpoSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/expexe.png"))); // NOI18N
        jMExpoSer.setMnemonic('S');
        jMExpoSer.setText("Exportar series por producto a excel");
        jMExpoSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExpoSerActionPerformed(evt);
            }
        });
        jMExpoSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMExpoSerKeyPressed(evt);
            }
        });
        jMMInvenExpor.add(jMExpoSer);

        jMExpExisAlm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/expexe.png"))); // NOI18N
        jMExpExisAlm.setMnemonic('E');
        jMExpExisAlm.setText("Exportar existencias por almacén a excel");
        jMExpExisAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExpExisAlmActionPerformed(evt);
            }
        });
        jMExpExisAlm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMExpExisAlmKeyPressed(evt);
            }
        });
        jMMInvenExpor.add(jMExpExisAlm);

        jMExpAlma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/expexe.png"))); // NOI18N
        jMExpAlma.setMnemonic('X');
        jMExpAlma.setText("Exportar almacenes a excel");
        jMExpAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExpAlmaActionPerformed(evt);
            }
        });
        jMExpAlma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMExpAlmaKeyPressed(evt);
            }
        });
        jMMInvenExpor.add(jMExpAlma);

        jMInven.add(jMMInvenExpor);

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

        jMClasProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasext.png"))); // NOI18N
        jMClasProd.setMnemonic('c');
        jMClasProd.setText("Clasificación extra");
        jMClasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClasProdActionPerformed(evt);
            }
        });
        jMClasProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMClasProdKeyPressed(evt);
            }
        });
        jMMClas.add(jMClasProd);

        jMJeraProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasjeraprod.png"))); // NOI18N
        jMJeraProd.setText("Clasificaciones jerárquicas");
        jMJeraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMJeraProdActionPerformed(evt);
            }
        });
        jMJeraProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMJeraProdKeyPressed(evt);
            }
        });
        jMMClas.add(jMJeraProd);

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

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tall.png"))); // NOI18N
        jMenuItem2.setMnemonic('t');
        jMenuItem2.setText("Tallas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuItem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem2KeyPressed(evt);
            }
        });
        jMMClas.add(jMenuItem2);

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

        jMCosts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rptcost.png"))); // NOI18N
        jMCosts.setMnemonic('t');
        jMCosts.setText("Costeos");
        jMCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCostsActionPerformed(evt);
            }
        });
        jMCosts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCostsKeyPressed(evt);
            }
        });
        jMMRepProd.add(jMCosts);

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

        jMClasCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasifs.png"))); // NOI18N
        jMClasCli.setMnemonic('l');
        jMClasCli.setText("Clasificaciones clientes");
        jMClasCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClasCliActionPerformed(evt);
            }
        });
        jMClasCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMClasCliKeyPressed(evt);
            }
        });
        jMenVtas.add(jMClasCli);

        jMClasJer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clasjeracli.png"))); // NOI18N
        jMClasJer.setMnemonic('j');
        jMClasJer.setText("Clasificaciones jerárquicas");
        jMClasJer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClasJerActionPerformed(evt);
            }
        });
        jMClasJer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMClasJerKeyPressed(evt);
            }
        });
        jMenVtas.add(jMClasJer);

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

        jMenCatGral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/catgral.png"))); // NOI18N
        jMenCatGral.setMnemonic('a');
        jMenCatGral.setText("Catálogo general");
        jMenCatGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenCatGralActionPerformed(evt);
            }
        });
        jMenCatGral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenCatGralKeyPressed(evt);
            }
        });
        jMenVtas.add(jMenCatGral);

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

        jMExpoCliens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/expexe.png"))); // NOI18N
        jMExpoCliens.setMnemonic('e');
        jMExpoCliens.setText("Exportar catálogo de clientes desde excel");
        jMExpoCliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExpoCliensActionPerformed(evt);
            }
        });
        jMExpoCliens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMExpoCliensKeyPressed(evt);
            }
        });
        jMenVtas.add(jMExpoCliens);

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

        jMRepBackO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repback.png"))); // NOI18N
        jMRepBackO.setText("Backorder");
        jMRepBackO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepBackOActionPerformed(evt);
            }
        });
        jMRepBackO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepBackOKeyPressed(evt);
            }
        });
        jMMRepVta.add(jMRepBackO);

        jMenVtas.add(jMMRepVta);

        jMAsoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/asocprodcli.png"))); // NOI18N
        jMAsoc.setMnemonic('a');
        jMAsoc.setText("Reglas de negocio");
        jMAsoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAsocActionPerformed(evt);
            }
        });
        jMAsoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMAsocKeyPressed(evt);
            }
        });
        jMenVtas.add(jMAsoc);

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

        jMConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/conta.png"))); // NOI18N
        jMConta.setMnemonic('c');
        jMConta.setText("Contabilidad");
        jMConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMContaKeyPressed(evt);
            }
        });

        jMActFij.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actfij.png"))); // NOI18N
        jMActFij.setMnemonic('a');
        jMActFij.setText("Activo fijo");
        jMActFij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMActFijActionPerformed(evt);
            }
        });
        jMActFij.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMActFijKeyPressed(evt);
            }
        });
        jMConta.add(jMActFij);

        jMCatActFij.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/catactfij.png"))); // NOI18N
        jMCatActFij.setMnemonic('c');
        jMCatActFij.setText("Catálogo activo fijo");
        jMCatActFij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCatActFijActionPerformed(evt);
            }
        });
        jMCatActFij.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCatActFijKeyPressed(evt);
            }
        });
        jMConta.add(jMCatActFij);

        jMTipAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/catactfij.png"))); // NOI18N
        jMTipAct.setMnemonic('t');
        jMTipAct.setText("Catálogo de tipos de activo fijo");
        jMTipAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMTipActActionPerformed(evt);
            }
        });
        jMTipAct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMTipActKeyPressed(evt);
            }
        });
        jMConta.add(jMTipAct);

        jMRepConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/repcots.png"))); // NOI18N
        jMRepConta.setMnemonic('r');
        jMRepConta.setText("Reportes");
        jMRepConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRepContaActionPerformed(evt);
            }
        });
        jMRepConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMRepContaKeyPressed(evt);
            }
        });
        jMConta.add(jMRepConta);

        jMenInvents.add(jMConta);

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

        jMFlujAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/flujact.png"))); // NOI18N
        jMFlujAct.setText("Flujo actividades");
        jMFlujAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFlujActActionPerformed(evt);
            }
        });
        jMFlujAct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMFlujActKeyPressed(evt);
            }
        });
        jMenInvents.add(jMFlujAct);

        jMCatGara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/catgara.png"))); // NOI18N
        jMCatGara.setText("Catálogo garantías");
        jMCatGara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCatGaraActionPerformed(evt);
            }
        });
        jMCatGara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCatGaraKeyPressed(evt);
            }
        });
        jMenInvents.add(jMCatGara);

        jMGir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/gir.png"))); // NOI18N
        jMGir.setMnemonic('g');
        jMGir.setText("Giros");
        jMGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGirActionPerformed(evt);
            }
        });
        jMGir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMGirKeyPressed(evt);
            }
        });
        jMenInvents.add(jMGir);

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

        jMenCambIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cambico.png"))); // NOI18N
        jMenCambIco.setMnemonic('p');
        jMenCambIco.setText("Cambiar icono aplicación");
        jMenCambIco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenCambIcoActionPerformed(evt);
            }
        });
        jMenCambIco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenCambIcoKeyPressed(evt);
            }
        });
        jMSist.add(jMenCambIco);

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

        jMenu4.setText("Sincronizar");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenBar1.add(jMenu4);

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
    
    private void jMenItCambClavSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItCambClavSegActionPerformed
                               
    }//GEN-LAST:event_jMenItCambClavSegActionPerformed
                
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
        
    private void jMen2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMen2KeyPressed
                    
    }//GEN-LAST:event_jMen2KeyPressed
           
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
        
    private void jMenItCambClavSegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItCambClavSegKeyPressed
                        
    }//GEN-LAST:event_jMenItCambClavSegKeyPressed
        
    private void jMenBDsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenBDsKeyPressed
               
    }//GEN-LAST:event_jMenBDsKeyPressed
        
    private void jMenItSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItSalKeyPressed
    
    }//GEN-LAST:event_jMenItSalKeyPressed
        
    private void jMenItSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItSalActionPerformed
                
    }//GEN-LAST:event_jMenItSalActionPerformed
        
    private void jMenItModBDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItModBDKeyPressed
    
    }//GEN-LAST:event_jMenItModBDKeyPressed
    
    private void jMenItModBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItModBDActionPerformed
    
    }//GEN-LAST:event_jMenItModBDActionPerformed
        
    private void jMenItRespsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenItRespsKeyPressed
                
    }//GEN-LAST:event_jMenItRespsKeyPressed
        
    private void jMenItRespsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItRespsActionPerformed
                        
    }//GEN-LAST:event_jMenItRespsActionPerformed
                
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

    
    private void jMenCambIcoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenCambIcoKeyPressed
            
        
    }//GEN-LAST:event_jMenCambIcoKeyPressed

        
    private void jMenCambIcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenCambIcoActionPerformed
        
    }//GEN-LAST:event_jMenCambIcoActionPerformed

                
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
        
    private void jMContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMContraKeyPressed
                    
    }//GEN-LAST:event_jMContraKeyPressed
    
    private void jMContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMContraActionPerformed
                     
    }//GEN-LAST:event_jMContraActionPerformed
        
    private void jMenConfigFilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenConfigFilKeyPressed
               
    }//GEN-LAST:event_jMenConfigFilKeyPressed

        
    private void jMenConfigFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenConfigFilActionPerformed
                     
    }//GEN-LAST:event_jMenConfigFilActionPerformed
            
    private void jMenCatGralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenCatGralKeyPressed
                        
    }//GEN-LAST:event_jMenCatGralKeyPressed

        
    private void jMenCatGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenCatGralActionPerformed
               
    }//GEN-LAST:event_jMenCatGralActionPerformed

        
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

        
    private void jMClasProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMClasProdKeyPressed
                
    }//GEN-LAST:event_jMClasProdKeyPressed

        
    private void jMClasProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClasProdActionPerformed
             
        
    }//GEN-LAST:event_jMClasProdActionPerformed

        
    private void jMUbiAdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMUbiAdKeyPressed
            
        
    }//GEN-LAST:event_jMUbiAdKeyPressed

        
    private void jMUbiAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUbiAdActionPerformed
             
    }//GEN-LAST:event_jMUbiAdActionPerformed

        
    private void jMSistKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMSistKeyPressed
        
        
    }//GEN-LAST:event_jMSistKeyPressed

        
    private void jMMUsrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMUsrKeyPressed
                
    }//GEN-LAST:event_jMMUsrKeyPressed

    
    private void jMUsrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMUsrKeyPressed
                
    }//GEN-LAST:event_jMUsrKeyPressed

        
    private void jMUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUsrActionPerformed
        
        
    }//GEN-LAST:event_jMUsrActionPerformed

    
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

        
    private void jMMLogRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMLogRKeyPressed
                
    }//GEN-LAST:event_jMMLogRKeyPressed

        
    private void jMLogKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogKKeyPressed
            
    }//GEN-LAST:event_jMLogKKeyPressed

        
    private void jMLogKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogKActionPerformed
                
    }//GEN-LAST:event_jMLogKActionPerformed

        
    private void jMLogLinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogLinKeyPressed
            
        
    }//GEN-LAST:event_jMLogLinKeyPressed

        
    private void jMLogLinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogLinActionPerformed
               
    }//GEN-LAST:event_jMLogLinActionPerformed

        
    private void jMLogMarcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogMarcKeyPressed
            
        
    }//GEN-LAST:event_jMLogMarcKeyPressed

        
    private void jMLogMarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogMarcActionPerformed
             
        
    }//GEN-LAST:event_jMLogMarcActionPerformed

        
    private void jMLogFabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogFabKeyPressed
                
    }//GEN-LAST:event_jMLogFabKeyPressed

        
    private void jMLogFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogFabActionPerformed
        
        
    }//GEN-LAST:event_jMLogFabActionPerformed

        
    private void jMLogColoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogColoKeyPressed
            
        
    }//GEN-LAST:event_jMLogColoKeyPressed

        
    private void jMLogColoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogColoActionPerformed
                        
        
    }//GEN-LAST:event_jMLogColoActionPerformed

        
    private void jMLogClasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogClasKeyPressed
           
        
    }//GEN-LAST:event_jMLogClasKeyPressed

        
    private void jMLogClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogClasActionPerformed
                
        
    }//GEN-LAST:event_jMLogClasActionPerformed

        
    private void jMLogPesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogPesKeyPressed
        
        
    }//GEN-LAST:event_jMLogPesKeyPressed

        
    private void jMLogPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogPesActionPerformed
                
        
    }//GEN-LAST:event_jMLogPesActionPerformed

        
    private void jMLogMedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogMedKeyPressed
            
        
    }//GEN-LAST:event_jMLogMedKeyPressed

    
    private void jMLogMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogMedActionPerformed
        
        
        
    }//GEN-LAST:event_jMLogMedActionPerformed

        
    private void jMLogUnidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogUnidKeyPressed
                
    }//GEN-LAST:event_jMLogUnidKeyPressed

        
    private void jMLogUnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogUnidActionPerformed
        
        
    }//GEN-LAST:event_jMLogUnidActionPerformed

        
    private void jMLogMonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogMonKeyPressed
        
        
    }//GEN-LAST:event_jMLogMonKeyPressed

        
    private void jMLogMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogMonActionPerformed
        
        
    }//GEN-LAST:event_jMLogMonActionPerformed

        
    private void jMLogImpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogImpuActionPerformed
                
        
    }//GEN-LAST:event_jMLogImpuActionPerformed

        
    private void jMLogImpuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogImpuKeyPressed
        
        
    }//GEN-LAST:event_jMLogImpuKeyPressed

        
    private void jMLogConcepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogConcepKeyPressed
        
        
    }//GEN-LAST:event_jMLogConcepKeyPressed

        
    private void jMLogConcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogConcepActionPerformed
        
        
    }//GEN-LAST:event_jMLogConcepActionPerformed

        
    private void jMLogAlmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogAlmaKeyPressed
        
        
    }//GEN-LAST:event_jMLogAlmaKeyPressed

        
    private void jMLogAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogAlmaActionPerformed
        
        
    }//GEN-LAST:event_jMLogAlmaActionPerformed

        
    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        
        
    }//GEN-LAST:event_jMenuItem1KeyPressed

        
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

        
    private void jMLogLugKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogLugKeyPressed
        
        
    }//GEN-LAST:event_jMLogLugKeyPressed

        
    private void jMLogLugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogLugActionPerformed
        
        
    }//GEN-LAST:event_jMLogLugActionPerformed

        
    private void jMLogUbiEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogUbiEKeyPressed
        
        
    }//GEN-LAST:event_jMLogUbiEKeyPressed

        
    private void jMLogUbiEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogUbiEActionPerformed
        
        
    }//GEN-LAST:event_jMLogUbiEActionPerformed

       
    private void jMMAplicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMAplicKeyPressed
        
        
    }//GEN-LAST:event_jMMAplicKeyPressed
    

    private void jMCarpApKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCarpApKeyPressed
        
        
    }//GEN-LAST:event_jMCarpApKeyPressed

    
    private void jMCarpApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCarpApActionPerformed
               
        
    }//GEN-LAST:event_jMCarpApActionPerformed

        
    private void jMRepCotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepCotKeyPressed
        
        
    }//GEN-LAST:event_jMRepCotKeyPressed

        
    private void jMRepCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepCotActionPerformed
        
        
    }//GEN-LAST:event_jMRepCotActionPerformed

        
    private void jMCatMsjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCatMsjKeyPressed
        
        
    }//GEN-LAST:event_jMCatMsjKeyPressed

        
    private void jMCatMsjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCatMsjActionPerformed
                
        
    }//GEN-LAST:event_jMCatMsjActionPerformed

        
    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
        
    }//GEN-LAST:event_formWindowStateChanged

        
    private void jMMsjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMsjKeyPressed
                
        
    }//GEN-LAST:event_jMMsjKeyPressed

        
    private void jMMsjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMsjActionPerformed
        
        
    }//GEN-LAST:event_jMMsjActionPerformed

        
    private void jMChatCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMChatCKeyPressed
                   
        
    }//GEN-LAST:event_jMChatCKeyPressed

        
    private void jMChatCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMChatCActionPerformed
        
        
    }//GEN-LAST:event_jMChatCActionPerformed

        
    private void jMChatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMChatKeyPressed
        
        
    }//GEN-LAST:event_jMChatKeyPressed

        
    private void jMChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMChatActionPerformed
                       
    }//GEN-LAST:event_jMChatActionPerformed

            
    private void jMCalcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCalcKeyPressed
        
        
    }//GEN-LAST:event_jMCalcKeyPressed

        
    private void jMCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCalcActionPerformed
        
        
    }//GEN-LAST:event_jMCalcActionPerformed

        
    private void jMCuadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCuadeKeyPressed
        
        
    }//GEN-LAST:event_jMCuadeKeyPressed

        
    private void jMApFavKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMApFavKeyPressed
        
        
    }//GEN-LAST:event_jMApFavKeyPressed

    
    
    private void jMCuadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCuadeActionPerformed
            
        
    }//GEN-LAST:event_jMCuadeActionPerformed

        
    private void jMApFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMApFavActionPerformed
            
        
    }//GEN-LAST:event_jMApFavActionPerformed

        
    private void jMEnviAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMEnviAKeyPressed
        
        
    }//GEN-LAST:event_jMEnviAKeyPressed

    
    private void jMEnviAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEnviAActionPerformed
    
        
    }//GEN-LAST:event_jMEnviAActionPerformed

    
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

       
    private void jMArchCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMArchCKeyPressed
        
        
    }//GEN-LAST:event_jMArchCKeyPressed

        
    private void jMArchCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMArchCActionPerformed
        
    }//GEN-LAST:event_jMArchCActionPerformed

        
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

        
    private void jMCostsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCostsKeyPressed
        
        
    }//GEN-LAST:event_jMCostsKeyPressed

       
    private void jMCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCostsActionPerformed
        
     
        
    }//GEN-LAST:event_jMCostsActionPerformed

        
    private void jMLogResKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogResKeyPressed
        
        
    }//GEN-LAST:event_jMLogResKeyPressed

        
    private void jMLogResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogResActionPerformed
        
        
    }//GEN-LAST:event_jMLogResActionPerformed

        
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
        
    
    private void jMClasCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClasCliActionPerformed
                
        
    }//GEN-LAST:event_jMClasCliActionPerformed

        
    private void jMClasCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMClasCliKeyPressed
        
        
    }//GEN-LAST:event_jMClasCliKeyPressed

        
    private void jMClasProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMClasProvKeyPressed
        
        
    }//GEN-LAST:event_jMClasProvKeyPressed

        
    private void jMClasProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClasProvActionPerformed
        
        
    }//GEN-LAST:event_jMClasProvActionPerformed

        
    private void jMRepLogCoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepLogCoKeyPressed
        
        
    }//GEN-LAST:event_jMRepLogCoKeyPressed

        
    private void jMRepLogCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepLogCoActionPerformed
        
        
    }//GEN-LAST:event_jMRepLogCoActionPerformed

        
    private void jMModelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMModelKeyPressed
        
        
    }//GEN-LAST:event_jMModelKeyPressed

        
    private void jMModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMModelActionPerformed
        
        
    }//GEN-LAST:event_jMModelActionPerformed

        
    private void jMTabCompaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMTabCompaKeyPressed
        
        
    }//GEN-LAST:event_jMTabCompaKeyPressed

        
    private void jMTabCompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTabCompaActionPerformed
        
        
    }//GEN-LAST:event_jMTabCompaActionPerformed

        
    private void jMenuItem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem2KeyPressed
        
        
    }//GEN-LAST:event_jMenuItem2KeyPressed

        
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

        
    private void jMLogModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogModActionPerformed
        
        
    }//GEN-LAST:event_jMLogModActionPerformed

        
    private void jMLogModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogModKeyPressed
        
        
    }//GEN-LAST:event_jMLogModKeyPressed

        
    private void jMLogTallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogTallKeyPressed
            
        
    }//GEN-LAST:event_jMLogTallKeyPressed

        
    private void jMLogTallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogTallActionPerformed
        
        
    }//GEN-LAST:event_jMLogTallActionPerformed

        
    private void jMTallColKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMTallColKeyPressed
        
        
    }//GEN-LAST:event_jMTallColKeyPressed

        
    private void jMTallColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTallColActionPerformed
                
        
    }//GEN-LAST:event_jMTallColActionPerformed

        
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

        
    private void jMRepBackOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepBackOKeyPressed
        
        
    }//GEN-LAST:event_jMRepBackOKeyPressed

        
    private void jMRepBackOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepBackOActionPerformed
               
    }//GEN-LAST:event_jMRepBackOActionPerformed

        
    private void jMTipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMTipKeyPressed
        
        
    }//GEN-LAST:event_jMTipKeyPressed

        
    private void jMTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTipActionPerformed
        
        
    }//GEN-LAST:event_jMTipActionPerformed

        
    private void jMLogTipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogTipKeyPressed
        
        
    }//GEN-LAST:event_jMLogTipKeyPressed

      
    private void jMLogTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogTipActionPerformed
              
    }//GEN-LAST:event_jMLogTipActionPerformed

        
    private void jMMInvenImporKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMInvenImporKeyPressed
        
        
    }//GEN-LAST:event_jMMInvenImporKeyPressed

        
    private void jMMInvenExporKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMInvenExporKeyPressed
        
        
    }//GEN-LAST:event_jMMInvenExporKeyPressed

       
    private void jMInvenExporKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMInvenExporKeyPressed
            
        
    }//GEN-LAST:event_jMInvenExporKeyPressed

        
    private void jMInvenImpoSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMInvenImpoSerKeyPressed
        
        
    }//GEN-LAST:event_jMInvenImpoSerKeyPressed
     
    private void jMInvenExporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInvenExporActionPerformed
        
                
    }//GEN-LAST:event_jMInvenExporActionPerformed

        
    private void jMInvenImpoSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInvenImpoSerActionPerformed
                

    }//GEN-LAST:event_jMInvenImpoSerActionPerformed
                                        
                                        
    private void jMExpoSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMExpoSerKeyPressed
                
    }//GEN-LAST:event_jMExpoSerKeyPressed

        
    private void jMExpoSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExpoSerActionPerformed
            
        
    }//GEN-LAST:event_jMExpoSerActionPerformed

        
    private void jMEstadisCorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMEstadisCorKeyPressed
        
        
    }//GEN-LAST:event_jMEstadisCorKeyPressed

        
    private void jMEstadisCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEstadisCorActionPerformed
        
        
    }//GEN-LAST:event_jMEstadisCorActionPerformed

        
    private void jMExpoCliensKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMExpoCliensKeyPressed
        
        
    }//GEN-LAST:event_jMExpoCliensKeyPressed

       
    private void jMImpCliensKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpCliensKeyPressed
        
        
    }//GEN-LAST:event_jMImpCliensKeyPressed

    
    private void jMImpCliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpCliensActionPerformed
             
        
    }//GEN-LAST:event_jMImpCliensActionPerformed

        
    private void jMExpoCliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExpoCliensActionPerformed
            
    }//GEN-LAST:event_jMExpoCliensActionPerformed

        
    private void jMImpProvsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpProvsKeyPressed
        
        
    }//GEN-LAST:event_jMImpProvsKeyPressed

       
    private void jMExpoProvsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMExpoProvsKeyPressed
        
        
    }//GEN-LAST:event_jMExpoProvsKeyPressed

        
    private void jMImpProvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpProvsActionPerformed
        
                
    }//GEN-LAST:event_jMImpProvsActionPerformed

        
    private void jMExpoProvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExpoProvsActionPerformed
                
        
    }//GEN-LAST:event_jMExpoProvsActionPerformed

        
    private void jMAsocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMAsocKeyPressed
            
        
    }//GEN-LAST:event_jMAsocKeyPressed

        
    private void jMAsocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAsocActionPerformed
        
    }//GEN-LAST:event_jMAsocActionPerformed

       
    private void jMZonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMZonKeyPressed
            
        
    }//GEN-LAST:event_jMZonKeyPressed

        
    private void jMGirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMGirKeyPressed
        
        
    }//GEN-LAST:event_jMGirKeyPressed

        
    private void jMZonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMZonActionPerformed
        
        
    }//GEN-LAST:event_jMZonActionPerformed

        
    private void jMGirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGirActionPerformed
        
                
    }//GEN-LAST:event_jMGirActionPerformed

        
    private void jMContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMContaKeyPressed
        
        
    }//GEN-LAST:event_jMContaKeyPressed
    
                
    private void jMEasConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMEasConKeyPressed
                
        
    }//GEN-LAST:event_jMEasConKeyPressed

        
    private void jMEasConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEasConActionPerformed
        
     
        
    }//GEN-LAST:event_jMEasConActionPerformed

        
    private void jMRubrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRubrKeyPressed
        
        
    }//GEN-LAST:event_jMRubrKeyPressed

        
    private void jMRubrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRubrActionPerformed
        
        
    }//GEN-LAST:event_jMRubrActionPerformed

        
    private void jMCatGaraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCatGaraKeyPressed
        
        
    }//GEN-LAST:event_jMCatGaraKeyPressed

        
    private void jMCatGaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCatGaraActionPerformed
        
     
        
    }//GEN-LAST:event_jMCatGaraActionPerformed

        
    private void jMRepCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepCliKeyPressed
        
        
    }//GEN-LAST:event_jMRepCliKeyPressed

        
    private void jMRepCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepCliActionPerformed
                
        
    }//GEN-LAST:event_jMRepCliActionPerformed

        
    private void jMRepProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepProvKeyPressed
        
        
    }//GEN-LAST:event_jMRepProvKeyPressed

        
    private void jMRepProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepProvActionPerformed
                
        
    }//GEN-LAST:event_jMRepProvActionPerformed

        
    private void jMClasJerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMClasJerKeyPressed
                
    }//GEN-LAST:event_jMClasJerKeyPressed

        
    private void jMClasJerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClasJerActionPerformed
             
        
    }//GEN-LAST:event_jMClasJerActionPerformed

        
    private void jMClasJerPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMClasJerPKeyPressed
            
    }//GEN-LAST:event_jMClasJerPKeyPressed

        
    private void jMClasJerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClasJerPActionPerformed
             
        
    }//GEN-LAST:event_jMClasJerPActionPerformed

        
    private void jMFlujActKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMFlujActKeyPressed
            
        
    }//GEN-LAST:event_jMFlujActKeyPressed

        
    private void jMFlujActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFlujActActionPerformed
                    
    }//GEN-LAST:event_jMFlujActActionPerformed

        
    private void jMMUtilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMMUtilKeyPressed
            
        
    }//GEN-LAST:event_jMMUtilKeyPressed

        
    private void jMRevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRevoKeyPressed
            
        
    }//GEN-LAST:event_jMRevoKeyPressed

        
    private void jMRevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRevoActionPerformed
                                
    }//GEN-LAST:event_jMRevoActionPerformed

       
    private void jMActSisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMActSisKeyPressed
        
       
    }//GEN-LAST:event_jMActSisKeyPressed

      
    private void jMActSisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMActSisActionPerformed
            
        
    }//GEN-LAST:event_jMActSisActionPerformed

        
    private void jMNoticKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMNoticKeyPressed
           
        
    }//GEN-LAST:event_jMNoticKeyPressed

        
    private void jMNoticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNoticActionPerformed
            
        
    }//GEN-LAST:event_jMNoticActionPerformed

        
    private void jMForLinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMForLinKeyPressed
            
        
    }//GEN-LAST:event_jMForLinKeyPressed

        
    private void jMForLinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMForLinActionPerformed
                
        
    }//GEN-LAST:event_jMForLinActionPerformed

    
    private void jMJeraProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMJeraProdKeyPressed
                    
        
    }//GEN-LAST:event_jMJeraProdKeyPressed

        
    private void jMJeraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMJeraProdActionPerformed
                
        
    }//GEN-LAST:event_jMJeraProdActionPerformed

        
    private void jMConcepNotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMConcepNotKeyPressed
                  
        
    }//GEN-LAST:event_jMConcepNotKeyPressed

        
    private void jMConcepNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConcepNotActionPerformed
             
        
    }//GEN-LAST:event_jMConcepNotActionPerformed

        
    private void jMImpExistAlmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpExistAlmKeyPressed
        
        
    }//GEN-LAST:event_jMImpExistAlmKeyPressed

        
    private void jMExpExisAlmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMExpExisAlmKeyPressed
                
        
    }//GEN-LAST:event_jMExpExisAlmKeyPressed

        
    private void jMImpExistAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpExistAlmActionPerformed
        
        
        
    }//GEN-LAST:event_jMImpExistAlmActionPerformed

        
    private void jMExpExisAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExpExisAlmActionPerformed
                
        
    }//GEN-LAST:event_jMExpExisAlmActionPerformed

        
    private void jMExpAlmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMExpAlmaKeyPressed
            
        
    }//GEN-LAST:event_jMExpAlmaKeyPressed

    
    private void jMImpAlmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMImpAlmaKeyPressed
           
        
    }//GEN-LAST:event_jMImpAlmaKeyPressed

        
    private void jMImpAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpAlmaActionPerformed
        
                
    }//GEN-LAST:event_jMImpAlmaActionPerformed

        
    private void jMExpAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExpAlmaActionPerformed
                
    }//GEN-LAST:event_jMExpAlmaActionPerformed

        
    private void jMActFijKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMActFijKeyPressed
           
        
    }//GEN-LAST:event_jMActFijKeyPressed

        
    private void jMActFijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMActFijActionPerformed
        
        
    }//GEN-LAST:event_jMActFijActionPerformed

       
    private void jMCatActFijKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCatActFijKeyPressed
                    
        
    }//GEN-LAST:event_jMCatActFijKeyPressed

        
    private void jMCatActFijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCatActFijActionPerformed
                
        
    }//GEN-LAST:event_jMCatActFijActionPerformed

        
    private void jMTipActKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMTipActKeyPressed
               
        
    }//GEN-LAST:event_jMTipActKeyPressed

        
    private void jMTipActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTipActActionPerformed
                
        
    }//GEN-LAST:event_jMTipActActionPerformed

        
    private void jMRepContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMRepContaKeyPressed
            
        
    }//GEN-LAST:event_jMRepContaKeyPressed

        
    private void jMRepContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRepContaActionPerformed
                
        
    }//GEN-LAST:event_jMRepContaActionPerformed

    
    private void jMLogCatActKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogCatActKeyPressed
           
        
    }//GEN-LAST:event_jMLogCatActKeyPressed

        
    private void jMLogActFijKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogActFijKeyPressed
            
        
    }//GEN-LAST:event_jMLogActFijKeyPressed

        
    private void jMLogCatGralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogCatGralKeyPressed
            
        
    }//GEN-LAST:event_jMLogCatGralKeyPressed

        
    private void jMLogClasCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogClasCliKeyPressed
           
        
    }//GEN-LAST:event_jMLogClasCliKeyPressed

        
    private void jMLogClasProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogClasProvKeyPressed
                
        
    }//GEN-LAST:event_jMLogClasProvKeyPressed

        
    private void jMLogConcepNotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogConcepNotKeyPressed
            
        
    }//GEN-LAST:event_jMLogConcepNotKeyPressed

        
    private void jMLogGaraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogGaraKeyPressed
            
        
    }//GEN-LAST:event_jMLogGaraKeyPressed

        
    private void jMLogGirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogGirKeyPressed
            
        
    }//GEN-LAST:event_jMLogGirKeyPressed

            
    private void jMLogZonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogZonKeyPressed
            
        
    }//GEN-LAST:event_jMLogZonKeyPressed

        
    private void jMLogCatActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogCatActActionPerformed
                
        
    }//GEN-LAST:event_jMLogCatActActionPerformed

        
    private void jMLogActFijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogActFijActionPerformed
                
        
    }//GEN-LAST:event_jMLogActFijActionPerformed

        
    private void jMLogCatGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogCatGralActionPerformed
                
        
    }//GEN-LAST:event_jMLogCatGralActionPerformed

        
    private void jMLogClasCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogClasCliActionPerformed
                
        
    }//GEN-LAST:event_jMLogClasCliActionPerformed

        
    private void jMLogClasProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogClasProvActionPerformed
                
        
    }//GEN-LAST:event_jMLogClasProvActionPerformed

        
    private void jMLogConcepNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogConcepNotActionPerformed
             
        
    }//GEN-LAST:event_jMLogConcepNotActionPerformed

        
    private void jMLogGaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogGaraActionPerformed
                
        
    }//GEN-LAST:event_jMLogGaraActionPerformed

        
    private void jMLogGirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogGirActionPerformed
        
    }//GEN-LAST:event_jMLogGirActionPerformed
        
    
    private void jMLogZonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogZonActionPerformed
        
        
        
    }//GEN-LAST:event_jMLogZonActionPerformed

        
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            
        
    }//GEN-LAST:event_formWindowActivated

        
    private void jMConcepPagsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMConcepPagsKeyPressed
            
        
    }//GEN-LAST:event_jMConcepPagsKeyPressed

        
    private void jMConcepPagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConcepPagsActionPerformed
                
        
    }//GEN-LAST:event_jMConcepPagsActionPerformed

        
    private void jMLogConcepPagsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMLogConcepPagsKeyPressed
            
        
    }//GEN-LAST:event_jMLogConcepPagsKeyPressed

        
    private void jMLogConcepPagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogConcepPagsActionPerformed
                
        
    }//GEN-LAST:event_jMLogConcepPagsActionPerformed
    
    private void jMenuMarcModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuMarcModKeyPressed
    
        
    }//GEN-LAST:event_jMenuMarcModKeyPressed

        
    private void jMenuMarcModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMarcModActionPerformed
                
        
    }//GEN-LAST:event_jMenuMarcModActionPerformed

            
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

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed
    
    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        
          
    }//GEN-LAST:event_jMenu4MouseClicked

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
    protected javax.swing.JCheckBox jCheckBox1;
    protected javax.swing.JLabel jLImg;
    protected javax.swing.JLayeredPane jLayeredPane1;
    protected javax.swing.JMenuItem jMAcerc;
    protected javax.swing.JMenuItem jMActFij;
    protected javax.swing.JMenuItem jMActSis;
    protected javax.swing.JMenuItem jMActivo;
    protected javax.swing.JMenu jMActivos;
    protected javax.swing.JMenuItem jMApFav;
    protected javax.swing.JMenuItem jMArchC;
    protected javax.swing.JMenuItem jMAsoc;
    protected javax.swing.JMenuItem jMCXC;
    protected javax.swing.JMenuItem jMCXP;
    protected javax.swing.JMenuItem jMCalc;
    protected javax.swing.JMenuItem jMCarpAp;
    protected javax.swing.JMenuItem jMCatActFij;
    protected javax.swing.JMenuItem jMCatGara;
    protected javax.swing.JMenuItem jMCatMsj;
    protected javax.swing.JMenuItem jMChat;
    protected javax.swing.JMenuItem jMChatC;
    protected javax.swing.JMenuItem jMClasCli;
    protected javax.swing.JMenuItem jMClasJer;
    protected javax.swing.JMenuItem jMClasJerP;
    protected javax.swing.JMenuItem jMClasProd;
    protected javax.swing.JMenuItem jMClasificacion;
    protected javax.swing.JMenuItem jMClasProv;
    protected javax.swing.JMenuItem jMConcepNot;
    protected javax.swing.JMenuItem jMConcepPags;
    protected javax.swing.JMenuItem jMConfAd;
    protected javax.swing.JMenu jMConta;
    protected javax.swing.JMenuItem jMContra;
    protected javax.swing.JMenuItem jMCosts;
    protected javax.swing.JMenuItem jMCuade;
    protected javax.swing.JMenuItem jMDelLog;
    protected javax.swing.JMenuItem jMEasCon;
    protected javax.swing.JMenuItem jMEnviA;
    protected javax.swing.JMenuItem jMEstacs;
    protected javax.swing.JMenuItem jMEstadisCor;
    protected javax.swing.JMenuItem jMExpAlma;
    protected javax.swing.JMenuItem jMExpExisAlm;
    protected javax.swing.JMenuItem jMExpoCliens;
    protected javax.swing.JMenuItem jMExpoProvs;
    protected javax.swing.JMenuItem jMExpoSer;
    protected javax.swing.JMenuItem jMFluj;
    protected javax.swing.JMenuItem jMFlujAct;
    protected javax.swing.JMenuItem jMForLin;
    protected javax.swing.JMenuItem jMGir;
    protected javax.swing.JMenuItem jMICuentaContable;
    protected javax.swing.JMenuItem jMImpAlma;
    protected javax.swing.JMenuItem jMImpCliens;
    protected javax.swing.JMenuItem jMImpExistAlm;
    protected javax.swing.JMenuItem jMImpProvs;
    protected javax.swing.JMenu jMInven;
    protected javax.swing.JMenuItem jMInvenExpor;
    protected javax.swing.JMenuItem jMInvenImpo;
    protected javax.swing.JMenuItem jMInvenImpoSer;
    protected javax.swing.JMenuItem jMJeraProd;
    protected javax.swing.JMenuItem jMKard;
    protected javax.swing.JMenuItem jMLogActFij;
    protected javax.swing.JMenuItem jMLogAlma;
    protected javax.swing.JMenuItem jMLogCatAct;
    protected javax.swing.JMenuItem jMLogCatGral;
    protected javax.swing.JMenuItem jMLogClas;
    protected javax.swing.JMenuItem jMLogClasCli;
    protected javax.swing.JMenuItem jMLogClasProv;
    protected javax.swing.JMenuItem jMLogColo;
    protected javax.swing.JMenuItem jMLogConcep;
    protected javax.swing.JMenuItem jMLogConcepNot;
    protected javax.swing.JMenuItem jMLogConcepPags;
    protected javax.swing.JMenuItem jMLogFab;
    protected javax.swing.JMenuItem jMLogGara;
    protected javax.swing.JMenuItem jMLogGir;
    protected javax.swing.JMenuItem jMLogImpu;
    protected javax.swing.JMenuItem jMLogK;
    protected javax.swing.JMenuItem jMLogLin;
    protected javax.swing.JMenuItem jMLogLug;
    protected javax.swing.JMenuItem jMLogMarc;
    protected javax.swing.JMenuItem jMLogMed;
    protected javax.swing.JMenuItem jMLogMod;
    protected javax.swing.JMenuItem jMLogMon;
    protected javax.swing.JMenuItem jMLogPes;
    protected javax.swing.JMenuItem jMLogProd;
    protected javax.swing.JMenuItem jMLogRes;
    protected javax.swing.JMenu jMLogSis;
    protected javax.swing.JMenuItem jMLogTall;
    protected javax.swing.JMenuItem jMLogTip;
    protected javax.swing.JMenuItem jMLogUbiE;
    protected javax.swing.JMenuItem jMLogUnid;
    protected javax.swing.JMenuItem jMLogZon;
    protected javax.swing.JMenuItem jMLotPed;
    protected javax.swing.JMenu jMMAplic;
    protected javax.swing.JMenu jMMAyu;
    protected javax.swing.JMenu jMMClas;
    protected javax.swing.JMenuItem jMMClien;
    protected javax.swing.JMenu jMMInvenExpor;
    protected javax.swing.JMenu jMMInvenImpor;
    protected javax.swing.JMenu jMMLogR;
    protected javax.swing.JMenu jMMRep;
    protected javax.swing.JMenu jMMRepCom;
    protected javax.swing.JMenu jMMRepProd;
    protected javax.swing.JMenu jMMRepVta;
    protected javax.swing.JMenu jMMSis;
    protected javax.swing.JMenu jMMUbic;
    protected javax.swing.JMenu jMMUsr;
    protected javax.swing.JMenu jMMUtil;
    protected javax.swing.JMenuItem jMModel;
    protected javax.swing.JMenuItem jMMsj;
    protected javax.swing.JMenuItem jMNotic;
    protected javax.swing.JMenuItem jMPrevioComp;
    protected javax.swing.JMenuItem jMRepBackO;
    protected javax.swing.JMenuItem jMRepCli;
    protected javax.swing.JMenuItem jMRepCom;
    protected javax.swing.JMenuItem jMRepConta;
    protected javax.swing.JMenuItem jMRepCot;
    protected javax.swing.JMenuItem jMRepLogCo;
    protected javax.swing.JMenuItem jMRepOr;
    protected javax.swing.JMenuItem jMRepProv;
    protected javax.swing.JMenuItem jMRepVend;
    protected javax.swing.JMenuItem jMResp;
    protected javax.swing.JMenuItem jMResponsable;
    protected javax.swing.JMenuItem jMRevo;
    protected javax.swing.JMenuItem jMRubr;
    protected javax.swing.JMenu jMSist;
    protected javax.swing.JMenuItem jMSucursal;
    protected javax.swing.JMenuItem jMTabCompa;
    protected javax.swing.JMenuItem jMTallCol;
    protected javax.swing.JMenuItem jMTip;
    protected javax.swing.JMenuItem jMTipAct;
    protected javax.swing.JMenuItem jMUbiAd;
    protected javax.swing.JMenuItem jMUsr;
    protected javax.swing.JMenuItem jMVLogSys;
    protected javax.swing.JMenuItem jMVProd;
    protected javax.swing.JMenuItem jMZon;
    protected javax.swing.JMenuItem jMeItImps;
    protected javax.swing.JMenu jMen2;
    protected javax.swing.JMenu jMenBDs;
    protected javax.swing.JMenuBar jMenBar1;
    protected javax.swing.JMenuItem jMenCXCR;
    protected javax.swing.JMenuItem jMenCXP;
    protected javax.swing.JMenuItem jMenCambIco;
    protected javax.swing.JMenuItem jMenCatGral;
    protected javax.swing.JMenu jMenComps;
    protected javax.swing.JMenuItem jMenConfigFil;
    protected javax.swing.JMenuItem jMenCotsT;
    protected javax.swing.JMenuItem jMenIActualizacion;
    protected javax.swing.JMenu jMenInvents;
    protected javax.swing.JMenuItem jMenIt1;
    protected javax.swing.JMenuItem jMenIt4;
    protected javax.swing.JMenuItem jMenIt5;
    protected javax.swing.JMenuItem jMenItAlmas;
    protected javax.swing.JMenuItem jMenItCamEmp;
    protected javax.swing.JMenuItem jMenItCambClavSeg;
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
    protected javax.swing.JMenuItem jMenItModBD;
    protected javax.swing.JMenuItem jMenItMons;
    protected javax.swing.JMenuItem jMenItPermEstacs;
    protected javax.swing.JMenuItem jMenItPesos;
    protected javax.swing.JMenuItem jMenItProdsArrMax;
    protected javax.swing.JMenuItem jMenItProdsBajMin;
    protected javax.swing.JMenuItem jMenItResps;
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
    protected javax.swing.JMenu jMenu4;
    protected javax.swing.JMenu jMenu5;
    protected javax.swing.JMenuBar jMenuBar1;
    protected javax.swing.JMenuItem jMenuItem1;
    protected javax.swing.JMenuItem jMenuItem2;
    protected javax.swing.JMenuItem jMenuItem3;
    protected javax.swing.JMenuItem jMenuItem4;
    protected javax.swing.JMenuItem jMenuItem5;
    protected javax.swing.JMenuItem jMenuItem6;
    protected javax.swing.JMenuItem jMenuItem7;
    protected javax.swing.JMenuItem jMenuItem9;
    protected javax.swing.JMenuItem jMenuItemPedidos;
    protected javax.swing.JMenuItem jMenuItemRemisiones;
    protected javax.swing.JMenuItem jMenuMarcMod;
    protected javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPopupMenu jPopupMenu1;
    protected javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
   
}

