package com.era.views.tables.headers;

public class EREjerciciossTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable EJERCICIO = new ColumnTable("EJERCICIO");
   public ColumnTable getEJERCICIO() {
       return this.EJERCICIO;
   }

   private final ColumnTable ESTAC = new ColumnTable("ESTAC");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("FALT");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FECHACREACION = new ColumnTable("FECHACREACION");
   public ColumnTable getFECHACREACION() {
       return this.FECHACREACION;
   }

   private final ColumnTable FECHAFIN = new ColumnTable("FECHAFIN");
   public ColumnTable getFECHAFIN() {
       return this.FECHAFIN;
   }

   private final ColumnTable FECHAINICIO = new ColumnTable("FECHAINICIO");
   public ColumnTable getFECHAINICIO() {
       return this.FECHAINICIO;
   }

   private final ColumnTable FMOD = new ColumnTable("FMOD");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}