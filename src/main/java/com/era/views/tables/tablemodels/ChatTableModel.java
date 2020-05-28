package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Chat;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ChatTableModel  extends BaseAbstractTableModel {

   public ChatTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Chat Chat = (Chat) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getESTAC().getValue())==0){
               returnValue = Chat.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getESTACDESTIN().getValue())==0){
               returnValue = Chat.getEstacdestin();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getFALT().getValue())==0){
               returnValue = Chat.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getFMOD().getValue())==0){
               returnValue = Chat.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getMSJ().getValue())==0){
               returnValue = Chat.getMsj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Chat.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getSUCU().getValue())==0){
               returnValue = Chat.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getChatsTableHeader().getVIST().getValue())==0){
               returnValue = Chat.getVist();
           }
           return returnValue;
       };
   }
}