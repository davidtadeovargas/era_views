package com.era.views.tables.headers;

public class TarssTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable CLI = new ColumnTable("Cliente");
   public ColumnTable getCLI() {
       return this.CLI;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable EXTER = new ColumnTable("EXTER");
   public ColumnTable getEXTER() {
       return this.EXTER;
   }

   private final ColumnTable FACTUR = new ColumnTable("Factura");
   public ColumnTable getFACTUR() {
       return this.FACTUR;
   }

   private final ColumnTable FACTUYA = new ColumnTable("Facturado");
   public ColumnTable getFACTUYA() {
       return this.FACTUYA;
   }

   private final ColumnTable FALT = new ColumnTable("F.Creación");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FFACTU = new ColumnTable("FFACTU");
   public ColumnTable getFFACTU() {
       return this.FFACTU;
   }

   private final ColumnTable FMOD = new ColumnTable("F.Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable LOC = new ColumnTable("LOC");
   public ColumnTable getLOC() {
       return this.LOC;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PAG = new ColumnTable("PAG");
   public ColumnTable getPAG() {
       return this.PAG;
   }

   private final ColumnTable PREPAG = new ColumnTable("PREPAG");
   public ColumnTable getPREPAG() {
       return this.PREPAG;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TAR = new ColumnTable("Tarjeta");
   public ColumnTable getTAR() {
       return this.TAR;
   }

   private final ColumnTable TARIF = new ColumnTable("Tarifa");
   public ColumnTable getTARIF() {
       return this.TARIF;
   }

   private final ColumnTable VTA = new ColumnTable("Venta");
   public ColumnTable getVTA() {
       return this.VTA;
   }

}