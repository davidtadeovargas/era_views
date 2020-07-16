package com.era.views.tables;

import com.era.datamodels.enums.DocumentType;
import com.era.models.Sales;
import com.era.repositories.RepositoryFactory;
import com.era.repositories.SalessRepository;
import com.era.views.tables.tablemodels.SalesTableModel;
import java.util.ArrayList;
import java.util.List;

public class SalesTable extends BaseJTable {

    private DocumentType DocumentType;
    
    
    
    public SalesTable(){
       super(RepositoryFactory.getInstance().getSalessRepository());
    }

    public void setDocumentType(DocumentType DocumentType) {
        this.DocumentType = DocumentType;
    }
    
   
    @Override
    public void initTable(List<?> items) {
        final SalesTableModel SalesTableModel = new SalesTableModel(this,items,this.ShowColumns);
         this.setModel(SalesTableModel);
    }
       
    public List<Sales> getAllRemisionsByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllRemsWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    
    public List<Sales> getAllInvoicesByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllInvoicesWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    
    public List<Sales> getAllTicketsByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllTicketsWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    
    public List<Sales> getAllSalesByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = (List<Sales>)SalessRepository_.getAllByPage(pageNumber);
        
        //Return them
        return rems;
    }
    
    @Override
    public void initTableWithPagination() throws Exception {
                
        List<Sales> list = new ArrayList<>();
        
        switch(DocumentType){
            
            case REMISION:
                list = getAllRemisionsByPage(0);
                break;
                
            case INVOICE:
                list = getAllInvoicesByPage(0);
                break;
              
            case TICKETS:
                list = getAllTicketsByPage(0);
                break;
                
            case SALES:
                list = getAllSalesByPage(0);
                break;
        }
        
        //Save globally flag for pagination
        this.usePagination = true;
        
        //Init pagination
        final long count_ = Repository.getCount();
        setCount(count_);
        setPagination(Repository.getPaginationSize());
        
        this.initTable(list);
    }
    
   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SalesTableModel SalesTableModel = (SalesTableModel)this.getModel();
       final List<Sales> items_ = (List<Sales>) SalesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Sales> items_ = (List<Sales>) RepositoryFactory.getInstance().getSalessRepository().getAll();
       final SalesTableModel SalesTableModel = new SalesTableModel(this,items_,this.ShowColumns);
       this.setModel(SalesTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Sales> items_ = (List<Sales>) RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezados(search);
       final SalesTableModel SalesTableModel = new SalesTableModel(this,items_,this.ShowColumns);
       this.setModel(SalesTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Sales ObjectIteration_ = (Sales)ObjectIteration;
       final Sales ObjectToCompare_ = (Sales)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}