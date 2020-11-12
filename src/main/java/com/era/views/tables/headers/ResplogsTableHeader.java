package com.era.views.tables.headers;

public class ResplogsTableHeader extends BaseTableHeader {

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

   private final ColumnTable MSJ = new ColumnTable("Mensaje");
   public ColumnTable getMSJ() {
       return this.MSJ;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PATHA = new ColumnTable("Rruta hacia");
   public ColumnTable getPATHA() {
       return this.PATHA;
   }

   private final ColumnTable PATHAMYSQ = new ColumnTable("Ruta MYSQL hacia");
   public ColumnTable getPATHAMYSQ() {
       return this.PATHAMYSQ;
   }

   private final ColumnTable PATHDE = new ColumnTable("Ruta desde");
   public ColumnTable getPATHDE() {
       return this.PATHDE;
   }

   private final ColumnTable PATHDEMYSQ = new ColumnTable("Ruta MUSQL Desde");
   public ColumnTable getPATHDEMYSQ() {
       return this.PATHDEMYSQ;
   }

   private final ColumnTable RETURN_ = new ColumnTable("RETURN_");
   public ColumnTable getRETURN_() {
       return this.RETURN_;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TIP = new ColumnTable("TIP");
   public ColumnTable getTIP() {
       return this.TIP;
   }

}