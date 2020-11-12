package com.era.views.tables.headers;

public class RegistroemailsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CAMBIADA_FECHA = new ColumnTable("CAMBIADA_FECHA");
   public ColumnTable getCAMBIADA_FECHA() {
       return this.CAMBIADA_FECHA;
   }

   private final ColumnTable CONTRA = new ColumnTable("CONTRA");
   public ColumnTable getCONTRA() {
       return this.CONTRA;
   }

   private final ColumnTable CORREO = new ColumnTable("Emial");
   public ColumnTable getCORREO() {
       return this.CORREO;
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

   private final ColumnTable GENERADA_FECHA = new ColumnTable("GENERADA_FECHA");
   public ColumnTable getGENERADA_FECHA() {
       return this.GENERADA_FECHA;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable YA_ENTRO_BOOLEANO = new ColumnTable("YA_ENTRO_BOOLEANO");
   public ColumnTable getYA_ENTRO_BOOLEANO() {
       return this.YA_ENTRO_BOOLEANO;
   }

}