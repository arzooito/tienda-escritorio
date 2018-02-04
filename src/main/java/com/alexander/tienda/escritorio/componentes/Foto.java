/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes;

/**
 *
 * @author Almerimatik
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Foto extends javax.swing.JPanel {
    int x, y;
    String ruta;
    final int BORDE = 2;
    
    public Foto(JPanel jPanel1, String ruta) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x-BORDE, y-BORDE);
        this.ruta = ruta;
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(ruta);
        g.drawImage(Img.getImage(), 0+BORDE, 0+BORDE, x-BORDE*2, y-BORDE*2, null);
    }    

    
    ////////////////////////para incrustar en un jpanel////////////////////
    //Foto im = new Imagen(jPanel1);
    //jPanel1.add(im).repaint();
}
