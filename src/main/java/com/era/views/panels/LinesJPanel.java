/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.panels;

import com.era.logger.LoggerUtility;
import com.era.models.Line;
import com.era.repositories.RepositoryFactory;
import com.era.utilities.UtilitiesFactory;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author PC
 */
public class LinesJPanel extends BaseJPanel {

    private boolean showProductsImagesInPanelInSalespoint;
    
    
    public LinesJPanel(){
    
        try {
         
            this.Repository = RepositoryFactory.getInstance().getLinesRepository();

            showProductsImagesInPanelInSalespoint = RepositoryFactory.getInstance().getConfgralRepository().getShowProductsImagesInPanelInSalespoint().getVal()==1;            

            OnIteration = (Object Object) -> {

                //Cast the model
                final Line Line = (Line)Object;

                //Get the image icon image
                ImageIcon ImageIcon = UtilitiesFactory.getSingleton().getImagesUtility().getLineImagePathImageIcon(Line.getCode());                                

                //Resize image
                ImageIcon = UtilitiesFactory.getSingleton().getImagesUtility().scaleImage(ImageIcon, 125,115);

                //Assign image to label
                javax.swing.JLabel jLImg2 = new javax.swing.JLabel();

                if(showProductsImagesInPanelInSalespoint){
                    jLImg2.setIcon(ImageIcon);
                }            

                //Create the button
                final JButton JButton = new JButton(Line.getDescription());
                JButton.setLayout(new java.awt.BorderLayout());
                JButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 500));
                JButton.add(jLImg2);

                //Return the button
                return JButton;
            };             
            
        } catch (Exception ex) {
            LoggerUtility.getSingleton().logError(this.getClass(), ex);            
        }            
    }
}
