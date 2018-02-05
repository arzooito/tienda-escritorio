/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.utils;

import com.alexander.tienda.escritorio.WS.Ws;
import com.alexander.tienda.escritorio.componentes.Foto;
import com.alexander.tienda.escritorio.componentes.entity.Producto;
import com.alexander.tienda.escritorio.ventanas.PedidoDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

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
    
    public static void descargarFoto(Producto prod){
        
        FileOutputStream fos = null;
        
        String rutaFoto = rutaFoto(prod);
        String rutaCompleta = Sesion.getRaizFotos() + rutaFoto;
        Rutas.crearDir(Rutas.adaptarRuta(rutaCompleta),true);
        
        System.out.println("La ruta de descarga de la foto es ---------> "+rutaCompleta);
        File file = new File(rutaCompleta);
        
        if(!file.exists() || file.length() == 0){
            
            byte[] foto = Ws.getFoto(rutaFoto);
        
            try {
                fos = new FileOutputStream(file);
                fos.write(foto);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PedidoDialog.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PedidoDialog.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(PedidoDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            System.out.println("La ruta "+rutaCompleta+ " ya existe");
        }
    }
    
    public static Foto cargarFoto(Producto prod, JPanel panelFoto, String rutaSin){
        
        String ruta = Sesion.getRaizFotos() + rutaFoto(prod);
        
        try{
            descargarFoto(prod);
        }catch(Exception e){
            System.out.println("Error descargando la foto");
        }
        
        Foto foto;
        if(isFoto(ruta)){
            foto = new Foto(panelFoto,ruta);
        }else{
            foto = new Foto(panelFoto,rutaSin);
        }
        
        return foto; 
    }
    
    private static boolean isFoto(String ruta){

        File file = new File(ruta);
         return file.exists() && file.length()>0;
    }
    
}
