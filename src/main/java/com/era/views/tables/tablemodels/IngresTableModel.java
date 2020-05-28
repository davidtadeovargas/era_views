package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Ingres;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class IngresTableModel  extends BaseAbstractTableModel {

   public IngresTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Ingres Ingres = (Ingres) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getACTIVO().getValue())==0){
               returnValue = Ingres.getActivo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getALMA().getValue())==0){
               returnValue = Ingres.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getCADUCIDAD().getValue())==0){
               returnValue = Ingres.getCaducidad().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Ingres.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getCANTSAL().getValue())==0){
               returnValue = Ingres.getCantsal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getCONCEP().getValue())==0){
               returnValue = Ingres.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getCOSTO().getValue())==0){
               returnValue = Ingres.getCosto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getENTSAL().getValue())==0){
               returnValue = Ingres.isEntsal()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getESTAC().getValue())==0){
               returnValue = Ingres.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getFALT().getValue())==0){
               returnValue = Ingres.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getFMOD().getValue())==0){
               returnValue = Ingres.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getIDINGRESCAB().getValue())==0){
               returnValue = String.valueOf(Ingres.getIdIngresCab());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getLOTE().getValue())==0){
               returnValue = Ingres.getLote();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getNOCAJ().getValue())==0){
               returnValue = Ingres.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getPEDIMENTO().getValue())==0){
               returnValue = Ingres.getPedimento();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getPROD().getValue())==0){
               returnValue = Ingres.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getSUCU().getValue())==0){
               returnValue = Ingres.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getTIPCAMNAC().getValue())==0){
               returnValue = Ingres.getTipcamnac().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getIngressTableHeader().getUNID().getValue())==0){
               returnValue = Ingres.getUnid();
           }
           return returnValue;
       };
   }
}