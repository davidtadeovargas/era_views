package com.era.views.tables.headers;

public class CoinsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable C_MONEDA = new ColumnTable("C_MONEDA");
   public ColumnTable getC_MONEDA() {
       return this.C_MONEDA;
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

   private final ColumnTable NATIONAL = new ColumnTable("NATIONAL");
   public ColumnTable getNATIONAL() {
       return this.NATIONAL;
   }

   private final ColumnTable SIMBOL = new ColumnTable("SIMBOL");
   public ColumnTable getSIMBOL() {
       return this.SIMBOL;
   }

   private final ColumnTable STATION = new ColumnTable("STATION");
   public ColumnTable getSTATION() {
       return this.STATION;
   }

   private final ColumnTable SUCURSAL = new ColumnTable("SUCURSAL");
   public ColumnTable getSUCURSAL() {
       return this.SUCURSAL;
   }

   private final ColumnTable VALUE = new ColumnTable("VALUE");
   public ColumnTable getVALUE() {
       return this.VALUE;
   }

}