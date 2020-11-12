package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CorreoTerminal;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CorreoTerminalTableModel  extends BaseAbstractTableModel {

   public CorreoTerminalTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CorreoTerminal CorreoTerminal = (CorreoTerminal) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getCONTRA().getValue())==0){
               returnValue = CorreoTerminal.getContra();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getCORREO().getValue())==0){
               returnValue = CorreoTerminal.getCorreo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getCORREOA().getValue())==0){
               returnValue = CorreoTerminal.getCorreoA();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getDIRECCIONSERVER().getValue())==0){
               returnValue = CorreoTerminal.getDireccionserver();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getESTAC().getValue())==0){
               returnValue = CorreoTerminal.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getFALT().getValue())==0){
               returnValue = CorreoTerminal.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getFMOD().getValue())==0){
               returnValue = CorreoTerminal.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getINGRESOCORREO().getValue())==0){
               returnValue = String.valueOf(CorreoTerminal.getIngresocorreo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getMUESTRACOMO().getValue())==0){
               returnValue = CorreoTerminal.getMuestracomo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CorreoTerminal.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getPUERTO().getValue())==0){
               returnValue = String.valueOf(CorreoTerminal.getPuerto());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorreoTerminalsTableHeader().getSUCU().getValue())==0){
               returnValue = CorreoTerminal.getSucu();
           }
           return returnValue;
       };
   }
}