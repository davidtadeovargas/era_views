package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ServerSession;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ServerSessionTableModel  extends BaseAbstractTableModel {

   public ServerSessionTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ServerSession ServerSession = (ServerSession) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getServerSessionsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getServerSessionsTableHeader().getCODE().getValue())==0){
               returnValue = ServerSession.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getServerSessionsTableHeader().getESTAC().getValue())==0){
               returnValue = ServerSession.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getServerSessionsTableHeader().getFALT().getValue())==0){
               returnValue = ServerSession.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getServerSessionsTableHeader().getFMOD().getValue())==0){
               returnValue = ServerSession.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getServerSessionsTableHeader().getNOCAJ().getValue())==0){
               returnValue = ServerSession.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getServerSessionsTableHeader().getSUCU().getValue())==0){
               returnValue = ServerSession.getSucu();
           }
           return returnValue;
       };
   }
}