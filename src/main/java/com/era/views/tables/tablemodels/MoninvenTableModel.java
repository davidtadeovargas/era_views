package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Moninven;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class MoninvenTableModel  extends BaseAbstractTableModel {

   public MoninvenTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Moninven Moninven = (Moninven) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getALMA().getValue())==0){
               returnValue = Moninven.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Moninven.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getCONCEP().getValue())==0){
               returnValue = Moninven.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getDESCRIP().getValue())==0){
               returnValue = Moninven.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getEMP().getValue())==0){
               returnValue = Moninven.getEmp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getENTSAL().getValue())==0){
               returnValue = Moninven.isEntsal()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getESTAC().getValue())==0){
               returnValue = Moninven.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getEXISTENCIAINICIAL().getValue())==0){
               returnValue = Moninven.getExistenciainicial().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getFALT().getValue())==0){
               returnValue = Moninven.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getFMOD().getValue())==0){
               returnValue = Moninven.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getNOCAJ().getValue())==0){
               returnValue = Moninven.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getNODOC().getValue())==0){
               returnValue = Moninven.getNodoc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getNOSER().getValue())==0){
               returnValue = Moninven.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getPROD().getValue())==0){
               returnValue = Moninven.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getSUCU().getValue())==0){
               returnValue = Moninven.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMoninvensTableHeader().getUNID().getValue())==0){
               returnValue = Moninven.getUnid();
           }
           return returnValue;
       };
   }
}