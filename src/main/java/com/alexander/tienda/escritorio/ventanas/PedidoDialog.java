/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.ventanas;

import com.alexander.tienda.escritorio.WS.Ws;
import com.alexander.tienda.escritorio.componentes.ProductoTableModel;
import com.alexander.tienda.escritorio.componentes.entity.Pedido;
import com.alexander.tienda.escritorio.componentes.entity.Producto;
import com.alexander.tienda.escritorio.utils.Rutas;
import com.alexander.tienda.escritorio.utils.Sesion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Almerimatik
 */
public class PedidoDialog extends javax.swing.JDialog {

    List<Pedido> lista;
    int index;
    Producto prod;
    Pedido pedido;
    private final String RUTA_SIN_FOTO = getClass().getResource("/img/sinImagen.png").getFile();
    private static final String RAIZ = Sesion.getRaizFotos();
    private final ProductoTableModel tableModel = new ProductoTableModel();
            
    /**
     * Creates new form pedidoDialog
     */
    public PedidoDialog(java.awt.Frame parent, boolean modal, List<Pedido> lista, int index) {
        super(parent, modal);
        initComponents();
        prepararTabla();
        this.lista = copiarLista(lista);
        this.index  = index;
        rellenarPedido();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fichaProducto = new javax.swing.JPanel();
        panelFoto = new javax.swing.JPanel();
        labNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labPrecio = new javax.swing.JLabel();
        labSubcategoria = new javax.swing.JLabel();
        labCategoria = new javax.swing.JLabel();
        labFormato = new javax.swing.JLabel();
        labMarca = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label45 = new javax.swing.JLabel();
        labIdPedido = new javax.swing.JLabel();
        labUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labFechaRecogida = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labHoraRecogida = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido");
        setIconImage(null);

        fichaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha producto"));

        panelFoto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        labNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labNombre.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Marca: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Formato: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Subcategoria:");

        labPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labPrecio.setText("00,00");

        labSubcategoria.setText("subcategoria");

        labCategoria.setText("Categoria");

        labFormato.setText("Formato");

        labMarca.setText("Marca");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("€");

        javax.swing.GroupLayout fichaProductoLayout = new javax.swing.GroupLayout(fichaProducto);
        fichaProducto.setLayout(fichaProductoLayout);
        fichaProductoLayout.setHorizontalGroup(
            fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fichaProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fichaProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fichaProductoLayout.createSequentialGroup()
                                .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labMarca)
                                    .addComponent(labFormato)
                                    .addComponent(labCategoria)
                                    .addComponent(labSubcategoria))))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fichaProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addContainerGap())))
        );
        fichaProductoLayout.setVerticalGroup(
            fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fichaProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fichaProductoLayout.createSequentialGroup()
                        .addComponent(labNombre)
                        .addGap(33, 33, 33)
                        .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labMarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labFormato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labSubcategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fichaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPrecio)
                            .addComponent(jLabel10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos pedido"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Id.Pedido:");

        label45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label45.setText("Usuario:");

        labIdPedido.setText("0000");

        labUsuario.setText("-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fecha:");

        labFecha.setText("00-00-0000 00:00:00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha  de recogida:");

        labFechaRecogida.setText("00-00-0000");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Hora:");

        labHoraRecogida.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(labIdPedido)
                        .addGap(53, 53, 53)
                        .addComponent(label45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(labFecha))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labFechaRecogida)))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labHoraRecogida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(label45)
                    .addComponent(labIdPedido)
                    .addComponent(labUsuario))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labFechaRecogida)
                    .addComponent(jLabel11)
                    .addComponent(labHoraRecogida))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFinalizar.setText("Finalizar Pedido");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnAnterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        tablaProductos.setModel(tableModel);
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tablaProductos);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText(" Productos");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Total:");

        labTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labTotal.setText("00,00");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("€");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(labTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labTotal)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fichaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnterior)
                        .addGap(26, 26, 26)
                        .addComponent(btnSiguiente)
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fichaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnterior)
                            .addComponent(btnSiguiente))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
              
        int confirm;
        confirm = JOptionPane.showOptionDialog(this,
                "¿Esta seguro de que quiere finalizar este pedido?",
                "Finalizar pedido",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, 
                null, null, null);
        if(confirm != 1){          
            finalizarPedido();
        }
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(index > 0){
            index--;
            rellenarPedido();
        }else{
            
        }     
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(index < lista.size()-1){
            index++;
            rellenarPedido();
        }else{
            
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel fichaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labCategoria;
    private javax.swing.JLabel labFecha;
    private javax.swing.JLabel labFechaRecogida;
    private javax.swing.JLabel labFormato;
    private javax.swing.JLabel labHoraRecogida;
    private javax.swing.JLabel labIdPedido;
    private javax.swing.JLabel labMarca;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labPrecio;
    private javax.swing.JLabel labSubcategoria;
    private javax.swing.JLabel labTotal;
    private javax.swing.JLabel labUsuario;
    private javax.swing.JLabel label45;
    private javax.swing.JPanel panelFoto;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables


    private void setColumsWidth(){
        int[] anchos  = {150, 130, 130, 52, 44, 52};
        TableColumnModel columnModel = tablaProductos.getColumnModel();
        for (int i = 0; i < anchos.length; i++) {
            columnModel.getColumn(i).setMaxWidth(anchos[i]);
        }
    }
    
    private void addOnSelectedListener(){
        tablaProductos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {

                Producto producto = tableModel.getProducto(tablaProductos.getSelectedRow());
                if(producto != null){
                    prod = producto;
                    rellenarFicha(prod); 
                }
                
            }
        });
    }
    
    private void prepararTabla(){
        setColumsWidth();
        addOnSelectedListener();
    }
    
    private void rellenarPedido(){
        
        tablaProductos.clearSelection();
        tableModel.clear();
        
        pedido = lista.get(index);
        float total = 0;
        
        labIdPedido.setText(pedido.getId());
        labUsuario.setText(pedido.getUsuario());
        labFecha.setText(pedido.getFecha());
        labFechaRecogida.setText(pedido.getFechaRecogida());
        labHoraRecogida.setText(pedido.getHoraRecogida());
        
        List<Producto> productos = pedido.getProductos();
        
        if(!productos.isEmpty()){
            for(Producto reg : productos){
                tableModel.addProducto(reg);
                total += reg.getPrecio() * reg.getUnds();
            }
            labTotal.setText(String.format("%.2f", total));
            tablaProductos.setRowSelectionInterval(0, 0);
        }
    }
    
    private void rellenarFicha(Producto prod){
      
        labNombre.setText(prod.getNombre());
        labMarca.setText(prod.getMarca());
        labFormato.setText(prod.getFormato());
        labCategoria.setText(prod.getCat());
        labSubcategoria.setText(prod.getSub());
        labPrecio.setText(String.format("%.2f",prod.getPrecio()));
        
        try{
            panelFoto.removeAll();
            panelFoto.add(Rutas.cargarFoto(prod,panelFoto,RUTA_SIN_FOTO));
            panelFoto.repaint();
        }catch(Exception e){
            System.out.println("Error cargando la foto");
        }
    }
    
    private void finalizarPedido(){
        
        if(!lista.isEmpty()){
            long id = Long.parseLong(pedido.getId());
            Ws.finalizarPedido(Sesion.getUsuario(), Sesion.getPass(),id);
            lista.remove(index);
            VentanaPrincipal vp = (VentanaPrincipal)getParent();
            vp.rellenarModelo();
            if((index-1) > -1 && (lista.size()) > 0){
                index--;
                rellenarPedido();
            }else if(!lista.isEmpty()){
                index=0;
                rellenarPedido();
            }else{
                limpiarPagina();
            }
        } 
    }
    
    private void limpiarPagina(){
        
        labIdPedido.setText("---");
        labUsuario.setText("---");
        labFecha.setText("---");
        labFechaRecogida.setText("---");
        labHoraRecogida.setText("---");
        labTotal.setText("00,00");
        tableModel.clear();
        tablaProductos.repaint();
        
        labNombre.setText("---");
        labMarca.setText("---");
        labFormato.setText("---");
        labCategoria.setText("---");
        labSubcategoria.setText("---");
        labPrecio.setText("00,00");
        
        panelFoto.removeAll();
        panelFoto.repaint();
    }
    
    private List<Pedido> copiarLista(List<Pedido> lista){
        
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.addAll(lista);
        return pedidos;
    }
}
