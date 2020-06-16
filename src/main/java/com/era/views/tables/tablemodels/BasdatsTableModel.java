package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.tablemodels.GetValueAts.BasDatsTableModelIGetValueAt;

public class BasDatsTableModel  extends BaseAbstractTableModel {

   public BasDatsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {
           return new BasDatsTableModelIGetValueAt().GetValueAt(rowIndex, columnIndex, valueColumn, model);
       };
   }
}