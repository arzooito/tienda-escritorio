/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.ventanas;

import com.alexander.tienda.escritorio.componentes.PrincipalVListener;
import com.alexander.tienda.escritorio.utils.XML;
import com.alexander.tienda.escritorio.componentes.PedidoListRenderer;
import com.alexander.tienda.escritorio.utils.Sesion;
import static com.alexander.tienda.escritorio.utils.Sounds.getSound;
import static com.alexander.tienda.escritorio.utils.Sounds.playSound;
import com.alexander.tienda.escritorio.WS.Ws;
import com.alexander.tienda.escritorio.componentes.entity.Pedido;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.sound.sampled.Clip;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Almerimatik
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private DefaultListModel listModel = new DefaultListModel();
    private List<Pedido> listaPedidos = new LinkedList<>();
    private PedidoListRenderer renderer = new PedidoListRenderer();
    private int anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    private int altoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    private Timer timer;
    private boolean minimizado = false;
    private Clip alertaEntra = getSound("entrada.wav");
    private Clip alertaCaduca = getSound("salida.wav");
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {

        Sesion.iniciar();
        initComponents();
        addWindowListener(new PrincipalVListener(this));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SPListaAvisos = new javax.swing.JScrollPane();
        listaAvisos = new javax.swing.JList<>();
        panelCabecera = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMini = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelNumeroAlertas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advertencias");
        setAlwaysOnTop(true);
        setIconImages(null);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        SPListaAvisos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SPListaAvisos.setHorizontalScrollBar(null);

        listaAvisos.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        listaAvisos.setForeground(new java.awt.Color(255, 255, 255));
        listaAvisos.setModel(listModel);
        listaAvisos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaAvisos.setToolTipText("");
        listaAvisos.setAutoscrolls(false);
        listaAvisos.setCellRenderer(renderer);
        listaAvisos.setFixedCellHeight(106);
        listaAvisos.setFixedCellWidth(226);
        listaAvisos.setName(""); // NOI18N
        listaAvisos.setSelectionBackground(new java.awt.Color(255, 102, 0));
        listaAvisos.setVisibleRowCount(10);
        listaAvisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAvisosMouseClicked(evt);
            }
        });
        SPListaAvisos.setViewportView(listaAvisos);

        panelCabecera.setBackground(new java.awt.Color(0, 153, 153));
        panelCabecera.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        btnMini.setToolTipText("");
        btnMini.setFocusable(false);
        btnMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniActionPerformed(evt);
            }
        });

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings.png"))); // NOI18N
        btnSettings.setFocusable(false);
        btnSettings.setMaximumSize(new java.awt.Dimension(16, 16));
        btnSettings.setMinimumSize(new java.awt.Dimension(16, 16));
        btnSettings.setPreferredSize(new java.awt.Dimension(16, 16));
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Nº Avisos:");

        labelNumeroAlertas.setBackground(new java.awt.Color(255, 0, 51));
        labelNumeroAlertas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumeroAlertas.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroAlertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroAlertas.setText("0");
        labelNumeroAlertas.setToolTipText("");
        labelNumeroAlertas.setMaximumSize(new java.awt.Dimension(48, 17));
        labelNumeroAlertas.setMinimumSize(new java.awt.Dimension(24, 17));
        labelNumeroAlertas.setOpaque(true);
        labelNumeroAlertas.setPreferredSize(new java.awt.Dimension(24, 17));

        javax.swing.GroupLayout panelCabeceraLayout = new javax.swing.GroupLayout(panelCabecera);
        panelCabecera.setLayout(panelCabeceraLayout);
        panelCabeceraLayout.setHorizontalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelNumeroAlertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMini, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCabeceraLayout.setVerticalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCabeceraLayout.createSequentialGroup()
                        .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTitulo)
                            .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnMini, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelNumeroAlertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabecera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SPListaAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(SPListaAvisos))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAvisosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAvisosMouseClicked
        int index = listaAvisos.getSelectedIndex();
        ventanaPedido(index);
    }//GEN-LAST:event_listaAvisosMouseClicked

    private void btnMiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiniActionPerformed

        if(minimizado){
            minimizado=false;
        }else{
            minimizado=true;
        }
        resize();

    }//GEN-LAST:event_btnMiniActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int confirm;
        confirm = JOptionPane.showOptionDialog(this,
                "¿Esta seguro de que quiere cerrar la aplicación?",
                "Salir de la aplicación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, 
                null, null, null);
        if(confirm != 1){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        openURL(Sesion.getUrlAdministracion());
    }//GEN-LAST:event_btnSettingsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        VentanaPrincipal ventana = new VentanaPrincipal();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                if(Sesion.isAutologin()){
                    ventana.autoLogin();
                }
                
                ventana.login();
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SPListaAvisos;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMini;
    private javax.swing.JButton btnSettings;
    private javax.swing.JLabel labelNumeroAlertas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<Pedido> listaAvisos;
    private javax.swing.JPanel panelCabecera;
    // End of variables declaration//GEN-END:variables

    public void rellenarModelo(){
            
        String nombre = Sesion.getUsuario();
        String password = Sesion.getPass();
        
        String xml = Ws.getPedidos(nombre, password);
        List<Pedido>listaAux = XML.getPedidos(XML.getDocumento(xml));
        List<Pedido>listaTemp = new LinkedList<>();
        
        ///USAR ITERADORES PARA EVITAR ERRORES DE CONCURRENCIA///
        Iterator<Pedido> iterator = listaAux.iterator();
	while (iterator.hasNext()) {
            Pedido pedido = iterator.next();
            if(!listaPedidos.contains(pedido)){
                listaPedidos.add(pedido);
                listModel.addElement(pedido);
                alertaNueva();
            }
	}
        
        iterator = listaPedidos.iterator();
	while (iterator.hasNext()) {
            Pedido pedido = iterator.next();
            if(!listaAux.contains(pedido)){
                listaTemp.add(pedido);
                boolean bool = listModel.removeElement(pedido);
                System.out.println("el pedido "+pedido.getId()+" -> " + bool);
                alertaCaduca();
            }
	}
        
        for(Pedido pedido : listaTemp){
            if(listaPedidos.contains(pedido)){
                listaPedidos.remove(pedido);
            }
        }
        
        listaTemp.clear();
            
        labelNumeroAlertas.setText(""+listaPedidos.size());
        resize();
    }
    
    private void resize(){
        
        int bordes = 9;
        int cabecera = 32;
        Rectangle rect;
        int lista = 0;
        int altoVentana;
        int anchoVentana;
        int count = listModel.getSize();
        Dimension size;
        
        if(minimizado){
            SPListaAvisos.setVisible(false);
            btnSettings.setVisible(false);
            altoVentana = cabecera;
            anchoVentana = 130;
            
        }else{
            SPListaAvisos.setVisible(true);
            btnSettings.setVisible(true);
            
            if(count > 0){
                rect = listaAvisos.getCellBounds(0, count-1);
                lista = rect.height;
            }else{
                SPListaAvisos.setVisible(false);
                btnSettings.setVisible(false);
            }
            
            altoVentana = cabecera + bordes + lista;
            anchoVentana = 330;
            
            if(altoVentana > altoPantalla){
                altoVentana = altoPantalla;
            }
        }
        
        labelTitulo.setVisible(!minimizado);
        size = new Dimension(anchoVentana,altoVentana);
        this.setPreferredSize(size);
        
        pack();
        ubicar();
    }
    
    private void ubicar(){
        
        int x = 0;
        int y = 0;
        
        String posicion = Sesion.getPosicion();
        
        if(posicion.equals("derecha")){
            x = anchoPantalla - getSize().width;
            y = 0;
        }else if(posicion.equals("izquierda")){
            x = 0;
            y = 0;
        }
        
        Point ubicacion = new Point(x,y);
        setLocation(ubicacion);
    }
    
    public void login(){
        
        Boolean noLogeado = true;
        
        while(noLogeado){
            
            String nombreUsuario = Sesion.getUsuario();
            if(nombreUsuario == null){
                LoginDialog loginDialog = new LoginDialog(this,true);
                loginDialog.setVisible(true);
            }else{
                rellenarModelo();
                initBucle();
                setVisible(true);
                
                noLogeado = false;
            }
        }
    }
    
    public void autoLogin(){
        
        System.out.println("Autologin activado");
        String nombre = Sesion.getUsuarioAuto();
        String password = Sesion.getPasswordAuto();       

        System.out.println("Login para el usuario \""+nombre+"\"");
        if(nombre != "" && password != ""){
            
          boolean registrado = Ws.login(nombre, password);
            
            if(registrado){
                Sesion.setUsuario(nombre);
                Sesion.setPass(password);
                System.out.println("Establecido nombre de usuario como \""+nombre+"\"");

            }else{
                System.out.println("El usuario y/o la contraseña no son válidos");
            } 
        }
        
        login();
    }
       
    private void initBucle(){
        
        timer = new Timer (30000, new ActionListener () 
        { 
            public void actionPerformed(ActionEvent e) 
            { 
                rellenarModelo();
                System.out.println("Se ha actualizado la lista de alertas");
             } 
        }); 
        timer.start();
    }
    
    
    private void ventanaPedido(int index){
           
        PedidoDialog pedidoDialog = new PedidoDialog(this,false,listaPedidos,index);
        pedidoDialog.setVisible(true);
    }
    
    private void alertaNueva(){
        if(Sesion.isSonido()){
            playSound(alertaEntra);
        }       
    }
    
    private void alertaCaduca(){
        if(Sesion.isSonido()){
            playSound(alertaCaduca);
        }
        
    }
    
    public static void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else if (osName.startsWith("Mac OS X")) {
                // Runtime.getRuntime().exec("open -a safari " + url);
                // Runtime.getRuntime().exec("open " + url + "/index.html");
                Runtime.getRuntime().exec("open " + url);
            } else {
                System.out.println("Please open a browser and go to "+ url);
            }
        } catch (IOException e) {
            System.out.println("Failed to start a browser to open the url " + url);
            e.printStackTrace();
        }
    }
}