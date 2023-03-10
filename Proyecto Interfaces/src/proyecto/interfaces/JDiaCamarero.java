package proyecto.interfaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.builtin.stringvalidation.ValidacioContra;
import org.netbeans.validation.api.builtin.stringvalidation.ValidacioUsuari;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.openide.util.Exceptions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author admin
 */
public class JDiaCamarero extends javax.swing.JDialog {

    /**
     * Creates new form JDiaCamarero
     *
     * @param parent
     * @param modal
     * @param parent2
     */
    public JDiaCamarero(java.awt.Frame parent, boolean modal, JFraMenuPrincipal parent2) {
        super(parent, modal);
        initComponents();
        jBuIniciarSesion.setEnabled(false);
        ValidationGroup group = valPanel.getValidationGroup();
        group.add(jTeFiUsuario, StringValidators.REQUIRE_NON_EMPTY_STRING, new ValidacioUsuari());
        group.add(jTeFiContra, StringValidators.REQUIRE_NON_EMPTY_STRING, new ValidacioContra());
        valPanel.addChangeListener((ChangeEvent e) -> {
            if (valPanel.getProblem() == null) {
                jBuIniciarSesion.setEnabled(true);
            } else {
                jBuIniciarSesion.setEnabled(false);
            }
        });
        JFraMenuPrincipal = parent2;
    }
    private final JFraMenuPrincipal JFraMenuPrincipal;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTeFiContra = new javax.swing.JTextField();
        jLaUsuario = new javax.swing.JLabel();
        jLaContra = new javax.swing.JLabel();
        jTeFiUsuario = new javax.swing.JTextField();
        jBuIniciarSesion = new javax.swing.JButton();
        jBuRegistrar = new javax.swing.JButton();
        valPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTeFiContra.setName("Contraseña"); // NOI18N

        jLaUsuario.setText("Usuario:");

        jLaContra.setText("Contraseña:");

        jTeFiUsuario.setName("Usuario"); // NOI18N
        jTeFiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeFiUsuarioActionPerformed(evt);
            }
        });

        jBuIniciarSesion.setText("Iniciar sesión");
        jBuIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuIniciarSesionActionPerformed(evt);
            }
        });

        jBuRegistrar.setText("Registrar");
        jBuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLaUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLaContra, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBuRegistrar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBuIniciarSesion)
                    .addComponent(jTeFiUsuario)
                    .addComponent(jTeFiContra))
                .addGap(106, 106, 106))
            .addComponent(valPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(valPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeFiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeFiContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaContra))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuIniciarSesion)
                    .addComponent(jBuRegistrar))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTeFiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeFiUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTeFiUsuarioActionPerformed

    private void jBuIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuIniciarSesionActionPerformed
        // TODO add your handling code here:
        String rutaActual = System.getProperty("user.dir");
        String linea;
        String[] spliteado;
        int resultado = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaActual + "\\src\\Archivos necesarios\\cambrers.csv"));
            while ((linea = br.readLine()) != null) {
                spliteado = linea.split(",");
                if (spliteado[0].equals(jTeFiUsuario.getText()) && spliteado[1].equals(jTeFiContra.getText())) {
                    resultado = 1;
                }
            }
            if (resultado != 0) {
                JOptionPane.showConfirmDialog(this, "Has iniciado sesion!", "Felicidades!", JOptionPane.DEFAULT_OPTION);
                JFraMenuPrincipal.setValidacionCamarero(1);
                JFraMenuPrincipal.validaciones();
                this.setVisible(false);
            } else {
                JOptionPane.showConfirmDialog(this, "Usuario o contraseña incorrecto. Ves a estafar a tu madre.", "Farsante!", JOptionPane.DEFAULT_OPTION);
            }
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jBuIniciarSesionActionPerformed

    private void jBuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuRegistrarActionPerformed
        String rutaActual = System.getProperty("user.dir");

        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(rutaActual + "\\src\\Archivos necesarios\\cambrers.csv", true));
            bw.write(jTeFiUsuario.getText() + "," + jTeFiContra.getText() + "\n");
            bw.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }

    }//GEN-LAST:event_jBuRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(JDiaCamarero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDiaCamarero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDiaCamarero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDiaCamarero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            JDiaCamarero dialog = new JDiaCamarero(new javax.swing.JFrame(), true, new JFraMenuPrincipal());
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
    private javax.swing.JButton jBuIniciarSesion;
    private javax.swing.JButton jBuRegistrar;
    private javax.swing.JLabel jLaContra;
    private javax.swing.JLabel jLaUsuario;
    private javax.swing.JTextField jTeFiContra;
    private javax.swing.JTextField jTeFiUsuario;
    private org.netbeans.validation.api.ui.swing.ValidationPanel valPanel;
    // End of variables declaration//GEN-END:variables
}