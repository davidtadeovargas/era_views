package com.era.views.tables.headers;

public class GirosTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable DESCRIP = new ColumnTable("DESCRIP");
   public ColumnTable getDESCRIP() {
       return this.DESCRIP;
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

   private final ColumnTable GIR = new ColumnTable("GIR");
   public ColumnTable getGIR() {
       return this.GIR;
   }

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}