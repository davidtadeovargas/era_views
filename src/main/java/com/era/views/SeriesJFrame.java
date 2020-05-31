package com.era.views;

import com.era.models.DocumentOrigin;



public abstract class SeriesJFrame extends BaseJFrame
{
    
    public SeriesJFrame(final String idTextTitleWindow) 
    {       
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBNew);
        
        jTSer.grabFocus();
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jTSer = new javax.swing.JTextField();
        jBNew = new javax.swing.JButton();
        jTConsec = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostT = new javax.swing.JButton();
        jTDescrip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoDocumento = new javax.swing.JComboBox<DocumentOrigin>();
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
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Serie(s) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBSal);
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
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("*Descripción:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 150, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTSer);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 100, -1));

        jTSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSer.setNextFocusableComponent(jTConsec);
        jTSer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSerFocusLost(evt);
            }
        });
        jTSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSerKeyTyped(evt);
            }
        });
        jP1.add(jTSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 20));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nueva Serie (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jTab);
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
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 100, 30));

        jTConsec.setText("1");
        jTConsec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTConsec.setNextFocusableComponent(jTDescrip);
        jTConsec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTConsecFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTConsecFocusLost(evt);
            }
        });
        jTConsec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTConsecKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTConsecKeyTyped(evt);
            }
        });
        jP1.add(jTConsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 90, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("*Serie:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Tipo Documento", "Serie", "Descripción Serie", "Consecutivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 470, 250));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setName(""); // NOI18N
        jBBusc.setNextFocusableComponent(jTBusc);
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
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMostT);
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
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 190, 20));

        jBMostT.setBackground(new java.awt.Color(255, 255, 255));
        jBMostT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMostT.setForeground(new java.awt.Color(0, 102, 0));
        jBMostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMostT.setText("Mostrar F4");
        jBMostT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMostT.setNextFocusableComponent(jBDel);
        jBMostT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMostTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMostTMouseExited(evt);
            }
        });
        jBMostT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostTActionPerformed(evt);
            }
        });
        jBMostT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBMostTKeyPressed(evt);
            }
        });
        jP1.add(jBMostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 140, 20));

        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescrip.setNextFocusableComponent(jBNew);
        jTDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripFocusLost(evt);
            }
        });
        jTDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescripKeyPressed(evt);
            }
        });
        jP1.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 260, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Consecutivo:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 110, -1));

        jP1.add(cmbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("*Tipo Documento:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
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

        
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
    
        
    }//GEN-LAST:event_jBSalActionPerformed

       
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
        
    }//GEN-LAST:event_jBSalKeyPressed

        
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed
        
    
        
    }//GEN-LAST:event_jBNewKeyPressed

        
    private void jTSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSerKeyPressed

   
        
    }//GEN-LAST:event_jTSerKeyPressed

      
    private void jTSerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerFocusGained
        
   
        
    }//GEN-LAST:event_jTSerFocusGained

       
    private void jTConsecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTConsecKeyPressed

    
        
    }//GEN-LAST:event_jTConsecKeyPressed

        
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
            
        
    }//GEN-LAST:event_jTabKeyPressed

    
    
    private void jTConsecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTConsecFocusGained
        
        
    }//GEN-LAST:event_jTConsecFocusGained

        
    private void jTSerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerFocusLost

   
        
    }//GEN-LAST:event_jTSerFocusLost

    
    private void jTConsecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTConsecFocusLost

   
        
    }//GEN-LAST:event_jTConsecFocusLost

      
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
    
         
    }//GEN-LAST:event_jBNewActionPerformed

    
    private void jTSerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSerKeyTyped
            
        
    }//GEN-LAST:event_jTSerKeyTyped

        
    private void jTConsecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTConsecKeyTyped
            
        
    }//GEN-LAST:event_jTConsecKeyTyped

        
    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed
    
        
    }//GEN-LAST:event_jBBuscKeyPressed

    
    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained

    
        
    }//GEN-LAST:event_jTBuscFocusGained

    
    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed

    
        
    }//GEN-LAST:event_jTBuscKeyPressed

        
    private void jBMostTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMostTKeyPressed

    
        
    }//GEN-LAST:event_jBMostTKeyPressed

            
        
    private void jBMostTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostTActionPerformed
            
        
    }//GEN-LAST:event_jBMostTActionPerformed

        
    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed
            
        
    }//GEN-LAST:event_jBBuscActionPerformed

        
    private void jTDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusGained
            
        
    }//GEN-LAST:event_jTDescripFocusGained

        
    private void jTDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusLost
    
        
    }//GEN-LAST:event_jTDescripFocusLost

        
    private void jTDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripKeyPressed
        
        
    }//GEN-LAST:event_jTDescripKeyPressed

    
        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
            
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
            
        
    }//GEN-LAST:event_formMouseMoved

        
    
    
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
           
        
    }//GEN-LAST:event_jBBuscMouseEntered

        
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited
        
    
        
    }//GEN-LAST:event_jBBuscMouseExited

        
        
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    
        
    }//GEN-LAST:event_formWindowClosing

    
        
        
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
    
        
    }//GEN-LAST:event_jBDelMouseEntered

        
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

        
    private void jBMostTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseEntered
        
    
        
    }//GEN-LAST:event_jBMostTMouseEntered

    
        
        
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
    
        
    }//GEN-LAST:event_jBDelMouseExited

        
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
              
        
    }//GEN-LAST:event_jBSalMouseExited

        
    private void jBMostTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseExited
                
    }//GEN-LAST:event_jBMostTMouseExited

        
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost
    
        
    }//GEN-LAST:event_jTBuscFocusLost
       
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JComboBox<DocumentOrigin> cmbTipoDocumento;
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBMostT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTConsec;
    protected javax.swing.JTextField jTDescrip;
    protected javax.swing.JTextField jTSer;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
