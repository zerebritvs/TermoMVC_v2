/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.timeVista;

import my.menuVista.MenuVista;
import my.termo.Main;
import my.termoModelo.ModeloTermo;

/**
 *
 * @author Juan Antnio Pagés
 * @author Fernando San José
 */
public class TimeControlador {
    private TimeVista miVista;
    private ModeloTermo miModelo;
    
    /**
     * Contructor de TimeControlador
     * @param v
     * @param m 
     */
    public TimeControlador(TimeVista v, ModeloTermo m){
        
        miVista = v;
        miModelo = m;
    }
    
    public void goMenuFromTime(){
        Main.goMenuFromTime();
    }
}
