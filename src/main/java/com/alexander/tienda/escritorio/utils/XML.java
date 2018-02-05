/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.utils;

import com.alexander.tienda.escritorio.componentes.entity.Pedido;
import com.alexander.tienda.escritorio.componentes.entity.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.dipalme.policia.webbackend.comun.Fechas;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;


/**
 *
 * @author arzoo
 */
public class XML {
    
    public static Document getDocumento(String xml) {
	if (!org.zkoss.lang.Strings.isBlank(xml)) {
            try {
                javax.xml.parsers.DocumentBuilder docBuilder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();

                docBuilder.setErrorHandler(new org.xml.sax.ErrorHandler() {
                        @Override
                        public void warning(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
                            java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, "Warning", exception);
                        }

                        @Override
                        public void error(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
                            java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, "Error", exception);
                        }

                        @Override
                        public void fatalError(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
                            java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, "FatalError", exception);
                        }
                });

                return docBuilder.parse(new java.io.ByteArrayInputStream(xml.getBytes("UTF-8")));
            }
            catch(Exception ex) {
                java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
	return null;
    }
    
    public static List<Pedido> getPedidos(Document doc) throws DOMException,NumberFormatException{
        
        int i;
        List<Pedido> pedidos = new ArrayList<>();
        NodeList nodosPedido = doc.getElementsByTagName("pedido");
        Element elementoPedido;
        Pedido pedido;
        
        if(nodosPedido != null && nodosPedido.getLength()>0){
            for(i=0; i<nodosPedido.getLength();i++){

               pedido = new Pedido();
               elementoPedido = (Element)nodosPedido.item(i);
               String id = elementoPedido.getAttribute("id");
               String fecha = elementoPedido.getAttribute("fecha");
               String fechaRecogida = elementoPedido.getAttribute("fechaRecogida");
               String horaRecogida = elementoPedido.getAttribute("horaRecogida");
               String usuario = elementoPedido.getAttribute("usuario");

               pedido.setId(id);
               pedido.setFecha(fecha);
               pedido.setFechaRecogida(fechaRecogida);
               pedido.setHoraRecogida(horaRecogida);
               pedido.setUsuario(usuario);
               pedido.setProductos(getProductos(doc));

               pedidos.add(pedido);
            }
        }

        return pedidos;
    }
    
    public static List<Producto> getProductos(Document doc) throws DOMException,NumberFormatException{
       
        List<Producto> productos = new ArrayList<>();
        
        if(doc != null){   
            int i;
            Producto prod;
            
            NodeList nodosProducto = doc.getElementsByTagName("producto");
            Element elementoProducto = null;
            
            if(nodosProducto != null && nodosProducto.getLength()>0){
                for(i=0; i<nodosProducto.getLength();i++){
                    
                    prod = new Producto();
                    elementoProducto = (Element)nodosProducto.item(i);
                    
                    String nombre = elementoProducto.getAttribute("nombre");
                    String marca = elementoProducto.getAttribute("marca");
                    String formato = elementoProducto.getAttribute("formato");
                    String precio = elementoProducto.getAttribute("precio");
                    String foto = elementoProducto.getAttribute("foto");
                    String cat = elementoProducto.getAttribute("cat");
                    String sub = elementoProducto.getAttribute("sub");
                    String unds = elementoProducto.getAttribute("unds");
                     
                    prod.setNombre(nombre);
                    prod.setMarca(marca);
                    prod.setFormato(formato);
                    prod.setPrecio(Float.parseFloat(precio));
                    prod.setFoto(foto);
                    prod.setCat(cat);
                    prod.setSub(sub);
                    prod.setUnds(Integer.parseInt(unds));
                    
                    productos.add(prod);
                }  
            }
        }         
        
        return productos;
    }
    
}
