package com.era.views.tables;

import com.era.datamodels.enums.DocumentType;
import com.era.models.Sales;
import com.era.repositories.RepositoryFactory;
import com.era.repositories.SalessRepository;
import com.era.views.tables.headers.TableHeaderFactory;
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
    public void showCommonColumns(){
        
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getSALE_ID());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getCOMPANYCODE());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getRAZON());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getESTATUS());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getEMISIONDATE());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getFACTURADO());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getOBSERVATION());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getPAYMENTFORM());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getSUBTOTAL());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getTAX());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTAL());
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
    
    public List<Sales> getAllNotcByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllNotscWithPagination(pageNumber);
        
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
            
            case NOTC:
                list = getAllNotcByPage(0);
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
       
       List<Sales> items_ = new ArrayList<>();
        
        switch(DocumentType){
            
            case REMISION:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosRems(search);
                break;
                
            case INVOICE:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosInvoices(search);
                break;
              
            case TICKETS:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosTickets(search);
                break;
                
            case SALES:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezados(search);
                break;
                
            case NOTC:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosNotsc(search);
                break;
        }
               
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