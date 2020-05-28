package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tars;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class TarsTableModel  extends BaseAbstractTableModel {

   public TarsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tars Tars = (Tars) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getCLI().getValue())==0){
               returnValue = Tars.getCli();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getESTAC().getValue())==0){
               returnValue = Tars.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getEXTER().getValue())==0){
               returnValue = Tars.isExter()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getFACTUR().getValue())==0){
               returnValue = Tars.isFactur()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getFACTUYA().getValue())==0){
               returnValue = Tars.isFactuya()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getFALT().getValue())==0){
               returnValue = Tars.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getFFACTU().getValue())==0){
               returnValue = Tars.getFfactu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getFMOD().getValue())==0){
               returnValue = Tars.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getLOC().getValue())==0){
               returnValue = Tars.isLoc()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Tars.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getPAG().getValue())==0){
               returnValue = Tars.isPag()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getPREPAG().getValue())==0){
               returnValue = Tars.isPrepag()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getSUCU().getValue())==0){
               returnValue = Tars.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getTAR().getValue())==0){
               returnValue = String.valueOf(Tars.getTar());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getTARIF().getValue())==0){
               returnValue = String.valueOf(Tars.getTarif());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTarssTableHeader().getVTA().getValue())==0){
               returnValue = String.valueOf(Tars.getVta());
           }
           return returnValue;
       };
   }
}