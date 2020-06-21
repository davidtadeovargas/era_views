package com.era.views.tables.headers;

public class TallsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable COD = new ColumnTable("Código");
   public ColumnTable getCOD() {
       return this.COD;
   }

   private final ColumnTable DESCRIP = new ColumnTable("Descripción");
   public ColumnTable getDESCRIP() {
       return this.DESCRIP;
   }

   private final ColumnTable ESTAC = new ColumnTable("ESTAC");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("Fecha Alta");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("Fecha Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}