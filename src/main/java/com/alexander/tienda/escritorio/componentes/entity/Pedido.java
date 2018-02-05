/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes.entity;

import static com.alexander.tienda.escritorio.utils.Tiempos.minutos;
import java.util.Date;
import java.util.List;
import org.dipalme.policia.webbackend.comun.Fechas;

/**
 *
 * @author Almerimatik
 */
public class Pedido {
    
    private String id;
    private String fecha;
    private String fechaRecogida;
    private String horaRecogida;
    private String usuario;
    private List<Producto> productos;
    
    public Pedido(){
        
    }

    public Pedido(String id, String fecha, String fechaRecogida, String horaRecogida, String usuario, List<Producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.fechaRecogida = fechaRecogida;
        this.horaRecogida = horaRecogida;
        this.usuario = usuario;
        this.productos = productos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaRecogida() {
        return fechaRecogida;
    }

    public void setFechaRecogida(String fechaRecogida) {
        this.fechaRecogida = fechaRecogida;
    }

    public String getHoraRecogida() {
        return horaRecogida;
    }

    public void setHoraRecogida(String horaRecogida) {
        this.horaRecogida = horaRecogida;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
    @Override
    public String toString(){
        String cadena = "Id.Pedido: " + getId() + "\t" +  getUsuario()+ "\n\n" 
                + "Pedido en: " + getFecha() + "\n\n"
                + "Recogida: " + getFechaRecogida() +"\t"+ "Hora: " + getHoraRecogida();
        
        return cadena;
    }
    
    public String color(){
        
        String color = "001433";
        
        String cadenaRecogida = getFechaRecogida() + " " + getHoraRecogida();
        Date recogida = Fechas.Convertir(cadenaRecogida, true);
        long diferencia = minutos(recogida);
        if(diferencia < 0){
            color = "CC0000";
        }else if(diferencia < 5){
            color = "0066FF";
        }
        
        return color;
    }
    
}
