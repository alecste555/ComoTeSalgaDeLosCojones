package proyecto.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;
import proyecto.classes.LogicaMenu;
import proyecto.classes.Plat;
import proyecto.classes.VariablesJFrame;
import proyecto.classes.tipo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author admin
 */
public class JFraMenuPrincipal extends javax.swing.JFrame {

    public final ArrayList<Plat> menu;

    String txtFile = System.getProperty("user.dir") + "/src/Archivos necesarios/llicenciesValides.csv";

    /**
     * Creates new form JFraMenuPrincipal
     *
     */
    public JFraMenuPrincipal() {
        this.menu = LogicaMenu.getMenu();
        VariablesJFrame.nomRestaurant = "Restaurante";
        VariablesJFrame.idiomaRestaurant = "Castellano";
        try {
            if (VariablesJFrame.hecho == 0) {
                VariablesJFrame.horaCierreRestaurant = VariablesJFrame.formatter.parse("12/12/2023, 12:00");
                VariablesJFrame.hecho = 1;
            }

        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
        initComponents();
        jLabelLicencia1.setVisible(false);
        jLabelCamarero1.setVisible(false);
        jLabelInsertar1.setVisible(false);
        jLabelMenu1.setVisible(false);
    }

    public void setValidacionCamarero(int validacion) {
        VariablesJFrame.validacionCamarero = validacion;
        jLabelCamarero.setVisible(false);
        jLabelCamarero1.setText("Camarero: " + VariablesJFrame.camarero);
        jLabelCamarero1.setVisible(true);

    }

    public void setCamareroName(String camarero) {
        jLabelCamarero1.setText("Camarero: " + camarero);
    }

    public void validaciones() {
        if (VariablesJFrame.validacionLicencia > 0 && VariablesJFrame.validacionMenu > 0 && VariablesJFrame.validacionCamarero > 0) {
            jBuCargarRestaurante.setEnabled(true);
            jLabelInsertar.setVisible(false);

        } else {
            //jBuCargarRestaurante.setEnabled(false);
            jLabelInsertar1.setVisible(false);
            jLabelInsertar.setVisible(true);

        }
        if (VariablesJFrame.validacionLicencia > 0 || VariablesJFrame.validacionMenu > 0 || VariablesJFrame.validacionCamarero > 0) {
            jLabelInsertar1.setVisible(false);
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jBuCargarRestaurante = new javax.swing.JButton();
        jLabelInsertar = new javax.swing.JLabel();
        jLabelLicencia = new javax.swing.JLabel();
        jLabelCamarero = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelInsertar1 = new javax.swing.JLabel();
        jLabelLicencia1 = new javax.swing.JLabel();
        jLabelCamarero1 = new javax.swing.JLabel();
        jLabelMenu1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMeCargar = new javax.swing.JMenu();
        jMenuCargarLicencia = new javax.swing.JMenuItem();
        jMeDatosCamarero = new javax.swing.JMenuItem();
        jMeMenuDia = new javax.swing.JMenuItem();
        jMeConfigGeneral = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBuCargarRestaurante.setText("Cargar restaurante");
        jBuCargarRestaurante.setEnabled(false);
        jBuCargarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuCargarRestauranteActionPerformed(evt);
            }
        });

        jLabelInsertar.setText("Por favor, inserta:");

        jLabelLicencia.setText("- Licencia valida");

        jLabelCamarero.setText("- Datos del camarero");

        jLabelMenu.setText("- Menu del dia");

        jLabelInsertar1.setText("Validados:");

        jLabelLicencia1.setText("- Licencia valida");

        jLabelCamarero1.setText("- Datos del camarero");

        jLabelMenu1.setText("- Menu del dia");

        jMeCargar.setText("Cargar");
        jMeCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeCargarActionPerformed(evt);
            }
        });

        jMenuCargarLicencia.setText("Cargar archivos licencia");
        jMenuCargarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCargarLicenciaActionPerformed(evt);
            }
        });
        jMeCargar.add(jMenuCargarLicencia);

        jMeDatosCamarero.setText("Cargar / añadir datos del camarero");
        jMeDatosCamarero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeDatosCamareroActionPerformed(evt);
            }
        });
        jMeCargar.add(jMeDatosCamarero);

        jMeMenuDia.setText("Cargar menu del dia");
        jMeMenuDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeMenuDiaActionPerformed(evt);
            }
        });
        jMeCargar.add(jMeMenuDia);

        jMeConfigGeneral.setText("Config. general del programa ");
        jMeConfigGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeConfigGeneralActionPerformed(evt);
            }
        });
        jMeCargar.add(jMeConfigGeneral);

        jMenuBar1.add(jMeCargar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jBuCargarRestaurante)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLicencia)
                            .addComponent(jLabelInsertar)
                            .addComponent(jLabelCamarero)
                            .addComponent(jLabelMenu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLicencia1)
                            .addComponent(jLabelInsertar1)
                            .addComponent(jLabelCamarero1)
                            .addComponent(jLabelMenu1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLicencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCamarero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelInsertar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLicencia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCamarero1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMenu1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuCargarRestaurante)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCargarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCargarLicenciaActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        int returnVal = chooser.showOpenDialog(null);
        File file = null;
        String[] partes = null;

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
        }
        if (file != null) {
            try ( BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
                String linia = bufr.readLine();
                partes = linia.split(",");
                bufr.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            try ( BufferedReader bufr2 = new BufferedReader(new FileReader(txtFile))) {
                String linia;
                boolean resultado = false;
                SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
                Date datenow = date.parse(dtf.format(LocalDateTime.now()));

                while ((linia = bufr2.readLine()) != null && !resultado) {
                    Date fechaCSV = date.parse(partes[1]);
                    if (partes[0].equals(linia) && datenow.before(fechaCSV)) {
                        resultado = true;
                    }
                }
                bufr2.close();
                if (resultado) {
                    JOptionPane.showMessageDialog(this, "Licencia validada", "Validacion licencia", JOptionPane.INFORMATION_MESSAGE);
                    VariablesJFrame.validacionLicencia = 1;
                    validaciones();
                    jLabelLicencia.setVisible(false);
                    jLabelLicencia1.setText("Licencia: " + file.getName());
                    jLabelLicencia1.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Licencia invalida", "Validacion licencia", JOptionPane.ERROR_MESSAGE);
                    VariablesJFrame.validacionLicencia = 0;
                    validaciones();
                    jLabelLicencia.setVisible(true);
                    jLabelLicencia1.setVisible(false);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, "Licencia invalida", "Validacion licencia", JOptionPane.ERROR_MESSAGE);
                VariablesJFrame.validacionLicencia = 0;
                validaciones();
                jLabelLicencia.setVisible(true);
                jLabelLicencia1.setVisible(false);
            }
        }

    }//GEN-LAST:event_jMenuCargarLicenciaActionPerformed

    private void jMeDatosCamareroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeDatosCamareroActionPerformed
        // TODO add your handling code here:
        JDiaCamarero visible = new JDiaCamarero(this, true, this);
        visible.setVisible(true);
    }//GEN-LAST:event_jMeDatosCamareroActionPerformed

    private void jMeCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMeCargarActionPerformed

    private void jMeMenuDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeMenuDiaActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        int returnVal = chooser.showOpenDialog(null);
        File file = null;
        String[] partes;
        String linea;

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
        }
        if (file != null) {
            try ( BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
                Plat p;
                while ((linea = br.readLine()) != null) {
                    partes = linea.split(",", 6);
                    if (partes[2].contains("primer")) {
                        p = new Plat(partes[0], Double.valueOf(partes[1]), tipo.primer);
                        if (partes[3].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[3].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[3].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[3].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[3].contains("gluten")) {
                            p.setGluten(true);
                        }

                        if (partes[4].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[4].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[4].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[4].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[4].contains("gluten")) {
                            p.setGluten(true);
                        }

                        if (partes[5].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[5].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[5].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[5].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[5].contains("gluten")) {
                            p.setGluten(true);
                        }

                        menu.add(p);
                        VariablesJFrame.validacionMenu = 1;
                        validaciones();
                        jLabelMenu.setVisible(false);
                        jLabelMenu1.setText("Menu: " + file.getName());
                        jLabelMenu1.setVisible(true);
                    } else if (partes[2].contains("segon")) {
                        p = new Plat(partes[0], Double.valueOf(partes[1]), tipo.segon);
                        if (partes[3].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[3].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[3].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[3].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[3].contains("gluten")) {
                            p.setGluten(true);
                        }

                        if (partes[4].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[4].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[4].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[4].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[4].contains("gluten")) {
                            p.setGluten(true);
                        }

                        if (partes[5].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[5].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[5].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[5].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[5].contains("gluten")) {
                            p.setGluten(true);
                        }

                        menu.add(p);
                        VariablesJFrame.validacionMenu = 1;
                        validaciones();
                        jLabelMenu.setVisible(false);
                        jLabelMenu1.setText("Menu: " + file.getName());
                        jLabelMenu1.setVisible(true);
                    } else if (partes[2].contains("postre")) {
                        p = new Plat(partes[0], Double.valueOf(partes[1]), tipo.postre);
                        if (partes[3].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[3].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[3].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[3].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[3].contains("gluten")) {
                            p.setGluten(true);
                        }

                        if (partes[4].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[4].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[4].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[4].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[4].contains("gluten")) {
                            p.setGluten(true);
                        }

                        if (partes[5].contains("lactics")) {
                            p.setLàctics(true);
                        } else if (partes[5].contains("carn")) {
                            p.setCarn(true);
                        } else if (partes[5].contains("ou")) {
                            p.setOu(true);
                        } else if (partes[5].contains("peix")) {
                            p.setPeix(true);
                        } else if (partes[5].contains("gluten")) {
                            p.setGluten(true);
                        }

                        menu.add(p);
                        VariablesJFrame.validacionMenu = 1;
                        validaciones();
                        jLabelMenu.setVisible(false);
                        jLabelMenu1.setText("Menu: " + file.getName());
                        jLabelMenu1.setVisible(true);
                    }

                }
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                VariablesJFrame.validacionMenu = 0;
                validaciones();
                menu.clear();
                jLabelMenu.setVisible(true);
                jLabelMenu1.setVisible(false);
            }
        } else {
            VariablesJFrame.validacionMenu = 0;
            validaciones();
            menu.clear();
            jLabelMenu.setVisible(true);
            jLabelMenu1.setVisible(false);
        }
    }//GEN-LAST:event_jMeMenuDiaActionPerformed

    private void jMeConfigGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeConfigGeneralActionPerformed
        // TODO add your handling code here:
        JDiaConfigGeneral visible = new JDiaConfigGeneral(this, true);
        visible.setVisible(true);
    }//GEN-LAST:event_jMeConfigGeneralActionPerformed

    private void jBuCargarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuCargarRestauranteActionPerformed
        // TODO add your handling code here:
        Sala sala = new Sala(this, false);
        JDiaCocina cocina = new JDiaCocina(this, false);
        this.setVisible(false);
        cocina.setVisible(true);
        sala.setVisible(true);

    }//GEN-LAST:event_jBuCargarRestauranteActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFraMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFraMenuPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuCargarRestaurante;
    private javax.swing.JLabel jLabelCamarero;
    private javax.swing.JLabel jLabelCamarero1;
    private javax.swing.JLabel jLabelInsertar;
    private javax.swing.JLabel jLabelInsertar1;
    private javax.swing.JLabel jLabelLicencia;
    private javax.swing.JLabel jLabelLicencia1;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMenu1;
    private javax.swing.JMenu jMeCargar;
    private javax.swing.JMenuItem jMeConfigGeneral;
    private javax.swing.JMenuItem jMeDatosCamarero;
    private javax.swing.JMenuItem jMeMenuDia;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCargarLicencia;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
