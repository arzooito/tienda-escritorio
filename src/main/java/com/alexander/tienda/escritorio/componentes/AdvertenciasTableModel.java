/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes;

import es.almerimatik.policia.appolotraffik.escritorio.entity.Resumen;
import java.util.LinkedList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Almerimatik
 */
public class AdvertenciasTableModel implements TableModel{

    private LinkedList suscriptores = new LinkedList();
    private LinkedList datos = new LinkedList();
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
       
        switch (column) { 
           case 0:                                                      
               return "Id"; 
           case 1:                                                       
               return "Pista";
           case 2:                                                       
               return "Mensaje";
           default:
               return null;
        }
        
    }

    @Override
    public Class<?> getColumnClass(int column) {
        
        switch (column) { 
           case 0:                                                      
               return Long.class; 
           case 1:                                                       
               return String.class;
           case 2:                                                       
               return String.class;
           default:
               return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int column ) {
        
        Resumen res = (Resumen)datos.get(row);       
        switch (column) { 
           case 0:                                                      
               return new Long(res.getId()); 
           case 1:                                                       
               return res.getNombrePista();
           case 2:                                                       
               return res.getMensaje();
           default:
               return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        
        Resumen res = (Resumen)datos.get(row);       
        switch (column) { 
           case 0:                                                      
               res.setId((long)value);
               break; 
           case 1:                                                       
               res.setNombrePista((String)value);
               break;
           case 2:                                                       
               res.setMensaje((String)value);
               break;
           default:
               break;
        }
        
        TableModelEvent evento = new TableModelEvent (this, row, row, column);
        
        int i;
        for (i=0; i<suscriptores.size(); i++){
            ((TableModelListener)suscriptores.get(i)).tableChanged(evento);
        }
            
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        suscriptores.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        suscriptores.remove(l);
    }
    
    public void addResumen(Resumen res){
        
        datos.add(res);
        
        TableModelEvent evento; 
        evento = new TableModelEvent (
        this, this.getRowCount()-1, this.getRowCount()-1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT); 
        
        int i;

        for (i=0; i<suscriptores.size(); i++){
            ((TableModelListener)suscriptores.get(i)).tableChanged(evento);
        }     
    }
    
    public Object rmResumen(int fila){
        Object objeto = datos.remove(fila);     
        
        TableModelEvent evento = new TableModelEvent (this, fila, fila, 
        TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE); 
        
        int i;
        for (i=0; i<suscriptores.size(); i++){
            ((TableModelListener)suscriptores.get(i)).tableChanged(evento);
        }
        return objeto;
    }
    
    public void clear(){
        
        while(!datos.isEmpty()){
            datos.removeFirst();
        }
    }
    
}
    
    
