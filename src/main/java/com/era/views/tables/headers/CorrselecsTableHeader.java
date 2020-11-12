package com.era.views.tables.headers;

public class CorrselecsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ACTSLENLOG = new ColumnTable("Activar SSL");
   public ColumnTable getACTSLENLOG() {
       return this.ACTSLENLOG;
   }

   private final ColumnTable CORRALTER = new ColumnTable("Correo Alterno");
   public ColumnTable getCORRALTER() {
       return this.CORRALTER;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable ESTACGLO = new ColumnTable("Usuario Email");
   public ColumnTable getESTACGLO() {
       return this.ESTACGLO;
   }

   private final ColumnTable FALT = new ColumnTable("F.Modificación");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("F.Creación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PASS = new ColumnTable("Password");
   public ColumnTable getPASS() {
       return this.PASS;
   }

   private final ColumnTable PORTSMTP = new ColumnTable("Puerto SMTP");
   public ColumnTable getPORTSMTP() {
       return this.PORTSMTP;
   }

   private final ColumnTable SRVSMTPSAL = new ColumnTable("Servisor SMT");
   public ColumnTable getSRVSMTPSAL() {
       return this.SRVSMTPSAL;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable USR = new ColumnTable("Usuario");
   public ColumnTable getUSR() {
       return this.USR;
   }

}