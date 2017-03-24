package navegantesMaritimos.interfaz;

import javax.swing.*;
import navegantesMaritimos.NavegantesMaritimos;
import navegantesMaritimos.interfaz.otros.*;

/**
 * Este muestra los datos de un barco.
 */
public class MenuBarco extends javax.swing.JFrame {

    private final NavegantesMaritimos nav;
    private final JFrame framePadre;
    private final String[] datosBarco;

    public MenuBarco(NavegantesMaritimos nav, JFrame framePadre, String nombreBarco) {
        this.nav = nav;
        this.framePadre = framePadre;
        datosBarco = nav.arregloDatosBarco(nombreBarco);
        initComponents();
        inicializarLabels();
        this.setLocationRelativeTo(null);
    }
    
    public void inicializarLabels() {
        labelCampoNombre.setText(datosBarco[0]);
        labelCampoTipo.setText(datosBarco[1]);
        labelBandera.setIcon(new ImageIcon(getClass().getResource("../recursos/banderas/" + Paises.conseguirAlias(datosBarco[2]) + ".png")));
        labelBandera.setToolTipText(datosBarco[2]);
        switch (datosBarco[1]) {
                case "Pesquero":
                    labelImagenBarco.setIcon(new ImageIcon(getClass().getResource("../recursos/barcos/pesqueroPerfil.png")));
                    break;
                case "Pasajeros":
                    labelImagenBarco.setIcon(new ImageIcon(getClass().getResource("../recursos/barcos/pasajerosPerfil.png")));
                    break;
                case "Carga":
                    labelImagenBarco.setIcon(new ImageIcon(getClass().getResource("../recursos/barcos/cargaPerfil.png")));
                    break;
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImagenBarco = new javax.swing.JLabel();
        panelDatosBarco = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelBandera = new javax.swing.JLabel();
        labelCampoNombre = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelCampoTipo = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barco");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelImagenBarco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelImagenBarco.setPreferredSize(new java.awt.Dimension(100, 100));

        panelDatosBarco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Barco"));

        labelNombre.setText("Nombre:");

        labelBandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navegantesMaritimos/recursos/banderas/null.png"))); // NOI18N
        labelBandera.setToolTipText("");

        labelTipo.setText("Tipo:");

        labelPais.setText("Pais:");

        javax.swing.GroupLayout panelDatosBarcoLayout = new javax.swing.GroupLayout(panelDatosBarco);
        panelDatosBarco.setLayout(panelDatosBarcoLayout);
        panelDatosBarcoLayout.setHorizontalGroup(
            panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBarcoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosBarcoLayout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCampoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosBarcoLayout.createSequentialGroup()
                        .addGroup(panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipo)
                            .addComponent(labelPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosBarcoLayout.createSequentialGroup()
                                .addComponent(labelBandera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 186, Short.MAX_VALUE))
                            .addComponent(labelCampoTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelDatosBarcoLayout.setVerticalGroup(
            panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBarcoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre)
                    .addComponent(labelCampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCampoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPais, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBandera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagenBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatosBarco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDatosBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImagenBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBarco(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBandera;
    private javax.swing.JLabel labelCampoNombre;
    private javax.swing.JLabel labelCampoTipo;
    private javax.swing.JLabel labelImagenBarco;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JPanel panelDatosBarco;
    // End of variables declaration//GEN-END:variables
}