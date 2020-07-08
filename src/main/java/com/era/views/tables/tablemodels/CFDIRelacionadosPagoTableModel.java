package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CFDIRelacionadosPago;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CFDIRelacionadosPagoTableModel  extends BaseAbstractTableModel {

   public CFDIRelacionadosPagoTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CFDIRelacionadosPago CFDIRelacionadosPago = (CFDIRelacionadosPago) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getESTAC().getValue())==0){
               returnValue = CFDIRelacionadosPago.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getFALT().getValue())==0){
               returnValue = CFDIRelacionadosPago.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getFMOD().getValue())==0){
               returnValue = CFDIRelacionadosPago.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getNOCAJ().getValue())==0){
               returnValue = CFDIRelacionadosPago.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getSUCU().getValue())==0){
               returnValue = CFDIRelacionadosPago.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getTIPO_RELACION().getValue())==0){
               returnValue = CFDIRelacionadosPago.getTipo_relacion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCFDIRelacionadosPagosTableHeader().getUUID().getValue())==0){
               returnValue = CFDIRelacionadosPago.getUuid();
           }
           return returnValue;
       };
   }
}