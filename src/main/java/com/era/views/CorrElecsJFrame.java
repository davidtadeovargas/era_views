package com.era.views;

public abstract class CorrElecsJFrame extends BaseJFrame
{
    public CorrElecsJFrame(final String idTextTitleWindow) 
    {                       
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jTServSMTPSal.grabFocus();
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jTabPan1 = new javax.swing.JTabbedPane();
        jPan1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBProbCon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBDel = new javax.swing.JButton();
        jBGuar = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBBusc = new javax.swing.JButton();
        jBMosrT = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jBLim = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTServSMTPSal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTPortSMTP = new javax.swing.JTextField();
        jCActSSLLog = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPContra = new javax.swing.JPasswordField();
        jTUsr = new javax.swing.JTextField();
        jTCorAlter = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTEsta = new javax.swing.JTextField();
        jBUsr = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTAsunOrd = new javax.swing.JTextField();
        jTCuerOrd = new javax.swing.JTextField();
        jTAsunCot = new javax.swing.JTextField();
        jTAsunContra = new javax.swing.JTextField();
        jTAsunFac = new javax.swing.JTextField();
        jTCuerFac = new javax.swing.JTextField();
        jTCuerCot = new javax.swing.JTextField();
        jTCuerContr = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTAsunCXC3 = new javax.swing.JTextField();
        jTCuerCXC3 = new javax.swing.JTextField();
        jTAsunCXC2 = new javax.swing.JTextField();
        jTAsunCXC1 = new javax.swing.JTextField();
        jTCuerCXC1 = new javax.swing.JTextField();
        jTCuerCXC2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID", "Usuario", "Nombre Usuario", "Correo Electrónico", "Correo Alternativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jPan1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 620, 180));

        jBProbCon.setBackground(new java.awt.Color(255, 255, 255));
        jBProbCon.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBProbCon.setForeground(new java.awt.Color(0, 102, 0));
        jBProbCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prov.png"))); // NOI18N
        jBProbCon.setText("Probar");
        jBProbCon.setToolTipText("Probar Conexiòn de Correo");
        jBProbCon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBProbCon.setNextFocusableComponent(jBSal);
        jPan1.add(jBProbCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Correos:");
        jPan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del5.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Cuenta(s) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBNew);
        jPan1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 120, 30));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar cambios sobre Cuenta de Correo de Usuario");
        jBGuar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBGuar.setNextFocusableComponent(jBDel);
        jPan1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 120, 30));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosrT);
        jPan1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 350, 20));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jPan1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 130, 20));

        jBMosrT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosrT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosrT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosrT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosrT.setText("Mostrar F4");
        jBMosrT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosrT.setNextFocusableComponent(jBGuar);
        jPan1.add(jBMosrT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 140, 20));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTServSMTPSal);
        jPan1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 120, 30));

        jBLim.setBackground(new java.awt.Color(255, 255, 255));
        jBLim.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBLim.setForeground(new java.awt.Color(0, 102, 0));
        jBLim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/limp.png"))); // NOI18N
        jBLim.setText("Limpiar");
        jBLim.setToolTipText("Limpiar Todos los Controles (F4)");
        jBLim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBLim.setNextFocusableComponent(jBProbCon);
        jPan1.add(jBLim, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 120, 30));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nueva Cuenta (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jBLim);
        jPan1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 120, 30));

        jLabel2.setText("*Servidor de Correo Saliente SMTP:");
        jPan1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, -1));

        jTServSMTPSal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTServSMTPSal.setNextFocusableComponent(jTPortSMTP);
        jPan1.add(jTServSMTPSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, 20));

        jLabel3.setText("*Puerto SMTP:");
        jPan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, -1));

        jTPortSMTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPortSMTP.setNextFocusableComponent(jCActSSLLog);
        jPan1.add(jTPortSMTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, 20));

        jCActSSLLog.setText("Activar SSL en Login");
        jCActSSLLog.setNextFocusableComponent(jTUsr);
        jPan1.add(jCActSSLLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, -1));

        jLabel4.setText("*Contraseña:");
        jPan1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        jLabel5.setText("*Usuario:");
        jPan1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, -1));

        jPContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPContra.setNextFocusableComponent(jTCorAlter);
        jPan1.add(jPContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 250, 20));

        jTUsr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUsr.setNextFocusableComponent(jPContra);
        jPan1.add(jTUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 250, 20));

        jTCorAlter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCorAlter.setNextFocusableComponent(jTAsunFac);
        jPan1.add(jTCorAlter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 250, 20));

        jLabel6.setText("Correo Alternativo:");
        jPan1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));

        jLabel7.setText("*Usuario:");
        jPan1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, -1));

        jTID.setEditable(false);
        jTID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPan1.add(jTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 60, 20));

        jLabel8.setText("ID:");
        jPan1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jTEsta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEsta.setNextFocusableComponent(jBBusc);
        jPan1.add(jTEsta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 220, 20));

        jBUsr.setBackground(new java.awt.Color(255, 255, 255));
        jBUsr.setText("...");
        jBUsr.setToolTipText("Buscar Usuario(s)");
        jBUsr.setNextFocusableComponent(jTab);
        jPan1.add(jBUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 30, 20));

        jLabel9.setText("*Asunto/Cuerpo Recordatorio 3 CXC:");
        jPan1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 20));

        jLabel10.setText("*Asunto/Cuerpo Factura:");
        jPan1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, 20));

        jLabel11.setText("*Asunto/Cuerpo Cotizaciòn:");
        jPan1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 20));

        jLabel12.setText("*Asunto/Cuerpo Contrarecibo:");
        jPan1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 20));

        jTAsunOrd.setText("Envío de orden de compra.");
        jTAsunOrd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunOrd.setNextFocusableComponent(jTCuerOrd);
        jPan1.add(jTAsunOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 250, 20));

        jTCuerOrd.setText("Orden de compra.");
        jTCuerOrd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerOrd.setNextFocusableComponent(jTAsunCXC1);
        jPan1.add(jTCuerOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 280, 20));

        jTAsunCot.setText("Envío de cotización.");
        jTAsunCot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunCot.setNextFocusableComponent(jTCuerCot);
        jPan1.add(jTAsunCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 250, 20));

        jTAsunContra.setText("Envío de contra recibo.");
        jTAsunContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunContra.setNextFocusableComponent(jTCuerContr);
        jPan1.add(jTAsunContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 250, 20));

        jTAsunFac.setText("Envío de CFDI.");
        jTAsunFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunFac.setNextFocusableComponent(jTCuerFac);
        jPan1.add(jTAsunFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 250, 20));

        jTCuerFac.setText("Comprobaten físcal digital.");
        jTCuerFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerFac.setNextFocusableComponent(jTAsunCot);
        jPan1.add(jTCuerFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 280, 20));

        jTCuerCot.setText("Cotización.");
        jTCuerCot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerCot.setNextFocusableComponent(jTAsunContra);
        jPan1.add(jTCuerCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 280, 20));

        jTCuerContr.setText("Contra recibo.");
        jTCuerContr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerContr.setNextFocusableComponent(jTAsunOrd);
        jPan1.add(jTCuerContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 280, 20));

        jLabel13.setText("*Asunto/Cuerpo Orden Compra:");
        jPan1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, 20));

        jLabel14.setText("*Asunto/Cuerpo Recordatorio 1 CXC:");
        jPan1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, 20));

        jLabel15.setText("*Asunto/Cuerpo Recordatorio 2 CXC:");
        jPan1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 20));

        jTAsunCXC3.setText("Envío de recordatorio de pago tercer aviso.");
        jTAsunCXC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunCXC3.setNextFocusableComponent(jTCuerCXC3);
        jPan1.add(jTAsunCXC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 250, 20));

        jTCuerCXC3.setText("Existen facturas vencidas y esto es el tercer aviso.");
        jTCuerCXC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerCXC3.setNextFocusableComponent(jTEsta);
        jPan1.add(jTCuerCXC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 280, 20));

        jTAsunCXC2.setText("Envío de recordatorio de pago segundo aviso.");
        jTAsunCXC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunCXC2.setNextFocusableComponent(jTCuerCXC2);
        jPan1.add(jTAsunCXC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, 20));

        jTAsunCXC1.setText("Envío de recordatorio de pago primer aviso.");
        jTAsunCXC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAsunCXC1.setNextFocusableComponent(jTCuerCXC1);
        jPan1.add(jTAsunCXC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 250, 20));

        jTCuerCXC1.setText("Existen facturas vencidas y esto es el primer aviso.");
        jTCuerCXC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerCXC1.setNextFocusableComponent(jTAsunCXC2);
        jPan1.add(jTCuerCXC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 280, 20));

        jTCuerCXC2.setText("Existen facturas vencidas y esto es el segundo aviso.");
        jTCuerCXC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuerCXC2.setNextFocusableComponent(jTAsunCXC3);
        jPan1.add(jTCuerCXC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 280, 20));

        jTabPan1.addTab("tab1", jPan1);

        jP1.add(jTabPan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBLim;
    protected javax.swing.JButton jBMosrT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBProbCon;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBUsr;
    protected javax.swing.JCheckBox jCActSSLLog;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPasswordField jPContra;
    private javax.swing.JPanel jPan1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTAsunCXC1;
    protected javax.swing.JTextField jTAsunCXC2;
    protected javax.swing.JTextField jTAsunCXC3;
    protected javax.swing.JTextField jTAsunContra;
    protected javax.swing.JTextField jTAsunCot;
    protected javax.swing.JTextField jTAsunFac;
    protected javax.swing.JTextField jTAsunOrd;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTCorAlter;
    protected javax.swing.JTextField jTCuerCXC1;
    protected javax.swing.JTextField jTCuerCXC2;
    protected javax.swing.JTextField jTCuerCXC3;
    protected javax.swing.JTextField jTCuerContr;
    protected javax.swing.JTextField jTCuerCot;
    protected javax.swing.JTextField jTCuerFac;
    protected javax.swing.JTextField jTCuerOrd;
    protected javax.swing.JTextField jTEsta;
    protected javax.swing.JTextField jTID;
    protected javax.swing.JTextField jTPortSMTP;
    protected javax.swing.JTextField jTServSMTPSal;
    protected javax.swing.JTextField jTUsr;
    private javax.swing.JTable jTab;
    private javax.swing.JTabbedPane jTabPan1;
    // End of variables declaration//GEN-END:variables

}
