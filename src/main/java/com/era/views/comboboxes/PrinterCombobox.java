/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.datamodels.PrinterDataModel;
import com.era.utilities.UtilitiesFactory;
import com.era.views.comboboxes.cellrenders.PrinterListCellRender;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class PrinterCombobox extends BaseComboBox<PrinterDataModel> {

    public PrinterCombobox(){
        super(new PrinterListCellRender());
    }
    
    @Override
    List<PrinterDataModel> getItems() throws Exception {
        
        //Emtpy model
        final PrinterDataModel PrinterDataModel = new PrinterDataModel();
        PrinterDataModel.setName("");
        
        final List<PrinterDataModel> printers = new ArrayList<>();
        printers.add(PrinterDataModel);
        printers.addAll(UtilitiesFactory.getSingleton().getPrintersUtility().getAllPrinters());
        
        return printers;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final PrinterDataModel PrinterDataModelItem = (PrinterDataModel)ObjectItem;
        final PrinterDataModel PrinterDataModelMethod = (PrinterDataModel)ObjectMethod;
        
        boolean  found = false;
        if(PrinterDataModelItem!=null && PrinterDataModelMethod != null && PrinterDataModelItem.getName() != null && PrinterDataModelMethod.getName() != null){
            if(PrinterDataModelItem.getName() != null && PrinterDataModelItem.getName().compareTo(PrinterDataModelMethod.getName())==0){
                found = true;
            }
        }
        
        return found;
    }
}
