package com.era.views;



public abstract class LPrecsJFrame extends BaseJFrame 
{
    public LPrecsJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
    
        this.getRootPane().setDefaultButton(jBGuar);
        
        postInitComponents();
    }

        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jTPre1 = new javax.swing.JTextField();
        jBGuar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTPre3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTPre5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTPre7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTPre9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTPre2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTPre4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTPre6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTPre8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTPre10 = new javax.swing.JTextField();
        jTextFieldUltimoCosto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTUti10 = new javax.swing.JTextField();
        jTUti1 = new javax.swing.JTextField();
        jTUti2 = new javax.swing.JTextField();
        jTUti3 = new javax.swing.JTextField();
        jTUti4 = new javax.swing.JTextField();
        jTUti5 = new javax.swing.JTextField();
        jTUti6 = new javax.swing.JTextField();
        jTUti7 = new javax.swing.JTextField();
        jTUti8 = new javax.swing.JTextField();
        jTUti9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTUtil1V = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTUtil2V = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTUtil3V = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTUtil4V = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTUtil5V = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTUtil6V = new javax.swing.JTextField();
        jTUtil7V = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTUtil8V = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTUtil9V = new javax.swing.JTextField();
        jTUtil10V = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Utilidad %:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Utilidad %:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 130, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setName(""); // NOI18N
        jBSal.setNextFocusableComponent(jTextFieldUltimoCosto);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 110, -1));

        jTPre1.setText("$0.00");
        jTPre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre1.setNextFocusableComponent(jTUti1);
        jP1.add(jTPre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 20));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar (Ctrl+G)");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio 3");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        jTPre3.setText("$0.00");
        jTPre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre3.setNextFocusableComponent(jTUti3);
        jP1.add(jTPre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Precio 5");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, -1));

        jTPre5.setText("$0.00");
        jTPre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre5.setNextFocusableComponent(jTUti5);
        jP1.add(jTPre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio 7");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, -1));

        jTPre7.setText("$0.00");
        jTPre7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre7.setNextFocusableComponent(jTUti7);
        jP1.add(jTPre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Precio 9");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, -1));

        jTPre9.setText("$0.00");
        jTPre9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre9.setNextFocusableComponent(jTUti9);
        jP1.add(jTPre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 150, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Precio 2");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        jTPre2.setText("$0.00");
        jTPre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre2.setNextFocusableComponent(jTUti2);
        jP1.add(jTPre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Precio 4");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, -1));

        jTPre4.setText("$0.00");
        jTPre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre4.setNextFocusableComponent(jTUti4);
        jP1.add(jTPre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Precio 6");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, -1));

        jTPre6.setText("$0.00");
        jTPre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre6.setNextFocusableComponent(jTUti6);
        jP1.add(jTPre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 150, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Precio 8");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, -1));

        jTPre8.setText("$0.00");
        jTPre8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre8.setNextFocusableComponent(jTUti8);
        jP1.add(jTPre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Precio 10");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 150, -1));

        jTPre10.setText("$0.00");
        jTPre10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre10.setNextFocusableComponent(jTUti10);
        jP1.add(jTPre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 150, 20));

        jTextFieldUltimoCosto.setText("$0.00");
        jTextFieldUltimoCosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldUltimoCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltimoCostoActionPerformed(evt);
            }
        });
        jP1.add(jTextFieldUltimoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Precio 1");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        jTUti10.setText("0.0");
        jTUti10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti10.setNextFocusableComponent(jTUtil10V);
        jP1.add(jTUti10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 130, 20));

        jTUti1.setText("0.0");
        jTUti1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti1.setNextFocusableComponent(jTUtil1V);
        jP1.add(jTUti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, 20));

        jTUti2.setText("0.0");
        jTUti2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti2.setNextFocusableComponent(jTUtil2V);
        jP1.add(jTUti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, 20));

        jTUti3.setText("0.0");
        jTUti3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti3.setNextFocusableComponent(jTUtil3V);
        jP1.add(jTUti3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, 20));

        jTUti4.setText("0.0");
        jTUti4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti4.setNextFocusableComponent(jTUtil4V);
        jP1.add(jTUti4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, 20));

        jTUti5.setText("0.0");
        jTUti5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti5.setNextFocusableComponent(jTUtil5V);
        jP1.add(jTUti5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 130, 20));

        jTUti6.setText("0.0");
        jTUti6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti6.setNextFocusableComponent(jTUtil6V);
        jP1.add(jTUti6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 130, 20));

        jTUti7.setText("0.0");
        jTUti7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti7.setNextFocusableComponent(jTUtil7V);
        jP1.add(jTUti7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 130, 20));

        jTUti8.setText("0.0");
        jTUti8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti8.setNextFocusableComponent(jTUtil8V);
        jP1.add(jTUti8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 130, 20));

        jTUti9.setText("0.0");
        jTUti9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti9.setNextFocusableComponent(jTUtil9V);
        jP1.add(jTUti9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 130, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Utilidad %:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 130, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Utilidad %:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Utilidad %:");
        jP1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Utilidad %:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 130, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Utilidad %:");
        jP1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 130, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Utilidad %:");
        jP1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Utilidad %:");
        jP1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 130, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Utilidad %:");
        jP1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Utilidad %:");
        jP1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 130, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Ultimo costo:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Utilidad venta 1:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 130, -1));

        jTUtil1V.setText("0.0");
        jTUtil1V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil1V.setNextFocusableComponent(jTPre2);
        jP1.add(jTUtil1V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 130, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Utilidad venta 2:");
        jP1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, -1));

        jTUtil2V.setText("0.0");
        jTUtil2V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil2V.setNextFocusableComponent(jTPre3);
        jP1.add(jTUtil2V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 130, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Utilidad venta 3:");
        jP1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 130, -1));

        jTUtil3V.setText("0.0");
        jTUtil3V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil3V.setNextFocusableComponent(jTPre4);
        jP1.add(jTUtil3V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 130, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Utilidad venta 4:");
        jP1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 130, -1));

        jTUtil4V.setText("0.0");
        jTUtil4V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil4V.setNextFocusableComponent(jTPre5);
        jP1.add(jTUtil4V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 130, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Utilidad venta 5:");
        jP1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 130, -1));

        jTUtil5V.setText("0.0");
        jTUtil5V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil5V.setNextFocusableComponent(jTPre6);
        jP1.add(jTUtil5V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Utilidad venta 6:");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 130, -1));

        jTUtil6V.setText("0.0");
        jTUtil6V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil6V.setNextFocusableComponent(jTPre7);
        jP1.add(jTUtil6V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 130, 20));

        jTUtil7V.setText("0.0");
        jTUtil7V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil7V.setNextFocusableComponent(jTPre8);
        jP1.add(jTUtil7V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 130, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Utilidad venta 7:");
        jP1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 130, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Utilidad venta 8:");
        jP1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 130, -1));

        jTUtil8V.setText("0.0");
        jTUtil8V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil8V.setNextFocusableComponent(jTPre9);
        jP1.add(jTUtil8V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 130, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Utilidad venta 9:");
        jP1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 130, -1));

        jTUtil9V.setText("0.0");
        jTUtil9V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil9V.setNextFocusableComponent(jTPre10);
        jP1.add(jTUtil9V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 130, 20));

        jTUtil10V.setText("0.0");
        jTUtil10V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil10V.setNextFocusableComponent(jBGuar);
        jP1.add(jTUtil10V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 130, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Utilidad venta 10:");
        jP1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUltimoCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUltimoCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUltimoCostoActionPerformed
     
   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel16;
    protected javax.swing.JLabel jLabel17;
    protected javax.swing.JLabel jLabel18;
    protected javax.swing.JLabel jLabel19;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel20;
    protected javax.swing.JLabel jLabel21;
    protected javax.swing.JLabel jLabel22;
    protected javax.swing.JLabel jLabel27;
    protected javax.swing.JLabel jLabel28;
    protected javax.swing.JLabel jLabel29;
    protected javax.swing.JLabel jLabel30;
    protected javax.swing.JLabel jLabel31;
    protected javax.swing.JLabel jLabel32;
    protected javax.swing.JLabel jLabel33;
    protected javax.swing.JLabel jLabel34;
    protected javax.swing.JLabel jLabel35;
    protected javax.swing.JLabel jLabel36;
    protected javax.swing.JLabel jLabel37;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    protected javax.swing.JTextField jTPre1;
    protected javax.swing.JTextField jTPre10;
    protected javax.swing.JTextField jTPre2;
    protected javax.swing.JTextField jTPre3;
    protected javax.swing.JTextField jTPre4;
    protected javax.swing.JTextField jTPre5;
    protected javax.swing.JTextField jTPre6;
    protected javax.swing.JTextField jTPre7;
    protected javax.swing.JTextField jTPre8;
    protected javax.swing.JTextField jTPre9;
    protected javax.swing.JTextField jTUti1;
    protected javax.swing.JTextField jTUti10;
    protected javax.swing.JTextField jTUti2;
    protected javax.swing.JTextField jTUti3;
    protected javax.swing.JTextField jTUti4;
    protected javax.swing.JTextField jTUti5;
    protected javax.swing.JTextField jTUti6;
    protected javax.swing.JTextField jTUti7;
    protected javax.swing.JTextField jTUti8;
    protected javax.swing.JTextField jTUti9;
    protected javax.swing.JTextField jTUtil10V;
    protected javax.swing.JTextField jTUtil1V;
    protected javax.swing.JTextField jTUtil2V;
    protected javax.swing.JTextField jTUtil3V;
    protected javax.swing.JTextField jTUtil4V;
    protected javax.swing.JTextField jTUtil5V;
    protected javax.swing.JTextField jTUtil6V;
    protected javax.swing.JTextField jTUtil7V;
    protected javax.swing.JTextField jTUtil8V;
    protected javax.swing.JTextField jTUtil9V;
    protected javax.swing.JTextField jTextFieldUltimoCosto;
    // End of variables declaration//GEN-END:variables

}
