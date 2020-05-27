package com.era.views.tables.headers;

public class WarehousesTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ADDRESS1 = new ColumnTable("ADDRESS1");
   public ColumnTable getADDRESS1() {
       return this.ADDRESS1;
   }

   private final ColumnTable ADDRESS2 = new ColumnTable("ADDRESS2");
   public ColumnTable getADDRESS2() {
       return this.ADDRESS2;
   }

   private final ColumnTable ADDRESS3 = new ColumnTable("ADDRESS3");
   public ColumnTable getADDRESS3() {
       return this.ADDRESS3;
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

   private final ColumnTable RESPONSIBLE = new ColumnTable("RESPONSIBLE");
   public ColumnTable getRESPONSIBLE() {
       return this.RESPONSIBLE;
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