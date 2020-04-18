/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.text.InternationalFormatter;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;
import ptovta.Login;
import ptovta.Star;

/**
 *
 * @author Hp EliteBook
 */
public class AsignarCosto extends javax.swing.JFrame {

    private String idComp;
    private String tot;

    /**
     * Creates new form AsignarCosto
     */
    public AsignarCosto() {
        initComponents();
        cargarDatos();
    }

    public AsignarCosto(String idCompra, String total) {
        initComponents();
        idComp = idCompra;
        tot = total;
        cargarDatos();
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTxtDescripcion = new javax.swing.JTextField();
        JFormatCosto = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Porcentaje"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setLabel("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setLabel("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setLabel("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Descripcion");

        jLabel2.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFormatCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFormatCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatos() {
        forParaCampTex();
        Connection con = Star.abre_base_datos(true, false);
        //Declara variables de la base de datos    
        Statement st;
        ResultSet rs;
        String sQ;

        /*Comprueba si se puede o no modificar la descripción del producto*/
        try {
            DefaultTableModel te = (DefaultTableModel) jTable1.getModel();
            sQ = "SELECT idcosto, descripcion,costo,porcentaje FROM costoscompra WHERE idempresa = '" + Login.codigo_empresa + "' AND idcompra='"+idComp+"'";
            st = con.createStatement();
            rs = st.executeQuery(sQ);
            /*Si hay datos entonces*/
            while (rs.next()) {
                Object nu[] = {rs.getInt("idcosto"), rs.getString("descripcion"), rs.getString("costo"), "%" + rs.getString("porcentaje")};
                te.addRow(nu);
            }

        } catch (SQLException expnSQL) {
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;
        }
        Star.iCierrBas(con);
    }

    private void forParaCampTex() {
        PlainDocument doc = new PlainDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int off, String str, AttributeSet attr)
                    throws BadLocationException {
                String text = fb.getDocument().getText(0,
                        fb.getDocument().getLength()) + str;
                if (text.matches("^[0-9]+[.]?[0-9]*")) {
                    fb.insertString(off, str, attr);  // remove non-digits
                }
            }

            @Override
            public void replace(FilterBypass fb, int off, int len, String str, AttributeSet attr)
                    throws BadLocationException {
                String text = fb.getDocument().getText(0,
                        fb.getDocument().getLength()) + str;
                if (text.matches("^[0-9]+[.]?[0-9]*$")) {
                    fb.replace(off, len, str, attr);  // remove non-digits
                }
            }
        });
        JFormatCosto.setDocument(doc);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Double porcentaje = Double.parseDouble(tot);
        porcentaje = (Double.parseDouble(JFormatCosto.getText()) * 100) / porcentaje;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.UP);

        Connection con = Star.abre_base_datos(false, false);
         //Inicia la transacción
        Star.iIniTransCon(con)  ;
        Statement st;
        ResultSet rs;
        String sQ;
        try {
            sQ = "INSERT INTO costoscompra(idcompra,descripcion,costo,porcentaje,idempresa) "
                    + "VALUES(" + Integer.parseInt(idComp) + ", '" + jTxtDescripcion.getText() + "','" + JFormatCosto.getText() + "','" + df.format(porcentaje) + "', '" + Login.codigo_empresa + "')";
            st = con.createStatement();
            st.executeUpdate(sQ);
        } catch (SQLException expnSQL) {
            //Procesa el error y regresa
            Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
            return;
        }
        int last_insert_id = 0;
        try {
            sQ = "SELECT last_insert_id()";
            st = con.createStatement();
            rs = st.executeQuery(sQ);

            if (rs.next()) {
                last_insert_id = rs.getInt(1);
            }
        } catch (SQLException ex) {

        }
        Star.iTermTransCon(con);
        Star.iCierrBas(con);

        DefaultTableModel te = (DefaultTableModel) jTable1.getModel();
        Object nu[] = {last_insert_id, jTxtDescripcion.getText(), JFormatCosto.getText(), "%" + df.format(porcentaje)};
        te.addRow(nu);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Abre la base de datos nuevamente

        //Si hubo error entonces regresa
        for (int x = 0; x < jTable1.getRowCount(); x++) {

        }

        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection con = Star.abre_base_datos(true, false);

        //Si hubo error entonces regresa
        if (con == null) {
            return;
        }

        /*Para saber si hubo cambios*/
        boolean bMod = false;

        //Declara variables de la base de datos    
        Statement st;
        ResultSet rs;
        String sQ;
        int[] selectedRows = this.jTable1.getSelectedRows();

        DefaultTableModel tm    = (DefaultTableModel)jTable1.getModel();
        if (selectedRows.length > 0) {
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                try {
                    sQ = "DELETE FROM costoscompra WHERE idcosto = '" + jTable1.getValueAt(selectedRows[i], 0).toString() + "' AND idempresa = '" + Login.codigo_empresa + "'";
                    st = con.createStatement();
                    st.executeUpdate(sQ);
                    
                    tm.removeRow(selectedRows[i]);
                } catch (SQLException expnSQL) {
                    //Procesa el error y regresa
                    Star.iErrProc(this.getClass().getName() + " " + expnSQL.getMessage(), Star.sErrSQL, expnSQL.getStackTrace(), con);
                    return;
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField JFormatCosto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtDescripcion;
    // End of variables declaration//GEN-END:variables
}
