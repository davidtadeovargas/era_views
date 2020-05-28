package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Actfijcat;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ActfijcatTableModel  extends BaseAbstractTableModel {

   public ActfijcatTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Actfijcat Actfijcat = (Actfijcat) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getCONCEP().getValue())==0){
               returnValue = Actfijcat.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Actfijcat.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getESTAC().getValue())==0){
               returnValue = Actfijcat.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getFALT().getValue())==0){
               returnValue = Actfijcat.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getFMOD().getValue())==0){
               returnValue = Actfijcat.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Actfijcat.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijcatsTableHeader().getSUCU().getValue())==0){
               returnValue = Actfijcat.getSucu();
           }
           return returnValue;
       };
   }
}