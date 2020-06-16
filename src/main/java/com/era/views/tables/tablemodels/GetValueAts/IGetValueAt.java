/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

/**
 *
 * @author PC
 */
public interface IGetValueAt {
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, final Object model);
}
