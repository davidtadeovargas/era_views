package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Registroemail;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class RegistroemailTableModel  extends BaseAbstractTableModel {

   public RegistroemailTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Registroemail Registroemail = (Registroemail) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getCAMBIADA_FECHA().getValue())==0){
               returnValue = Registroemail.getCambiada_fecha().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getCONTRA().getValue())==0){
               returnValue = Registroemail.getContra();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getCORREO().getValue())==0){
               returnValue = Registroemail.getCorreo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getESTAC().getValue())==0){
               returnValue = Registroemail.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getFALT().getValue())==0){
               returnValue = Registroemail.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getFMOD().getValue())==0){
               returnValue = Registroemail.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getGENERADA_FECHA().getValue())==0){
               returnValue = Registroemail.getGenerada_fecha().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Registroemail.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getSUCU().getValue())==0){
               returnValue = Registroemail.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistroemailsTableHeader().getYA_ENTRO_BOOLEANO().getValue())==0){
               returnValue = String.valueOf(Registroemail.getYa_entro_booleano());
           }
           return returnValue;
       };
   }
}