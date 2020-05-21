/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import com.era.logger.LoggerUtility;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.net.URI;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author PC
 */
public class PremiumJFrame extends BaseJFrame {

    /**
     * Creates new form PremiumJFrame
     */
    public PremiumJFrame() {
        
        super("");
        
        setUndecorated(true);
        
        initComponents();               
        
        try{
            
            int frameW = 800;
            int frameH = 400;                       
            
            /*JButton cloesButton = new JButton("X");
            cloesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            cloesButton.setMargin(new Insets(5, 5, 5, 5));
            cloesButton.setFocusable(false);
            cloesButton.addActionListener((ActionEvent e) -> {
                dispose();
            });
            cloesButton.setForeground(Color.BLACK);
            Border emptyBorder = BorderFactory.createEmptyBorder();
            cloesButton.setBorder(emptyBorder);
            cloesButton.setOpaque(false);
            cloesButton.setContentAreaFilled(false);
            cloesButton.setBorderPainted(false);*/

            InputStream stream = getClass().getResourceAsStream("/imgs/premium.PNG");
            final Image image = ImageIO.read(stream);
            
            Image dimg = image.getScaledInstance(frameW, frameH,Image.SCALE_SMOOTH);
            
            ImageIcon icon= new ImageIcon(dimg);                    
            
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.weightx = 1.0f;
            constraints.weighty = 1.0f;
            constraints.insets = new Insets(0, 0, 0, 0);
            constraints.fill = GridBagConstraints.BOTH;
            
            JLabel headingLabel = new JLabel(icon);            
            this.getContentPane().add(headingLabel,constraints);                        
            
            constraints.gridx++;
            constraints.weightx = 0f;
            constraints.weighty = 0f;
            constraints.fill = GridBagConstraints.NONE;
            constraints.anchor = GridBagConstraints.NORTH;

            //this.getContentPane().add(cloesButton, constraints);
            
            setAlwaysOnTop(true);
            
            setPreferredSize(new Dimension(frameW, frameH));
            pack();
            
            this.setLocationRelativeTo(null);    
            
            //It has to show with efect
            setVisibleWithEfect = true;
            
            headingLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        try {
                            //Close the window
                            dispose();
                            
                        } catch (Exception ex) {
                            LoggerUtility.getSingleton().logError(PushNotificationJFrame.class, ex);
                        }
                    }
                }
            });
        
        }catch(Exception e){
            LoggerUtility.getSingleton().logError(PremiumJFrame.class, e);
        }                       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
