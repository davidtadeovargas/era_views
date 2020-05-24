/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.logger.LoggerUtility;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.headers.ColumnTable;
import com.era.views.tables.headers.UsersTableHeader;
import com.era.views.tables.interfaces.ColumnsVisible;
import java.awt.event.AdjustmentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public abstract class BaseJTable extends JTable {

    protected JTableDoubleClic JTableDoubleClic;
    protected JScrollPane JScrollPane;
    protected OnScrollStart OnScrollMinimum;
    protected OnScrollEnd OnScrollBottom;
    protected OnInitScrolls OnInitScrolls;
    protected OnEndScrolls OnEndScrolls;
    private boolean scrollAtStartWhenEnd;
    private ITableRowSelected ITableRowSelected;
    private int prevRowIndex = 0;
    private int lastRowIndex = 0;
    private int pagination = 0;    
    private long count = 0;
    protected boolean tableInitialized;
    protected JTableEnterKeyPressed JTableEnterKeyPressed;
    
    protected List<ColumnTable> ShowColumns = new ArrayList<>();
    
    public abstract void initTable(final List<?> items);
    
    public BaseJTable(AbstractTableModel AbstractTableModel){
        super(AbstractTableModel);
        
        init();
    }
    
    public void setColumnWidth(int indexColumn, int width){
        getColumnModel().getColumn(indexColumn).setPreferredWidth(width);
    }    
    
    public BaseJTable(){
        super();
        
        init();
    }
    
    public void addShowColumn(final ColumnTable ColumnTable){
        this.ShowColumns.add(ColumnTable);
    }

    public void setJTableEnterKeyPressed(JTableEnterKeyPressed JTableEnterKeyPressed) {
        this.JTableEnterKeyPressed = JTableEnterKeyPressed;
    }
    
    public void reloadTable(){
        final BaseAbstractTableModel model = (BaseAbstractTableModel)getModel();
        model.fireTableDataChanged();
    }
    
    
    public void loadScrollpane(){
        
         JScrollPane = new JScrollPane(this);
         
         //Listener when the scrolls is at the end and start of the rows table
        JScrollPane.getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            
            try{
                
                if(OnInitScrolls!=null){
                   OnInitScrolls.onScrolls();
                }
                
                // Check if user has done dragging the scroll bar
                if(!e.getValueIsAdjusting()){
                    JScrollBar scrollBar = (JScrollBar) e.getAdjustable();
                    int extent = scrollBar.getModel().getExtent();
                    int maximum = scrollBar.getModel().getMaximum();
                    int minimum = scrollBar.getModel().getMinimum();
                    int eval  = e.getValue();
                    int val = extent + eval;
                    if( val == maximum){
                        
                        if(OnScrollMinimum!=null){
                            OnScrollMinimum.onScrollMinimum();
                        }
                        
                        if(scrollAtStartWhenEnd){
                            //Reset scrollbar
                            JScrollPane.getVerticalScrollBar().setValue(SwingConstants.TOP);
                        }
                    }
                    else if(val == extent){ //At the very beginning
                        
                        if(OnScrollBottom!=null){
                            OnScrollBottom.onScrollBottom();
                        }
                    }                                         
                }
                
                if(OnEndScrolls!=null){
                    OnEndScrolls.onScrolls();
                }
                        
            }catch(Exception ex){
                LoggerUtility.getSingleton().logError(BaseJTable.class, ex);
            }
        });
    }

    public JScrollPane getJScrollPane() {
        return JScrollPane;
    }        
    
    public final void init(){
    
        //Prevent that columns move
        getTableHeader().setReorderingAllowed(false);
        
        //That table be ordered and when clic in the column also order the rows
        /*final TableRowSorter trs = new TableRowSorter<>((DefaultTableModel) getModel());
        setRowSorter(trs);
        trs.setSortsOnUpdates(true);*/
        
        //Double clic on the table
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table =(JTable) mouseEvent.getSource();
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    if(JTableDoubleClic!=null){
                        JTableDoubleClic.onDoubleClic(table.getSelectedRow());
                    }
                }
            }
        });
        
        //Listener for row selection
        getSelectionModel().addListSelectionListener((ListSelectionEvent lse) -> {
            if(ITableRowSelected!=null){
                
                //Get the selected model
                final int selectedRow = this.getSelectedRow();
                if(selectedRow != -1){
                    BaseAbstractTableModel BaseAbstractTableModel = (BaseAbstractTableModel) this.getModel();
                    final Object Object = BaseAbstractTableModel.getItems().get(selectedRow);

                    //Callback
                    ITableRowSelected.onRowSelected(lse,Object);
                }                
            }
        });
        
        //Listener for keys
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(JTableEnterKeyPressed!=null){
                        final int selectedRow = getSelectedRow();
                        JTableEnterKeyPressed.onKeyPressed(selectedRow);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        });
    }

    public void setITableRowSelected(ITableRowSelected ITableRowSelected) {
        this.ITableRowSelected = ITableRowSelected;
    }
    
    public void clearRows(){
        
        BaseAbstractTableModel model = (BaseAbstractTableModel)this.getModel();
        model.clearRows();
    }

    public void setItems(List<?> items) {
        
        final BaseAbstractTableModel BaseAbstractTableModel = (BaseAbstractTableModel)this.getModel();
        BaseAbstractTableModel.setItems(items);
        
        BaseAbstractTableModel.fireTableDataChanged();
    }
    
    public boolean cointainsRows(){
        return this.getRowCount() > 0;
    }
    
    public void addRows(final List<?> items){
        
        BaseAbstractTableModel BaseAbstractTableModel = (BaseAbstractTableModel)getModel();
        BaseAbstractTableModel.setItems(items);
        
    }

    public void setOnScrollMinimum(OnScrollStart OnScrollMinimum) {
        this.OnScrollMinimum = OnScrollMinimum;
    }

    public void setOnScrollBottom(OnScrollEnd OnScrollBottom) {
        this.OnScrollBottom = OnScrollBottom;
    }

    public void setOnInitScrolls(OnInitScrolls OnInitScrolls) {
        this.OnInitScrolls = OnInitScrolls;
    }

    public void setOnEndScrolls(OnEndScrolls OnEndScrolls) {
        this.OnEndScrolls = OnEndScrolls;
    }
        
    public Object getRowSelected(){
        final int row = this.getSelectedRow();
        final BaseAbstractTableModel BaseAbstractTableModel = (BaseAbstractTableModel)this.getModel();
        return BaseAbstractTableModel.getItem(row);
    }
    
    public boolean isRowSelected(){
        final int row = this.getSelectedRow();
        return row != -1;
    }
    
    public List<?> getRowItems() {
        final BaseAbstractTableModel BaseAbstractTableModel = (BaseAbstractTableModel)this.getModel();
        final List<?> items = BaseAbstractTableModel.getItems();
        return items;
    }
    
    public void setJTableDoubleClic(JTableDoubleClic JTableDoubleClic) {
        this.JTableDoubleClic = JTableDoubleClic;
    }
    
    public interface JTableDoubleClic{
        public void onDoubleClic(int selectedRow);
    }
    
    public interface JTableEnterKeyPressed {
        public void onKeyPressed(int selectedRow);
    }
    
    public interface OnScrollStart{
        public void onScrollMinimum();
    }
    
    public interface OnScrollEnd{
        public void onScrollBottom();
    }
    
    public interface OnInitScrolls{
        public void onScrolls();
    }
    
    public interface OnEndScrolls{
        public void onScrolls();
    }

    public void setScrollAtStartWhenEnd(boolean scrollAtStartWhenEnd) {
        this.scrollAtStartWhenEnd = scrollAtStartWhenEnd;
    }

    public int getPrevRowIndex() {
        return prevRowIndex;
    }

    public int getLastRowIndex() {
        return lastRowIndex;
    }

    public int getPagination() {
        return pagination;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setPagination(int pagination) {
        this.pagination = pagination;
        this.lastRowIndex = this.pagination;
    }

    public void setPrevRowIndex(int prevRowIndex) {
        this.prevRowIndex = prevRowIndex;
    }

    public void setLastRowIndex(int lastRowIndex) {
        this.lastRowIndex = lastRowIndex;
    }
    
    public interface ITableRowSelected{
        public void onRowSelected(final ListSelectionEvent lse, Object Object);
    }

    public boolean isTableInitialized() {
        return tableInitialized;
    }
}
