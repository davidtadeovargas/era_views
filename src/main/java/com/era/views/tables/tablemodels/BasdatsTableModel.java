/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels;

import com.era.models.BasDats;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class BasdatsTableModel extends BaseAbstractTableModel {
    
    public BasdatsTableModel(List<?> deliveries, String[] header) {
        super(deliveries,header);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final BasDats Basdats = (BasDats) this.items.get(rowIndex);
        
        Object temp = null;
        if (columnIndex == 0) {
           temp = Basdats.getId();
        }
        else if (columnIndex == 1) {
           temp = Basdats.getCodemp();
        }
        else if (columnIndex == 2) {
           temp = Basdats.getNom();
        }
        else if (columnIndex == 3) {
           temp = Basdats.getBd();
        }
        else if (columnIndex == 4) {
           temp = Basdats.getMetcost();
        }
        else if (columnIndex == 5) {
           temp = Basdats.getTel();
        }
        else if (columnIndex == 6) {
           temp = Basdats.getNoext();
        }
        else if (columnIndex == 7) {
           temp = Basdats.getCalle();
        }
        else if (columnIndex == 8) {
           temp = Basdats.getCP();
        }
        else if (columnIndex == 9) {
           temp = Basdats.getNoext();
        }
        else if (columnIndex == 10) {
           temp = Basdats.getNoint();
        }
        else if (columnIndex == 11) {
           temp = Basdats.getCol();
        }
        else if (columnIndex == 12) {
           temp = Basdats.getCiu();
        }
        else if (columnIndex == 13) {
           temp = Basdats.getEstad();
        }
        else if (columnIndex == 14) {
           temp = Basdats.getPai();
        }
        else if (columnIndex == 15) {
           temp = Basdats.getRFC();
        }
        else if (columnIndex == 16) {
           temp = Basdats.getCorr();
        }
        else if (columnIndex == 17) {
           temp = Basdats.getSucu();
        }
        else if (columnIndex == 18) {
           temp = Basdats.getNocaj();
        }
        else if (columnIndex == 19) {
           temp = Basdats.getPagweb();
        }
        else if (columnIndex == 20) {
           temp = Basdats.getRegfisc();
        }
        else if (columnIndex == 21) {
           temp = Basdats.getEstac();
        }
        else if (columnIndex == 22) {
           temp = Basdats.getLugexp();
        }
        else if (columnIndex == 23) {
           temp = Basdats.getRegfisc();
        }
        else if (columnIndex == 24) {
           temp = Basdats.getRutcer();
        }
        else if (columnIndex == 25) {
           temp = Basdats.getRutkey();
        }
        else if (columnIndex == 26) {
           temp = Basdats.getPasscer();
        }
        else if (columnIndex == 27) {
           temp = Basdats.getRutap();
        }
        else if (columnIndex == 28) {
           temp = "";
        }
        else if (columnIndex == 29) {
           temp = Basdats.getFalt();
        }
        else if (columnIndex == 30) {
           temp = Basdats.getFmod();
        }
        
        return temp;
    }
}
