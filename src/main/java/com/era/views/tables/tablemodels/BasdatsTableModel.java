/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels;

import com.era.models.BasDats;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.headers.ColumnTable;
import com.era.views.tables.headers.TableHeaderFactory;
import java.util.List;

/**
 *
 * @author PC
 */
public class BasdatsTableModel extends BaseAbstractTableModel {
    
    public BasdatsTableModel(List<?> deliveries, List<ColumnTable> header) {
        super(deliveries,header);
        
        this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {
            
            //Cast the model
            final BasDats Basdats = (BasDats) model;
            
            String returnValue = "";                
            if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getID().getValue())==0){
                returnValue = String.valueOf(rowIndex + 1);           
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCOMPANY_CODE().getValue())==0){
                returnValue = Basdats.getCodemp();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCOMPANY().getValue())==0){
                returnValue = Basdats.getNom();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getDATABASE().getValue())==0){
                returnValue = Basdats.getBd();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCOST_METHOD().getValue())==0){
                returnValue = Basdats.getMetcost();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getPHONE().getValue())==0){
                returnValue = Basdats.getTel();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getEXTENTION().getValue())==0){
                returnValue = Basdats.getNoexten();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getSTREET().getValue())==0){
                returnValue = Basdats.getCalle();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCP().getValue())==0){
                returnValue = Basdats.getCP();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getNOEXT().getValue())==0){
                returnValue = Basdats.getNoext();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getNOINT().getValue())==0){
                returnValue = Basdats.getNoint();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCOLONY().getValue())==0){
                returnValue = Basdats.getCol();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCITY().getValue())==0){
                returnValue = Basdats.getCiu();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getESTATE().getValue())==0){
                returnValue = Basdats.getEstad();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCOUNTRY().getValue())==0){
                returnValue = Basdats.getPai();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getRFC().getValue())==0){
                returnValue = Basdats.getRFC();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getEMAIL().getValue())==0){
                returnValue = Basdats.getCorr();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getSUCURSAL().getValue())==0){
                returnValue = Basdats.getSucu();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCASHER().getValue())==0){
                returnValue = Basdats.getNocaj();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getWEBSITE().getValue())==0){
                returnValue = Basdats.getPagweb();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCONTRIBUYENT_TYPE().getValue())==0){
                returnValue = Basdats.getContribuyentType();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getESTAC().getValue())==0){
                returnValue = Basdats.getEstac();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getEXPEDITION_PLACE().getValue())==0){
                returnValue = Basdats.getLugexp();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getFISCAL_REGIMEN().getValue())==0){
                returnValue = Basdats.getRegfisc();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCERTIFICATE_PATH().getValue())==0){
                returnValue = Basdats.getRutcer();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getKEY_PATH().getValue())==0){
                returnValue = Basdats.getRutkey();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCERTIFICATE_PASSWORD().getValue())==0){
                returnValue = Basdats.getPasscer();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getAPP_PATH().getValue())==0){
                returnValue = Basdats.getRutap();            
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getCREATION_DATE().getValue())==0){
                returnValue = Basdats.getFalt().toString();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasdatsTableHeader().getMODIFICATION_DATE().getValue())==0){
                returnValue = Basdats.getFmod().toString();
            }        

            return returnValue;
        };
    }
}
