package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CUsoCFDI;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CUsoCFDITableModel  extends BaseAbstractTableModel {

   public CUsoCFDITableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CUsoCFDI CUsoCFDI = (CUsoCFDI) model;
           return null;

       };
    }

}