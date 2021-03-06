package navegantesMaritimos.interfaz;

import javax.swing.*;
import lineales.lista.Lista;
import navegantesMaritimos.NavegantesMaritimos;
import navegantesMaritimos.interfaz.validadores.Validador;

/**
 * Este menu permite realizar la opcion de obtener la distancia del camino mas
 * corto entre dos puertos.
 */
public class MenuDistanciaMasCorta extends javax.swing.JFrame {

    private final NavegantesMaritimos nav;
    private final JFrame framePadre;

    public MenuDistanciaMasCorta(NavegantesMaritimos nav, JFrame framePadre) {
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

        panelDistanciaMasCorta = new javax.swing.JPanel();
        buttonCalcular = new javax.swing.JButton();
        buttonCerrar = new javax.swing.JButton();
        labelPuertoOrigen = new javax.swing.JLabel();
        labelPuertoDestino = new javax.swing.JLabel();
        labelSelecPuertoDestino = new javax.swing.JLabel();
        labelSelecPuertoOrigen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Distancia minima para llegar desde un puerto a otro");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelDistanciaMasCorta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Distancia minima para llegar desde un puerto a otro"));

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
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

        javax.swing.GroupLayout panelDistanciaMasCortaLayout = new javax.swing.GroupLayout(panelDistanciaMasCorta);
        panelDistanciaMasCorta.setLayout(panelDistanciaMasCortaLayout);
        panelDistanciaMasCortaLayout.setHorizontalGroup(
            panelDistanciaMasCortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistanciaMasCortaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelDistanciaMasCortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPuertoOrigen)
                    .addComponent(labelSelecPuertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(panelDistanciaMasCortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSelecPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPuertoDestino))
                .addGap(50, 50, 50))
            .addGroup(panelDistanciaMasCortaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDistanciaMasCortaLayout.setVerticalGroup(
            panelDistanciaMasCortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDistanciaMasCortaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDistanciaMasCortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPuertoDestino)
                    .addComponent(labelPuertoOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDistanciaMasCortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSelecPuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSelecPuertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDistanciaMasCortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCalcular)
                    .addComponent(buttonCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDistanciaMasCorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDistanciaMasCorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        if (Validador.noVacio(labelSelecPuertoOrigen)
                && Validador.noVacio(labelSelecPuertoDestino)) {
            String puertoOrigen = labelSelecPuertoOrigen.getText();
            String puertoDestino = labelSelecPuertoDestino.getText();
            double res = nav.distanciaMasCorta(puertoOrigen, puertoDestino);
            if (res > 0) {
                JOptionPane.showMessageDialog(this,
                        "La distancia minima para llegar "
                        + "del puerto " + puertoOrigen
                        + " a el puerto " + puertoDestino
                        + " es: \n" + res + " millas.", "Resultado", 1);
            } else {
                JOptionPane.showMessageDialog(this,
                        "No se ha obtenido un valor, es posible que no exista un"
                        + " camino de rutas maritimas entre los puertos. "
                        + "Intentelo nuevamente.", "Error", 0);
            }
        }
    }//GEN-LAST:event_buttonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDistanciaMasCorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDistanciaMasCorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDistanciaMasCorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDistanciaMasCorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDistanciaMasCorta(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JLabel labelPuertoDestino;
    private javax.swing.JLabel labelPuertoOrigen;
    private javax.swing.JLabel labelSelecPuertoDestino;
    private javax.swing.JLabel labelSelecPuertoOrigen;
    private javax.swing.JPanel panelDistanciaMasCorta;
    // End of variables declaration//GEN-END:variables
}
