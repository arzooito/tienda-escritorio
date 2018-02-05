/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Almerimatik
 */
public class PrincipalVListener implements WindowListener{
   
    JFrame frame;
    
    public PrincipalVListener(JFrame frame){
      this.frame = frame;  
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Bienvenido a la aplicación de escritorio de Gabarron");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Hasta pronto");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Programa cerrado");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        frame.setState(Frame.NORMAL);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("");
    }
    
}
