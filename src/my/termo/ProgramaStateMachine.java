/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termo;

import javax.swing.JFrame;
import my.programaVista.ProgramaVista;

/**
 *
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class ProgramaStateMachine {
    private JFrame currentState;
    
    public ProgramaStateMachine(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new ProgramaVista();
                currentState.setVisible(true);
            }
        });
    }
    
    /**
     * Cierra la ventana del gestor de programas
     */
    public void close(){
        currentState.setVisible(false);
        currentState.dispose();
    }
    
}
