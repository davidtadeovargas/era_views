/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Product;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class ProductTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) {
        
        final Product Product = (Product) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getASKMAXMIN().getValue())==0){
            returnValue = String.valueOf(Product.getAskMaxMin());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getASKSERIE().getValue())==0){
            returnValue = Product.isAskSerie()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getBRAND().getValue())==0){
            returnValue = Product.getBrand();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getBRANDID().getValue())==0){
            returnValue = String.valueOf(Product.getBrandID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCLASSJERARCHY().getValue())==0){
            returnValue = Product.getClassJerarchy();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODE().getValue())==0){
            returnValue = Product.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODEEXTRA().getValue())==0){
            returnValue = Product.getCodeExtra();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODELINE().getValue())==0){
            returnValue = Product.getCodeLine();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODEMEASURE().getValue())==0){
            returnValue = Product.getCodeMeasure();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODEPRODUCTOPTIONAL1().getValue())==0){
            returnValue = Product.getCodeProductOptional1();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODEPRODUCTOPTIONAL2().getValue())==0){
            returnValue = Product.getCodeProductOptional2();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODETAX().getValue())==0){
            returnValue = Product.getCodeTax();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCODEUBICATION().getValue())==0){
            returnValue = Product.getCodeUbication();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCOLOR().getValue())==0){
            returnValue = Product.getColor();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCOLORID().getValue())==0){
            returnValue = String.valueOf(Product.getColorID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCOMENTSERIAL().getValue())==0){
            returnValue = Product.getComentSerial();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCOMPOUND().getValue())==0){
            returnValue = String.valueOf(Product.getCompound());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCOST().getValue())==0){
            returnValue = String.valueOf(Product.getCost());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCOSTMETHOD().getValue())==0){
            returnValue = Product.getCostMethod();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getCREATIONSTATION().getValue())==0){
            returnValue = Product.getCreationStation();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = Product.getDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getDISCOUNTPROVIDER().getValue())==0){
            returnValue = Product.getDiscountProvider();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getESTAC().getValue())==0){
            returnValue = Product.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getEXISTENCE().getValue())==0){
            returnValue = String.valueOf(Product.getExistence());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getEXPIRATIONDATE().getValue())==0){
            returnValue = Product.getExpirationDate().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getEXPORT().getValue())==0){
            returnValue = Product.isExport()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getFALT().getValue())==0){
            returnValue = Product.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getFMOD().getValue())==0){
            returnValue = Product.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getINFORMATION().getValue())==0){
            returnValue = Product.getInformation();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getISFORSALE().getValue())==0){
            returnValue = String.valueOf(Product.getIsForSale());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getIVENTORY().getValue())==0){
            returnValue = String.valueOf(Product.getIventory());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getKEYSAT().getValue())==0){
            returnValue = Product.getKeySAT();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getLINEID().getValue())==0){
            returnValue = String.valueOf(Product.getLineID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getLOT().getValue())==0){
            returnValue = Product.getLot();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getLOTPEDIMENT().getValue())==0){
            returnValue = Product.isLotPediment()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getLOWERCOST().getValue())==0){
            returnValue = String.valueOf(Product.getLowerCost());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getMAKER().getValue())==0){
            returnValue = Product.getMaker();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getMAKERID().getValue())==0){
            returnValue = String.valueOf(Product.getMakerID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getMAXIMUM().getValue())==0){
            returnValue = String.valueOf(Product.getMaximum());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getMEASURE().getValue())==0){
            returnValue = String.valueOf(Product.getMeasure());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getMINIMUN().getValue())==0){
            returnValue = String.valueOf(Product.getMinimun());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getMODEL().getValue())==0){
            returnValue = Product.getModel();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getMODELID().getValue())==0){
            returnValue = String.valueOf(Product.getModelID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getNOCAJ().getValue())==0){
            returnValue = Product.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPATHIMG().getValue())==0){
            returnValue = Product.getPathIMG();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPLACE().getValue())==0){
            returnValue = Product.getPlace();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPLACEID().getValue())==0){
            returnValue = String.valueOf(Product.getPlaceID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST1().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList1());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST10().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList10());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST2().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList2());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST3().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList3());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST4().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList4());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST5().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList5());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST6().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList6());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST7().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList7());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST8().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList8());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRICELIST9().getValue())==0){
            returnValue = String.valueOf(Product.getPriceList9());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPRINCIPALPROVIDER().getValue())==0){
            returnValue = String.valueOf(Product.getPrincipalProvider());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPROVIDEROPTIONAL1().getValue())==0){
            returnValue = Product.getProviderOptional1();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getPROVIDEROPTIONAL2().getValue())==0){
            returnValue = Product.getProviderOptional2();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getRECOLECTIONCOST().getValue())==0){
            returnValue = String.valueOf(Product.getRecolectionCost());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getSERIALNUMBER().getValue())==0){
            returnValue = Product.getSerialNumber();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getSERVICE().getValue())==0){
            returnValue = Product.isService()? "Si":"No";
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getSHELF().getValue())==0){
            returnValue = Product.getShelf();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getSHORTDESCRIPTION().getValue())==0){
            returnValue = Product.getShortDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getSUCU().getValue())==0){
            returnValue = Product.getSucu();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getTIP().getValue())==0){
            returnValue = Product.getTip();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getTYPEID().getValue())==0){
            returnValue = String.valueOf(Product.getTypeID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUNIT().getValue())==0){
            returnValue = Product.getUnit();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUNITID().getValue())==0){
            returnValue = String.valueOf(Product.getUnitID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES1().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales1());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES10().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales10());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES2().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales2());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES3().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales3());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES4().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales4());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES5().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales5());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES6().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales6());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES7().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales7());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES8().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales8());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getUTILSALES9().getValue())==0){
            returnValue = String.valueOf(Product.getUtilSales9());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getWAREHOUSEID().getValue())==0){
            returnValue = String.valueOf(Product.getWarehouseID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getWARRANTY().getValue())==0){
            returnValue = Product.getWarranty();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getWARRANTYID().getValue())==0){
            returnValue = String.valueOf(Product.getWarrantyID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getWEIGHT().getValue())==0){
            returnValue = Product.getWeight();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getWEIGHTID().getValue())==0){
            returnValue = String.valueOf(Product.getWeightID());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getWEIGHTMAN().getValue())==0){
            returnValue = String.valueOf(Product.getWeightMan());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductsTableHeader().getWHAREHOUSE().getValue())==0){
            returnValue = Product.getWharehouse();
        }
        return returnValue;
    }
}
