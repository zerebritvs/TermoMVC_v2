/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.menuVista;

import my.termo.WindowStateMachine;
import my.termoModelo.ModeloTermo;

/**
 * Clase MenuControlador del patrón de diseño MVC
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
    
    /**
     * Cierra Menu y abre Time
     */
    public void goTime(){
        WindowStateMachine.goTime();
    }
    
    /**
     * Cierra Menu y abre Programa
     */
    public void goPrograma(){
        WindowStateMachine.goPrograma();
    }
    
    /**
     * Cierra Menu y abre Termo
     */
    public void goTermo(){
        WindowStateMachine.goTermo();
    }
    
    
}
