package com.era.views.tables.headers;

public class MovimientosPagossTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ABONO = new ColumnTable("ABONO");
   public ColumnTable getABONO() {
       return this.ABONO;
   }

   private final ColumnTable DOCTO_ORIGEN = new ColumnTable("DOCTO_ORIGEN");
   public ColumnTable getDOCTO_ORIGEN() {
       return this.DOCTO_ORIGEN;
   }

   private final ColumnTable ESTAC = new ColumnTable("ESTAC");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("FALT");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("FMOD");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable FOLIO = new ColumnTable("FOLIO");
   public ColumnTable getFOLIO() {
       return this.FOLIO;
   }

   private final ColumnTable IMPUESTOS = new ColumnTable("IMPUESTOS");
   public ColumnTable getIMPUESTOS() {
       return this.IMPUESTOS;
   }

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PAGO_ID = new ColumnTable("PAGO_ID");
   public ColumnTable getPAGO_ID() {
       return this.PAGO_ID;
   }

   private final ColumnTable PENDIENTE = new ColumnTable("PENDIENTE");
   public ColumnTable getPENDIENTE() {
       return this.PENDIENTE;
   }

   private final ColumnTable SERIE = new ColumnTable("SERIE");
   public ColumnTable getSERIE() {
       return this.SERIE;
   }

   private final ColumnTable SUBTOTAL = new ColumnTable("SUBTOTAL");
   public ColumnTable getSUBTOTAL() {
       return this.SUBTOTAL;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TIPO = new ColumnTable("TIPO");
   public ColumnTable getTIPO() {
       return this.TIPO;
   }

   private final ColumnTable TOTAL = new ColumnTable("TOTAL");
   public ColumnTable getTOTAL() {
       return this.TOTAL;
   }

}