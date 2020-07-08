package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CTipoComprobante;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CTipoComprobanteTableModel  extends BaseAbstractTableModel {

   public CTipoComprobanteTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CTipoComprobante CTipoComprobante = (CTipoComprobante) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getFECHA_INICIO_DE_VIGENCIA().getValue())==0){
               returnValue = CTipoComprobante.getFecha_inicio_de_vigencia().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getVALOR_MAXIMO().getValue())==0){
               returnValue = CTipoComprobante.getValor_maximo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getCODE().getValue())==0){
               returnValue = CTipoComprobante.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CTipoComprobante.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getESTAC().getValue())==0){
               returnValue = CTipoComprobante.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getFALT().getValue())==0){
               returnValue = CTipoComprobante.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getFMOD().getValue())==0){
               returnValue = CTipoComprobante.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getNOCAJ().getValue())==0){
               returnValue = CTipoComprobante.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoComprobantesTableHeader().getSUCU().getValue())==0){
               returnValue = CTipoComprobante.getSucu();
           }
           return returnValue;
       };
   }
}