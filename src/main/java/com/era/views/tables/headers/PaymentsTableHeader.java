package com.era.views.tables.headers;

public class PaymentsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CASHNUMBER = new ColumnTable("CASHNUMBER");
   public ColumnTable getCASHNUMBER() {
       return this.CASHNUMBER;
   }

   private final ColumnTable CODE = new ColumnTable("CODE");
   public ColumnTable getCODE() {
       return this.CODE;
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

   private final ColumnTable STATION = new ColumnTable("STATION");
   public ColumnTable getSTATION() {
       return this.STATION;
   }

   private final ColumnTable SUCURSAL = new ColumnTable("SUCURSAL");
   public ColumnTable getSUCURSAL() {
       return this.SUCURSAL;
   }

}