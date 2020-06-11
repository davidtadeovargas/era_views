package com.era.views.tables;

import com.era.models.CorreoTerminal;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CorreoTerminalTableModel;
import java.util.List;

public class CorreoTerminalTable extends BaseJTable {

   public CorreoTerminalTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CorreoTerminalTableModel CorreoTerminalTableModel = new CorreoTerminalTableModel(items,this.ShowColumns);
        this.setModel(CorreoTerminalTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CorreoTerminalTableModel CorreoTerminalTableModel = (CorreoTerminalTableModel)this.getModel();
       final List<CorreoTerminal> items_ = (List<CorreoTerminal>) CorreoTerminalTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CorreoTerminal> items_ = (List<CorreoTerminal>) RepositoryFactory.getInstance().getCorreoTerminalsRepository().getAll();
       final CorreoTerminalTableModel CorreoTerminalTableModel = new CorreoTerminalTableModel(items_,this.ShowColumns);
       this.setModel(CorreoTerminalTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CorreoTerminal> items_ = (List<CorreoTerminal>) RepositoryFactory.getInstance().getCorreoTerminalsRepository().getByLikeEncabezados(search);
       final CorreoTerminalTableModel CorreoTerminalTableModel = new CorreoTerminalTableModel(items_,this.ShowColumns);
       this.setModel(CorreoTerminalTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final CorreoTerminal ObjectIteration_ = (CorreoTerminal)ObjectIteration;
       final CorreoTerminal ObjectToCompare_ = (CorreoTerminal)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}