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
        jLabel2 = new javax.swing.JLabel();
        reportsOneLevelCombobox = new com.era.views.comboboxes.ReportsOneLevelCombobox();
        reportsSecondLevelCombobox = new com.era.views.comboboxes.ReportsSecondLevelCombobox();
        jPanelClientes = new javax.swing.JPanel();
        txtClienteCodRptClientes = new javax.swing.JTextField();
        btnSearchCustomerRptClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtClienteDescripRptClientes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        jP1.add(generateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 30));

        jLabel2.setText("Subclasificación:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, -1));
        jP1.add(reportsOneLevelCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, -1));
        jP1.add(reportsSecondLevelCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 330, -1));

        jPanelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtClienteCodRptClientes.setEditable(false);
        txtClienteCodRptClientes.setBackground(new java.awt.Color(204, 255, 204));
        txtClienteCodRptClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanelClientes.add(txtClienteCodRptClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 20));

        btnSearchCustomerRptClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchCustomerRptClientes.setText("...");
        btnSearchCustomerRptClientes.setToolTipText("Búscar Cliente(s)");
        jPanelClientes.add(btnSearchCustomerRptClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 30, 20));

        jLabel1.setText("Cliente:");
        jPanelClientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        txtClienteDescripRptClientes.setBackground(new java.awt.Color(204, 204, 255));
        txtClienteDescripRptClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanelClientes.add(txtClienteDescripRptClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 200, 20));

        jP1.add(jPanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 540, 390));

        jLabel3.setText("Filtros:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 110, -1));

        jLabel4.setText("Clasificación:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
   
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnSearchCustomerRptClientes;
    protected javax.swing.JButton generateButton;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanelClientes;
    protected com.era.views.comboboxes.ReportsOneLevelCombobox reportsOneLevelCombobox;
    protected com.era.views.comboboxes.ReportsSecondLevelCombobox reportsSecondLevelCombobox;
    protected javax.swing.JTextField txtClienteCodRptClientes;
    protected javax.swing.JTextField txtClienteDescripRptClientes;
    // End of variables declaration//GEN-END:variables

}
