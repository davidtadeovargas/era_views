package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Fluj;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class FlujTableModel  extends BaseAbstractTableModel {

   public FlujTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Fluj Fluj = (Fluj) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getCONCEP().getValue())==0){
               returnValue = Fluj.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getCORTA().getValue())==0){
               returnValue = String.valueOf(Fluj.getCorta());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getESTAC().getValue())==0){
               returnValue = Fluj.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getFALT().getValue())==0){
               returnValue = Fluj.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getFMOD().getValue())==0){
               returnValue = Fluj.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getIMPO().getValue())==0){
               returnValue = String.valueOf(Fluj.getImpo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getING_EG().getValue())==0){
               returnValue = Fluj.getIng_eg();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getMODD().getValue())==0){
               returnValue = Fluj.getModd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getMON().getValue())==0){
               returnValue = Fluj.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getNCORTZ().getValue())==0){
               returnValue = String.valueOf(Fluj.getNcortz());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Fluj.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getNOREFER().getValue())==0){
               returnValue = Fluj.getNorefer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getSUCU().getValue())==0){
               returnValue = Fluj.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getTIPDOC().getValue())==0){
               returnValue = Fluj.getTipdoc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujsTableHeader().getVTA().getValue())==0){
               returnValue = String.valueOf(Fluj.getVta());
           }
           return returnValue;
       };
   }
}