package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.DocumentOrigin;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class DocumentOriginTableModel  extends BaseAbstractTableModel {

   public DocumentOriginTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final DocumentOrigin DocumentOrigin = (DocumentOrigin) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getESTAC().getValue())==0){
               returnValue = DocumentOrigin.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getFALT().getValue())==0){
               returnValue = DocumentOrigin.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getFMOD().getValue())==0){
               returnValue = DocumentOrigin.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getNAME().getValue())==0){
               returnValue = DocumentOrigin.getName();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getNOCAJ().getValue())==0){
               returnValue = DocumentOrigin.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getSUCU().getValue())==0){
               returnValue = DocumentOrigin.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentOriginsTableHeader().getTYPE().getValue())==0){
               returnValue = DocumentOrigin.getType();
           }
           return returnValue;
       };
   }
}