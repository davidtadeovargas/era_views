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
        jCMosLogFac = new javax.swing.JCheckBox();
        jCLimCredFac = new javax.swing.JCheckBox();
        jCVtasXUsr = new javax.swing.JCheckBox();
        jCVendMN = new javax.swing.JCheckBox();
        jCVFacPto = new javax.swing.JCheckBox();
        jCImpFacPto = new javax.swing.JCheckBox();
        jCCanFacPto = new javax.swing.JCheckBox();
        jCMosTicCanF = new javax.swing.JCheckBox();
        jCGuaPDFCanF = new javax.swing.JCheckBox();
        jCClavFac = new javax.swing.JCheckBox();
        jTClavFac = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCModPrecFac = new javax.swing.JCheckBox();
        jCModDescripFac = new javax.swing.JCheckBox();
        jCGaraF = new javax.swing.JCheckBox();
        jCModListF = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        jTAlmaVta = new javax.swing.JTextField();
        jBAlmaVta = new javax.swing.JButton();
        jCMinFac = new javax.swing.JCheckBox();
        jTMinFac = new javax.swing.JTextField();
        jComSerFac = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComMonFac = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextPlantilla = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPCot = new javax.swing.JPanel();
        jCPLCot = new javax.swing.JCheckBox();
        jCMMECot = new javax.swing.JCheckBox();
        jCVSinExistCot = new javax.swing.JCheckBox();
        jCCotsXUsr = new javax.swing.JCheckBox();
        jCCotMN = new javax.swing.JCheckBox();
        jCModDescripCot = new javax.swing.JCheckBox();
        jCModPrecCot = new javax.swing.JCheckBox();
        jCGaraC = new javax.swing.JCheckBox();
        jCModListC = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jTAlmaCot = new javax.swing.JTextField();
        jBAlmaCot = new javax.swing.JButton();
        jPSis = new javax.swing.JPanel();
        jCDesInac = new javax.swing.JCheckBox();
        jTMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBBuscCum = new javax.swing.JButton();
        jBCargCum = new javax.swing.JButton();
        jBDelCum = new javax.swing.JButton();
        jTCumple = new javax.swing.JTextField();
        jTAsun = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBVerAgra = new javax.swing.JButton();
        jBCargAgra = new javax.swing.JButton();
        jBDelAgra = new javax.swing.JButton();
        jTAsunAgra = new javax.swing.JTextField();
        jTCuerAgra = new javax.swing.JTextField();
        jTDias = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTRutCalc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBCalc = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTRutCuade = new javax.swing.JTextField();
        jBCuade = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTRutAp = new javax.swing.JTextField();
        jBApFav = new javax.swing.JButton();
        jTUsrCump = new javax.swing.JTextField();
        jBUsrCump = new javax.swing.JButton();
        jTUsrAgra = new javax.swing.JTextField();
        jBUsrAgra = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jBVerCXC1 = new javax.swing.JButton();
        jBCXC1 = new javax.swing.JButton();
        jBDelCXC1 = new javax.swing.JButton();
        jBVerCXC2 = new javax.swing.JButton();
        jBCXC2 = new javax.swing.JButton();
        jBDelCXC2 = new javax.swing.JButton();
        jBVerCXC3 = new javax.swing.JButton();
        jBCXC3 = new javax.swing.JButton();
        jBDelCXC3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jCUsrMulti = new javax.swing.JCheckBox();
        jCMosMsjConfCorr = new javax.swing.JCheckBox();
        jCDefTipCamSis = new javax.swing.JCheckBox();
        jCRedon = new javax.swing.JCheckBox();
        jTRedon = new javax.swing.JTextField();
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
        jCCompXUsr = new javax.swing.JCheckBox();
        jCCompMN = new javax.swing.JCheckBox();
        jCModDescripComp = new javax.swing.JCheckBox();
        jCModPrecComp = new javax.swing.JCheckBox();
        jCIniOrd = new javax.swing.JCheckBox();
        jPPtoVta = new javax.swing.JPanel();
        jCPLEPvta = new javax.swing.JCheckBox();
        jCMMEPvta = new javax.swing.JCheckBox();
        jCVSinExistPvta = new javax.swing.JCheckBox();
        jCBarrLatP = new javax.swing.JCheckBox();
        jCImgLin = new javax.swing.JCheckBox();
        jCInitPvta = new javax.swing.JCheckBox();
        jCLimCredPVta = new javax.swing.JCheckBox();
        jCEmpsPtoVta = new javax.swing.JCheckBox();
        jCDescrip = new javax.swing.JCheckBox();
        jCAdmCan = new javax.swing.JCheckBox();
        jCMsjPto = new javax.swing.JCheckBox();
        jCChatPtoC = new javax.swing.JCheckBox();
        jTDinCaj = new javax.swing.JTextField();
        jCInsAutCaj = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jTClavFacP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jCClavFacP = new javax.swing.JCheckBox();
        jCCortXAut = new javax.swing.JCheckBox();
        jCDiaVtaP = new javax.swing.JCheckBox();
        jCCortXA = new javax.swing.JCheckBox();
        jCCortZA = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jComSerF = new javax.swing.JComboBox();
        jComSerT = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jComSerR = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jTAlma = new javax.swing.JTextField();
        jBAlma = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jCGaraP = new javax.swing.JCheckBox();
        jCDevPVtaPto = new javax.swing.JCheckBox();
        jCDevVtaPto = new javax.swing.JCheckBox();
        jCFacPto = new javax.swing.JCheckBox();
        jCRemPto = new javax.swing.JCheckBox();
        jPRem = new javax.swing.JPanel();
        jCMosLogRem = new javax.swing.JCheckBox();
        jCLimCredRem = new javax.swing.JCheckBox();
        jCVRemPto = new javax.swing.JCheckBox();
        jCImpRemPto = new javax.swing.JCheckBox();
        jCCanRemPto = new javax.swing.JCheckBox();
        jPTic = new javax.swing.JPanel();
        jCMosLogTik = new javax.swing.JCheckBox();
        jCVTicPto = new javax.swing.JCheckBox();
        jCImpTicPto = new javax.swing.JCheckBox();
        jCCanTicPto = new javax.swing.JCheckBox();
        jCMosTicCanPto = new javax.swing.JCheckBox();
        jCGuaPDFCanPto = new javax.swing.JCheckBox();
        jPPrevioCompra = new javax.swing.JPanel();
        jBPrevUsuario = new javax.swing.JCheckBox();
        jBPrevMonNacional = new javax.swing.JCheckBox();
        jBPrevModDesc = new javax.swing.JCheckBox();
        jBPrevModPrec = new javax.swing.JCheckBox();
        jBPrevCotunaSerie = new javax.swing.JCheckBox();
        jBPrevSerObli = new javax.swing.JCheckBox();
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 120, 30));

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

        jCMosLogFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMosLogFac.setText("Mostrar logo en facturas y remisiones");
        jCMosLogFac.setName("vtas_logofac"); // NOI18N
        jCMosLogFac.setNextFocusableComponent(jCLimCredFac);
        jPFac.add(jCMosLogFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 290, -1));

        jCLimCredFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCLimCredFac.setText("Vender sobre límite de crédito en facturas");
        jCLimCredFac.setName("vtas_slimcredfac"); // NOI18N
        jCLimCredFac.setNextFocusableComponent(jCVtasXUsr);
        jPFac.add(jCLimCredFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, -1));

        jCVtasXUsr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVtasXUsr.setText("Mostrar solo ventas de usuario");
        jCVtasXUsr.setName("vtas_vtasxusr"); // NOI18N
        jCVtasXUsr.setNextFocusableComponent(jCVendMN);
        jPFac.add(jCVtasXUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, -1));

        jCVendMN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVendMN.setText("Vender solo en moneda nacional");
        jCVendMN.setName("vtas_otramon"); // NOI18N
        jCVendMN.setNextFocusableComponent(jCCortXA);
        jPFac.add(jCVendMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, -1));

        jCVFacPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVFacPto.setText("Mostrar facturas en buscador del punto de venta");
        jCVFacPto.setName("vtas_vfacptovta"); // NOI18N
        jCVFacPto.setNextFocusableComponent(jCImpFacPto);
        jPFac.add(jCVFacPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, -1));

        jCImpFacPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCImpFacPto.setText("Se pueden imprimir facturas en punto de venta");
        jCImpFacPto.setName("vtas_impfacpto"); // NOI18N
        jCImpFacPto.setNextFocusableComponent(jCCanFacPto);
        jPFac.add(jCImpFacPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 270, -1));

        jCCanFacPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCanFacPto.setText("Se pueden cancelar/devolver facturas en el punto de venta");
        jCCanFacPto.setName("vtas_canfacpto"); // NOI18N
        jCCanFacPto.setNextFocusableComponent(jCMosTicCanF);
        jPFac.add(jCCanFacPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 300, -1));

        jCMosTicCanF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMosTicCanF.setText("Mostrar ticket de cancelación o devolución en facturas");
        jCMosTicCanF.setName("vtas_vercanvtaf"); // NOI18N
        jCMosTicCanF.setNextFocusableComponent(jCGuaPDFCanF);
        jPFac.add(jCMosTicCanF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 320, -1));

        jCGuaPDFCanF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGuaPDFCanF.setText("Guardar PDF de cancelación o devolución en facturas");
        jCGuaPDFCanF.setName("vtas_guapdfcanf"); // NOI18N
        jCGuaPDFCanF.setNextFocusableComponent(jCClavFac);
        jPFac.add(jCGuaPDFCanF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 300, -1));

        jCClavFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCClavFac.setText("Pedir clave de seguridad cada que se factura");
        jCClavFac.setName("vtas_clavsegfacp"); // NOI18N
        jCClavFac.setNextFocusableComponent(jTClavFac);
        jPFac.add(jCClavFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 290, -1));

        jTClavFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPFac.add(jTClavFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 160, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("Clave:");
        jPFac.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 285, 60, -1));

        jCModPrecFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModPrecFac.setText("Modificar precio del producto");
        jCModPrecFac.setName("vtas_modprec"); // NOI18N
        jCModPrecFac.setNextFocusableComponent(jCGaraF);
        jPFac.add(jCModPrecFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 240, -1));

        jCModDescripFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModDescripFac.setText("Modificar descripción del producto");
        jCModDescripFac.setName("vtas_moddescrip"); // NOI18N
        jCModDescripFac.setNextFocusableComponent(jCModPrecFac);
        jPFac.add(jCModDescripFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));

        jCGaraF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGaraF.setText("Agregar garantía de producto en descripción (aplica igual remisiones)");
        jCGaraF.setName("vtas_garandescfac"); // NOI18N
        jCGaraF.setNextFocusableComponent(jCModListF);
        jPFac.add(jCGaraF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 370, -1));

        jCModListF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModListF.setText("Modificar lista de precio");
        jCModListF.setName("vtas_modlistfac"); // NOI18N
        jCModListF.setNextFocusableComponent(jTAlmaVta);
        jPFac.add(jCModListF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 240, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel27.setText("Moneda de facturas fija:");
        jPFac.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 130, 20));

        jTAlmaVta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAlmaVta.setNextFocusableComponent(jBAlmaVta);
        jPFac.add(jTAlmaVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 100, 20));

        jBAlmaVta.setBackground(new java.awt.Color(255, 255, 255));
        jBAlmaVta.setText("jButton1");
        jBAlmaVta.setToolTipText("Buscar Almacén(es)");
        jBAlmaVta.setNextFocusableComponent(jCMinFac);
        jPFac.add(jBAlmaVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 30, 20));

        jCMinFac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMinFac.setText("Mínimo a facturar:");
        jCMinFac.setName("vtas_minfac"); // NOI18N
        jCMinFac.setNextFocusableComponent(jTMinFac);
        jPFac.add(jCMinFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 140, -1));

        jTMinFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMinFac.setNextFocusableComponent(jComSerFac);
        jPFac.add(jTMinFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 100, 20));

        jComSerFac.setNextFocusableComponent(jComMonFac);
        jPFac.add(jComSerFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel29.setText("Almacén de venta:");
        jPFac.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 100, 20));

        jComMonFac.setNextFocusableComponent(jCPListCFac);
        jPFac.add(jComMonFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 90, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel30.setText("Serie de facturas fija:");
        jPFac.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 130, 20));

        jLabel31.setText("Plantilla");
        jPFac.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jPFac.add(jTextPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 360, -1));

        jButton1.setText("jButton1");
        jPFac.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 30, 20));

        jTBP.addTab("tab2", jPFac);

        jPCot.setName("tab03"); // NOI18N
        jPCot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCPLCot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCPLCot.setText("Aplicar precio de lista de clientes en cotizaciones");
        jCPLCot.setName("cots_alistpreclicot"); // NOI18N
        jCPLCot.setNextFocusableComponent(jCMMECot);
        jPCot.add(jCPLCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, -1));

        jCMMECot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMMECot.setText("Mostrar mensaje si no hay existencia en cotización");
        jCMMECot.setName("cots_msjexistnegcot"); // NOI18N
        jCMMECot.setNextFocusableComponent(jCVSinExistCot);
        jPCot.add(jCMMECot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, -1));

        jCVSinExistCot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVSinExistCot.setText("Vender sin existencias en cotización");
        jCVSinExistCot.setName("cots_vendsinexistcot"); // NOI18N
        jCVSinExistCot.setNextFocusableComponent(jCCotsXUsr);
        jPCot.add(jCVSinExistCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, -1));

        jCCotsXUsr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCotsXUsr.setText("Mostrar solo cotizaciones de usuario");
        jCCotsXUsr.setName("cots_cotsxusr"); // NOI18N
        jCCotsXUsr.setNextFocusableComponent(jCCotMN);
        jPCot.add(jCCotsXUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, -1));

        jCCotMN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCotMN.setText("Cotizar solo en moneda nacional");
        jCCotMN.setName("cots_otramon"); // NOI18N
        jCCotMN.setNextFocusableComponent(jCModDescripCot);
        jPCot.add(jCCotMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, -1));

        jCModDescripCot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModDescripCot.setText("Modificar descripción del producto");
        jCModDescripCot.setName("cots_moddescrip"); // NOI18N
        jCModDescripCot.setNextFocusableComponent(jCModPrecCot);
        jPCot.add(jCModDescripCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, -1));

        jCModPrecCot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModPrecCot.setText("Modificar precio del producto");
        jCModPrecCot.setName("cots_modprec"); // NOI18N
        jCModPrecCot.setNextFocusableComponent(jCGaraC);
        jPCot.add(jCModPrecCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, -1));

        jCGaraC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGaraC.setText("Agregar garantía de producto en descripción");
        jCGaraC.setName("cots_garadesccot"); // NOI18N
        jCGaraC.setNextFocusableComponent(jCModListC);
        jPCot.add(jCGaraC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));

        jCModListC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModListC.setText("Modificar lista de precio");
        jCModListC.setName("cots_modlistcot"); // NOI18N
        jCModListC.setNextFocusableComponent(jTAlmaCot);
        jPCot.add(jCModListC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel28.setText("Almacén cotización:");
        jPCot.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));

        jTAlmaCot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAlmaCot.setNextFocusableComponent(jBAlmaCot);
        jPCot.add(jTAlmaCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, 20));

        jBAlmaCot.setBackground(new java.awt.Color(255, 255, 255));
        jBAlmaCot.setText("jButton1");
        jBAlmaCot.setToolTipText("Buscar Almacén(es)");
        jBAlmaCot.setNextFocusableComponent(jCPLCot);
        jPCot.add(jBAlmaCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 30, 20));

        jTBP.addTab("tab3", jPCot);

        jPSis.setName("tab04"); // NOI18N
        jPSis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCDesInac.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDesInac.setText("Suspender en inactividad");
        jCDesInac.setName("sist_dlogin"); // NOI18N
        jPSis.add(jCDesInac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        jTMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMin.setNextFocusableComponent(jBCargCum);
        jPSis.add(jTMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 40, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("Asunto");
        jPSis.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        jBBuscCum.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscCum.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBBuscCum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBBuscCum.setToolTipText("Ver Imágen en Tamaño Completo");
        jBBuscCum.setNextFocusableComponent(jTUsrCump);
        jPSis.add(jBBuscCum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 91, 20, 16));

        jBCargCum.setBackground(new java.awt.Color(255, 255, 255));
        jBCargCum.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBCargCum.setText("Cargar");
        jBCargCum.setNextFocusableComponent(jBDelCum);
        jPSis.add(jBCargCum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, 70, 16));

        jBDelCum.setBackground(new java.awt.Color(255, 255, 255));
        jBDelCum.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBDelCum.setText("Borrar");
        jBDelCum.setNextFocusableComponent(jBBuscCum);
        jPSis.add(jBDelCum, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 91, 70, 16));

        jTCumple.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTCumple.setForeground(new java.awt.Color(0, 102, 0));
        jTCumple.setToolTipText("Automàticamente se agrega el nombre de la empresa al final del texto escrito");
        jTCumple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCumple.setNextFocusableComponent(jBCargAgra);
        jPSis.add(jTCumple, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 20));

        jTAsun.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTAsun.setForeground(new java.awt.Color(0, 102, 0));
        jTAsun.setToolTipText("Asunto del Correo de Cumpleaños");
        jTAsun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsun.setNextFocusableComponent(jTCumple);
        jPSis.add(jTAsun, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("Minutos");
        jPSis.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Cuerpo");
        jPSis.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Ruta aplicación favorita:");
        jPSis.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("Días:");
        jPSis.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 30, 10));

        jBVerAgra.setBackground(new java.awt.Color(255, 255, 255));
        jBVerAgra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBVerAgra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVerAgra.setToolTipText("Ver Imágen en Tamaño Completo");
        jBVerAgra.setNextFocusableComponent(jTUsrAgra);
        jPSis.add(jBVerAgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 191, 20, 16));

        jBCargAgra.setBackground(new java.awt.Color(255, 255, 255));
        jBCargAgra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBCargAgra.setText("Cargar");
        jBCargAgra.setNextFocusableComponent(jBDelAgra);
        jPSis.add(jBCargAgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, 70, 16));

        jBDelAgra.setBackground(new java.awt.Color(255, 255, 255));
        jBDelAgra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBDelAgra.setText("Borrar");
        jBDelAgra.setNextFocusableComponent(jBVerAgra);
        jPSis.add(jBDelAgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 191, 70, 16));

        jTAsunAgra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunAgra.setNextFocusableComponent(jTDias);
        jPSis.add(jTAsunAgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 20));

        jTCuerAgra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerAgra.setNextFocusableComponent(jTRutCalc);
        jPSis.add(jTCuerAgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 160, 20));

        jTDias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDias.setText("0");
        jTDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDias.setNextFocusableComponent(jTCuerAgra);
        jPSis.add(jTDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 40, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Asunto");
        jPSis.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 10));

        jTRutCalc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRutCalc.setNextFocusableComponent(jBCalc);
        jPSis.add(jTRutCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, 250, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Imágen para recordatorio CXC 3:");
        jPSis.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 280, 10));

        jBCalc.setBackground(new java.awt.Color(255, 255, 255));
        jBCalc.setText("jButton1");
        jBCalc.setToolTipText("Buscar Ruta a Calculadora");
        jBCalc.setNextFocusableComponent(jTRutCuade);
        jPSis.add(jBCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 275, 30, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Ruta calculadora:");
        jPSis.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, -1));

        jTRutCuade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRutCuade.setNextFocusableComponent(jBCuade);
        jPSis.add(jTRutCuade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 315, 250, 20));

        jBCuade.setBackground(new java.awt.Color(255, 255, 255));
        jBCuade.setText("jButton1");
        jBCuade.setToolTipText("Buscar Ruta a Cuaderno");
        jBCuade.setNextFocusableComponent(jTRutAp);
        jPSis.add(jBCuade, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 315, 30, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Ruta cuaderno:");
        jPSis.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 230, -1));

        jTRutAp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRutAp.setNextFocusableComponent(jBApFav);
        jPSis.add(jTRutAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, 250, 20));

        jBApFav.setBackground(new java.awt.Color(255, 255, 255));
        jBApFav.setText("jButton1");
        jBApFav.setName(""); // NOI18N
        jBApFav.setNextFocusableComponent(jBDelCXC1);
        jPSis.add(jBApFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 355, 30, 20));

        jTUsrCump.setToolTipText("Usuario del que se mandarán los correos automáticamente de Cumpleaños");
        jTUsrCump.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUsrCump.setNextFocusableComponent(jBUsrCump);
        jPSis.add(jTUsrCump, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, 20));

        jBUsrCump.setBackground(new java.awt.Color(255, 255, 255));
        jBUsrCump.setText("...");
        jBUsrCump.setToolTipText("Buscar Usuario(s)");
        jBUsrCump.setNextFocusableComponent(jTAsun);
        jPSis.add(jBUsrCump, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 30, 20));

        jTUsrAgra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUsrAgra.setNextFocusableComponent(jBUsrAgra);
        jPSis.add(jTUsrAgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 90, 20));

        jBUsrAgra.setBackground(new java.awt.Color(255, 255, 255));
        jBUsrAgra.setText("...");
        jBUsrAgra.setToolTipText("Buscar Usuario(s)");
        jBUsrAgra.setNextFocusableComponent(jTAsunAgra);
        jPSis.add(jBUsrAgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 30, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("Cuerpo");
        jPSis.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 10));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText("Configuación de correo de cumpleaños:");
        jPSis.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("Configuación de correo de agradecimiento:");
        jPSis.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, 20));

        jBVerCXC1.setBackground(new java.awt.Color(255, 255, 255));
        jBVerCXC1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBVerCXC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVerCXC1.setToolTipText("Ver Imágen en Tamaño Completo");
        jBVerCXC1.setNextFocusableComponent(jBDelCXC2);
        jPSis.add(jBVerCXC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 20, 16));

        jBCXC1.setBackground(new java.awt.Color(255, 255, 255));
        jBCXC1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBCXC1.setText("Cargar");
        jBCXC1.setNextFocusableComponent(jBDelCXC1);
        jPSis.add(jBCXC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 70, 16));

        jBDelCXC1.setBackground(new java.awt.Color(255, 255, 255));
        jBDelCXC1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBDelCXC1.setText("Borrar");
        jBDelCXC1.setNextFocusableComponent(jBVerCXC1);
        jPSis.add(jBDelCXC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 70, 16));

        jBVerCXC2.setBackground(new java.awt.Color(255, 255, 255));
        jBVerCXC2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBVerCXC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVerCXC2.setToolTipText("Ver Imágen en Tamaño Completo");
        jBVerCXC2.setNextFocusableComponent(jBDelCXC3);
        jPSis.add(jBVerCXC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 20, 16));

        jBCXC2.setBackground(new java.awt.Color(255, 255, 255));
        jBCXC2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBCXC2.setText("Cargar");
        jBCXC2.setNextFocusableComponent(jBDelCXC2);
        jPSis.add(jBCXC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 70, 16));

        jBDelCXC2.setBackground(new java.awt.Color(255, 255, 255));
        jBDelCXC2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBDelCXC2.setText("Borrar");
        jBDelCXC2.setNextFocusableComponent(jBVerCXC2);
        jPSis.add(jBDelCXC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 70, 16));

        jBVerCXC3.setBackground(new java.awt.Color(255, 255, 255));
        jBVerCXC3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBVerCXC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVerCXC3.setToolTipText("Ver Imágen en Tamaño Completo");
        jBVerCXC3.setNextFocusableComponent(jCUsrMulti);
        jPSis.add(jBVerCXC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 20, 16));

        jBCXC3.setBackground(new java.awt.Color(255, 255, 255));
        jBCXC3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBCXC3.setText("Cargar");
        jBCXC3.setNextFocusableComponent(jBDelCXC3);
        jPSis.add(jBCXC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 70, 16));

        jBDelCXC3.setBackground(new java.awt.Color(255, 255, 255));
        jBDelCXC3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBDelCXC3.setText("Borrar");
        jBDelCXC3.setNextFocusableComponent(jBVerCXC3);
        jPSis.add(jBDelCXC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 70, 16));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("Imágen para recordatorio CXC 1:");
        jPSis.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 280, 10));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel20.setText("Imágen para recordatorio CXC 2:");
        jPSis.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 280, 10));

        jCUsrMulti.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCUsrMulti.setText("Usuarios pueden iniciar múltiples sesiones");
        jCUsrMulti.setName("sist_usrmulti"); // NOI18N
        jCUsrMulti.setNextFocusableComponent(jCMosMsjConfCorr);
        jPSis.add(jCUsrMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 300, -1));

        jCMosMsjConfCorr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMosMsjConfCorr.setText("Mostrar mensaje de configuraciones de correos electrónicos");
        jCMosMsjConfCorr.setName("sist_mostmsjusr"); // NOI18N
        jCMosMsjConfCorr.setNextFocusableComponent(jCDefTipCamSis);
        jPSis.add(jCMosMsjConfCorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 310, -1));

        jCDefTipCamSis.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDefTipCamSis.setText("Definir tipo de cambio en todo el sistema");
        jCDefTipCamSis.setName("sist_tipcamtod"); // NOI18N
        jCDefTipCamSis.setNextFocusableComponent(jCRedon);
        jPSis.add(jCDefTipCamSis, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 240, -1));

        jCRedon.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCRedon.setText("Redondear totales en posiciones:");
        jCRedon.setToolTipText("Redondear los totales en ventas y cotizaciones");
        jCRedon.setName("sist_redon"); // NOI18N
        jCRedon.setNextFocusableComponent(jTRedon);
        jPSis.add(jCRedon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 250, 20));

        jTRedon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRedon.setNextFocusableComponent(jCDesInac);
        jPSis.add(jTRedon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 20));

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

        jPSis.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 140, 130));

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

        jPSis.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 240, -1));

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

        jPSis.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 130, 80));

        jTBP.addTab("tab4", jPSis);

        jPComp.setName("tab05"); // NOI18N
        jPComp.setNextFocusableComponent(jCCompXUsr);
        jPComp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCCompXUsr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCompXUsr.setText("Mostrar solo compras de usuario");
        jCCompXUsr.setName("comps_compsxusr"); // NOI18N
        jCCompXUsr.setNextFocusableComponent(jCCompMN);
        jPComp.add(jCCompXUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, -1));

        jCCompMN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCompMN.setText("Solo comprar en moneda nacional");
        jCCompMN.setName("comps_otramon"); // NOI18N
        jCCompMN.setNextFocusableComponent(jCModDescripComp);
        jPComp.add(jCCompMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, -1));

        jCModDescripComp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModDescripComp.setText("Modificar descripción del producto");
        jCModDescripComp.setName("comps_moddescrip"); // NOI18N
        jCModDescripComp.setNextFocusableComponent(jCModPrecComp);
        jPComp.add(jCModDescripComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, -1));

        jCModPrecComp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCModPrecComp.setText("Modificar precio del producto");
        jCModPrecComp.setName("comps_modprec"); // NOI18N
        jCModPrecComp.setNextFocusableComponent(jCIniOrd);
        jPComp.add(jCModPrecComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, -1));

        jCIniOrd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCIniOrd.setText("Iniciar con orden de compra");
        jCIniOrd.setName("comps_iniord"); // NOI18N
        jCIniOrd.setNextFocusableComponent(jCCompXUsr);
        jPComp.add(jCIniOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 230, -1));

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
        jCEmpsPtoVta.setNextFocusableComponent(jCDescrip);
        jPPtoVta.add(jCEmpsPtoVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, -1));

        jCDescrip.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDescrip.setText("Modificar descripción de productos en punto de venta");
        jCDescrip.setName("vtas_descrippto"); // NOI18N
        jCDescrip.setNextFocusableComponent(jCAdmCan);
        jPPtoVta.add(jCDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, -1));

        jCAdmCan.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCAdmCan.setText("Pedir clave de administrador al cancelar/devolver ventas en punto de venta");
        jCAdmCan.setName("vtas_admcanvtas"); // NOI18N
        jCAdmCan.setNextFocusableComponent(jCMsjPto);
        jPPtoVta.add(jCAdmCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 390, -1));

        jCMsjPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMsjPto.setText("Ver mensajes en el punto de venta");
        jCMsjPto.setName("vtas_vmsjpto"); // NOI18N
        jCMsjPto.setNextFocusableComponent(jCChatPtoC);
        jPPtoVta.add(jCMsjPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 320, -1));

        jCChatPtoC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCChatPtoC.setText("Chatear corporativamente en punto de venta");
        jCChatPtoC.setName("vtas_chatptoc"); // NOI18N
        jCChatPtoC.setNextFocusableComponent(jCInsAutCaj);
        jPPtoVta.add(jCChatPtoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 320, -1));

        jTDinCaj.setText("$0.00");
        jTDinCaj.setNextFocusableComponent(jCClavFacP);
        jPPtoVta.add(jTDinCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, -1));

        jCInsAutCaj.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCInsAutCaj.setText("Insertar automáticamente dinero en el cajón");
        jCInsAutCaj.setName("vtas_insautcaj"); // NOI18N
        jCInsAutCaj.setNextFocusableComponent(jTDinCaj);
        jPPtoVta.add(jCInsAutCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("$:");
        jPPtoVta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 273, 20, -1));

        jTClavFacP.setNextFocusableComponent(jCCortXAut);
        jPPtoVta.add(jTClavFacP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 160, -1));

        jLabel15.setText("Clave:");
        jPPtoVta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, 20));

        jCClavFacP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCClavFacP.setText("Pedir clave de seguridad cada que se factura");
        jCClavFacP.setName("vtas_clavsegfacp"); // NOI18N
        jCClavFacP.setNextFocusableComponent(jTClavFacP);
        jPPtoVta.add(jCClavFacP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 290, 20));

        jCCortXAut.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCortXAut.setText("Hacer corte X automáticamente al inicio de usuario");
        jCCortXAut.setName("vtas_autcortx"); // NOI18N
        jCCortXAut.setNextFocusableComponent(jCDiaVtaP);
        jPPtoVta.add(jCCortXAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 340, -1));

        jCDiaVtaP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDiaVtaP.setText("Solo se muestran las ventas del día en punto de venta");
        jCDiaVtaP.setName("vtas_hoyvtap"); // NOI18N
        jCDiaVtaP.setNextFocusableComponent(jCCortXA);
        jPPtoVta.add(jCDiaVtaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 330, -1));

        jCCortXA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCortXA.setText("Guardar automáticamente corte X en PDF");
        jCCortXA.setName("vtas_cortxa"); // NOI18N
        jCCortXA.setNextFocusableComponent(jCCortZA);
        jPPtoVta.add(jCCortXA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 220, -1));

        jCCortZA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCortZA.setText("Guardar automáticamente corte Z en PDF");
        jCCortZA.setName("vtas_cortza"); // NOI18N
        jCCortZA.setNextFocusableComponent(jComSerF);
        jPPtoVta.add(jCCortZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 220, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("Serie remisiones:");
        jPPtoVta.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 472, 90, -1));

        jComSerF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComSerF.setNextFocusableComponent(jComSerT);
        jPPtoVta.add(jComSerF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 432, 120, 20));

        jComSerT.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComSerT.setNextFocusableComponent(jComSerT);
        jPPtoVta.add(jComSerT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 453, 120, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setText("Almacén de venta:");
        jPPtoVta.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, -1));

        jComSerR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComSerR.setNextFocusableComponent(jTAlma);
        jPPtoVta.add(jComSerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 474, 120, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel24.setText("Serie tickets:");
        jPPtoVta.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 452, 90, -1));

        jTAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAlma.setNextFocusableComponent(jBAlma);
        jPPtoVta.add(jTAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 20));

        jBAlma.setBackground(new java.awt.Color(255, 255, 255));
        jBAlma.setText("jButton1");
        jBAlma.setToolTipText("Buscar Almacén(es)");
        jBAlma.setNextFocusableComponent(jCGaraP);
        jPPtoVta.add(jBAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel25.setText("Serie facturas:");
        jPPtoVta.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 432, 90, -1));

        jCGaraP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGaraP.setText("Agregar garantía de producto en descripción");
        jCGaraP.setName("vtas_garandescpto"); // NOI18N
        jCGaraP.setNextFocusableComponent(jCDevVtaPto);
        jPPtoVta.add(jCGaraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 270, 20));

        jCDevPVtaPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDevPVtaPto.setText("Devoluciones parciales de ventas en punto de venta");
        jCDevPVtaPto.setName("vtas_devvtaspto"); // NOI18N
        jCDevPVtaPto.setNextFocusableComponent(jCRemPto);
        jPPtoVta.add(jCDevPVtaPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 270, -1));

        jCDevVtaPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCDevVtaPto.setText("Devoluciones de ventas en punto de venta");
        jCDevVtaPto.setName("vtas_devvtaspto"); // NOI18N
        jCDevVtaPto.setNextFocusableComponent(jCDevPVtaPto);
        jPPtoVta.add(jCDevVtaPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 270, -1));

        jCFacPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCFacPto.setText("Se puede facturar en el punto de venta");
        jCFacPto.setName("vtas_facptovta"); // NOI18N
        jCFacPto.setNextFocusableComponent(jCPLEPvta);
        jPPtoVta.add(jCFacPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 270, -1));

        jCRemPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCRemPto.setText("Se puede remisionar en el punto de venta");
        jCRemPto.setName("vtas_remptovta"); // NOI18N
        jCRemPto.setNextFocusableComponent(jCFacPto);
        jPPtoVta.add(jCRemPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 270, -1));

        jTBP.addTab("tab6", jPPtoVta);

        jPRem.setName("tab07"); // NOI18N
        jPRem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCMosLogRem.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMosLogRem.setText("Mostrar logo en remisiones");
        jCMosLogRem.setName("vtas_logorem"); // NOI18N
        jCMosLogRem.setNextFocusableComponent(jCLimCredRem);
        jPRem.add(jCMosLogRem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, -1));

        jCLimCredRem.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCLimCredRem.setText("Vender sobre límite de crédito en remisiones");
        jCLimCredRem.setName("vtas_slimcredrem"); // NOI18N
        jCLimCredRem.setNextFocusableComponent(jCVRemPto);
        jPRem.add(jCLimCredRem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, -1));

        jCVRemPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVRemPto.setText("Mostrar remisiones en buscador del punto de venta");
        jCVRemPto.setName("vtas_vremptovta"); // NOI18N
        jCVRemPto.setNextFocusableComponent(jCImpRemPto);
        jPRem.add(jCVRemPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, -1));

        jCImpRemPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCImpRemPto.setText("Se pueden imprimir remisiones en punto de venta");
        jCImpRemPto.setName("vtas_imprempto"); // NOI18N
        jCImpRemPto.setNextFocusableComponent(jCCanRemPto);
        jPRem.add(jCImpRemPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, -1));

        jCCanRemPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCanRemPto.setText("Se pueden cancelar/devolver remisiones en el punto de venta");
        jCCanRemPto.setName("vtas_canrempto"); // NOI18N
        jCCanRemPto.setNextFocusableComponent(jCMosLogRem);
        jPRem.add(jCCanRemPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, -1));

        jTBP.addTab("tab7", jPRem);

        jPTic.setName("tab08"); // NOI18N
        jPTic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCMosLogTik.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMosLogTik.setText("Mostrar logo en ticktes");
        jCMosLogTik.setName("vtas_logotik"); // NOI18N
        jCMosLogTik.setNextFocusableComponent(jCVTicPto);
        jPTic.add(jCMosLogTik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, -1));

        jCVTicPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCVTicPto.setText("Mostrar tickets en buscador del punto de venta");
        jCVTicPto.setName("vtas_vticptovta"); // NOI18N
        jCVTicPto.setNextFocusableComponent(jCImpTicPto);
        jPTic.add(jCVTicPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, -1));

        jCImpTicPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCImpTicPto.setText("Se pueden imprimir tickets en punto de venta");
        jCImpTicPto.setName("vtas_impticpto"); // NOI18N
        jCImpTicPto.setNextFocusableComponent(jCCanTicPto);
        jPTic.add(jCImpTicPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, -1));

        jCCanTicPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCanTicPto.setText("Se pueden cancelar/devolver tickets en el punto de venta");
        jCCanTicPto.setName("vtas_canticpto"); // NOI18N
        jCCanTicPto.setNextFocusableComponent(jCMosTicCanPto);
        jPTic.add(jCCanTicPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, -1));

        jCMosTicCanPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMosTicCanPto.setText("Mostrar ticket de cancelación/devolución en punto de venta");
        jCMosTicCanPto.setName("vtas_vercanvta"); // NOI18N
        jCMosTicCanPto.setNextFocusableComponent(jCGuaPDFCanPto);
        jPTic.add(jCMosTicCanPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, -1));

        jCGuaPDFCanPto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGuaPDFCanPto.setText("Guardar PDF de cancelación/devolución en punto de venta");
        jCGuaPDFCanPto.setName("vtas_guapdfcan"); // NOI18N
        jCGuaPDFCanPto.setNextFocusableComponent(jCMosLogTik);
        jPTic.add(jCGuaPDFCanPto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, -1));

        jTBP.addTab("tab8", jPTic);

        jPPrevioCompra.setName("tab10"); // NOI18N

        jBPrevUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBPrevUsuario.setText("Mostrar solo previos de compra de usuario");
        jBPrevUsuario.setToolTipText("Mostrar solo previos de compra de usuario");
        jBPrevUsuario.setName("prev_prevporusuario"); // NOI18N

        jBPrevMonNacional.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBPrevMonNacional.setText("Solo previos de compra en moneda nacional");
        jBPrevMonNacional.setToolTipText("Solo comprar en moneda nacional");
        jBPrevMonNacional.setName("prev_prevmonac"); // NOI18N

        jBPrevModDesc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBPrevModDesc.setText("Modificar descripción del producto");
        jBPrevModDesc.setToolTipText("Modificar descripción del producto");
        jBPrevModDesc.setName("prev_prevmodesc"); // NOI18N

        jBPrevModPrec.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBPrevModPrec.setText("Modificar precio del producto");
        jBPrevModPrec.setToolTipText("Modificar precio del producto");
        jBPrevModPrec.setName("prev_prevmodprec"); // NOI18N

        jBPrevCotunaSerie.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBPrevCotunaSerie.setText("Utilizar una sola vez una serie en previos de compra");
        jBPrevCotunaSerie.setToolTipText("Cotizar una sola vez una serie");
        jBPrevCotunaSerie.setName("prev_prevunavezser"); // NOI18N

        jBPrevSerObli.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBPrevSerObli.setText("Es obligatorio el uso de series en previos de compra");
        jBPrevSerObli.setToolTipText("Es obligatorio el uso de series en cotizaciones");
        jBPrevSerObli.setName("prev_prevobligarser"); // NOI18N

        javax.swing.GroupLayout jPPrevioCompraLayout = new javax.swing.GroupLayout(jPPrevioCompra);
        jPPrevioCompra.setLayout(jPPrevioCompraLayout);
        jPPrevioCompraLayout.setHorizontalGroup(
            jPPrevioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrevioCompraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPPrevioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBPrevSerObli)
                    .addComponent(jBPrevCotunaSerie)
                    .addComponent(jBPrevModPrec)
                    .addComponent(jBPrevModDesc)
                    .addComponent(jBPrevMonNacional)
                    .addComponent(jBPrevUsuario))
                .addContainerGap(590, Short.MAX_VALUE))
        );
        jPPrevioCompraLayout.setVerticalGroup(
            jPPrevioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrevioCompraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jBPrevUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPrevMonNacional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPrevModDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPrevModPrec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPrevCotunaSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPrevSerObli)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        jTBP.addTab("tab10", jPPrevioCompra);

        jP1.add(jTBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 530));
        jTBP.getAccessibleContext().setAccessibleName("\"Inventarios\"");

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jCPListCFac);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 120, 30));

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
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JButton jBAlma;
    private javax.swing.JButton jBAlmaCot;
    private javax.swing.JButton jBAlmaVta;
    private javax.swing.JButton jBApFav;
    private javax.swing.JButton jBBuscCum;
    private javax.swing.JButton jBCXC1;
    private javax.swing.JButton jBCXC2;
    private javax.swing.JButton jBCXC3;
    private javax.swing.JButton jBCalc;
    private javax.swing.JButton jBCargAgra;
    private javax.swing.JButton jBCargCum;
    private javax.swing.JButton jBCuade;
    private javax.swing.JButton jBDelAgra;
    private javax.swing.JButton jBDelCXC1;
    private javax.swing.JButton jBDelCXC2;
    private javax.swing.JButton jBDelCXC3;
    private javax.swing.JButton jBDelCum;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBMaxMin;
    private javax.swing.JButton jBNoMaxMin;
    private javax.swing.JCheckBox jBPrevCotunaSerie;
    private javax.swing.JCheckBox jBPrevModDesc;
    private javax.swing.JCheckBox jBPrevModPrec;
    private javax.swing.JCheckBox jBPrevMonNacional;
    private javax.swing.JCheckBox jBPrevSerObli;
    private javax.swing.JCheckBox jBPrevUsuario;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTBajCost;
    private javax.swing.JButton jBTNoBajCost;
    private javax.swing.JButton jBUsrAgra;
    private javax.swing.JButton jBUsrCump;
    private javax.swing.JButton jBVerAgra;
    private javax.swing.JButton jBVerCXC1;
    private javax.swing.JButton jBVerCXC2;
    private javax.swing.JButton jBVerCXC3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCAdmCan;
    private javax.swing.JCheckBox jCBarrLatP;
    private javax.swing.JCheckBox jCCanFacPto;
    private javax.swing.JCheckBox jCCanRemPto;
    private javax.swing.JCheckBox jCCanTicPto;
    private javax.swing.JCheckBox jCChatPtoC;
    private javax.swing.JCheckBox jCClavFac;
    private javax.swing.JCheckBox jCClavFacP;
    private javax.swing.JCheckBox jCCompMN;
    private javax.swing.JCheckBox jCCompXUsr;
    private javax.swing.JCheckBox jCCortXA;
    private javax.swing.JCheckBox jCCortXAut;
    private javax.swing.JCheckBox jCCortZA;
    private javax.swing.JCheckBox jCCotMN;
    private javax.swing.JCheckBox jCCotsXUsr;
    private javax.swing.JCheckBox jCDefTipCamSis;
    private javax.swing.JCheckBox jCDesInac;
    private javax.swing.JCheckBox jCDescrip;
    private javax.swing.JCheckBox jCDevPVtaPto;
    private javax.swing.JCheckBox jCDevVtaPto;
    private javax.swing.JCheckBox jCDiaVtaP;
    private javax.swing.JCheckBox jCESExistMov;
    private javax.swing.JCheckBox jCEmpsPtoVta;
    private javax.swing.JCheckBox jCFacPto;
    private javax.swing.JCheckBox jCGaraC;
    private javax.swing.JCheckBox jCGaraF;
    private javax.swing.JCheckBox jCGaraP;
    private javax.swing.JCheckBox jCGuaPDFCanF;
    private javax.swing.JCheckBox jCGuaPDFCanPto;
    private javax.swing.JCheckBox jCHActivoCompra;
    private javax.swing.JCheckBox jCHActivoVenta;
    private javax.swing.JCheckBox jCHCuentaCompra;
    private javax.swing.JCheckBox jCHCuentaVenta;
    private javax.swing.JCheckBox jCImgLin;
    private javax.swing.JCheckBox jCImpFacPto;
    private javax.swing.JCheckBox jCImpRemPto;
    private javax.swing.JCheckBox jCImpTicPto;
    private javax.swing.JCheckBox jCIniOrd;
    private javax.swing.JCheckBox jCInitPvta;
    private javax.swing.JCheckBox jCInsAutCaj;
    private javax.swing.JCheckBox jCLimCredFac;
    private javax.swing.JCheckBox jCLimCredPVta;
    private javax.swing.JCheckBox jCLimCredRem;
    private javax.swing.JCheckBox jCMMECot;
    private javax.swing.JCheckBox jCMMEFac;
    private javax.swing.JCheckBox jCMMEPvta;
    private javax.swing.JCheckBox jCMinFac;
    private javax.swing.JCheckBox jCModDescripComp;
    private javax.swing.JCheckBox jCModDescripCot;
    private javax.swing.JCheckBox jCModDescripFac;
    private javax.swing.JCheckBox jCModListC;
    private javax.swing.JCheckBox jCModListF;
    private javax.swing.JCheckBox jCModPrecComp;
    private javax.swing.JCheckBox jCModPrecCot;
    private javax.swing.JCheckBox jCModPrecFac;
    private javax.swing.JCheckBox jCMosLogFac;
    private javax.swing.JCheckBox jCMosLogRem;
    private javax.swing.JCheckBox jCMosLogTik;
    private javax.swing.JCheckBox jCMosMsjConfCorr;
    private javax.swing.JCheckBox jCMosTicCanF;
    private javax.swing.JCheckBox jCMosTicCanPto;
    private javax.swing.JCheckBox jCMsjPto;
    private javax.swing.JCheckBox jCPLCot;
    private javax.swing.JCheckBox jCPLEPvta;
    private javax.swing.JCheckBox jCPListCFac;
    private javax.swing.JCheckBox jCRedon;
    private javax.swing.JCheckBox jCRemPto;
    private javax.swing.JCheckBox jCSerRep;
    private javax.swing.JCheckBox jCTraspasExis;
    private javax.swing.JCheckBox jCUsrMulti;
    private javax.swing.JCheckBox jCVFacPto;
    private javax.swing.JCheckBox jCVRemPto;
    private javax.swing.JCheckBox jCVSinExistCot;
    private javax.swing.JCheckBox jCVSinExistPvta;
    private javax.swing.JCheckBox jCVTicPto;
    private javax.swing.JCheckBox jCVendMN;
    private javax.swing.JCheckBox jCVendSinExistFac;
    private javax.swing.JCheckBox jCVtasXUsr;
    private javax.swing.JComboBox jComMonFac;
    private javax.swing.JComboBox jComSerF;
    private javax.swing.JComboBox jComSerFac;
    private javax.swing.JComboBox jComSerR;
    private javax.swing.JComboBox jComSerT;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPComp;
    private javax.swing.JPanel jPCot;
    private javax.swing.JPanel jPEnCompras;
    private javax.swing.JPanel jPEnVentas;
    private javax.swing.JPanel jPFac;
    private javax.swing.JPanel jPInven;
    private javax.swing.JPanel jPPrevioCompra;
    private javax.swing.JPanel jPPtoVta;
    private javax.swing.JPanel jPRem;
    private javax.swing.JPanel jPSis;
    private javax.swing.JPanel jPTic;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTAlma;
    private javax.swing.JTextField jTAlmaCot;
    private javax.swing.JTextField jTAlmaVta;
    private javax.swing.JTextField jTAsun;
    private javax.swing.JTextField jTAsunAgra;
    private javax.swing.JTabbedPane jTBP;
    private javax.swing.JTextField jTClavFac;
    private javax.swing.JTextField jTClavFacP;
    private javax.swing.JTextField jTCuerAgra;
    private javax.swing.JTextField jTCumple;
    private javax.swing.JTextField jTDias;
    private javax.swing.JTextField jTDinCaj;
    private javax.swing.JTextField jTMin;
    private javax.swing.JTextField jTMinFac;
    private javax.swing.JTextField jTRedon;
    private javax.swing.JTextField jTRutAp;
    private javax.swing.JTextField jTRutCalc;
    private javax.swing.JTextField jTRutCuade;
    private javax.swing.JTextField jTUsrAgra;
    private javax.swing.JTextField jTUsrCump;
    private javax.swing.JTextField jTextPlantilla;
    private javax.swing.JRadioButton radio_redondea_2;
    private javax.swing.JRadioButton radio_redondea_3;
    private javax.swing.JRadioButton radio_redondea_4;
    private javax.swing.JRadioButton radio_redondea_5;
    private javax.swing.JRadioButton radio_redondea_6;
    private javax.swing.JRadioButton rbtVer32;
    private javax.swing.JRadioButton rbtVer33;
    // End of variables declaration//GEN-END:variables

}
