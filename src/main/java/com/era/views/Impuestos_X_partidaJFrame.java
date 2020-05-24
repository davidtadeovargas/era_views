package com.era.views;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public abstract class Impuestos_X_partidaJFrame extends BaseJFrame 
{
    public Impuestos_X_partidaJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();
        
        tabla.getTableHeader().setReorderingAllowed(false);
        
        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)tabla.getModel());
        tabla.setRowSorter(trs);
        trs.setSortsOnUpdates(true);
        
        combo_impuesto.grabFocus();
        
        tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(50);        
        
        tabla.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        tabla.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        boton_borrar = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jBTabG = new javax.swing.JButton();
        combo_impuesto = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        campo_valor_impuesto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_borrar.setBackground(new java.awt.Color(255, 255, 255));
        boton_borrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        boton_borrar.setForeground(new java.awt.Color(0, 102, 0));
        boton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del5.png"))); // NOI18N
        boton_borrar.setText("Borrar");
        boton_borrar.setToolTipText("Borrar Viatico(s) (Ctrl+SUPR)");
        boton_borrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_borrar.setNextFocusableComponent(boton_salir);
        jP1.add(boton_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 120, 30));

        boton_salir.setBackground(new java.awt.Color(255, 255, 255));
        boton_salir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        boton_salir.setForeground(new java.awt.Color(0, 102, 0));
        boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        boton_salir.setText("Salir");
        boton_salir.setToolTipText("Salir (ESC)");
        boton_salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_salir.setNextFocusableComponent(combo_impuesto);
        jP1.add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 30));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo Viàtico (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(tabla);
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 90, 20));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imp/Ret", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setNextFocusableComponent(boton_borrar);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(tabla);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 380, 260));

        jBTabG.setBackground(new java.awt.Color(0, 153, 153));
        jBTabG.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTabG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 10, 20));

        jP1.add(combo_impuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("*Impuesto/Retención:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, -1));

        campo_valor_impuesto.setEditable(false);
        campo_valor_impuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(campo_valor_impuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                            
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_salir;
    private javax.swing.JTextField campo_valor_impuesto;
    private javax.swing.JComboBox combo_impuesto;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBTabG;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
