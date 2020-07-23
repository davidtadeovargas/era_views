/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Company;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CompanyTableModelGetValueAt implements IGetValueAt{

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final Company Company = (Company) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCP().getValue())==0){
            returnValue = Company.getCP();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getRFC().getValue())==0){
            returnValue = Company.getRFC();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getBANC().getValue())==0){
            returnValue = Company.getBanc();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getBENEFICIARIO().getValue())==0){
            returnValue = Company.getBeneficiario();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getBLOQ().getValue())==0){
            returnValue = Company.isBloq()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getBLOQLIMCRED().getValue())==0){
            returnValue = Company.isBloqlimcred()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCALLE().getValue())==0){
            returnValue = Company.getCalle();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCEL().getValue())==0){
            returnValue = Company.getCel();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCERTIFICATEPASSWORD().getValue())==0){
            returnValue = Company.getCertificatePassword();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCERTIFICATEPATH().getValue())==0){
            returnValue = Company.getCertificatePath();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCIU().getValue())==0){
            returnValue = Company.getCiu();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCLAVBANC().getValue())==0){
            returnValue = Company.getClavbanc();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCO1().getValue())==0){
            returnValue = Company.getCo1();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCO2().getValue())==0){
            returnValue = Company.getCo2();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCO3().getValue())==0){
            returnValue = Company.getCo3();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCOL().getValue())==0){
            returnValue = Company.getCol();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCOMPANYCODE().getValue())==0){
            returnValue = Company.getCompanyCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCONTRIBUYENTTYPE().getValue())==0){
            returnValue = Company.getContribuyentType();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCTA().getValue())==0){
            returnValue = Company.getCta();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCTACONTA().getValue())==0){
            returnValue = Company.getCtaconta();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCTAPRED().getValue())==0){
            returnValue = Company.getCtapred();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getCURP().getValue())==0){
            returnValue = Company.getCurp();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getDESCU().getValue())==0){
            returnValue = String.valueOf(Company.getDescu());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getDIACRED().getValue())==0){
            returnValue = String.valueOf(Company.getDiacred());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getENCALL().getValue())==0){
            returnValue = Company.getEncall();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getESTAC().getValue())==0){
            returnValue = Company.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getESTAD().getValue())==0){
            returnValue = Company.getEstad();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getEXPEDITIONPLACE().getValue())==0){
            returnValue = Company.getExpeditionPlace();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getEXTEN().getValue())==0){
            returnValue = Company.getExten();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getFALT().getValue())==0){
            returnValue = Company.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getFISCALREGIMEN().getValue())==0){
            returnValue = Company.getFiscalRegimen();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getFMOD().getValue())==0){
            returnValue = Company.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getGIRO().getValue())==0){
            returnValue = Company.getGiro();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getKEYPATH().getValue())==0){
            returnValue = Company.getKeyPath();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getLADA().getValue())==0){
            returnValue = Company.getLada();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getLIMTCRED().getValue())==0){
            returnValue = String.valueOf(Company.getLimtcred());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getLIST().getValue())==0){
            returnValue = String.valueOf(Company.getList());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getMETCOST().getValue())==0){
            returnValue = Company.getMetcost();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getMETPAG().getValue())==0){
            returnValue = Company.getMetpag();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getNAMEDB().getValue())==0){
            returnValue = Company.getNameDB();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getNOCAJ().getValue())==0){
            returnValue = Company.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getNOEXT().getValue())==0){
            returnValue = Company.getNoext();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getNOINT().getValue())==0){
            returnValue = Company.getNoint();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getNOM().getValue())==0){
            returnValue = Company.getNom();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getOBSERV().getValue())==0){
            returnValue = Company.getObserv();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getOTRAMON().getValue())==0){
            returnValue = Company.isOtramon()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getOTRAMONC().getValue())==0){
            returnValue = Company.isOtramonc()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getPAGS().getValue())==0){
            returnValue = Company.getPags();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getPAGWEB1().getValue())==0){
            returnValue = Company.getPagweb1();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getPAGWEB2().getValue())==0){
            returnValue = Company.getPagweb2();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getPAI().getValue())==0){
            returnValue = Company.getPai();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getPERS().getValue())==0){
            returnValue = Company.getPers();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getPUEST().getValue())==0){
            returnValue = Company.getPuest();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getPUEST2().getValue())==0){
            returnValue = Company.getPuest2();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getSUCU().getValue())==0){
            returnValue = Company.getSucu();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getTEL().getValue())==0){
            returnValue = Company.getTel();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getTEMPLATE().getValue())==0){
            returnValue = Company.getTemplate();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getTEST().getValue())==0){
            returnValue = Company.isTest()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getUSOCFDI().getValue())==0){
            returnValue = Company.getUsocfdi();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getVEND().getValue())==0){
            returnValue = Company.getVend();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompanysTableHeader().getZON().getValue())==0){
            returnValue = Company.getZon();
        }
        return returnValue;
    }
}