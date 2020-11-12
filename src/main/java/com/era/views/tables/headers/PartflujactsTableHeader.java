package com.era.views.tables.headers;

public class PartflujactsTableHeader extends BaseTableHeader {

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

   private final ColumnTable IDFLUJ = new ColumnTable("Flujo ID");
   public ColumnTable getIDFLUJ() {
       return this.IDFLUJ;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SEGUI = new ColumnTable("Seguridad");
   public ColumnTable getSEGUI() {
       return this.SEGUI;
   }

   private final ColumnTable SUCU = new ColumnTable("Scurusal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}