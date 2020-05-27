package com.era.views.tables.headers;

public class ConsecsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CASHNUMBER = new ColumnTable("CASHNUMBER");
   public ColumnTable getCASHNUMBER() {
       return this.CASHNUMBER;
   }

   private final ColumnTable CONSEC = new ColumnTable("CONSEC");
   public ColumnTable getCONSEC() {
       return this.CONSEC;
   }

   private final ColumnTable DESCRIPTION = new ColumnTable("DESCRIPTION");
   public ColumnTable getDESCRIPTION() {
       return this.DESCRIPTION;
   }

   private final ColumnTable FALT = new ColumnTable("FALT");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("FMOD");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable SERIE = new ColumnTable("SERIE");
   public ColumnTable getSERIE() {
       return this.SERIE;
   }

   private final ColumnTable STATION = new ColumnTable("STATION");
   public ColumnTable getSTATION() {
       return this.STATION;
   }

   private final ColumnTable SUCURSAL = new ColumnTable("SUCURSAL");
   public ColumnTable getSUCURSAL() {
       return this.SUCURSAL;
   }

   private final ColumnTable TYPE = new ColumnTable("TYPE");
   public ColumnTable getTYPE() {
       return this.TYPE;
   }

}