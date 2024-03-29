package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Partvta;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import java.math.BigDecimal;
import javax.swing.JTable;

public class PartvtaTableModel  extends BaseAbstractTableModel {

   public PartvtaTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Partvta Partvta = (Partvta) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getACTIVO().getValue())==0){
               returnValue = Partvta.getActivo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getALMA().getValue())==0){
               returnValue = Partvta.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCANT_DEV().getValue())==0){
               
               if(Partvta.getToDevs()==null){
                   Partvta.setToDevs(BigDecimal.ZERO);
               }
               
               returnValue = String.valueOf(Partvta.getToDevs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCANT_DEV_ORI().getValue())==0){
               returnValue = String.valueOf(Partvta.getDevs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCANT().getValue())==0){
               returnValue = Partvta.getCant().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCANTENTRE().getValue())==0){
               returnValue = Partvta.getCantentre().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCOLO().getValue())==0){
               returnValue = Partvta.getColo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCOMENSER().getValue())==0){
               returnValue = Partvta.getComenser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCOST().getValue())==0){
               returnValue = Partvta.getCost().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCUENTACONTABLE().getValue())==0){
               returnValue = Partvta.getCuentacontable();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getDESCRIP().getValue())==0){
               returnValue = Partvta.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getDESCU().getValue())==0){
               returnValue = Partvta.getDescu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getDEVS().getValue())==0){
               returnValue = Partvta.getDevs().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getENTRENOW().getValue())==0){
               returnValue = Partvta.getEntrenow().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getESKIT().getValue())==0){
               returnValue = Partvta.isEskit()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getESTAC().getValue())==0){
               returnValue = Partvta.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getFALT().getValue())==0){
               returnValue = Partvta.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getFCADU().getValue())==0){
               returnValue = Partvta.getFcadu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getFENTRE().getValue())==0){
               returnValue = Partvta.getFentre().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getFMOD().getValue())==0){
               returnValue = Partvta.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getGARAN().getValue())==0){
               returnValue = Partvta.getGaran();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getIDKIT().getValue())==0){
               returnValue = String.valueOf(Partvta.getIdkit());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getIDLOTPED().getValue())==0){
               returnValue = String.valueOf(Partvta.getIdlotped());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getIMPO().getValue())==0){
               returnValue = Partvta.getImpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getIMPUE().getValue())==0){
               returnValue = String.valueOf(Partvta.getImpue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getKITMAE().getValue())==0){
               returnValue = String.valueOf(Partvta.getKitmae());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getLIST().getValue())==0){
               returnValue = String.valueOf(Partvta.getList());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getLOT().getValue())==0){
               returnValue = Partvta.getLot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getLOTEPEDIMENTO().getValue())==0){
               returnValue = String.valueOf(Partvta.getLotePedimento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getMON().getValue())==0){
               returnValue = Partvta.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getNOCAJ().getValue())==0){
               returnValue = Partvta.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getPEDIMEN().getValue())==0){
               returnValue = Partvta.getPedimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getPRE().getValue())==0){
               returnValue = Partvta.getPre().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getPROD().getValue())==0){
               returnValue = Partvta.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getSERPROD().getValue())==0){
               returnValue = Partvta.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getSUCU().getValue())==0){
               returnValue = Partvta.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getTIPCAM().getValue())==0){
               returnValue = Partvta.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getUNID().getValue())==0){
               returnValue = Partvta.getUnid();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getVTA().getValue())==0){
               returnValue = String.valueOf(Partvta.getVta());
           }
           return returnValue;
       };
       
       this.SetValueAt = (Object newValue, int rowIndex, int columnIndex, String columnName, Object model) -> {
           
            final Partvta Partvta_ = (Partvta)model;
            
            if(columnName.compareTo(TableHeaderFactory.getSigleton().getPartvtasTableHeader().getCANT_DEV().getValue())==0){
                
                BigDecimal decimal;
                try{
                    decimal = new BigDecimal((String)newValue);
                }catch(Exception e){
                    decimal = BigDecimal.ZERO;
                }
                
                Partvta_.setToDevs(decimal);
            }
       };
   }
}