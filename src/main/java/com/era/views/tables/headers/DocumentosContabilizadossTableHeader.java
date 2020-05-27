package com.era.views.tables.headers;

public class DocumentosContabilizadossTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable DOCUMENTO_ID = new ColumnTable("DOCUMENTO_ID");
   public ColumnTable getDOCUMENTO_ID() {
       return this.DOCUMENTO_ID;
   }

   private final ColumnTable ESTAC = new ColumnTable("ESTAC");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("FALT");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FECHA_POLIZA = new ColumnTable("FECHA_POLIZA");
   public ColumnTable getFECHA_POLIZA() {
       return this.FECHA_POLIZA;
   }

   private final ColumnTable FMOD = new ColumnTable("FMOD");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable FOLIO = new ColumnTable("FOLIO");
   public ColumnTable getFOLIO() {
       return this.FOLIO;
   }

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable NUMERO_POLIZA = new ColumnTable("NUMERO_POLIZA");
   public ColumnTable getNUMERO_POLIZA() {
       return this.NUMERO_POLIZA;
   }

   private final ColumnTable SERIE = new ColumnTable("SERIE");
   public ColumnTable getSERIE() {
       return this.SERIE;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TIPO_DOCUMENTO = new ColumnTable("TIPO_DOCUMENTO");
   public ColumnTable getTIPO_DOCUMENTO() {
       return this.TIPO_DOCUMENTO;
   }

   private final ColumnTable TIPO_POLIZA = new ColumnTable("TIPO_POLIZA");
   public ColumnTable getTIPO_POLIZA() {
       return this.TIPO_POLIZA;
   }

}