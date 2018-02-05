/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.WS;

import com.alexander.tienda.escritorio.utils.Sesion;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arzoo
 */
public class Ws {
   
    
    public static boolean login(String nombre, String password){
        
        boolean result = false;
        
        try { // Call Web Service Operation
            es.almerimatik.tienda_ws.ServicioTienda_Service service = new es.almerimatik.tienda_ws.ServicioTienda_Service(urlTiendaWS());
            es.almerimatik.tienda_ws.ServicioTienda port = service.getServicioTiendaPort();
            result = port.loginAdmin(nombre, password);
        } catch (Exception ex) {
            System.out.println("Error en el servicio de login");
        }
        
        return result;
    }
    
    public static String getPedidos(String nombre, String password){
        
        String result = null;
        
        try { 
            es.almerimatik.tienda_ws.ServicioTienda_Service service = new es.almerimatik.tienda_ws.ServicioTienda_Service(urlTiendaWS());
            es.almerimatik.tienda_ws.ServicioTienda port = service.getServicioTiendaPort();
            result = port.cargarPedidos(nombre, password);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            System.out.println("Error en el servicio getPedidos");
        }
        
        return result;
    }  
    
    private static URL urlTiendaWS(){
        URL wsdl = null;
        try {
            wsdl = new URL(Sesion.getUrlTiendaWS());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Ws.class.getName()).log(Level.SEVERE, null, ex);
        }
        return wsdl;
    }
}