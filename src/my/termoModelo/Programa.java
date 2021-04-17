/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termoModelo;

import java.util.ArrayList;

/**
 * Esta clase implementa la estructura de datos programa con su correspondiente información
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class Programa {
    
    private ArrayList<Boolean> botones;
    private ArrayList<Integer> temps;
    private String nombre;
    
    /**
     * Constructor de Programa
     */
    public Programa(){
        
        nombre = "Programa";
        
        botones = new ArrayList<>(6);
        temps = new ArrayList<>(2);
        
        for (int i = 0; i < 6; i++){
            botones.add(false);
        }
        
        temps.add(0, 5);
        temps.add(1, 19);
    }
    
    /**
     * Obtiene un ArrayList con las temperaturas siendo la posición 0 la mínima y la 1 la máxima
     * @return ArrayList con las temperaturas
     */
    public ArrayList<Integer> getProgramTemps(){
        return this.temps;
    }
    
    /**
     * Almacena el ArrayList con las temperaturas siendo la posición 0 la mínima y la 1 la máxima
     * @param temps
     */
    public void setProgramTemps(ArrayList<Integer> temps){
        this.temps = temps;
    }
    
    /**
     * Obtiene ArrayList de booleans 
     * @return ArrayList de booleans 
     */
    public ArrayList<Boolean> getProgramButtons(){
        return this.botones;
    }
    
    /**
     * Almacena ArrayList de booleans
     * @param botones 
     */
    public void setProgramButtons(ArrayList<Boolean> botones){
        this.botones = botones;
    }
    
    /**
     * Obtiene el nombre del programa
     * @return nombre
     */
    @Override
    public String toString(){
        return nombre;
    }
    
    /**
     * Almacena el nombre del programa
     * @return nombreNuevo
     */
    public void setNombre(String nombreNuevo){
        this.nombre = nombreNuevo;
    }
    
}
