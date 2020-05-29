package com.era.views.tables;

import com.era.models.HistAntiguedaddesaldo;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.HistAntiguedaddesaldoTableModel;
import java.util.List;

public class HistAntiguedaddesaldoTable extends BaseJTable {

   public HistAntiguedaddesaldoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final HistAntiguedaddesaldoTableModel HistAntiguedaddesaldoTableModel = new HistAntiguedaddesaldoTableModel(items,this.ShowColumns);
        this.setModel(HistAntiguedaddesaldoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final HistAntiguedaddesaldoTableModel HistAntiguedaddesaldoTableModel = (HistAntiguedaddesaldoTableModel)this.getModel();
       final List<HistAntiguedaddesaldo> items_ = (List<HistAntiguedaddesaldo>) HistAntiguedaddesaldoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<HistAntiguedaddesaldo> items_ = (List<HistAntiguedaddesaldo>) RepositoryFactory.getInstance().getHistAntiguedaddesaldosRepository().getAll();
       final HistAntiguedaddesaldoTableModel HistAntiguedaddesaldoTableModel = new HistAntiguedaddesaldoTableModel(items_,this.ShowColumns);
       this.setModel(HistAntiguedaddesaldoTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<HistAntiguedaddesaldo> items_ = (List<HistAntiguedaddesaldo>) RepositoryFactory.getInstance().getHistAntiguedaddesaldosRepository().getByLikeEncabezados(search);
       final HistAntiguedaddesaldoTableModel HistAntiguedaddesaldoTableModel = new HistAntiguedaddesaldoTableModel(items_,this.ShowColumns);
       this.setModel(HistAntiguedaddesaldoTableModel);
   }

}