/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Lugs;
import java.util.List;

/**
 *
 * @author PC
 */
public class PlacesAbstractTableModel extends BaseAbstractTableModel {

    public PlacesAbstractTableModel(List<Lugs> deliveries, String[] header) {
        super(deliveries,header);
    }
}
