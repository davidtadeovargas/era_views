//Paquete
package com.era.views;

//Importaciones
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import ptovta.Star;
import ptovta.Login;
import ptovta.ConfigBancos;
import java.util.*;

import static ptovta.Princip.bIdle;




/*Clase para controlar formularios en general*/
public class CatalBancos extends javax.swing.JFrame 
{
    /*Declara variables originales globales*/
    private String          sCodOriG;
    private String          sDescripOriG;
    
    /*Declara contadores globales*/
    private int             iContCellEd;
    private int             iContFi;

    /*Variable que contiene el borde actual*/
    private Border          bBordOri;

    /*Para controlar si seleccionar todo o deseleccionarlo de la tabla*/
    private boolean         bSel;
    
    /*Contiene el color original del botón*/
    private java.awt.Color  colOri;
    
    /*Contiene el nombre de la tabla*/
    private String          sTip;
            
    /*Contiene el nombre de la tabla para revisar*/
    private String          sTip2;
    
    /*Contiene el nombre del tipo del campo*/
    private String          sTipC;
    
    /*Contiene el mensaje a mostrar*/
    private String          sTipM;
    
    /*Contiene el nombre para la tabla log*/
    private String          sTipL;
    
    /*Contiene el nombre del campo de la tabla principal*/
    private String          sTipCod;
    
    private   Map <String,String> pa= new HashMap<>(); 
    
    private String instancia,usuario,password;
    
    /*Constructor sin argumentos*/
    public CatalBancos(String sTip, String sTip2, String sTipC, String sTipM, String sTipL, String sTipCod) 
    {
        /*Inicaliza los componentes gráficos*/
        initComponents();
        
        /*Se toma el nombre de la tabla*/
        this.sTip   =   sTip;
        
        /*Se toma el nombre de la tabla*/
        this.sTip2  =   sTip2;
        
        /*Se toma el nombre del campo*/
        this.sTipC  =   sTipC;
        
        /*Se toma el mensaje a mostrar*/
        this.sTipM  =   sTipM;
        
        /*Se toma el nombre del log*/
        this.sTipL  =   sTipL;
        
        /*Se toma el nombre del log*/
        this.sTipCod=   sTipCod;
        
        /*Establece el botón por default*/
        this.getRootPane().setDefaultButton(jBNew);
        
        /*Obtiene el color original que deben tener los botones*/
        colOri  = jBSal.getBackground();
        
        /*Que las comlumnas de la tabla no se muevan*/
        jTab.getTableHeader().setReorderingAllowed(false);
        
        /*Esconde el link de ayuda*/
        jLAyu.setVisible(false);
        
        /*Centra la ventana*/
        this.setLocationRelativeTo(null);
        
        /*Inicialmente esta deseleccionada la tabla*/
        bSel        = false;
        
        /*Inicializa el contador de filas en uno*/
        iContFi      = 1;

        //Establece el ícono de la forma
        Star.vSetIconFram(this);
        
        /*Si viene de clasificaciones proveedores entonces*/
        if(this.sTipL.compareTo("clasprov")==0) 
            sTipM   = "clasificación de proveedores";
        if(this.sTipM.compareTo("concepto general")==0) 
            this.setTitle("Catálogo general, Usuario: <" + Login.usuario + "> " + Login.sFLog);
        else if(this.sTipM.compareTo("concepto de giro")==0)
            this.setTitle("Catálogo de giros, Usuario: <" + Login.usuario + "> " + Login.sFLog);
        else
        /*Establece el titulo de la ventana con El usuario, la fecha y hora*/
            this.setTitle("Catálogo de "+sTipM+", Usuario: <" + Login.usuario + "> " + Login.sFLog);
        /*Para que la tabla este ordenada al mostrarce y al dar clic en el nombre de la columna*/
        
        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)jTab.getModel());
        jTab.setRowSorter(trs);
        trs.setSortsOnUpdates(true);
        
        /*Pon el foco del teclado en el campo de edición de código de la color*/
        jTCod.grabFocus();
        
        /*Establece el tamaño de las columnas de la tabla*/
        jTab.getColumnModel().getColumn(2).setPreferredWidth(250);
        
        /*Activa en la tabla que se usen normamente las teclas de tabulador*/
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
        
        /*Incializa el contador del cell editor*/
        iContCellEd = 1;
                
        /*Obtiene de la base de datos todos los registros y cargalos en la tabla*/
        vCargCat();
        
        CargarListadoBancos();
        //Declara las variables final
        final String sTipFi     = sTip;
        final String sTipCodFi  = sTipCod;
        final String sTipLFi    = sTipL;
                                                
        /*Crea el listener para la tabla, para cuando se modifique una celda guardarlo en la base de datos el cambio*/
        PropertyChangeListener pr; 
        pr = new PropertyChangeListener() 
        {
            @Override
            public void propertyChange(PropertyChangeEvent event) 
            {
                //Si no hay selección entonces que regresa
                if(jTab.getSelectedRow()==-1)
                    return;

                /*Obtén la propiedad que a sucedio en el control*/
                String pro = event.getPropertyName();                                
                                
                /*Si el evento fue por entrar en una celda del tabla*/
                if("tableCellEditor".equals(pro)) 
                {
                    /*Si el contador de cell editor está en 1 entonces que lea el valor original que estaba ya*/
                    if(iContCellEd==1)
                    {                                            
                        /*Obtén algunos datos originales de la fila*/                        
                        sCodOriG            = jTab.getValueAt(jTab.getSelectedRow(), 1).toString();                                                                                  
                        sDescripOriG        = jTab.getValueAt(jTab.getSelectedRow(), 2).toString();                                                                                                          
                        
                        /*Aumenta en uno el contador de celleditor*/
                        ++iContCellEd;
                    }
                    /*Else, el contador de cell editor es 2, osea que va de salida*/
                    else                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                    {
                        /*Reinicia el conteo*/
                        iContCellEd         = 1;
                            
                        /*Obtén la descripción seleccionada*/                                                
                        String sDescrip     = jTab.getValueAt(jTab.getSelectedRow(), 2).toString();
                        
                        /*Coloca los valores origianales*/
                        jTab.setValueAt(sCodOriG,       jTab.getSelectedRow(), 1);
                                            
                        /*Si la descrición es cadena vacia entonces que sea la que tenía antes*/
                        if(sDescrip.compareTo("")==0)
                            sDescrip        = sDescripOriG;
                        
                        /*Coloca la descripción en su campo*/
                        jTab.setValueAt(sDescrip, jTab.getSelectedRow(), 2);                                                

                        //Abre la base de datos                             
                        Connection  con = Star.abre_base_datos(false, true);

                        //Si hubo error entonces regresa
                        if(con==null)
                            return;

                        /*Declara variables del base de datos*/    
                        Statement   st;                        
                        String      sQ;                        
                                                
                        /*Actualiza en la base de datos la descripción*/
                        try 
                        {                                                        
                            sQ = "UPDATE "+ sTipFi +" SET "
                                    + "descrip                  = '" + sDescrip.replace("'", "''").replace(",", "") + "', "
                                    + "fmod                     = now(), "
                                    + "estac                    = '" + Login.usuario.replace("'", "''") + "', "
                                    + "sucu                     = '" + Star.sSucu.replace("'", "''") + "', "
                                    + "nocaj                    = '" + Star.sNoCaj.replace("'", "''") + "' "
                                    + "WHERE " + sTipCodFi + "  = '" + sCodOriG.replace("'", "''") + "'" 
                                    + "AND idempresa = " + Login.codigo_empresa;                                                
                            st = con.createStatement();
                            st.executeUpdate(sQ);
                         }
                         catch(SQLException expnSQL) 
                         { 
                            //Procesa el error y regresa
                            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
                            return;                        
                         }                                                                                     

                        /*Inserta en log*/
                        try 
                        {            
                            sQ = "INSERT INTO log" + sTipLFi + "(           cod,                                                                                                                             descrip,                                                accio,               estac,                                     sucu,                                     nocaj,                                falt,      idempresa) " + 
                                                            "VALUES('" +    jTab.getValueAt(jTab.getSelectedRow(), 1).toString().replace(" ", "").trim().replace("'", "''").replace(",", "") + "','" +       sDescrip.replace("'", "''").replace(",", "") + "',      'MODIFICAR', '" +    Login.usuario.replace("'", "''") + "','" +   Star.sSucu.replace("'", "''") + "','" +   Star.sNoCaj.replace("'", "''") + "',  now(), " + Login.codigo_empresa + " )";                                
                            st = con.createStatement();
                            st.executeUpdate(sQ);
                         }
                         catch(SQLException expnSQL) 
                         { 
                            //Procesa el error y regresa
                            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
                            return;                        
                        }

                        //Termina la transacción
                        if(Star.iTermTransCon(con)==-1)
                            return;

                        //Cierra la base de datos
                        Star.iCierrBas(con);
                        
                    }/*Fin de else*/                                                
                                        
                }/*Fin de if("tableCellEditor".equals(property)) */
                
            }/*Fin de public void propertyChange(PropertyChangeEvent event) */
            
        };
        
        /*Establece el listener para la tabla*/
        jTab.addPropertyChangeListener(pr);
        
    }/*Fin de public PlanGralCat() */

    
    private void CargarListadoBancos(){
        Connection con = Star.abre_base_datos(true, false);
        String sQ = "";
        Statement st;
        ResultSet rs;
        
        if (con==null) {
            return;
        }
        
        jCBancos.removeAllItems();
        jCBancos.addItem("");
        
        try
        {
            sQ = "Select descripcion from c_banco order by descripcion";
            st = con.createStatement();
            rs = st.executeQuery(sQ);
            /*Si hay datos*/
            while(rs.next())
            {
                jCBancos.addItem(rs.getString("descripcion"));
            }                        
        }
        catch(SQLException expnSQL)
        {
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;                        
        }
        
        Star.iCierrBas(con);
    }
    
    /*Obtiene de la base de datos todos los registros y cargalos en la tabla*/
    private void vCargCat()
    {
        //Abre la base de datos                             
        Connection  con = Star.abre_base_datos(true, false);

        //Si hubo error entonces regresa
        if(con==null)
            return;
        
        /*Crea el modelo para cargar cadenas en el*/
        DefaultTableModel te = (DefaultTableModel)jTab.getModel();                    

        //Declara variables de la base de datos    
        Statement   st;
        ResultSet   rs;
        String      sQ;        
    
        /*Trae todas las registros de la base de datos y cargalos en la tabla*/
        try
        {
            sQ = "SELECT " + sTipCod + ", descrip FROM " + sTip + " WHERE " + sTipCod + " != '-' AND idempresa = " + Login.codigo_empresa;
            st = con.createStatement();
            rs = st.executeQuery(sQ);
            /*Si hay datos*/
            while(rs.next())
            {
                /*Agregalo a la tabla*/
                Object nu[]         = {iContFi, rs.getString(sTipCod), rs.getString("descrip")};
                te.addRow(nu);
                
                /*Aumenta en uno el contador de filas el contador de filas en uno*/
                ++iContFi;       
            }                        
        }
        catch(SQLException expnSQL)
        {
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;                        
        }            
        
        //Cierra la base de datos
        Star.iCierrBas(con);
                
    }/*Fin de private void vCargCat()*/
            
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jTCod = new javax.swing.JTextField();
        jBNew = new javax.swing.JButton();
        jTDescrip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMosT = new javax.swing.JButton();
        jBActua = new javax.swing.JButton();
        jBTab1 = new javax.swing.JButton();
        jLAyu = new javax.swing.JLabel();
        jBTod = new javax.swing.JButton();
        jBImportar = new javax.swing.JButton();
        jBNew1 = new javax.swing.JButton();
        jCBancos = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTrfc = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del5.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar ");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBActua);
        jBDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDelMouseExited(evt);
            }
        });
        jBDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelActionPerformed(evt);
            }
        });
        jBDel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDelKeyPressed(evt);
            }
        });
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("*Banco:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setName(""); // NOI18N
        jBSal.setNextFocusableComponent(jTCod);
        jBSal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalMouseExited(evt);
            }
        });
        jBSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalActionPerformed(evt);
            }
        });
        jBSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSalKeyPressed(evt);
            }
        });
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 160, -1));

        jTCod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCod.setNextFocusableComponent(jTDescrip);
        jTCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodFocusLost(evt);
            }
        });
        jTCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCodKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCodKeyTyped(evt);
            }
        });
        jP1.add(jTCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 20));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo ");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jTab);
        jBNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNewMouseExited(evt);
            }
        });
        jBNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewActionPerformed(evt);
            }
        });
        jBNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBNewKeyPressed(evt);
            }
        });
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 90, 20));

        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescrip.setNextFocusableComponent(jBNew);
        jTDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripFocusLost(evt);
            }
        });
        jTDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescripActionPerformed(evt);
            }
        });
        jTDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescripKeyPressed(evt);
            }
        });
        jP1.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 270, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("*N°.Cuenta");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));
        jLabel3.getAccessibleContext().setAccessibleName("No.Cuenta:");

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "No. Cuenta", "Banco", "RFC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 470, 250));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jBBusc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBuscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBuscMouseExited(evt);
            }
        });
        jBBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscActionPerformed(evt);
            }
        });
        jBBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBBuscKeyPressed(evt);
            }
        });
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosT);
        jTBusc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBuscFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBuscFocusLost(evt);
            }
        });
        jTBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscKeyPressed(evt);
            }
        });
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 190, 20));

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosT.setNextFocusableComponent(jBDel);
        jBMosT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMosTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMosTMouseExited(evt);
            }
        });
        jBMosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMosTActionPerformed(evt);
            }
        });
        jBMosT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBMosTKeyPressed(evt);
            }
        });
        jP1.add(jBMosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 140, 20));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar ");
        jBActua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBActua.setNextFocusableComponent(jBSal);
        jBActua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBActuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBActuaMouseExited(evt);
            }
        });
        jBActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActuaActionPerformed(evt);
            }
        });
        jBActua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBActuaKeyPressed(evt);
            }
        });
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 160, 30));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jBTab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTab1ActionPerformed(evt);
            }
        });
        jBTab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTab1KeyPressed(evt);
            }
        });
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 10, 20));

        jLAyu.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLAyu.setForeground(new java.awt.Color(0, 51, 204));
        jLAyu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAyu.setText("http://Ayuda en Lìnea");
        jLAyu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLAyuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLAyuMouseExited(evt);
            }
        });
        jP1.add(jLAyu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 120, 30));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTab);
        jBTod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBTodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBTodMouseExited(evt);
            }
        });
        jBTod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTodActionPerformed(evt);
            }
        });
        jBTod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTodKeyPressed(evt);
            }
        });
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 130, 18));

        jBImportar.setBackground(new java.awt.Color(255, 255, 255));
        jBImportar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBImportar.setForeground(new java.awt.Color(0, 102, 0));
        jBImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/212import.png"))); // NOI18N
        jBImportar.setText("Importar");
        jBImportar.setToolTipText("Importar");
        jBImportar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBImportar.setNextFocusableComponent(jBActua);
        jBImportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBImportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBImportarMouseExited(evt);
            }
        });
        jBImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImportarActionPerformed(evt);
            }
        });
        jBImportar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBImportarKeyPressed(evt);
            }
        });
        jP1.add(jBImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 160, 30));

        jBNew1.setBackground(new java.awt.Color(255, 255, 255));
        jBNew1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew1.setForeground(new java.awt.Color(0, 102, 0));
        jBNew1.setText("Configuración");
        jBNew1.setToolTipText("Configuración");
        jBNew1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew1.setNextFocusableComponent(jTab);
        jBNew1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNew1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNew1MouseExited(evt);
            }
        });
        jBNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNew1ActionPerformed(evt);
            }
        });
        jBNew1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBNew1KeyPressed(evt);
            }
        });
        jP1.add(jBNew1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 160, 20));

        jCBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBancosActionPerformed(evt);
            }
        });
        jP1.add(jCBancos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Nombre:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 170, -1));

        jTrfc.setEnabled(false);
        jTrfc.setFocusable(false);
        jP1.add(jTrfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*Cuando se presiona el botón de borrar*/
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
                                        
        /*Si no hay selección en la tabla no puede seguir*/
        if(jTab.getSelectedRow()==-1)
        {
            /*Mensajea*/
            JOptionPane.showMessageDialog(null, "No has seleccionado un(a) "+ sTipM +" de la lista para borrar.", "Borrar "+ sTipM , JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));
            
            /*Coloca el foco del teclado en la tabla y regresa*/
            jTab.grabFocus();            
            return;            
        }
        
        /*Preguntar al usuario si esta seguro de querer borrar*/
        Object[] op = {"Si","No"};
        int iRes    = JOptionPane.showOptionDialog(this, "¿Seguro que quiere borrar el(los) "+ sTipM +"(s/es)?", "Borrar "+ sTipM, JOptionPane.YES_NO_OPTION,  JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconDu)), op, op[0]);
        if(iRes==JOptionPane.NO_OPTION || iRes==JOptionPane.CLOSED_OPTION)
            return;
                
        //Abre la base de datos                             
        Connection  con = Star.abre_base_datos(false, false);

        //Si hubo error entonces regresa
        if(con==null)
            return;
        
        /*Para saber si hubo cambios*/
        boolean bMov    = false;

        //Declara variables de la base de datos    
        Statement   st;
        ResultSet   rs;
        String      sQ;        
        
        /*Recorre toda la selección del usuario*/
        int iSel[] = jTab.getSelectedRows();
        DefaultTableModel tm  = (DefaultTableModel)jTab.getModel();
        for(int x = iSel.length - 1; x >= 0; x--)
        {
            /*Si la clasificación que quiere borrar es la genérica entonces*/
            if(jTab.getValueAt(iSel[x], 1).toString().compareTo("SYS")==0 && (sTip.compareTo("clasprov")==0 || sTip.compareTo("concepnot")==0))
            {
                /*Mensajea y continua*/
                JOptionPane.showMessageDialog(null, "No se puede eliminar la clasificación genérica.", "Clasificación", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));                                 
                continue;
            }

            //Inicia la transacción
            if(Star.iIniTransCon(con)==-1)
                return;

            /*Borra el registro*/
            try 
            {                
                sQ = "DELETE FROM " + sTip + " WHERE " + sTipCod + " = '" + jTab.getValueAt(iSel[x], 1).toString() + "' and idempresa = " + Login.codigo_empresa;                                            
                st = con.createStatement();
                st.executeUpdate(sQ);
             }
             catch(SQLException expnSQL) 
             { 
                //Procesa el error y regresa
                Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
                return;                        
             }                        
           
            /*Inserta en log de la tabla*/
            try 
            {            
                sQ = "INSERT INTO log" + sTipL + "(cod,                                                                      descrip,                                                                accio,                  estac,                          sucu,        nocaj,            falt,      idempresa) " + 
                            "VALUES('" + jTab.getValueAt(iSel[x], 1).toString().replace("'", "''") + "', '" +       jTab.getValueAt(iSel[x], 2).toString().replace("'", "''") + "',         'BORRAR',       '" +    Login.usuario + "',   '" +    Star.sSucu + "',  '" +    Star.sNoCaj + "', now(), " + Login.codigo_empresa + ")";                                
                st = con.createStatement();
                st.executeUpdate(sQ);
            }
            catch(SQLException expnSQL) 
            { 
                //Procesa el error y regresa
                Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
                return;                        
            }
            
            //Termina la transacción
            if(Star.iTermTransCon(con)==-1)
                return;

            /*Coloca la bandera para saber que si hubo movimientos*/
            bMov    = true;
            
            /*Borralo de la tabla*/            
            tm.removeRow(iSel[x]);
            
            /*Resta en uno el contador de filas el contador de filas en uno*/
            --iContFi;
        }                                   
                       
        //Cierra la base de datos
        if(Star.iCierrBas(con)==-1)
            return;
        
        /*Mensajea de éxito*/
        if(bMov)
            JOptionPane.showMessageDialog(null, sTipM +"(s/es) borrado(s) con éxito.", sTipM, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd))); 
        
    }//GEN-LAST:event_jBDelActionPerformed
   
   
    /*Cuando se presiona una tecla en el formulario*/
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_formKeyPressed

   
    /*Cuando se presiona una tecla en el botón de borrar*/
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jBDelKeyPressed
    
    
    /*Cuando se presiona una tecla en el panel*/
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jP1KeyPressed

    
    /*Cuando se presiona el botón de salir*/
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
        /*Pregunta al usuario si esta seguro de salir*/                
        Object[] op = {"Si","No"};
        if((JOptionPane.showOptionDialog(this, "¿Seguro que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION,  JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconDu)), op, op[0])) == JOptionPane.YES_OPTION)
        {
            /*Llama al recolector de basura y cierra la forma*/
            System.gc();                   
            this.dispose();            
        }
        
    }//GEN-LAST:event_jBSalActionPerformed

    
    /*Cuando se presiona una tecla en el botón salir*/
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jBSalKeyPressed

    
    /*Cuando se presiona una tecla en el botón de agregar*/
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jBNewKeyPressed

    
    /*Cuando se presiona una tecla en el campo de edición*/
    private void jTCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodKeyPressed

        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jTCodKeyPressed

    
    /*Cuando se gana el foco del teclado en el campo de edición*/
    private void jTCodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodFocusGained
        
        /*Selecciona todo el texto cuando gana el foco*/
        jTCod.setSelectionStart(0);jTCod.setSelectionEnd(jTCod.getText().length());        
        
    }//GEN-LAST:event_jTCodFocusGained

    
    /*Cuando se presiona una tecla en el campo de descripción*/
    private void jTDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripKeyPressed

        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jTDescripKeyPressed

    
    /*Cuando se presiona una  tecla en la tabla*/
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jTabKeyPressed

    
    /*Cuando se gana el foco del teclado en el campo de edición de texto de descripción*/
    private void jTDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusGained
        
        /*Selecciona todo el texto cuando gana el foco*/
        jTDescrip.setSelectionStart(0);jTDescrip.setSelectionEnd(jTDescrip.getText().length());        
        
    }//GEN-LAST:event_jTDescripFocusGained

    
    /*Cuando se pierde el foco del teclado en el campo codigo*/
    private void jTCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodFocusLost

        /*Coloca el caret en la posiciòn 0*/
        jTCod.setCaretPosition(0);
        
        /*Coloca el borde negro si tiene datos, caso contrario de rojo*/                               
        if(jTCod.getText().compareTo("")!=0)
            jTCod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,255)));
               
    }//GEN-LAST:event_jTCodFocusLost

    
    /*Cuando se pierde el foco del teclado en el campo de descripción*/
    private void jTDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusLost

        /*Coloca el caret en la posiciòn 0*/
        jTDescrip.setCaretPosition(0);
        
        /*Coloca el borde negro si tiene datos, caso contrario de rojo*/                               
        if(jTDescrip.getText().compareTo("")!=0)
            jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,255)));
        
        /*Si el campo excede la cantidad de caes permitidos recortalo*/
        if(jTDescrip.getText().length()> 255)
            jTDescrip.setText(jTDescrip.getText().substring(0, 255));
        
    }//GEN-LAST:event_jTDescripFocusLost
            
    
    /*Cuando se presiona el botón de agregar*/
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
                                                
        /*Si hay cadena vacia en el campo del código no puede continuar*/
        if(jTCod.getText().replace(" ", "").trim().compareTo("")==0)
        {
            /*Coloca el borde rojo*/                               
            jTCod.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
            
            /*Mensajea*/
            JOptionPane.showMessageDialog(null, "El código esta vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));
            
            /*Pon el foco del teclado en el campo de edición y regresa*/
            jTCod.grabFocus();            
            return;            
        }
        
        /*Si hay cadena vacia en el campo de descripción de la color no puede continuar*/
        if(jTDescrip.getText().compareTo("")==0)
        {
            /*Coloca el borde rojo*/                               
            jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
            
            /*Mensajea*/
            JOptionPane.showMessageDialog(null, "El campo de descripción esta vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));
            
            /*Pon el foco del teclado en el campo de edición y regresa*/
            jTDescrip.grabFocus();                        
            return;            
        }
        
        /*Pregunta al usuario si están bien los datos*/                
        Object[] op = {"Si","No"};
        int iRes    = JOptionPane.showOptionDialog(this, "¿Seguro que están bien los datos?", "Agregar "+ sTipM, JOptionPane.YES_NO_OPTION,  JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconDu)), op, op[0]);
        if(iRes==JOptionPane.NO_OPTION || iRes==JOptionPane.CLOSED_OPTION)
            return;
                
        //Abre la base de datos                             
        Connection  con = Star.abre_base_datos(false, false);

        //Si hubo error entonces regresa
        if(con==null)
            return;
        
        //Declara variables de la base de datos    
        Statement   st;
        ResultSet   rs;
        String      sQ;        
        
        /*Checa si el código del registro ya existe en la base de datos*/        
        try
        {
            sQ = "SELECT " + sTipCod + " FROM " + sTip + " WHERE " + sTipCod + " = '" + jTCod.getText().replace(" ", "").trim() + "' and idempresa = " + Login.codigo_empresa;
            st = con.createStatement();
            rs = st.executeQuery(sQ);
            /*Si hay datos*/
            if(rs.next())
            {
                //Cierra la base de datos
                if(Star.iCierrBas(con)==-1)
                    return;
                
                /*Coloca el borde rojo*/                               
                jTCod.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
                
                /*Avisa al usuario*/
                JOptionPane.showMessageDialog(null, "El código: " + jTCod.getText().replace(" ", "").trim() + " ya existe.", "Registro existente", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd))); 

                /*Pon el foco del teclado en el campo del código y regresa*/
                jTCod.grabFocus();               
                return;
            }
        }
        catch(SQLException expnSQL)
        {
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;                        
        }        
        
        //Inicia la transacción
        if(Star.iIniTransCon(con)==-1)
            return;
        
        /*Guarda los datos en la base de datos*/
        try 
        {            
            sQ = "INSERT INTO " + sTip + "(" + sTipCod + ",                                                                      descrip,                                        falt,           estac,                                          sucu,                  nocaj,                                   idempresa) " + 
                       "VALUES('" + jTCod.getText().replace(" ", "").trim().replace("'", "''") + "','" +      jTDescrip.getText().replace("'", "''") + "',        now(), '" +     Login.usuario.replace("'", "''") + "','" +    Star.sSucu.replace("'", "''") + "','" +   Star.sNoCaj.replace("'", "''") + "', " + Login.codigo_empresa + ")";                                           
            st = con.createStatement();
            st.executeUpdate(sQ);
         }
         catch(SQLException expnSQL) 
         { 
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;                        
         }
        
        /*Inserta en log de personal de la tabla*/
        try 
        {            
            sQ = "INSERT INTO log" + sTipL + "(cod,                                              descrip,                                            accio,          estac,                              sucu,                   nocaj,          falt,      idempresa) " + 
                                 "VALUES('" + jTCod.getText().replace(" ", "").trim() + "', '" + jTDescrip.getText().replace("'", "''") + "',        'AGREGAR',      '" + Login.usuario + "',  '" +    Star.sSucu + "',  '" + Star.sNoCaj + "',    now(), " + Login.codigo_empresa + ")";                                
            st = con.createStatement();
            st.executeUpdate(sQ);
        }
        catch(SQLException expnSQL) 
        { 
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;                        
        }

        //Termina la transacción
        if(Star.iTermTransCon(con)==-1)
            return;
        
        //Cierra la base de datos
        if(Star.iCierrBas(con)==-1)
            return;
                    
        /*Agrega el registro en la tabla*/
        DefaultTableModel te = (DefaultTableModel)jTab.getModel();
        Object nu[]= {iContFi, jTCod.getText().replace(" ", "").trim(), jTDescrip.getText()};
        te.addRow(nu);
        
        /*Aumenta en uno el contador de filas el contador de filas en uno*/
        ++iContFi;
        
        /*Pon el foco del teclado en el campo del código*/
        jTCod.grabFocus();
        
        /*Mensajea de éxito*/
        JOptionPane.showMessageDialog(null, sTipM + ": " + jTDescrip.getText() + " agregado con éxito.", "Exito al agregar", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));                    
        
        /*Resetea los campos*/
        jTCod.setText       ("");
        jTDescrip.setText   ("");
        
    }//GEN-LAST:event_jBNewActionPerformed

    
    /*Cuando se tipea una tecla en el campo*/
    private void jTCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodKeyTyped
        
        /*Si el carácter introducido es minúscula entonces colocalo en el campo con mayúsculas*/
        if(Character.isLowerCase(evt.getKeyChar()))       
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));                              
        
    }//GEN-LAST:event_jTCodKeyTyped
        
    
    /*Cuando se gana el foco del teclado en el campo de buscar*/
    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained

        /*Establece el botón por default*/
        this.getRootPane().setDefaultButton(jBBusc);
        
        /*Selecciona todo el texto cuando gana el foco*/
        jTBusc.setSelectionStart(0);jTBusc.setSelectionEnd(jTBusc.getText().length());
        
    }//GEN-LAST:event_jTBuscFocusGained

    
    /*Cuando se presiona una tecla en el campo de buscar*/
    
    /*Cuando se presiona una tecla en el botón de mostrar todo*/
    private void jBMosTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMosTKeyPressed

        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jBMosTKeyPressed

    
    /*Función para cargar nuevamente todos los elementos en la tabla*/
    private void vCargT()
    {
        /*Borra todos los item en la tabla*/
        DefaultTableModel dm = (DefaultTableModel)jTab.getModel();
        dm.setRowCount(0);
        
        /*Resetea el contador de filas*/
        iContFi = 1;
        
        /*Obtiene de la base de todos datos y cargalos en la tabla*/
        vCargCat();
        
        /*Vuelve a poner el foco del teclaod en el campo de buscar*/
        jTBusc.grabFocus();
        
    }/*Fin de private void vCargT()*/
    
    
    /*Cuando se presiona el botón de mostrar todo*/
    private void jBMosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMosTActionPerformed
        
        /*Función para cargar nuevamente todos los elementos en la tabla*/
        vCargT();
        
    }//GEN-LAST:event_jBMosTActionPerformed

    
    /*Cuando se presiona el botón de buscar*/
    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed
                        
        /*Si el campo de buscar esta vacio no puede seguir*/
        if(jTBusc.getText().compareTo("")==0)
        {
            /*Coloca el borde rojo*/                               
            jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
            
            /*Mensajea*/
            JOptionPane.showMessageDialog(null, "El campo de búsqueda esta vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));

            /*Coloca el foco del teclado en el campo de búsqueda y regresa*/
            jTBusc.grabFocus();           
            return;
        }                      
                
        //Abre la base de datos                             
        Connection  con = Star.abre_base_datos(true, false);

        //Si hubo error entonces regresa
        if(con==null)
            return;
        
        /*Borra todos los item en la tabla*/
        DefaultTableModel dm = (DefaultTableModel)jTab.getModel();
        dm.setRowCount(0);
        
         /*Resetea el contador de filas*/
        iContFi             = 1;

        //Declara variables de la base de datos
        Statement   st;
        ResultSet   rs;        
        String      sQ; 
        
        /*Obtiene de la base todos lo datos*/        
        try
        {                  
            sQ = "SELECT * FROM " + sTip + " WHERE (" + sTipCod + " LIKE('%" + jTBusc.getText().replace(" ", "%") + "%') OR descrip LIKE('%" + jTBusc.getText().replace(" ", "%") + "%') OR falt LIKE('%" + jTBusc.getText().replace(" ", "%") + "%') OR fmod LIKE('%" + jTBusc.getText().replace(" ", "%") + "%')) AND idempresa = " + Login.codigo_empresa;
            st = con.createStatement();
            rs = st.executeQuery(sQ);
            /*Si hay datos*/
            while(rs.next())
            {
                /*Agrega los resultados en la tabla*/
                DefaultTableModel te    = (DefaultTableModel)jTab.getModel();
                Object nu[]             = {iContFi, rs.getString(sTipCod), rs.getString("descrip")};
                te.addRow(nu);

                /*Aumenta en uno el contador de filas*/
                ++iContFi;                                
            }                        
        }
        catch(SQLException expnSQL)
        {
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;                        
        }
        
        //Cierra la base de datos
        if(Star.iCierrBas(con)==-1)
            return;
        
        /*Vuelve a poner el foco del teclaod en el campo de buscar*/
        jTBusc.grabFocus();
        
    }//GEN-LAST:event_jBBuscActionPerformed

    
    //Cuando se presuiona el botón de actualizar
    private void jBActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActuaActionPerformed

        /*Función para cargar todos los elementos en la tabla*/
        vCargT();

    }//GEN-LAST:event_jBActuaActionPerformed

    
    /*Cuando se presiona una tecla en el botón de actualizar*/
    private void jBActuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActuaKeyPressed

        //Llama a la función escalable
        vKeyPreEsc(evt);

    }//GEN-LAST:event_jBActuaKeyPressed

    
    /*Cuando se arrastra el mouse en la forma*/
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
    }//GEN-LAST:event_formMouseDragged

    
    /*Cuando se mueve el ratón en la forma*/
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
    }//GEN-LAST:event_formMouseMoved

    
    /*Cuando se mueve la rueda del ratón en la forma*/
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
    }//GEN-LAST:event_formMouseWheelMoved

            
    /*Cuando se presiona el botón de ver tabla en grande*/
    private void jBTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab1ActionPerformed

        //Muestra la tabla maximizada
        Star.vMaxTab(jTab);       

    }//GEN-LAST:event_jBTab1ActionPerformed

    
    /*Cuando se presiona una tecla en el botón de ver tabla*/
    private void jBTab1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab1KeyPressed

        //Llama a la función escalable
        vKeyPreEsc(evt);

    }//GEN-LAST:event_jBTab1KeyPressed

    
    /*Cuando se presiona una tecla en el botón de búscar*/
    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jBBuscKeyPressed

    
    /*Cuando se presiona una tecla en el campo de búscar*/
    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed

        /*Si se presionó enter entonces presiona el botón de búsqueda y regresa*/
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            jBBusc.doClick();
            return;
        }
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_jTBuscKeyPressed

    
    /*Cuando el mouse sale del botón de búscar*/
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited

        /*Cambia el color del fondo del botón al original*/
        jBBusc.setBackground(colOri);
        
        /*Coloca el borde que tenía*/
        jBBusc.setBorder(bBordOri);
        
    }//GEN-LAST:event_jBBuscMouseExited

    
    /*Cuando el mouse entra en el botón de búscar*/
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
        
        /*Cambia el color del fondo del botón*/
        jBBusc.setBackground(Star.colBot);
        
        /*Guardar el borde original que tiene el botón*/
        bBordOri    = jBBusc.getBorder();
                
        /*Aumenta el grosor del botón*/
        jBBusc.setBorder(new LineBorder(Color.GREEN, 3));
        
    }//GEN-LAST:event_jBBuscMouseEntered

    
    /*Cuando el mouse entra en el campo del link de ayuda*/
    private void jLAyuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAyuMouseEntered
        
        /*Cambia el cursor del ratón*/
        this.setCursor( new Cursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_jLAyuMouseEntered

    
    /*Cuando el mouse sale del campo del link de ayuda*/
    private void jLAyuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAyuMouseExited
        
        /*Cambia el cursor del ratón al que tenía*/
        this.setCursor( new Cursor(Cursor.DEFAULT_CURSOR));	
                
    }//GEN-LAST:event_jLAyuMouseExited

    
    /*Cuando se presiona el botón de seleccionar todo*/
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed

        /*Si la tabla no contiene elementos entonces regresa*/
        if(jTab.getRowCount()==0)
            return;
        
        /*Si están seleccionados los elementos en la tabla entonces*/
        if(bSel)
        {
            /*Coloca la bandera y deseleccionalos*/
            bSel    = false;
            jTab.clearSelection();
        }
        /*Else deseleccionalos y coloca la bandera*/
        else
        {
            bSel    = true;
            jTab.setRowSelectionInterval(0, jTab.getModel().getRowCount()-1);
        }

    }//GEN-LAST:event_jBTodActionPerformed

    
    /*Cuando se presiona una tecla en el botón de seleccionar todo*/
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

        //Llama a la función escalable
        vKeyPreEsc(evt);

    }//GEN-LAST:event_jBTodKeyPressed

    
    /*Cuando se esta saliendo de la forma*/
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        /*Presiona el botón de salir*/
        jBSal.doClick();
        
    }//GEN-LAST:event_formWindowClosing

    
    /*Cuando el mouse entra en el botón específico*/
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
        /*Cambia el color del fondo del botón*/
        jBNew.setBackground(Star.colBot);
        
    }//GEN-LAST:event_jBNewMouseEntered

    
    /*Cuando el mouse entra en el botón específico*/
    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered
        
        /*Cambia el color del fondo del botón*/
        jBTod.setBackground(Star.colBot);
        
    }//GEN-LAST:event_jBTodMouseEntered

    
    /*Cuando el mouse entra en el botón específico*/
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
        /*Cambia el color del fondo del botón*/
        jBDel.setBackground(Star.colBot);
        
    }//GEN-LAST:event_jBDelMouseEntered

    
    /*Cuando el mouse entra en el botón específico*/
    private void jBActuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseEntered
        
        /*Cambia el color del fondo del botón*/
        jBActua.setBackground(Star.colBot);
        
    }//GEN-LAST:event_jBActuaMouseEntered

    
    
    /*Cuando el mouse entra en el botón específico*/
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
        /*Cambia el color del fondo del botón*/
        jBSal.setBackground(Star.colBot);
        
    }//GEN-LAST:event_jBSalMouseEntered

    
    /*Cuando el mouse entra en el botón específico*/
    private void jBMosTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMosTMouseEntered
        
        /*Cambia el color del fondo del botón*/
        jBMosT.setBackground(Star.colBot);
        
    }//GEN-LAST:event_jBMosTMouseEntered

    
    /*Cuando el mouse sale del botón específico*/
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
        /*Cambia el color del fondo del botón al original*/
        jBNew.setBackground(colOri);
        
    }//GEN-LAST:event_jBNewMouseExited

    
    /*Cuando el mouse sale del botón específico*/
    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited
        
        /*Cambia el color del fondo del botón al original*/
        jBTod.setBackground(colOri);
        
    }//GEN-LAST:event_jBTodMouseExited

    
    /*Cuando el mouse sale del botón específico*/
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
        /*Cambia el color del fondo del botón al original*/
        jBDel.setBackground(colOri);
        
    }//GEN-LAST:event_jBDelMouseExited

    
    /*Cuando el mouse sale del botón específico*/
    private void jBActuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseExited
        
        /*Cambia el color del fondo del botón al original*/
        jBActua.setBackground(colOri);
        
    }//GEN-LAST:event_jBActuaMouseExited

    
    
    /*Cuando el mouse sale del botón específico*/
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
        /*Cambia el color del fondo del botón al original*/
        jBSal.setBackground(colOri);
        
    }//GEN-LAST:event_jBSalMouseExited

    
    /*Cuando el mouse sale del botón específico*/
    private void jBMosTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMosTMouseExited
        
        /*Cambia el color del fondo del botón al original*/
        jBMosT.setBackground(colOri);
        
    }//GEN-LAST:event_jBMosTMouseExited

    
    /*Cuando se pierde el foco del teclado en el control de bùsqueda*/
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost

        /*Establece el botón por default*/
        this.getRootPane().setDefaultButton(jBNew);
        
        /*Coloca el caret en la posiciòn 0*/
        jTBusc.setCaretPosition(0);
        
        /*Coloca el borde negro si tiene datos, caso contrario de rojo*/                               
        if(jTBusc.getText().compareTo("")!=0)
            jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(204,204,255)));
        
    }//GEN-LAST:event_jTBuscFocusLost

    private void jBImportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBImportarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImportarMouseEntered

    private void jBImportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBImportarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImportarMouseExited

    private void jBImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImportarActionPerformed
        if(jCBancos.getSelectedItem().toString().compareTo("")==0)
        {
            /*Mensajea*/
            JOptionPane.showMessageDialog(null, "No se a seleccionado nada para importar", "Campo vacio", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));
            return;
        }
        Object[] op = {"Si","No"};
        int iRes    = JOptionPane.showOptionDialog(this, "¿Seguro que están bien los datos?", "Importar "+ sTipM, JOptionPane.YES_NO_OPTION,  JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconDu)), op, op[0]);
        if(iRes==JOptionPane.NO_OPTION || iRes==JOptionPane.CLOSED_OPTION)
            return;
        Connection  con,con2;  
        com.microsoft.sqlserver.jdbc.SQLServerDataSource ds=new com.microsoft.sqlserver.jdbc.SQLServerDataSource();
        ds.setServerName(instancia);           
        ds.setUser(usuario);
        ds.setPassword(password);
        try
        {       //con = DriverManager.getConnection("jdbc:sqlserver://HPDESKTOP-PC\\COMPAC ;user=" + usuario + ";password=1234;");
           con= ds.getConnection();
           con2 = Star.abre_base_datos(false, false);
        }
        catch(Exception ex)
        {

            JOptionPane.showMessageDialog(null, "No se pudo abrir la base de datos. \nPosiblemente este mal escrito el nombre de la base de datos, usuario, puerto o contraseña. Error:\n" + ex.getMessage(), "Error al abrir base de datos", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));
            return;
        }
       Statement   st,st2;
       ResultSet   rs,rs2;
       String      sQ,bd;
       int cont=0,cont2=0;
       bd=pa.get(jCBancos.getSelectedItem().toString());
       try
        {
            sQ = "USE "+bd;
            st = con.createStatement();
            st.executeUpdate(sQ);
            
                
            sQ="SELECT codigo,nombre FROM CuentasCheques";
            st = con.createStatement();
            rs = st.executeQuery(sQ);
           
            if(Star.iIniTransCon(con2)==-1){
                return;
            }
            while(rs.next())
            {
                try{
                   sQ = "SELECT " + sTipCod + " FROM " + sTip + " WHERE " + sTipCod + " = '" + rs.getString("codigo") + "'";
                   st2 = con2.createStatement();
                   rs2 = st2.executeQuery(sQ);
                   if(rs2.next())
                       cont2++;
                   else
                   {
                       
                       sQ = "INSERT INTO " + sTip + "(" + sTipCod + ",                                                                      descrip,                                        falt,           estac,                                          sucu,                                           nocaj, idempresa) " + 
                       "VALUES('" +rs.getString("codigo") + "','" + rs.getString("nombre") + "',        now(), '" +     Login.usuario.replace("'", "''") + "','" +    Star.sSucu.replace("'", "''") + "','" +   Star.sNoCaj.replace("'", "''") + "', " + Login.codigo_empresa + ")";                                           
                        st2 = con2.createStatement();
                        st2.executeUpdate(sQ);
                       
                        sQ = "INSERT INTO log" + sTipL + "(cod,                                              descrip,                                            accio,          estac,                              sucu,                   nocaj,                          falt, idempresa) " + 
                        "VALUES('" + rs.getString("codigo")+ "', '" + jTDescrip.getText().replace("'", "''") + "',        'IMPORTAR',      '" + Login.usuario + "',  '" +    Star.sSucu + "',  '" + Star.sNoCaj + "',    now(), " + Login.codigo_empresa + ")";                                
                        st2 = con2.createStatement();
                        st2.executeUpdate(sQ);
                        
                        DefaultTableModel te = (DefaultTableModel)jTab.getModel();
                        Object nu[]= {iContFi, rs.getString("codigo"),  rs.getString("nombre")};
                        te.addRow(nu);
                        ++iContFi;
                        cont++;
                   }
                }
                catch(SQLException e)
                {
                   e.getMessage();
                }
            }
            JOptionPane.showMessageDialog(null,"Numero de cuentas importadas "+cont+"\nNumero de cuentas repetidas"+cont2, "Error al abrir base de datos", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));    
            Star.iTermTransCon(con2);
            con2.close();
            con.close();
        }
        catch(SQLException expnSQL)
        {
                //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;                        
        }
       
    }//GEN-LAST:event_jBImportarActionPerformed

    private void jBImportarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBImportarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImportarKeyPressed

    private void jTDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescripActionPerformed

    private void jBNew1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNew1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNew1MouseEntered

    private void jBNew1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNew1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNew1MouseExited

    private void jBNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNew1ActionPerformed
           
           ConfigBancos banco=new ConfigBancos(this,true);
           banco.setVisible(true);
           CargarBancos();
    }//GEN-LAST:event_jBNew1ActionPerformed

    private void jBNew1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNew1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNew1KeyPressed

    private void jCBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBancosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBancosActionPerformed
    
    private void CargarBancos(){
        String sFichero = "configB.properties";
        File fichero = new File(sFichero);
        if(fichero.exists())
        {
            Properties prop = new Properties();
            InputStream is = null;
           
            instancia=usuario=password="";
            try {
                is = new FileInputStream("configB.properties");
                prop.load(is);
            } catch(IOException e) {
                System.out.println(e.toString());
            }
            instancia=prop.getProperty("rutaServidor");
            usuario=prop.getProperty("Usuario");
            password=prop.getProperty("Contraseña");
        
            try            
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            }   
            catch(ClassNotFoundException e)
            {

            /*Mensajea y regresa*/
                JOptionPane.showMessageDialog(null, "Error en Class.forName() por " + e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconEr)));
                return;
            }
            /*Abre la base de datos*/
            Connection  con;  
            com.microsoft.sqlserver.jdbc.SQLServerDataSource ds=new com.microsoft.sqlserver.jdbc.SQLServerDataSource();
            ds.setServerName(instancia);           
            ds.setUser(usuario);
            ds.setPassword(password);
            try
            {       //con = DriverManager.getConnection("jdbc:sqlserver://HPDESKTOP-PC\\COMPAC ;user=" + usuario + ";password=1234;");
                con= ds.getConnection();
            }
            catch(Exception ex)
            {

                JOptionPane.showMessageDialog(null, "No se pudo abrir la base de datos. \nPosiblemente este mal escrito el nombre de la base de datos, usuario, puerto o contraseña. Error:\n" + ex.getMessage(), "Error al abrir base de datos", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconAd)));
                return;
            }
            Statement   st;
            ResultSet   rs;
            String      sQ;
            try
            {
                sQ = "USE GeneralesSQL";
                st = con.createStatement();
                st.executeUpdate(sQ);
               
                
                sQ="SELECT nombre,AliasBDD FROM ListaEmpresas";
                st = con.createStatement();
                rs = st.executeQuery(sQ);
                while(rs.next())
                {
                    pa.put(rs.getString("Nombre"), rs.getString("AliasBDD"));
                    jCBancos.addItem(rs.getString("Nombre"));
                }
                
                /*Si hay datos*/
                con.close();
            }
            catch(SQLException expnSQL)
            {
                //Procesa el error y regresa
                Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
                return;                        
            }

        }
       
    }
    
    /*Función escalable para cuando se presiona una tecla en el módulo*/
    void vKeyPreEsc(java.awt.event.KeyEvent evt)
    {
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
        /*Si se presiona la tecla de escape presiona el botón de salir*/
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) 
            jBSal.doClick();
        /*Else if se presiona Alt + T entonces presiona el botón de marcar todo*/
        else if(evt.isAltDown() && evt.getKeyCode() == KeyEvent.VK_T)
            jBTod.doClick();
        /*Si se presiona CTRL + SUP entonces presiona el botón de borrar*/
        else if(evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_DELETE)
            jBDel.doClick();
        /*Si se presiona CTRL + N entonces presiona el botón de nuevo*/
        else if(evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_N)
            jBNew.doClick();
        /*Si se presiona F3 presiona el botón de búscar*/
        else if(evt.getKeyCode() == KeyEvent.VK_F3)
            jBBusc.doClick();
        /*Else if se presiona Alt + F4 entonces presiona el botón de salir*/
        else if(evt.isAltDown() && evt.getKeyCode() == KeyEvent.VK_F4)
            jBSal.doClick();
        /*Si se presiona F4 presiona el botón de mostrar todo*/
        else if(evt.getKeyCode() == KeyEvent.VK_F4)
            jBMosT.doClick();
        /*Si se presiona F5 presiona el botón de actualizar*/
        else if(evt.getKeyCode() == KeyEvent.VK_F5)
            jBActua.doClick();
                
    }/*Fin de void vKeyPreEsc(java.awt.event.KeyEvent evt)*/
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActua;
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBImportar;
    private javax.swing.JButton jBMosT;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBNew1;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTod;
    private javax.swing.JComboBox jCBancos;
    private javax.swing.JLabel jLAyu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBusc;
    private javax.swing.JTextField jTCod;
    private javax.swing.JTextField jTDescrip;
    private javax.swing.JTable jTab;
    private javax.swing.JTextField jTrfc;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
