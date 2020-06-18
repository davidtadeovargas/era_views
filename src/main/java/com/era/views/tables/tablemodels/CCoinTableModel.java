package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.tablemodels.GetValueAts.CCoinsTableModelGetValueAt;

public class CCoinTableModel  extends BaseAbstractTableModel {

   public CCoinTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {
           return new CCoinsTableModelGetValueAt().GetValueAt(rowIndex, columnIndex, valueColumn, model);
       };
   }
}