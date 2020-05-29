package com.era.views.tables;

import com.era.models.Company;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CompanyTableModel;
import java.util.List;

public class CompanyTable extends BaseJTable {

   public CompanyTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CompanyTableModel CompanyTableModel = new CompanyTableModel(items,this.ShowColumns);
        this.setModel(CompanyTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CompanyTableModel CompanyTableModel = (CompanyTableModel)this.getModel();
       final List<Company> items_ = (List<Company>) CompanyTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Company> items_ = (List<Company>) RepositoryFactory.getInstance().getCompanysRepository().getAll();
       final CompanyTableModel CompanyTableModel = new CompanyTableModel(items_,this.ShowColumns);
       this.setModel(CompanyTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Company> items_ = (List<Company>) RepositoryFactory.getInstance().getCompanysRepository().getByLikeEncabezados(search);
       final CompanyTableModel CompanyTableModel = new CompanyTableModel(items_,this.ShowColumns);
       this.setModel(CompanyTableModel);
   }

}