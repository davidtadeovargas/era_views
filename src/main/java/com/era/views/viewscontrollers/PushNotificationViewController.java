/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.viewscontrollers;

import com.era.views.PushNotificationJFrame;
import java.io.InputStream;
import com.era.logger.LoggerUtility;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author PC
 */
public class PushNotificationViewController extends PushNotificationJFrame {
    
    public PushNotificationViewController(final String urlBanner, final String urlBannerAction) throws Exception {
        
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
                            LoggerUtility.getSingleton().logError(PushNotificationViewController.class, ex);
                        }
                    }
                }
            });
        
            
            
            
            /*Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
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
                                LoggerUtility.getSingleton().logError(PushNotificationViewController.class, ex);
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
            setLocation(scrnSize.width - frameW, scrnSize.height - frameH - taskBarHeight);*/

        }catch(Exception e){
            LoggerUtility.getSingleton().logError(PushNotificationViewController.class, e);
        }
    }

    @Override
    public List<?> getItemsToLoadInTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}