package com.era.views;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public abstract class Impuestos_X_productos_nuevoJFrame extends BaseJFrame
{
    public Impuestos_X_productos_nuevoJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();                
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBNew);                
        
        jComImp.grabFocus();
    }

        
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostTodViat = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jComImp = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

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
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del5.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Viatico(s) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDelMouseExited(evt);
            }
        });
        jBDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelActionPerformed(evt);
            }
        });
        jBDel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDelKeyPressed(evt);
            }
        });
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 120, 30));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo Viàtico (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jTab);
        jBNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNewMouseExited(evt);
            }
        });
        jBNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewActionPerformed(evt);
            }
        });
        jBNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBNewKeyPressed(evt);
            }
        });
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 120, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Producto", "Imp/Ret", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 470, 250));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBuscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBuscMouseExited(evt);
            }
        });
        jBBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscActionPerformed(evt);
            }
        });
        jBBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBBuscKeyPressed(evt);
            }
        });
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMostTodViat);
        jTBusc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBuscFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBuscFocusLost(evt);
            }
        });
        jTBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscKeyPressed(evt);
            }
        });
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 190, 20));

        jBMostTodViat.setBackground(new java.awt.Color(255, 255, 255));
        jBMostTodViat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMostTodViat.setForeground(new java.awt.Color(0, 102, 0));
        jBMostTodViat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMostTodViat.setText("Mostrar F4");
        jBMostTodViat.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMostTodViat.setNextFocusableComponent(jBDel);
        jBMostTodViat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMostTodViatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMostTodViatMouseExited(evt);
            }
        });
        jBMostTodViat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostTodViatActionPerformed(evt);
            }
        });
        jBMostTodViat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBMostTodViatKeyPressed(evt);
            }
        });
        jP1.add(jBMostTodViat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 140, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar Todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTab);
        jBTod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBTodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBTodMouseExited(evt);
            }
        });
        jBTod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTodActionPerformed(evt);
            }
        });
        jBTod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTodKeyPressed(evt);
            }
        });
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 130, 18));

        jComImp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComImpFocusLost(evt);
            }
        });
        jComImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComImpActionPerformed(evt);
            }
        });
        jComImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComImpKeyPressed(evt);
            }
        });
        jP1.add(jComImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Impuesto/Retención:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
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
                        
    
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
                                
                        
    }//GEN-LAST:event_jBDelActionPerformed
   
       
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
    }//GEN-LAST:event_formKeyPressed

      
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed
        
        
    }//GEN-LAST:event_jBDelKeyPressed
   
   
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
        
    }//GEN-LAST:event_jP1KeyPressed
        
    
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed
        
        
    }//GEN-LAST:event_jBNewKeyPressed

                    
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
                
        
    }//GEN-LAST:event_jTabKeyPressed

        
       
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
                               
        
    }//GEN-LAST:event_jBNewActionPerformed
    
            
    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed

        
    }//GEN-LAST:event_jBBuscKeyPressed

        
    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained
    
        
    }//GEN-LAST:event_jTBuscFocusGained

        
    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed
        
        
    }//GEN-LAST:event_jTBuscKeyPressed

        
    private void jBMostTodViatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMostTodViatKeyPressed

        
    }//GEN-LAST:event_jBMostTodViatKeyPressed

    
    
        
    private void jBMostTodViatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostTodViatActionPerformed
        
        
    }//GEN-LAST:event_jBMostTodViatActionPerformed

        
    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed
                            
        
    }//GEN-LAST:event_jBBuscActionPerformed

        
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed

    
    }//GEN-LAST:event_jBSalKeyPressed

        
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
    

    }//GEN-LAST:event_jBSalActionPerformed

                
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        
    }//GEN-LAST:event_formMouseMoved

        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
    }//GEN-LAST:event_formMouseWheelMoved

    
        
        
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited
            
        
    }//GEN-LAST:event_jBBuscMouseExited

        
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
            
        
    }//GEN-LAST:event_jBBuscMouseEntered

                
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed
        

    }//GEN-LAST:event_jBTodActionPerformed

    
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

    
    }//GEN-LAST:event_jBTodKeyPressed

        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
    }//GEN-LAST:event_formWindowClosing

        
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
                        
    }//GEN-LAST:event_jBNewMouseEntered

    
    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered
        
        
    }//GEN-LAST:event_jBTodMouseEntered

        
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
        
    }//GEN-LAST:event_jBDelMouseEntered

        
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
        
    }//GEN-LAST:event_jBSalMouseEntered

        
    private void jBMostTodViatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTodViatMouseEntered
        
        
    }//GEN-LAST:event_jBMostTodViatMouseEntered

        
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
                        
    }//GEN-LAST:event_jBNewMouseExited

        
    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited
            
        
    }//GEN-LAST:event_jBTodMouseExited

        
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
        
    }//GEN-LAST:event_jBDelMouseExited

            
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
        
    }//GEN-LAST:event_jBSalMouseExited

        
    private void jBMostTodViatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTodViatMouseExited
        
        
    }//GEN-LAST:event_jBMostTodViatMouseExited

        
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost
        
        
    }//GEN-LAST:event_jTBuscFocusLost

    
    private void jComImpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComImpFocusLost


    }//GEN-LAST:event_jComImpFocusLost

    
    private void jComImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComImpActionPerformed


    }//GEN-LAST:event_jComImpActionPerformed

    
    private void jComImpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComImpKeyPressed


    }//GEN-LAST:event_jComImpKeyPressed

        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBMostTodViat;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBTod;
    protected javax.swing.JComboBox jComImp;
    protected javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
