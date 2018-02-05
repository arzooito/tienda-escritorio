/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.utils;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Almerimatik
 */
public class Tiempos {
    
    public static long minutos(Date caduca){
        
        long milis1, milis2, diff;
        long diffMinutos;
        
        Calendar cinicio = Calendar.getInstance();
        Calendar cfinal = Calendar.getInstance();
        cinicio.setTime(new Date());
        cfinal.setTime(caduca);
        milis1 = cinicio.getTimeInMillis();
        milis2 = cfinal.getTimeInMillis();
 
        diff = milis2-milis1;
        
        if(milis2 > milis1){
            
            diffMinutos =  Math.abs (diff / (60 * 1000));
        }else{
            
            diffMinutos = -1l;
        }
        
        
        
        return diffMinutos;
    }
}
