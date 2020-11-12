package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.IngresosEncab;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class IngresosEncabTableModel  extends BaseAbstractTableModel {

   public IngresosEncabTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final IngresosEncab IngresosEncab = (IngresosEncab) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getALMA().getValue())==0){
               returnValue = IngresosEncab.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getCADUCIDAD().getValue())==0){
               returnValue = IngresosEncab.getCaducidad().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getCANTTOTAL().getValue())==0){
               returnValue = IngresosEncab.getCanttotal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getCONCEP().getValue())==0){
               returnValue = IngresosEncab.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getENTSAL().getValue())==0){
               returnValue = IngresosEncab.isEntsal()? "Salida":"Entrada";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getESTAC().getValue())==0){
               returnValue = IngresosEncab.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getFALT().getValue())==0){
               returnValue = IngresosEncab.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getFMOD().getValue())==0){
               returnValue = IngresosEncab.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getLOTE().getValue())==0){
               returnValue = IngresosEncab.getLote();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getNOCAJ().getValue())==0){
               returnValue = IngresosEncab.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getNOREFER().getValue())==0){
               returnValue = IngresosEncab.getNorefer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getNOSER().getValue())==0){
               returnValue = IngresosEncab.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getPEDIMENTO().getValue())==0){
               returnValue = IngresosEncab.getPedimento();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngresosEncabsTableHeader().getSUCU().getValue())==0){
               returnValue = IngresosEncab.getSucu();
           }
           return returnValue;
       };
   }
}