package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Garan;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class GaranTableModel  extends BaseAbstractTableModel {

   public GaranTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Garan Garan = (Garan) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getDESCRIP().getValue())==0){
               returnValue = Garan.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getESTAC().getValue())==0){
               returnValue = Garan.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getFALT().getValue())==0){
               returnValue = Garan.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getFMOD().getValue())==0){
               returnValue = Garan.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getGARA().getValue())==0){
               returnValue = Garan.getGara();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getNOCAJ().getValue())==0){
               returnValue = Garan.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGaransTableHeader().getSUCU().getValue())==0){
               returnValue = Garan.getSucu();
           }
           return returnValue;
       };
   }
}