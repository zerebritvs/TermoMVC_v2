/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termoVista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import my.termoModelo.ModeloTermo;

/**
 * Clase VistaUI del patrón de diseño MVC
 * @author Juan Antonio Pagés
 * @author Fernando San José
 */
public class TermoVista extends javax.swing.JFrame {
    
    private ControladorTermo miControl;
    private ModeloTermo miModelo;
    
    /**
     * Constructor de VistaUI
     */
    public TermoVista() {
        
        initComponents();
        miModelo = new ModeloTermo();
        miControl = new ControladorTermo(this, miModelo);
        miControl.initTermo();
        miControl.setDayOfWeek();
        miControl.setLocalHour();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelDias = new javax.swing.JPanel();
        jLabelLunes = new javax.swing.JLabel();
        jLabelMartes = new javax.swing.JLabel();
        jLabelMiercoles = new javax.swing.JLabel();
        jLabelJueves = new javax.swing.JLabel();
        jLabelViernes = new javax.swing.JLabel();
        jLabelSabado = new javax.swing.JLabel();
        jLabelDomingo = new javax.swing.JLabel();
        jPanelMedio = new javax.swing.JPanel();
        jPanelPantalla = new javax.swing.JPanel();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldTemp = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanelSelectProgram = new javax.swing.JPanel();
        jLabelActualProgram = new javax.swing.JLabel();
        jComboBoxPrograms = new javax.swing.JComboBox<>();
        jPanelSelectHoras = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jPanelSelectInit = new javax.swing.JPanel();
        jLabelHoras = new javax.swing.JLabel();
        jSpinnerSelectHora = new javax.swing.JSpinner();
        jButtonIniciar = new javax.swing.JButton();
        jLabelMinima = new javax.swing.JLabel();
        jSpinnerMinima = new javax.swing.JSpinner();
        jLabelMaxima = new javax.swing.JLabel();
        jSpinnerMaxima = new javax.swing.JSpinner();
        jPanelOpciones = new javax.swing.JPanel();
        jLabelIcono = new javax.swing.JLabel();
        jToggleButtonOn = new javax.swing.JToggleButton();
        jToggleButtonManual = new javax.swing.JToggleButton();
        jToggleButtonAuto = new javax.swing.JToggleButton();
        jToggleButtonEdit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 184));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jLabelLunes.setText("Lunes");
        jPanelDias.add(jLabelLunes);

        jLabelMartes.setText("Martes");
        jPanelDias.add(jLabelMartes);

        jLabelMiercoles.setText("Miércoles");
        jPanelDias.add(jLabelMiercoles);

        jLabelJueves.setText("Jueves");
        jPanelDias.add(jLabelJueves);

        jLabelViernes.setText("Viernes");
        jPanelDias.add(jLabelViernes);

        jLabelSabado.setText("Sábado");
        jPanelDias.add(jLabelSabado);

        jLabelDomingo.setText("Domingo");
        jPanelDias.add(jLabelDomingo);

        getContentPane().add(jPanelDias);

        jPanelMedio.setLayout(new java.awt.GridLayout(0, 1));

        jPanelPantalla.setLayout(new java.awt.GridLayout(1, 0));

        jTextFieldHora.setEditable(false);
        jTextFieldHora.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jTextFieldHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHora.setText("Hora");
        jPanelPantalla.add(jTextFieldHora);

        jTextFieldTemp.setEditable(false);
        jTextFieldTemp.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jTextFieldTemp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTemp.setText("19ºC");
        jTextFieldTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTempActionPerformed(evt);
            }
        });
        jPanelPantalla.add(jTextFieldTemp);

        jPanelMedio.add(jPanelPantalla);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanelSelectProgram.setPreferredSize(new java.awt.Dimension(150, 123));

        jLabelActualProgram.setText("Programa actual:");

        jComboBoxPrograms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programa 1", "Programa 2", "Programa 3" }));
        jComboBoxPrograms.setAlignmentY(1.0F);
        jComboBoxPrograms.setBorder(null);
        jComboBoxPrograms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProgramsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSelectProgramLayout = new javax.swing.GroupLayout(jPanelSelectProgram);
        jPanelSelectProgram.setLayout(jPanelSelectProgramLayout);
        jPanelSelectProgramLayout.setHorizontalGroup(
            jPanelSelectProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectProgramLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelSelectProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelActualProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPrograms, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanelSelectProgramLayout.setVerticalGroup(
            jPanelSelectProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectProgramLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelActualProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPrograms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelSelectProgram);

        jPanelSelectHoras.setEnabled(false);
        jPanelSelectHoras.setPreferredSize(new java.awt.Dimension(155, 122));
        jPanelSelectHoras.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jToggleButton1.setText("0-3");
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setPreferredSize(new java.awt.Dimension(70, 25));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanelSelectHoras.add(jToggleButton1);

        jToggleButton2.setText("4-7");
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setPreferredSize(new java.awt.Dimension(70, 25));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanelSelectHoras.add(jToggleButton2);

        jToggleButton3.setText("8-11");
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setPreferredSize(new java.awt.Dimension(70, 25));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanelSelectHoras.add(jToggleButton3);

        jToggleButton4.setText("12-15");
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setPreferredSize(new java.awt.Dimension(70, 25));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanelSelectHoras.add(jToggleButton4);

        jToggleButton5.setText("16-19");
        jToggleButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton5.setPreferredSize(new java.awt.Dimension(70, 25));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanelSelectHoras.add(jToggleButton5);

        jToggleButton6.setText("20-23");
        jToggleButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton6.setPreferredSize(new java.awt.Dimension(70, 25));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanelSelectHoras.add(jToggleButton6);

        jPanel5.add(jPanelSelectHoras);

        jLabelHoras.setText("Horas:");

        jSpinnerSelectHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jLabelMinima.setText("Mínima:");

        jSpinnerMinima.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerMinimaStateChanged(evt);
            }
        });

        jLabelMaxima.setText("Máxima:");

        jSpinnerMaxima.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerMaximaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelSelectInitLayout = new javax.swing.GroupLayout(jPanelSelectInit);
        jPanelSelectInit.setLayout(jPanelSelectInitLayout);
        jPanelSelectInitLayout.setHorizontalGroup(
            jPanelSelectInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectInitLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelSelectInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelectInitLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelHoras)
                        .addGap(5, 5, 5)
                        .addComponent(jSpinnerSelectHora, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonIniciar))
                    .addGroup(jPanelSelectInitLayout.createSequentialGroup()
                        .addComponent(jLabelMinima)
                        .addGap(5, 5, 5)
                        .addComponent(jSpinnerMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMaxima)
                        .addGap(5, 5, 5)
                        .addComponent(jSpinnerMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanelSelectInitLayout.setVerticalGroup(
            jPanelSelectInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectInitLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelSelectInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelectInitLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelHoras))
                    .addComponent(jSpinnerSelectHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSelectInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSelectInitLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanelSelectInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMinima)
                            .addComponent(jLabelMaxima))))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelSelectInit);

        jPanelMedio.add(jPanel5);

        getContentPane().add(jPanelMedio);

        jPanelOpciones.add(jLabelIcono);

        jToggleButtonOn.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jToggleButtonOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/termoVista/BotonEncender.png"))); // NOI18N
        jToggleButtonOn.setText("ON  ");
        jToggleButtonOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOnActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jToggleButtonOn);

        buttonGroup1.add(jToggleButtonManual);
        jToggleButtonManual.setText("Manual");
        jToggleButtonManual.setMaximumSize(new java.awt.Dimension(61, 37));
        jToggleButtonManual.setMinimumSize(new java.awt.Dimension(61, 37));
        jToggleButtonManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonManualActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jToggleButtonManual);

        buttonGroup1.add(jToggleButtonAuto);
        jToggleButtonAuto.setText("Automático");
        jToggleButtonAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAutoActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jToggleButtonAuto);

        buttonGroup1.add(jToggleButtonEdit);
        jToggleButtonEdit.setText("Editar");
        jToggleButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEditActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jToggleButtonEdit);

        getContentPane().add(jPanelOpciones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProgramsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProgramsActionPerformed
        miControl.selectPrograms();
    }//GEN-LAST:event_jComboBoxProgramsActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        miControl.setIniciarManual();
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jToggleButtonManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonManualActionPerformed
        miControl.cambiaModo(1);
    }//GEN-LAST:event_jToggleButtonManualActionPerformed

    private void jToggleButtonAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAutoActionPerformed
        miControl.cambiaModo(0);
    }//GEN-LAST:event_jToggleButtonAutoActionPerformed

    private void jTextFieldTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTempActionPerformed

    private void jToggleButtonOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOnActionPerformed
        miControl.powerButtonSwitch();
    }//GEN-LAST:event_jToggleButtonOnActionPerformed

    private void jToggleButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEditActionPerformed
        miControl.cambiaModo(2);
    }//GEN-LAST:event_jToggleButtonEditActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        miControl.editPrograms(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        miControl.editPrograms(1);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        miControl.editPrograms(2);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        miControl.editPrograms(3);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        miControl.editPrograms(4);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        miControl.editPrograms(5);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jSpinnerMinimaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerMinimaStateChanged
        miControl.editTemperatura(0);
    }//GEN-LAST:event_jSpinnerMinimaStateChanged

    private void jSpinnerMaximaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerMaximaStateChanged
        miControl.editTemperatura(1);
    }//GEN-LAST:event_jSpinnerMaximaStateChanged
    
    /**
     * Obtiene el jPanelDias
     * @return jPanelDias
     */
    public JPanel getPanelDias(){
        return this.jPanelDias;
    }
    
    /**
     * Obtiene el jPanelOpciones
     * @return jPanelOpciones
     */
    public JPanel getPanelOpciones(){
        return this.jPanelOpciones;
    }
    
    /**
     * Obtiene el jPanelMedio
     * @return jPanelMedio
     */
    public JPanel getPanelMedio(){
        return this.jPanelMedio;
    }
    
    /**
     * Obtiene el jToggleButtonAuto
     * @return jToggleButtonAuto
     */
    public JToggleButton getToggleButtonAuto(){
        return this.jToggleButtonAuto;
    }
    
    /**
     * Obtiene el jToggleButtonOn
     * @return jToggleButtonOn
     */
    public JToggleButton getToggleButtonOn(){
        return this.jToggleButtonOn;
    }
    
    /**
     * Obtiene el jToggleButtonOn
     * @return jToggleButtonOn
     */
    public JToggleButton getToggleButtonManual(){
        return this.jToggleButtonManual;
    }
    
    /**
     * Obtiene el jToggleButtonEdit
     * @return jToggleButtonEdit
     */
    public JToggleButton getToggleButtonEdit(){
        return this.jToggleButtonEdit;
    }
    
    /**
     * Obtiene el jLabelMinima
     * @return jLabelMinima
     */
    public JLabel getLabelMinima(){
        return this.jLabelMinima;
    }
    
    /**
     * Obtiene el jLabelMaxima
     * @return jLabelMaxima
     */
    public JLabel getLabelMaxima(){
        return this.jLabelMaxima;
    }
    
    /**
     * Obtiene el jSpinnerMaxima
     * @return jSpinnerMaxima
     */
    public JSpinner getSpinnerMaxima(){
        return this.jSpinnerMaxima;
    }
    
    /**
     * Obtiene el jSpinnerMinima
     * @return jSpinnerMinima
     */
    public JSpinner getSpinnerMinima(){
        return this.jSpinnerMinima;
    }
    
    /**
     * Obtiene el jSpinnerSelectHora
     * @return jSpinnerSelectHora
     */
    public JSpinner getSpinnerSelectHora(){
        return this.jSpinnerSelectHora;
    }
    
    /**
     * Obtiene el jButtonIniciar
     * @return jButtonIniciar
     */
    public JButton getButtonIniciar(){
        return this.jButtonIniciar;
    }
    
    /**
     * Obtiene el jLabelHoras
     * @return jLabelHoras
     */
    public JLabel getLabelHoras(){
        return this.jLabelHoras;
    }
    
    /**
     * Obtiene el jPanelSelectHoras
     * @return jPanelSelectHoras
     */
    public JPanel getPanelSelectHoras(){
        return this.jPanelSelectHoras;
    }
    
    /**
     * Obtiene el jLabelLunes
     * @return jLabelLunes
     */
    public JLabel getLabelLunes(){
        return this.jLabelLunes;
    }
    
    /**
     * Obtiene el jLabelMartes
     * @return jLabelMartes
     */
    public JLabel getLabelMartes(){
        return this.jLabelMartes;
    }
    
    /**
     * Obtiene el jLabelMiercoles
     * @return jLabelMiercoles
     */
    public JLabel getLabelMiercoles(){
        return this.jLabelMiercoles;
    }
    
    /**
     * Obtiene el jLabelJueves
     * @return jLabelJueves
     */
    public JLabel getLabelJueves(){
        return this.jLabelJueves;
    }
    
    /**
     * Obtiene el jLabelViernes
     * @return jLabelViernes
     */
    public JLabel getLabelViernes(){
        return this.jLabelViernes;
    }
    
    /**
     * Obtiene el jLabelSabado
     * @return jLabelSabado
     */
    public JLabel getLabelSabado(){
        return this.jLabelSabado;
    }
    
    /**
     * Obtiene el jLabelDomingo
     * @return jLabelDomingo
     */
    public JLabel getLabelDomingo(){
        return this.jLabelDomingo;
    }
    
    /**
     * Obtiene el jTextFieldHora
     * @return jTextFieldHora
     */
    public JTextField getTextFieldHora(){
        return this.jTextFieldHora;
    }
    
    /**
     * Obtiene el jLabelIcono
     * @return jLabelIcono
     */
    public JLabel getLabelIcono(){
        return this.jLabelIcono;
    }
    
    /**
     * Obtiene el jComboBoxPrograms
     * @return jComboBoxPrograms
     */
    public JComboBox getComboBoxPrograms(){
        return this.jComboBoxPrograms;
    }
    
    /**
     * Obtiene el jTextFieldTemp
     * @return jTextFieldTemp
     */
    public JTextField getTextFieldTemp(){
        return this.jTextFieldTemp;
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JComboBox<String> jComboBoxPrograms;
    private javax.swing.JLabel jLabelActualProgram;
    private javax.swing.JLabel jLabelDomingo;
    private javax.swing.JLabel jLabelHoras;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelJueves;
    private javax.swing.JLabel jLabelLunes;
    private javax.swing.JLabel jLabelMartes;
    private javax.swing.JLabel jLabelMaxima;
    private javax.swing.JLabel jLabelMiercoles;
    private javax.swing.JLabel jLabelMinima;
    private javax.swing.JLabel jLabelSabado;
    private javax.swing.JLabel jLabelViernes;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelDias;
    private javax.swing.JPanel jPanelMedio;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelPantalla;
    private javax.swing.JPanel jPanelSelectHoras;
    private javax.swing.JPanel jPanelSelectInit;
    private javax.swing.JPanel jPanelSelectProgram;
    private javax.swing.JSpinner jSpinnerMaxima;
    private javax.swing.JSpinner jSpinnerMinima;
    private javax.swing.JSpinner jSpinnerSelectHora;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldTemp;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButtonAuto;
    private javax.swing.JToggleButton jToggleButtonEdit;
    private javax.swing.JToggleButton jToggleButtonManual;
    private javax.swing.JToggleButton jToggleButtonOn;
    // End of variables declaration//GEN-END:variables
}