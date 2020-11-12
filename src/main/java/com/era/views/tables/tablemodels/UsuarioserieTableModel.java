package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Usuarioserie;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class UsuarioserieTableModel  extends BaseAbstractTableModel {

   public UsuarioserieTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Usuarioserie Usuarioserie = (Usuarioserie) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getESTAC().getValue())==0){
               returnValue = Usuarioserie.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getFALT().getValue())==0){
               returnValue = Usuarioserie.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getFMOD().getValue())==0){
               returnValue = Usuarioserie.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getIDSERIE().getValue())==0){
               returnValue = String.valueOf(Usuarioserie.getIdserie());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getIDUSUARIO().getValue())==0){
               returnValue = String.valueOf(Usuarioserie.getIdusuario());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getNOCAJ().getValue())==0){
               returnValue = Usuarioserie.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsuarioseriesTableHeader().getSUCU().getValue())==0){
               returnValue = Usuarioserie.getSucu();
           }
           return returnValue;
       };
   }
}