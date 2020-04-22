/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Sectores;
import java.util.List;

/**
 *
 * @author PC
 */
public class SectorsAbstractTableModel extends BaseAbstractTableModel {

    public SectorsAbstractTableModel(List<Sectores> deliveries, String[] header) {
        super(deliveries,header);
    }
}
