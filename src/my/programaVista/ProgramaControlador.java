/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.programaVista;

import my.menuVista.MenuVista;
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
}
