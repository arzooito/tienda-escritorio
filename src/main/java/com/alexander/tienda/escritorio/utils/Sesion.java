/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Almerimatik
 */
public class Sesion {
    
    static Properties prop = new Properties();
    private static String pass;
    private static String usuario;
    private static String urlTiendaWS;
    private static String raizFotos;
    private static String posicion;
    private static String urlAdministracion;
    private static String sonido;
    private static String autologin;
    private static String usuarioAuto;
    private static String passwordAuto;
    
    public static void iniciar(){   
        try {
            prop.load(new FileReader("configuracion/config.properties"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        urlTiendaWS = prop.getProperty("urlTiendaWS");
        raizFotos = prop.getProperty("raizFotos");
        posicion = prop.getProperty("posicion");
        urlAdministracion = prop.getProperty("urlAdministracion");
        sonido = prop.getProperty("sonido");
        autologin = prop.getProperty("autologin");
        usuarioAuto = prop.getProperty("usuarioAuto");
        passwordAuto = prop.getProperty("passwordAuto");
       
        
        prop.clear();
        
    } 

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        Sesion.pass = pass;
    }


    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Sesion.usuario = usuario;
    }

    public static String getUrlTiendaWS() {
        return urlTiendaWS;
    }
    

    public static String getRaizFotos() {
        return raizFotos;
    }

    public static String getPosicion() {
        return posicion;
    }

    public static void setPosicion(String posicion) {
        Sesion.posicion = posicion;
    }

    public static String getUrlAdministracion() {
        return urlAdministracion;
    }

    public static boolean isSonido() {
        return sonido.equals("true");
    }

    public static void setSonido(String sonido) {
        Sesion.sonido = sonido;
    }

    public static boolean isAutologin() {
        return autologin.trim().equals("true");
    }

    public static void setAutologin(String autologin) {
        Sesion.autologin = autologin;
    }

    public static String getUsuarioAuto() {
        return usuarioAuto;
    }

    public static String getPasswordAuto() {
        return passwordAuto;
    }
      
}
