package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Impuesxpartidaped;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ImpuesxpartidapedTableModel  extends BaseAbstractTableModel {

   public ImpuesxpartidapedTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Impuesxpartidaped Impuesxpartidaped = (Impuesxpartidaped) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getCODIGOIMPUESTO().getValue())==0){
               returnValue = Impuesxpartidaped.getCodigoImpuesto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getESTAC().getValue())==0){
               returnValue = Impuesxpartidaped.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getFALT().getValue())==0){
               returnValue = Impuesxpartidaped.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getFMOD().getValue())==0){
               returnValue = Impuesxpartidaped.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getIDPARTIDA().getValue())==0){
               returnValue = String.valueOf(Impuesxpartidaped.getIdPartida());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getIDPARTS().getValue())==0){
               returnValue = String.valueOf(Impuesxpartidaped.getIdParts());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Impuesxpartidaped.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getRET_TRAS().getValue())==0){
               returnValue = Impuesxpartidaped.getRet_tras();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getRETENCION().getValue())==0){
               returnValue = String.valueOf(Impuesxpartidaped.getRetencion());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getSUCU().getValue())==0){
               returnValue = Impuesxpartidaped.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getTASA().getValue())==0){
               returnValue = Impuesxpartidaped.getTasa().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesxpartidapedsTableHeader().getTOTAL().getValue())==0){
               returnValue = Impuesxpartidaped.getTotal().toString();
           }
           return returnValue;
       };
   }
}