package com.era.views.tables.headers;

public class RutssTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
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

   private final ColumnTable NOM = new ColumnTable("NOM");
   public ColumnTable getNOM() {
       return this.NOM;
   }

   private final ColumnTable PROGRAM = new ColumnTable("PROGRAM");
   public ColumnTable getPROGRAM() {
       return this.PROGRAM;
   }

   private final ColumnTable RUT = new ColumnTable("RUT");
   public ColumnTable getRUT() {
       return this.RUT;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}