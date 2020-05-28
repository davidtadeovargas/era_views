package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.DocumentosContabilizados;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class DocumentosContabilizadosTableModel  extends BaseAbstractTableModel {

   public DocumentosContabilizadosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final DocumentosContabilizados DocumentosContabilizados = (DocumentosContabilizados) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getDOCUMENTO_ID().getValue())==0){
               returnValue = DocumentosContabilizados.getDocumento_id();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getESTAC().getValue())==0){
               returnValue = DocumentosContabilizados.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getFALT().getValue())==0){
               returnValue = DocumentosContabilizados.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getFECHA_POLIZA().getValue())==0){
               returnValue = DocumentosContabilizados.getFecha_poliza().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getFMOD().getValue())==0){
               returnValue = DocumentosContabilizados.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getFOLIO().getValue())==0){
               returnValue = DocumentosContabilizados.getFolio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getNOCAJ().getValue())==0){
               returnValue = DocumentosContabilizados.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getNUMERO_POLIZA().getValue())==0){
               returnValue = String.valueOf(DocumentosContabilizados.getNumero_poliza());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getSERIE().getValue())==0){
               returnValue = DocumentosContabilizados.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getSUCU().getValue())==0){
               returnValue = DocumentosContabilizados.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getTIPO_DOCUMENTO().getValue())==0){
               returnValue = DocumentosContabilizados.getTipo_documento();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosContabilizadossTableHeader().getTIPO_POLIZA().getValue())==0){
               returnValue = DocumentosContabilizados.getTipo_poliza();
           }
           return returnValue;
       };
   }
}