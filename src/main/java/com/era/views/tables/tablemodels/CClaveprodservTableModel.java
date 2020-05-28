package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CClaveprodserv;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CClaveprodservTableModel  extends BaseAbstractTableModel {

   public CClaveprodservTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CClaveprodserv CClaveprodserv = (CClaveprodserv) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getC_CLAVEPRODSERV().getValue())==0){
               returnValue = CClaveprodserv.getC_ClaveProdServ();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CClaveprodserv.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getENDVIGENCYDATE().getValue())==0){
               returnValue = CClaveprodserv.getEndVigencyDate().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getESTAC().getValue())==0){
               returnValue = CClaveprodserv.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getFALT().getValue())==0){
               returnValue = CClaveprodserv.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getFMOD().getValue())==0){
               returnValue = CClaveprodserv.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getINITVIGENCYDATE().getValue())==0){
               returnValue = CClaveprodserv.getInitVigencyDate().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CClaveprodserv.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getSUCU().getValue())==0){
               returnValue = CClaveprodserv.getSucu();
           }
           return returnValue;
       };
   }
}