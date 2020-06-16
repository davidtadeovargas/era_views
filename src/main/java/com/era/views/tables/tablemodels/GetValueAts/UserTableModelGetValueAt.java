/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.User;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class UserTableModelGetValueAt implements IGetValueAt{

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) {
     
        final User User = (User) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getALMACEN().getValue())==0){
            returnValue = User.getAlmacen();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCASHERADMIN().getValue())==0){
            returnValue = User.isCasherAdmin()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCELLPHONE().getValue())==0){
            returnValue = User.getCellphone();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCITY().getValue())==0){
            returnValue = User.getCity();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCODE().getValue())==0){
            returnValue = User.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCOLONY().getValue())==0){
            returnValue = User.getColony();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCOMMISSION().getValue())==0){
            returnValue = String.valueOf(User.getCommission());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCORT().getValue())==0){
            returnValue = User.getCort();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCOUNTRY().getValue())==0){
            returnValue = User.getCountry();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCP().getValue())==0){
            returnValue = String.valueOf(User.getCp());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getDISCCOUNT().getValue())==0){
            returnValue = String.valueOf(User.getDisccount());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getEMAIL().getValue())==0){
            returnValue = User.getEmail();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getENABLEDISCCOUNT().getValue())==0){
            returnValue = User.isEnableDisccount()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getESTAC().getValue())==0){
            returnValue = User.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getFALT().getValue())==0){
            returnValue = User.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getFMOD().getValue())==0){
            returnValue = User.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getINVOICEPRINTER().getValue())==0){
            returnValue = User.getInvoicePrinter();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getM52().getValue())==0){
            returnValue = User.isM52()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getNAME().getValue())==0){
            returnValue = User.getName();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getNOCAJ().getValue())==0){
            returnValue = User.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getNOEXT().getValue())==0){
            returnValue = User.getNoext();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getNOINT().getValue())==0){
            returnValue = User.getNoint();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getPASSWORD().getValue())==0){
            returnValue = User.getPassword();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getPHONE().getValue())==0){
            returnValue = User.getPhone();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getPTOVTA().getValue())==0){
            returnValue = User.isPtovta()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getSALESMAN().getValue())==0){
            returnValue = User.isSalesMan()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getSTATE().getValue())==0){
            returnValue = User.getState();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getSTREET().getValue())==0){
            returnValue = User.getStreet();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getSUCU().getValue())==0){
            returnValue = User.getSucu();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getSUPERVISOR().getValue())==0){
            returnValue = User.isSupervisor()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getTICKETPRINTER().getValue())==0){
            returnValue = User.getTicketPrinter();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getUSEROFSALESOFPOINT().getValue())==0){
            returnValue = User.isUserOfsalesOfPoint()? "Si":"No";
        }
        return returnValue;
    }
}
