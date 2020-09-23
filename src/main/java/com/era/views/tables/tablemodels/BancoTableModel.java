package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Banco;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class BancoTableModel  extends BaseAbstractTableModel {

   public BancoTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Banco Banco = (Banco) model;

            String returnValue = "";
            if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBanksTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getCUENTABANCO().getValue())==0){
               returnValue = Banco.getCuentabanco();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getBANCO().getValue())==0){
               returnValue = Banco.getBanco();
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getDESCRIP().getValue())==0){
               returnValue = Banco.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getESTAC().getValue())==0){
               returnValue = Banco.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getFALT().getValue())==0){
               returnValue = Banco.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getFMOD().getValue())==0){
               returnValue = Banco.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getNOCAJ().getValue())==0){
               returnValue = Banco.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getSUCU().getValue())==0){
               returnValue = Banco.getSucu();
           }
                      
           return returnValue;
       };
   }
}