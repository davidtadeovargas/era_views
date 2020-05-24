/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author PC
 */
public abstract class BaseComboBox<T> extends JComboBox {
    
    abstract List<T> getItems();
    
    public T getSelectedObject(){
        if(this.getSelectedItem() != null){
            final T Item_ = (T) this.getSelectedItem();
            return Item_;
        }   
        else{
            return null;
        }
    }
    
    public void loadItems(){
        
        final List<T> items_ = (List<T>) this.getItems();
        for(T Item : items_){
            this.addItem(Item);
        }
    }
    
    public void clear(){
        this.removeAllItems();
    }
}
