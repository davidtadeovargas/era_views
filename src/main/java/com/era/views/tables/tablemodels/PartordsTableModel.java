package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Partords;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class PartordsTableModel  extends BaseAbstractTableModel {

   public PartordsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Partords Partords = (Partords) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getALMA().getValue())==0){
               returnValue = Partords.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Partords.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getCODCOT().getValue())==0){
               returnValue = Partords.getCodcot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getCODORD().getValue())==0){
               returnValue = Partords.getCodord();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getDESCAD().getValue())==0){
               returnValue = String.valueOf(Partords.getDescad());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Partords.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getDESCU().getValue())==0){
               returnValue = String.valueOf(Partords.getDescu());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getESTAC().getValue())==0){
               returnValue = Partords.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getFALT().getValue())==0){
               returnValue = Partords.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getFENT().getValue())==0){
               returnValue = Partords.getFent().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getFMOD().getValue())==0){
               returnValue = Partords.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getIMPO().getValue())==0){
               returnValue = String.valueOf(Partords.getImpo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getIMPOIMPUE().getValue())==0){
               returnValue = String.valueOf(Partords.getImpoimpue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getIMPUE().getValue())==0){
               returnValue = Partords.getImpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getIMPUEVAL().getValue())==0){
               returnValue = String.valueOf(Partords.getImpueval());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getMON().getValue())==0){
               returnValue = Partords.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Partords.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getPROD().getValue())==0){
               returnValue = Partords.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getSUCU().getValue())==0){
               returnValue = Partords.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getULTCOST().getValue())==0){
               returnValue = String.valueOf(Partords.getUltcost());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartordssTableHeader().getUNID().getValue())==0){
               returnValue = Partords.getUnid();
           }
           return returnValue;
       };
   }
}