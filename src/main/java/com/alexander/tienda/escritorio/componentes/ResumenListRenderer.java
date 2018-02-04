/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes;

import es.almerimatik.policia.appolotraffik.escritorio.entity.Resumen;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Almerimatik
 */
public class ResumenListRenderer extends JTextArea implements ListCellRenderer<Resumen>{

    public ResumenListRenderer() {
        setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Resumen> list, Resumen res, int index, boolean isSelected, boolean cellHasFocus) {
        
        
        String salida = res.toString();
        setText(salida);
        setLineWrap(true);
        setWrapStyleWord(true);
        String[] mensajes = res.getMensaje().split("\n");
        String mensaje = "";
        for(int i=0; i<mensajes.length; i++){
            mensaje += mensajes[i] + "<br>";
        }
        
        String tooltip =  "<html><b>"+"ID: </b>" + res.getId() +"<br>"+"<b>MATRICULA: </b>"+ res.getMatricula() + "<br><b>" + res.getNombrePista()+"</b>"+ "<br>" + mensaje + "</html>";
        setToolTipText(tooltip);
        
        String col = res.getColor();
        Color fondo = Color.decode("#"+col);
        
        if (isSelected) {           
            setBackground(fondo);
            setForeground(list.getSelectionForeground());
            
        } else {
            setBackground(fondo);
            setForeground(list.getForeground());
        }
        
        
        return this;
    }
    
}
