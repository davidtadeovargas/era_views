package com.era.views.tables.headers;

public class PaymentsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable SERIE = new ColumnTable("Serie");
   public ColumnTable getSERIE() {
       return this.SERIE;
   }

   private final ColumnTable FOLIO = new ColumnTable("Folio");
   public ColumnTable getFOLIO() {
       return this.FOLIO;
   }

   private final ColumnTable CUENTA_BANCO = new ColumnTable("Cuenta Banco");
   public ColumnTable getCUENTA_BANCO() {
       return this.CUENTA_BANCO;
   }
   
   private final ColumnTable ESTATUS = new ColumnTable("Estatus");
   public ColumnTable getESTATUS() {
       return this.ESTATUS;
   }
   
   private final ColumnTable FORMA_PAGO = new ColumnTable("Forma Pago");
   public ColumnTable getFORMA_PAGO() {
       return this.FORMA_PAGO;
   }
   
   private final ColumnTable CONCEPTO = new ColumnTable("Concepto");
   public ColumnTable getCONCEPTO() {
       return this.CONCEPTO;
   }
   
   private final ColumnTable CODIGO_CLIENTE_PROVEEDOR = new ColumnTable("Código C/P");
   public ColumnTable getCODIGO_CLIENTE_PROVEEDOR() {
       return this.CODIGO_CLIENTE_PROVEEDOR;
   }
   
   private final ColumnTable TIMBRADA = new ColumnTable("Timbrado");
   public ColumnTable getTIMBRADA() {
       return this.TIMBRADA;
   }
   
   private final ColumnTable IMPORTE = new ColumnTable("Importe");
   public ColumnTable getIMPORTE() {
       return this.IMPORTE;
   }
   
   private final ColumnTable COMENTARIO = new ColumnTable("Comentario");
   public ColumnTable getCOMENTARIO() {
       return this.COMENTARIO;
   }
   
   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("Fecha Alta");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("Fecha Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}