package com.era.views.tables.headers;

public class ActivossTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CLASIFICACION = new ColumnTable("CLASIFICACION");
   public ColumnTable getCLASIFICACION() {
       return this.CLASIFICACION;
   }

   private final ColumnTable DESCRIP = new ColumnTable("DESCRIP");
   public ColumnTable getDESCRIP() {
       return this.DESCRIP;
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

   private final ColumnTable REFERENCIA = new ColumnTable("REFERENCIA");
   public ColumnTable getREFERENCIA() {
       return this.REFERENCIA;
   }

   private final ColumnTable RESPONSABLE = new ColumnTable("RESPONSABLE");
   public ColumnTable getRESPONSABLE() {
       return this.RESPONSABLE;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable SUCURSAL = new ColumnTable("SUCURSAL");
   public ColumnTable getSUCURSAL() {
       return this.SUCURSAL;
   }

   private final ColumnTable ZONA = new ColumnTable("ZONA");
   public ColumnTable getZONA() {
       return this.ZONA;
   }

}