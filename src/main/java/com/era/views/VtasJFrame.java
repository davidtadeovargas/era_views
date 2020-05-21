package com.era.views;

import java.awt.FlowLayout;


public class VtasJFrame extends BaseJFrame {
    
    public VtasJFrame(final String idTextTitleWindow){
        
        super(idTextTitleWindow);
        
        initComponents();
        
        
    }
    

        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSTab1 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jBMosT = new javax.swing.JButton();
        jLabelRemisionFactura = new javax.swing.JLabel();
        jBTab1 = new javax.swing.JButton();
        jBTab2 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jLNot = new javax.swing.JLabel();
        jLNotCli = new javax.swing.JLabel();
        jLTimb = new javax.swing.JLabel();
        jBAyu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBGenPDF = new javax.swing.JButton();
        jBCa = new javax.swing.JButton();
        jButtonDirectorioRemisiones = new javax.swing.JButton();
        jBDirX = new javax.swing.JButton();
        jBDev = new javax.swing.JButton();
        jBDirZ = new javax.swing.JButton();
        jBDevP = new javax.swing.JButton();
        jButtonDirectorioNotaCredito = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jButtonDirectorioCFDI = new javax.swing.JButton();
        jButtonNotaCredito = new javax.swing.JButton();
        jButtonDirectorioTickets = new javax.swing.JButton();
        jBVer = new javax.swing.JButton();
        jBDirCan = new javax.swing.JButton();
        jButtonEnviar = new javax.swing.JButton();
        jBDirBack = new javax.swing.JButton();
        jBPDF = new javax.swing.JButton();
        jBDirDev = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jBDirDevP = new javax.swing.JButton();
        jButtonTimbrar = new javax.swing.JButton();
        jButtonDirectorioAcuses = new javax.swing.JButton();
        jBEntre = new javax.swing.JButton();
        jButtonComprobar = new javax.swing.JButton();
        jButtonAcuse = new javax.swing.JButton();
        jButtonObtenerXML = new javax.swing.JButton();
        jButtonTicketsFacturados = new javax.swing.JButton();
        jButtonBorrarDocumento = new javax.swing.JButton();
        jButtonVerArchivos = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jBCli = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonRelacionar = new javax.swing.JButton();
        jBAbrNotCred = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab2 = new javax.swing.JTable();
        jRadioBoxTipoDeVentas = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        navegacion = new javax.swing.JPanel(new FlowLayout(FlowLayout.RIGHT));
        boton_primero = new javax.swing.JButton();
        boton_anterior = new javax.swing.JButton();
        boton_siguiente = new javax.swing.JButton();
        boton_ultimo = new javax.swing.JButton();
        label_pagina = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTBusc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setMinimumSize(new java.awt.Dimension(100, 100));
        jP1.setPreferredSize(new java.awt.Dimension(1080, 700));
        jP1.setLayout(null);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Venta", "Folio", "Serie", "Cliente", "Total", "Total Descuento", "Total Costo", "Fecha Creación", "Fecha Documento", "Última Modificación", "Vencimiento", "Asignada N.C.", "Pago N.C.", "Estado", "Usuario", "Motivo", "Tipo Documento", "Observaciones", "Sucursal", "No. Caja", "Nombre Usuario", "Timbrada", "Cod.Cotización", "Venta Devolución", "id", "Fol.Fiscal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVentas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableVentas.setNextFocusableComponent(jBBusc);
        jTableVentas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jSTab1.setViewportView(jTableVentas);

        jPanel2.add(jSTab1);

        jP1.add(jPanel2);
        jPanel2.setBounds(20, 30, 780, 200);

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
        jBMosT.setBounds(660, 230, 140, 19);

        jLabelRemisionFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRemisionFactura.setForeground(new java.awt.Color(51, 102, 255));
        jLabelRemisionFactura.setText("?");
        jP1.add(jLabelRemisionFactura);
        jLabelRemisionFactura.setBounds(480, 10, 190, 17);

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1);
        jBTab1.setBounds(10, 30, 10, 20);

        jBTab2.setBackground(new java.awt.Color(0, 153, 153));
        jBTab2.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab2);
        jBTab2.setBounds(10, 290, 10, 20);

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTableVentas);
        jP1.add(jBTod);
        jBTod.setBounds(670, 12, 130, 18);

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setFocusable(false);
        jP1.add(jLNot);
        jLNot.setBounds(190, 10, 260, 20);

        jLNotCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNotCli.setForeground(new java.awt.Color(204, 0, 0));
        jLNotCli.setFocusable(false);
        jP1.add(jLNotCli);
        jLNotCli.setBounds(20, 250, 490, 20);
        jP1.add(jLTimb);
        jLTimb.setBounds(90, 600, 80, 20);

        jBAyu.setBackground(new java.awt.Color(0, 153, 153));
        jBAyu.setToolTipText("Ayuda de búsqueda avanzada");
        jP1.add(jBAyu);
        jBAyu.setBounds(650, 230, 10, 20);

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
        jPanel1.add(jBGenPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        jBCa.setBackground(new java.awt.Color(255, 255, 255));
        jBCa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCa.setForeground(new java.awt.Color(0, 102, 0));
        jBCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/can.png"))); // NOI18N
        jBCa.setText("Cancelar");
        jBCa.setToolTipText("Cancelar venta(s) (Ctrl+SUPR)");
        jBCa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCa.setNextFocusableComponent(jBDev);
        jPanel1.add(jBCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 30));

        jButtonDirectorioRemisiones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDirectorioRemisiones.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDirectorioRemisiones.setForeground(new java.awt.Color(0, 102, 0));
        jButtonDirectorioRemisiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dirrem.png"))); // NOI18N
        jButtonDirectorioRemisiones.setText("Remisión");
        jButtonDirectorioRemisiones.setToolTipText("Abrir directorio de remisiones");
        jButtonDirectorioRemisiones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonDirectorioRemisiones.setNextFocusableComponent(jBDirX);
        jPanel1.add(jButtonDirectorioRemisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, -1));

        jBDirX.setBackground(new java.awt.Color(255, 255, 255));
        jBDirX.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirX.setForeground(new java.awt.Color(0, 102, 0));
        jBDirX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dircortx.png"))); // NOI18N
        jBDirX.setText("Corte X");
        jBDirX.setToolTipText("Abrir directorio de cortes X");
        jBDirX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirX.setNextFocusableComponent(jBDirZ);
        jPanel1.add(jBDirX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, 30));

        jBDev.setBackground(new java.awt.Color(255, 255, 255));
        jBDev.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDev.setForeground(new java.awt.Color(0, 102, 0));
        jBDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devs.png"))); // NOI18N
        jBDev.setText("Devolución");
        jBDev.setToolTipText("Devolución completa de venta(s) (F2)");
        jBDev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDev.setNextFocusableComponent(jBDevP);
        jPanel1.add(jBDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, -1));

        jBDirZ.setBackground(new java.awt.Color(255, 255, 255));
        jBDirZ.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirZ.setForeground(new java.awt.Color(0, 102, 0));
        jBDirZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dircortz.png"))); // NOI18N
        jBDirZ.setText("Corte Z");
        jBDirZ.setToolTipText("Abrir directorio de cortes Z");
        jBDirZ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirZ.setNextFocusableComponent(jButtonDirectorioNotaCredito);
        jPanel1.add(jBDirZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));

        jBDevP.setBackground(new java.awt.Color(255, 255, 255));
        jBDevP.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDevP.setForeground(new java.awt.Color(0, 102, 0));
        jBDevP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devpar.png"))); // NOI18N
        jBDevP.setText("Parcial");
        jBDevP.setToolTipText("Devolución paracial de venta(s) (F3)");
        jBDevP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDevP.setNextFocusableComponent(jBNew);
        jPanel1.add(jBDevP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 30));

        jButtonDirectorioNotaCredito.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDirectorioNotaCredito.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDirectorioNotaCredito.setForeground(new java.awt.Color(0, 102, 0));
        jButtonDirectorioNotaCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dir.png"))); // NOI18N
        jButtonDirectorioNotaCredito.setText("N.Crédito");
        jButtonDirectorioNotaCredito.setToolTipText("Directorio de las Notas de crédito");
        jButtonDirectorioNotaCredito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonDirectorioNotaCredito.setNextFocusableComponent(jButtonDirectorioCFDI);
        jPanel1.add(jButtonDirectorioNotaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nueva");
        jBNew.setToolTipText("Nueva factura o Remisión (Ctrl+N). Presionando (Alt y este Botón) Puedes Tomar la Venta Seleccionada como Machote para una Nueva Factura o remisión");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jButtonAbrir);
        jPanel1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 30));

        jButtonDirectorioCFDI.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDirectorioCFDI.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDirectorioCFDI.setForeground(new java.awt.Color(0, 102, 0));
        jButtonDirectorioCFDI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dircfd.png"))); // NOI18N
        jButtonDirectorioCFDI.setText(" CFDI");
        jButtonDirectorioCFDI.setToolTipText("Directorio de PDF CFDI");
        jButtonDirectorioCFDI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonDirectorioCFDI.setName(""); // NOI18N
        jButtonDirectorioCFDI.setNextFocusableComponent(jButtonDirectorioTickets);
        jPanel1.add(jButtonDirectorioCFDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, 30));

        jButtonNotaCredito.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNotaCredito.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonNotaCredito.setForeground(new java.awt.Color(0, 102, 0));
        jButtonNotaCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/notcred.png"))); // NOI18N
        jButtonNotaCredito.setText("Not.crédito");
        jButtonNotaCredito.setToolTipText("Generar una nueva nota de crédito. Presionando (Alt y este botón) puedes tomar la nota de crédito seleccionada como machote para una nueva nota de crédito");
        jButtonNotaCredito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNotaCredito.setNextFocusableComponent(jBVer);
        jPanel1.add(jButtonNotaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 30));

        jButtonDirectorioTickets.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDirectorioTickets.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDirectorioTickets.setForeground(new java.awt.Color(0, 102, 0));
        jButtonDirectorioTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dirpdftic.png"))); // NOI18N
        jButtonDirectorioTickets.setText("Tickets");
        jButtonDirectorioTickets.setToolTipText("Directorio de PDF tickets");
        jButtonDirectorioTickets.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonDirectorioTickets.setNextFocusableComponent(jBDirCan);
        jPanel1.add(jButtonDirectorioTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 130, 30));

        jBVer.setBackground(new java.awt.Color(255, 255, 255));
        jBVer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVer.setForeground(new java.awt.Color(0, 102, 0));
        jBVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ver.png"))); // NOI18N
        jBVer.setText("Ver");
        jBVer.setToolTipText("Ver venta(s) en otra vista");
        jBVer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVer.setNextFocusableComponent(jButtonEnviar);
        jPanel1.add(jBVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 140, 30));

        jBDirCan.setBackground(new java.awt.Color(255, 255, 255));
        jBDirCan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirCan.setForeground(new java.awt.Color(0, 102, 0));
        jBDirCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dirvtacan.png"))); // NOI18N
        jBDirCan.setText("Cancelados");
        jBDirCan.setToolTipText("Directorio de ventas canceladas");
        jBDirCan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirCan.setNextFocusableComponent(jBDirBack);
        jPanel1.add(jBDirCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 130, 30));

        jButtonEnviar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEnviar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonEnviar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corrs.png"))); // NOI18N
        jButtonEnviar.setText("Enviar F8");
        jButtonEnviar.setToolTipText("Reenviar factura(s)");
        jButtonEnviar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEnviar.setNextFocusableComponent(jBPDF);
        jPanel1.add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 140, 30));

        jBDirBack.setBackground(new java.awt.Color(255, 255, 255));
        jBDirBack.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirBack.setForeground(new java.awt.Color(0, 102, 0));
        jBDirBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/direntback.png"))); // NOI18N
        jBDirBack.setText("Backorders");
        jBDirBack.setToolTipText("Direcotio de entregas de backorders");
        jBDirBack.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirBack.setNextFocusableComponent(jBDirDev);
        jPanel1.add(jBDirBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 130, 30));

        jBPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jBPDF.setText("Ver PDF");
        jBPDF.setToolTipText("Ver PDF (Alt+F)");
        jBPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBPDF.setNextFocusableComponent(jButtonActualizar);
        jPanel1.add(jBPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 30));

        jBDirDev.setBackground(new java.awt.Color(255, 255, 255));
        jBDirDev.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirDev.setForeground(new java.awt.Color(0, 102, 0));
        jBDirDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dirdevp.png"))); // NOI18N
        jBDirDev.setText("Devoluciones");
        jBDirDev.setToolTipText("Direcotio de devoluciones");
        jBDirDev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirDev.setNextFocusableComponent(jBDirDevP);
        jPanel1.add(jBDirDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 130, 30));

        jButtonActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setToolTipText("Actualizar registros (F5)");
        jButtonActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonActualizar.setNextFocusableComponent(jButtonTimbrar);
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, 30));

        jBDirDevP.setBackground(new java.awt.Color(255, 255, 255));
        jBDirDevP.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDirDevP.setForeground(new java.awt.Color(0, 102, 0));
        jBDirDevP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dirdevp.png"))); // NOI18N
        jBDirDevP.setText("Dev.Parcial");
        jBDirDevP.setToolTipText("Direcotio de devoluciones parciales");
        jBDirDevP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDirDevP.setNextFocusableComponent(jButtonDirectorioAcuses);
        jPanel1.add(jBDirDevP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 130, 30));

        jButtonTimbrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTimbrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonTimbrar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonTimbrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cfdtim.png"))); // NOI18N
        jButtonTimbrar.setText("Timbrar");
        jButtonTimbrar.setToolTipText("Timbrar factura(s)");
        jButtonTimbrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTimbrar.setName(""); // NOI18N
        jButtonTimbrar.setNextFocusableComponent(jBEntre);
        jPanel1.add(jButtonTimbrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 140, 30));

        jButtonDirectorioAcuses.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDirectorioAcuses.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDirectorioAcuses.setForeground(new java.awt.Color(0, 102, 0));
        jButtonDirectorioAcuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dir.png"))); // NOI18N
        jButtonDirectorioAcuses.setText("Acuses");
        jButtonDirectorioAcuses.setToolTipText("Directorio de acuses");
        jButtonDirectorioAcuses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButtonDirectorioAcuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 130, 30));

        jBEntre.setBackground(new java.awt.Color(255, 255, 255));
        jBEntre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBEntre.setForeground(new java.awt.Color(0, 102, 0));
        jBEntre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/entmerc.png"))); // NOI18N
        jBEntre.setText("Entregar");
        jBEntre.setToolTipText("Entregar backorders de la venta");
        jBEntre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBEntre.setNextFocusableComponent(jButtonComprobar);
        jPanel1.add(jBEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 140, 30));

        jButtonComprobar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonComprobar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonComprobar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonComprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prob.png"))); // NOI18N
        jButtonComprobar.setText("Comprobar");
        jButtonComprobar.setToolTipText("Comprobar si esta timbrada la venta o no");
        jButtonComprobar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonComprobar.setNextFocusableComponent(jButtonAcuse);
        jPanel1.add(jButtonComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 140, 30));

        jButtonAcuse.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAcuse.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAcuse.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAcuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/acerd.png"))); // NOI18N
        jButtonAcuse.setText("Acuse");
        jButtonAcuse.setToolTipText("Obtener acuse de venta(s)");
        jButtonAcuse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAcuse.setNextFocusableComponent(jButtonObtenerXML);
        jPanel1.add(jButtonAcuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 140, 30));

        jButtonObtenerXML.setBackground(new java.awt.Color(255, 255, 255));
        jButtonObtenerXML.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonObtenerXML.setForeground(new java.awt.Color(0, 102, 0));
        jButtonObtenerXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/adver.png"))); // NOI18N
        jButtonObtenerXML.setText("Obtener XML");
        jButtonObtenerXML.setToolTipText("Obtener el XML de una venta timbrada");
        jButtonObtenerXML.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonObtenerXML.setNextFocusableComponent(jButtonTicketsFacturados);
        jPanel1.add(jButtonObtenerXML, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 140, 30));

        jButtonTicketsFacturados.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTicketsFacturados.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonTicketsFacturados.setForeground(new java.awt.Color(0, 102, 0));
        jButtonTicketsFacturados.setText("Tickets Facturados");
        jButtonTicketsFacturados.setToolTipText("Mostrar tickets facturados");
        jButtonTicketsFacturados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTicketsFacturados.setNextFocusableComponent(jButtonDirectorioRemisiones);
        jPanel1.add(jButtonTicketsFacturados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 130, 30));

        jButtonBorrarDocumento.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBorrarDocumento.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButtonBorrarDocumento.setForeground(new java.awt.Color(0, 102, 0));
        jButtonBorrarDocumento.setText("Borrar");
        jButtonBorrarDocumento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButtonBorrarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jButtonVerArchivos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVerArchivos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonVerArchivos.setForeground(new java.awt.Color(0, 102, 0));
        jButtonVerArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/verarch.png"))); // NOI18N
        jButtonVerArchivos.setText("Archivo(s)");
        jButtonVerArchivos.setToolTipText("Ver archivos asociados a la venta");
        jButtonVerArchivos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonVerArchivos.setNextFocusableComponent(jButtonCargar);
        jPanel1.add(jButtonVerArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 130, 30));

        jButtonCargar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCargar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButtonCargar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonCargar.setText("Cargar");
        jButtonCargar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCargar.setNextFocusableComponent(jButtonBorrarDocumento);
        jPanel1.add(jButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, 20));

        jBCli.setBackground(new java.awt.Color(255, 255, 255));
        jBCli.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCli.setForeground(new java.awt.Color(0, 102, 0));
        jBCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fac.png"))); // NOI18N
        jBCli.setText("Facturar");
        jBCli.setToolTipText("Facturar ventas ya sean remisiones o tickets");
        jPanel1.add(jBCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 130, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jButtonDirectorioRemisiones);
        jPanel1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 130, 30));

        jButtonAbrir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAbrir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAbrir.setForeground(new java.awt.Color(0, 102, 0));
        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        jButtonAbrir.setText("Abrir");
        jButtonAbrir.setToolTipText("Abrir cotizaciòn(es) (Ctrl+A)");
        jButtonAbrir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAbrir.setName(""); // NOI18N
        jButtonAbrir.setNextFocusableComponent(jButtonNotaCredito);
        jPanel1.add(jButtonAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, -1));

        jButtonRelacionar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRelacionar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonRelacionar.setForeground(new java.awt.Color(0, 102, 0));
        jButtonRelacionar.setText("Relacionar");
        jPanel1.add(jButtonRelacionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 130, 30));

        jBAbrNotCred.setText("Abrir Not. Cred.");
        jPanel1.add(jBAbrNotCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 140, -1));

        jP1.add(jPanel1);
        jPanel1.setBounds(800, 0, 270, 520);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jTab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Venta", "Qty", "Entregados", "Producto", "Desripción", "Devueltos", "Kit", "Unidad", "Almacén", "Moneda", "Precio", "Descuento", "Importe", "Impuesto", "Fecha", "Talla", "Color", "Lote", "Pedimento", "Caducidad", "Backorder", "Serie Producto", "Comentario Serie", "Activo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab2.setGridColor(new java.awt.Color(255, 255, 255));
        jTab2.setNextFocusableComponent(jBGenPDF);
        jTab2.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTab2);

        jPanel3.add(jScrollPane1);

        jP1.add(jPanel3);
        jPanel3.setBounds(20, 290, 780, 210);

        jRadioBoxTipoDeVentas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todo", "Facturas", "Notas crédito", "Devoluciones Ventas", "Tickets" }));
        jP1.add(jRadioBoxTipoDeVentas);
        jRadioBoxTipoDeVentas.setBounds(80, 5, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Partidas:");
        jP1.add(jLabel3);
        jLabel3.setBounds(20, 270, 170, 17);

        label_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_total.setText("# Ventas y total:");
        jP1.add(label_total);
        label_total.setBounds(200, 270, 310, 17);

        navegacion.setBackground(new java.awt.Color(255, 255, 255));

        boton_primero.setBackground(new java.awt.Color(255, 255, 255));
        boton_primero.setText("<<");
        navegacion.add(boton_primero);

        boton_anterior.setBackground(new java.awt.Color(255, 255, 255));
        boton_anterior.setText("<");
        navegacion.add(boton_anterior);

        boton_siguiente.setBackground(new java.awt.Color(255, 255, 255));
        boton_siguiente.setText(">");
        navegacion.add(boton_siguiente);

        boton_ultimo.setBackground(new java.awt.Color(255, 255, 255));
        boton_ultimo.setText(">>");
        navegacion.add(boton_ultimo);

        label_pagina.setText("Página");
        navegacion.add(label_pagina);

        jP1.add(navegacion);
        navegacion.setBounds(460, 250, 340, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ventas:");
        jP1.add(jLabel4);
        jLabel4.setBounds(20, 10, 70, 17);

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jP1.add(jTBusc);
        jTBusc.setBounds(160, 230, 490, 20);

        getContentPane().add(jP1);
        jP1.setBounds(0, 0, 1080, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_anterior;
    private javax.swing.JButton boton_primero;
    private javax.swing.JButton boton_siguiente;
    private javax.swing.JButton boton_ultimo;
    private javax.swing.JButton jBAbrNotCred;
    private javax.swing.JButton jBAyu;
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBCa;
    private javax.swing.JButton jBCli;
    private javax.swing.JButton jBDev;
    private javax.swing.JButton jBDevP;
    private javax.swing.JButton jBDirBack;
    private javax.swing.JButton jBDirCan;
    private javax.swing.JButton jBDirDev;
    private javax.swing.JButton jBDirDevP;
    private javax.swing.JButton jBDirX;
    private javax.swing.JButton jBDirZ;
    private javax.swing.JButton jBEntre;
    private javax.swing.JButton jBGenPDF;
    private javax.swing.JButton jBMosT;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBPDF;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTab2;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBVer;
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAcuse;
    private javax.swing.JButton jButtonBorrarDocumento;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonComprobar;
    private javax.swing.JButton jButtonDirectorioAcuses;
    private javax.swing.JButton jButtonDirectorioCFDI;
    private javax.swing.JButton jButtonDirectorioNotaCredito;
    private javax.swing.JButton jButtonDirectorioRemisiones;
    private javax.swing.JButton jButtonDirectorioTickets;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonNotaCredito;
    private javax.swing.JButton jButtonObtenerXML;
    private javax.swing.JButton jButtonRelacionar;
    private javax.swing.JButton jButtonTicketsFacturados;
    private javax.swing.JButton jButtonTimbrar;
    private javax.swing.JButton jButtonVerArchivos;
    private javax.swing.JLabel jLNot;
    private javax.swing.JLabel jLNotCli;
    private javax.swing.JLabel jLTimb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelRemisionFactura;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox jRadioBoxTipoDeVentas;
    private javax.swing.JScrollPane jSTab1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTab2;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JLabel label_pagina;
    private javax.swing.JLabel label_total;
    private javax.swing.JPanel navegacion;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Empresas extends javax.swing.JFrame */
