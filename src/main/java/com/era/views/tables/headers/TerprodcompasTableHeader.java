package com.era.views.tables.headers;

public class TerprodcompasTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
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

   private final ColumnTable MARC = new ColumnTable("Marca");
   public ColumnTable getMARC() {
       return this.MARC;
   }

   private final ColumnTable MODEL = new ColumnTable("Modelo");
   public ColumnTable getMODEL() {
       return this.MODEL;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PROD = new ColumnTable("Producto");
   public ColumnTable getPROD() {
       return this.PROD;
   }

   private final ColumnTable RUT = new ColumnTable("Ruta");
   public ColumnTable getRUT() {
       return this.RUT;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}