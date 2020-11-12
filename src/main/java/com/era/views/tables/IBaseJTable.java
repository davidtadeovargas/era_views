/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import java.util.List;

/**
 *
 * @author PC
 */
public interface IBaseJTable {
    
    public Object getRow(final int row);
    public List<?> getAll();
}
