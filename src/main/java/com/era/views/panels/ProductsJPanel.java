/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.panels;

import com.era.models.Product;
import com.era.repositories.RepositoryFactory;
import com.era.utilities.UtilitiesFactory;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author PC
 */
public class ProductsJPanel extends BaseJPanel {
    
    public ProductsJPanel(){
    
        this.Repository = RepositoryFactory.getInstance().getLinesRepository();
                
        OnIteration = (Object Object) -> {
            
            //Cast the model
            final Product Product = (Product)Object;

            //Get the image icon image
            ImageIcon ImageIcon = UtilitiesFactory.getSingleton().getImagesUtility().getProductImagePathImageIcon(Product.getCode());                                
            
            //Resize image
            ImageIcon = UtilitiesFactory.getSingleton().getImagesUtility().scaleImage(ImageIcon, 125,115);
            
            //Asign image
            javax.swing.JLabel jLImg2 = new javax.swing.JLabel();
            jLImg2.setIcon(ImageIcon);
                        
            //Create the button
            final JButton JButton = new JButton(Product.getDescription());
            JButton.setLayout(new java.awt.BorderLayout());
            JButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 500));
            JButton.add(jLImg2);
                        
            //Return the button
            return JButton;
        };             
    }
}
