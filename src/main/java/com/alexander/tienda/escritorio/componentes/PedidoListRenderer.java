/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes;

import com.alexander.tienda.escritorio.componentes.entity.Pedido;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Almerimatik
 */
public class PedidoListRenderer extends JTextArea implements ListCellRenderer<Pedido>{

    public PedidoListRenderer() {
        setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Pedido> list, Pedido pedido, int index, boolean isSelected, boolean cellHasFocus) {
        
        
        String salida = pedido.toString();
        setText(salida);
        setLineWrap(true);
        setWrapStyleWord(true);
        
        String tooltip = "<html><b>"+pedido.getId()+"\t"+pedido.getUsuario()+"</b>"+"<br>"
                +"<b>Fecha: </b>"+ pedido.getFecha() + "<br>" 
                +"<b>Recogida: </b>"+ pedido.getFechaRecogida()+"\t"+"\"<b>Hora: </b>"+pedido.getHoraRecogida()+"<br>"+"</html>";
        setToolTipText(tooltip);
        
        String col = pedido.color();      
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
