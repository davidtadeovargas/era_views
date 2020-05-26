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
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCorreoTerminalsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final CorreoTerminal CorreoTerminal = (CorreoTerminal)Model;

       RepositoryFactory.getInstance().getCorreoTerminalsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCorreoTerminalsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}