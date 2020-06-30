/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.panels;

import com.era.models.Line;
import com.era.repositories.RepositoryFactory;
import com.era.utilities.UtilitiesFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author PC
 */
public class LinesJPanel extends BaseJPanel {
    
    public LinesJPanel(){
    
        this.Repository = RepositoryFactory.getInstance().getLinesRepository();
        
        OnIteration = (Object Object) -> {
            
            //Cast the model
            final Line Line = (Line)Object;

            //Get the image icon image
            ImageIcon ImageIcon = UtilitiesFactory.getSingleton().getImagesUtility().getLineImagePathImageIcon(Line.getCode());                                
            
            //Resize image
            ImageIcon = UtilitiesFactory.getSingleton().getImagesUtility().scaleImage(ImageIcon, 125,115);
            
            //Assign image to label
            javax.swing.JLabel jLImg2 = new javax.swing.JLabel();
            jLImg2.setIcon(ImageIcon);

            //Create the button
            final JButton JButton = new JButton(Line.getDescription());
            JButton.setLayout(new java.awt.BorderLayout());                                                           
            JButton.add(jLImg2);
                        
            //Return the button
            return JButton;
        };             
    }
}