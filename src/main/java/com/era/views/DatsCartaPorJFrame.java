package com.era.views;


public class DatsCartaPorJFrame extends BaseJFrame {
    
    public DatsCartaPorJFrame(final String idTextTitleWindow) {

        super(idTextTitleWindow);

        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPTrans = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTNombreTrans = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTVehiculo = new javax.swing.JTextField();
        jTPlacas = new javax.swing.JTextField();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jPDestino = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTDes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTCalleDes = new javax.swing.JTextField();
        jTColDes = new javax.swing.JTextField();
        jTPaisDes = new javax.swing.JTextField();
        jTCPDes = new javax.swing.JTextField();
        jTNoExtDes = new javax.swing.JTextField();
        jTNoIntDes = new javax.swing.JTextField();
        jTCiuDes = new javax.swing.JTextField();
        jTEstadDes = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTCalleDestEnt = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTColDestEnt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTPaisDestEnt = new javax.swing.JTextField();
        jTCPDestEnt = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTNoExtDestEnt = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTNoIntDestEnt = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTCiuDestEnt = new javax.swing.JTextField();
        jTEstadDestEnt = new javax.swing.JTextField();
        jCheckDest = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jPOrigen = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTRem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTCalleOri = new javax.swing.JTextField();
        jTColOri = new javax.swing.JTextField();
        jTPaisOri = new javax.swing.JTextField();
        jTCPOri = new javax.swing.JTextField();
        jTNoExtOri = new javax.swing.JTextField();
        jTNoIntOri = new javax.swing.JTextField();
        jTRFCOri = new javax.swing.JTextField();
        jTCiuOri = new javax.swing.JTextField();
        jTEstadOri = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTCalleOriRec = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTColOriRec = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTPaisOriRec = new javax.swing.JTextField();
        jTCPOriRec = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTNoExtOriRec = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTNoIntOriRec = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTCiuOriRec = new javax.swing.JTextField();
        jTEstadOriRec = new javax.swing.JTextField();
        jCheckOri = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTrans.setBackground(new java.awt.Color(255, 255, 255));
        jPTrans.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Transportista", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPTrans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("*Nombre:");
        jPTrans.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTNombreTrans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPTrans.add(jTNombreTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, 20));

        jLabel17.setText("Placas:");
        jPTrans.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel21.setText("Vehiculo:");
        jPTrans.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jTVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPTrans.add(jTVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 220, 20));

        jTPlacas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPTrans.add(jTPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 220, 20));

        jPanel1.add(jPTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 730, 90));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jPanel1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 120, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jPanel1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 110, -1));

        jPDestino.setBackground(new java.awt.Color(255, 255, 255));
        jPDestino.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Destino", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPDestino.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("*Destinatario:");
        jPDestino.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, 20));

        jLabel7.setText("*CP:");
        jPDestino.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, -1));

        jLabel25.setText("*Calle:");
        jPDestino.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jLabel33.setText("*Colonia:");
        jPDestino.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 70, -1));

        jLabel35.setText("*No. Exterior:");
        jPDestino.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        jLabel36.setText("No. Interior:");
        jPDestino.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        jLabel37.setText("*Ciudad:");
        jPDestino.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 70, -1));

        jTCalleDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTCalleDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 20));

        jTColDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTColDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 120, 20));

        jTPaisDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTPaisDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 150, 20));

        jTCPDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTCPDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 120, 20));

        jTNoExtDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTNoExtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, 20));

        jTNoIntDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTNoIntDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, 20));

        jTCiuDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTCiuDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 120, 20));

        jTEstadDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPDestino.add(jTEstadDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 120, 20));

        jLabel46.setText("Pais:");
        jPDestino.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 30, -1));

        jLabel42.setText("*Estado:");
        jPDestino.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 70, -1));

        jLabel4.setText("Se entregara en:");
        jPDestino.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel27.setText("*Calle:");
        jPDestino.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        jTCalleDestEnt.setBackground(java.awt.SystemColor.control);
        jTCalleDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCalleDestEnt.setEnabled(false);
        jPDestino.add(jTCalleDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, 20));

        jLabel40.setText("*Colonia:");
        jPDestino.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 70, -1));

        jTColDestEnt.setBackground(java.awt.SystemColor.control);
        jTColDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTColDestEnt.setEnabled(false);
        jPDestino.add(jTColDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 20));

        jLabel12.setText("*CP:");
        jPDestino.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 70, -1));

        jLabel51.setText("Pais:");
        jPDestino.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 30, -1));

        jTPaisDestEnt.setBackground(java.awt.SystemColor.control);
        jTPaisDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPaisDestEnt.setEnabled(false);
        jPDestino.add(jTPaisDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 150, 20));

        jTCPDestEnt.setBackground(java.awt.SystemColor.control);
        jTCPDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCPDestEnt.setEnabled(false);
        jPDestino.add(jTCPDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 120, 20));

        jLabel53.setText("*No. Exterior:");
        jPDestino.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, -1));

        jTNoExtDestEnt.setBackground(java.awt.SystemColor.control);
        jTNoExtDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExtDestEnt.setEnabled(false);
        jPDestino.add(jTNoExtDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 20));

        jLabel54.setText("No. Interior:");
        jPDestino.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jTNoIntDestEnt.setBackground(java.awt.SystemColor.control);
        jTNoIntDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoIntDestEnt.setEnabled(false);
        jPDestino.add(jTNoIntDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 20));

        jLabel55.setText("*Estado:");
        jPDestino.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 70, -1));

        jLabel56.setText("*Ciudad:");
        jPDestino.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 70, -1));

        jTCiuDestEnt.setBackground(java.awt.SystemColor.control);
        jTCiuDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiuDestEnt.setEnabled(false);
        jPDestino.add(jTCiuDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 150, 20));

        jTEstadDestEnt.setBackground(java.awt.SystemColor.control);
        jTEstadDestEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstadDestEnt.setEnabled(false);
        jPDestino.add(jTEstadDestEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 120, 20));

        jCheckDest.setBackground(new java.awt.Color(255, 255, 255));
        jCheckDest.setSelected(true);
        jCheckDest.setText("Utilizar direccion del destinatario");
        jPDestino.add(jCheckDest, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));
        jPDestino.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 710, -1));

        jPanel1.add(jPDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 730, 250));

        jPOrigen.setBackground(new java.awt.Color(255, 255, 255));
        jPOrigen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Origen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPOrigen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("*Remitente:");
        jPOrigen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTRem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTRem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, 20));

        jLabel1.setText("*Fecha de entrega:");
        jPOrigen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel6.setText("*CP:");
        jPOrigen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, -1));

        jLabel24.setText("*Calle:");
        jPOrigen.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jLabel30.setText("*Colonia:");
        jPOrigen.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 70, -1));

        jLabel31.setText("*No. Exterior:");
        jPOrigen.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        jLabel32.setText("No. Interior:");
        jPOrigen.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        jLabel34.setText("*Ciudad:");
        jPOrigen.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 70, -1));

        jTCalleOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTCalleOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 20));

        jTColOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTColOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 120, 20));

        jTPaisOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTPaisOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 150, 20));

        jTCPOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTCPOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 120, 20));

        jTNoExtOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTNoExtOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, 20));

        jTNoIntOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTNoIntOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, 20));

        jTRFCOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTRFCOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 150, 20));

        jTCiuOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTCiuOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 120, 20));

        jTEstadOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPOrigen.add(jTEstadOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 120, 20));

        jLabel45.setText("Pais:");
        jPOrigen.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 30, -1));

        jLabel47.setText("*RFC:");
        jPOrigen.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 70, -1));

        jLabel41.setText("*Estado:");
        jPOrigen.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 70, -1));

        jLabel3.setText("Se recogera en:");
        jPOrigen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel26.setText("*Calle:");
        jPOrigen.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        jTCalleOriRec.setBackground(java.awt.SystemColor.control);
        jTCalleOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCalleOriRec.setEnabled(false);
        jPOrigen.add(jTCalleOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, 20));

        jLabel39.setText("*Colonia:");
        jPOrigen.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, -1));

        jTColOriRec.setBackground(java.awt.SystemColor.control);
        jTColOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTColOriRec.setEnabled(false);
        jPOrigen.add(jTColOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 20));

        jLabel10.setText("*CP:");
        jPOrigen.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 70, -1));

        jLabel49.setText("Pais:");
        jPOrigen.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 30, -1));

        jTPaisOriRec.setBackground(java.awt.SystemColor.control);
        jTPaisOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPaisOriRec.setEnabled(false);
        jPOrigen.add(jTPaisOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 120, 20));

        jTCPOriRec.setBackground(new java.awt.Color(240, 240, 240));
        jTCPOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCPOriRec.setEnabled(false);
        jPOrigen.add(jTCPOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 20));

        jLabel43.setText("*No. Exterior:");
        jPOrigen.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, -1));

        jTNoExtOriRec.setBackground(java.awt.SystemColor.control);
        jTNoExtOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExtOriRec.setEnabled(false);
        jPOrigen.add(jTNoExtOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 20));

        jLabel44.setText("No. Interior:");
        jPOrigen.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jTNoIntOriRec.setBackground(java.awt.SystemColor.control);
        jTNoIntOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoIntOriRec.setEnabled(false);
        jPOrigen.add(jTNoIntOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 20));

        jLabel50.setText("*Estado:");
        jPOrigen.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 70, -1));

        jLabel52.setText("*Ciudad:");
        jPOrigen.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 70, -1));

        jTCiuOriRec.setBackground(java.awt.SystemColor.control);
        jTCiuOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiuOriRec.setEnabled(false);
        jPOrigen.add(jTCiuOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 120, 20));

        jTEstadOriRec.setBackground(new java.awt.Color(240, 240, 240));
        jTEstadOriRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstadOriRec.setEnabled(false);
        jPOrigen.add(jTEstadOriRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 120, 20));

        jCheckOri.setBackground(new java.awt.Color(255, 255, 255));
        jCheckOri.setSelected(true);
        jCheckOri.setText("Utilizar direccion del remitente");
        jPOrigen.add(jCheckOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));
        jPOrigen.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 710, -1));

        jPanel1.add(jPOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBSal;
    private javax.swing.JCheckBox jCheckDest;
    private javax.swing.JCheckBox jCheckOri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDestino;
    private javax.swing.JPanel jPOrigen;
    private javax.swing.JPanel jPTrans;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTCPDes;
    private javax.swing.JTextField jTCPDestEnt;
    private javax.swing.JTextField jTCPOri;
    private javax.swing.JTextField jTCPOriRec;
    private javax.swing.JTextField jTCalleDes;
    private javax.swing.JTextField jTCalleDestEnt;
    private javax.swing.JTextField jTCalleOri;
    private javax.swing.JTextField jTCalleOriRec;
    private javax.swing.JTextField jTCiuDes;
    private javax.swing.JTextField jTCiuDestEnt;
    private javax.swing.JTextField jTCiuOri;
    private javax.swing.JTextField jTCiuOriRec;
    private javax.swing.JTextField jTColDes;
    private javax.swing.JTextField jTColDestEnt;
    private javax.swing.JTextField jTColOri;
    private javax.swing.JTextField jTColOriRec;
    private javax.swing.JTextField jTDes;
    private javax.swing.JTextField jTEstadDes;
    private javax.swing.JTextField jTEstadDestEnt;
    private javax.swing.JTextField jTEstadOri;
    private javax.swing.JTextField jTEstadOriRec;
    private javax.swing.JTextField jTNoExtDes;
    private javax.swing.JTextField jTNoExtDestEnt;
    private javax.swing.JTextField jTNoExtOri;
    private javax.swing.JTextField jTNoExtOriRec;
    private javax.swing.JTextField jTNoIntDes;
    private javax.swing.JTextField jTNoIntDestEnt;
    private javax.swing.JTextField jTNoIntOri;
    private javax.swing.JTextField jTNoIntOriRec;
    private javax.swing.JTextField jTNombreTrans;
    private javax.swing.JTextField jTPaisDes;
    private javax.swing.JTextField jTPaisDestEnt;
    private javax.swing.JTextField jTPaisOri;
    private javax.swing.JTextField jTPaisOriRec;
    private javax.swing.JTextField jTPlacas;
    private javax.swing.JTextField jTRFCOri;
    private javax.swing.JTextField jTRem;
    private javax.swing.JTextField jTVehiculo;
    // End of variables declaration//GEN-END:variables
}
