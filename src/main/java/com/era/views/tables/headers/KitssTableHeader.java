package com.era.views.tables.headers;

public class KitssTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ALMA = new ColumnTable("Almacen");
   public ColumnTable getALMA() {
       return this.ALMA;
   }

   private final ColumnTable PRODUCT_DESCRIPT = new ColumnTable("Descripción");
   public ColumnTable getPRODUCT_DESCRIPT() {
       return this.PRODUCT_DESCRIPT;
   }
   
   private final ColumnTable CANT = new ColumnTable("Cant");
   public ColumnTable getCANT() {
       return this.CANT;
   }

   private final ColumnTable CODE = new ColumnTable("KIT");
   public ColumnTable getCODE() {
       return this.CODE;
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

   private final ColumnTable PROD = new ColumnTable("PROD");
   public ColumnTable getPROD() {
       return this.PROD;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}