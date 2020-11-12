package com.era.views.tables.headers;

public class CCountriesTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable AGRUPACIONES = new ColumnTable("Agrupaciones");
   public ColumnTable getAGRUPACIONES() {
       return this.AGRUPACIONES;
   }

   private final ColumnTable FORMATO_REGISTRO_DE_IDENTIDAD_TRIBUTARIA = new ColumnTable("Formato_de_Registro_de_Identidad_Tributaria");
   public ColumnTable getFORMATO_REGISTRO_DE_IDENTIDAD_TRIBUTARIA() {
       return this.FORMATO_REGISTRO_DE_IDENTIDAD_TRIBUTARIA;
   }

   private final ColumnTable VALIDACION_DEL_REGISTRO_DE_IDENTIDAD_TRIBUTARIA = new ColumnTable("Validación_del_Registro_de_Identidad_Tributaria");
   public ColumnTable getVALIDACION_DEL_REGISTRO_DE_IDENTIDAD_TRIBUTARIA() {
       return this.VALIDACION_DEL_REGISTRO_DE_IDENTIDAD_TRIBUTARIA;
   }

   private final ColumnTable C_PAIS = new ColumnTable("País");
   public ColumnTable getC_PAIS() {
       return this.C_PAIS;
   }

   private final ColumnTable DESCRIPTION = new ColumnTable("Descripcion");
   public ColumnTable getDESCRIPTION() {
       return this.DESCRIPTION;
   }

   private final ColumnTable FORMATO_DE_CODIGO_POSTAL = new ColumnTable("Formato CP");
   public ColumnTable getFORMATO_DE_CODIGO_POSTAL() {
       return this.FORMATO_DE_CODIGO_POSTAL;
   }
   
   private final ColumnTable FMOD = new ColumnTable("F.Modificación");
   public ColumnTable getFMOD() {
       return this.FMOD;
   }

   private final ColumnTable NOCAJ = new ColumnTable("Caja");
   public ColumnTable getNOCAJ() {
       return this.NOCAJ;
   }

   private final ColumnTable SUCU = new ColumnTable("Sucursal");
   public ColumnTable getSUCU() {
       return this.SUCU;
   }

}