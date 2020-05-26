package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.DocumentosContabilizados;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class DocumentosContabilizadosTableModel  extends BaseAbstractTableModel {

   public DocumentosContabilizadosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final DocumentosContabilizados DocumentosContabilizados = (DocumentosContabilizados) model;
           return null;

       };
    }

}