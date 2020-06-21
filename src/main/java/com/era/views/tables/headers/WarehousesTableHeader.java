package com.era.views.tables.headers;

public class WarehousesTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ADDRESS1 = new ColumnTable("Dirección 1");
   public ColumnTable getADDRESS1() {
       return this.ADDRESS1;
   }

   private final ColumnTable ADDRESS2 = new ColumnTable("Dirección 2");
   public ColumnTable getADDRESS2() {
       return this.ADDRESS2;
   }

   private final ColumnTable ADDRESS3 = new ColumnTable("Dirección 3");
   public ColumnTable getADDRESS3() {
       return this.ADDRESS3;
   }

   private final ColumnTable CODE = new ColumnTable("Código");
   public ColumnTable getCODE() {
       return this.CODE;
   }

   private final ColumnTable DESCRIPTION = new ColumnTable("Descripción");
   public ColumnTable getDESCRIPTION() {
       return this.DESCRIPTION;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("F.Creación");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("F.Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable RESPONSABLE = new ColumnTable("Responsable");
   public ColumnTable getRESPONSABLE() {
       return this.RESPONSABLE;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}