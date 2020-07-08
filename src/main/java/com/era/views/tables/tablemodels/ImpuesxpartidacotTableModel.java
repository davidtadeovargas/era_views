package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Impuesxpartidacot;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ImpuesxpartidacotTableModel  extends BaseAbstractTableModel {

   public ImpuesxpartidacotTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Impuesxpartidacot Impuesxpartidacot = (Impuesxpartidacot) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getCODIGOIMPUESTO().getValue())==0){
               returnValue = Impuesxpartidacot.getCodigoImpuesto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getESTAC().getValue())==0){
               returnValue = Impuesxpartidacot.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getFALT().getValue())==0){
               returnValue = Impuesxpartidacot.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getFMOD().getValue())==0){
               returnValue = Impuesxpartidacot.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getIDPARTIDA().getValue())==0){
               returnValue = String.valueOf(Impuesxpartidacot.getIdPartida());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getIDPARTS().getValue())==0){
               returnValue = String.valueOf(Impuesxpartidacot.getIdParts());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Impuesxpartidacot.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getRET_TRAS().getValue())==0){
               returnValue = Impuesxpartidacot.getRet_tras();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getRETENCION().getValue())==0){
               returnValue = String.valueOf(Impuesxpartidacot.getRetencion());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getSUCU().getValue())==0){
               returnValue = Impuesxpartidacot.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getTASA().getValue())==0){
               returnValue = Impuesxpartidacot.getTasa().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidacotsTableHeader().getTOTAL().getValue())==0){
               returnValue = Impuesxpartidacot.getTotal().toString();
           }
           return returnValue;
       };
   }
}