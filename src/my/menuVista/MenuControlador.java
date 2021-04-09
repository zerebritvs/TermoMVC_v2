/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.menuVista;

import my.termo.Main;
import my.termoModelo.ModeloTermo;

/**
 *
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class MenuControlador {
    private MenuVista miVista;
    private ModeloTermo miModelo;
    
    /**
     * Contructor de MenuControlador
     * @param v
     * @param m 
     */
    public MenuControlador(MenuVista v, ModeloTermo m){
        
        miVista = v;
        miModelo = m;
    }
    
    public void goTermo(){
        Main.goTermo();
    }
    
    public void goTime(){
        Main.goTime();
    }
    
    public void goPrograma(){
        Main.goPrograma();
    }
}
