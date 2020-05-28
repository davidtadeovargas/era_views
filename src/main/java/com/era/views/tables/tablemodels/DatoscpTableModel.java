package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Datoscp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class DatoscpTableModel  extends BaseAbstractTableModel {

   public DatoscpTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Datoscp Datoscp = (Datoscp) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCALLEDESTI().getValue())==0){
               returnValue = Datoscp.getCalledesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCALLEDESTIENT().getValue())==0){
               returnValue = Datoscp.getCalledestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCALLEREM().getValue())==0){
               returnValue = Datoscp.getCallerem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCALLEREMREC().getValue())==0){
               returnValue = Datoscp.getCalleremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCIUDESTI().getValue())==0){
               returnValue = Datoscp.getCiudesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCIUDESTIENT().getValue())==0){
               returnValue = Datoscp.getCiudestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCIUREM().getValue())==0){
               returnValue = Datoscp.getCiurem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCIUREMREC().getValue())==0){
               returnValue = Datoscp.getCiuremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCOLDESTI().getValue())==0){
               returnValue = Datoscp.getColdesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCOLDESTIENT().getValue())==0){
               returnValue = Datoscp.getColdestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCOLREM().getValue())==0){
               returnValue = Datoscp.getColrem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCOLREMREC().getValue())==0){
               returnValue = Datoscp.getColremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCPDESTI().getValue())==0){
               returnValue = Datoscp.getCpdesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCPDESTIENT().getValue())==0){
               returnValue = Datoscp.getCpdestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCPREM().getValue())==0){
               returnValue = Datoscp.getCprem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getCPREMREC().getValue())==0){
               returnValue = Datoscp.getCpremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getDESTI().getValue())==0){
               returnValue = Datoscp.getDesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getESTAC().getValue())==0){
               returnValue = Datoscp.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getESTADDESTI().getValue())==0){
               returnValue = Datoscp.getEstaddesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getESTADDESTIENT().getValue())==0){
               returnValue = Datoscp.getEstaddestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getESTADREM().getValue())==0){
               returnValue = Datoscp.getEstadrem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getESTADREMREC().getValue())==0){
               returnValue = Datoscp.getEstadremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getFALT().getValue())==0){
               returnValue = Datoscp.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getFENT().getValue())==0){
               returnValue = Datoscp.getFent().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getFMOD().getValue())==0){
               returnValue = Datoscp.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Datoscp.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOEXTDESTI().getValue())==0){
               returnValue = Datoscp.getNoextdesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOEXTDESTIENT().getValue())==0){
               returnValue = Datoscp.getNoextdestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOEXTREM().getValue())==0){
               returnValue = Datoscp.getNoextrem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOEXTREMREC().getValue())==0){
               returnValue = Datoscp.getNoextremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOINTDESTI().getValue())==0){
               returnValue = Datoscp.getNointdesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOINTDESTIENT().getValue())==0){
               returnValue = Datoscp.getNointdestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOINTREM().getValue())==0){
               returnValue = Datoscp.getNointrem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOINTREMREC().getValue())==0){
               returnValue = Datoscp.getNointremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getNOMBRETRANS().getValue())==0){
               returnValue = Datoscp.getNombretrans();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getPAISDESTI().getValue())==0){
               returnValue = Datoscp.getPaisdesti();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getPAISDESTIENT().getValue())==0){
               returnValue = Datoscp.getPaisdestient();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getPAISREM().getValue())==0){
               returnValue = Datoscp.getPaisrem();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getPAISREMREC().getValue())==0){
               returnValue = Datoscp.getPaisremrec();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getPLACAS().getValue())==0){
               returnValue = Datoscp.getPlacas();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getREMITENTE().getValue())==0){
               returnValue = Datoscp.getRemitente();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getRFC().getValue())==0){
               returnValue = Datoscp.getRfc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getSUCU().getValue())==0){
               returnValue = Datoscp.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getVEHICULO().getValue())==0){
               returnValue = Datoscp.getVehiculo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDatoscpsTableHeader().getVTA().getValue())==0){
               returnValue = String.valueOf(Datoscp.getVta());
           }
           return returnValue;
       };
   }
}