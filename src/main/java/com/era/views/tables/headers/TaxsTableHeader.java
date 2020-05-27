package com.era.views.tables.headers;

public class TaxsTableHeader extends BaseTableHeader {

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

   private final ColumnTable FALT = new ColumnTable("FALT");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("FMOD");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable RETENTION = new ColumnTable("RETENTION");
   public ColumnTable getRETENTION() {
       return this.RETENTION;
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

   private final ColumnTable XMLTAX = new ColumnTable("XMLTAX");
   public ColumnTable getXMLTAX() {
       return this.XMLTAX;
   }

}