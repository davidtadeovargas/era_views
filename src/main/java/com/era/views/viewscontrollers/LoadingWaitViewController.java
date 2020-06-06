/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.viewscontrollers;

import com.era.views.LoadingWaitJFrame;
import java.util.List;

/**
 *
 * @author PC
 */
public class LoadingWaitViewController extends LoadingWaitJFrame {

    public LoadingWaitViewController(){
        super("");
    }
    
    @Override
    public List<?> getItemsToLoadInTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void loadModelInFields(Object ObjectModel) throws  Exception {        
    }
    
    @Override
    public void clearFields(){
    }
}
