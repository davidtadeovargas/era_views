package com.era.views.tables.headers;

public class ConsecsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CONSEC = new ColumnTable("Consecutivo");
   public ColumnTable getCONSEC() {
       return this.CONSEC;
   }

   private final ColumnTable DESCRIPTION = new ColumnTable("Descripción");
   public ColumnTable getDESCRIPTION() {
       return this.DESCRIPTION;
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

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SERIE = new ColumnTable("Serie");
   public ColumnTable getSERIE() {
       return this.SERIE;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TYPE = new ColumnTable("Tipo");
   public ColumnTable getTYPE() {
       return this.TYPE;
   }

}