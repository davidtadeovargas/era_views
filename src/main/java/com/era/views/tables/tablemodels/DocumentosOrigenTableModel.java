package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.DocumentosOrigen;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class DocumentosOrigenTableModel  extends BaseAbstractTableModel {

   public DocumentosOrigenTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final DocumentosOrigen DocumentosOrigen = (DocumentosOrigen) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getESTAC().getValue())==0){
               returnValue = DocumentosOrigen.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getFALT().getValue())==0){
               returnValue = DocumentosOrigen.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getFMOD().getValue())==0){
               returnValue = DocumentosOrigen.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getNOCAJ().getValue())==0){
               returnValue = DocumentosOrigen.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getNOMBRE().getValue())==0){
               returnValue = DocumentosOrigen.getNombre();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getSUCU().getValue())==0){
               returnValue = DocumentosOrigen.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosOrigensTableHeader().getTIPO().getValue())==0){
               returnValue = DocumentosOrigen.getTipo();
           }
           return returnValue;
       };
   }
}