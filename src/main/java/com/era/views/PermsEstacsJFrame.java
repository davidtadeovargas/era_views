package com.era.views;


public abstract class PermsEstacsJFrame extends BaseJFrame 
{                
   
    public PermsEstacsJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }

       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jBGuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jcmbUsuarios = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jcbClientes = new javax.swing.JCheckBox();
        jcbClieModificar = new javax.swing.JCheckBox();
        jcbClieNuevo = new javax.swing.JCheckBox();
        jcbClieBorrar = new javax.swing.JCheckBox();
        jcbClieVer = new javax.swing.JCheckBox();
        jcbClieEnviar = new javax.swing.JCheckBox();
        jcbClientesPermiso = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jcbProve = new javax.swing.JCheckBox();
        jcbProveModificar = new javax.swing.JCheckBox();
        jcbProveNuevo = new javax.swing.JCheckBox();
        jcbProveBorrar = new javax.swing.JCheckBox();
        jcbProveVer = new javax.swing.JCheckBox();
        jcbProveePermiso = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jcbConf = new javax.swing.JCheckBox();
        jcbConfDatos = new javax.swing.JCheckBox();
        jcbConfCorreos = new javax.swing.JCheckBox();
        jcbConfImpresoras = new javax.swing.JCheckBox();
        jcbconfSeries = new javax.swing.JCheckBox();
        jcbConfConfiguraciones = new javax.swing.JCheckBox();
        jcbConfCambiarIcono = new javax.swing.JCheckBox();
        jcbConfiguracionesPermiso = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jcbCotizaciones = new javax.swing.JCheckBox();
        jcbAbrirCotiza = new javax.swing.JCheckBox();
        jcbNuevaCotiza = new javax.swing.JCheckBox();
        jcbCancelarCotiza = new javax.swing.JCheckBox();
        jcbVerCotiza = new javax.swing.JCheckBox();
        jcbVentaCotiza = new javax.swing.JCheckBox();
        jcbReenviarCotiza = new javax.swing.JCheckBox();
        jcbCotizaPermiso = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jcbCompras = new javax.swing.JCheckBox();
        jcbCancelarCompra = new javax.swing.JCheckBox();
        jcbDevolCompra = new javax.swing.JCheckBox();
        jcbParcialCompra = new javax.swing.JCheckBox();
        jcbNotCompra = new javax.swing.JCheckBox();
        jcbVerCompra = new javax.swing.JCheckBox();
        jcbBorrarArchivoCompra = new javax.swing.JCheckBox();
        jcbCargarArchivoCompra = new javax.swing.JCheckBox();
        jcbArchivoCompra = new javax.swing.JCheckBox();
        jcbRecibirCompra = new javax.swing.JCheckBox();
        jcbNuevoCompra = new javax.swing.JCheckBox();
        jcbComprasPermiso = new javax.swing.JCheckBox();
        jPanelSistema = new javax.swing.JPanel();
        jcbSistema = new javax.swing.JCheckBox();
        jcbUsuarios = new javax.swing.JCheckBox();
        jcbDefinirUsr = new javax.swing.JCheckBox();
        jcbUsrConectados = new javax.swing.JCheckBox();
        jcbPermisosUsr = new javax.swing.JCheckBox();
        jcbClaves = new javax.swing.JCheckBox();
        jcbBaseDatos = new javax.swing.JCheckBox();
        jcbConexionesBD = new javax.swing.JCheckBox();
        jcbArchivoConf = new javax.swing.JCheckBox();
        jcbReparar = new javax.swing.JCheckBox();
        jcbReparador = new javax.swing.JCheckBox();
        jcbRestaurar = new javax.swing.JCheckBox();
        jcbReportes = new javax.swing.JCheckBox();
        jcbRepUsuarios = new javax.swing.JCheckBox();
        jcbRepRespaldos = new javax.swing.JCheckBox();
        jcbRepLog = new javax.swing.JCheckBox();
        jcbRepEstadisticas = new javax.swing.JCheckBox();
        jcbRevocacion = new javax.swing.JCheckBox();
        jcbActivar = new javax.swing.JCheckBox();
        jcbSistemaPermiso = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jcbModulos = new javax.swing.JCheckBox();
        jcbContabilidad = new javax.swing.JCheckBox();
        jcbConceptos = new javax.swing.JCheckBox();
        jcbCatalogo = new javax.swing.JCheckBox();
        jcbZonas = new javax.swing.JCheckBox();
        jcbGiros = new javax.swing.JCheckBox();
        jcbMonedas = new javax.swing.JCheckBox();
        jcbImpuestos = new javax.swing.JCheckBox();
        jcbModulosPermiso = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jcbInventario = new javax.swing.JCheckBox();
        jcbModificarProd = new javax.swing.JCheckBox();
        jcbProductos = new javax.swing.JCheckBox();
        jcbBorrarProd = new javax.swing.JCheckBox();
        jcbNuevoProd = new javax.swing.JCheckBox();
        jcbInventarioPermiso = new javax.swing.JCheckBox();
        jCheckBoxListaPrecios = new javax.swing.JCheckBox();
        jCheckBoxCargarImagen = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jcbPrevioCompra = new javax.swing.JCheckBox();
        jcbAbrirPrevio = new javax.swing.JCheckBox();
        jcbNuevaPrevio = new javax.swing.JCheckBox();
        jcbCancelarPrevio = new javax.swing.JCheckBox();
        jcbVerPrevio = new javax.swing.JCheckBox();
        jcbCompraPrevio = new javax.swing.JCheckBox();
        jcbSeriesPrevio = new javax.swing.JCheckBox();
        jcbPrevioPermiso = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jcbVentas = new javax.swing.JCheckBox();
        jcbCancelarVentas = new javax.swing.JCheckBox();
        jcbDevolVentas = new javax.swing.JCheckBox();
        jcbParcialVentas = new javax.swing.JCheckBox();
        jcbNotVentas = new javax.swing.JCheckBox();
        jcbVerVentas = new javax.swing.JCheckBox();
        jcbBorrarArchivoVentas = new javax.swing.JCheckBox();
        jcbCargarArchivoVentas = new javax.swing.JCheckBox();
        jcbArchivoVentas = new javax.swing.JCheckBox();
        jcbNuevaVentas = new javax.swing.JCheckBox();
        jcbEnviarVentas = new javax.swing.JCheckBox();
        jcbTimbrarVentas = new javax.swing.JCheckBox();
        jcbEntregarVentas = new javax.swing.JCheckBox();
        jcbComprobarVentas = new javax.swing.JCheckBox();
        jcbAcuseVentas = new javax.swing.JCheckBox();
        jcbObtenerXmlVentas = new javax.swing.JCheckBox();
        jcbFacturarVentas = new javax.swing.JCheckBox();
        jcbVentasPermiso = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP1.setMaximumSize(new java.awt.Dimension(320, 500));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 110, 30));

        jBGuar.setBackground(new java.awt.Color(204, 204, 204));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(320, 2000));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(320, 2000));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(320, 798));

        jPanel1.setMaximumSize(new java.awt.Dimension(350, 2900));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 2900));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 3000));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbClientes.setText("Clientes");
        jcbClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbClientes.setBorderPainted(true);
        jcbClientes.setOpaque(false);
        
        jcbClieModificar.setText("Modificar");
        jcbClieModificar.setContentAreaFilled(false);
        
        jcbClieNuevo.setText("Nuevo");
        jcbClieNuevo.setContentAreaFilled(false);
        
        jcbClieBorrar.setText("Borrar");
        jcbClieBorrar.setContentAreaFilled(false);
        
        jcbClieVer.setText("Ver");
        jcbClieVer.setContentAreaFilled(false);
        
        jcbClieEnviar.setText("Enviar");
        jcbClieEnviar.setContentAreaFilled(false);
        
        jcbClientesPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbClientesPermiso.setText("Puede otorgar permisos de clientes");
        jcbClientesPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbClientesPermiso.setBorderPainted(true);
        jcbClientesPermiso.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbClieNuevo)
                            .addComponent(jcbClieModificar)
                            .addComponent(jcbClieVer)
                            .addComponent(jcbClieBorrar)
                            .addComponent(jcbClieEnviar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcbClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(jcbClientesPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbClieNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbClieModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbClieVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbClieBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbClieEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbClientesPermiso)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbProve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbProve.setText("Proveedores");
        jcbProve.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbProve.setBorderPainted(true);
        jcbProve.setOpaque(false);
        
        jcbProveModificar.setText("Modificar");
        jcbProveModificar.setContentAreaFilled(false);
        
        jcbProveNuevo.setText("Nuevo");
        jcbProveNuevo.setContentAreaFilled(false);
        
        jcbProveBorrar.setText("Borrar");
        jcbProveBorrar.setContentAreaFilled(false);
        
        jcbProveVer.setText("Ver");
        jcbProveVer.setContentAreaFilled(false);
        
        jcbProveePermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbProveePermiso.setText("Puede otorgar permisos de proveedores");
        jcbProveePermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbProveePermiso.setBorderPainted(true);
        jcbProveePermiso.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbProveNuevo)
                            .addComponent(jcbProveModificar)
                            .addComponent(jcbProveVer)
                            .addComponent(jcbProveBorrar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbProveePermiso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbProve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbProve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbProveNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbProveModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbProveVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbProveBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbProveePermiso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbConf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbConf.setText("Configuraciones");
        jcbConf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbConf.setBorderPainted(true);
        jcbConf.setOpaque(false);
        
        jcbConfDatos.setText("Datos generales de la empresa");
        jcbConfDatos.setContentAreaFilled(false);
        
        jcbConfCorreos.setText("Correos electronicos");
        jcbConfCorreos.setContentAreaFilled(false);
        
        jcbConfImpresoras.setText("Impresoras");
        jcbConfImpresoras.setContentAreaFilled(false);
        
        jcbconfSeries.setText("Series y consecutivos");
        jcbconfSeries.setContentAreaFilled(false);
        
        jcbConfConfiguraciones.setText("Configuraciones generales");
        jcbConfConfiguraciones.setContentAreaFilled(false);
        
        jcbConfCambiarIcono.setText("Cambiar icono aplicación");
        jcbConfCambiarIcono.setContentAreaFilled(false);
        
        jcbConfiguracionesPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbConfiguracionesPermiso.setText("Puede otorgar permisos de configuraciones");
        jcbConfiguracionesPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbConfiguracionesPermiso.setBorderPainted(true);
        jcbConfiguracionesPermiso.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbConfCorreos)
                            .addComponent(jcbConfDatos)
                            .addComponent(jcbconfSeries)
                            .addComponent(jcbConfImpresoras)
                            .addComponent(jcbConfCambiarIcono)
                            .addComponent(jcbConfConfiguraciones))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jcbConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(jcbConfiguracionesPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jcbConf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbConfCorreos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbConfDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbconfSeries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbConfImpresoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbConfCambiarIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbConfConfiguraciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbConfiguracionesPermiso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbCotizaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCotizaciones.setText("Cotizaciones");
        jcbCotizaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbCotizaciones.setBorderPainted(true);
        jcbCotizaciones.setOpaque(false);
        
        jcbAbrirCotiza.setText("abrir");
        jcbAbrirCotiza.setContentAreaFilled(false);
        
        jcbNuevaCotiza.setText("Nueva");
        jcbNuevaCotiza.setContentAreaFilled(false);
        
        jcbCancelarCotiza.setText("Cancelar");
        jcbCancelarCotiza.setContentAreaFilled(false);
        
        jcbVerCotiza.setText("Ver");
        jcbVerCotiza.setContentAreaFilled(false);
        
        jcbVentaCotiza.setText("Venta");
        jcbVentaCotiza.setContentAreaFilled(false);
        
        jcbReenviarCotiza.setText("Reenviar");
        jcbReenviarCotiza.setContentAreaFilled(false);
        
        jcbCotizaPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCotizaPermiso.setText("Puede otorgar permisos de cotizaciones");
        jcbCotizaPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbCotizaPermiso.setBorderPainted(true);
        jcbCotizaPermiso.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbNuevaCotiza)
                            .addComponent(jcbAbrirCotiza)
                            .addComponent(jcbVerCotiza)
                            .addComponent(jcbCancelarCotiza)
                            .addComponent(jcbReenviarCotiza)
                            .addComponent(jcbVentaCotiza))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jcbCotizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(jcbCotizaPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbCotizaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbNuevaCotiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAbrirCotiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbVerCotiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCancelarCotiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbReenviarCotiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbVentaCotiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCotizaPermiso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbCompras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCompras.setText("Compras");
        jcbCompras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbCompras.setBorderPainted(true);
        jcbCompras.setOpaque(false);
        
        jcbCancelarCompra.setText("Cancelar");
        jcbCancelarCompra.setContentAreaFilled(false);
        
        jcbDevolCompra.setText("Devolución");
        jcbDevolCompra.setContentAreaFilled(false);
        
        jcbParcialCompra.setText("Parcial");
        jcbParcialCompra.setContentAreaFilled(false);
        
        jcbNotCompra.setText("Not. crédito");
        jcbNotCompra.setContentAreaFilled(false);
        
        jcbVerCompra.setText("Ver");
        jcbVerCompra.setContentAreaFilled(false);
        
        jcbBorrarArchivoCompra.setText("Borrar");
        jcbBorrarArchivoCompra.setContentAreaFilled(false);
        
        jcbCargarArchivoCompra.setText("Cargar");
        jcbCargarArchivoCompra.setContentAreaFilled(false);
        
        jcbArchivoCompra.setText("Ver Archivo");
        jcbArchivoCompra.setContentAreaFilled(false);
        
        jcbRecibirCompra.setText("Recibir orden");
        jcbRecibirCompra.setContentAreaFilled(false);
        
        jcbNuevoCompra.setText("Nuevo");
        jcbNuevoCompra.setContentAreaFilled(false);
        
        jcbComprasPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbComprasPermiso.setText("Puede otorgar permisos de compras");
        jcbComprasPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbComprasPermiso.setBorderPainted(true);
        jcbComprasPermiso.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbRecibirCompra)
                            .addComponent(jcbNotCompra)
                            .addComponent(jcbNuevoCompra)
                            .addComponent(jcbParcialCompra)
                            .addComponent(jcbDevolCompra)
                            .addComponent(jcbCancelarCompra)
                            .addComponent(jcbVerCompra)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbArchivoCompra)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbBorrarArchivoCompra)
                                    .addComponent(jcbCargarArchivoCompra))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbComprasPermiso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbCancelarCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbDevolCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbParcialCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNuevoCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNotCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbVerCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbArchivoCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCargarArchivoCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbBorrarArchivoCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRecibirCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbComprasPermiso)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelSistema.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSistema.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanelSistema.setAutoscrolls(true);

        jcbSistema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbSistema.setText("Sistema");
        jcbSistema.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbSistema.setBorderPainted(true);
        jcbSistema.setOpaque(false);
        
        jcbUsuarios.setText("Usuarios");
        jcbUsuarios.setContentAreaFilled(false);
        
        jcbDefinirUsr.setText("Definir usuarios");
        jcbDefinirUsr.setContentAreaFilled(false);
        jcbDefinirUsr.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jcbDefinirUsr.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbUsrConectados.setText("Usuarios conectados");
        jcbUsrConectados.setContentAreaFilled(false);
        jcbUsrConectados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbPermisosUsr.setText("Permisos usuarios");
        jcbPermisosUsr.setContentAreaFilled(false);
        jcbPermisosUsr.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        

        jcbClaves.setText("Claves");
        jcbClaves.setContentAreaFilled(false);
        
        jcbBaseDatos.setText("Base de datos");
        jcbBaseDatos.setContentAreaFilled(false);
        
        jcbConexionesBD.setText("Conexiones a bases de datos");
        jcbConexionesBD.setContentAreaFilled(false);
        jcbConexionesBD.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jcbConexionesBD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbArchivoConf.setText("Archivo de configuracion");
        jcbArchivoConf.setContentAreaFilled(false);
        jcbArchivoConf.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbReparar.setText("Reparar");
        jcbReparar.setContentAreaFilled(false);
        
        jcbReparador.setText("Reparador de errores");
        jcbReparador.setContentAreaFilled(false);
        jcbReparador.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jcbReparador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbRestaurar.setText("Restaurar sistema");
        jcbRestaurar.setContentAreaFilled(false);
        jcbRestaurar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbReportes.setText("Reportes");
        jcbReportes.setContentAreaFilled(false);
        
        jcbRepUsuarios.setText("Usuarios");
        jcbRepUsuarios.setContentAreaFilled(false);
        jcbRepUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jcbRepUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbRepRespaldos.setText("Respaldos");
        jcbRepRespaldos.setContentAreaFilled(false);
        jcbRepRespaldos.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jcbRepRespaldos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbRepLog.setText("Log correos");
        jcbRepLog.setContentAreaFilled(false);
        jcbRepLog.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jcbRepLog.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbRepEstadisticas.setText("Estadisticas de correos");
        jcbRepEstadisticas.setContentAreaFilled(false);
        jcbRepEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jcbRepEstadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        
        jcbRevocacion.setText("Revocación");
        jcbRevocacion.setContentAreaFilled(false);
        
        jcbActivar.setText("Activar sistema");
        jcbActivar.setContentAreaFilled(false);
        
        jcbSistemaPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbSistemaPermiso.setText("Puede otorgar permisos de sistema");
        jcbSistemaPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbSistemaPermiso.setBorderPainted(true);
        jcbSistemaPermiso.setOpaque(false);

        javax.swing.GroupLayout jPanelSistemaLayout = new javax.swing.GroupLayout(jPanelSistema);
        jPanelSistema.setLayout(jPanelSistemaLayout);
        jPanelSistemaLayout.setHorizontalGroup(
            jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSistemaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSistemaLayout.createSequentialGroup()
                        .addComponent(jcbSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelSistemaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbUsuarios)
                            .addComponent(jcbClaves)
                            .addComponent(jcbReparar)
                            .addComponent(jcbBaseDatos)
                            .addComponent(jcbReportes)
                            .addComponent(jcbRevocacion)
                            .addComponent(jcbActivar)
                            .addGroup(jPanelSistemaLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbArchivoConf)
                                    .addComponent(jcbConexionesBD)
                                    .addComponent(jcbRepEstadisticas)
                                    .addComponent(jcbRepLog)
                                    .addComponent(jcbRepRespaldos)
                                    .addComponent(jcbRepUsuarios)
                                    .addComponent(jcbReparador)
                                    .addComponent(jcbRestaurar)
                                    .addComponent(jcbPermisosUsr)
                                    .addComponent(jcbDefinirUsr)
                                    .addComponent(jcbUsrConectados))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbSistemaPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSistemaLayout.setVerticalGroup(
            jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSistemaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jcbSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbDefinirUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbUsrConectados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbPermisosUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbClaves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbReparar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbReparador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRestaurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbBaseDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbConexionesBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbArchivoConf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbReportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRepUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRepRespaldos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRepLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRepEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbRevocacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbActivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbSistemaPermiso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbModulos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbModulos.setText("Modulos");
        jcbModulos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbModulos.setBorderPainted(true);
        jcbModulos.setOpaque(false);
        
        jcbContabilidad.setText("Contabilidad");
        jcbContabilidad.setContentAreaFilled(false);
        
        jcbConceptos.setText("Conceptos notas de créditos");
        jcbConceptos.setContentAreaFilled(false);
        
        jcbCatalogo.setText("Catálogo garantías");
        jcbCatalogo.setContentAreaFilled(false);
        
        jcbZonas.setText("Zonas");
        jcbZonas.setContentAreaFilled(false);
        
        jcbGiros.setText("Giros");
        jcbGiros.setContentAreaFilled(false);
        
        jcbMonedas.setText("Monedas");
        jcbMonedas.setContentAreaFilled(false);
        
        jcbImpuestos.setText("Impuestos");
        jcbImpuestos.setContentAreaFilled(false);
        
        jcbModulosPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbModulosPermiso.setText("Puede otorgar permisos de modulos");
        jcbModulosPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbModulosPermiso.setBorderPainted(true);
        jcbModulosPermiso.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbImpuestos)
                            .addComponent(jcbMonedas)
                            .addComponent(jcbGiros)
                            .addComponent(jcbZonas)
                            .addComponent(jcbCatalogo)
                            .addComponent(jcbConceptos)
                            .addComponent(jcbContabilidad))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbModulosPermiso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbModulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbModulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbContabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbConceptos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCatalogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbZonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbGiros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbMonedas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbImpuestos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbModulosPermiso)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbInventario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbInventario.setText("Inventario");
        jcbInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbInventario.setBorderPainted(true);
        jcbInventario.setOpaque(false);
        
        jcbModificarProd.setText("Modificar");
        jcbModificarProd.setContentAreaFilled(false);
        
        jcbProductos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbProductos.setText("Productos");
        jcbProductos.setContentAreaFilled(false);
        
        jcbBorrarProd.setText("Borrar");
        jcbBorrarProd.setContentAreaFilled(false);
        
        jcbNuevoProd.setText("Nuevo");
        jcbNuevoProd.setContentAreaFilled(false);
        
        jcbInventarioPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbInventarioPermiso.setText("Puede otorgar permisos de Inventario");
        jcbInventarioPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbInventarioPermiso.setBorderPainted(true);
        jcbInventarioPermiso.setOpaque(false);
        
        jCheckBoxListaPrecios.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxListaPrecios.setText("Lista de Precios");

        jCheckBoxCargarImagen.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxCargarImagen.setText("Cargar Imágen");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbProductos)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbModificarProd)
                                    .addComponent(jcbNuevoProd)
                                    .addComponent(jcbBorrarProd)
                                    .addComponent(jCheckBoxListaPrecios)
                                    .addComponent(jCheckBoxCargarImagen))))
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jcbInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(jcbInventarioPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbNuevoProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbModificarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbBorrarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxListaPrecios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxCargarImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jcbInventarioPermiso)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbPrevioCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPrevioCompra.setText("Previo de compra");
        jcbPrevioCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbPrevioCompra.setBorderPainted(true);
        jcbPrevioCompra.setOpaque(false);
        
        jcbAbrirPrevio.setText("abrir");
        jcbAbrirPrevio.setContentAreaFilled(false);
        
        jcbNuevaPrevio.setText("Nueva");
        jcbNuevaPrevio.setContentAreaFilled(false);
        
        jcbCancelarPrevio.setText("Cancelar");
        jcbCancelarPrevio.setContentAreaFilled(false);
        
        jcbVerPrevio.setText("Ver");
        jcbVerPrevio.setContentAreaFilled(false);
        
        jcbCompraPrevio.setText("Compra");
        jcbCompraPrevio.setContentAreaFilled(false);
        
        jcbSeriesPrevio.setText("Series");
        jcbSeriesPrevio.setContentAreaFilled(false);
        
        jcbPrevioPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPrevioPermiso.setText("Puede otorgar permisos de previo de compra");
        jcbPrevioPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbPrevioPermiso.setBorderPainted(true);
        jcbPrevioPermiso.setOpaque(false);
        
        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbPrevioPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jcbPrevioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCompraPrevio)
                            .addComponent(jcbSeriesPrevio)
                            .addComponent(jcbNuevaPrevio)
                            .addComponent(jcbAbrirPrevio)
                            .addComponent(jcbVerPrevio)
                            .addComponent(jcbCancelarPrevio))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbPrevioCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbNuevaPrevio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAbrirPrevio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbVerPrevio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCancelarPrevio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSeriesPrevio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCompraPrevio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jcbPrevioPermiso)
                .addGap(34, 34, 34))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbVentas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbVentas.setText("Ventas");
        jcbVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcbVentas.setBorderPainted(true);
        jcbVentas.setOpaque(false);
        
        jcbCancelarVentas.setText("Cancelar");
        jcbCancelarVentas.setContentAreaFilled(false);
        
        jcbDevolVentas.setText("Devolución");
        jcbDevolVentas.setContentAreaFilled(false);
        
        jcbParcialVentas.setText("Parcial");
        jcbParcialVentas.setContentAreaFilled(false);
        

        jcbNotVentas.setText("Not. crédito");
        jcbNotVentas.setContentAreaFilled(false);
        
        jcbVerVentas.setText("Ver");
        jcbVerVentas.setContentAreaFilled(false);
        
        jcbBorrarArchivoVentas.setText("Borrar");
        jcbBorrarArchivoVentas.setContentAreaFilled(false);
        
        jcbCargarArchivoVentas.setText("Cargar");
        jcbCargarArchivoVentas.setContentAreaFilled(false);
        
        jcbArchivoVentas.setText("Ver Archivo");
        jcbArchivoVentas.setContentAreaFilled(false);
        
        jcbNuevaVentas.setText("Nueva");
        jcbNuevaVentas.setContentAreaFilled(false);
        
        jcbEnviarVentas.setText("Enviar");
        jcbEnviarVentas.setContentAreaFilled(false);
        
        jcbTimbrarVentas.setText("Timbrar");
        jcbTimbrarVentas.setContentAreaFilled(false);
        
        jcbEntregarVentas.setText("Entregar");
        jcbEntregarVentas.setContentAreaFilled(false);
        
        jcbComprobarVentas.setText("Comprobar");
        jcbComprobarVentas.setContentAreaFilled(false);
        
        jcbAcuseVentas.setText("Acuse");
        jcbAcuseVentas.setContentAreaFilled(false);
        
        jcbObtenerXmlVentas.setText("Obtener XML");
        jcbObtenerXmlVentas.setContentAreaFilled(false);
        
        jcbFacturarVentas.setText("Facturar");
        jcbFacturarVentas.setContentAreaFilled(false);
        
        jcbVentasPermiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbVentasPermiso.setText("Puede otorgar permisos de ventas");
        jcbVentasPermiso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbVentasPermiso.setBorderPainted(true);
        jcbVentasPermiso.setOpaque(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jcbVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbVerVentas)
                            .addComponent(jcbNotVentas)
                            .addComponent(jcbParcialVentas)
                            .addComponent(jcbDevolVentas)
                            .addComponent(jcbCancelarVentas)
                            .addComponent(jcbNuevaVentas)
                            .addComponent(jcbEnviarVentas)
                            .addComponent(jcbTimbrarVentas)
                            .addComponent(jcbEntregarVentas)
                            .addComponent(jcbComprobarVentas)
                            .addComponent(jcbAcuseVentas)
                            .addComponent(jcbObtenerXmlVentas)
                            .addComponent(jcbFacturarVentas)
                            .addComponent(jcbArchivoVentas)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCargarArchivoVentas)
                                    .addComponent(jcbBorrarArchivoVentas))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jcbVentasPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbCancelarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbDevolVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbParcialVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNuevaVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNotVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbVerVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEnviarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbTimbrarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEntregarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbComprobarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAcuseVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbObtenerXmlVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbFacturarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbArchivoVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCargarArchivoVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbBorrarArchivoVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jcbVentasPermiso)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jcmbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcmbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBSal;
    private javax.swing.JCheckBox jCheckBoxCargarImagen;
    private javax.swing.JCheckBox jCheckBoxListaPrecios;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbAbrirCotiza;
    private javax.swing.JCheckBox jcbAbrirPrevio;
    private javax.swing.JCheckBox jcbActivar;
    private javax.swing.JCheckBox jcbAcuseVentas;
    private javax.swing.JCheckBox jcbArchivoCompra;
    private javax.swing.JCheckBox jcbArchivoConf;
    private javax.swing.JCheckBox jcbArchivoVentas;
    private javax.swing.JCheckBox jcbBaseDatos;
    private javax.swing.JCheckBox jcbBorrarArchivoCompra;
    private javax.swing.JCheckBox jcbBorrarArchivoVentas;
    private javax.swing.JCheckBox jcbBorrarProd;
    private javax.swing.JCheckBox jcbCancelarCompra;
    private javax.swing.JCheckBox jcbCancelarCotiza;
    private javax.swing.JCheckBox jcbCancelarPrevio;
    private javax.swing.JCheckBox jcbCancelarVentas;
    private javax.swing.JCheckBox jcbCargarArchivoCompra;
    private javax.swing.JCheckBox jcbCargarArchivoVentas;
    private javax.swing.JCheckBox jcbCatalogo;
    private javax.swing.JCheckBox jcbClaves;
    private javax.swing.JCheckBox jcbClieBorrar;
    private javax.swing.JCheckBox jcbClieEnviar;
    private javax.swing.JCheckBox jcbClieModificar;
    private javax.swing.JCheckBox jcbClieNuevo;
    private javax.swing.JCheckBox jcbClieVer;
    private javax.swing.JCheckBox jcbClientes;
    private javax.swing.JCheckBox jcbClientesPermiso;
    private javax.swing.JCheckBox jcbCompraPrevio;
    private javax.swing.JCheckBox jcbCompras;
    private javax.swing.JCheckBox jcbComprasPermiso;
    private javax.swing.JCheckBox jcbComprobarVentas;
    private javax.swing.JCheckBox jcbConceptos;
    private javax.swing.JCheckBox jcbConexionesBD;
    private javax.swing.JCheckBox jcbConf;
    private javax.swing.JCheckBox jcbConfCambiarIcono;
    private javax.swing.JCheckBox jcbConfConfiguraciones;
    private javax.swing.JCheckBox jcbConfCorreos;
    private javax.swing.JCheckBox jcbConfDatos;
    private javax.swing.JCheckBox jcbConfImpresoras;
    private javax.swing.JCheckBox jcbConfiguracionesPermiso;
    private javax.swing.JCheckBox jcbContabilidad;
    private javax.swing.JCheckBox jcbCotizaPermiso;
    private javax.swing.JCheckBox jcbCotizaciones;
    private javax.swing.JCheckBox jcbDefinirUsr;
    private javax.swing.JCheckBox jcbDevolCompra;
    private javax.swing.JCheckBox jcbDevolVentas;
    private javax.swing.JCheckBox jcbEntregarVentas;
    private javax.swing.JCheckBox jcbEnviarVentas;
    private javax.swing.JCheckBox jcbFacturarVentas;
    private javax.swing.JCheckBox jcbGiros;
    private javax.swing.JCheckBox jcbImpuestos;
    private javax.swing.JCheckBox jcbInventario;
    private javax.swing.JCheckBox jcbInventarioPermiso;
    private javax.swing.JCheckBox jcbModificarProd;
    private javax.swing.JCheckBox jcbModulos;
    private javax.swing.JCheckBox jcbModulosPermiso;
    private javax.swing.JCheckBox jcbMonedas;
    private javax.swing.JCheckBox jcbNotCompra;
    private javax.swing.JCheckBox jcbNotVentas;
    private javax.swing.JCheckBox jcbNuevaCotiza;
    private javax.swing.JCheckBox jcbNuevaPrevio;
    private javax.swing.JCheckBox jcbNuevaVentas;
    private javax.swing.JCheckBox jcbNuevoCompra;
    private javax.swing.JCheckBox jcbNuevoProd;
    private javax.swing.JCheckBox jcbObtenerXmlVentas;
    private javax.swing.JCheckBox jcbParcialCompra;
    private javax.swing.JCheckBox jcbParcialVentas;
    private javax.swing.JCheckBox jcbPermisosUsr;
    private javax.swing.JCheckBox jcbPrevioCompra;
    private javax.swing.JCheckBox jcbPrevioPermiso;
    private javax.swing.JCheckBox jcbProductos;
    private javax.swing.JCheckBox jcbProve;
    private javax.swing.JCheckBox jcbProveBorrar;
    private javax.swing.JCheckBox jcbProveModificar;
    private javax.swing.JCheckBox jcbProveNuevo;
    private javax.swing.JCheckBox jcbProveVer;
    private javax.swing.JCheckBox jcbProveePermiso;
    private javax.swing.JCheckBox jcbRecibirCompra;
    private javax.swing.JCheckBox jcbReenviarCotiza;
    private javax.swing.JCheckBox jcbRepEstadisticas;
    private javax.swing.JCheckBox jcbRepLog;
    private javax.swing.JCheckBox jcbRepRespaldos;
    private javax.swing.JCheckBox jcbRepUsuarios;
    private javax.swing.JCheckBox jcbReparador;
    private javax.swing.JCheckBox jcbReparar;
    private javax.swing.JCheckBox jcbReportes;
    private javax.swing.JCheckBox jcbRestaurar;
    private javax.swing.JCheckBox jcbRevocacion;
    private javax.swing.JCheckBox jcbSeriesPrevio;
    private javax.swing.JCheckBox jcbSistema;
    private javax.swing.JCheckBox jcbSistemaPermiso;
    private javax.swing.JCheckBox jcbTimbrarVentas;
    private javax.swing.JCheckBox jcbUsrConectados;
    private javax.swing.JCheckBox jcbUsuarios;
    private javax.swing.JCheckBox jcbVentaCotiza;
    private javax.swing.JCheckBox jcbVentas;
    private javax.swing.JCheckBox jcbVentasPermiso;
    private javax.swing.JCheckBox jcbVerCompra;
    private javax.swing.JCheckBox jcbVerCotiza;
    private javax.swing.JCheckBox jcbVerPrevio;
    private javax.swing.JCheckBox jcbVerVentas;
    private javax.swing.JCheckBox jcbZonas;
    private javax.swing.JCheckBox jcbconfSeries;
    private javax.swing.JComboBox jcmbUsuarios;
    // End of variables declaration//GEN-END:variables

        

}
