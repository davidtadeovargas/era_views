package com.era.views.tables.headers;

public class BanksTableHeader extends BaseTableHeader {

private final ColumnTable ROWNUMBER = new ColumnTable("No");
   public ColumnTable getROWNUMBER() {
       return this.ROWNUMBER;
   }

   private final ColumnTable ACCOUNT_NUMBER = new ColumnTable("No.Cuenta");
   public ColumnTable getACCOUNT_NUMBER() {
       return this.ACCOUNT_NUMBER;
   }

   private final ColumnTable BANK = new ColumnTable("Banco");
   public ColumnTable getBANK() {
       return this.BANK;
   }

   private final ColumnTable NAME = new ColumnTable("Nombre");
   public ColumnTable getNAME() {
       return this.NAME;
   }
}