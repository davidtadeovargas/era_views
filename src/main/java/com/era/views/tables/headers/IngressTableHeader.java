package com.era.views.tables.headers;

public class IngressTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ACTIVO = new ColumnTable("Activo");
   public ColumnTable getACTIVO() {
       return this.ACTIVO;
   }

   private final ColumnTable PRODUCT_DESCRIPTION = new ColumnTable("Descripción");
   public ColumnTable getPRODUCT_DESCRIPTION() {
       return this.PRODUCT_DESCRIPTION;
   }
   
   private final ColumnTable ALMA = new ColumnTable("Almacén");
   public ColumnTable getALMA() {
       return this.ALMA;
   }

   private final ColumnTable CADUCIDAD = new ColumnTable("Caducidad");
   public ColumnTable getCADUCIDAD() {
       return this.CADUCIDAD;
   }

   private final ColumnTable CANT = new ColumnTable("Cantidad");
   public ColumnTable getCANT() {
       return this.CANT;
   }

   private final ColumnTable CANTSAL = new ColumnTable("Cantidad Salida");
   public ColumnTable getCANTSAL() {
       return this.CANTSAL;
   }

   private final ColumnTable CONCEP = new ColumnTable("Concepto");
   public ColumnTable getCONCEP() {
       return this.CONCEP;
   }

   private final ColumnTable COSTO = new ColumnTable("Costo");
   public ColumnTable getCOSTO() {
       return this.COSTO;
   }

   private final ColumnTable ENTSAL = new ColumnTable("Entrada/Salida");
   public ColumnTable getENTSAL() {
       return this.ENTSAL;
   }

   private final ColumnTable ESTAC = new ColumnTable("Usuario");
   public ColumnTable getESTAC() {
       return this.ESTAC;
   }

   private final ColumnTable FALT = new ColumnTable("F.Creación");
   public ColumnTable getFALT() {
       return this.FALT;
   }

   private final ColumnTable FMOD = new ColumnTable("F.Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable IDINGRESCAB = new ColumnTable("IDINGRESCAB");
   public ColumnTable getIDINGRESCAB() {
       return this.IDINGRESCAB;
   }

   private final ColumnTable LOTE = new ColumnTable("Lote");
   public ColumnTable getLOTE() {
       return this.LOTE;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Num.Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable PEDIMENTO = new ColumnTable("Pedimento");
   public ColumnTable getPEDIMENTO() {
       return this.PEDIMENTO;
   }

   private final ColumnTable PROD = new ColumnTable("Producto");
   public ColumnTable getPROD() {
       return this.PROD;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

   private final ColumnTable TIPCAMNAC = new ColumnTable("T.C.Nacional");
   public ColumnTable getTIPCAMNAC() {
       return this.TIPCAMNAC;
   }

   private final ColumnTable UNID = new ColumnTable("Unidad");
   public ColumnTable getUNID() {
       return this.UNID;
   }

}