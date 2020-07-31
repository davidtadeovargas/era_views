package com.era.views.tables.headers;

public class ProductPriceListTableHeader extends BaseTableHeader {

    private final ColumnTable ROWNUMBER = new ColumnTable("No");

    public ColumnTable getROWNUMBER() {
        return this.ROWNUMBER;
    }

    private final ColumnTable CODE = new ColumnTable("Código");
    public ColumnTable getCODE() {
        return this.CODE;
    }
   
    private final ColumnTable LIST = new ColumnTable("Lista");
    public ColumnTable getLIST() {
        return this.LIST;
    }
   
    private final ColumnTable PRICE = new ColumnTable("Precio");
    public ColumnTable getPRICE() {
        return this.PRICE;
    }
}