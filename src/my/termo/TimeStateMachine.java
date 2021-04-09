/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termo;

import javax.swing.JFrame;
import my.timeVista.TimeVista;

/**
 *
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class TimeStateMachine {
    private JFrame currentState;
    
    public TimeStateMachine(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new TimeVista();
                currentState.setVisible(true);
            }
        });
    }
    
    /**
     * Cierra la ventana de la configuracion basica
     */
    public void close(){
        currentState.setVisible(false);
        currentState.dispose();
    }
    
}
