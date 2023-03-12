package proyecto.interfaces;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openide.util.Exceptions;
import proyecto.classes.VariablesJFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author KAOS
 */
public class JDiaConfigGeneral extends javax.swing.JDialog {

    SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy, HH:mm");

    /**
     * Creates new form JDiaConfigGeneral
     * @param parent
     * @param modal
     */
    public JDiaConfigGeneral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLaNom = new javax.swing.JLabel();
        jTeFiNom = new javax.swing.JTextField();
        jLaTitol = new javax.swing.JLabel();
        jLaIdioma = new javax.swing.JLabel();
        jCoBoxIdioma = new javax.swing.JComboBox<>();
        jLaHoraCierre = new javax.swing.JLabel();
        jSpiHoraCierre = new javax.swing.JSpinner();
        jBuGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLaNom.setText(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jLaNom.text")); // NOI18N

        jTeFiNom.setText(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jTeFiNom.text")); // NOI18N
        jTeFiNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeFiNomActionPerformed(evt);
            }
        });

        jLaTitol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLaTitol.setText(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jLaTitol.text")); // NOI18N

        jLaIdioma.setText(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jLaIdioma.text")); // NOI18N

        jCoBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Castellano", "Catalan", "Ingles", "La antigua lengua de los murlocks" }));

        jLaHoraCierre.setText(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jLaHoraCierre.text")); // NOI18N

        jSpiHoraCierre.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1678569060000L), new java.util.Date(1678569060000L), new java.util.Date(1678741920000L), java.util.Calendar.HOUR_OF_DAY));
        jSpiHoraCierre.setToolTipText(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jSpiHoraCierre.toolTipText")); // NOI18N

        jBuGuardar.setText(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jBuGuardar.text")); // NOI18N
        jBuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLaIdioma)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLaNom)
                                    .addComponent(jLaHoraCierre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTeFiNom)
                                    .addComponent(jCoBoxIdioma, 0, 233, Short.MAX_VALUE)
                                    .addComponent(jSpiHoraCierre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jBuGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLaTitol)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLaTitol)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaNom)
                    .addComponent(jTeFiNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaIdioma)
                    .addComponent(jCoBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpiHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaHoraCierre))
                .addGap(18, 18, 18)
                .addComponent(jBuGuardar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jSpiHoraCierre.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JDiaConfigGeneral.class, "JDiaConfigGeneral.jSpiHoraCierre.AccessibleContext.accessibleDescription")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTeFiNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeFiNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeFiNomActionPerformed

    private final JFraMenuPrincipal JFraMenuPrincipal = new JFraMenuPrincipal();

    private void jBuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuGuardarActionPerformed
        try {
            // TODO add your handling code here:
            String nom = jTeFiNom.getText();
            String idioma = (String) jCoBoxIdioma.getSelectedItem();
            Date horaCierre = formatter2.parse(formatter2.format(jSpiHoraCierre.getValue()));
            VariablesJFrame.setConfigRestaurante(nom, idioma, horaCierre);
            this.setVisible(false);
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jBuGuardarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDiaConfigGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDiaConfigGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDiaConfigGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDiaConfigGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            JDiaConfigGeneral dialog = new JDiaConfigGeneral(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuGuardar;
    private javax.swing.JComboBox<String> jCoBoxIdioma;
    private javax.swing.JLabel jLaHoraCierre;
    private javax.swing.JLabel jLaIdioma;
    private javax.swing.JLabel jLaNom;
    private javax.swing.JLabel jLaTitol;
    private javax.swing.JSpinner jSpiHoraCierre;
    private javax.swing.JTextField jTeFiNom;
    // End of variables declaration//GEN-END:variables
}
