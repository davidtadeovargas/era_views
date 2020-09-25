package com.era.views.tables.headers;

public class CRegimenFiscalTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable c_RegimenFiscal = new ColumnTable("Código");
   public ColumnTable getc_RegimenFiscal() {
       return this.c_RegimenFiscal;
   }

   private final ColumnTable DESCRIPTION = new ColumnTable("Descripción");
   public ColumnTable getDESCRIPTION() {
       return this.DESCRIPTION;
   }

   private final ColumnTable FISICA = new ColumnTable("Física");
   public ColumnTable getFISICA() {
       return this.FISICA;
   }
   
   private final ColumnTable MORAL = new ColumnTable("Moral");
   public ColumnTable getMORAL() {
       return this.MORAL;
   }
   
   private final ColumnTable Fecha_de_inicio_de_vigencia = new ColumnTable("F.Ini.Vigencia");
   public ColumnTable getFecha_de_inicio_de_vigencia() {
       return this.Fecha_de_inicio_de_vigencia;
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

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }
}