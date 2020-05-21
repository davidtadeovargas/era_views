package com.era.views;


public class ClientJFrame extends BaseJFrame
{   
    public ClientJFrame(final String idTextTitleWindow) {               
        
        super(idTextTitleWindow);
        
        initComponents();

        this.getRootPane().setDefaultButton(jBGuar);

        jTRazSoc.grabFocus();
    }
       
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTRFC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTCo1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTPag1 = new javax.swing.JTextField();
        jTCo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jCBloq = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jRaFis = new javax.swing.JRadioButton();
        jRaMor = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jTCURP = new javax.swing.JTextField();
        jTDepGar = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTCodCli = new javax.swing.JTextField();
        jCBloqCred = new javax.swing.JCheckBox();
        pnlDatosBancarios = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jComFormPag = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTCta = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTCtaConta = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTBanc = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTClavBanc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTDesc = new javax.swing.JTextField();
        jTDCred = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTLimCred = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTBeneficiario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTCtaPred = new javax.swing.JTextField();
        jLUsoCfdi = new javax.swing.JLabel();
        jComUsoCfdi = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jComList = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jTClas = new javax.swing.JTextField();
        jBClas = new javax.swing.JButton();
        jTClasDescrip = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jComSer = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jTCodEmp = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTVend = new javax.swing.JTextField();
        jBVend = new javax.swing.JButton();
        jBContac = new javax.swing.JButton();
        jBDom = new javax.swing.JButton();
        jCOtraMon = new javax.swing.JCheckBox();
        jCCotOtrMon = new javax.swing.JCheckBox();
        pnlDireccion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTCall = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTNoExt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTNoInt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTCol = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTCP = new javax.swing.JTextField();
        jBCP = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTPai = new javax.swing.JTextField();
        jTEstad = new javax.swing.JTextField();
        jTCiu = new javax.swing.JTextField();
        jBPais = new javax.swing.JButton();
        pnlTelefonos = new javax.swing.JPanel();
        jTLada = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTTel = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTExten = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTCel = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTTelPer1 = new javax.swing.JTextField();
        jTRazSoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setPreferredSize(new java.awt.Dimension(800, 600));
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jBGuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGuarMouseExited(evt);
            }
        });
        jBGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuarActionPerformed(evt);
            }
        });
        jBGuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGuarKeyPressed(evt);
            }
        });
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 110, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setName(""); // NOI18N
        jBSal.setNextFocusableComponent(jTCodCli);
        jBSal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalMouseExited(evt);
            }
        });
        jBSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalActionPerformed(evt);
            }
        });
        jBSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSalKeyPressed(evt);
            }
        });
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 120, 30));

        jTRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRFC.setNextFocusableComponent(jTCURP);
        jTRFC.setPreferredSize(new java.awt.Dimension(230, 20));
        jTRFC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTRFCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTRFCFocusLost(evt);
            }
        });
        jTRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTRFCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTRFCKeyTyped(evt);
            }
        });
        jP1.add(jTRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, 20));

        jLabel11.setText("*RFC:");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel12.setText("CURP:");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo1.setNextFocusableComponent(jTCo2);
        jTCo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCo1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCo1FocusLost(evt);
            }
        });
        jTCo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCo1KeyPressed(evt);
            }
        });
        jP1.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 230, 20));

        jLabel15.setText("Página web:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jTPag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPag1.setNextFocusableComponent(jComUsoCfdi);
        jTPag1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPag1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPag1FocusLost(evt);
            }
        });
        jTPag1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPag1KeyPressed(evt);
            }
        });
        jP1.add(jTPag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 230, 20));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo2.setNextFocusableComponent(jTPag1);
        jTCo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCo2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCo2FocusLost(evt);
            }
        });
        jTCo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCo2KeyPressed(evt);
            }
        });
        jP1.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 230, 20));

        jLabel17.setText("Correo2:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jCBloq.setBackground(new java.awt.Color(255, 255, 255));
        jCBloq.setText("Bloqueado");
        jCBloq.setNextFocusableComponent(jCBloqCred);
        jCBloq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCBloqKeyPressed(evt);
            }
        });
        jP1.add(jCBloq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRaFis.setBackground(new java.awt.Color(255, 255, 255));
        jRaFis.setText("Persona física");
        jRaFis.setNextFocusableComponent(jTRazSoc);
        jRaFis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRaFisKeyPressed(evt);
            }
        });
        jPanel2.add(jRaFis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 5, 100, -1));

        jRaMor.setBackground(new java.awt.Color(255, 255, 255));
        jRaMor.setSelected(true);
        jRaMor.setText("Persona moral");
        jRaMor.setNextFocusableComponent(jRaFis);
        jRaMor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRaMorKeyPressed(evt);
            }
        });
        jPanel2.add(jRaMor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 120, -1));

        jP1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 30));

        jLabel30.setText("Correo1:");
        jP1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 10));

        jTCURP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCURP.setNextFocusableComponent(jTLada);
        jTCURP.setPreferredSize(new java.awt.Dimension(230, 20));
        jTCURP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCURPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCURPFocusLost(evt);
            }
        });
        jTCURP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCURPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCURPKeyTyped(evt);
            }
        });
        jP1.add(jTCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 20));

        jTDepGar.setText("$0.00");
        jTDepGar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDepGar.setFocusable(false);
        jTDepGar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDepGarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDepGarFocusLost(evt);
            }
        });
        jTDepGar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDepGarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDepGarKeyTyped(evt);
            }
        });
        jP1.add(jTDepGar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 10, 20));

        jLabel49.setText("Cod.cliente:");
        jP1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 70, -1));

        jTCodCli.setEditable(false);
        jTCodCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCodCli.setNextFocusableComponent(jTCo1);
        jTCodCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCodCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodCliFocusLost(evt);
            }
        });
        jTCodCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCodCliKeyPressed(evt);
            }
        });
        jP1.add(jTCodCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 50, 20));

        jCBloqCred.setBackground(new java.awt.Color(255, 255, 255));
        jCBloqCred.setText("Bloquear crédito");
        jCBloqCred.setNextFocusableComponent(jBGuar);
        jCBloqCred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCBloqCredKeyPressed(evt);
            }
        });
        jP1.add(jCBloqCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 130, 20));

        pnlDatosBancarios.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosBancarios.setPreferredSize(new java.awt.Dimension(600, 525));

        jLabel29.setText("Método pago:");

        jComFormPag.setNextFocusableComponent(jTCta);
        jComFormPag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComFormPagFocusLost(evt);
            }
        });
        jComFormPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComFormPagActionPerformed(evt);
            }
        });
        jComFormPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComFormPagKeyPressed(evt);
            }
        });

        jLabel8.setText("Cuenta bancaria:");

        jTCta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCta.setNextFocusableComponent(jTCtaConta);
        jTCta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCtaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCtaFocusLost(evt);
            }
        });
        jTCta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCtaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCtaKeyTyped(evt);
            }
        });

        jLabel44.setText("Cuenta contable:");

        jTCtaConta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCtaConta.setNextFocusableComponent(jTCtaPred);
        jTCtaConta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCtaContaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCtaContaFocusLost(evt);
            }
        });
        jTCtaConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCtaContaKeyPressed(evt);
            }
        });

        jLabel46.setText("Banco:");

        jTBanc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBanc.setNextFocusableComponent(jTClavBanc);
        jTBanc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBancFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBancFocusLost(evt);
            }
        });
        jTBanc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBancKeyPressed(evt);
            }
        });

        jLabel47.setText("Clabe interbancaria:");

        jTClavBanc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClavBanc.setNextFocusableComponent(jTDesc);
        jTClavBanc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTClavBancFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTClavBancFocusLost(evt);
            }
        });
        jTClavBanc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTClavBancKeyPressed(evt);
            }
        });

        jLabel23.setText("Descuento %:");

        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDesc.setNextFocusableComponent(jTDCred);
        jTDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescFocusLost(evt);
            }
        });
        jTDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDescKeyTyped(evt);
            }
        });

        jTDCred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDCred.setNextFocusableComponent(jTLimCred);
        jTDCred.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDCredFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDCredFocusLost(evt);
            }
        });
        jTDCred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDCredKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDCredKeyTyped(evt);
            }
        });

        jLabel24.setText("Días de crédito:");

        jLabel37.setText("Límite de crédito:");

        jTLimCred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLimCred.setNextFocusableComponent(jTBeneficiario);
        jTLimCred.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTLimCredFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTLimCredFocusLost(evt);
            }
        });
        jTLimCred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTLimCredKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTLimCredKeyTyped(evt);
            }
        });

        jLabel48.setText("Beneficiario");
        jLabel48.setToolTipText("Beneficiario en Bancos");

        jTBeneficiario.setToolTipText("Beneficiario en Bancos");
        jTBeneficiario.setNextFocusableComponent(jComList);
        jTBeneficiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBeneficiarioKeyPressed(evt);
            }
        });

        jLabel14.setText("Cuenta predial:");
        jLabel14.setToolTipText("Depósito en Garantía");

        jTCtaPred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCtaPred.setNextFocusableComponent(jTBanc);
        jTCtaPred.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCtaPredFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCtaPredFocusLost(evt);
            }
        });
        jTCtaPred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCtaPredKeyPressed(evt);
            }
        });

        jLUsoCfdi.setText("Uso Cfdi:");

        jComUsoCfdi.setNextFocusableComponent(jComFormPag);
        jComUsoCfdi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComUsoCfdiFocusLost(evt);
            }
        });
        jComUsoCfdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComUsoCfdiActionPerformed(evt);
            }
        });
        jComUsoCfdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComUsoCfdiKeyPressed(evt);
            }
        });

        jLabel31.setText("Lista Precio:");

        jComList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComList.setNextFocusableComponent(jTClas);
        jComList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComListKeyPressed(evt);
            }
        });

        jLabel32.setText("Clasificación:");

        jTClas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClas.setNextFocusableComponent(jBClas);
        jTClas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTClasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTClasFocusLost(evt);
            }
        });
        jTClas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTClasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClasKeyTyped(evt);
            }
        });

        jBClas.setBackground(new java.awt.Color(255, 255, 255));
        jBClas.setText("...");
        jBClas.setToolTipText("Buscar Clasificación(es)");
        jBClas.setNextFocusableComponent(jTClasDescrip);
        jBClas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBClasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBClasMouseExited(evt);
            }
        });
        jBClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClasActionPerformed(evt);
            }
        });
        jBClas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBClasKeyPressed(evt);
            }
        });

        jTClasDescrip.setEditable(false);
        jTClasDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClasDescrip.setNextFocusableComponent(jComSer);
        jTClasDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTClasDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTClasDescripFocusLost(evt);
            }
        });

        jLabel35.setText("*Serie:");

        jComSer.setNextFocusableComponent(jTCodEmp);
        jComSer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComSerFocusLost(evt);
            }
        });
        jComSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComSerActionPerformed(evt);
            }
        });
        jComSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComSerKeyPressed(evt);
            }
        });

        jLabel36.setText("Cod.cliente:");

        jTCodEmp.setBackground(new java.awt.Color(204, 255, 204));
        jTCodEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCodEmp.setNextFocusableComponent(jTVend);
        jTCodEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCodEmpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodEmpFocusLost(evt);
            }
        });
        jTCodEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCodEmpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCodEmpKeyTyped(evt);
            }
        });

        jLabel42.setText("Vendedor:");

        jTVend.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTVend.setNextFocusableComponent(jBVend);
        jTVend.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTVendFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTVendFocusLost(evt);
            }
        });
        jTVend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTVendKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTVendKeyTyped(evt);
            }
        });

        jBVend.setBackground(new java.awt.Color(255, 255, 255));
        jBVend.setText("...");
        jBVend.setToolTipText("Buscar Vendedor(es)");
        jBVend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVendMouseExited(evt);
            }
        });
        jBVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVendActionPerformed(evt);
            }
        });
        jBVend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVendKeyPressed(evt);
            }
        });

        jBContac.setBackground(new java.awt.Color(255, 255, 255));
        jBContac.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBContac.setForeground(new java.awt.Color(0, 102, 0));
        jBContac.setText("Contactos F2");
        jBContac.setNextFocusableComponent(jBDom);
        jBContac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBContacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBContacMouseExited(evt);
            }
        });
        jBContac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContacActionPerformed(evt);
            }
        });
        jBContac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBContacKeyPressed(evt);
            }
        });

        jBDom.setBackground(new java.awt.Color(255, 255, 255));
        jBDom.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDom.setForeground(new java.awt.Color(0, 102, 0));
        jBDom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/doment.png"))); // NOI18N
        jBDom.setText("Entrega");
        jBDom.setToolTipText("Domicilio de Entrega del Cliente");
        jBDom.setNextFocusableComponent(jCOtraMon);
        jBDom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDomMouseExited(evt);
            }
        });
        jBDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDomActionPerformed(evt);
            }
        });
        jBDom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDomKeyPressed(evt);
            }
        });

        jCOtraMon.setBackground(new java.awt.Color(255, 255, 255));
        jCOtraMon.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCOtraMon.setSelected(true);
        jCOtraMon.setText("Se le puede vender en otra moneda");
        jCOtraMon.setNextFocusableComponent(jCCotOtrMon);
        jCOtraMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCOtraMonKeyPressed(evt);
            }
        });

        jCCotOtrMon.setBackground(new java.awt.Color(255, 255, 255));
        jCCotOtrMon.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCotOtrMon.setSelected(true);
        jCCotOtrMon.setText("Se le puede cotizar en otra moneda");
        jCCotOtrMon.setNextFocusableComponent(jRaMor);
        jCCotOtrMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCotOtrMonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosBancariosLayout = new javax.swing.GroupLayout(pnlDatosBancarios);
        pnlDatosBancarios.setLayout(pnlDatosBancariosLayout);
        pnlDatosBancariosLayout.setHorizontalGroup(
            pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                        .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTBanc)
                                    .addComponent(jTClavBanc)
                                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                        .addComponent(jTCtaPred, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 2, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosBancariosLayout.createSequentialGroup()
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTLimCred)
                                        .addComponent(jTDCred)
                                        .addComponent(jTDesc)
                                        .addComponent(jTBeneficiario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))))
                        .addGap(256, 256, 256))
                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                        .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jTClas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTClasDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jBClas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jComSer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTVend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jBVend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBDom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBContac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCOtraMon, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jCCotOtrMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLUsoCfdi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTCta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTCtaConta)
                                    .addComponent(jComUsoCfdi, 0, 200, Short.MAX_VALUE)
                                    .addComponent(jComFormPag, 0, 200, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlDatosBancariosLayout.setVerticalGroup(
            pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComUsoCfdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsoCfdi))
                .addGap(10, 10, 10)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jComFormPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTCta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14))
                    .addComponent(jLabel44)
                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                        .addComponent(jTCtaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTCtaPred, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jTBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jTClavBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jTDCred, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jTLimCred, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jBClas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                        .addComponent(jTClas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTClasDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jComSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jTCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jTVend, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVend, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBContac)
                    .addComponent(jCOtraMon)
                    .addGroup(pnlDatosBancariosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBDom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCCotOtrMon))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jP1.add(pnlDatosBancarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 450, 540));

        pnlDireccion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Calle:");

        jTCall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCall.setNextFocusableComponent(jTNoExt);
        jTCall.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCallFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCallFocusLost(evt);
            }
        });
        jTCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCallActionPerformed(evt);
            }
        });
        jTCall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCallKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCallKeyTyped(evt);
            }
        });

        jLabel22.setText("No. exterior:");

        jTNoExt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExt.setNextFocusableComponent(jTNoInt);
        jTNoExt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoExtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoExtFocusLost(evt);
            }
        });
        jTNoExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoExtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNoExtKeyTyped(evt);
            }
        });

        jLabel9.setText("No. interior:");

        jTNoInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoInt.setNextFocusableComponent(jTCol);
        jTNoInt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoIntFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoIntFocusLost(evt);
            }
        });
        jTNoInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoIntKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNoIntKeyTyped(evt);
            }
        });

        jLabel4.setText("Colonia:");

        jTCol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCol.setNextFocusableComponent(jTCP);
        jTCol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTColFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTColFocusLost(evt);
            }
        });
        jTCol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTColKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTColKeyTyped(evt);
            }
        });

        jLabel10.setText("CP:");

        jTCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCP.setNextFocusableComponent(jTCiu);
        jTCP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCPFocusLost(evt);
            }
        });
        jTCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCPKeyTyped(evt);
            }
        });

        jBCP.setBackground(new java.awt.Color(255, 255, 255));
        jBCP.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCP.setForeground(new java.awt.Color(0, 102, 0));
        jBCP.setText("...");
        jBCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCPActionPerformed(evt);
            }
        });

        jLabel7.setText("Ciudad:");

        jLabel5.setText("Estado:");

        jLabel6.setText("País:");

        jTPai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPai.setNextFocusableComponent(jTCo1);
        jTPai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPaiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPaiFocusLost(evt);
            }
        });
        jTPai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPaiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPaiKeyTyped(evt);
            }
        });

        jTEstad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstad.setNextFocusableComponent(jTPai);
        jTEstad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEstadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEstadFocusLost(evt);
            }
        });
        jTEstad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEstadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTEstadKeyTyped(evt);
            }
        });

        jTCiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiu.setNextFocusableComponent(jTEstad);
        jTCiu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCiuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCiuFocusLost(evt);
            }
        });
        jTCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCiuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCiuKeyTyped(evt);
            }
        });

        jBPais.setBackground(new java.awt.Color(255, 255, 255));
        jBPais.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBPais.setForeground(new java.awt.Color(0, 102, 0));
        jBPais.setText("...");
        jBPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDireccionLayout = new javax.swing.GroupLayout(pnlDireccion);
        pnlDireccion.setLayout(pnlDireccionLayout);
        pnlDireccionLayout.setHorizontalGroup(
            pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDireccionLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTCall, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDireccionLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlDireccionLayout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTCP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDireccionLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTCol, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDireccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDireccionLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(93, 93, 93)
                        .addComponent(jTCiu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDireccionLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(93, 93, 93)
                        .addComponent(jTEstad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDireccionLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(107, 107, 107)
                        .addComponent(jTPai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBPais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDireccionLayout.setVerticalGroup(
            pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCall, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTCol, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTCP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTCiu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTEstad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTPai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP1.add(pnlDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 380, 170));

        pnlTelefonos.setBackground(new java.awt.Color(255, 255, 255));

        jTLada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLada.setNextFocusableComponent(jTTel);
        jTLada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTLadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTLadaFocusLost(evt);
            }
        });
        jTLada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTLadaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTLadaKeyTyped(evt);
            }
        });

        jLabel39.setText("Lada:");

        jTTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTel.setNextFocusableComponent(jTExten);
        jTTel.setPreferredSize(new java.awt.Dimension(50, 20));
        jTTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTelFocusLost(evt);
            }
        });
        jTTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelActionPerformed(evt);
            }
        });
        jTTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelKeyTyped(evt);
            }
        });

        jLabel40.setText("Teléfono:");

        jLabel20.setText("Extensión:");

        jTExten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTExten.setNextFocusableComponent(jTCel);
        jTExten.setPreferredSize(new java.awt.Dimension(230, 20));
        jTExten.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTExtenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTExtenFocusLost(evt);
            }
        });
        jTExten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTExtenKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTExtenKeyTyped(evt);
            }
        });

        jLabel41.setText("Celular:");

        jTCel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCel.setNextFocusableComponent(jTTelPer1);
        jTCel.setPreferredSize(new java.awt.Dimension(230, 20));
        jTCel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCelFocusLost(evt);
            }
        });
        jTCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCelKeyTyped(evt);
            }
        });

        jLabel21.setText("Teléfono personal 1:");

        jTTelPer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTelPer1.setNextFocusableComponent(jTCall);
        jTTelPer1.setPreferredSize(new java.awt.Dimension(230, 20));
        jTTelPer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTelPer1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTelPer1FocusLost(evt);
            }
        });
        jTTelPer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelPer1ActionPerformed(evt);
            }
        });
        jTTelPer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTelPer1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelPer1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlTelefonosLayout = new javax.swing.GroupLayout(pnlTelefonos);
        pnlTelefonos.setLayout(pnlTelefonosLayout);
        pnlTelefonosLayout.setHorizontalGroup(
            pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTelefonosLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTCel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTelefonosLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTTelPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTelefonosLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(84, 84, 84)
                        .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlTelefonosLayout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTLada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTelefonosLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTExten, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTelefonosLayout.setVerticalGroup(
            pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTLada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTTel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTExten, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTCel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTTelPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP1.add(pnlTelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 380, 100));

        jTRazSoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRazSoc.setNextFocusableComponent(jTRFC);
        jTRazSoc.setPreferredSize(new java.awt.Dimension(230, 20));
        jTRazSoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTRazSocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTRazSocFocusLost(evt);
            }
        });
        jTRazSoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTRazSocKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTRazSocKeyTyped(evt);
            }
        });
        jP1.add(jTRazSoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 230, 20));

        jLabel2.setText("*Razón social:");
        jLabel2.setToolTipText("Nombre de la Empresa o Nombnre del Cliente");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jBGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuarActionPerformed
                                                                
        
    }//GEN-LAST:event_jBGuarActionPerformed

       
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
                
        
    }//GEN-LAST:event_jBSalActionPerformed

        
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    
        
    }//GEN-LAST:event_formKeyPressed

    
    private void jTRazSocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRazSocKeyPressed
           
        
    }//GEN-LAST:event_jTRazSocKeyPressed

        
    private void jTCallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCallKeyPressed
            
        
    }//GEN-LAST:event_jTCallKeyPressed

        
    private void jTColKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTColKeyPressed
            
        
    }//GEN-LAST:event_jTColKeyPressed

        
    private void jTCPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCPKeyPressed
                    

    }//GEN-LAST:event_jTCPKeyPressed

        
    private void jTCiuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCiuKeyPressed
            
        
    }//GEN-LAST:event_jTCiuKeyPressed

        
    private void jTEstadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstadKeyPressed
    
        
    }//GEN-LAST:event_jTEstadKeyPressed

    
    private void jTPaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPaiKeyPressed
            
        
    }//GEN-LAST:event_jTPaiKeyPressed

        
    private void jTRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRFCKeyPressed
            
        
    }//GEN-LAST:event_jTRFCKeyPressed

        
    private void jBGuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuarKeyPressed
            
        
    }//GEN-LAST:event_jBGuarKeyPressed

        
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
            
        
    }//GEN-LAST:event_jBSalKeyPressed

        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
    }//GEN-LAST:event_formWindowClosing

    
        
    private void jTTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelKeyPressed
        
        
    }//GEN-LAST:event_jTTelKeyPressed

        
    private void jTCo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCo1KeyPressed
        
        
    }//GEN-LAST:event_jTCo1KeyPressed

        
    private void jTPag1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPag1KeyPressed
    
        
    }//GEN-LAST:event_jTPag1KeyPressed

    
    
    private void jTCo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCo2KeyPressed

        
    }//GEN-LAST:event_jTCo2KeyPressed

    
            
    private void jTRazSocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRazSocFocusGained
            
        
    }//GEN-LAST:event_jTRazSocFocusGained

        
    private void jTTelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelFocusGained
            
        
    }//GEN-LAST:event_jTTelFocusGained

        
    private void jTCallFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCallFocusGained
            
        
    }//GEN-LAST:event_jTCallFocusGained

        
    private void jTColFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTColFocusGained
        
    
        
    }//GEN-LAST:event_jTColFocusGained

    
    private void jTCPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCPFocusGained
            
        
    }//GEN-LAST:event_jTCPFocusGained

        
    private void jTCiuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCiuFocusGained
            
        
    }//GEN-LAST:event_jTCiuFocusGained

        
    private void jTEstadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFocusGained
            
        
    }//GEN-LAST:event_jTEstadFocusGained

        
    private void jTPaiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPaiFocusGained
            
        
    }//GEN-LAST:event_jTPaiFocusGained

        
    private void jTRFCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRFCFocusGained
        
    
        
    }//GEN-LAST:event_jTRFCFocusGained

          
    private void jTCo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo1FocusGained
            
        
    }//GEN-LAST:event_jTCo1FocusGained

        
    private void jTCo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo2FocusGained
            
        
    }//GEN-LAST:event_jTCo2FocusGained

    
        
    private void jTPag1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPag1FocusGained
            
        
    }//GEN-LAST:event_jTPag1FocusGained

    
   
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        

        
    }//GEN-LAST:event_jP1KeyPressed

    
    
    private void jTTelPer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelPer1FocusGained
        
   
        
    }//GEN-LAST:event_jTTelPer1FocusGained

    
       
    private void jTTelPer1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelPer1KeyPressed
            
        
    }//GEN-LAST:event_jTTelPer1KeyPressed

    
        
    private void jTRFCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRFCFocusLost
        
               
    }//GEN-LAST:event_jTRFCFocusLost

    
    private void jTRazSocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRazSocFocusLost
    
      
    }//GEN-LAST:event_jTRazSocFocusLost
        
    
    private void jTTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelFocusLost
    
                       
    }//GEN-LAST:event_jTTelFocusLost

    
    private void jTTelPer1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelPer1FocusLost
            
             
    }//GEN-LAST:event_jTTelPer1FocusLost

    
        
    private void jTCallFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCallFocusLost
    
               
    }//GEN-LAST:event_jTCallFocusLost

    
    private void jTColFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTColFocusLost
    
        
    }//GEN-LAST:event_jTColFocusLost

    
    private void jTCPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCPFocusLost
    
        
            
    }//GEN-LAST:event_jTCPFocusLost

    
    private void jTCiuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCiuFocusLost

    
               
    }//GEN-LAST:event_jTCiuFocusLost

    
    private void jTEstadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFocusLost
    
        
    }//GEN-LAST:event_jTEstadFocusLost

    
    private void jTPaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPaiFocusLost
    
        
    }//GEN-LAST:event_jTPaiFocusLost

    
    
    private void jTCo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo1FocusLost

        
    }//GEN-LAST:event_jTCo1FocusLost

        
    private void jTCo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo2FocusLost
    

    }//GEN-LAST:event_jTCo2FocusLost

    
    
    private void jTPag1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPag1FocusLost

                  
    }//GEN-LAST:event_jTPag1FocusLost

        
    private void jTNoExtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoExtKeyPressed
            
        
    }//GEN-LAST:event_jTNoExtKeyPressed

    
    private void jTNoIntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoIntKeyPressed
        
    
        
    }//GEN-LAST:event_jTNoIntKeyPressed
    
    private void jCBloqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBloqKeyPressed
        
    
        
    }//GEN-LAST:event_jCBloqKeyPressed
    
    private void jTNoExtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoExtFocusLost

    
        
    }//GEN-LAST:event_jTNoExtFocusLost
    
    
    private void jTNoExtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoExtFocusGained
        
    
        
    }//GEN-LAST:event_jTNoExtFocusGained

        
    private void jTNoIntFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoIntFocusGained
        
    
        
    }//GEN-LAST:event_jTNoIntFocusGained

    
    
    private void jTNoIntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoIntFocusLost

    
               
    }//GEN-LAST:event_jTNoIntFocusLost

        
    private void jTRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRFCKeyTyped
        
    
        
    }//GEN-LAST:event_jTRFCKeyTyped
    
    private void jTTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelKeyTyped
        
    
        
    }//GEN-LAST:event_jTTelKeyTyped

        
    private void jTTelPer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelPer1KeyTyped
        
    
    }//GEN-LAST:event_jTTelPer1KeyTyped
    
    private void jTCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCPKeyTyped
    
        
    }//GEN-LAST:event_jTCPKeyTyped
    
        
    private void jTNoIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoIntKeyTyped
        
    
        
    }//GEN-LAST:event_jTNoIntKeyTyped
           
    
    private void jRaFisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRaFisKeyPressed



    }//GEN-LAST:event_jRaFisKeyPressed

    
    private void jRaMorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRaMorKeyPressed
    

    }//GEN-LAST:event_jRaMorKeyPressed

    
    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed

    

    }//GEN-LAST:event_jPanel2KeyPressed

   
    private void jTClasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasFocusGained

   
        
    }//GEN-LAST:event_jTClasFocusGained

       
    private void jTClasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasFocusLost
    
        
    }//GEN-LAST:event_jTClasFocusLost

    

    private void jTClasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClasKeyPressed


        
    }//GEN-LAST:event_jTClasKeyPressed

        
    private void jTClasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClasKeyTyped

    
        
    }//GEN-LAST:event_jTClasKeyTyped

        
    private void jBClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClasActionPerformed

    
        
    }//GEN-LAST:event_jBClasActionPerformed

        
    private void jBClasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBClasKeyPressed

    
        
    }//GEN-LAST:event_jBClasKeyPressed

    
    
    private void jBContacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBContacKeyPressed
        
    
            
    }//GEN-LAST:event_jBContacKeyPressed

        
    private void jBContacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContacActionPerformed
            
        
    }//GEN-LAST:event_jBContacActionPerformed
    
    private void jComSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComSerKeyPressed
        
    
        
    }//GEN-LAST:event_jComSerKeyPressed

    
    
    private void jTCodEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodEmpKeyPressed
        
    
        
    }//GEN-LAST:event_jTCodEmpKeyPressed

        
    private void jTCodEmpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodEmpFocusGained
        
    
        
    }//GEN-LAST:event_jTCodEmpFocusGained

        
    private void jTCodEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodEmpKeyTyped
        
    
        
    }//GEN-LAST:event_jTCodEmpKeyTyped

        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
        
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

    
    private void jCOtraMonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCOtraMonKeyPressed
        

        
    }//GEN-LAST:event_jCOtraMonKeyPressed

        
    private void jCCotOtrMonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCotOtrMonKeyPressed
        
        
    }//GEN-LAST:event_jCCotOtrMonKeyPressed

    
    
        
    private void jComSerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComSerFocusLost
                
    
        
    }//GEN-LAST:event_jComSerFocusLost

       
    private void jTCURPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCURPFocusGained
            
        
    }//GEN-LAST:event_jTCURPFocusGained

        
    private void jTCURPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCURPFocusLost
        
    
        
    }//GEN-LAST:event_jTCURPFocusLost

    
    private void jTCURPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCURPKeyPressed
        
    
        
    }//GEN-LAST:event_jTCURPKeyPressed

        
    private void jTCURPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCURPKeyTyped
            
        
    }//GEN-LAST:event_jTCURPKeyTyped

        
    private void jTVendFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTVendFocusGained

    

    }//GEN-LAST:event_jTVendFocusGained

        
    private void jTVendFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTVendFocusLost

    

    }//GEN-LAST:event_jTVendFocusLost

        
    private void jTVendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTVendKeyPressed

    

    }//GEN-LAST:event_jTVendKeyPressed

        
    private void jTVendKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTVendKeyTyped

    
        
    }//GEN-LAST:event_jTVendKeyTyped

        
    private void jBVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVendActionPerformed

    

    }//GEN-LAST:event_jBVendActionPerformed

        
    private void jBVendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVendKeyPressed

    

    }//GEN-LAST:event_jBVendKeyPressed

        
    private void jTClasDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasDescripFocusLost

    
        
    }//GEN-LAST:event_jTClasDescripFocusLost

        
    private void jTClasDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClasDescripFocusGained
        
    
        
    }//GEN-LAST:event_jTClasDescripFocusGained

    
    
    private void jComListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComListKeyPressed

    

    }//GEN-LAST:event_jComListKeyPressed

        
    private void jTLadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLadaFocusGained

        
    }//GEN-LAST:event_jTLadaFocusGained

        
    private void jTLadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLadaKeyPressed

        
    }//GEN-LAST:event_jTLadaKeyPressed

        
    private void jTLadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLadaKeyTyped
        
    
        
    }//GEN-LAST:event_jTLadaKeyTyped

        
    private void jBGuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseEntered
        
    
        
    }//GEN-LAST:event_jBGuarMouseEntered

    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
        
    }//GEN-LAST:event_jBSalMouseEntered

    
    private void jBContacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBContacMouseEntered
        
    
        
    }//GEN-LAST:event_jBContacMouseEntered

        
    private void jBVendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVendMouseEntered
        
    
        
    }//GEN-LAST:event_jBVendMouseEntered

        
    private void jBClasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClasMouseEntered
        
    
        
    }//GEN-LAST:event_jBClasMouseEntered

    
    private void jBGuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseExited
        
    
        
    }//GEN-LAST:event_jBGuarMouseExited

    
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
        
    }//GEN-LAST:event_jBSalMouseExited

        
    private void jBClasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClasMouseExited
        
    
        
    }//GEN-LAST:event_jBClasMouseExited

    
    private void jBVendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVendMouseExited
        
    
        
    }//GEN-LAST:event_jBVendMouseExited

        
    private void jBContacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBContacMouseExited
        
    
        
    }//GEN-LAST:event_jBContacMouseExited

        
    private void jTExtenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTExtenKeyTyped
        
    
        
    }//GEN-LAST:event_jTExtenKeyTyped

        
    private void jTExtenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTExtenFocusGained
        
    
        
    }//GEN-LAST:event_jTExtenFocusGained

    
   
    private void jTCelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCelFocusGained
        
   
        
    }//GEN-LAST:event_jTCelFocusGained

       
    private void jTExtenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTExtenKeyPressed
        
    
        
    }//GEN-LAST:event_jTExtenKeyPressed

    
    
    private void jTCelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCelKeyPressed
        

        
    }//GEN-LAST:event_jTCelKeyPressed

    private void jTLadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLadaFocusLost
        

        
    }//GEN-LAST:event_jTLadaFocusLost

    
    private void jTExtenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTExtenFocusLost
        
    
        
    }//GEN-LAST:event_jTExtenFocusLost

        
    private void jTCelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCelFocusLost
        
    
        
    }//GEN-LAST:event_jTCelFocusLost

    
    private void jTCodEmpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodEmpFocusLost
 
        
    }//GEN-LAST:event_jTCodEmpFocusLost

        
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
                
                
    }//GEN-LAST:event_formWindowActivated
    
    private void jTDepGarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDepGarFocusGained
        
    
        
    }//GEN-LAST:event_jTDepGarFocusGained

        
    private void jTDepGarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDepGarFocusLost
 
    
                
    }//GEN-LAST:event_jTDepGarFocusLost

        
    private void jTDepGarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDepGarKeyPressed
        
    
        
    }//GEN-LAST:event_jTDepGarKeyPressed

    
    
    private void jTDepGarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDepGarKeyTyped
        

        
    }//GEN-LAST:event_jTDepGarKeyTyped

    private void jTCodCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodCliFocusGained



    }//GEN-LAST:event_jTCodCliFocusGained

    

    private void jTCodCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodCliFocusLost


    }//GEN-LAST:event_jTCodCliFocusLost

    
    private void jTCodCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodCliKeyPressed

    
    }//GEN-LAST:event_jTCodCliKeyPressed

    
    
    private void jTCtaPredFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaPredFocusGained

        
    }//GEN-LAST:event_jTCtaPredFocusGained

        
    private void jTCtaPredFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaPredFocusLost

    
        
    }//GEN-LAST:event_jTCtaPredFocusLost

        
    private void jTCtaPredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCtaPredKeyPressed

        
    }//GEN-LAST:event_jTCtaPredKeyPressed

        
    private void jCBloqCredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBloqCredKeyPressed

    

    }//GEN-LAST:event_jCBloqCredKeyPressed

    private void jTCelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCelKeyTyped
    
    
    }//GEN-LAST:event_jTCelKeyTyped

    private void jTCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCallActionPerformed
    
    }//GEN-LAST:event_jTCallActionPerformed

    private void jTRazSocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRazSocKeyTyped
    
    }//GEN-LAST:event_jTRazSocKeyTyped

    private void jTCallKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCallKeyTyped
    
    }//GEN-LAST:event_jTCallKeyTyped

    private void jTColKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTColKeyTyped
    
    }//GEN-LAST:event_jTColKeyTyped

    private void jTNoExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoExtKeyTyped
    
    }//GEN-LAST:event_jTNoExtKeyTyped

    private void jTCiuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCiuKeyTyped
    
    }//GEN-LAST:event_jTCiuKeyTyped

    private void jTEstadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstadKeyTyped
    
    }//GEN-LAST:event_jTEstadKeyTyped

    private void jTPaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPaiKeyTyped
    
    }//GEN-LAST:event_jTPaiKeyTyped

    private void jTBeneficiarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBeneficiarioKeyPressed
    
    }//GEN-LAST:event_jTBeneficiarioKeyPressed

    private void jComUsoCfdiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComUsoCfdiFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jComUsoCfdiFocusLost

    private void jComUsoCfdiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComUsoCfdiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComUsoCfdiKeyPressed

    private void jBCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCPActionPerformed
    
        
    }//GEN-LAST:event_jBCPActionPerformed

    private void jBPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPaisActionPerformed
    
    }//GEN-LAST:event_jBPaisActionPerformed

    
    private void jTLimCredKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLimCredKeyTyped

    

    }//GEN-LAST:event_jTLimCredKeyTyped

    
    private void jTLimCredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLimCredKeyPressed

    

    }//GEN-LAST:event_jTLimCredKeyPressed
    
    private void jTLimCredFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLimCredFocusLost
        

    }//GEN-LAST:event_jTLimCredFocusLost


    private void jTLimCredFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLimCredFocusGained


    }//GEN-LAST:event_jTLimCredFocusGained


    private void jTDCredKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDCredKeyTyped



    }//GEN-LAST:event_jTDCredKeyTyped


    private void jTDCredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDCredKeyPressed



    }//GEN-LAST:event_jTDCredKeyPressed

    
    private void jTDCredFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDCredFocusLost

    

    }//GEN-LAST:event_jTDCredFocusLost

   
    private void jTDCredFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDCredFocusGained

   

    }//GEN-LAST:event_jTDCredFocusGained

   
    private void jTDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescKeyTyped

   

    }//GEN-LAST:event_jTDescKeyTyped

   
    private void jTDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescKeyPressed

   

    }//GEN-LAST:event_jTDescKeyPressed

   
    private void jTDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescFocusLost

   

    }//GEN-LAST:event_jTDescFocusLost

   
    private void jTDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescFocusGained

   

    }//GEN-LAST:event_jTDescFocusGained

   
    private void jTClavBancKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClavBancKeyPressed

   

    }//GEN-LAST:event_jTClavBancKeyPressed

   
    private void jTClavBancFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClavBancFocusLost

   
    }//GEN-LAST:event_jTClavBancFocusLost

   
    private void jTClavBancFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClavBancFocusGained

   

    }//GEN-LAST:event_jTClavBancFocusGained

   
    private void jTBancKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBancKeyPressed

   

    }//GEN-LAST:event_jTBancKeyPressed

   
    private void jTBancFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBancFocusLost

   

    }//GEN-LAST:event_jTBancFocusLost

   
    private void jTBancFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBancFocusGained

   

    }//GEN-LAST:event_jTBancFocusGained

   
    private void jTCtaContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCtaContaKeyPressed

   

    }//GEN-LAST:event_jTCtaContaKeyPressed

   
    private void jTCtaContaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaContaFocusLost

   

    }//GEN-LAST:event_jTCtaContaFocusLost

   
    private void jTCtaContaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaContaFocusGained

   

    }//GEN-LAST:event_jTCtaContaFocusGained

   
    private void jTCtaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCtaKeyTyped

   

    }//GEN-LAST:event_jTCtaKeyTyped

   
    private void jTCtaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCtaKeyPressed



    }//GEN-LAST:event_jTCtaKeyPressed


    private void jTCtaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaFocusLost



    }//GEN-LAST:event_jTCtaFocusLost


    private void jTCtaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaFocusGained



    }//GEN-LAST:event_jTCtaFocusGained

    private void jComFormPagKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComFormPagKeyPressed


    }//GEN-LAST:event_jComFormPagKeyPressed

    private void jComFormPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComFormPagActionPerformed

        
    }//GEN-LAST:event_jComFormPagActionPerformed

    private void jComFormPagFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComFormPagFocusLost

    }//GEN-LAST:event_jComFormPagFocusLost

    
    private void jBDomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDomKeyPressed

    
    }//GEN-LAST:event_jBDomKeyPressed

    
    private void jBDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDomActionPerformed

    
        
    }//GEN-LAST:event_jBDomActionPerformed

    
    private void jBDomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDomMouseExited



    }//GEN-LAST:event_jBDomMouseExited


    private void jBDomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDomMouseEntered

        

    }//GEN-LAST:event_jBDomMouseEntered

    private void jTTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelActionPerformed

    private void jTTelPer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelPer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelPer1ActionPerformed

    private void jComUsoCfdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComUsoCfdiActionPerformed

    }//GEN-LAST:event_jComUsoCfdiActionPerformed

    private void jComSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComSerActionPerformed
        
        
        
    }//GEN-LAST:event_jComSerActionPerformed
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCP;
    private javax.swing.JButton jBClas;
    private javax.swing.JButton jBContac;
    private javax.swing.JButton jBDom;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBPais;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBVend;
    private javax.swing.JCheckBox jCBloq;
    private javax.swing.JCheckBox jCBloqCred;
    private javax.swing.JCheckBox jCCotOtrMon;
    private javax.swing.JCheckBox jCOtraMon;
    private javax.swing.JComboBox jComFormPag;
    private javax.swing.JComboBox jComList;
    private javax.swing.JComboBox jComSer;
    private javax.swing.JComboBox jComUsoCfdi;
    private javax.swing.JLabel jLUsoCfdi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRaFis;
    private javax.swing.JRadioButton jRaMor;
    private javax.swing.JTextField jTBanc;
    private javax.swing.JTextField jTBeneficiario;
    private javax.swing.JTextField jTCP;
    private javax.swing.JTextField jTCURP;
    private javax.swing.JTextField jTCall;
    private javax.swing.JTextField jTCel;
    private javax.swing.JTextField jTCiu;
    private javax.swing.JTextField jTClas;
    private javax.swing.JTextField jTClasDescrip;
    private javax.swing.JTextField jTClavBanc;
    private javax.swing.JTextField jTCo1;
    private javax.swing.JTextField jTCo2;
    private javax.swing.JTextField jTCodCli;
    private javax.swing.JTextField jTCodEmp;
    private javax.swing.JTextField jTCol;
    private javax.swing.JTextField jTCta;
    private javax.swing.JTextField jTCtaConta;
    private javax.swing.JTextField jTCtaPred;
    private javax.swing.JTextField jTDCred;
    private javax.swing.JTextField jTDepGar;
    private javax.swing.JTextField jTDesc;
    private javax.swing.JTextField jTEstad;
    private javax.swing.JTextField jTExten;
    private javax.swing.JTextField jTLada;
    private javax.swing.JTextField jTLimCred;
    private javax.swing.JTextField jTNoExt;
    private javax.swing.JTextField jTNoInt;
    private javax.swing.JTextField jTPag1;
    private javax.swing.JTextField jTPai;
    private javax.swing.JTextField jTRFC;
    private javax.swing.JTextField jTRazSoc;
    private javax.swing.JTextField jTTel;
    private javax.swing.JTextField jTTelPer1;
    private javax.swing.JTextField jTVend;
    private javax.swing.JPanel pnlDatosBancarios;
    private javax.swing.JPanel pnlDireccion;
    private javax.swing.JPanel pnlTelefonos;
    // End of variables declaration//GEN-END:variables
   
}
