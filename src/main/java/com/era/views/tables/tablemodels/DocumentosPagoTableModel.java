package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.DocumentosPago;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class DocumentosPagoTableModel  extends BaseAbstractTableModel {

   public DocumentosPagoTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final DocumentosPago DocumentosPago = (DocumentosPago) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getCADENAORIGINAL().getValue())==0){
               returnValue = DocumentosPago.getCadenaOriginal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getCERTIFICADOSAT().getValue())==0){
               returnValue = DocumentosPago.getCertificadosat();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getCODIGO_CLIENTE_PROVEEDOR().getValue())==0){
               returnValue = DocumentosPago.getCodigo_cliente_proveedor();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getCOLOR().getValue())==0){
               returnValue = String.valueOf(DocumentosPago.getColor());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getCOMENTARIO().getValue())==0){
               returnValue = DocumentosPago.getComentario();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getCONCEPTO().getValue())==0){
               returnValue = DocumentosPago.getConcepto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getCUENTABANCO().getValue())==0){
               returnValue = DocumentosPago.getCuentabanco();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getESTAC().getValue())==0){
               returnValue = DocumentosPago.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getESTADO().getValue())==0){
               returnValue = DocumentosPago.getEstado();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFALT().getValue())==0){
               returnValue = DocumentosPago.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFECHATIMBRADO().getValue())==0){
               returnValue = DocumentosPago.getFechaTimbrado().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFECHA_ALTA().getValue())==0){
               returnValue = DocumentosPago.getFecha_alta().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFECHA_DOCUMENTO().getValue())==0){
               returnValue = DocumentosPago.getFecha_documento().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFMOD().getValue())==0){
               returnValue = DocumentosPago.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFOLIO().getValue())==0){
               returnValue = DocumentosPago.getFolio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFOLIO_BANCO().getValue())==0){
               returnValue = DocumentosPago.getFolio_banco();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getFORMAPAGO().getValue())==0){
               returnValue = DocumentosPago.getFormapago();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getIMPORTE().getValue())==0){
               returnValue = DocumentosPago.getImporte().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getLUGAREXPEDICION().getValue())==0){
               returnValue = DocumentosPago.getLugarExpedicion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getNOCAJ().getValue())==0){
               returnValue = DocumentosPago.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getPENDIENTE().getValue())==0){
               returnValue = DocumentosPago.getPendiente().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getREGIMENFISCAL().getValue())==0){
               returnValue = DocumentosPago.getRegimenFiscal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getSELLODIGITAL().getValue())==0){
               returnValue = DocumentosPago.getSelloDigital();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getSELLOSAT().getValue())==0){
               returnValue = DocumentosPago.getSelloSat();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getSERIE().getValue())==0){
               returnValue = DocumentosPago.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getSUCU().getValue())==0){
               returnValue = DocumentosPago.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getTIPO().getValue())==0){
               returnValue = DocumentosPago.getTipo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getTRANSACTIONID().getValue())==0){
               returnValue = DocumentosPago.getTransactionid();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDocumentosPagosTableHeader().getUUID_FISCAL().getValue())==0){
               returnValue = DocumentosPago.getUuid_fiscal();
           }
           return returnValue;
       };
   }
}