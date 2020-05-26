package com.era.views.tables;

import com.era.models.CTipoRelacion;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CTipoRelacionTableModel;
import java.util.List;

public class CTipoRelacionTable extends BaseJTable {

   public CTipoRelacionTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CTipoRelacionTableModel CTipoRelacionTableModel = new CTipoRelacionTableModel(items,this.ShowColumns);
        this.setModel(CTipoRelacionTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CTipoRelacionTableModel CTipoRelacionTableModel = (CTipoRelacionTableModel)this.getModel();
       final List<CTipoRelacion> items_ = (List<CTipoRelacion>) CTipoRelacionTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CTipoRelacion> items_ = (List<CTipoRelacion>) RepositoryFactory.getInstance().getCTipoRelacionsRepository().getAll();
       final CTipoRelacionTableModel CTipoRelacionTableModel = new CTipoRelacionTableModel(items_,this.ShowColumns);
       this.setModel(CTipoRelacionTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCTipoRelacionsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final CTipoRelacion CTipoRelacion = (CTipoRelacion)Model;

       RepositoryFactory.getInstance().getCTipoRelacionsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCTipoRelacionsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}