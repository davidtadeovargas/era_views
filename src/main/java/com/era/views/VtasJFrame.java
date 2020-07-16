package com.era.views;

import java.awt.FlowLayout;


public abstract class VtasJFrame extends BaseJFrame {
    
    public VtasJFrame(final String idTextTitleWindow){
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
    

        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jP1 = new javax.swing.JPanel();
        jBBusc = new javax.swing.JButton();
        jBMosT = new javax.swing.JButton();
        jLabelRemisionFactura = new javax.swing.JLabel();
        javax.swing.JLabel jLTimb = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBGenPDF = new javax.swing.JButton();
        jBCa = new javax.swing.JButton();
        jBDev = new javax.swing.JButton();
        jBDevP = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jButtonNotaCredito = new javax.swing.JButton();
        jBVer = new javax.swing.JButton();
        jButtonEnviar = new javax.swing.JButton();
        jBPDF = new javax.swing.JButton();
        jButtonTimbrar = new javax.swing.JButton();
        jButtonComprobar = new javax.swing.JButton();
        jButtonAcuse = new javax.swing.JButton();
        jButtonObtenerXML = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jRadioBoxTipoDeVentas = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        navegacion = new javax.swing.JPanel(new FlowLayout(FlowLayout.RIGHT));
        jLabel4 = new javax.swing.JLabel();
        jTBusc = new javax.swing.JTextField();
        jLabelPagination = new javax.swing.JLabel();
        jLabelTipDoc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab2 = new com.era.views.tables.PartvtaTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVentas = new com.era.views.tables.SalesTable();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenuGeneral = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemGralNew = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemGralOpen = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemGralView = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemGralSend = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemGralViewPDF = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemGralGeneratePDF = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemGralCancel = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenuSales = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemSalesNew = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemSalesDev = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemSalesDevP = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemSalesFacTick = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenuDocuSAT = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemDocuSatCheck = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemDocuSatRing = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemDocuSatAcuse = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenuFolders = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemFoldersRems = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersCortX = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersCortZ = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersCreditNot = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersCFDI = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersTicks = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersCancels = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersDevs = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersDevsP = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemFoldersAcuses = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemDocuSatGetXML = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setMinimumSize(new java.awt.Dimension(100, 100));
        jP1.setPreferredSize(new java.awt.Dimension(1080, 700));
        jP1.setLayout(null);

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc);
        jBBusc.setBounds(20, 230, 140, 19);

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jTab2);
        jP1.add(jBMosT);
        jBMosT.setBounds(800, 230, 140, 19);

        jLabelRemisionFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRemisionFactura.setForeground(new java.awt.Color(51, 102, 255));
        jLabelRemisionFactura.setText("?");
        jP1.add(jLabelRemisionFactura);
        jLabelRemisionFactura.setBounds(480, 10, 190, 17);
        jP1.add(jLTimb);
        jLTimb.setBounds(90, 600, 80, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBGenPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBGenPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGenPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBGenPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/genpdf.png"))); // NOI18N
        jBGenPDF.setText("Generar PDF");
        jBGenPDF.setToolTipText("Generar PDF de venta");
        jBGenPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBGenPDF.setNextFocusableComponent(jBCa);
        jPanel1.add(jBGenPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        jBCa.setBackground(new java.awt.Color(255, 255, 255));
        jBCa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCa.setForeground(new java.awt.Color(0, 102, 0));
        jBCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/can.png"))); // NOI18N
        jBCa.setText("Cancelar");
        jBCa.setToolTipText("Cancelar venta(s) (Ctrl+SUPR)");
        jBCa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCa.setNextFocusableComponent(jBDev);
        jPanel1.add(jBCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 30));

        jBDev.setBackground(new java.awt.Color(255, 255, 255));
        jBDev.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDev.setForeground(new java.awt.Color(0, 102, 0));
        jBDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devs.png"))); // NOI18N
        jBDev.setText("Devolución");
        jBDev.setToolTipText("Devolución completa de venta(s) (F2)");
        jBDev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDev.setNextFocusableComponent(jBDevP);
        jPanel1.add(jBDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, 30));

        jBDevP.setBackground(new java.awt.Color(255, 255, 255));
        jBDevP.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDevP.setForeground(new java.awt.Color(0, 102, 0));
        jBDevP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devpar.png"))); // NOI18N
        jBDevP.setText("Parcial");
        jBDevP.setToolTipText("Devolución paracial de venta(s) (F3)");
        jBDevP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDevP.setNextFocusableComponent(jBNew);
        jPanel1.add(jBDevP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, 30));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nueva");
        jBNew.setToolTipText("Nueva factura o Remisión (Ctrl+N). Presionando (Alt y este Botón) Puedes Tomar la Venta Seleccionada como Machote para una Nueva Factura o remisión");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jButtonAbrir);
        jPanel1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, 30));

        jButtonNotaCredito.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNotaCredito.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonNotaCredito.setForeground(new java.awt.Color(0, 102, 0));
        jButtonNotaCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/notcred.png"))); // NOI18N
        jButtonNotaCredito.setText("Not.crédito");
        jButtonNotaCredito.setToolTipText("Generar una nueva nota de crédito. Presionando (Alt y este botón) puedes tomar la nota de crédito seleccionada como machote para una nueva nota de crédito");
        jButtonNotaCredito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNotaCredito.setNextFocusableComponent(jBVer);
        jPanel1.add(jButtonNotaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, 30));

        jBVer.setBackground(new java.awt.Color(255, 255, 255));
        jBVer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVer.setForeground(new java.awt.Color(0, 102, 0));
        jBVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ver.png"))); // NOI18N
        jBVer.setText("Ver");
        jBVer.setToolTipText("Ver venta(s) en otra vista");
        jBVer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVer.setNextFocusableComponent(jButtonEnviar);
        jPanel1.add(jBVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, 30));

        jButtonEnviar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEnviar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonEnviar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corrs.png"))); // NOI18N
        jButtonEnviar.setText("Enviar F8");
        jButtonEnviar.setToolTipText("Reenviar factura(s)");
        jButtonEnviar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEnviar.setNextFocusableComponent(jBPDF);
        jPanel1.add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, 30));

        jBPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jBPDF.setText("Ver PDF");
        jBPDF.setToolTipText("Ver PDF (Alt+F)");
        jBPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jBPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 140, 30));

        jButtonTimbrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTimbrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonTimbrar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonTimbrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cfdtim.png"))); // NOI18N
        jButtonTimbrar.setText("Timbrar");
        jButtonTimbrar.setToolTipText("Timbrar factura(s)");
        jButtonTimbrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTimbrar.setName(""); // NOI18N
        jPanel1.add(jButtonTimbrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 140, 30));

        jButtonComprobar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonComprobar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonComprobar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonComprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prob.png"))); // NOI18N
        jButtonComprobar.setText("Comprobar");
        jButtonComprobar.setToolTipText("Comprobar si esta timbrada la venta o no");
        jButtonComprobar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonComprobar.setNextFocusableComponent(jButtonAcuse);
        jPanel1.add(jButtonComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, 30));

        jButtonAcuse.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAcuse.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAcuse.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAcuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/acerd.png"))); // NOI18N
        jButtonAcuse.setText("Acuse");
        jButtonAcuse.setToolTipText("Obtener acuse de venta(s)");
        jButtonAcuse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAcuse.setNextFocusableComponent(jButtonObtenerXML);
        jPanel1.add(jButtonAcuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 140, 30));

        jButtonObtenerXML.setBackground(new java.awt.Color(255, 255, 255));
        jButtonObtenerXML.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonObtenerXML.setForeground(new java.awt.Color(0, 102, 0));
        jButtonObtenerXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/adver.png"))); // NOI18N
        jButtonObtenerXML.setText("Obtener XML");
        jButtonObtenerXML.setToolTipText("Obtener el XML de una venta timbrada");
        jButtonObtenerXML.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButtonObtenerXML, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 140, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 140, 30));

        jButtonAbrir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAbrir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAbrir.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        jButtonAbrir.setText("Abrir");
        jButtonAbrir.setToolTipText("Abrir cotizaciòn(es) (Ctrl+A)");
        jButtonAbrir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAbrir.setName(""); // NOI18N
        jButtonAbrir.setNextFocusableComponent(jButtonNotaCredito);
        jPanel1.add(jButtonAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        jP1.add(jPanel1);
        jPanel1.setBounds(940, 40, 140, 450);

        jRadioBoxTipoDeVentas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todo", "Facturas", "Notas crédito", "Devoluciones Ventas", "Tickets" }));
        jP1.add(jRadioBoxTipoDeVentas);
        jRadioBoxTipoDeVentas.setBounds(90, 10, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Partidas:");
        jP1.add(jLabel3);
        jLabel3.setBounds(20, 270, 170, 17);

        label_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_total.setText("# Ventas y total:");
        jP1.add(label_total);
        label_total.setBounds(200, 270, 310, 17);

        navegacion.setBackground(new java.awt.Color(255, 255, 255));
        jP1.add(navegacion);
        navegacion.setBounds(460, 250, 340, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ventas:");
        jP1.add(jLabel4);
        jLabel4.setBounds(20, 10, 70, 17);

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jP1.add(jTBusc);
        jTBusc.setBounds(160, 230, 640, 20);
        jP1.add(jLabelPagination);
        jLabelPagination.setBounds(20, 250, 290, 20);

        jLabelTipDoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTipDoc.setText("Remisiones");
        jP1.add(jLabelTipDoc);
        jLabelTipDoc.setBounds(220, 10, 170, 20);

        jTab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTab2);

        jP1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 920, 240);

        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableVentas);

        jP1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 40, 920, 190);

        getContentPane().add(jP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 540));

        jMenuGeneral.setText("General");
        jMenuGeneral.setToolTipText("");

        jMenuItemGralNew.setText("Nueva");
        jMenuGeneral.add(jMenuItemGralNew);

        jMenuItemGralOpen.setText("Abrir");
        jMenuGeneral.add(jMenuItemGralOpen);

        jMenuItemGralView.setText("Ver");
        jMenuGeneral.add(jMenuItemGralView);

        jMenuItemGralSend.setText("Enviar");
        jMenuGeneral.add(jMenuItemGralSend);

        jMenuItemGralViewPDF.setText("Ver PDF");
        jMenuGeneral.add(jMenuItemGralViewPDF);

        jMenuItemGralGeneratePDF.setText("Generar PDF");
        jMenuGeneral.add(jMenuItemGralGeneratePDF);

        jMenuItemGralCancel.setText("Cancelar");
        jMenuGeneral.add(jMenuItemGralCancel);

        jMenuBar1.add(jMenuGeneral);

        jMenuSales.setText("Ventas");

        jMenuItemSalesNew.setText("Nueva");
        jMenuSales.add(jMenuItemSalesNew);

        jMenuItemSalesDev.setText("Devolución");
        jMenuSales.add(jMenuItemSalesDev);

        jMenuItemSalesDevP.setText("Dev. Parcial");
        jMenuSales.add(jMenuItemSalesDevP);

        jMenuItemSalesFacTick.setText("Facturar Tickets");
        jMenuSales.add(jMenuItemSalesFacTick);

        jMenuBar1.add(jMenuSales);

        jMenuDocuSAT.setText("Documentos SAT");

        jMenuItemDocuSatCheck.setText("Comprobar");
        jMenuDocuSAT.add(jMenuItemDocuSatCheck);

        jMenuItemDocuSatRing.setText("Timbrar");
        jMenuDocuSAT.add(jMenuItemDocuSatRing);

        jMenuItemDocuSatAcuse.setText("Acuse");
        jMenuDocuSAT.add(jMenuItemDocuSatAcuse);

        jMenuBar1.add(jMenuDocuSAT);

        jMenuFolders.setText("Folders");

        jMenuItemFoldersRems.setText("Remisiones");
        jMenuFolders.add(jMenuItemFoldersRems);

        jMenuItemFoldersCortX.setText("Cortes X");
        jMenuFolders.add(jMenuItemFoldersCortX);

        jMenuItemFoldersCortZ.setText("Cortes Z");
        jMenuFolders.add(jMenuItemFoldersCortZ);

        jMenuItemFoldersCreditNot.setText("Notas de Crédito");
        jMenuFolders.add(jMenuItemFoldersCreditNot);

        jMenuItemFoldersCFDI.setText("CFDI");
        jMenuFolders.add(jMenuItemFoldersCFDI);

        jMenuItemFoldersTicks.setText("Tickets");
        jMenuFolders.add(jMenuItemFoldersTicks);

        jMenuItemFoldersCancels.setText("Cancelados");
        jMenuFolders.add(jMenuItemFoldersCancels);

        jMenuItemFoldersDevs.setText("Devoluciones");
        jMenuFolders.add(jMenuItemFoldersDevs);

        jMenuItemFoldersDevsP.setText("Dev. Parciales");
        jMenuFolders.add(jMenuItemFoldersDevsP);

        jMenuItemFoldersAcuses.setText("Acuses");
        jMenuItemFoldersAcuses.setToolTipText("");
        jMenuFolders.add(jMenuItemFoldersAcuses);

        jMenuItemDocuSatGetXML.setText("Obtener XML");
        jMenuFolders.add(jMenuItemDocuSatGetXML);

        jMenuBar1.add(jMenuFolders);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBCa;
    protected javax.swing.JButton jBDev;
    protected javax.swing.JButton jBDevP;
    protected javax.swing.JButton jBGenPDF;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBPDF;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBVer;
    protected javax.swing.JButton jButtonAbrir;
    protected javax.swing.JButton jButtonAcuse;
    protected javax.swing.JButton jButtonComprobar;
    protected javax.swing.JButton jButtonEnviar;
    protected javax.swing.JButton jButtonNotaCredito;
    protected javax.swing.JButton jButtonObtenerXML;
    protected javax.swing.JButton jButtonTimbrar;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabelPagination;
    protected javax.swing.JLabel jLabelRemisionFactura;
    protected javax.swing.JLabel jLabelTipDoc;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JComboBox jRadioBoxTipoDeVentas;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JLabel label_total;
    protected javax.swing.JPanel navegacion;
	protected com.era.views.tables.PartvtaTable jTab2;
    protected com.era.views.tables.SalesTable jTableVentas;
	protected javax.swing.JScrollPane jScrollPane2;
	protected javax.swing.JScrollPane jScrollPane1;
	
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Empresas extends javax.swing.JFrame */
