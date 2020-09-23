package com.era.views.tables.headers;

public class BancosTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CUENTABANCO = new ColumnTable("Cuenta");
   public ColumnTable getCUENTABANCO() {
       return this.CUENTABANCO;
   }

   private final ColumnTable BANCO = new ColumnTable("Banco");
   public ColumnTable getBANCO() {
       return this.BANCO;
   }
   
   private final ColumnTable DESCRIP = new ColumnTable("Descripción");
   public ColumnTable getDESCRIP() {
       return this.DESCRIP;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("F.Alta");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("F.Mod");
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