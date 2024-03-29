package com.era.views.tables;

import com.era.models.Sales;
import com.era.repositories.RepositoryFactory;
import com.era.repositories.SalessRepository;
import com.era.repositories.datamodels.DocumentTypeFilter;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.tables.tablemodels.SalesTableModel;
import java.util.ArrayList;
import java.util.List;

public class SalesTable extends BaseJTable {

    private DocumentTypeFilter DocumentTypeFilter;
    
    
    
    public SalesTable(){
       super(RepositoryFactory.getInstance().getSalessRepository());
    }

    public void setDocumentTypeFilter(DocumentTypeFilter DocumentTypeFilter) {
        this.DocumentTypeFilter = DocumentTypeFilter;
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
       
    public void showCommonColumnsWithRingedInformation(){
        
        //Base columns
        showCommonColumns();
                
        //Ringed columns
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getCADORI());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getCERTSAT());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getFISCALFOLIO());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getSELL());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getSELLSAT());
        addShowColumn(TableHeaderFactory.getSigleton().getSalessTableHeader().getTRANSACTIONID());
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
    public List<Sales> getAllRemisionsConfirmedByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllRemsConfirmedWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    public List<Sales> getAllRemisionsConfirmedAndDevpByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllRemsConfirmedAndDevpWithPagination(pageNumber);
        
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
    
    public List<Sales> getAllInvoicesConfirmedByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllInvoicesConfirmedWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    public List<Sales> getAllInvoicesConfirmedAndDevpByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllInvoicesConfirmedAndDevPWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    
    public List<Sales> getAllInvoicesNotRingedAndConfirmedByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllInvoicesNotRingedAndConfirmedWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    
    public List<Sales> getAllJustConfirmedSalesByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllInvoicesNotRingedAndConfirmedWithPagination(pageNumber);
        
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
    public List<Sales> getAllTicketsConfirmedByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllTicketsConfirmedWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    public List<Sales> getAllTicketsConfirmedAndDevPByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = SalessRepository_.getAllTicketsConfirmedAndDevPWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    
    //getAllInvoicesNotRingedAndConfirmedWithPagination
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
        final List<Sales> rems = (List<Sales>)SalessRepository_.getAllSalesWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    public List<Sales> getAllSalesConfirmedByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = (List<Sales>)SalessRepository_.getAllSalesConfirmedWithPagination(pageNumber);
        
        //Return them
        return rems;
    }    
    public List<Sales> getAllSalesConfirmedAndDevPByPage(final int pageNumber) throws Exception {
        
        //Get the records
        final SalessRepository SalessRepository_ = (SalessRepository)Repository;
        final List<Sales> rems = (List<Sales>)SalessRepository_.getAllSalesConfirmedAndDevpWithPagination(pageNumber);
        
        //Return them
        return rems;
    }
    
    @Override
    public void initTableWithPagination() throws Exception {
                
        List<Sales> list = new ArrayList<>();
        
        switch(DocumentTypeFilter){
            
            case JUST_REM:
                list = getAllRemisionsByPage(0);
                break;
                
            case JUST_INVOICES:
                list = getAllInvoicesByPage(0);
                break;
              
            case JUST_TICKET:
                list = getAllTicketsByPage(0);
                break;
                
            case ALL_SALES:
                list = getAllSalesByPage(0);
                break;
            
            case JUST_NOTCS:
                list = getAllNotcByPage(0);
                break;
                
            case INVOICE_NOT_RINGED_CONFIRMED:
                list = getAllInvoicesNotRingedAndConfirmedByPage(0);
                break;
                
            case CANCELED_SALES:
                list = getAllInvoicesNotRingedAndConfirmedByPage(0);
                break;
                                                
            case JUST_REM_CO:
                list = getAllRemisionsConfirmedByPage(0);
                break;
                
            case JUST_INVOICES_CO:
                list = getAllInvoicesConfirmedByPage(0);
                break;
              
            case JUST_TICKET_CO:
                list = getAllTicketsConfirmedByPage(0);
                break;
                
            case ALL_SALES_CO:
                list = getAllSalesConfirmedByPage(0);
                break;
                                                                
            case JUST_REM_CO_DEVP:
                list = getAllRemisionsConfirmedAndDevpByPage(0);
                break;
                
            case JUST_INVOICES_CO_DEVP:
                list = getAllInvoicesConfirmedAndDevpByPage(0);
                break;
              
            case JUST_TICKET_CO_DEVP:
                list = getAllTicketsConfirmedAndDevPByPage(0);
                break;
                
            case ALL_SALES_CO_DEVP:
                list = getAllSalesConfirmedAndDevPByPage(0);
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
        
       switch(DocumentTypeFilter){
            
            case JUST_REM:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosRems(search);
                break;
                
            case JUST_INVOICES:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosInvoices(search);
                break;
              
            case JUST_TICKET:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosTickets(search);
                break;
                
            case ALL_SALES:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezados(search);
                break;
            
            case JUST_NOTCS:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosNotsc(search);
                break;
                
            case INVOICE_NOT_RINGED_CONFIRMED:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosInvoicesRingedAndConfirmed(search);
                break;
                
            case CANCELED_SALES:
                items_ = RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezadosAllSalesCanceled(search);
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