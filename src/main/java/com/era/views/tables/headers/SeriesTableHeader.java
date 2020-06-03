package com.era.views.tables.headers;

public class SeriesTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CODE = new ColumnTable("CODE");
   public ColumnTable getCODE() {
       return this.CODE;
   }

   private final ColumnTable CONSECUTIVE = new ColumnTable("CONSECUTIVE");
   public ColumnTable getCONSECUTIVE() {
       return this.CONSECUTIVE;
   }

   private final ColumnTable DESCRIPTION = new ColumnTable("DESCRIPTION");
   public ColumnTable getDESCRIPTION() {
       return this.DESCRIPTION;
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

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TYPE = new ColumnTable("TYPE");
   public ColumnTable getTYPE() {
       return this.TYPE;
   }

}