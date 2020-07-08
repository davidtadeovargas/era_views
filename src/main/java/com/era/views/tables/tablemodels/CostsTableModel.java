package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Costs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CostsTableModel  extends BaseAbstractTableModel {

   public CostsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Costs Costs = (Costs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Costs.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getCOST().getValue())==0){
               returnValue = String.valueOf(Costs.getCost());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getESTAC().getValue())==0){
               returnValue = Costs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getFALT().getValue())==0){
               returnValue = Costs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getFMOD().getValue())==0){
               returnValue = Costs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getMONEDAID().getValue())==0){
               returnValue = String.valueOf(Costs.getMonedaID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Costs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getPROD().getValue())==0){
               returnValue = Costs.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getSUCU().getValue())==0){
               returnValue = Costs.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCostssTableHeader().getTIPCAM().getValue())==0){
               returnValue = Costs.getTipcam().toString();
           }
           return returnValue;
       };
   }
}