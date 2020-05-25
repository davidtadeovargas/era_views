package com.era.views;


public abstract class correoTerminalJFrame extends BaseJFrame {

    public correoTerminalJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();

        postInitComponents();
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SincronizarTabbed = new javax.swing.JTabbedPane();
        ConfiguracionesPane = new javax.swing.JPanel();
        probar = new javax.swing.JButton();
        correo1 = new javax.swing.JTextField();
        correo_label1 = new javax.swing.JLabel();
        contra_label1 = new javax.swing.JLabel();
        contra1 = new javax.swing.JPasswordField();
        nombreMostrar_label1 = new javax.swing.JLabel();
        nombreMostrar1 = new javax.swing.JTextField();
        direccionServer_label1 = new javax.swing.JLabel();
        direccionServer1 = new javax.swing.JTextField();
        puerto_label1 = new javax.swing.JLabel();
        puerto1 = new javax.swing.JTextField();
        correoCentral1_label = new javax.swing.JLabel();
        correoCentral1 = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        title6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        ExportarPane = new javax.swing.JPanel();
        ExportarTodo = new javax.swing.JButton();
        importar = new javax.swing.JButton();
        title2 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        ExportarAutomatico = new javax.swing.JButton();
        ultimaExportacionVentaSincronizacion = new javax.swing.JLabel();
        ultimaExportacionFechaSincronizacion1 = new javax.swing.JLabel();
        ultimaExportacionTipoSincronizacion1 = new javax.swing.JLabel();
        ultimaSincronizacion2 = new javax.swing.JLabel();
        tipoSincronizacion2 = new javax.swing.JLabel();
        ultimaVentaSincronizacion1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        ultimaVentaSincronizacion2 = new javax.swing.JLabel();
        ultimaImportacionSincronizacion = new javax.swing.JLabel();
        ultimaVentaSincronizacion3 = new javax.swing.JLabel();
        SincronizarPane = new javax.swing.JPanel();
        correoPaEnvio = new javax.swing.JTextField();
        correoParaEnvio_Label = new javax.swing.JLabel();
        centralParaEnvio_Label = new javax.swing.JLabel();
        centralParaEnvio = new javax.swing.JTextField();
        title4 = new javax.swing.JLabel();
        sincronizarPersonalizado = new javax.swing.JButton();
        estadoSincronizar = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 328, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 562, -1, -1));

        SincronizarTabbed.setName(""); // NOI18N

        ConfiguracionesPane.setForeground(new java.awt.Color(240, 240, 240));
        ConfiguracionesPane.setToolTipText("");
        ConfiguracionesPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        probar.setText("Probar");
        ConfiguracionesPane.add(probar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 140, -1));

        correo1.setToolTipText("Correo electrónico de la terminal.");
        ConfiguracionesPane.add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 195, -1));

        correo_label1.setText("Correo emisor");
        ConfiguracionesPane.add(correo_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 170, -1));

        contra_label1.setText("Contraseña");
        ConfiguracionesPane.add(contra_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, -1));

        contra1.setToolTipText("Contraseña del correo electrónico de la terminal.");
        ConfiguracionesPane.add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 195, -1));

        nombreMostrar_label1.setText("Nombre a mostrar");
        ConfiguracionesPane.add(nombreMostrar_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, -1));

        nombreMostrar1.setToolTipText("Nombre que se muestra sobre su correo electrónico.");
        ConfiguracionesPane.add(nombreMostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 195, -1));

        direccionServer_label1.setText("Servidor de correo");
        ConfiguracionesPane.add(direccionServer_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, -1));

        direccionServer1.setToolTipText("Dirección del servidor del correo electrónico.");
        ConfiguracionesPane.add(direccionServer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 195, -1));

        puerto_label1.setText("Puerto de correo");
        ConfiguracionesPane.add(puerto_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, -1));

        puerto1.setToolTipText("Puerto del servidor para el envio de correos electrónicos.");
        ConfiguracionesPane.add(puerto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 195, -1));

        correoCentral1_label.setText("Correo receptor");
        ConfiguracionesPane.add(correoCentral1_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, -1));

        ConfiguracionesPane.add(correoCentral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 195, -1));

        guardar.setText("Guardar");
        ConfiguracionesPane.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 140, -1));
        ConfiguracionesPane.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 210, 20));

        title5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title5.setText("Receptor");
        ConfiguracionesPane.add(title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        ConfiguracionesPane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 400, 10));

        title6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title6.setText("Emisor");
        ConfiguracionesPane.add(title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        ConfiguracionesPane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 470, 10));
        ConfiguracionesPane.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 400, 10));

        SincronizarTabbed.addTab("Configuraciones", ConfiguracionesPane);

        ExportarPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExportarTodo.setText("Exportar Todo");
        ExportarPane.add(ExportarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 50));

        importar.setText("Importar");
        ExportarPane.add(importar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 50));

        title2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title2.setText("Exportar ventas");
        ExportarPane.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        title3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title3.setText("Importar ventas");
        ExportarPane.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        ExportarAutomatico.setText("Exportar Automático");
        ExportarAutomatico.setToolTipText("Exporte solo las ventas que no haya exportado antes.");
        ExportarPane.add(ExportarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, 50));

        ultimaExportacionVentaSincronizacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExportarPane.add(ultimaExportacionVentaSincronizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 180, 20));

        ultimaExportacionFechaSincronizacion1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExportarPane.add(ultimaExportacionFechaSincronizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 180, 20));

        ultimaExportacionTipoSincronizacion1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExportarPane.add(ultimaExportacionTipoSincronizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 180, 20));

        ultimaSincronizacion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ultimaSincronizacion2.setText("Última exportación :");
        ExportarPane.add(ultimaSincronizacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        tipoSincronizacion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipoSincronizacion2.setText("Tipo de exportación :");
        ExportarPane.add(tipoSincronizacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        ultimaVentaSincronizacion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ultimaVentaSincronizacion1.setText("exportación automática :");
        ExportarPane.add(ultimaVentaSincronizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));
        ExportarPane.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 340, 10));
        ExportarPane.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 340, 10));

        ultimaVentaSincronizacion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ultimaVentaSincronizacion2.setText("Última venta de");
        ExportarPane.add(ultimaVentaSincronizacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        ultimaImportacionSincronizacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExportarPane.add(ultimaImportacionSincronizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 180, 20));

        ultimaVentaSincronizacion3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ultimaVentaSincronizacion3.setText("Última importación :");
        ExportarPane.add(ultimaVentaSincronizacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        SincronizarTabbed.addTab("Importar y Exportar", ExportarPane);

        SincronizarPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        correoPaEnvio.setEditable(false);
        correoPaEnvio.setBackground(new java.awt.Color(204, 204, 204));
        SincronizarPane.add(correoPaEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 20));

        correoParaEnvio_Label.setText("Correo emisor :");
        SincronizarPane.add(correoParaEnvio_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 20));

        centralParaEnvio_Label.setText("Correo receptor :");
        SincronizarPane.add(centralParaEnvio_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 20));

        centralParaEnvio.setEditable(false);
        centralParaEnvio.setBackground(new java.awt.Color(204, 204, 204));
        SincronizarPane.add(centralParaEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 20));

        title4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title4.setText("Sincronización de ventas");
        SincronizarPane.add(title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        sincronizarPersonalizado.setText("Sincronizar");
        sincronizarPersonalizado.setToolTipText("Envia el documento que usted le indique");
        SincronizarPane.add(sincronizarPersonalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 470, 60));
        SincronizarPane.add(estadoSincronizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 330, 20));
        SincronizarPane.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 310, 10));

        SincronizarTabbed.addTab("Sincronizar", SincronizarPane);

        getContentPane().add(SincronizarTabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));
        SincronizarTabbed.getAccessibleContext().setAccessibleName("Configuraciones");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfiguracionesPane;
    private javax.swing.JButton ExportarAutomatico;
    private javax.swing.JPanel ExportarPane;
    private javax.swing.JButton ExportarTodo;
    private javax.swing.JPanel SincronizarPane;
    private javax.swing.JTabbedPane SincronizarTabbed;
    private javax.swing.JTextField centralParaEnvio;
    private javax.swing.JLabel centralParaEnvio_Label;
    private javax.swing.JPasswordField contra1;
    private javax.swing.JLabel contra_label1;
    private javax.swing.JTextField correo1;
    private javax.swing.JTextField correoCentral1;
    private javax.swing.JLabel correoCentral1_label;
    private javax.swing.JTextField correoPaEnvio;
    private javax.swing.JLabel correoParaEnvio_Label;
    private javax.swing.JLabel correo_label1;
    private javax.swing.JTextField direccionServer1;
    private javax.swing.JLabel direccionServer_label1;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel estadoSincronizar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton importar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField nombreMostrar1;
    private javax.swing.JLabel nombreMostrar_label1;
    private javax.swing.JButton probar;
    private javax.swing.JTextField puerto1;
    private javax.swing.JLabel puerto_label1;
    private javax.swing.JButton sincronizarPersonalizado;
    private javax.swing.JLabel tipoSincronizacion2;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel ultimaExportacionFechaSincronizacion1;
    private javax.swing.JLabel ultimaExportacionTipoSincronizacion1;
    private javax.swing.JLabel ultimaExportacionVentaSincronizacion;
    private javax.swing.JLabel ultimaImportacionSincronizacion;
    private javax.swing.JLabel ultimaSincronizacion2;
    private javax.swing.JLabel ultimaVentaSincronizacion1;
    private javax.swing.JLabel ultimaVentaSincronizacion2;
    private javax.swing.JLabel ultimaVentaSincronizacion3;
    // End of variables declaration//GEN-END:variables
}
