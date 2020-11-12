package com.era.views.tables.headers;

public class PushNotificationsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable BANNERACTION = new ColumnTable("Acción Banner");
   public ColumnTable getBANNERACTION() {
       return this.BANNERACTION;
   }

   private final ColumnTable CREATED = new ColumnTable("Creado");
   public ColumnTable getCREATED() {
       return this.CREATED;
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

   private final ColumnTable MESSAGE = new ColumnTable("Mensaje");
   public ColumnTable getMESSAGE() {
       return this.MESSAGE;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable URLBANNER = new ColumnTable("Banner URL");
   public ColumnTable getURLBANNER() {
       return this.URLBANNER;
   }

}