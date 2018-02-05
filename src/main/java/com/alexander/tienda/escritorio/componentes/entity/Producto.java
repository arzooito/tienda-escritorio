/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes.entity;

/**
 *
 * @author Almerimatik
 */
public class Producto {
    
    private String nombre;
    private String marca;
    private String formato;
    private float precio;
    private String foto;
    private String cat;
    private String sub;
    private int unds;
    
    public Producto(){
        
    }

    public Producto(String nombre, String marca, String formato, float precio, String foto, String cat, String sub, int unds) {
        this.nombre = nombre;
        this.marca = marca;
        this.formato = formato;
        this.precio = precio;
        this.foto = foto;
        this.cat = cat;
        this.sub = sub;
        this.unds = unds;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getUnds() {
        return unds;
    }

    public void setUnds(int unds) {
        this.unds = unds;
    }
    
    
}
