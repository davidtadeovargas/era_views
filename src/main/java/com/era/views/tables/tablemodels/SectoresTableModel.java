package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.tablemodels.GetValueAts.SectoresTableModelGetValueAt;
import javax.swing.JTable;

public class SectoresTableModel  extends BaseAbstractTableModel {

   public SectoresTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {
           return new SectoresTableModelGetValueAt().GetValueAt(rowIndex, columnIndex, valueColumn, model);
       };
   }
}