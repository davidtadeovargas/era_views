package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Maxminconf;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class MaxminconfTableModel  extends BaseAbstractTableModel {

   public MaxminconfTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Maxminconf Maxminconf = (Maxminconf) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getESTAC().getValue())==0){
               returnValue = Maxminconf.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getESTACGLO().getValue())==0){
               returnValue = Maxminconf.getEstacglo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getFALT().getValue())==0){
               returnValue = Maxminconf.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getFMOD().getValue())==0){
               returnValue = Maxminconf.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getHRS().getValue())==0){
               returnValue = String.valueOf(Maxminconf.getHrs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Maxminconf.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMaxminconfsTableHeader().getSUCU().getValue())==0){
               returnValue = Maxminconf.getSucu();
           }
           return returnValue;
       };
   }
}