/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.programaVista;

import java.awt.Component;
import javax.swing.JPanel;
import my.termo.WindowStateMachine;
import my.termoModelo.ModeloTermo;

/**
 *
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class ProgramaControlador {
    private ProgramaVista miVista;
    private ModeloTermo miModelo;
    
    
    /**
     * Contructor de ProgramaControlador
     * @param v
     * @param m 
     */
    public ProgramaControlador(ProgramaVista v, ModeloTermo m){
        
        miVista = v;
        miModelo = m;
    }
    
    private void setPanelEnabled(JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);

        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof JPanel) {
                setPanelEnabled((JPanel) component, isEnabled);
            }
            component.setEnabled(isEnabled);
        }
    }
    
    /**
     * Inicializa el gestor de programas
     */
    public void initPrograma(){
        setPanelEnabled(miVista.getJPanelMedio(), false);
        setPanelEnabled(miVista.getJPanelDerecha(), false);
        miVista.getJComboBoxProgramas().removeAllItems();
        
        for(int i = 0; i < 3; i++){
            miVista.getJComboBoxProgramas().addItem(miModelo.getPrograma().get(i));
        }
        
            
    }
    
    /**
     * Cambia el nombre del programa selecionado
     */
    public void cambiaNombre(){
        int index = miVista.getJComboBoxProgramas().getSelectedIndex();
        String  nuevoNombre = miVista.getJTextFieldNombre().getText();
        for(int i = 0; i < miModelo.getPrograma().size(); i++){
            if(i==index){
               //nuevoNombre = new Programa();
               //nuevoNombre = (Programa)miModelo.getPrograma().get(i);
            }
        }
    }
    
    public void nuevoPrograma(){
        setPanelEnabled(miVista.getJPanelMedio(), true);
        setPanelEnabled(miVista.getJPanelDerecha(), true);
    }
    
    /**
     * Cierra Programa y abre Menu
     */
    public void goMenu(){
        WindowStateMachine.goMenu();
    }
}
