/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termo;

import my.termoModelo.ModeloTermo;
import my.termoVista.TermoVista;

/**
 * Clase Main
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class Main {
    private static MenuStateMachine menuStateMachine;
    private static TermoStateMachine termoStateMachine;
    private static TimeStateMachine timeStateMachine;
    private static ProgramaStateMachine programaStateMachine;
    private ModeloTermo model;
    
    
    /**
     * Inicializa la maquina de estados Menu
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        menuStateMachine = new MenuStateMachine();
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TermoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TermoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TermoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TermoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
    }
    
    /**
     * Obtiene la maquina de estados Menu
     * @return menuStateMachine
     */
    public static MenuStateMachine getStateMachineMenu(){
        return menuStateMachine;
    }
    
    /**
     * Obtiene la maquina de estados Termo
     * @return termoStateMachine
     */
    public static TermoStateMachine getStateMachineTermo(){
        return termoStateMachine;
    }
    
    /**
     * Obtiene la maquina de estados Time
     * @return timeStateMachine
     */
    public static TimeStateMachine getStateMachineTime(){
        return timeStateMachine;
    }
    
    /**
     * Obtiene la maquina de estados Programa
     * @return programaStateMachine
     */
    public static ProgramaStateMachine getStateMachinePrograma(){
        return programaStateMachine;
    }
    
    /**
     * Cierra Menu y abre termo
     */
    public static void goTermo(){
        menuStateMachine.close();
        termoStateMachine = new TermoStateMachine();
    }
    
    /**
     * Cierra Menu y abre Time
     */
    public static void goTime(){
        menuStateMachine.close();
        timeStateMachine = new TimeStateMachine();
    }
    
    /**
     * Cierra Menu y abre Programa
     */
    public static void goPrograma(){
        menuStateMachine.close();
        programaStateMachine = new ProgramaStateMachine();
    }
    
    /**
     * Cierra Time y abre Menu
     */
    public static void goMenuFromTime(){
        timeStateMachine.close();
        menuStateMachine = new MenuStateMachine();
    }
    
    /**
     * Cierra Termo y abre Menu
     */
    public static void goMenuFromTermo(){
        termoStateMachine.close();
        menuStateMachine = new MenuStateMachine();
    }
    
    /**
     * Cierra Programa y abre Menu
     */
    public static void goMenuFromPrograma(){
        programaStateMachine.close();
        menuStateMachine = new MenuStateMachine();
    }
}
