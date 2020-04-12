/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.datamodels.enums.SearchCommonTypeEnum;
import com.era.views.abstracttablesmodel.SearchCommonAbstractTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class SearchCommonJTable extends BaseJTable {
    
    private SearchCommonTypeEnum SearchCommonTypeEnum;
    
    
        
    public SearchCommonJTable(){
        super();
    }

    @Override
    public void initTable(final List<?> items) {
        
        final String[] columns = new String[]{"Cod.","Descripción/Valor","Otros"};        
        
        final SearchCommonAbstractTableModel SearchCommonAbstractTableModel = new SearchCommonAbstractTableModel(items,columns,SearchCommonTypeEnum);
        this.setModel(SearchCommonAbstractTableModel);
    }

    public void setSearchCommonTypeEnum(SearchCommonTypeEnum SearchCommonTypeEnum) {
        this.SearchCommonTypeEnum = SearchCommonTypeEnum;
    }
}
