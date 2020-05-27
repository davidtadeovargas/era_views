package com.era.views.tables.headers;

public class ModificaImpuestossTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
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

   private final ColumnTable PARTIDA = new ColumnTable("PARTIDA");
   public ColumnTable getPARTIDA() {
       return this.PARTIDA;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TOTAL_ANTERIOR = new ColumnTable("TOTAL_ANTERIOR");
   public ColumnTable getTOTAL_ANTERIOR() {
       return this.TOTAL_ANTERIOR;
   }

   private final ColumnTable TOTAL_NUEVO = new ColumnTable("TOTAL_NUEVO");
   public ColumnTable getTOTAL_NUEVO() {
       return this.TOTAL_NUEVO;
   }

}