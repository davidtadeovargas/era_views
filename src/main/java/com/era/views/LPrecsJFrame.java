package com.era.views;



public class LPrecsJFrame extends BaseJFrame 
{
    public LPrecsJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
    
        this.getRootPane().setDefaultButton(jBGuar);
        
        
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
        jLabel3 = new javax.swing.JLabel();
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
        jLabel23 = new javax.swing.JLabel();
        jTCostP = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTUEPS = new javax.swing.JTextField();
        jTPEPS = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTCostL = new javax.swing.JTextField();
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
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setName(""); // NOI18N
        jBSal.setNextFocusableComponent(jTextFieldUltimoCosto);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 110, -1));

        jTPre1.setText("$0.00");
        jTPre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre1.setNextFocusableComponent(jTUti1);
        jP1.add(jTPre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 20));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar (Ctrl+G)");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio 3");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, -1));

        jTPre3.setText("$0.00");
        jTPre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre3.setNextFocusableComponent(jTUti3);
        jP1.add(jTPre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Precio 5");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, -1));

        jTPre5.setText("$0.00");
        jTPre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre5.setNextFocusableComponent(jTUti5);
        jP1.add(jTPre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 150, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio 7");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, -1));

        jTPre7.setText("$0.00");
        jTPre7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre7.setNextFocusableComponent(jTUti7);
        jP1.add(jTPre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 150, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Precio 9");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, -1));

        jTPre9.setText("$0.00");
        jTPre9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre9.setNextFocusableComponent(jTUti9);
        jP1.add(jTPre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 150, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Precio 2");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, -1));

        jTPre2.setText("$0.00");
        jTPre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre2.setNextFocusableComponent(jTUti2);
        jP1.add(jTPre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 150, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Precio 4");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, -1));

        jTPre4.setText("$0.00");
        jTPre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre4.setNextFocusableComponent(jTUti4);
        jP1.add(jTPre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Precio 6");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, -1));

        jTPre6.setText("$0.00");
        jTPre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre6.setNextFocusableComponent(jTUti6);
        jP1.add(jTPre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Precio 8");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 150, -1));

        jTPre8.setText("$0.00");
        jTPre8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre8.setNextFocusableComponent(jTUti8);
        jP1.add(jTPre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Precio 10");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 150, -1));

        jTPre10.setText("$0.00");
        jTPre10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre10.setNextFocusableComponent(jTUti10);
        jP1.add(jTPre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 150, 20));

        jTextFieldUltimoCosto.setText("$0.00");
        jTextFieldUltimoCosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldUltimoCosto.setNextFocusableComponent(jTCostL);
        jP1.add(jTextFieldUltimoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Precio 1");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, -1));

        jTUti10.setText("0.0");
        jTUti10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti10.setNextFocusableComponent(jTUtil10V);
        jP1.add(jTUti10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 130, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Costo promedio:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        jTUti1.setText("0.0");
        jTUti1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti1.setNextFocusableComponent(jTUtil1V);
        jP1.add(jTUti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 130, 20));

        jTUti2.setText("0.0");
        jTUti2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti2.setNextFocusableComponent(jTUtil2V);
        jP1.add(jTUti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 130, 20));

        jTUti3.setText("0.0");
        jTUti3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti3.setNextFocusableComponent(jTUtil3V);
        jP1.add(jTUti3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 130, 20));

        jTUti4.setText("0.0");
        jTUti4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti4.setNextFocusableComponent(jTUtil4V);
        jP1.add(jTUti4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 130, 20));

        jTUti5.setText("0.0");
        jTUti5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti5.setNextFocusableComponent(jTUtil5V);
        jP1.add(jTUti5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, 20));

        jTUti6.setText("0.0");
        jTUti6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti6.setNextFocusableComponent(jTUtil6V);
        jP1.add(jTUti6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 130, 20));

        jTUti7.setText("0.0");
        jTUti7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti7.setNextFocusableComponent(jTUtil7V);
        jP1.add(jTUti7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 130, 20));

        jTUti8.setText("0.0");
        jTUti8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti8.setNextFocusableComponent(jTUtil8V);
        jP1.add(jTUti8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 130, 20));

        jTUti9.setText("0.0");
        jTUti9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUti9.setNextFocusableComponent(jTUtil9V);
        jP1.add(jTUti9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 130, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Utilidad %:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 130, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Utilidad %:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Utilidad %:");
        jP1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Utilidad %:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Utilidad %:");
        jP1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Utilidad %:");
        jP1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 130, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Utilidad %:");
        jP1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Utilidad %:");
        jP1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 130, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Utilidad %:");
        jP1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 130, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("UEPS:");
        jP1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, -1));

        jTCostP.setEditable(false);
        jTCostP.setText("$0.00");
        jTCostP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCostP.setNextFocusableComponent(jTextFieldUltimoCosto);
        jP1.add(jTCostP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Costo logística:");
        jP1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("PEPS:");
        jP1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        jTUEPS.setEditable(false);
        jTUEPS.setText("$0.00");
        jTUEPS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUEPS.setNextFocusableComponent(jTextFieldUltimoCosto);
        jP1.add(jTUEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 20));

        jTPEPS.setEditable(false);
        jTPEPS.setText("$0.00");
        jTPEPS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPEPS.setNextFocusableComponent(jTextFieldUltimoCosto);
        jP1.add(jTPEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Ultimo costo:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, -1));

        jTCostL.setText("$0.00");
        jTCostL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCostL.setNextFocusableComponent(jTPre1);
        jP1.add(jTCostL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 130, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Utilidad venta 1:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 130, -1));

        jTUtil1V.setText("0.0");
        jTUtil1V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil1V.setNextFocusableComponent(jTPre2);
        jP1.add(jTUtil1V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 130, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Utilidad venta 2:");
        jP1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, -1));

        jTUtil2V.setText("0.0");
        jTUtil2V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil2V.setNextFocusableComponent(jTPre3);
        jP1.add(jTUtil2V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 130, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Utilidad venta 3:");
        jP1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 130, -1));

        jTUtil3V.setText("0.0");
        jTUtil3V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil3V.setNextFocusableComponent(jTPre4);
        jP1.add(jTUtil3V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 130, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Utilidad venta 4:");
        jP1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 130, -1));

        jTUtil4V.setText("0.0");
        jTUtil4V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil4V.setNextFocusableComponent(jTPre5);
        jP1.add(jTUtil4V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 130, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Utilidad venta 5:");
        jP1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 130, -1));

        jTUtil5V.setText("0.0");
        jTUtil5V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil5V.setNextFocusableComponent(jTPre6);
        jP1.add(jTUtil5V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 130, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Utilidad venta 6:");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 130, -1));

        jTUtil6V.setText("0.0");
        jTUtil6V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil6V.setNextFocusableComponent(jTPre7);
        jP1.add(jTUtil6V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 130, 20));

        jTUtil7V.setText("0.0");
        jTUtil7V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil7V.setNextFocusableComponent(jTPre8);
        jP1.add(jTUtil7V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 130, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Utilidad venta 7:");
        jP1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 130, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Utilidad venta 8:");
        jP1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 130, -1));

        jTUtil8V.setText("0.0");
        jTUtil8V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil8V.setNextFocusableComponent(jTPre9);
        jP1.add(jTUtil8V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Utilidad venta 9:");
        jP1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 130, -1));

        jTUtil9V.setText("0.0");
        jTUtil9V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil9V.setNextFocusableComponent(jTPre10);
        jP1.add(jTUtil9V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 130, 20));

        jTUtil10V.setText("0.0");
        jTUtil10V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUtil10V.setNextFocusableComponent(jBGuar);
        jP1.add(jTUtil10V, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 130, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Utilidad venta 10:");
        jP1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBSal;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JTextField jTCostL;
    private javax.swing.JTextField jTCostP;
    private javax.swing.JTextField jTPEPS;
    private javax.swing.JTextField jTPre1;
    private javax.swing.JTextField jTPre10;
    private javax.swing.JTextField jTPre2;
    private javax.swing.JTextField jTPre3;
    private javax.swing.JTextField jTPre4;
    private javax.swing.JTextField jTPre5;
    private javax.swing.JTextField jTPre6;
    private javax.swing.JTextField jTPre7;
    private javax.swing.JTextField jTPre8;
    private javax.swing.JTextField jTPre9;
    private javax.swing.JTextField jTUEPS;
    private javax.swing.JTextField jTUti1;
    private javax.swing.JTextField jTUti10;
    private javax.swing.JTextField jTUti2;
    private javax.swing.JTextField jTUti3;
    private javax.swing.JTextField jTUti4;
    private javax.swing.JTextField jTUti5;
    private javax.swing.JTextField jTUti6;
    private javax.swing.JTextField jTUti7;
    private javax.swing.JTextField jTUti8;
    private javax.swing.JTextField jTUti9;
    private javax.swing.JTextField jTUtil10V;
    private javax.swing.JTextField jTUtil1V;
    private javax.swing.JTextField jTUtil2V;
    private javax.swing.JTextField jTUtil3V;
    private javax.swing.JTextField jTUtil4V;
    private javax.swing.JTextField jTUtil5V;
    private javax.swing.JTextField jTUtil6V;
    private javax.swing.JTextField jTUtil7V;
    private javax.swing.JTextField jTUtil8V;
    private javax.swing.JTextField jTUtil9V;
    private javax.swing.JTextField jTextFieldUltimoCosto;
    // End of variables declaration//GEN-END:variables

}
