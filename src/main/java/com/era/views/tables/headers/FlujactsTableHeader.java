package com.era.views.tables.headers;

public class FlujactsTableHeader extends BaseTableHeader {

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

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TIT = new ColumnTable("TIT");
   public ColumnTable getTIT() {
       return this.TIT;
   }

   private final ColumnTable USRENVI = new ColumnTable("USRENVI");
   public ColumnTable getUSRENVI() {
       return this.USRENVI;
   }

   private final ColumnTable USRRECIB = new ColumnTable("USRRECIB");
   public ColumnTable getUSRRECIB() {
       return this.USRRECIB;
   }

}