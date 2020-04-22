//Paquete
package com.era.views;

//System presentation (first window shown)
public class PresentationJFrame extends BaseJFrame {
    
    public PresentationJFrame() {
        
        //Init graphics components
        initComponents();
    }

        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setEnabled(false);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP1.setLayout(new java.awt.BorderLayout());

        jlImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ban.png"))); // NOI18N
        jPanel1.add(jlImg);

        jP1.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
       
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
                        
    }//GEN-LAST:event_formKeyPressed
         
    /*Cuando se mueve la rueda del ratón en la forma*/
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
                
        
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
                
    }//GEN-LAST:event_formMouseDragged

      
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
                
        
    }//GEN-LAST:event_formMouseMoved
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlImg;
    // End of variables declaration//GEN-END:variables

}
