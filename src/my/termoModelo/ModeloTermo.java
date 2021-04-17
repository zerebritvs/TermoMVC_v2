/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termoModelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Clase Modelo del patrón de diseño MVC
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class ModeloTermo {
    
    private boolean power;
    private int modo;
    private ArrayList<Programa> programas;
    private int dia;
    private int horas;
    private int minutos;
    
    /**
     * Constructor de ModeloTermo
     */
    public ModeloTermo(){
        
        power = false;
        modo = 0;
        dia = LocalDate.now().getDayOfWeek().getValue();
        LocalDateTime localDate = LocalDateTime.now();
        horas = localDate.getHour();
        minutos = localDate.getMinute();
        
        programas = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            
            programas.add(new Programa());   
        }   
    }
    
    /**
     * Alterna entre 0n/Off
     * @param power 
     */
    public void setPower(boolean power){
      this.power = power;
    }
    
    /**
     * Comprueba si el sistema esta On/Off
     * @return power
     */
    public boolean getPower(){
        return this.power;
    }
    
    /**
     * Alterna entre modos de funcionamiento del sistema
     * @param modo
     */
    public void setModo(int modo){
      this.modo = modo;
    }
    
    /**
     * Obtiene el modo de funcionamiento del sistema
     * @return modo
     */
    public int getModo(){
        return this.modo;
    }
    
    /**
     * Obtiene un ArrayList con los programas
     * @return programas
     */
    public ArrayList<Programa> getPrograma(){
        
        return this.programas;
    }
    
    /**
     * Almacena en un ArrayList los programas 
     * @param programas
     */
    public void setPrograma(ArrayList<Programa> programas){
        this.programas = programas;
    }
    
    /**
     * Almacena el dia
     * @param dia
     */
    public void setDia(int dia){
      this.dia = dia;
    }
    
    /**
     * Obtiene el dia del sistema
     * @return dia
     */
    public int getDia(){
        return this.dia;
    }
    
    /**
     * Almacena las horas
     * @param horas
     */
    public void setHoras(int horas){
      this.horas = horas;
    }
    
    /**
     * Obtiene la horas
     * @return horas
     */
    public int getHoras(){
        return this.horas;
    }
    
    /**
     * Almacena los minutos
     * @param minutos
     */
    public void setMinutos(int minutos){
      this.minutos = minutos;
    }
    
    /**
     * Obtiene los minutos
     * @return minutos
     */
    public int getMinutos(){
        return this.minutos;
    }
    
    
}
