package com.era.views.tables.headers;

public class IngresosEncabsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ALMA = new ColumnTable("Almacén");
   public ColumnTable getALMA() {
       return this.ALMA;
   }

   private final ColumnTable CADUCIDAD = new ColumnTable("Caducidad");
   public ColumnTable getCADUCIDAD() {
       return this.CADUCIDAD;
   }

   private final ColumnTable CANTTOTAL = new ColumnTable("Cantidad Total");
   public ColumnTable getCANTTOTAL() {
       return this.CANTTOTAL;
   }

   private final ColumnTable CONCEP = new ColumnTable("Concepto");
   public ColumnTable getCONCEP() {
       return this.CONCEP;
   }

   private final ColumnTable ENTSAL = new ColumnTable("Entrada o Salida");
   public ColumnTable getENTSAL() {
       return this.ENTSAL;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("F.Cración");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("F.Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable LOTE = new ColumnTable("Lote");
   public ColumnTable getLOTE() {
       return this.LOTE;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Num. Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable NOREFER = new ColumnTable("Numero Referencia");
   public ColumnTable getNOREFER() {
       return this.NOREFER;
   }

   private final ColumnTable NOSER = new ColumnTable("Serie");
   public ColumnTable getNOSER() {
       return this.NOSER;
   }

   private final ColumnTable PEDIMENTO = new ColumnTable("Pedimento");
   public ColumnTable getPEDIMENTO() {
       return this.PEDIMENTO;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}