package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Actfij;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ActfijTableModel  extends BaseAbstractTableModel {

   public ActfijTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Actfij Actfij = (Actfij) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getALMA().getValue())==0){
               returnValue = Actfij.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getBAJ().getValue())==0){
               returnValue = Actfij.isBaj()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getCOMEN().getValue())==0){
               returnValue = Actfij.getComen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getCOST().getValue())==0){
               returnValue = String.valueOf(Actfij.getCost());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getCOSTSAL().getValue())==0){
               returnValue = String.valueOf(Actfij.getCostsal());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getCTADEDU().getValue())==0){
               returnValue = Actfij.getCtadedu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getCTADEPRE().getValue())==0){
               returnValue = Actfij.getCtadepre();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getCTAGAST().getValue())==0){
               returnValue = Actfij.getCtagast();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Actfij.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getESTAC().getValue())==0){
               returnValue = Actfij.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getESTADUSR().getValue())==0){
               returnValue = Actfij.getEstadusr();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getEXPORTCONTA().getValue())==0){
               returnValue = Actfij.isExportconta()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFADQUISREAL().getValue())==0){
               returnValue = Actfij.getFadquisreal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFADQUISUSR().getValue())==0){
               returnValue = Actfij.getFadquisusr().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFALT().getValue())==0){
               returnValue = Actfij.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFBAJ().getValue())==0){
               returnValue = Actfij.getFbaj().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFBAJDEP().getValue())==0){
               returnValue = Actfij.getFbajdep().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFFINDEP().getValue())==0){
               returnValue = Actfij.getFfindep().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFINIDEP().getValue())==0){
               returnValue = Actfij.getFinidep().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getFMOD().getValue())==0){
               returnValue = Actfij.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getLUG().getValue())==0){
               returnValue = Actfij.getLug();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Actfij.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getPORCENDEDU().getValue())==0){
               returnValue = String.valueOf(Actfij.getPorcendedu());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getPORCENDEP().getValue())==0){
               returnValue = String.valueOf(Actfij.getPorcendep());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getPROD().getValue())==0){
               returnValue = Actfij.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getSAL().getValue())==0){
               returnValue = Actfij.isSal()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getSERPROD().getValue())==0){
               returnValue = Actfij.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getSUCU().getValue())==0){
               returnValue = Actfij.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getTIPACT().getValue())==0){
               returnValue = Actfij.getTipact();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getTOTACUMES().getValue())==0){
               returnValue = String.valueOf(Actfij.getTotacumes());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getTOTESTADBAJ().getValue())==0){
               returnValue = Actfij.getTotestadbaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getTOTMESBAJ().getValue())==0){
               returnValue = String.valueOf(Actfij.getTotmesbaj());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActfijsTableHeader().getTOTVALACTBAJ().getValue())==0){
               returnValue = String.valueOf(Actfij.getTotvalactbaj());
           }
           return returnValue;
       };
   }
}