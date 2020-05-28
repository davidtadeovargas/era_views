package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Asocdesc;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class AsocdescTableModel  extends BaseAbstractTableModel {

   public AsocdescTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Asocdesc Asocdesc = (Asocdesc) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getCLAS().getValue())==0){
               returnValue = Asocdesc.getClas();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getCLASJERA().getValue())==0){
               returnValue = Asocdesc.getClasjera();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getCLIEN().getValue())==0){
               returnValue = Asocdesc.getClien();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getESTAC().getValue())==0){
               returnValue = Asocdesc.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getFALT().getValue())==0){
               returnValue = Asocdesc.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getFMOD().getValue())==0){
               returnValue = Asocdesc.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getLIST().getValue())==0){
               returnValue = String.valueOf(Asocdesc.getList());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Asocdesc.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getPREC().getValue())==0){
               returnValue = String.valueOf(Asocdesc.getPrec());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getPROD().getValue())==0){
               returnValue = Asocdesc.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getSUCU().getValue())==0){
               returnValue = Asocdesc.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getUSAR().getValue())==0){
               returnValue = Asocdesc.getUsar();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsocdescsTableHeader().getUTIL().getValue())==0){
               returnValue = String.valueOf(Asocdesc.getUtil());
           }
           return returnValue;
       };
   }
}