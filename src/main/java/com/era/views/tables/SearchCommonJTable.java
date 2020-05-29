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
        
        final SearchCommonAbstractTableModel SearchCommonAbstractTableModel = new SearchCommonAbstractTableModel(items,this.ShowColumns,SearchCommonTypeEnum);
        this.setModel(SearchCommonAbstractTableModel);
    }

    public void setSearchCommonTypeEnum(SearchCommonTypeEnum SearchCommonTypeEnum) {
        this.SearchCommonTypeEnum = SearchCommonTypeEnum;
    }

    @Override
    public void loadAllItemsInTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> getAllItemsInTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getByLikeEncabezados(String search) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
