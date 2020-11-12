package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.MovimientosAsientos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class MovimientosAsientosTableModel  extends BaseAbstractTableModel {

   public MovimientosAsientosTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final MovimientosAsientos MovimientosAsientos = (MovimientosAsientos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getCONCENTRADO().getValue())==0){
               returnValue = MovimientosAsientos.isConcentrado()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getCONCEPTO().getValue())==0){
               returnValue = MovimientosAsientos.getConcepto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getCUENTA().getValue())==0){
               returnValue = MovimientosAsientos.getCuenta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getESTAC().getValue())==0){
               returnValue = MovimientosAsientos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getFALT().getValue())==0){
               returnValue = MovimientosAsientos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getFMOD().getValue())==0){
               returnValue = MovimientosAsientos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getIDASIENTO().getValue())==0){
               returnValue = String.valueOf(MovimientosAsientos.getIdAsiento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getIMPORTE().getValue())==0){
               returnValue = MovimientosAsientos.getImporte();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getNOCAJ().getValue())==0){
               returnValue = MovimientosAsientos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getNUMEROMOVIMIENTO().getValue())==0){
               returnValue = String.valueOf(MovimientosAsientos.getNumeroMovimiento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getPORCENTAJE().getValue())==0){
               returnValue = MovimientosAsientos.getPorcentaje().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getREFERENCIA().getValue())==0){
               returnValue = MovimientosAsientos.getReferencia();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getSEGMENTO_NEGOCIO().getValue())==0){
               returnValue = MovimientosAsientos.getSegmento_negocio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getSUCU().getValue())==0){
               returnValue = MovimientosAsientos.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosAsientossTableHeader().getTIPO().getValue())==0){
               returnValue = MovimientosAsientos.getTipo();
           }
           return returnValue;
       };
   }
}