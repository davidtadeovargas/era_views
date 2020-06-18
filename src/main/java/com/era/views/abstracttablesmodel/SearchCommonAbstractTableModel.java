/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.datamodels.enums.SearchCommonTypeEnum;
import com.era.views.abstracttablesmodel.getvaluesat.BasdatsIGetValueAt1;
import com.era.views.abstracttablesmodel.getvaluesat.CClaveprodservsIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.CCoinsIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.CPSIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.ConcepsIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.CountriesIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.CustomersIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.ExpeditionPlaceIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.GirosIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.IGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.ProductsIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.RegimenFiscalIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.SectoresIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.SeriesCustomersIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.SuppliersIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.UsersIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.WarehousesIGetValueAt;
import com.era.views.abstracttablesmodel.getvaluesat.ZonesIGetValueAt;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;

/**
 *
 * @author PC
 */
public class SearchCommonAbstractTableModel extends BaseAbstractTableModel {
        
    public SearchCommonAbstractTableModel(List<?> deliveries, List<ColumnTable> header, final SearchCommonTypeEnum SearchCommonTypeEnum) {
        super(deliveries,header);
        
        this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, Object model) -> {
            
            IGetValueAt IGetValueAt = null;
            
            switch(SearchCommonTypeEnum){
                
                case CUSTOMERS:
                    IGetValueAt = new CustomersIGetValueAt();
                    break;
                    
                case BASDATS:
                    IGetValueAt = new BasdatsIGetValueAt1();
                    break;
                    
                case PRODUCTS:
                    IGetValueAt = new ProductsIGetValueAt();
                    break;
                    
                case SUPPLIERS:
                    IGetValueAt = new SuppliersIGetValueAt();
                    break;
                
                case CLAVES_PROD_SAT:
                    IGetValueAt = new CClaveprodservsIGetValueAt();
                    break;
                    
                case USERS:
                    IGetValueAt = new UsersIGetValueAt();
                    break;
                    
                case KITS:
                    break;
                    
                case CONCEPTS:
                    IGetValueAt = new ConcepsIGetValueAt();
                    break;
                    
                case PAYMENT_TYPES:
                    break;
                    
                case COINS:
                    break;
                
                case CCOINS:
                    IGetValueAt = new CCoinsIGetValueAt();
                    break;
                    
                case WAREHOUSES:
                    IGetValueAt = new WarehousesIGetValueAt();
                    break;
                    
                case CLASSIFICATIONS:
                    break;
                    
                case SUPPLIERS_CLASIFICATION:
                    break;
                    
                case ANAQS:
                    break;
                    
                case GENERAL_PLACES:
                    break;
                    
                case BRANDS:
                    break;
                    
                case LINES:
                    break;
                    
                case TAXES:
                    break;
                    
                case UNIDS:
                    break;
                    
                case PESOS:
                    break;
                    
                case MEASURES:
                    break;
                    
                case FABRICANTES:
                    break;
                    
                case SALES_MAN:
                    IGetValueAt = new UsersIGetValueAt();
                    break;
                    
                case MODELS:
                    break;
                    
                case ALL_COMPUESTS_PRODUCTS: // AND prods.COMPUE = 0
                    break;
                    
                case TYPES:
                    break;
                    
                case ZONES:
                    IGetValueAt = new ZonesIGetValueAt();
                    break;
                    
                case GIROS:
                    IGetValueAt = new GirosIGetValueAt();
                    break;
                    
                case PRODDS_SERIE:
                    break;
                    
                case PRODS_NOT_SERIE:
                    break;
                    
                case RUBROS:
                    break;
                    
                case CREDIT_NOTES:
                    break;
                    
                case PAYMENT_CONCEPTS:
                    break;
                    
                case BANKS:
                    break;
                    
                case SUCURSALS:
                    break;
                    
                case RESPONSABLES:
                    break;
                    
                case CUSTOMERS_SERIE:
                    IGetValueAt = new SeriesCustomersIGetValueAt();
                    break;
                    
                case CPS:
                    IGetValueAt = new CPSIGetValueAt();
                    break;
                    
                case EXPEDITION_PLACE:
                    IGetValueAt = new ExpeditionPlaceIGetValueAt();
                    break;
                    
                case COUNTRIES:
                    IGetValueAt = new CountriesIGetValueAt();
                    break;
                    
                case SECTORS:
                    IGetValueAt = new SectoresIGetValueAt();
                    break;
                    
                case FISCAL_REGIMEN:
                    IGetValueAt = new RegimenFiscalIGetValueAt();
                    break;
            }
            
            String returnValue;
            if(IGetValueAt!=null){
                returnValue = IGetValueAt.getReturnValue(model, rowIndex, columnIndex, valueColumn);
            }
            else{
                returnValue = "undefined";
            }
            
            return returnValue;
        };
                
    }
}
