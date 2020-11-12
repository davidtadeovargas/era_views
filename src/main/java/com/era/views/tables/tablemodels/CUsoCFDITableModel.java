package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CUsoCFDI;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CUsoCFDITableModel  extends BaseAbstractTableModel {

   public CUsoCFDITableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CUsoCFDI CUsoCFDI = (CUsoCFDI) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getFECHA_INICIO_DE_VIGENCIA().getValue())==0){
               returnValue = CUsoCFDI.getFecha_inicio_de_vigencia().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getPERSONA_FISICA().getValue())==0){
               returnValue = CUsoCFDI.isPersona_Fisica()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getPERSONA_MORAL().getValue())==0){
               returnValue = CUsoCFDI.isPersona_Moral()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getCODE().getValue())==0){
               returnValue = CUsoCFDI.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CUsoCFDI.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getESTAC().getValue())==0){
               returnValue = CUsoCFDI.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getFALT().getValue())==0){
               returnValue = CUsoCFDI.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getFMOD().getValue())==0){
               returnValue = CUsoCFDI.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CUsoCFDI.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCUsoCFDIsTableHeader().getSUCU().getValue())==0){
               returnValue = CUsoCFDI.getSucu();
           }
           return returnValue;
       };
   }
}