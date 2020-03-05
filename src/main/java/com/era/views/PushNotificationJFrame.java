/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import com.era.logger.LoggerUtility;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

/**
 *
 * @author PC
 */
public class PushNotificationJFrame extends BaseJFrame {

    /**
     * Creates new form PushNotificationJFrame
     */
    public PushNotificationJFrame(final String urlBanner, final String urlBannerAction) throws Exception {
        
        setUndecorated(true);
        
        initComponents();
        
        Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        int taskBarHeight = scrnSize.height - winSize.height;

        final int frameW = 500;
        final int frameH = 225;
        
        URL url = new URL(urlBanner);
        
        final Image image = ImageIO.read(url);
        
        setSize(frameW,frameH);
        
        getContentPane().setBackground(Color.WHITE);  //Whatever color
        
        JLayeredPane JLayeredPane = new JLayeredPane();
        JLayeredPane.setLayout(null);
        JLayeredPane.setBackground(Color.white);
        JLayeredPane.setPreferredSize(new Dimension(frameW, frameH));
        
        Image dimg = image.getScaledInstance(frameW, frameH,Image.SCALE_SMOOTH);
        JLabel headingLabel = new JLabel(new ImageIcon(dimg));
        headingLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        headingLabel.setOpaque(false);
        headingLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(urlBannerAction));
                            
                            //Close the window
                            dispose();
                            
                        } catch (Exception ex) {
                            LoggerUtility.getSingleton().logError(PushNotificationJFrame.class, ex);
                        }
                    }
                }
            });
                
        BorderLayout frameLayout = new BorderLayout();
        
        JPanel layerOne = new JPanel(frameLayout);
        layerOne.add(headingLabel);
        layerOne.setBounds(0, 0, frameW, frameH);
        JLayeredPane.add(layerOne, new Integer(0), 0);                        
        
        layerOne.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        JButton cloesButton = new JButton("X");
        cloesButton.setPreferredSize(new Dimension(8, 9));
        cloesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cloesButton.setMargin(new Insets(5, 5, 5, 5));
        cloesButton.setFocusable(false);
        cloesButton.addActionListener((ActionEvent e) -> {
            dispose();
        });
        Border emptyBorder = BorderFactory.createEmptyBorder();
        cloesButton.setBorder(emptyBorder);
        cloesButton.setOpaque(false);
        cloesButton.setContentAreaFilled(true);
        cloesButton.setBorderPainted(true);
        
        JPanel layerTwo = new JPanel();
        layerTwo.add(cloesButton);
        layerTwo.setBounds(frameW - 20, 10, 15, 18);
        JLayeredPane.add(layerTwo, new Integer(1), 0);
        
        JPanel mainPane = new JPanel();
        mainPane.setLayout(new BorderLayout());
        mainPane.add(JLayeredPane, BorderLayout.WEST);
        mainPane.setBackground(Color.white);
        
        this.setContentPane(mainPane);
        
         // Set's the window to be "always on top"
        setAlwaysOnTop( true );
                
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(scrnSize.width - frameW, scrnSize.height - frameH - taskBarHeight);        
    }

    @Override
    public void setVisible() {
        super.setVisible(); //To change body of generated methods, choose Tools | Templates.
        
        toFront();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
   
}
