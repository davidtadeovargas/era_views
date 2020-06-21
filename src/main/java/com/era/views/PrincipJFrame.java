package com.era.views;

public abstract class PrincipJFrame extends BaseJFrame {
    
    public PrincipJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        maximizedWindow();
        
        postInitComponents();
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
        reportsMenu = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenItSal = new javax.swing.JMenuItem();
        jMenInvents = new javax.swing.JMenu();
        jMenComps = new javax.swing.JMenu();
        jMenItManProvs = new javax.swing.JMenuItem();
        jMenItComps = new javax.swing.JMenuItem();
        jMCXP = new javax.swing.JMenuItem();
        jMImpProvs = new javax.swing.JMenuItem();
        jMPrevioComp = new javax.swing.JMenuItem();
        jMInven = new javax.swing.JMenu();
        jMVProd = new javax.swing.JMenuItem();
        jMenItKits = new javax.swing.JMenuItem();
        warehousesMenu = new javax.swing.JMenuItem();
        jMLotPed = new javax.swing.JMenuItem();
        jMMInvenImpor = new javax.swing.JMenu();
        jMInvenImpo = new javax.swing.JMenuItem();
        jMImpExistAlm = new javax.swing.JMenuItem();
        importKitsMenItem = new javax.swing.JMenuItem();
        jMenMaxsMins = new javax.swing.JMenu();
        jMenItProdsBajMin = new javax.swing.JMenuItem();
        jMenItProdsArrMax = new javax.swing.JMenuItem();
        jMenItDefEstacs = new javax.swing.JMenuItem();
        jMenTraspas = new javax.swing.JMenu();
        jMenItTraspas = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenItIngr = new javax.swing.JMenuItem();
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
        clasificationsMenu = new javax.swing.JMenuItem();
        jMActivo = new javax.swing.JMenuItem();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLImg.setBackground(new java.awt.Color(255, 255, 255));
        jLImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLImg, java.awt.BorderLayout.CENTER);

        jP1.setBackground(new java.awt.Color(204, 255, 204));

        jBPtoVta.setBackground(new java.awt.Color(255, 255, 255));
        jBPtoVta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPtoVta.setForeground(new java.awt.Color(0, 102, 0));
        jBPtoVta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pos.png"))); // NOI18N
        jBPtoVta.setText("POS");
        jBPtoVta.setToolTipText("Punto de venta (U)");

        jBVtas.setBackground(new java.awt.Color(255, 255, 255));
        jBVtas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBVtas.setForeground(new java.awt.Color(0, 102, 0));
        jBVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vtas2.png"))); // NOI18N
        jBVtas.setText("Ventas");
        jBVtas.setToolTipText("Módulo de ventas (V)");

        jBComps.setBackground(new java.awt.Color(255, 255, 255));
        jBComps.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBComps.setForeground(new java.awt.Color(0, 102, 0));
        jBComps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comprs2.png"))); // NOI18N
        jBComps.setText("Compras");
        jBComps.setToolTipText("Módulo de compras y órdenes (O)");

        jBEmps.setBackground(new java.awt.Color(255, 255, 255));
        jBEmps.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBEmps.setForeground(new java.awt.Color(0, 102, 0));
        jBEmps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/manemp.png"))); // NOI18N
        jBEmps.setText("Clientes");
        jBEmps.setToolTipText("Módulo de clientes (E)");

        jBProvs.setBackground(new java.awt.Color(255, 255, 255));
        jBProvs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProvs.setForeground(new java.awt.Color(0, 102, 0));
        jBProvs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/provs.png"))); // NOI18N
        jBProvs.setText("Proveedores");
        jBProvs.setToolTipText("Módulo de proveedores (P)");

        jBProds.setBackground(new java.awt.Color(255, 255, 255));
        jBProds.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProds.setForeground(new java.awt.Color(0, 102, 0));
        jBProds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prods.png"))); // NOI18N
        jBProds.setText("Producto");
        jBProds.setToolTipText("Módulo de productos (R)");

        jBCots.setBackground(new java.awt.Color(255, 255, 255));
        jBCots.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBCots.setForeground(new java.awt.Color(0, 102, 0));
        jBCots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cots.png"))); // NOI18N
        jBCots.setText("Cotizaciones");
        jBCots.setToolTipText("Módulo de cotizaciones (C)");

        jBPrevComp.setBackground(new java.awt.Color(255, 255, 255));
        jBPrevComp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPrevComp.setForeground(new java.awt.Color(0, 102, 0));
        jBPrevComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Prevcom.png"))); // NOI18N
        jBPrevComp.setText("Previo de compra");
        jBPrevComp.setToolTipText("Módulo de previo de compra (B)");

        jBPtoVta2.setBackground(new java.awt.Color(255, 255, 255));
        jBPtoVta2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPtoVta2.setForeground(new java.awt.Color(0, 102, 0));
        jBPtoVta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ci.png"))); // NOI18N
        jBPtoVta2.setToolTipText("Interfaz");
        jBPtoVta2.setLabel("Join Data");

        jButtonPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPedidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPedidos.setForeground(new java.awt.Color(0, 102, 0));
        jButtonPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comprs2.png"))); // NOI18N
        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.setToolTipText("Módulo de compras y órdenes (O)");

        jButtonPedidos1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPedidos1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPedidos1.setForeground(new java.awt.Color(0, 102, 0));
        jButtonPedidos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abon.png"))); // NOI18N
        jButtonPedidos1.setText("Pagos");
        jButtonPedidos1.setToolTipText("Módulo de compras y órdenes (O)");

        jBReporteCaja.setBackground(new java.awt.Color(255, 255, 255));
        jBReporteCaja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBReporteCaja.setForeground(new java.awt.Color(0, 102, 0));
        jBReporteCaja.setText("Reporte Caja");
        jBReporteCaja.setEnabled(false);
        jBReporteCaja.setMaximumSize(new java.awt.Dimension(109, 37));
        jBReporteCaja.setMinimumSize(new java.awt.Dimension(109, 37));
        jBReporteCaja.setPreferredSize(new java.awt.Dimension(109, 37));

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

        jMMSis.setMnemonic('s');
        jMMSis.setText("Sistema");

        jMenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logi.png"))); // NOI18N
        jMenLogin.setMnemonic('l');
        jMenLogin.setText("Sesión");

        jMenItLogear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenItLogear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/login.png"))); // NOI18N
        jMenItLogear.setText("Cambiar sesión");
        jMenLogin.add(jMenItLogear);

        jMenItDeslog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenItDeslog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Logout.png"))); // NOI18N
        jMenItDeslog.setMnemonic('d');
        jMenItDeslog.setText("Suspender");
        jMenLogin.add(jMenItDeslog);

        jMenItCamEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cambemp.png"))); // NOI18N
        jMenItCamEmp.setMnemonic('c');
        jMenItCamEmp.setText("Cambiar de empresa");
        jMenLogin.add(jMenItCamEmp);

        jMMSis.add(jMenLogin);

        jMMUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/estacs.png"))); // NOI18N
        jMMUsr.setMnemonic('u');
        jMMUsr.setText("Usuarios");

        jMenItEstacs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/defusr.png"))); // NOI18N
        jMenItEstacs.setMnemonic('e');
        jMenItEstacs.setText("Definir usuarios");
        jMMUsr.add(jMenItEstacs);

        jMenItPermEstacs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/permusr.png"))); // NOI18N
        jMenItPermEstacs.setMnemonic('p');
        jMenItPermEstacs.setText("Permisos usuarios");
        jMMUsr.add(jMenItPermEstacs);

        jMMSis.add(jMMUsr);

        jMenLogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log.png"))); // NOI18N
        jMenLogs.setMnemonic('g');
        jMenLogs.setText("Logs");

        jMenItLogCorr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logcorr.png"))); // NOI18N
        jMenItLogCorr.setMnemonic('l');
        jMenItLogCorr.setText("Log correos");
        jMenLogs.add(jMenItLogCorr);

        jMLogSis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logsist.png"))); // NOI18N
        jMLogSis.setMnemonic('g');
        jMLogSis.setText("Log sistema");

        jMVLogSys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logsist.png"))); // NOI18N
        jMVLogSys.setMnemonic('v');
        jMVLogSys.setText("Ver log sistema");
        jMLogSis.add(jMVLogSys);

        jMDelLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dellogsis.png"))); // NOI18N
        jMDelLog.setMnemonic('b');
        jMDelLog.setText("Borrar log");
        jMLogSis.add(jMDelLog);

        jMenLogs.add(jMLogSis);

        jMLogProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/log2.png"))); // NOI18N
        jMLogProd.setMnemonic('l');
        jMLogProd.setText("Logs generales");
        jMenLogs.add(jMLogProd);

        jMMSis.add(jMenLogs);

        jMenBDs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/basdats.png"))); // NOI18N
        jMenBDs.setMnemonic('b');
        jMenBDs.setText("Base de datos");

        jMenConfigFil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/archconfg.png"))); // NOI18N
        jMenConfigFil.setMnemonic('a');
        jMenConfigFil.setText("Archivo de configuración");
        jMenBDs.add(jMenConfigFil);

        jMMSis.add(jMenBDs);

        reportsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rptusr.png"))); // NOI18N
        reportsMenu.setMnemonic('t');
        reportsMenu.setText("Reportes generales");
        jMMSis.add(reportsMenu);

        jMenuItem6.setText("Cerrar Sesión");
        jMMSis.add(jMenuItem6);

        jMenItSal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenItSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jMenItSal.setText("Salir");
        jMMSis.add(jMenItSal);

        jMenBar1.add(jMMSis);

        jMenInvents.setMnemonic('M');
        jMenInvents.setText("Módulos");

        jMenComps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comprs2.png"))); // NOI18N
        jMenComps.setMnemonic('o');
        jMenComps.setText("Compras");

        jMenItManProvs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        jMenItManProvs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/provs.png"))); // NOI18N
        jMenItManProvs.setMnemonic('a');
        jMenItManProvs.setText("Proveedores");
        jMenComps.add(jMenItManProvs);

        jMenItComps.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
        jMenItComps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ordcom.png"))); // NOI18N
        jMenItComps.setMnemonic('c');
        jMenItComps.setText("Órdenes/Compras");
        jMenComps.add(jMenItComps);

        jMCXP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cxp.png"))); // NOI18N
        jMCXP.setMnemonic('X');
        jMCXP.setText("CXP");
        jMenComps.add(jMCXP);

        jMImpProvs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMImpProvs.setText("Importar catálogo de proveedores desde excel");
        jMenComps.add(jMImpProvs);

        jMPrevioComp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        jMPrevioComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Prevcom.png"))); // NOI18N
        jMPrevioComp.setText("Previo de compra");
        jMenComps.add(jMPrevioComp);

        jMenInvents.add(jMenComps);

        jMInven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/inven.png"))); // NOI18N
        jMInven.setMnemonic('p');
        jMInven.setText("Inventarios");

        jMVProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jMVProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prods.png"))); // NOI18N
        jMVProd.setMnemonic('P');
        jMVProd.setText("Productos");
        jMInven.add(jMVProd);

        jMenItKits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/kits.png"))); // NOI18N
        jMenItKits.setMnemonic('i');
        jMenItKits.setText("Kits");
        jMInven.add(jMenItKits);

        warehousesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/kits.png"))); // NOI18N
        warehousesMenu.setMnemonic('i');
        warehousesMenu.setText("Almacenes");
        jMInven.add(warehousesMenu);

        jMLotPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lotped.png"))); // NOI18N
        jMLotPed.setText("Lotes y pedimentos");
        jMInven.add(jMLotPed);

        jMMInvenImpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/import.png"))); // NOI18N
        jMMInvenImpor.setText("Importaciones");

        jMInvenImpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMInvenImpo.setMnemonic('I');
        jMInvenImpo.setText("Importar catálogo de productos desde excel");
        jMMInvenImpor.add(jMInvenImpo);

        jMImpExistAlm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMImpExistAlm.setMnemonic('p');
        jMImpExistAlm.setText("Importar existencias por almacén");
        jMImpExistAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMImpExistAlmActionPerformed(evt);
            }
        });
        jMMInvenImpor.add(jMImpExistAlm);

        importKitsMenItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        importKitsMenItem.setMnemonic('p');
        importKitsMenItem.setText("Importar kits desde excel");
        importKitsMenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importKitsMenItemActionPerformed(evt);
            }
        });
        jMMInvenImpor.add(importKitsMenItem);

        jMInven.add(jMMInvenImpor);

        jMenMaxsMins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/maxmin.png"))); // NOI18N
        jMenMaxsMins.setMnemonic('a');
        jMenMaxsMins.setText("Máximos y mínimos");

        jMenItProdsBajMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prodabajmin.png"))); // NOI18N
        jMenItProdsBajMin.setMnemonic('p');
        jMenItProdsBajMin.setText("Productos debajo del mínimo");
        jMenMaxsMins.add(jMenItProdsBajMin);

        jMenItProdsArrMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prodarrimax.png"))); // NOI18N
        jMenItProdsArrMax.setMnemonic('r');
        jMenItProdsArrMax.setText("Productos arriba del máximo");
        jMenMaxsMins.add(jMenItProdsArrMax);

        jMenItDefEstacs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/usrmax.png"))); // NOI18N
        jMenItDefEstacs.setMnemonic('d');
        jMenItDefEstacs.setText("Definir usuarios Max. Min.");
        jMenMaxsMins.add(jMenItDefEstacs);

        jMInven.add(jMenMaxsMins);

        jMenTraspas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/movalma.png"))); // NOI18N
        jMenTraspas.setMnemonic('r');
        jMenTraspas.setText("Movimientos almacenes");

        jMenItTraspas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/traspas.png"))); // NOI18N
        jMenItTraspas.setMnemonic('t');
        jMenItTraspas.setText("Traspasos");
        jMenTraspas.add(jMenItTraspas);

        jMenuItem7.setText("Pendientes");
        jMenTraspas.add(jMenuItem7);

        jMenItIngr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ingrsal.png"))); // NOI18N
        jMenItIngr.setMnemonic('i');
        jMenItIngr.setText("Entradas / Salidas");
        jMenTraspas.add(jMenItIngr);

        jMInven.add(jMenTraspas);

        jMenInvents.add(jMInven);

        jMenVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vtas2.png"))); // NOI18N
        jMenVtas.setMnemonic('v');
        jMenVtas.setText("Ventas");

        jMMClien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        jMMClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/manemp.png"))); // NOI18N
        jMMClien.setMnemonic('m');
        jMMClien.setText("Clientes");
        jMenVtas.add(jMMClien);

        jMenItVtas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        jMenItVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vtas.png"))); // NOI18N
        jMenItVtas.setMnemonic('v');
        jMenItVtas.setText("Ventas");
        jMenVtas.add(jMenItVtas);

        jMenuItemRemisiones.setText("Remisiones");
        jMenVtas.add(jMenuItemRemisiones);

        jMenCotsT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenCotsT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cots.png"))); // NOI18N
        jMenCotsT.setMnemonic('C');
        jMenCotsT.setText("Cotizaciones");
        jMenVtas.add(jMenCotsT);

        jMenuItemPedidos.setText("Pedidos");
        jMenVtas.add(jMenuItemPedidos);

        jMenItTipsPags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tipspags.png"))); // NOI18N
        jMenItTipsPags.setMnemonic('t');
        jMenItTipsPags.setText("Tipos de pagos");
        jMenVtas.add(jMenItTipsPags);

        jMConcepPags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tipspags.png"))); // NOI18N
        jMConcepPags.setMnemonic('n');
        jMConcepPags.setText("Conceptos de pagos");
        jMenVtas.add(jMConcepPags);

        jMCXC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cxc.png"))); // NOI18N
        jMCXC.setMnemonic('c');
        jMCXC.setText("CXC");
        jMenVtas.add(jMCXC);

        jMenItTouch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        jMenItTouch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pos.png"))); // NOI18N
        jMenItTouch.setMnemonic('t');
        jMenItTouch.setText("Punto de venta");
        jMenVtas.add(jMenItTouch);

        jMImpCliens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impexe.png"))); // NOI18N
        jMImpCliens.setMnemonic('i');
        jMImpCliens.setText("Importar catálogo de clientes desde excel");
        jMenVtas.add(jMImpCliens);

        jMenInvents.add(jMenVtas);

        clasificationsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/claslin.png"))); // NOI18N
        clasificationsMenu.setMnemonic('l');
        clasificationsMenu.setText("Catálogo General");
        jMenInvents.add(clasificationsMenu);

        jMActivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/280activos.png"))); // NOI18N
        jMActivo.setText("Activo");
        jMenInvents.add(jMActivo);

        jMenItMons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mons.png"))); // NOI18N
        jMenItMons.setMnemonic('o');
        jMenItMons.setText("Monedas");
        jMenInvents.add(jMenItMons);

        jMeItImps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impues.png"))); // NOI18N
        jMeItImps.setMnemonic('m');
        jMeItImps.setText("Impuestos");
        jMenInvents.add(jMeItImps);

        jMICuentaContable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/30clasificaciones.png"))); // NOI18N
        jMICuentaContable.setText("Cuentas contables");
        jMenInvents.add(jMICuentaContable);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/285catalogobancos.png"))); // NOI18N
        jMenuItem5.setText("Bancos");
        jMenInvents.add(jMenuItem5);

        jMenBar1.add(jMenInvents);

        jMSist.setMnemonic('c');
        jMSist.setText("Configuraciones");

        jMenIt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corrs.png"))); // NOI18N
        jMenIt4.setMnemonic('o');
        jMenIt4.setText("Correos electrónicos");
        jMSist.add(jMenIt4);

        jMenItDatsGenEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/datsgralempre.png"))); // NOI18N
        jMenItDatsGenEmp.setMnemonic('t');
        jMenItDatsGenEmp.setText("Datos generales de la empresa");
        jMenItDatsGenEmp.setToolTipText("");
        jMSist.add(jMenItDatsGenEmp);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fol.png"))); // NOI18N
        jMenuItem3.setText("Series y consecutivos");
        jMSist.add(jMenuItem3);

        jMenItImpres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impres.png"))); // NOI18N
        jMenItImpres.setMnemonic('m');
        jMenItImpres.setText("Impresoras");
        jMSist.add(jMenItImpres);

        jMConfAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/confgral.png"))); // NOI18N
        jMConfAd.setMnemonic('n');
        jMConfAd.setText("Configuraciones generales");
        jMSist.add(jMConfAd);

        jMenBar1.add(jMSist);

        jMMAyu.setMnemonic('y');
        jMMAyu.setText("Ayuda");

        jMAcerc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/acerd.png"))); // NOI18N
        jMAcerc.setMnemonic('a');
        jMAcerc.setText("Acerca de...");
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

    private void jMImpExistAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImpExistAlmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMImpExistAlmActionPerformed

    private void importKitsMenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importKitsMenItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importKitsMenItemActionPerformed
                   
            
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenuItem clasificationsMenu;
    protected javax.swing.JMenuItem importKitsMenItem;
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
    protected javax.swing.JMenuItem jMCXC;
    protected javax.swing.JMenuItem jMCXP;
    protected javax.swing.JMenuItem jMConcepPags;
    protected javax.swing.JMenuItem jMConfAd;
    protected javax.swing.JMenuItem jMDelLog;
    protected javax.swing.JMenuItem jMICuentaContable;
    protected javax.swing.JMenuItem jMImpCliens;
    protected javax.swing.JMenuItem jMImpExistAlm;
    protected javax.swing.JMenuItem jMImpProvs;
    protected javax.swing.JMenu jMInven;
    protected javax.swing.JMenuItem jMInvenImpo;
    protected javax.swing.JMenuItem jMLogProd;
    protected javax.swing.JMenu jMLogSis;
    protected javax.swing.JMenuItem jMLotPed;
    protected javax.swing.JMenu jMMAyu;
    protected javax.swing.JMenuItem jMMClien;
    protected javax.swing.JMenu jMMInvenImpor;
    protected javax.swing.JMenu jMMSis;
    protected javax.swing.JMenu jMMUsr;
    protected javax.swing.JMenuItem jMPrevioComp;
    protected javax.swing.JMenu jMSist;
    protected javax.swing.JMenuItem jMVLogSys;
    protected javax.swing.JMenuItem jMVProd;
    protected javax.swing.JMenuItem jMeItImps;
    protected javax.swing.JMenu jMenBDs;
    private javax.swing.JMenuBar jMenBar1;
    protected javax.swing.JMenu jMenComps;
    protected javax.swing.JMenuItem jMenConfigFil;
    protected javax.swing.JMenuItem jMenCotsT;
    private javax.swing.JMenu jMenInvents;
    protected javax.swing.JMenuItem jMenIt4;
    protected javax.swing.JMenuItem jMenItCamEmp;
    protected javax.swing.JMenuItem jMenItComps;
    protected javax.swing.JMenuItem jMenItDatsGenEmp;
    protected javax.swing.JMenuItem jMenItDefEstacs;
    protected javax.swing.JMenuItem jMenItDeslog;
    protected javax.swing.JMenuItem jMenItEstacs;
    protected javax.swing.JMenuItem jMenItImpres;
    protected javax.swing.JMenuItem jMenItIngr;
    protected javax.swing.JMenuItem jMenItKits;
    protected javax.swing.JMenuItem jMenItLogCorr;
    protected javax.swing.JMenuItem jMenItLogear;
    protected javax.swing.JMenuItem jMenItManProvs;
    protected javax.swing.JMenuItem jMenItMons;
    protected javax.swing.JMenuItem jMenItPermEstacs;
    protected javax.swing.JMenuItem jMenItProdsArrMax;
    protected javax.swing.JMenuItem jMenItProdsBajMin;
    protected javax.swing.JMenuItem jMenItSal;
    protected javax.swing.JMenuItem jMenItTipsPags;
    protected javax.swing.JMenuItem jMenItTouch;
    protected javax.swing.JMenuItem jMenItTraspas;
    protected javax.swing.JMenuItem jMenItVtas;
    protected javax.swing.JMenu jMenLogin;
    protected javax.swing.JMenu jMenLogs;
    protected javax.swing.JMenu jMenMaxsMins;
    protected javax.swing.JMenu jMenTraspas;
    protected javax.swing.JMenu jMenVtas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    protected javax.swing.JMenuItem jMenuItem3;
    protected javax.swing.JMenuItem jMenuItem5;
    protected javax.swing.JMenuItem jMenuItem6;
    protected javax.swing.JMenuItem jMenuItem7;
    protected javax.swing.JMenuItem jMenuItemPedidos;
    protected javax.swing.JMenuItem jMenuItemRemisiones;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    protected javax.swing.JMenuItem reportsMenu;
    protected javax.swing.JMenuItem warehousesMenu;
    // End of variables declaration//GEN-END:variables
   
}

