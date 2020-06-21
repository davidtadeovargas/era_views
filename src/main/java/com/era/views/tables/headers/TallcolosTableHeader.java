package com.era.views.tables.headers;

public class TallcolosTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ALMA = new ColumnTable("Almacén");
   public ColumnTable getALMA() {
       return this.ALMA;
   }

   private final ColumnTable COLO = new ColumnTable("Colnia");
   public ColumnTable getCOLO() {
       return this.COLO;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable EXIST = new ColumnTable("Existencia");
   public ColumnTable getEXIST() {
       return this.EXIST;
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

   private final ColumnTable PROD = new ColumnTable("Producto");
   public ColumnTable getPROD() {
       return this.PROD;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TALL = new ColumnTable("Talla");
   public ColumnTable getTALL() {
       return this.TALL;
   }

}