/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Coin;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.CoinsCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class CoinsCombobox extends BaseComboBox<Coin> {
    
    public CoinsCombobox(){
        super(new CoinsCellRender());
    }

    @Override
    List<Coin> getItems() throws Exception {
        
        //Emtpy model
        final Coin Coin = new Coin();
        Coin.setCode("");
        
        final List<Coin> coins = new ArrayList<>();
        coins.add(Coin); //Add the empty model
        
        //Get the list of series depending the type
        List<Coin> coins_ = (List<Coin>)RepositoryFactory.getInstance().getCoinsRepository().getAll();
        
        //Add them all to the list
        coins.addAll(coins_);
        
        return coins;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Coin CoinItem = (Coin)ObjectItem;
        final Coin CoinMethod = (Coin)ObjectMethod;
        
        boolean  found = false;        
        if(CoinItem.getCode() != null && CoinItem.getCode().compareTo(CoinMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
