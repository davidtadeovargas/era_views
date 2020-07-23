package com.era.views.tables.headers;

public class CPaymentMethodsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable FECHA_INICIO_DE_VIGENCIA = new ColumnTable("F.Inicio Vigencia");
   public ColumnTable getFECHA_INICIO_DE_VIGENCIA() {
       return this.FECHA_INICIO_DE_VIGENCIA;
   }

   private final ColumnTable CODE = new ColumnTable("Código");
   public ColumnTable getCODE() {
       return this.CODE;
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

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}