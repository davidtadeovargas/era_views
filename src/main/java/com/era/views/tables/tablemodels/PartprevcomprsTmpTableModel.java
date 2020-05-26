package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.PartprevcomprsTmp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PartprevcomprsTmpTableModel  extends BaseAbstractTableModel {

   public PartprevcomprsTmpTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final PartprevcomprsTmp PartprevcomprsTmp = (PartprevcomprsTmp) model;
           return null;

       };
    }

}