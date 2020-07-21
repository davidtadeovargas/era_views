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

        jP1 = new javax.swing.JPanel();
        jBBusc = new javax.swing.JButton();
        jBMosT = new javax.swing.JButton();
        jLabelRemisionFactura = new javax.swing.JLabel();
		jLabelTypeSale = new javax.swing.JLabel();
        jLTimb = new javax.swing.JLabel();
        jRadioBoxTipoDeVentas = new com.era.views.comboboxes.DocumentOriginCombobox();
        jLabel3 = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        navegacion = new javax.swing.JPanel(new FlowLayout(FlowLayout.RIGHT));
        jLabel4 = new javax.swing.JLabel();
        jTBusc = new javax.swing.JTextField();
        jLabelPagination = new javax.swing.JLabel();
        jLabelTipDoc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab2 = new com.era.views.tables.PartvtaTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVentas = new com.era.views.tables.SalesTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGeneral = new javax.swing.JMenu();
        jMenuItemGralNew = new javax.swing.JMenuItem();
        jMenuItemGralOpen = new javax.swing.JMenuItem();
        jMenuItemGralView = new javax.swing.JMenuItem();
        jMenuItemGralSend = new javax.swing.JMenuItem();
        jMenuItemGralViewPDF = new javax.swing.JMenuItem();
        jMenuItemGralGeneratePDF = new javax.swing.JMenuItem();
        jMenuItemGralCancel = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuSales = new javax.swing.JMenu();
        jMenuItemSalesDev = new javax.swing.JMenuItem();
        jMenuItemSalesDevP = new javax.swing.JMenuItem();
        jMenuItemSalesFacTick = new javax.swing.JMenuItem();
        jMenuDocuSAT = new javax.swing.JMenu();
        jMenuItemDocuSatCheck = new javax.swing.JMenuItem();
        jMenuItemDocuSatRing = new javax.swing.JMenuItem();
        jMenuItemDocuSatAcuse = new javax.swing.JMenuItem();
        jMenuFolders = new javax.swing.JMenu();
        jMenuItemFoldersRems = new javax.swing.JMenuItem();
        jMenuItemFoldersCortX = new javax.swing.JMenuItem();
        jMenuItemFoldersCortZ = new javax.swing.JMenuItem();
        jMenuItemFoldersCreditNot = new javax.swing.JMenuItem();
        jMenuItemFoldersCFDI = new javax.swing.JMenuItem();
        jMenuItemFoldersTicks = new javax.swing.JMenuItem();
        jMenuItemFoldersCancels = new javax.swing.JMenuItem();
        jMenuItemFoldersDevs = new javax.swing.JMenuItem();
        jMenuItemFoldersDevsP = new javax.swing.JMenuItem();
        jMenuItemFoldersAcuses = new javax.swing.JMenuItem();
        jMenuItemDocuSatGetXML = new javax.swing.JMenuItem();
		jMenuItemGetXML = new javax.swing.JMenuItem();
		jMenuItemTicketsFacturados = new javax.swing.JMenuItem();
		
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
        jBBusc.setBounds(80, 230, 140, 19);

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jTab2);
        jP1.add(jBMosT);
        jBMosT.setBounds(860, 230, 140, 19);

        jLabelRemisionFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRemisionFactura.setForeground(new java.awt.Color(51, 102, 255));
        jLabelRemisionFactura.setToolTipText("");
        jP1.add(jLabelRemisionFactura);
        jLabelRemisionFactura.setBounds(480, 10, 190, 0);
        jP1.add(jLTimb);
        jLTimb.setBounds(90, 600, 80, 20);

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
        jTBusc.setBounds(220, 230, 640, 20);
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
        jScrollPane1.setBounds(20, 290, 1040, 240);

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
        jScrollPane3.setViewportView(jTableVentas);

        jP1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 40, 1040, 180);

        jLabelTypeSale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTypeSale.setForeground(new java.awt.Color(102, 102, 255));
        jP1.add(jLabelTypeSale);
        jLabelTypeSale.setBounds(880, 4, 170, 30);

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

        jMenuItemExit.setText("Salir");
        jMenuGeneral.add(jMenuItemExit);

        jMenuBar1.add(jMenuGeneral);

        jMenuSales.setText("Ventas");

        jMenuItemSalesDev.setText("Devolución");
        jMenuSales.add(jMenuItemSalesDev);

        jMenuItemSalesDevP.setText("Dev. Parcial");
        jMenuSales.add(jMenuItemSalesDevP);

        jMenuItemSalesFacTick.setText("Facturar Tickets");
        jMenuSales.add(jMenuItemSalesFacTick);

        jMenuItemTicketsFacturados.setText("Tickets Facturados");
        jMenuSales.add(jMenuItemTicketsFacturados);

        jMenuBar1.add(jMenuSales);

        jMenuDocuSAT.setText("Documentos SAT");

        jMenuItemDocuSatCheck.setText("Comprobar");
        jMenuDocuSAT.add(jMenuItemDocuSatCheck);

        jMenuItemDocuSatRing.setText("Timbrar");
        jMenuDocuSAT.add(jMenuItemDocuSatRing);

        jMenuItemDocuSatAcuse.setText("Acuse");
        jMenuDocuSAT.add(jMenuItemDocuSatAcuse);

        jMenuItemGetXML.setText("Obtener XML");
        jMenuDocuSAT.add(jMenuItemGetXML);

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

	protected com.era.views.tables.SalesTable jTableVentas;
	protected javax.swing.JPanel jP1;
	protected javax.swing.JButton jBBusc;
	protected javax.swing.JButton jBMosT;
	protected javax.swing.JLabel jLabelRemisionFactura;
	protected javax.swing.JLabel jLTimb;
	protected com.era.views.comboboxes.DocumentOriginCombobox jRadioBoxTipoDeVentas;
	protected javax.swing.JLabel jLabel3;
	protected javax.swing.JLabel label_total;
	protected javax.swing.JPanel navegacion;
	protected javax.swing.JLabel jLabel4;
	protected javax.swing.JTextField jTBusc;
	protected javax.swing.JLabel jLabelPagination;
	protected javax.swing.JLabel jLabelTipDoc;
	protected javax.swing.JScrollPane jScrollPane1;
	protected com.era.views.tables.PartvtaTable jTab2;
	protected javax.swing.JScrollPane jScrollPane3;
	protected javax.swing.JMenuBar jMenuBar1;
	protected javax.swing.JMenu jMenuGeneral;
	protected javax.swing.JMenuItem jMenuItemGralNew;
	protected javax.swing.JMenuItem jMenuItemGralOpen;
	protected javax.swing.JMenuItem jMenuItemGralView;
	protected javax.swing.JMenuItem jMenuItemGralSend;
	protected javax.swing.JMenuItem jMenuItemGralViewPDF;
	protected javax.swing.JMenuItem jMenuItemGralGeneratePDF;
	protected javax.swing.JMenuItem jMenuItemGralCancel;
	protected javax.swing.JMenuItem jMenuItemExit;
	protected javax.swing.JMenu jMenuSales;
	protected javax.swing.JMenuItem jMenuItemSalesDev;
	protected javax.swing.JMenuItem jMenuItemSalesDevP;
	protected javax.swing.JMenuItem jMenuItemSalesFacTick;
	protected javax.swing.JMenu jMenuDocuSAT;
	protected javax.swing.JMenuItem jMenuItemDocuSatCheck;
	protected javax.swing.JMenuItem jMenuItemDocuSatRing;
	protected javax.swing.JMenuItem jMenuItemDocuSatAcuse;
	protected javax.swing.JMenu jMenuFolders;
	protected javax.swing.JMenuItem jMenuItemFoldersRems;
	protected javax.swing.JMenuItem jMenuItemFoldersCortX;
	protected javax.swing.JMenuItem jMenuItemFoldersCortZ;
	protected javax.swing.JMenuItem jMenuItemFoldersCreditNot;
	protected javax.swing.JMenuItem jMenuItemFoldersCFDI;
	protected javax.swing.JMenuItem jMenuItemFoldersTicks;
	protected javax.swing.JMenuItem jMenuItemFoldersCancels;
	protected javax.swing.JMenuItem jMenuItemFoldersDevs;
	protected javax.swing.JMenuItem jMenuItemFoldersDevsP;
	protected javax.swing.JMenuItem jMenuItemFoldersAcuses;
	protected javax.swing.JMenuItem jMenuItemDocuSatGetXML;
	protected javax.swing.JMenuItem jMenuItemGetXML;
	protected javax.swing.JLabel jLabelTypeSale;
	protected javax.swing.JMenuItem jMenuItemTicketsFacturados;
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Empresas extends javax.swing.JFrame */
