package com.era.views.tables;

import com.era.models.Marcprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MarcprodTableModel;
import java.util.List;

public class MarcprodTable extends BaseJTable {

   public MarcprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MarcprodTableModel MarcprodTableModel = new MarcprodTableModel(items,this.ShowColumns);
        this.setModel(MarcprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MarcprodTableModel MarcprodTableModel = (MarcprodTableModel)this.getModel();
       final List<Marcprod> items_ = (List<Marcprod>) MarcprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Marcprod> items_ = (List<Marcprod>) RepositoryFactory.getInstance().getMarcprodsRepository().getAll();
       final MarcprodTableModel MarcprodTableModel = new MarcprodTableModel(items_,this.ShowColumns);
       this.setModel(MarcprodTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getMarcprodsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Marcprod Marcprod = (Marcprod)Model_;

       RepositoryFactory.getInstance().getMarcprodsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getMarcprodsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}