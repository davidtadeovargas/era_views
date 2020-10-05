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
        generateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reportsOneLevelCombobox = new com.era.views.comboboxes.ReportsOneLevelCombobox();
        reportsSecondLevelCombobox = new com.era.views.comboboxes.ReportsSecondLevelCombobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generateButton.setBackground(new java.awt.Color(255, 255, 255));
        generateButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        generateButton.setForeground(new java.awt.Color(0, 102, 0));
        generateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abr.png"))); // NOI18N
        generateButton.setText("Generar");
        generateButton.setToolTipText("Abrir Reporte (Ctrl+A)");
        jP1.add(generateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 120, 30));

        jLabel1.setText("Clasificación:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jLabel2.setText("Subclasificación:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, -1));
        jP1.add(reportsOneLevelCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, -1));
        jP1.add(reportsSecondLevelCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
   
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton generateButton;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP1;
    protected com.era.views.comboboxes.ReportsOneLevelCombobox reportsOneLevelCombobox;
    protected com.era.views.comboboxes.ReportsSecondLevelCombobox reportsSecondLevelCombobox;
    // End of variables declaration//GEN-END:variables

}
