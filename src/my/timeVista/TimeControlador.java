/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.timeVista;

import my.termo.WindowStateMachine;
import my.termoModelo.ModeloTermo;

/**
 *
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class TimeControlador {
    private TimeVista miVista;
    private ModeloTermo miModelo;
    
    /**
     * Contructor de TimeControlador
     * @param v
     * @param m 
     */
    public TimeControlador(TimeVista v, ModeloTermo m){
        
        miVista = v;
        miModelo = m;
    }
    
    /**
     * Inicializa los componentes
     */
    public void initTime(){
        miVista.getJSpinnerHoras().setValue(miModelo.getHoras());
        miVista.getJSpinnerMinutos().setValue(miModelo.getMinutos());
        miVista.getJComboBoxDias().setSelectedIndex(miModelo.getDia() - 1);
    }
    
    /**
     * Cierra Vista y abre Menu
     */
    public void goMenu(){
        WindowStateMachine.goMenu();
    }
    
    /**
     * Almacena las horas y los dias cambiados
     */
    public void cambiaHoraDias(){
        miModelo.setHoras((int) miVista.getJSpinnerHoras().getValue());
        miModelo.setMinutos((int) miVista.getJSpinnerMinutos().getValue());
        miModelo.setDia((miVista.getJComboBoxDias().getSelectedIndex())+ 1);
    }
}
