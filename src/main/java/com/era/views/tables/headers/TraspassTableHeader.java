package com.era.views.tables.headers;

public class TraspassTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable USUARIORESPONSABLETRAS = new ColumnTable("Usuario Responsable");
   public ColumnTable getUSUARIORESPONSABLETRAS() {
       return this.USUARIORESPONSABLETRAS;
   }

   private final ColumnTable ALMA = new ColumnTable("De Almacen");
   public ColumnTable getALMA() {
       return this.ALMA;
   }

   private final ColumnTable ALMAA = new ColumnTable("Hacia Almacen");
   public ColumnTable getALMAA() {
       return this.ALMAA;
   }

   private final ColumnTable CANTENT = new ColumnTable("Cant Eentrada");
   public ColumnTable getCANTENT() {
       return this.CANTENT;
   }

   private final ColumnTable CANTSAL = new ColumnTable("Cant Salida");
   public ColumnTable getCANTSAL() {
       return this.CANTSAL;
   }

   private final ColumnTable CODE = new ColumnTable("Código");
   public ColumnTable getCODE() {
       return this.CODE;
   }

   private final ColumnTable CONCEP = new ColumnTable("Concepto");
   public ColumnTable getCONCEP() {
       return this.CONCEP;
   }

   private final ColumnTable COSTO = new ColumnTable("Costo");
   public ColumnTable getCOSTO() {
       return this.COSTO;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable ESTADO = new ColumnTable("Estado");
   public ColumnTable getESTADO() {
       return this.ESTADO;
   }

   private final ColumnTable FALT = new ColumnTable("F.Creación");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("F.Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable LOTEPEDIMENTO = new ColumnTable("Lote Pedimento");
   public ColumnTable getLOTEPEDIMENTO() {
       return this.LOTEPEDIMENTO;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable REPORTEENTRADA = new ColumnTable("Reporte Entrada");
   public ColumnTable getREPORTEENTRADA() {
       return this.REPORTEENTRADA;
   }

   private final ColumnTable REPORTESALIDA = new ColumnTable("Reporte Salida");
   public ColumnTable getREPORTESALIDA() {
       return this.REPORTESALIDA;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable UNID = new ColumnTable("Unidad");
   public ColumnTable getUNID() {
       return this.UNID;
   }

}