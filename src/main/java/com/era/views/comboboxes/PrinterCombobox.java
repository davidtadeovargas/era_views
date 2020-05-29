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
    List<PrinterDataModel> getItems() {
        
        //Emtpy model
        final PrinterDataModel PrinterDataModel = new PrinterDataModel();
        PrinterDataModel.setName("");
        
        final List<PrinterDataModel> printers = new ArrayList<>();
        printers.add(PrinterDataModel);
        printers.addAll(UtilitiesFactory.getSingleton().getPrintersUtility().getAllPrinters());
        
        return printers;
    }
}
