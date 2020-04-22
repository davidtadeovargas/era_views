/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Serie;
import java.util.List;

/**
 *
 * @author PC
 */
public class SeriesProductsAbstractTableModel extends BaseAbstractTableModel {

    public SeriesProductsAbstractTableModel(List<Serie> deliveries, String[] header) {
        super(deliveries,header);        
    }
}
