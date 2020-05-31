package com.era.views;


public abstract class DevPVtaPtoJFrame extends BaseJFrame 
{
    public DevPVtaPtoJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBDev);
    }

        
            
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDev = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMosT = new javax.swing.JButton();
        jBActua = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBDev.setBackground(new java.awt.Color(255, 255, 255));
        jBDev.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDev.setForeground(new java.awt.Color(0, 102, 0));
        jBDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devpar.png"))); // NOI18N
        jBDev.setText("Dev.Parcial");
        jBDev.setToolTipText("Devolución parcial de venta(s)");
        jBDev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDev.setNextFocusableComponent(jBActua);
        jP1.add(jBDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 150, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 150, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Tipo Documento", "Folio", "Serie", "Estado", "Nombre Cliente", "Total", "Total Descuento", "Fecha", "Sucursal", "No. Caja", "Usuario", "Nombre Usuario", "Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 740, 270));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setToolTipText("Se busca por los campos: tipo de documento, folio, serie, nombre de cliente, usuario, nombre de usuario");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 19));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 460, 20));

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jBDev);
        jP1.add(jBMosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 140, 19));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar Registros (F5)");
        jBActua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBActua.setNextFocusableComponent(jBSal);
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ventas:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBActua;
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBDev;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
