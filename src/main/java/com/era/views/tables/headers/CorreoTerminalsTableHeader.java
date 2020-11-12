package com.era.views.tables.headers;

public class CorreoTerminalsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CONTRA = new ColumnTable("CONTRA");
   public ColumnTable getCONTRA() {
       return this.CONTRA;
   }

   private final ColumnTable CORREO = new ColumnTable("CORREO");
   public ColumnTable getCORREO() {
       return this.CORREO;
   }

   private final ColumnTable CORREOA = new ColumnTable("CORREOA");
   public ColumnTable getCORREOA() {
       return this.CORREOA;
   }

   private final ColumnTable DIRECCIONSERVER = new ColumnTable("DIRECCIONSERVER");
   public ColumnTable getDIRECCIONSERVER() {
       return this.DIRECCIONSERVER;
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

   private final ColumnTable INGRESOCORREO = new ColumnTable("INGRESOCORREO");
   public ColumnTable getINGRESOCORREO() {
       return this.INGRESOCORREO;
   }

   private final ColumnTable MUESTRACOMO = new ColumnTable("MUESTRACOMO");
   public ColumnTable getMUESTRACOMO() {
       return this.MUESTRACOMO;
   }

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PUERTO = new ColumnTable("PUERTO");
   public ColumnTable getPUERTO() {
       return this.PUERTO;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}