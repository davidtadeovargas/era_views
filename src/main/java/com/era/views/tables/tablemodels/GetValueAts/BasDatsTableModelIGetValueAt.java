/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.BasDats;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class BasDatsTableModelIGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final BasDats BasDats = (BasDats) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getCP().getValue())==0){
            returnValue = BasDats.getCP();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getRFC().getValue())==0){
            returnValue = BasDats.getRFC();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getBD().getValue())==0){
            returnValue = BasDats.getBd();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getCALLE().getValue())==0){
            returnValue = BasDats.getCalle();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getCIU().getValue())==0){
            returnValue = BasDats.getCiu();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getCODEMP().getValue())==0){
            returnValue = BasDats.getCodemp();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getCOL().getValue())==0){
            returnValue = BasDats.getCol();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getCONTRIBUYENTTYPE().getValue())==0){
            returnValue = BasDats.getContribuyentType();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getCORR().getValue())==0){
            returnValue = BasDats.getCorr();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getESTAC().getValue())==0){
            returnValue = BasDats.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getESTAD().getValue())==0){
            returnValue = BasDats.getEstad();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getFALT().getValue())==0){
            returnValue = BasDats.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getFMOD().getValue())==0){
            returnValue = BasDats.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getLUGEXP().getValue())==0){
            returnValue = BasDats.getLugexp();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getMETCOST().getValue())==0){
            returnValue = BasDats.getMetcost();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getNOCAJ().getValue())==0){
            returnValue = BasDats.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getNOEXT().getValue())==0){
            returnValue = BasDats.getNoext();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getNOINT().getValue())==0){
            returnValue = BasDats.getNoint();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getNOM().getValue())==0){
            returnValue = BasDats.getNom();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getPAGWEB().getValue())==0){
            returnValue = BasDats.getPagweb();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getPAI().getValue())==0){
            returnValue = BasDats.getPai();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getPASSCER().getValue())==0){
            returnValue = BasDats.getPasscer();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getPASSCERF().getValue())==0){
            returnValue = BasDats.getPasscerf();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getREGFISC().getValue())==0){
            returnValue = BasDats.getRegfisc();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getRUTAP().getValue())==0){
            returnValue = BasDats.getRutap();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getRUTCER().getValue())==0){
            returnValue = BasDats.getRutcer();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getRUTCERF().getValue())==0){
            returnValue = BasDats.getRutcerf();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getRUTKEY().getValue())==0){
            returnValue = BasDats.getRutkey();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getRUTKEYF().getValue())==0){
            returnValue = BasDats.getRutkeyf();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getSUCU().getValue())==0){
            returnValue = BasDats.getSucu();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getTEL().getValue())==0){
            returnValue = BasDats.getTel();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBasDatssTableHeader().getTEST().getValue())==0){
            returnValue = BasDats.isTest()? "Si":"No";
        }
        return returnValue;
    }
}
