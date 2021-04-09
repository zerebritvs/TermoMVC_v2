/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termo;

import javax.swing.JFrame;
import my.termoVista.TermoVista;

/**
 *
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class TermoStateMachine {
    private JFrame currentState;
    
    public TermoStateMachine(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new TermoVista();
                currentState.setVisible(true);
            }
        });
    }
    
    /**
     * Cierra la ventana del termo
     */
    public void close(){
        currentState.setVisible(false);
        currentState.dispose();
    }
    
}
