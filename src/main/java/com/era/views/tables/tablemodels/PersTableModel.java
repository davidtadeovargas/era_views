package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Pers;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class PersTableModel  extends BaseAbstractTableModel {

   public PersTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Pers Pers = (Pers) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getCP().getValue())==0){
               returnValue = Pers.getCP();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getACT().getValue())==0){
               returnValue = Pers.isAct()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getCALLE().getValue())==0){
               returnValue = Pers.getCalle();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getCEL1().getValue())==0){
               returnValue = Pers.getCel1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getCEL2().getValue())==0){
               returnValue = Pers.getCel2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getCOL().getValue())==0){
               returnValue = Pers.getCol();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getCONTAC1().getValue())==0){
               returnValue = Pers.getContac1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getCONTAC2().getValue())==0){
               returnValue = Pers.getContac2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getESTAC().getValue())==0){
               returnValue = Pers.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getFALT().getValue())==0){
               returnValue = Pers.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getFINGEMP().getValue())==0){
               returnValue = Pers.getFingemp().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getFMOD().getValue())==0){
               returnValue = Pers.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getFSALEMP().getValue())==0){
               returnValue = Pers.getFsalemp().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Pers.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getNOEXT().getValue())==0){
               returnValue = Pers.getNoext();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getNOINT().getValue())==0){
               returnValue = Pers.getNoint();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getNOM().getValue())==0){
               returnValue = Pers.getNom();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getRUTIMG().getValue())==0){
               returnValue = Pers.getRutimg();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getSUCU().getValue())==0){
               returnValue = Pers.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getSUELDACTUA().getValue())==0){
               returnValue = String.valueOf(Pers.getSueldactua());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getSUELDFORA().getValue())==0){
               returnValue = String.valueOf(Pers.getSueldfora());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getTEL1().getValue())==0){
               returnValue = Pers.getTel1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getTEL2().getValue())==0){
               returnValue = Pers.getTel2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getTELEME1().getValue())==0){
               returnValue = Pers.getTeleme1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getTELEME2().getValue())==0){
               returnValue = Pers.getTeleme2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPerssTableHeader().getTEXTRA().getValue())==0){
               returnValue = String.valueOf(Pers.getTextra());
           }
           return returnValue;
       };
   }
}