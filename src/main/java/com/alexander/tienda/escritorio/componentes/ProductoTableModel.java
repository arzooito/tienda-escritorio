/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.tienda.escritorio.componentes;

import com.alexander.tienda.escritorio.componentes.entity.Producto;
import java.util.LinkedList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Almerimatik
 */
public class ProductoTableModel implements TableModel{
    
    private LinkedList suscriptores = new LinkedList();
    private LinkedList datos = new LinkedList();
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column) {
       
        switch (column) { 
            case 0:                                                      
                return "Nombre"; 
            case 1:                                                       
                return "Marca";
            case 2:                                                       
                return "Formato";
            case 3:                                                       
                return "Precio";
            case 4:                                                       
                return "Unds.";
            case 5:                                                       
                return "Total";
            default:
                return null;
        }
        
    }

    @Override
    public Class<?> getColumnClass(int column) {
        
        switch (column) { 
            case 0:                                                      
                return String.class; 
            case 1:                                                       
                return String.class;
            case 2:                                                       
                return String.class;
            case 3:                                                       
                return Float.class;
            case 4:                                                       
                return Integer.class; 
            case 5:                                                       
                return Float.class;
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
        
        Producto prod = (Producto)datos.get(row);       
        switch (column) { 
            case 0:                                                      
                return prod.getNombre(); 
            case 1:                                                       
                return prod.getMarca();
            case 2:                                                       
                return prod.getFormato();
            case 3:                                                       
                return prod.getPrecio();
            case 4:                                                       
                return prod.getUnds();
            case 5:
                return prod.getPrecio() * prod.getUnds();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        
        Producto prod = (Producto)datos.get(row);       
        switch (column) { 
            case 0:                                                      
                prod.setNombre((String)value);
                break; 
            case 1:                                                       
                prod.setMarca((String)value);
                break;
            case 2:                                                       
                prod.setFormato((String)value);
                break;
            case 3:                                                       
                prod.setPrecio((float)value);
                break;
            case 4:                                                       
                prod.setUnds((int)value);
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
    
    public void addProducto(Producto prod){
        
        datos.add(prod);
        
        TableModelEvent evento; 
        evento = new TableModelEvent (
        this, this.getRowCount()-1, this.getRowCount()-1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT); 
        
        int i;

        for (i=0; i<suscriptores.size(); i++){
            ((TableModelListener)suscriptores.get(i)).tableChanged(evento);
        }     
    }
    
    public Producto getProducto(int row){
        
        if(row<datos.size() && row > -1){
            Producto prod = (Producto)datos.get(row);
            return prod;
        }else{
            return null;
        }
        
    }
    
    public Object rmProducto(int fila){
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
