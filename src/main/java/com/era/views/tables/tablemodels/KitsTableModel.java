package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Kits;
import com.era.models.Product;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class KitsTableModel  extends BaseAbstractTableModel {

   public KitsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Kits Kits = (Kits) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getPRODUCT_DESCRIPT().getValue())==0){
               
               //Get the product
               final Product Product = (Product)RepositoryFactory.getInstance().getProductsRepository().getByCode(Kits.getProd());
               
               if(Product != null){
                   returnValue = Product.getDescription();
               }
               else{
                   returnValue = "";
               }                              
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Kits.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getCODE().getValue())==0){
               returnValue = Kits.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getESTAC().getValue())==0){
               returnValue = Kits.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getFALT().getValue())==0){
               returnValue = Kits.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getFMOD().getValue())==0){
               returnValue = Kits.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Kits.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getPROD().getValue())==0){
               returnValue = Kits.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getKitssTableHeader().getSUCU().getValue())==0){
               returnValue = Kits.getSucu();
           }
           return returnValue;
       };
   }
}