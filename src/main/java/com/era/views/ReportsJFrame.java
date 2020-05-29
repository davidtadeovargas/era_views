package com.era.views;

/*

Compras
	Proveedores
	Compras
	CXP
	Ordenes de compra
	Previos de compra
Ventas
	Ventas
	CXC
        Clientes
        Cotizaciones
        Vendedores
        Flujo
Almacen
    Traspasos
    Productos
    Kardex
Usuarios
Respaldos

*/

public abstract class ReportsJFrame extends BaseJFrame 
{    
    public ReportsJFrame(final String idTextTitleWindow)
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        this.getRootPane().setDefaultButton(generateButton);
        
        postInitComponents();
    }
        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 110, 30));

        generateButton.setBackground(new java.awt.Color(255, 255, 255));
        generateButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        generateButton.setForeground(new java.awt.Color(0, 102, 0));
        generateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        generateButton.setText("Generar");
        generateButton.setToolTipText("Abrir Reporte (Ctrl+A)");
        generateButton.setNextFocusableComponent(jBSal);
        jP1.add(generateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compras", "Ventas", "Usuarios", "Respaldos", "Almacen" }));
        jP1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jP1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 330, -1));

        jLabel1.setText("Clasificación:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jLabel2.setText("Subclasificación:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
   
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateButton;
    private javax.swing.JButton jBSal;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP1;
    // End of variables declaration//GEN-END:variables

}
