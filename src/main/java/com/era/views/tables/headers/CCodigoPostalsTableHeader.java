package com.era.views.tables.headers;

public class CCodigoPostalsTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable C_CODIGO_POSTAL = new ColumnTable("c_CodigoPostal");
   public ColumnTable getC_CODIGO_POSTAL() {
       return this.C_CODIGO_POSTAL;
   }

   private final ColumnTable C_ESTADO = new ColumnTable("c_Estado");
   public ColumnTable getC_ESTADO() {
       return this.C_ESTADO;
   }

   private final ColumnTable C_MUNICIPIO = new ColumnTable("c_Municipio");
   public ColumnTable getC_MUNICIPIO() {
       return this.C_MUNICIPIO;
   }

   private final ColumnTable C_LOCALIDAD = new ColumnTable("c_Localidad");
   public ColumnTable getC_LOCALIDAD() {
       return this.C_LOCALIDAD;
   }

   private final ColumnTable FMOD = new ColumnTable("FMOD");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable NOCAJ = new ColumnTable("NOCAJ");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("SUCU");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}