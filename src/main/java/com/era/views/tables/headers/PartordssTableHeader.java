package com.era.views.tables.headers;

public class PartordssTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ALMA = new ColumnTable("Almacén");
   public ColumnTable getALMA() {
       return this.ALMA;
   }

   private final ColumnTable CANT = new ColumnTable("Cantidad");
   public ColumnTable getCANT() {
       return this.CANT;
   }

   private final ColumnTable CODCOT = new ColumnTable("Código Cotización");
   public ColumnTable getCODCOT() {
       return this.CODCOT;
   }

   private final ColumnTable CODORD = new ColumnTable("Código Orden");
   public ColumnTable getCODORD() {
       return this.CODORD;
   }

   private final ColumnTable DESCAD = new ColumnTable("Descuento Adicional");
   public ColumnTable getDESCAD() {
       return this.DESCAD;
   }

   private final ColumnTable DESCRIP = new ColumnTable("Descripción");
   public ColumnTable getDESCRIP() {
       return this.DESCRIP;
   }

   private final ColumnTable DESCU = new ColumnTable("Descuento");
   public ColumnTable getDESCU() {
       return this.DESCU;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("Fecha Alta");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FENT = new ColumnTable("Fecha Entrega");
   public ColumnTable getFENT() {
       return this.FENT;
   }

   private final ColumnTable FMOD = new ColumnTable("Fecha Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable IMPO = new ColumnTable("Importe");
   public ColumnTable getIMPO() {
       return this.IMPO;
   }

   private final ColumnTable IMPOIMPUE = new ColumnTable("Importe Impuesto");
   public ColumnTable getIMPOIMPUE() {
       return this.IMPOIMPUE;
   }

   private final ColumnTable IMPUE = new ColumnTable("Impuesto");
   public ColumnTable getIMPUE() {
       return this.IMPUE;
   }

   private final ColumnTable IMPUEVAL = new ColumnTable("Valor Impuesto");
   public ColumnTable getIMPUEVAL() {
       return this.IMPUEVAL;
   }

   private final ColumnTable MON = new ColumnTable("Moneda");
   public ColumnTable getMON() {
       return this.MON;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PROD = new ColumnTable("Producto");
   public ColumnTable getPROD() {
       return this.PROD;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable ULTCOST = new ColumnTable("Último Costo");
   public ColumnTable getULTCOST() {
       return this.ULTCOST;
   }

   private final ColumnTable UNID = new ColumnTable("Unidad");
   public ColumnTable getUNID() {
       return this.UNID;
   }

}