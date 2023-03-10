/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto.interfaces;

import java.awt.Color;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import proyecto.classes.Comanda;
import proyecto.classes.LogicaComandes;

/**
 *
 * @author Icheclin
 */
public class Sala extends javax.swing.JDialog {

    private java.awt.Frame parent;

    /**
     * Creates new form Sala
     *
     * @param parent
     * @param modal
     */
    public Sala(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        Comanda c1 = new Comanda(1, Date.from(Instant.now()));
        c1.addprimer("Macarrones", 1, false);
        c1.addprimer("Espaguetis", 1, false);
        c1.addpostre("Helado", 1, false);
        LogicaComandes.afegirComanda(c1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        t1 = new javax.swing.JButton();
        t2 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        t4 = new javax.swing.JButton();
        t5 = new javax.swing.JButton();
        t6 = new javax.swing.JButton();
        t7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sala");

        jPanel1.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jPanel2.setMaximumSize(new java.awt.Dimension(65534, 32767));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        t1.setBackground(new java.awt.Color(255, 255, 255));
        t1.setForeground(new java.awt.Color(51, 51, 55));
        t1.setText("Taula 1");
        t1.setName("t1"); // NOI18N
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
                MouseClicked(evt);
            }
        });
        jPanel1.add(t1);

        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setForeground(new java.awt.Color(51, 51, 55));
        t2.setText("Taula 2");
        t2.setName("t2"); // NOI18N
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);

        t3.setBackground(new java.awt.Color(255, 255, 255));
        t3.setForeground(new java.awt.Color(51, 51, 55));
        t3.setText("Taula 3");
        t3.setName("t3"); // NOI18N
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);

        t4.setBackground(new java.awt.Color(255, 255, 255));
        t4.setForeground(new java.awt.Color(51, 51, 55));
        t4.setText("Taula 4");
        t4.setToolTipText("");
        t4.setName("t4"); // NOI18N
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4);

        t5.setBackground(new java.awt.Color(255, 255, 255));
        t5.setForeground(new java.awt.Color(51, 51, 55));
        t5.setText("Taula 5");
        t5.setName("t5"); // NOI18N
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);

        t6.setBackground(new java.awt.Color(255, 255, 255));
        t6.setForeground(new java.awt.Color(51, 51, 55));
        t6.setText("Taula 6");
        t6.setName("t6"); // NOI18N
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel1.add(t6);

        t7.setBackground(new java.awt.Color(255, 255, 255));
        t7.setForeground(new java.awt.Color(51, 51, 55));
        t7.setText("Taula 7");
        t7.setName("t7"); // NOI18N
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t7MouseEntered(evt);
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel1.add(t7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        openTable(2);
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        openTable(3);
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        openTable(4);
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        openTable(5);
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        openTable(6);
    }//GEN-LAST:event_t6ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        openTable(7);
    }//GEN-LAST:event_t7ActionPerformed

    private void t7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_t7MouseEntered

    private void MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseEntered
        switch (evt.getComponent().getName()) {
            case "t1":
                if (LogicaComandes.hasComanda(1)) {
                    evt.getComponent().setBackground(Color.red);
                } else {
                    evt.getComponent().setBackground(Color.green);
                }
                break;
            case "t2":
                if (LogicaComandes.hasComanda(2)) {
                    evt.getComponent().setBackground(Color.red);
                } else {
                    evt.getComponent().setBackground(Color.green);
                }
                break;
            case "t3":
                if (LogicaComandes.hasComanda(3)) {
                    evt.getComponent().setBackground(Color.red);
                } else {
                    evt.getComponent().setBackground(Color.green);
                }
                break;
            case "t4":
                if (LogicaComandes.hasComanda(4)) {
                    evt.getComponent().setBackground(Color.red);
                } else {
                    evt.getComponent().setBackground(Color.green);
                }
                break;
            case "t5":
                if (LogicaComandes.hasComanda(5)) {
                    evt.getComponent().setBackground(Color.red);
                } else {
                    evt.getComponent().setBackground(Color.green);
                }
                break;
            case "t6":
                if (LogicaComandes.hasComanda(6)) {
                    evt.getComponent().setBackground(Color.red);
                } else {
                    evt.getComponent().setBackground(Color.green);
                }
                break;
            case "t7":
                if (LogicaComandes.hasComanda(7)) {
                    evt.getComponent().setBackground(Color.red);
                } else {
                    evt.getComponent().setBackground(Color.green);
                }
                break;

            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_MouseEntered

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        openTable(1);
    }//GEN-LAST:event_t1ActionPerformed

    private void MouseClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MouseClicked

    }//GEN-LAST:event_MouseClicked

    private void MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseExited
        evt.getComponent().setBackground(Color.white);
    }//GEN-LAST:event_MouseExited

    private void openTable(Integer table) {
        Taula tauladialeg = new Taula(this.parent, true, table);
        tauladialeg.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sala dialog = new Sala(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton t1;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    private javax.swing.JButton t4;
    private javax.swing.JButton t5;
    private javax.swing.JButton t6;
    private javax.swing.JButton t7;
    // End of variables declaration//GEN-END:variables
}