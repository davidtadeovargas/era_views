/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels;

import com.era.models.User;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.headers.ColumnTable;
import com.era.views.tables.headers.TableHeaderFactory;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class UsersTableModel extends BaseAbstractTableModel {
    
    public UsersTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header) {
        super(jTable,items,header);
        
        this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {
            
            //Cast the model
            final User User = (User) model;
            
            String returnValue = "";
            if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getNAME().getValue())==0){
                returnValue = String.valueOf(rowIndex + 1);
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCODE().getValue())==0){
                returnValue = User.getCode();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getNAME().getValue())==0){
                returnValue = User.getName();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getTICKETPRINTER().getValue())==0){
                returnValue = User.getTicketPrinter();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getINVOICEPRINTER().getValue())==0){
                returnValue = User.getInvoicePrinter();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCORT().getValue())==0){
                returnValue = User.getCort();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getM52().getValue())==0){
                returnValue = User.isM52()? "Si":"No";            
            }

            return returnValue;
        };
    }
}
