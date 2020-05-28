package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ERPermisos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ERPermisosTableModel  extends BaseAbstractTableModel {

   public ERPermisosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ERPermisos ERPermisos = (ERPermisos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getFKIDUSUARIO().getValue())==0){
               returnValue = String.valueOf(ERPermisos.getFKIdUsuario());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getESTAC().getValue())==0){
               returnValue = ERPermisos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getFALT().getValue())==0){
               returnValue = ERPermisos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getFMOD().getValue())==0){
               returnValue = ERPermisos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getNOCAJ().getValue())==0){
               returnValue = ERPermisos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOCXC().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisoCxc()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSCLIENTES().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosClientes()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSCOMPRAS().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosCompras()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSCONFIG().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosConfig()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSCOTIZA().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosCotiza()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSINVENTARIO().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosInventario()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSMODULOS().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosModulos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSPREVIO().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosPrevio()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSPROVEE().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosProvee()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSSISTEMA().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosSistema()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getOTORGAPERMISOSVENTAS().getValue())==0){
               returnValue = ERPermisos.isOtorgaPermisosVentas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISPRODUCTOSBORRAR().getValue())==0){
               returnValue = ERPermisos.isPermisProductosBorrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISPRODUCTOSCARGADOIMAGEN().getValue())==0){
               returnValue = ERPermisos.isPermisProductosCargadoImagen()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISPRODUCTOSLISTAPRECIO().getValue())==0){
               returnValue = ERPermisos.isPermisProductosListaPrecio()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOACTIVARSISTEMA().getValue())==0){
               returnValue = ERPermisos.isPermisoActivarSistema()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOBASEDATOS().getValue())==0){
               returnValue = ERPermisos.isPermisoBaseDatos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOBASEDATOSARCHIVO().getValue())==0){
               returnValue = ERPermisos.isPermisoBaseDatosArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOBASEDATOSCONEXIONES().getValue())==0){
               returnValue = ERPermisos.isPermisoBaseDatosConexiones()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCAMBIARICONO().getValue())==0){
               returnValue = ERPermisos.isPermisoCambiarIcono()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCANCELARPAGO().getValue())==0){
               returnValue = ERPermisos.isPermisoCancelarPago()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCATALOGOGARANTIAS().getValue())==0){
               returnValue = ERPermisos.isPermisoCatalogoGarantias()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCLAVES().getValue())==0){
               returnValue = ERPermisos.isPermisoClaves()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCLIENTES().getValue())==0){
               returnValue = ERPermisos.isPermisoClientes()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCLIENTESBORRAR().getValue())==0){
               returnValue = ERPermisos.isPermisoClientesBorrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCLIENTESENVIAR().getValue())==0){
               returnValue = ERPermisos.isPermisoClientesEnviar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCLIENTESMODIFICAR().getValue())==0){
               returnValue = ERPermisos.isPermisoClientesModificar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCLIENTESNUEVO().getValue())==0){
               returnValue = ERPermisos.isPermisoClientesNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCLIENTESVER().getValue())==0){
               returnValue = ERPermisos.isPermisoClientesVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRAS().getValue())==0){
               returnValue = ERPermisos.isPermisoCompras()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASBORRARARCHIVO().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasBorrarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASCANCELAR().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASCARGARARCHIVO().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasCargarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASDEVOLUCION().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasDevolucion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASNOTCREDITO().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasNotCredito()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASNUEVO().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASPARCIAL().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasParcial()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASRECIBIRORDEN().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasRecibirOrden()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOMPRASVER().getValue())==0){
               returnValue = ERPermisos.isPermisoComprasVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCONCEPTOSNC().getValue())==0){
               returnValue = ERPermisos.isPermisoConceptosNC()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCONF().getValue())==0){
               returnValue = ERPermisos.isPermisoConf()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCONFIGURACIONESGENERALES().getValue())==0){
               returnValue = ERPermisos.isPermisoConfiguracionesGenerales()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCONTABILIDAD().getValue())==0){
               returnValue = ERPermisos.isPermisoContabilidad()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCORREOS().getValue())==0){
               returnValue = ERPermisos.isPermisoCorreos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOTIZA().getValue())==0){
               returnValue = ERPermisos.isPermisoCotiza()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOTIZAABRIR().getValue())==0){
               returnValue = ERPermisos.isPermisoCotizaAbrir()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOTIZACANCELAR().getValue())==0){
               returnValue = ERPermisos.isPermisoCotizaCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOTIZANUEVA().getValue())==0){
               returnValue = ERPermisos.isPermisoCotizaNueva()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOTIZAREENVIAR().getValue())==0){
               returnValue = ERPermisos.isPermisoCotizaReenviar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOTIZAVENTA().getValue())==0){
               returnValue = ERPermisos.isPermisoCotizaVenta()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCOTIZAVER().getValue())==0){
               returnValue = ERPermisos.isPermisoCotizaVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOCXC().getValue())==0){
               returnValue = ERPermisos.isPermisoCxc()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISODATOSEMPRESA().getValue())==0){
               returnValue = ERPermisos.isPermisoDatosEmpresa()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOGIROS().getValue())==0){
               returnValue = ERPermisos.isPermisoGiros()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOIMPRESORAS().getValue())==0){
               returnValue = ERPermisos.isPermisoImpresoras()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOIMPUESTOS().getValue())==0){
               returnValue = ERPermisos.isPermisoImpuestos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOINVENTARIO().getValue())==0){
               returnValue = ERPermisos.isPermisoInventario()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOMONEDAS().getValue())==0){
               returnValue = ERPermisos.isPermisoMonedas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPAGONUEVO().getValue())==0){
               returnValue = ERPermisos.isPermisoPagoNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPREVIO().getValue())==0){
               returnValue = ERPermisos.isPermisoPrevio()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPREVIOABRIR().getValue())==0){
               returnValue = ERPermisos.isPermisoPrevioAbrir()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPREVIOCANCELAR().getValue())==0){
               returnValue = ERPermisos.isPermisoPrevioCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPREVIOCOMPRA().getValue())==0){
               returnValue = ERPermisos.isPermisoPrevioCompra()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPREVIONUEVA().getValue())==0){
               returnValue = ERPermisos.isPermisoPrevioNueva()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPREVIOSERIES().getValue())==0){
               returnValue = ERPermisos.isPermisoPrevioSeries()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPREVIOVER().getValue())==0){
               returnValue = ERPermisos.isPermisoPrevioVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPRODUCTOS().getValue())==0){
               returnValue = ERPermisos.isPermisoProductos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPRODUCTOSMODIFICAR().getValue())==0){
               returnValue = ERPermisos.isPermisoProductosModificar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPRODUCTOSNUEVO().getValue())==0){
               returnValue = ERPermisos.isPermisoProductosNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPROVEE().getValue())==0){
               returnValue = ERPermisos.isPermisoProvee()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPROVEEBORRAR().getValue())==0){
               returnValue = ERPermisos.isPermisoProveeBorrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPROVEEMODIFICAR().getValue())==0){
               returnValue = ERPermisos.isPermisoProveeModificar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPROVEENUEVO().getValue())==0){
               returnValue = ERPermisos.isPermisoProveeNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOPROVEEVER().getValue())==0){
               returnValue = ERPermisos.isPermisoProveeVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPARAR().getValue())==0){
               returnValue = ERPermisos.isPermisoReparar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPARARERRORES().getValue())==0){
               returnValue = String.valueOf(ERPermisos.getPermisoRepararErrores());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPARARRESTAURAR().getValue())==0){
               returnValue = ERPermisos.isPermisoRepararRestaurar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPORTES().getValue())==0){
               returnValue = ERPermisos.isPermisoReportes()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPORTESESTADISTICA().getValue())==0){
               returnValue = ERPermisos.isPermisoReportesEstadistica()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPORTESLOG().getValue())==0){
               returnValue = ERPermisos.isPermisoReportesLog()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPORTESRESPALDOS().getValue())==0){
               returnValue = ERPermisos.isPermisoReportesRespaldos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREPORTESUSUARIOS().getValue())==0){
               returnValue = ERPermisos.isPermisoReportesUsuarios()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOREVOCACION().getValue())==0){
               returnValue = ERPermisos.isPermisoRevocacion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOSERIES().getValue())==0){
               returnValue = ERPermisos.isPermisoSeries()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOUSUARIOS().getValue())==0){
               returnValue = ERPermisos.isPermisoUsuarios()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOUSUARIOSCONECTADOS().getValue())==0){
               returnValue = ERPermisos.isPermisoUsuariosConectados()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOUSUARIOSDEFINIR().getValue())==0){
               returnValue = ERPermisos.isPermisoUsuariosDefinir()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOUSUARIOSPERMISOS().getValue())==0){
               returnValue = ERPermisos.isPermisoUsuariosPermisos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTAS().getValue())==0){
               returnValue = ERPermisos.isPermisoVentas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASACUSE().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasAcuse()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASBORRARARCHIVO().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasBorrarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASCANCELAR().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASCARGARARCHIVO().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasCargarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASCOMPROBAR().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasComprobar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASDEVOLUCION().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasDevolucion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASENTREGAR().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasEntregar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASENVIAR().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasEnviar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASFACTURAR().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasFacturar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASNOTCREDITO().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasNotCredito()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASNUEVA().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasNueva()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASOBTENERXML().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasObtenerXml()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASPARCIAL().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasParcial()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASTIMBRAR().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasTimbrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOVENTASVER().getValue())==0){
               returnValue = ERPermisos.isPermisoVentasVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getPERMISOZONAS().getValue())==0){
               returnValue = ERPermisos.isPermisoZonas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERPermisossTableHeader().getSUCU().getValue())==0){
               returnValue = ERPermisos.getSucu();
           }
           return returnValue;
       };
   }
}