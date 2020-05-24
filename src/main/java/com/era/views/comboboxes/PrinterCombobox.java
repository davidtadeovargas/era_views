/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.datamodels.PrinterDataModel;
import com.era.utilities.UtilitiesFactory;
import java.util.List;

/**
 *
 * @author PC
 */
public class PrinterCombobox extends BaseComboBox<PrinterDataModel> {

    @Override
    List<PrinterDataModel> getItems() {        
        final List<PrinterDataModel> printers = UtilitiesFactory.getSingleton().getPrintersUtility().getAllPrinters();
        return printers;
    }
}
