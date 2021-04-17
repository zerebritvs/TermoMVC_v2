/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.programaVista;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import my.termo.WindowStateMachine;
import my.termoModelo.ModeloTermo;
import my.termoModelo.Programa;

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
        
        for(int i = 0; i < miModelo.getPrograma().size(); i++){
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
            if(i == index){
               miModelo.getPrograma().get(index).setNombre(nuevoNombre);
            }
        }
        miVista.getJComboBoxProgramas().updateUI();
    }
    /**
     * Habilita la zona para añadir nuevo programa
     */
    public void nuevoPrograma(){
        setPanelEnabled(miVista.getJPanelMedio(), true);
        setPanelEnabled(miVista.getJPanelDerecha(), true);
        miVista.getJButtonGuarda().setText("Guardar Programa");
    }
    
    /**
     * Guarda nuevo programa 
     */
    public void guardaPrograma(){
        
        Programa nuevoPrograma = new Programa();
        
        miModelo.getPrograma().add(nuevoPrograma);
        
        nuevoPrograma.setNombre(miVista.getJTextFieldNombreAdd().getText());
        
        nuevoPrograma.getProgramTemps().set(0, (Integer)miVista.getJSpinnerMin().getValue());
        nuevoPrograma.getProgramTemps().set(1, (Integer)miVista.getJSpinnerMax().getValue());
        
        Component[]comps = miVista.getJPanelDerecha().getComponents();
        JToggleButton []botones = new JToggleButton [6];
        
        for(int i = 0; i < comps.length; i++){
            botones[i] = (JToggleButton)comps[i];
        }
        
        for(int j = 0; j < botones.length; j++){
            
            if(botones[j].isSelected()){
                nuevoPrograma.getProgramButtons().set(j, true);
                
            }else{
                nuevoPrograma.getProgramButtons().set(j, false);
            }
        }
        
        
        miVista.getJComboBoxProgramas().addItem(nuevoPrograma);
        
        miVista.getJComboBoxProgramas().updateUI();
        
        miVista.getJButtonGuarda().setText("Guardado");
        
        miVista.getJTextFieldNombreAdd().setText("Programa");
        miVista.getJSpinnerMax().setValue(19);
        miVista.getJSpinnerMin().setValue(5);
        
        miVista.getJToggleButton1().setSelected(false);
        miVista.getJToggleButton2().setSelected(false);
        miVista.getJToggleButton3().setSelected(false);
        miVista.getJToggleButton4().setSelected(false);
        miVista.getJToggleButton5().setSelected(false);
        miVista.getJToggleButton6().setSelected(false);
        
        setPanelEnabled(miVista.getJPanelMedio(), false);
        setPanelEnabled(miVista.getJPanelDerecha(), false);
        
        
    
    }
    
    /**
     * Cierra Programa y abre Menu
     */
    public void goMenu(){
        WindowStateMachine.goMenu();
    }
}
