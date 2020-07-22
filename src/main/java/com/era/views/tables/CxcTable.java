package com.era.views.tables;

import com.era.models.Cxc;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.tables.tablemodels.CxcTableModel;
import java.util.List;

public class CxcTable extends BaseJTable {

   public CxcTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CxcTableModel CxcTableModel = new CxcTableModel(this,items,this.ShowColumns);
        this.setModel(CxcTableModel);
   }

   @Override
   public void showCommonColumns(){
        
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getROWNUMBER());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getID_VENTA());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getEMPRE());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCARG());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getABON());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getMONEDAID());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getNOREFER());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getSER());        
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCONCEP());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCONCEPPAG());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getESTADO());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCOMEN());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getSUBTOT());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getIMPUE());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getTOT());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getESTAC());
        addShowColumn(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFALT());            
    }
   
   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CxcTableModel CxcTableModel = (CxcTableModel)this.getModel();
       final List<Cxc> items_ = (List<Cxc>) CxcTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cxc> items_ = (List<Cxc>) RepositoryFactory.getInstance().getCxcRepository().getAll();
       final CxcTableModel CxcTableModel = new CxcTableModel(this,items_,this.ShowColumns);
       this.setModel(CxcTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Cxc> items_ = (List<Cxc>) RepositoryFactory.getInstance().getCxcRepository().getByLikeEncabezados(search);
       final CxcTableModel CxcTableModel = new CxcTableModel(this,items_,this.ShowColumns);
       this.setModel(CxcTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Cxc ObjectIteration_ = (Cxc)ObjectIteration;
       final Cxc ObjectToCompare_ = (Cxc)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}