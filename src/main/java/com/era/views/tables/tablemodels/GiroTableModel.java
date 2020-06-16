package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.tablemodels.GetValueAts.GiroTableModelGetValueAt;

public class GiroTableModel  extends BaseAbstractTableModel {

   public GiroTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {
           return new GiroTableModelGetValueAt().GetValueAt(rowIndex, columnIndex, valueColumn, model);
       };
   }
}