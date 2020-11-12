package com.era.views;

public abstract class ConfGralJFrame extends BaseJFrame
{
    public ConfGralJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();
        
        //Post inicialization
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jTBP.setTitleAt(0, "Inventarios");
        jTBP.setTitleAt(1, "Facturas");                
        jTBP.setTitleAt(2, "Cotizaciones");                
        jTBP.setTitleAt(3, "Sistema");                
        jTBP.setTitleAt(4, "Compras");                
        jTBP.setTitleAt(5, "Punto de venta");                
        jTBP.setTitleAt(6, "Remisiones");                
        jTBP.setTitleAt(7, "Tickets");                        
        jTBP.setTitleAt(8, "Previos de compra"); 
        
        jBTBajCost.grabFocus();
                        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTBP = new javax.swing.JTabbedPane(3);
        jPInven = new javax.swing.JPanel();
        jBTBajCost = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBTNoBajCost = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBMaxMin = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jBNoMaxMin = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jCESExistMov = new javax.swing.JCheckBox();
        jCTraspasExis = new javax.swing.JCheckBox();
        jCSerRep = new javax.swing.JCheckBox();
        jPFac = new javax.swing.JPanel();
        jCPListCFac = new javax.swing.JCheckBox();
        jCMMEFac = new javax.swing.JCheckBox();
        jCVendSinExistFac = new javax.swing.JCheckBox();
        jCLimCredFac = new javax.swing.JCheckBox();
        jCVendMN = new javax.swing.JCheckBox();
        jCCanFacPto = new javax.swing.JCheckBox();
        jCMinFac = new javax.swing.JCheckBox();
        jTMinFac = new javax.swing.JTextField();
        jComSerFac = new com.era.views.comboboxes.SeriesCombobox();
        jLabel30 = new javax.swing.JLabel();
        jCTestSystem = new javax.swing.JCheckBox();
        jPCot = new javax.swing.JPanel();
        jCMMECot = new javax.swing.JCheckBox();
        jCVSinExistCot = new javax.swing.JCheckBox();
        jCCotMN = new javax.swing.JCheckBox();
        jPSis = new javax.swing.JPanel();
        jCDesInac = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        radio_redondea_2 = new javax.swing.JRadioButton();
        radio_redondea_3 = new javax.swing.JRadioButton();
        radio_redondea_4 = new javax.swing.JRadioButton();
        radio_redondea_5 = new javax.swing.JRadioButton();
        radio_redondea_6 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPEnVentas = new javax.swing.JPanel();
        jCHActivoVenta = new javax.swing.JCheckBox();
        jCHCuentaVenta = new javax.swing.JCheckBox();
        jPEnCompras = new javax.swing.JPanel();
        jCHActivoCompra = new javax.swing.JCheckBox();
        jCHCuentaCompra = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        rbtVer32 = new javax.swing.JRadioButton();
        rbtVer33 = new javax.swing.JRadioButton();
        jPComp = new javax.swing.JPanel();
        jCCompMN = new javax.swing.JCheckBox();
        jPPtoVta = new javax.swing.JPanel();
        jCPLEPvta = new javax.swing.JCheckBox();
        jCMMEPvta = new javax.swing.JCheckBox();
        jCVSinExistPvta = new javax.swing.JCheckBox();
        jCBarrLatP = new javax.swing.JCheckBox();
        jCImgLin = new javax.swing.JCheckBox();
        jCInitPvta = new javax.swing.JCheckBox();
        jCLimCredPVta = new javax.swing.JCheckBox();
        jCEmpsPtoVta = new javax.swing.JCheckBox();
        jCAdmCan = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jComSerF = new com.era.views.comboboxes.SeriesCombobox();
        jComSerT = new com.era.views.comboboxes.SeriesCombobox();
        jLabel23 = new javax.swing.JLabel();
        jComSerR = new com.era.views.comboboxes.SeriesCombobox();
        jLabel24 = new javax.swing.JLabel();
        jTAlma = new javax.swing.JTextField();
        jBAlma = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jCDevPVtaPto = new javax.swing.JCheckBox();
        jCDevVtaPto = new javax.swing.JCheckBox();
        jPRem = new javax.swing.JPanel();
        jCLimCredRem = new javax.swing.JCheckBox();
        jCCanRemPto = new javax.swing.JCheckBox();
        jPTic = new javax.swing.JPanel();
        jCCanTicPto = new javax.swing.JCheckBox();
        jPPrevioCompra = new javax.swing.JPanel();
        jBPrevMonNacional = new javax.swing.JCheckBox();
        jBGuar = new javax.swing.JButton();

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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Configuraciones Generales");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, -1));

        jTBP.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPInven.setName("tab01"); // NOI18N
        jPInven.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBTBajCost.setBackground(new java.awt.Color(255, 255, 255));
        jBTBajCost.setText("+");
        jBTBajCost.setNextFocusableComponent(jBTNoBajCost);
        jPInven.add(jBTBajCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Todos los productos SI se pueden vender a bajo del costo");
        jPInven.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 430, 20));

        jBTNoBajCost.setBackground(new java.awt.Color(255, 255, 255));
        jBTNoBajCost.setText("-");
        jBTNoBajCost.setNextFocusableComponent(jBMaxMin);
        jPInven.add(jBTNoBajCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Todos los productos NO se pueden vender a bajo del costo");
        jPInven.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 33, 460, 20));

        jBMaxMin.setBackground(new java.awt.Color(255, 255, 255));
        jBMaxMin.setText("+");
        jBMaxMin.setNextFocusableComponent(jBNoMaxMin);
        jPInven.add(jBMaxMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 40, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("Todos los productos SI solicitan máximo y mínimo");
        jPInven.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 460, 20));

        jBNoMaxMin.setBackground(new java.awt.Color(255, 255, 255));
        jBNoMaxMin.setText("-");
        jBNoMaxMin.setNextFocusableComponent(jCESExistMov);
        jPInven.add(jBNoMaxMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel26.setText("Todos los productos NO solicitan máximo y mínimo");
        jPInven.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 460, 20));

        jCESExistMov.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCESExistMov.setText("Salidas por concepto con existencias solamente");
        jCESExistMov.setName("inv_esexitmov"); // NOI18N
        jCESExistMov.setNextFocusableComponent(jCTraspasExis);
        jPInven.add(jCESExistMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 430, -1));

        jCTraspasExis.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCTraspasExis.setText("Traspasos con existencias solamente");
        jCTraspasExis.setName("inv_traspasexis"); // NOI18N
        jCTraspasExis.setNextFocusableComponent(jCSerRep);
        jPInven.add(jCTraspasExis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 350, -1));

        jCSerRep.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCSerRep.setText("Permitir almacenar productos con series iguales");
        jCSerRep.setName("inv_igualser"); // NOI18N
        jCSerRep.setNextFocusableComponent(jBTBajCost);
        jPInven.add(jCSerRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 350, -1));

        jTBP.addTab("tab1", jPInven);

        jPFac.setName("tab02"); // NOI18N
        jPFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCPListCFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCPListCFac.setText("Aplicar P. lista de clientes en factura");
        jCPListCFac.setName("vtas_alistpreclifac"); // NOI18N
        jCPListCFac.setNextFocusableComponent(jCMMEFac);
        jPFac.add(jCPListCFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, -1));

        jCMMEFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMMEFac.setText("Mostrar mensaje si no hay existencia en facturas");
        jCMMEFac.setName("vtas_msjexistnegfac"); // NOI18N
        jCMMEFac.setNextFocusableComponent(jCVendSinExistFac);
        jPFac.add(jCMMEFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 300, 20));

        jCVendSinExistFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVendSinExistFac.setText("Vender sin existencia en facturas");
        jCVendSinExistFac.setName("vtas_vendsinexistfac"); // NOI18N
        jPFac.add(jCVendSinExistFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, -1));

        jCLimCredFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCLimCredFac.setText("Vender sobre límite de crédito en facturas");
        jCLimCredFac.setName("vtas_slimcredfac"); // NOI18N
        jPFac.add(jCLimCredFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, -1));

        jCVendMN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVendMN.setText("Vender solo en moneda nacional");
        jCVendMN.setName("vtas_otramon"); // NOI18N
        jPFac.add(jCVendMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 240, -1));

        jCCanFacPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCanFacPto.setText("Se pueden cancelar/devolver facturas en el punto de venta");
        jCCanFacPto.setName("vtas_canfacpto"); // NOI18N
        jPFac.add(jCCanFacPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, -1));

        jCMinFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMinFac.setText("Mínimo a facturar:");
        jCMinFac.setName("vtas_minfac"); // NOI18N
        jCMinFac.setNextFocusableComponent(jTMinFac);
        jPFac.add(jCMinFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));

        jTMinFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMinFac.setNextFocusableComponent(jComSerFac);
        jPFac.add(jTMinFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, 20));

        jPFac.add(jComSerFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel30.setText("Serie de facturas fija:");
        jPFac.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 20));

        jCTestSystem.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCTestSystem.setText("Sistema en prueba");
        jCTestSystem.setName("vtas_minfac"); // NOI18N
        jCTestSystem.setNextFocusableComponent(jTMinFac);
        jPFac.add(jCTestSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, -1));

        jTBP.addTab("tab2", jPFac);

        jPCot.setName("tab03"); // NOI18N
        jPCot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCMMECot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMMECot.setText("Mostrar mensaje si no hay existencia en cotización");
        jCMMECot.setName("cots_msjexistnegcot"); // NOI18N
        jCMMECot.setNextFocusableComponent(jCVSinExistCot);
        jPCot.add(jCMMECot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        jCVSinExistCot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVSinExistCot.setText("Vender sin existencias en cotización");
        jCVSinExistCot.setName("cots_vendsinexistcot"); // NOI18N
        jPCot.add(jCVSinExistCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, -1));

        jCCotMN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCotMN.setText("Cotizar solo en moneda nacional");
        jCCotMN.setName("cots_otramon"); // NOI18N
        jPCot.add(jCCotMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, -1));

        jTBP.addTab("tab3", jPCot);

        jPSis.setName("tab04"); // NOI18N
        jPSis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCDesInac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDesInac.setText("Suspender en inactividad");
        jCDesInac.setName("sist_dlogin"); // NOI18N
        jPSis.add(jCDesInac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Uso de Decimales"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radio_redondea_2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        radio_redondea_2.setText("Uso a 2 posiciones");
        jPanel4.add(radio_redondea_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        radio_redondea_3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        radio_redondea_3.setText("Uso a 3 posiciones");
        jPanel4.add(radio_redondea_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        radio_redondea_4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        radio_redondea_4.setText("Uso a 4 posiciones");
        jPanel4.add(radio_redondea_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        radio_redondea_5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        radio_redondea_5.setText("Uso a 5 posiciones");
        jPanel4.add(radio_redondea_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        radio_redondea_6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        radio_redondea_6.setText("Uso a 6 posiciones");
        jPanel4.add(radio_redondea_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, -1));

        jPSis.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 130));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Uso obligatorio de activo y cuenta contable"));

        jPEnVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("En ventas"));

        jCHActivoVenta.setText("Activo");
        jCHActivoVenta.setName("vtas_activarActivo"); // NOI18N

        jCHCuentaVenta.setText("Cuenta Contable");
        jCHCuentaVenta.setName("vtas_activarCuenta"); // NOI18N

        javax.swing.GroupLayout jPEnVentasLayout = new javax.swing.GroupLayout(jPEnVentas);
        jPEnVentas.setLayout(jPEnVentasLayout);
        jPEnVentasLayout.setHorizontalGroup(
            jPEnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEnVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCHActivoVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jCHCuentaVenta)
                .addContainerGap())
        );
        jPEnVentasLayout.setVerticalGroup(
            jPEnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jCHActivoVenta)
                .addComponent(jCHCuentaVenta))
        );

        jPEnCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("En compras"));

        jCHActivoCompra.setText("Activo");
        jCHActivoCompra.setName("comps_activarActivo"); // NOI18N

        jCHCuentaCompra.setText("Cuenta Contable");
        jCHCuentaCompra.setName("comps_activarCuenta"); // NOI18N

        javax.swing.GroupLayout jPEnComprasLayout = new javax.swing.GroupLayout(jPEnCompras);
        jPEnCompras.setLayout(jPEnComprasLayout);
        jPEnComprasLayout.setHorizontalGroup(
            jPEnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEnComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCHActivoCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCHCuentaCompra)
                .addContainerGap())
        );
        jPEnComprasLayout.setVerticalGroup(
            jPEnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jCHActivoCompra)
                .addComponent(jCHCuentaCompra))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPEnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPEnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPEnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPEnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPSis.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 240, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Versión anexo 20"));

        buttonGroup1.add(rbtVer32);
        rbtVer32.setSelected(true);
        rbtVer32.setText("3.2");

        buttonGroup1.add(rbtVer33);
        rbtVer33.setText("3.3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtVer32)
                    .addComponent(rbtVer33))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(rbtVer32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtVer33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPSis.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 130, 80));

        jTBP.addTab("tab4", jPSis);

        jPComp.setName("tab05"); // NOI18N
        jPComp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCCompMN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCompMN.setText("Solo comprar en moneda nacional");
        jCCompMN.setName("comps_otramon"); // NOI18N
        jPComp.add(jCCompMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jTBP.addTab("tab5", jPComp);

        jPPtoVta.setName("tab06"); // NOI18N
        jPPtoVta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCPLEPvta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCPLEPvta.setText("Aplicar P.lista de clientes en punto de venta");
        jCPLEPvta.setName("vtas_alistpreclipvta"); // NOI18N
        jCPLEPvta.setNextFocusableComponent(jCMMEPvta);
        jPPtoVta.add(jCPLEPvta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jCMMEPvta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMMEPvta.setText("Mostrar mensaje si no hay existencia en punto de venta");
        jCMMEPvta.setName("vtas_msjexistnegpvta"); // NOI18N
        jCMMEPvta.setNextFocusableComponent(jCVSinExistPvta);
        jPPtoVta.add(jCMMEPvta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, -1));

        jCVSinExistPvta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVSinExistPvta.setText("Vender sin existencia en punto de venta");
        jCVSinExistPvta.setName("vtas_vendsinexistpvta"); // NOI18N
        jCVSinExistPvta.setNextFocusableComponent(jCBarrLatP);
        jPPtoVta.add(jCVSinExistPvta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, -1));

        jCBarrLatP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCBarrLatP.setText("Mostrar barra lateral en punto de venta");
        jCBarrLatP.setName("vtas_barlat"); // NOI18N
        jCBarrLatP.setNextFocusableComponent(jCImgLin);
        jPPtoVta.add(jCBarrLatP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, -1));

        jCImgLin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCImgLin.setText("Mostrar imágenes en líneas del punto de venta");
        jCImgLin.setName("vtas_imglin"); // NOI18N
        jCImgLin.setNextFocusableComponent(jCInitPvta);
        jPPtoVta.add(jCImgLin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, -1));

        jCInitPvta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCInitPvta.setText("Iniciar el punto de venta al entrar al sistema");
        jCInitPvta.setName("vtas_initpvta"); // NOI18N
        jPPtoVta.add(jCInitPvta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, -1));

        jCLimCredPVta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCLimCredPVta.setText("Vender sobre límite de crédito en punto de venta");
        jCLimCredPVta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCLimCredPVta.setName("vtas_slimcredpvta"); // NOI18N
        jCLimCredPVta.setNextFocusableComponent(jCEmpsPtoVta);
        jPPtoVta.add(jCLimCredPVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 310, -1));

        jCEmpsPtoVta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCEmpsPtoVta.setText("Dar de alta nuevos clientes en punto de venta");
        jCEmpsPtoVta.setName("vtas_empspto"); // NOI18N
        jPPtoVta.add(jCEmpsPtoVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, -1));

        jCAdmCan.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCAdmCan.setText("Pedir clave de administrador al cancelar/devolver ventas en punto de venta");
        jCAdmCan.setName("vtas_admcanvtas"); // NOI18N
        jPPtoVta.add(jCAdmCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 390, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("Serie remisiones:");
        jPPtoVta.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, -1));

        jComSerF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComSerF.setNextFocusableComponent(jComSerT);
        jPPtoVta.add(jComSerF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 20));

        jComSerT.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComSerT.setNextFocusableComponent(jComSerT);
        jPPtoVta.add(jComSerT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setText("Almacén de venta:");
        jPPtoVta.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 20));

        jComSerR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComSerR.setNextFocusableComponent(jTAlma);
        jPPtoVta.add(jComSerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel24.setText("Serie tickets:");
        jPPtoVta.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, -1));

        jTAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAlma.setNextFocusableComponent(jBAlma);
        jPPtoVta.add(jTAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 20));

        jBAlma.setBackground(new java.awt.Color(255, 255, 255));
        jBAlma.setText("jButton1");
        jBAlma.setToolTipText("Buscar Almacén(es)");
        jPPtoVta.add(jBAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel25.setText("Serie facturas:");
        jPPtoVta.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        jCDevPVtaPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDevPVtaPto.setText("Devoluciones parciales de ventas en punto de venta");
        jCDevPVtaPto.setName("vtas_devvtaspto"); // NOI18N
        jPPtoVta.add(jCDevPVtaPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 270, -1));

        jCDevVtaPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDevVtaPto.setText("Devoluciones de ventas en punto de venta");
        jCDevVtaPto.setName("vtas_devvtaspto"); // NOI18N
        jCDevVtaPto.setNextFocusableComponent(jCDevPVtaPto);
        jPPtoVta.add(jCDevVtaPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 270, -1));

        jTBP.addTab("tab6", jPPtoVta);

        jPRem.setName("tab07"); // NOI18N
        jPRem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCLimCredRem.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCLimCredRem.setText("Vender sobre límite de crédito en remisiones");
        jCLimCredRem.setName("vtas_slimcredrem"); // NOI18N
        jPRem.add(jCLimCredRem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        jCCanRemPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCanRemPto.setText("Se pueden cancelar/devolver remisiones en el punto de venta");
        jCCanRemPto.setName("vtas_canrempto"); // NOI18N
        jPRem.add(jCCanRemPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, -1));

        jTBP.addTab("tab7", jPRem);

        jPTic.setName("tab08"); // NOI18N
        jPTic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCCanTicPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCanTicPto.setText("Se pueden cancelar/devolver tickets en el punto de venta");
        jCCanTicPto.setName("vtas_canticpto"); // NOI18N
        jPTic.add(jCCanTicPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, -1));

        jTBP.addTab("tab8", jPTic);

        jPPrevioCompra.setName("tab10"); // NOI18N

        jBPrevMonNacional.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBPrevMonNacional.setText("Solo previos de compra en moneda nacional");
        jBPrevMonNacional.setToolTipText("Solo comprar en moneda nacional");
        jBPrevMonNacional.setName("prev_prevmonac"); // NOI18N

        javax.swing.GroupLayout jPPrevioCompraLayout = new javax.swing.GroupLayout(jPPrevioCompra);
        jPPrevioCompra.setLayout(jPPrevioCompraLayout);
        jPPrevioCompraLayout.setHorizontalGroup(
            jPPrevioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrevioCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBPrevMonNacional)
                .addContainerGap(630, Short.MAX_VALUE))
        );
        jPPrevioCompraLayout.setVerticalGroup(
            jPPrevioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrevioCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBPrevMonNacional)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        jTBP.addTab("tab10", jPPrevioCompra);

        jP1.add(jTBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 400));
        jTBP.getAccessibleContext().setAccessibleName("\"Inventarios\"");

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jCPListCFac);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    protected javax.swing.JButton jBAlma;
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBMaxMin;
    protected javax.swing.JButton jBNoMaxMin;
    protected javax.swing.JCheckBox jBPrevMonNacional;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBTBajCost;
    protected javax.swing.JButton jBTNoBajCost;
    protected javax.swing.JCheckBox jCAdmCan;
    protected javax.swing.JCheckBox jCBarrLatP;
    protected javax.swing.JCheckBox jCCanFacPto;
    protected javax.swing.JCheckBox jCCanRemPto;
    protected javax.swing.JCheckBox jCCanTicPto;
    protected javax.swing.JCheckBox jCCompMN;
    protected javax.swing.JCheckBox jCCotMN;
    protected javax.swing.JCheckBox jCDesInac;
    protected javax.swing.JCheckBox jCDevPVtaPto;
    protected javax.swing.JCheckBox jCDevVtaPto;
    protected javax.swing.JCheckBox jCESExistMov;
    protected javax.swing.JCheckBox jCEmpsPtoVta;
    private javax.swing.JCheckBox jCHActivoCompra;
    private javax.swing.JCheckBox jCHActivoVenta;
    private javax.swing.JCheckBox jCHCuentaCompra;
    private javax.swing.JCheckBox jCHCuentaVenta;
    protected javax.swing.JCheckBox jCImgLin;
    protected javax.swing.JCheckBox jCInitPvta;
    protected javax.swing.JCheckBox jCLimCredFac;
    protected javax.swing.JCheckBox jCLimCredPVta;
    protected javax.swing.JCheckBox jCLimCredRem;
    protected javax.swing.JCheckBox jCMMECot;
    protected javax.swing.JCheckBox jCMMEFac;
    protected javax.swing.JCheckBox jCMMEPvta;
    protected javax.swing.JCheckBox jCMinFac;
    protected javax.swing.JCheckBox jCPLEPvta;
    protected javax.swing.JCheckBox jCPListCFac;
    protected javax.swing.JCheckBox jCSerRep;
    protected javax.swing.JCheckBox jCTestSystem;
    protected javax.swing.JCheckBox jCTraspasExis;
    protected javax.swing.JCheckBox jCVSinExistCot;
    protected javax.swing.JCheckBox jCVSinExistPvta;
    protected javax.swing.JCheckBox jCVendMN;
    protected javax.swing.JCheckBox jCVendSinExistFac;
    protected com.era.views.comboboxes.SeriesCombobox jComSerF;
    protected com.era.views.comboboxes.SeriesCombobox jComSerFac;
    protected com.era.views.comboboxes.SeriesCombobox jComSerR;	
    protected com.era.views.comboboxes.SeriesCombobox jComSerT;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel21;
    protected javax.swing.JLabel jLabel22;
    protected javax.swing.JLabel jLabel23;
    protected javax.swing.JLabel jLabel24;
    protected javax.swing.JLabel jLabel25;
    protected javax.swing.JLabel jLabel26;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPComp;
    private javax.swing.JPanel jPCot;
    private javax.swing.JPanel jPEnCompras;
    private javax.swing.JPanel jPEnVentas;
    private javax.swing.JPanel jPFac;
    protected javax.swing.JPanel jPInven;
    private javax.swing.JPanel jPPrevioCompra;
    private javax.swing.JPanel jPPtoVta;
    private javax.swing.JPanel jPRem;
    private javax.swing.JPanel jPSis;
    private javax.swing.JPanel jPTic;
    protected javax.swing.JPanel jPanel4;
    protected javax.swing.JPanel jPanel5;
    protected javax.swing.JPanel jPanel8;
    protected javax.swing.JTextField jTAlma;
    protected javax.swing.JTabbedPane jTBP;
    protected javax.swing.JTextField jTMinFac;
    protected javax.swing.JRadioButton radio_redondea_2;
    protected javax.swing.JRadioButton radio_redondea_3;
    protected javax.swing.JRadioButton radio_redondea_4;
    protected javax.swing.JRadioButton radio_redondea_5;
    protected javax.swing.JRadioButton radio_redondea_6;
    private javax.swing.JRadioButton rbtVer32;
    private javax.swing.JRadioButton rbtVer33;
    // End of variables declaration//GEN-END:variables

}
