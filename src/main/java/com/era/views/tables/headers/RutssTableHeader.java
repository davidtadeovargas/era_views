package com.era.views.tables.headers;

public class RutssTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
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

   private final ColumnTable NOM = new ColumnTable("Nombre");
   public ColumnTable getNOM() {
       return this.NOM;
   }

   private final ColumnTable PROGRAM = new ColumnTable("PROGRAM");
   public ColumnTable getPROGRAM() {
       return this.PROGRAM;
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