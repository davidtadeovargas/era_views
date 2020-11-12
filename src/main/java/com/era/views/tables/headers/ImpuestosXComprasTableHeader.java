package com.era.views.tables.headers;

public class ImpuestosXComprasTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
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

   private final ColumnTable FVENC = new ColumnTable("FVENC");
   public ColumnTable getFVENC() {
       return this.FVENC;
   }

   private final ColumnTable IMPUESTO = new ColumnTable("IMPUESTO");
   public ColumnTable getIMPUESTO() {
       return this.IMPUESTO;
   }

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable RETENCION = new ColumnTable("RETENCION");
   public ColumnTable getRETENCION() {
       return this.RETENCION;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TOTAL = new ColumnTable("TOTAL");
   public ColumnTable getTOTAL() {
       return this.TOTAL;
   }

}