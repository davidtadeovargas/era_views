package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.PushNotification;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class PushNotificationTableModel  extends BaseAbstractTableModel {

   public PushNotificationTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final PushNotification PushNotification = (PushNotification) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getBANNERACTION().getValue())==0){
               returnValue = PushNotification.getBannerAction();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getCREATED().getValue())==0){
               returnValue = PushNotification.getCreated().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getESTAC().getValue())==0){
               returnValue = PushNotification.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getFALT().getValue())==0){
               returnValue = PushNotification.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getFMOD().getValue())==0){
               returnValue = PushNotification.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getMESSAGE().getValue())==0){
               returnValue = PushNotification.getMessage();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getNOCAJ().getValue())==0){
               returnValue = PushNotification.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getSUCU().getValue())==0){
               returnValue = PushNotification.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPushNotificationsTableHeader().getURLBANNER().getValue())==0){
               returnValue = PushNotification.getUrlBanner();
           }
           return returnValue;
       };
   }
}