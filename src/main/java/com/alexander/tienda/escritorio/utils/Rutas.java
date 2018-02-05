/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.utils;

import com.alexander.tienda.escritorio.componentes.entity.Producto;
import java.io.File;

/**
 *
 * @author Almerimatik
 */
public class Rutas {
    
    public static String rutaFoto(Producto prod){
        
        return "productos/" 
                + prod.getCat() + "/" 
                + prod.getSub() + "/" 
                + prod.getMarca() + "/" 
                + prod.getFoto();
    }
    
    public static String adaptarRuta(String ruta){
        
        String sistema = System.getProperty("os.name");
        String rutaAdaptada;
        if(sistema.contains("Windows")){
            rutaAdaptada = ruta.replace("/","\\");
        }else{
            rutaAdaptada = ruta.replace("\\","/");
        }  
        
        return rutaAdaptada;
    }
    
    public static void crearDir(String ruta, boolean recursivo){
        String separador = "";
        String[] partes;
        
        String sistema = System.getProperty("os.name");
        System.out.println("El sistema del equipo es "+sistema);
        
        if(sistema.contains("Windows")){
            separador = "\\";
            partes = ruta.split(separador+separador);
            
        }else{
            separador = "/";
            partes = ruta.split(separador);
        }       
        
        int num = partes.length;
        if(isFileName(partes[num-1])){
            num--;
        }
        File dir;
        String rutaAux = "";
                       
        System.out.println("Se va a crear la ruta hasta "+ruta);
        if(recursivo){
            for(int n=0; n<num;n++){               
                rutaAux+=partes[n];
                dir = new File(rutaAux);
                if(!dir.exists()){
                    dir.mkdir();
                    System.out.println("Se ha creado "+rutaAux);
                }               
                rutaAux+=separador;
                
            }
        }else{
            dir = new File(ruta);
            if(!dir.exists()){
                    dir.mkdir();
                    System.out.println("Se ha creado "+ ruta);
            }else{
                System.out.println("La ruta "+ruta+" ya existe");
            }
        }
    }
    
    public static boolean isFileName(String fileName){
        
        return(fileName.matches(".+\\.png$") || fileName.matches(".+\\.jpg$"));
    }
}
