package navegantesMaritimos.interfaz;

import javax.swing.*;
import lineales.lista.Lista;
import navegantesMaritimos.NavegantesMaritimos;
import navegantesMaritimos.interfaz.validadores.Validador;

/**
 * Este menu permite realizar la opcion de verificar si existe un camino entre
 * dos puertos que no supere una distancia indicada.
 */
public class MenuVerificarRutasDistancia extends javax.swing.JFrame {

    private final NavegantesMaritimos nav;
    private final JFrame framePadre;

    public MenuVerificarRutasDistancia(NavegantesMaritimos nav, JFrame framePadre) {
        this.nav = nav;
        this.framePadre = framePadre;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVerificarRutaDistancia = new javax.swing.JPanel();
        buttonVerificar = new javax.swing.JButton();
        buttonCerrar = new javax.swing.JButton();
        labelPuertoOrigen = new javax.swing.JLabel();
        labelPuertoDestino = new javax.swing.JLabel();
        labelSelecPuertoDestino = new javax.swing.JLabel();
        labelSelecPuertoOrigen = new javax.swing.JLabel();
        labelDistancia = new javax.swing.JLabel();
        textFieldDistancia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificar camino entre puertos con distancia menor a");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelVerificarRutaDistancia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Verificar camino entre puertos con distancia menor a"));

        buttonVerificar.setText("Verificar");
        buttonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerificarActionPerformed(evt);
            }
        });

        buttonCerrar.setText("Cerrar");
        buttonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarActionPerformed(evt);
            }
        });

        labelPuertoOrigen.setText("1er Puerto");

        labelPuertoDestino.setText("2do Puerto");

        labelSelecPuertoDestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelSelecPuertoDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSelecPuertoDestinoMouseClicked(evt);
            }
        });

        labelSelecPuertoOrigen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelSelecPuertoOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSelecPuertoOrigenMouseClicked(evt);
            }
        });

        labelDistancia.setText("Distancia:");

        javax.swing.GroupLayout panelVerificarRutaDistanciaLayout = new javax.swing.GroupLayout(panelVerificarRutaDistancia);
        panelVerificarRutaDistancia.setLayout(panelVerificarRutaDistanciaLayout);
        panelVerificarRutaDistanciaLayout.setHorizontalGroup(
            panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerificarRutaDistanciaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerificarRutaDistanciaLayout.createSequentialGroup()
                        .addComponent(labelDistancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldDistancia))
                    .addGroup(panelVerificarRutaDistanciaLayout.createSequentialGroup()
                        .addGroup(panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPuertoOrigen)
                            .addComponent(labelSelecPuertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSelecPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPuertoDestino))))
                .addGap(50, 50, 50))
            .addGroup(panelVerificarRutaDistanciaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(buttonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVerificarRutaDistanciaLayout.setVerticalGroup(
            panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerificarRutaDistanciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPuertoDestino)
                    .addComponent(labelPuertoOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSelecPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSelecPuertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDistancia)
                    .addComponent(textFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVerificarRutaDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVerificar)
                    .addComponent(buttonCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerificarRutaDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerificarRutaDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerificarActionPerformed
        if (Validador.noVacio(labelSelecPuertoOrigen)
                && Validador.noVacio(labelSelecPuertoDestino)
                && Validador.enteroRango(textFieldDistancia, 1, Integer.MAX_VALUE)) {
            String puertoOrigen = labelSelecPuertoOrigen.getText();
            String puertoDestino = labelSelecPuertoDestino.getText();
            int distancia = Integer.parseInt(textFieldDistancia.getText());
            boolean correcto = nav.verificarRutaDistancia(puertoOrigen, puertoDestino, distancia);
            if (correcto) {
                JOptionPane.showMessageDialog(this,
                        "Existe un camino entre el puerto " + puertoOrigen
                        + " y el puerto " + puertoDestino
                        + " con una distancia menor a " + distancia + " millas.", "Resultado", 1);
            } else {
                JOptionPane.showMessageDialog(this,
                        "No existe ningun camino entre el puerto " + puertoOrigen
                        + " y el puerto " + puertoDestino
                        + " con una distancia menor a " + distancia + " millas.", "Resultado", 1);
            }
        }
    }//GEN-LAST:event_buttonVerificarActionPerformed

    private void buttonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCerrarActionPerformed

    private void labelSelecPuertoDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelecPuertoDestinoMouseClicked
        this.setEnabled(false);
        this.setVisible(false);
        MenuSelectorPuerto menuAux = new MenuSelectorPuerto(nav, this, labelSelecPuertoDestino);
        menuAux.setVisible(true);
    }//GEN-LAST:event_labelSelecPuertoDestinoMouseClicked

    private void labelSelecPuertoOrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelecPuertoOrigenMouseClicked
        this.setEnabled(false);
        this.setVisible(false);
        MenuSelectorPuerto menuAux = new MenuSelectorPuerto(nav, this, labelSelecPuertoOrigen);
        menuAux.setVisible(true);
    }//GEN-LAST:event_labelSelecPuertoOrigenMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        framePadre.setEnabled(true);
        framePadre.setVisible(true);
        framePadre.toFront();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVerificarRutasDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVerificarRutasDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVerificarRutasDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVerificarRutasDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVerificarRutasDistancia(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JButton buttonVerificar;
    private javax.swing.JLabel labelDistancia;
    private javax.swing.JLabel labelPuertoDestino;
    private javax.swing.JLabel labelPuertoOrigen;
    private javax.swing.JLabel labelSelecPuertoDestino;
    private javax.swing.JLabel labelSelecPuertoOrigen;
    private javax.swing.JPanel panelVerificarRutaDistancia;
    private javax.swing.JTextField textFieldDistancia;
    // End of variables declaration//GEN-END:variables
}
