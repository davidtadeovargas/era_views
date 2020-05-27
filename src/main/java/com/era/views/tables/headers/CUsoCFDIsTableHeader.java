package com.era.views.tables.headers;

public class CUsoCFDIsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable FECHA_INICIO_DE_VIGENCIA = new ColumnTable("FECHA_INICIO_DE_VIGENCIA");
   public ColumnTable getFECHA_INICIO_DE_VIGENCIA() {
       return this.FECHA_INICIO_DE_VIGENCIA;
   }

   private final ColumnTable PERSONA_FISICA = new ColumnTable("PERSONA_FISICA");
   public ColumnTable getPERSONA_FISICA() {
       return this.PERSONA_FISICA;
   }

   private final ColumnTable PERSONA_MORAL = new ColumnTable("PERSONA_MORAL");
   public ColumnTable getPERSONA_MORAL() {
       return this.PERSONA_MORAL;
   }

   private final ColumnTable CODE = new ColumnTable("CODE");
   public ColumnTable getCODE() {
       return this.CODE;
   }

   private final ColumnTable DESCRIPTION = new ColumnTable("DESCRIPTION");
   public ColumnTable getDESCRIPTION() {
       return this.DESCRIPTION;
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