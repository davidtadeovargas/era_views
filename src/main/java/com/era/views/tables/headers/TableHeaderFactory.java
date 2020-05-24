/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.headers;

/**
 *
 * @author PC
 */
public class TableHeaderFactory {
    
    private static TableHeaderFactory TableHeaderFactory;
    
    private UsersTableHeader UsersTableHeader;
    private BasdatsTableHeader BasdatsTableHeader;
    private CompaniesTableHeader CompaniesTableHeader;
    private SearchTableHeader SearchTableHeader;
    
    
    public static TableHeaderFactory getSigleton(){
        if(TableHeaderFactory==null){
            TableHeaderFactory = new TableHeaderFactory();
        }
        return TableHeaderFactory;
    }
    
    public UsersTableHeader getUsersTableHeader(){
        UsersTableHeader = new UsersTableHeader();
        return UsersTableHeader;
    }
    
    public BasdatsTableHeader getBasdatsTableHeader(){
        BasdatsTableHeader = new BasdatsTableHeader();
        return BasdatsTableHeader;
    }
    
    public CompaniesTableHeader getCompaniesTableHeader(){
        CompaniesTableHeader = new CompaniesTableHeader();
        return CompaniesTableHeader;
    }
    
    public SearchTableHeader getSearchTableHeader(){
        SearchTableHeader = new SearchTableHeader();
        return SearchTableHeader;
    }
}
