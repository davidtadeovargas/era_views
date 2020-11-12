package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Confgral;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ConfgralTableModel  extends BaseAbstractTableModel {

   public ConfgralTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Confgral Confgral = (Confgral) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getANIO().getValue())==0){
               returnValue = String.valueOf(Confgral.getAnio());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getASUN().getValue())==0){
               returnValue = Confgral.getAsun();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getCLASIF().getValue())==0){
               returnValue = Confgral.getClasif();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getCONF().getValue())==0){
               returnValue = Confgral.getConf();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getDIA().getValue())==0){
               returnValue = String.valueOf(Confgral.getDia());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getENVIA().getValue())==0){
               returnValue = Confgral.getEnvia().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getESTAC().getValue())==0){
               returnValue = Confgral.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getEXTR().getValue())==0){
               returnValue = Confgral.getExtr();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getFALT().getValue())==0){
               returnValue = Confgral.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getFMOD().getValue())==0){
               returnValue = Confgral.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Confgral.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getNUME().getValue())==0){
               returnValue = String.valueOf(Confgral.getNume());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getSUCU().getValue())==0){
               returnValue = Confgral.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConfgralsTableHeader().getVAL().getValue())==0){
               returnValue = String.valueOf(Confgral.getVal());
           }
           return returnValue;
       };
   }
}