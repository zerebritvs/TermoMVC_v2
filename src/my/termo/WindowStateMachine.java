/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termo;

import javax.swing.JFrame;
import my.menuVista.MenuVista;
import my.programaVista.ProgramaVista;
import my.termoModelo.ModeloTermo;
import my.termoVista.TermoVista;
import my.timeVista.TimeVista;

/**
 * Máquina de estados
 * 
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class WindowStateMachine {
    private static JFrame currentState;
    private static ModeloTermo miModelo;
    
    /**
     * Constructor de WindowStateMachine
     * @param modelo 
     */
    public WindowStateMachine(ModeloTermo modelo){
        this.miModelo = modelo;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new MenuVista();
                currentState.setVisible(true);
            }
        });
    }
    
    private static void close(){
        currentState.setVisible(false);
        currentState.dispose();
    }
    
    /**
     * Cierra Menu y abre Termo
     */
    public static void goTermo(){
        close();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new TermoVista(miModelo);
                currentState.setVisible(true);
            }
        });
        
    }
    
    /**
     * Cierra Menu y abre Time
     */
    public static void goTime(){
        close();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new TimeVista(miModelo);
                currentState.setVisible(true);
            }
        });
        
    }
    
    /**
     * Cierra Menu y abre Programa
     */
    public static void goPrograma(){
        close();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new ProgramaVista(miModelo);
                currentState.setVisible(true);
            }
        });
        
    }
    
    /**
     * Cierra y abre Menu
     */
    public static void goMenu(){
        close();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new MenuVista();
                currentState.setVisible(true);
            }
        });
        
    }
}
