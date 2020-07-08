package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.UserPermission;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class UserPermissionTableModel  extends BaseAbstractTableModel {

   public UserPermissionTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final UserPermission UserPermission = (UserPermission) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getESTAC().getValue())==0){
               returnValue = UserPermission.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getFALT().getValue())==0){
               returnValue = UserPermission.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getFMOD().getValue())==0){
               returnValue = UserPermission.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getNOCAJ().getValue())==0){
               returnValue = UserPermission.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOCXC().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisoCxc()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSCLIENTES().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosClientes()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSCOMPRAS().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosCompras()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSCONFIG().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosConfig()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSCOTIZA().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosCotiza()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSINVENTARIO().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosInventario()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSMODULOS().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosModulos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSPREVIO().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosPrevio()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSPROVEE().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosProvee()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSSISTEMA().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosSistema()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getOTORGAPERMISOSVENTAS().getValue())==0){
               returnValue = UserPermission.isOtorgaPermisosVentas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISPRODUCTOSBORRAR().getValue())==0){
               returnValue = UserPermission.isPermisProductosBorrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISPRODUCTOSCARGADOIMAGEN().getValue())==0){
               returnValue = UserPermission.isPermisProductosCargadoImagen()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISPRODUCTOSLISTAPRECIO().getValue())==0){
               returnValue = UserPermission.isPermisProductosListaPrecio()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOACTIVARSISTEMA().getValue())==0){
               returnValue = UserPermission.isPermisoActivarSistema()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOBASEDATOS().getValue())==0){
               returnValue = UserPermission.isPermisoBaseDatos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOBASEDATOSARCHIVO().getValue())==0){
               returnValue = UserPermission.isPermisoBaseDatosArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOBASEDATOSCONEXIONES().getValue())==0){
               returnValue = UserPermission.isPermisoBaseDatosConexiones()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCAMBIARICONO().getValue())==0){
               returnValue = UserPermission.isPermisoCambiarIcono()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCANCELARPAGO().getValue())==0){
               returnValue = UserPermission.isPermisoCancelarPago()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCATALOGOGARANTIAS().getValue())==0){
               returnValue = UserPermission.isPermisoCatalogoGarantias()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCLAVES().getValue())==0){
               returnValue = UserPermission.isPermisoClaves()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCLIENTES().getValue())==0){
               returnValue = UserPermission.isPermisoClientes()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCLIENTESBORRAR().getValue())==0){
               returnValue = UserPermission.isPermisoClientesBorrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCLIENTESENVIAR().getValue())==0){
               returnValue = UserPermission.isPermisoClientesEnviar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCLIENTESMODIFICAR().getValue())==0){
               returnValue = UserPermission.isPermisoClientesModificar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCLIENTESNUEVO().getValue())==0){
               returnValue = UserPermission.isPermisoClientesNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCLIENTESVER().getValue())==0){
               returnValue = UserPermission.isPermisoClientesVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRAS().getValue())==0){
               returnValue = UserPermission.isPermisoCompras()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASBORRARARCHIVO().getValue())==0){
               returnValue = UserPermission.isPermisoComprasBorrarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASCANCELAR().getValue())==0){
               returnValue = UserPermission.isPermisoComprasCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASCARGARARCHIVO().getValue())==0){
               returnValue = UserPermission.isPermisoComprasCargarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASDEVOLUCION().getValue())==0){
               returnValue = UserPermission.isPermisoComprasDevolucion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASNOTCREDITO().getValue())==0){
               returnValue = UserPermission.isPermisoComprasNotCredito()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASNUEVO().getValue())==0){
               returnValue = UserPermission.isPermisoComprasNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASPARCIAL().getValue())==0){
               returnValue = UserPermission.isPermisoComprasParcial()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASRECIBIRORDEN().getValue())==0){
               returnValue = UserPermission.isPermisoComprasRecibirOrden()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOMPRASVER().getValue())==0){
               returnValue = UserPermission.isPermisoComprasVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCONCEPTOSNC().getValue())==0){
               returnValue = UserPermission.isPermisoConceptosNC()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCONF().getValue())==0){
               returnValue = UserPermission.isPermisoConf()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCONFIGURACIONESGENERALES().getValue())==0){
               returnValue = UserPermission.isPermisoConfiguracionesGenerales()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCONTABILIDAD().getValue())==0){
               returnValue = UserPermission.isPermisoContabilidad()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCORREOS().getValue())==0){
               returnValue = UserPermission.isPermisoCorreos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOTIZA().getValue())==0){
               returnValue = UserPermission.isPermisoCotiza()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOTIZAABRIR().getValue())==0){
               returnValue = UserPermission.isPermisoCotizaAbrir()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOTIZACANCELAR().getValue())==0){
               returnValue = UserPermission.isPermisoCotizaCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOTIZANUEVA().getValue())==0){
               returnValue = UserPermission.isPermisoCotizaNueva()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOTIZAREENVIAR().getValue())==0){
               returnValue = UserPermission.isPermisoCotizaReenviar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOTIZAVENTA().getValue())==0){
               returnValue = UserPermission.isPermisoCotizaVenta()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCOTIZAVER().getValue())==0){
               returnValue = UserPermission.isPermisoCotizaVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOCXC().getValue())==0){
               returnValue = UserPermission.isPermisoCxc()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISODATOSEMPRESA().getValue())==0){
               returnValue = UserPermission.isPermisoDatosEmpresa()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOGIROS().getValue())==0){
               returnValue = UserPermission.isPermisoGiros()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOIMPRESORAS().getValue())==0){
               returnValue = UserPermission.isPermisoImpresoras()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOIMPUESTOS().getValue())==0){
               returnValue = UserPermission.isPermisoImpuestos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOINVENTARIO().getValue())==0){
               returnValue = UserPermission.isPermisoInventario()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOMONEDAS().getValue())==0){
               returnValue = UserPermission.isPermisoMonedas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPAGONUEVO().getValue())==0){
               returnValue = UserPermission.isPermisoPagoNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPREVIO().getValue())==0){
               returnValue = UserPermission.isPermisoPrevio()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPREVIOABRIR().getValue())==0){
               returnValue = UserPermission.isPermisoPrevioAbrir()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPREVIOCANCELAR().getValue())==0){
               returnValue = UserPermission.isPermisoPrevioCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPREVIOCOMPRA().getValue())==0){
               returnValue = UserPermission.isPermisoPrevioCompra()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPREVIONUEVA().getValue())==0){
               returnValue = UserPermission.isPermisoPrevioNueva()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPREVIOSERIES().getValue())==0){
               returnValue = UserPermission.isPermisoPrevioSeries()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPREVIOVER().getValue())==0){
               returnValue = UserPermission.isPermisoPrevioVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPRODUCTOS().getValue())==0){
               returnValue = UserPermission.isPermisoProductos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPRODUCTOSMODIFICAR().getValue())==0){
               returnValue = UserPermission.isPermisoProductosModificar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPRODUCTOSNUEVO().getValue())==0){
               returnValue = UserPermission.isPermisoProductosNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPROVEE().getValue())==0){
               returnValue = UserPermission.isPermisoProvee()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPROVEEBORRAR().getValue())==0){
               returnValue = UserPermission.isPermisoProveeBorrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPROVEEMODIFICAR().getValue())==0){
               returnValue = UserPermission.isPermisoProveeModificar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPROVEENUEVO().getValue())==0){
               returnValue = UserPermission.isPermisoProveeNuevo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOPROVEEVER().getValue())==0){
               returnValue = UserPermission.isPermisoProveeVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPARAR().getValue())==0){
               returnValue = UserPermission.isPermisoReparar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPARARERRORES().getValue())==0){
               returnValue = UserPermission.isPermisoRepararErrores()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPARARRESTAURAR().getValue())==0){
               returnValue = UserPermission.isPermisoRepararRestaurar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPORTES().getValue())==0){
               returnValue = UserPermission.isPermisoReportes()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPORTESESTADISTICA().getValue())==0){
               returnValue = UserPermission.isPermisoReportesEstadistica()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPORTESLOG().getValue())==0){
               returnValue = UserPermission.isPermisoReportesLog()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPORTESRESPALDOS().getValue())==0){
               returnValue = UserPermission.isPermisoReportesRespaldos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREPORTESUSUARIOS().getValue())==0){
               returnValue = UserPermission.isPermisoReportesUsuarios()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOREVOCACION().getValue())==0){
               returnValue = UserPermission.isPermisoRevocacion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOSERIES().getValue())==0){
               returnValue = UserPermission.isPermisoSeries()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOUSUARIOS().getValue())==0){
               returnValue = UserPermission.isPermisoUsuarios()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOUSUARIOSCONECTADOS().getValue())==0){
               returnValue = UserPermission.isPermisoUsuariosConectados()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOUSUARIOSDEFINIR().getValue())==0){
               returnValue = UserPermission.isPermisoUsuariosDefinir()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOUSUARIOSPERMISOS().getValue())==0){
               returnValue = UserPermission.isPermisoUsuariosPermisos()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTAS().getValue())==0){
               returnValue = UserPermission.isPermisoVentas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASACUSE().getValue())==0){
               returnValue = UserPermission.isPermisoVentasAcuse()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASBORRARARCHIVO().getValue())==0){
               returnValue = UserPermission.isPermisoVentasBorrarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASCANCELAR().getValue())==0){
               returnValue = UserPermission.isPermisoVentasCancelar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASCARGARARCHIVO().getValue())==0){
               returnValue = UserPermission.isPermisoVentasCargarArchivo()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASCOMPROBAR().getValue())==0){
               returnValue = UserPermission.isPermisoVentasComprobar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASDEVOLUCION().getValue())==0){
               returnValue = UserPermission.isPermisoVentasDevolucion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASENTREGAR().getValue())==0){
               returnValue = UserPermission.isPermisoVentasEntregar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASENVIAR().getValue())==0){
               returnValue = UserPermission.isPermisoVentasEnviar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASFACTURAR().getValue())==0){
               returnValue = UserPermission.isPermisoVentasFacturar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASNOTCREDITO().getValue())==0){
               returnValue = UserPermission.isPermisoVentasNotCredito()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASNUEVA().getValue())==0){
               returnValue = UserPermission.isPermisoVentasNueva()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASOBTENERXML().getValue())==0){
               returnValue = UserPermission.isPermisoVentasObtenerXml()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASPARCIAL().getValue())==0){
               returnValue = UserPermission.isPermisoVentasParcial()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASTIMBRAR().getValue())==0){
               returnValue = UserPermission.isPermisoVentasTimbrar()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOVENTASVER().getValue())==0){
               returnValue = UserPermission.isPermisoVentasVer()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getPERMISOZONAS().getValue())==0){
               returnValue = UserPermission.isPermisoZonas()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getSUCU().getValue())==0){
               returnValue = UserPermission.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUserPermissionsTableHeader().getUSERID().getValue())==0){
               returnValue = String.valueOf(UserPermission.getUserID());
           }
           return returnValue;
       };
   }
}