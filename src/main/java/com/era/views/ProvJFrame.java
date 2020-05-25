package com.era.views;

public abstract class ProvJFrame extends BaseJFrame 
{
    public ProvJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
    
        postInitComponents();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jTNomb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTCP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTCall = new javax.swing.JTextField();
        jTEstad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTPai = new javax.swing.JTextField();
        jTCiu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTCol = new javax.swing.JTextField();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTRFC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTDesc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTTel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jTCorreo1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTPag1 = new javax.swing.JTextField();
        jTEje = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTCorreo2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTCorreo3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTPag2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTTelPerl11 = new javax.swing.JTextField();
        jTTelPer1 = new javax.swing.JTextField();
        jTEje2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTTelPersol22 = new javax.swing.JTextField();
        jTTelPerso2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTNoInt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTDCred = new javax.swing.JTextField();
        jTLimiCred = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTNoExt = new javax.swing.JTextField();
        jLPag2 = new javax.swing.JLabel();
        jLPag1 = new javax.swing.JLabel();
        jLCorreo1 = new javax.swing.JLabel();
        jLCorreo2 = new javax.swing.JLabel();
        jLCorreo3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRaFisi = new javax.swing.JRadioButton();
        jRaMor = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jTClas = new javax.swing.JTextField();
        jBClas = new javax.swing.JButton();
        jTClasDescrip = new javax.swing.JTextField();
        jBContac = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTPag = new javax.swing.JTextField();
        jTRev = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jComSer = new javax.swing.JComboBox();
        jTCodProv = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jCOtraMon = new javax.swing.JCheckBox();
        jCOrdOtrMon = new javax.swing.JCheckBox();
        jCBloq = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jTLada = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTExten = new javax.swing.JTextField();
        jTCel = new javax.swing.JTextField();
        jBDom = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTGir = new javax.swing.JTextField();
        jTZon = new javax.swing.JTextField();
        jBZon = new javax.swing.JButton();
        jBGir = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jTCtaConta = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTRub = new javax.swing.JTextField();
        jBRub = new javax.swing.JButton();
        jTRubDescrip = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTMetPag = new javax.swing.JTextField();
        jTCta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTEntre = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTBanc = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTClavBanc = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTJera = new javax.swing.JTextField();
        jBJera = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jTProv = new javax.swing.JTextField();
        jCBloqCred = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        jTBeneficiario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTNomb.setToolTipText("");
        jTNomb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNomb.setNextFocusableComponent(jTLada);
        jP1.add(jTNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, 20));

        jLabel2.setText("*Razón social:");
        jLabel2.setToolTipText("Nombre de la Empresa o Nombnre del Proveedor");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        jLabel3.setText("*Calle:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jTCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCP.setNextFocusableComponent(jTCall);        
        jP1.add(jTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 230, 20));

        jLabel4.setText("*Colonia:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jTCall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCall.setNextFocusableComponent(jTNoExt);
        jP1.add(jTCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 230, 20));

        jTEstad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstad.setNextFocusableComponent(jTPai);
        jP1.add(jTEstad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 230, 20));

        jLabel5.setText("*Estado:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel6.setText("*País:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jTPai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPai.setNextFocusableComponent(jTRFC);
        jP1.add(jTPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 230, 20));

        jTCiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiu.setNextFocusableComponent(jTEstad);
        jP1.add(jTCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, 20));

        jLabel7.setText("*Ciudad:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel8.setText("Observaciones:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jTCol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCol.setNextFocusableComponent(jTCiu);
        jP1.add(jTCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 230, 20));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 110, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTProv);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 120, 30));

        jTRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRFC.setNextFocusableComponent(jTDesc);
        jP1.add(jTRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 230, 20));

        jLabel11.setText("*RFC:");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel12.setText("Límite de crédito:");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 120, -1));

        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDesc.setNextFocusableComponent(jTDCred);
        jP1.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 230, 20));

        jLabel13.setText("Teléfono:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jTTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTel.setNextFocusableComponent(jTExten);
        jP1.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 140, 20));

        jScrollPane1.setNextFocusableComponent(jTClas);

        jTAObserv.setColumns(20);
        jTAObserv.setLineWrap(true);
        jTAObserv.setRows(5);
        jTAObserv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAObserv.setNextFocusableComponent(jTClas);
        jScrollPane1.setViewportView(jTAObserv);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 230, 40));

        jLabel14.setText("Correo1:");
        jP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jTCorreo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCorreo1.setNextFocusableComponent(jTCorreo2);
        jP1.add(jTCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 230, 20));

        jLabel15.setText("Página web1:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jTPag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPag1.setNextFocusableComponent(jTPag2);
        jP1.add(jTPag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 230, 20));

        jTEje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEje.setNextFocusableComponent(jTTelPerl11);
        jP1.add(jTEje, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 230, 20));

        jLabel17.setText("Correo2:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jTCorreo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCorreo2.setNextFocusableComponent(jTCorreo3);
        jP1.add(jTCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 230, 20));

        jLabel18.setText("Correo3:");
        jP1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jTCorreo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCorreo3.setNextFocusableComponent(jTPag1);
        jP1.add(jTCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 230, 20));

        jLabel19.setText("Página web2:");
        jP1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jTPag2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPag2.setNextFocusableComponent(jTEje);
        jP1.add(jTPag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 230, 20));

        jLabel21.setText("Beneficiario:");
        jP1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 415, 120, -1));

        jLabel22.setText("Teléfono personal 1:");
        jP1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 130, -1));

        jLabel23.setText("Teléfono personal 2:");
        jP1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 130, -1));

        jLabel24.setText("Contacto 2:");
        jP1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 120, -1));

        jTTelPerl11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTelPerl11.setNextFocusableComponent(jTTelPersol22);
        jP1.add(jTTelPerl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 230, 20));

        jTTelPer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTelPer1.setNextFocusableComponent(jTTelPerso2);
        jP1.add(jTTelPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 230, 20));

        jTEje2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEje2.setNextFocusableComponent(jTTelPer1);
        jP1.add(jTEje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 230, 20));

        jLabel25.setText("Teléfono personal 1:");
        jP1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 130, -1));

        jLabel26.setText("Teléfono personal 2:");
        jP1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 130, -1));

        jTTelPersol22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTelPersol22.setNextFocusableComponent(jTEje2);
        jP1.add(jTTelPersol22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 230, 20));

        jTTelPerso2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTelPerso2.setNextFocusableComponent(jTAObserv);
        jP1.add(jTTelPerso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 230, 20));

        jLabel27.setText("*CP:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel28.setText("No. interior:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        jTNoInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoInt.setNextFocusableComponent(jTCol);
        jP1.add(jTNoInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 230, 20));

        jLabel29.setText("Descuento %:");
        jP1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, -1));

        jLabel30.setText("Días de crédito:");
        jP1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, -1));

        jTDCred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDCred.setNextFocusableComponent(jTLimiCred);
        jP1.add(jTDCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 230, 20));

        jTLimiCred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLimiCred.setNextFocusableComponent(jTMetPag);
        jP1.add(jTLimiCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 230, 20));

        jLabel9.setText("*No. exterior:");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        jTNoExt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExt.setNextFocusableComponent(jTNoInt);
        jP1.add(jTNoExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 20));

        jLPag2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jLPag2.setForeground(new java.awt.Color(0, 0, 255));
        jLPag2.setText("-");
        jP1.add(jLPag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 230, -1));

        jLPag1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jLPag1.setForeground(new java.awt.Color(0, 0, 255));
        jLPag1.setText("-");
        jP1.add(jLPag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 230, -1));

        jLCorreo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jLCorreo1.setForeground(new java.awt.Color(51, 51, 255));
        jLCorreo1.setText("-");
        jP1.add(jLCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 230, -1));

        jLCorreo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jLCorreo2.setForeground(new java.awt.Color(51, 51, 255));
        jLCorreo2.setText("-");
        jP1.add(jLCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 230, -1));

        jLCorreo3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jLCorreo3.setForeground(new java.awt.Color(51, 51, 255));
        jLCorreo3.setText("-");
        jP1.add(jLCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 230, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRaFisi.setBackground(new java.awt.Color(255, 255, 255));
        jRaFisi.setText("Persona física");
        jRaFisi.setNextFocusableComponent(jTNomb);
        jPanel2.add(jRaFisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 120, -1));

        jRaMor.setBackground(new java.awt.Color(255, 255, 255));
        jRaMor.setSelected(true);
        jRaMor.setText("Persona moral");
        jRaMor.setNextFocusableComponent(jRaFisi);
        jPanel2.add(jRaMor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        jP1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 240, 30));

        jLabel32.setText("Clasificación:");
        jP1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 100, -1));

        jTClas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClas.setNextFocusableComponent(jBClas);
        jP1.add(jTClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 100, 20));

        jBClas.setBackground(new java.awt.Color(255, 255, 255));
        jBClas.setText("...");
        jBClas.setToolTipText("Buscar Calsificación(es)");
        jBClas.setNextFocusableComponent(jTRub);
        jP1.add(jBClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 30, 20));

        jTClasDescrip.setEditable(false);
        jTClasDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTClasDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 100, 20));

        jBContac.setBackground(new java.awt.Color(255, 255, 255));
        jBContac.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBContac.setForeground(new java.awt.Color(0, 102, 0));
        jBContac.setText("Contactos F2");
        jBContac.setNextFocusableComponent(jBDom);
        jP1.add(jBContac, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 120, -1));

        jLabel33.setText("Revisión:");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 100, -1));

        jLabel16.setText("Pagos:");
        jP1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 100, -1));

        jTPag.setToolTipText("Días en los que se Hacen Pagos de Facturas");
        jTPag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPag.setNextFocusableComponent(jComSer);
        jP1.add(jTPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 100, 20));

        jTRev.setToolTipText("Días en los que se llevan Documentos  a Contra Recibo");
        jTRev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRev.setNextFocusableComponent(jTPag);
        jP1.add(jTRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 100, 20));

        jLabel35.setText("*Serie:");
        jP1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 100, -1));

        jComSer.setNextFocusableComponent(jTCodProv);
        jP1.add(jComSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 100, 20));

        jTCodProv.setBackground(new java.awt.Color(204, 255, 204));
        jTCodProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCodProv.setNextFocusableComponent(jTGir);
        jP1.add(jTCodProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 100, 20));

        jLabel20.setText("Cod.proveedor:");
        jP1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 100, -1));

        jCOtraMon.setBackground(new java.awt.Color(255, 255, 255));
        jCOtraMon.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCOtraMon.setSelected(true);
        jCOtraMon.setText("Se le puede comprar en otra moneda");
        jCOtraMon.setNextFocusableComponent(jCOrdOtrMon);
        jP1.add(jCOtraMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 230, -1));

        jCOrdOtrMon.setBackground(new java.awt.Color(255, 255, 255));
        jCOrdOtrMon.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCOrdOtrMon.setSelected(true);
        jCOrdOtrMon.setText("Se le puede ordenar en otra moneda");
        jCOrdOtrMon.setNextFocusableComponent(jRaMor);
        jP1.add(jCOrdOtrMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 230, -1));

        jCBloq.setBackground(new java.awt.Color(255, 255, 255));
        jCBloq.setText("Bloqueado");
        jCBloq.setNextFocusableComponent(jCBloqCred);
        jP1.add(jCBloq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 120, 20));

        jLabel31.setText("Lada:");
        jP1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 40, 20));

        jTLada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLada.setNextFocusableComponent(jTTel);
        jP1.add(jTLada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, 20));

        jLabel34.setText("Extensión:");
        jP1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        jLabel41.setText("Celular:");
        jP1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        jTExten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTExten.setNextFocusableComponent(jTCel);
        jP1.add(jTExten, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 230, 20));

        jTCel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCel.setNextFocusableComponent(jTCP);
        jP1.add(jTCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 230, 20));

        jBDom.setBackground(new java.awt.Color(255, 255, 255));
        jBDom.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDom.setForeground(new java.awt.Color(0, 102, 0));
        jBDom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/doment.png"))); // NOI18N
        jBDom.setText("Entrega");
        jBDom.setToolTipText("Domicilio de Entrega del Proveedor");
        jBDom.setNextFocusableComponent(jCOtraMon);
        jP1.add(jBDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 120, 30));

        jLabel43.setText("Giro:");
        jP1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 100, -1));

        jLabel40.setText("Zona:");
        jP1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 100, -1));

        jTGir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTGir.setNextFocusableComponent(jBGir);
        jP1.add(jTGir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 100, 20));

        jTZon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTZon.setNextFocusableComponent(jBZon);
        jP1.add(jTZon, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 100, 20));

        jBZon.setBackground(new java.awt.Color(255, 255, 255));
        jBZon.setText("...");
        jBZon.setToolTipText("Buscar Clasificación(es)");
        jBZon.setNextFocusableComponent(jTEntre);
        jP1.add(jBZon, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 30, 20));

        jBGir.setBackground(new java.awt.Color(255, 255, 255));
        jBGir.setText("...");
        jBGir.setToolTipText("Buscar Clasificación(es)");
        jBGir.setNextFocusableComponent(jTZon);
        jP1.add(jBGir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 30, 20));

        jLabel44.setText("Cuenta contable:");
        jP1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 130, -1));

        jTCtaConta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCtaConta.setNextFocusableComponent(jTBanc);
        jP1.add(jTCtaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 230, 20));

        jLabel36.setText("Rubro:");
        jP1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 100, -1));

        jTRub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRub.setNextFocusableComponent(jBRub);
        jP1.add(jTRub, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 100, 20));

        jBRub.setBackground(new java.awt.Color(255, 255, 255));
        jBRub.setText("...");
        jBRub.setToolTipText("Buscar Calsificación(es)");
        jBRub.setNextFocusableComponent(jTRev);
        jP1.add(jBRub, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 30, 20));

        jTRubDescrip.setEditable(false);
        jTRubDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTRubDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 100, 20));

        jLabel37.setText("Método pago:");
        jP1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 130, -1));

        jTMetPag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMetPag.setNextFocusableComponent(jTCta);
        jP1.add(jTMetPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 230, 20));

        jTCta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCta.setNextFocusableComponent(jTCtaConta);
        jP1.add(jTCta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 230, 20));

        jLabel10.setText("Cuenta bancaria:");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, -1));

        jLabel38.setText("Tiempo entrega:");
        jP1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 100, -1));

        jTEntre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEntre.setNextFocusableComponent(jTJera);
        jP1.add(jTEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 100, 20));

        jLabel46.setText("Banco:");
        jP1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 130, -1));

        jTBanc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBanc.setNextFocusableComponent(jTClavBanc);
        jP1.add(jTBanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 230, 20));

        jLabel47.setText("Clabe interbancaria:");
        jP1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, -1));

        jTClavBanc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClavBanc.setNextFocusableComponent(jCBloq);
        jP1.add(jTClavBanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 230, 20));

        jLabel39.setText("Jerárquia:");
        jLabel39.setToolTipText("Depósito en Garantía");
        jP1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 100, -1));

        jTJera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTJera.setNextFocusableComponent(jBJera);
        jP1.add(jTJera, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 100, 20));

        jBJera.setBackground(new java.awt.Color(255, 255, 255));
        jBJera.setText("...");
        jBJera.setToolTipText("Buscar Jerárquia(s)");
        jBJera.setNextFocusableComponent(jBContac);
        jP1.add(jBJera, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, 30, 20));

        jLabel42.setText("Cod.proveedor:");
        jP1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 120, -1));

        jTProv.setEditable(false);
        jTProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProv.setNextFocusableComponent(jTCorreo1);
        jP1.add(jTProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 130, 20));

        jCBloqCred.setBackground(new java.awt.Color(255, 255, 255));
        jCBloqCred.setText("Bloquear crédito");
        jCBloqCred.setNextFocusableComponent(jBGuar);
        jP1.add(jCBloqCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 130, 20));

        jLabel45.setText("Contacto 1:");
        jP1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 120, -1));

        jTBeneficiario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBeneficiario.setNextFocusableComponent(jTTelPerl11);
        jP1.add(jTBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 230, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClas;
    private javax.swing.JButton jBContac;
    private javax.swing.JButton jBDom;
    private javax.swing.JButton jBGir;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBJera;
    private javax.swing.JButton jBRub;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBZon;
    private javax.swing.JCheckBox jCBloq;
    private javax.swing.JCheckBox jCBloqCred;
    private javax.swing.JCheckBox jCOrdOtrMon;
    private javax.swing.JCheckBox jCOtraMon;
    private javax.swing.JComboBox jComSer;
    private javax.swing.JLabel jLCorreo1;
    private javax.swing.JLabel jLCorreo2;
    private javax.swing.JLabel jLCorreo3;
    private javax.swing.JLabel jLPag1;
    private javax.swing.JLabel jLPag2;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRaFisi;
    private javax.swing.JRadioButton jRaMor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAObserv;
    private javax.swing.JTextField jTBanc;
    private javax.swing.JTextField jTBeneficiario;
    private javax.swing.JTextField jTCP;
    private javax.swing.JTextField jTCall;
    private javax.swing.JTextField jTCel;
    private javax.swing.JTextField jTCiu;
    private javax.swing.JTextField jTClas;
    private javax.swing.JTextField jTClasDescrip;
    private javax.swing.JTextField jTClavBanc;
    private javax.swing.JTextField jTCodProv;
    private javax.swing.JTextField jTCol;
    private javax.swing.JTextField jTCorreo1;
    private javax.swing.JTextField jTCorreo2;
    private javax.swing.JTextField jTCorreo3;
    private javax.swing.JTextField jTCta;
    private javax.swing.JTextField jTCtaConta;
    private javax.swing.JTextField jTDCred;
    private javax.swing.JTextField jTDesc;
    private javax.swing.JTextField jTEje;
    private javax.swing.JTextField jTEje2;
    private javax.swing.JTextField jTEntre;
    private javax.swing.JTextField jTEstad;
    private javax.swing.JTextField jTExten;
    private javax.swing.JTextField jTGir;
    private javax.swing.JTextField jTJera;
    private javax.swing.JTextField jTLada;
    private javax.swing.JTextField jTLimiCred;
    private javax.swing.JTextField jTMetPag;
    private javax.swing.JTextField jTNoExt;
    private javax.swing.JTextField jTNoInt;
    private javax.swing.JTextField jTNomb;
    private javax.swing.JTextField jTPag;
    private javax.swing.JTextField jTPag1;
    private javax.swing.JTextField jTPag2;
    private javax.swing.JTextField jTPai;
    private javax.swing.JTextField jTProv;
    private javax.swing.JTextField jTRFC;
    private javax.swing.JTextField jTRev;
    private javax.swing.JTextField jTRub;
    private javax.swing.JTextField jTRubDescrip;
    private javax.swing.JTextField jTTel;
    private javax.swing.JTextField jTTelPer1;
    private javax.swing.JTextField jTTelPerl11;
    private javax.swing.JTextField jTTelPerso2;
    private javax.swing.JTextField jTTelPersol22;
    private javax.swing.JTextField jTZon;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class NuevoCliente extends javax.swing.JFrame */
