/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.PaymentForm;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.DefaultListCellRenderer;

/**
 *
 * @author PC
 */
public abstract class BaseComboBox<T> extends JComboBox {
    
    abstract List<T> getItems() throws Exception;
    abstract boolean foundModel(Object ObjectItem, Object ObjectMethod);
    
    
    
    public void selectByObject(Object Object) throws Exception{
        
        ComboBoxModel model = this.getModel();
        int size = model.getSize();
        for(int i=0;i<size;i++) {
            
            Object Object_ = model.getElementAt(i);
            
            //Found the selection model?
            final boolean correctModel = foundModel(Object_, Object);
            
            if(correctModel){
                this.selectObject(Object_);
                break;
            }
        }
    }
    
    public BaseComboBox(final DefaultListCellRenderer DefaultListCellRenderer){
        this.setRenderer(DefaultListCellRenderer);
    }
    
    public T getSelectedObject(){
        if(this.getSelectedItem() != null){
            final T Item_ = (T) this.getSelectedItem();
            return Item_;
        }   
        else{
            return null;
        }
    }
    
    public void selectObject(final Object Object){
        if(Object != null){
            this.setSelectedItem(Object);            
        }
    }
    
    public void clearSelection(){
        this.setSelectedIndex(0);
    }
    
    public void loadItems() throws Exception {
        
        final List<T> items_ = (List<T>) this.getItems();
        for(T Item : items_){
            this.addItem(Item);
        }
    }
    
    public void clear(){
        this.removeAllItems();
    }
}
