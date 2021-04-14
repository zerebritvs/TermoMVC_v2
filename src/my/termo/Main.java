/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termo;

import my.termoModelo.ModeloTermo;

/**
 * Clase Main
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class Main {
    private static WindowStateMachine windowStateMachine;
    private static ModeloTermo modelo;
    
    
    /**
     * Inicializa la maquina de estados 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        modelo = new ModeloTermo();
        windowStateMachine = new WindowStateMachine(modelo); 
    }
    
    /**
     * Obtiene la maquina de estados Window
     * @return windowStateMachine
     */
    public static WindowStateMachine getStateMachineWindow(){
        return windowStateMachine;
    }
    
    
}
