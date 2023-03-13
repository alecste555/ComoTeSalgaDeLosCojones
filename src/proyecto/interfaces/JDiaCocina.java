/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto.interfaces;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;
import proyecto.classes.CocinaTableModel;
import proyecto.classes.Comanda;
import proyecto.classes.LogicaComandes;
import static proyecto.classes.LogicaMenu.getMenu;
import proyecto.classes.Plat;
import proyecto.classes.tipo;

/**
 *
 * @author KAOS
 */
public class JDiaCocina extends javax.swing.JDialog {

    int i = 0;
    String añadir = "";
    ArrayList<String> platos = new ArrayList<>();
    ArrayList<String> menu = new ArrayList<>();
    String[] menuArray;
    ArrayList<Object[]> primers = new ArrayList<>();
    ArrayList<Object[]> segons = new ArrayList<>();

    /**
     * Creates new form JDiaCocina
     *
     * @param parent
     * @param modal
     */
    public JDiaCocina(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        update();
    }

    private void update() {
        Timer timer = new Timer();
        timer.schedule(new MiTarea(this), 0, 10000);
    }

    static class MiTarea extends TimerTask {

        private JDiaCocina cocina;

        @Override
        public void run() {
            cocina.updateTabla();
        }

        public MiTarea(JDiaCocina cocina) {
            this.cocina = cocina;
        }

    }

    private void updateTabla() {

        for (Plat plato : getMenu()) {
            for (String a : plato.exportDataArray()) {
                añadir = añadir + "," + a;
                if ("0".equals(a)) {
                    platos.add(añadir);

                    añadir = "";
                    menu.add(platos.toString());
                    platos.clear();
                }

            }
        }

        DefaultTableModel comandatable = new DefaultTableModel();
        for (Comanda comanda : LogicaComandes.getLlistaComandes()) {
            for (ArrayList<String[]> a : comanda.exportDataArrayCocina().values()) {
                for (String[] s : a) {
                    comandatable.addRow(s);
                }
            }
        }
        primers.clear();
        segons.clear();
        i = 0;
        for (Comanda comanda : LogicaComandes.getLlistaComandes()) {
            for (ArrayList<String[]> a : comanda.exportDataArrayCocina().values()) {
                for (String[] s : a) {
                    if (!comanda.isPagada() && !s[7].equals("true")) {
                        if (comanda.gettipoplat(s[2]).equals(tipo.primer.name())) {
                            Object[] o = new Object[7];
                            for (int j = 0; j < 7; j++) {
                                if (j != 6) {
                                    o[j] = s[j];
                                } else {
                                    if (jTablePrimers.getRowCount() > i) {
                                        o[j] = jTablePrimers.getValueAt(i, 6) == null ? false : jTablePrimers.getValueAt(i, 6);
                                    } else {
                                        o[j] = false;
                                    }
                                }
                            }
                            Date HoraActual = Date.from(Instant.now());
                            Date PlatoSalida = new Date(comanda.getDatacomanda().getTime() + (15 * 60 * 1000));
                            if (PlatoSalida.before(HoraActual)) {
                                comanda.setPrimerHecho(s[2]);
                            }
                            primers.add(o);

                        } else if (comanda.gettipoplat(s[2]).equals(tipo.segon.name())) {
                            Object[] o = new Object[7];
                            for (int j = 0; j < 7; j++) {
                                if (j != 6) {
                                    o[j] = s[j];
                                } else {
                                    if (jTableSegons.getRowCount() > i) {
                                        o[j] = jTableSegons.getValueAt(i, 6) == null ? false : jTableSegons.getValueAt(i, 6);
                                    } else {
                                        o[j] = false;
                                    }
                                }
                            }
                            Date HoraActual = Date.from(Instant.now());
                            Date PlatoSalida = new Date(comanda.getDatacomanda().getTime() + (30 * 60 * 1000));
                            if (PlatoSalida.before(HoraActual)) {
                                comanda.setSegonHecho(s[2]);
                            }
                            segons.add(o);
                        }
                    }
                    i++;
                    /*
                    for (int i = 0; i < menu.size(); i++) {
                        String dentroPlato = menu.get(i);
                        String[] splitPlatos = dentroPlato.split(",");
                        if (splitPlatos[2].equals(s[2]) && splitPlatos[1].equals("primer")) {
                            primers.clear();
                            primers.add(s);
                            for (Comanda obj_it : LogicaComandes.getLlistaComandes()) {
                                if (obj_it.getId() == Integer.parseInt(s[0])) {
                                    comandaObjeto = obj_it;
                                }
                            }
                            
                        }
                        if (splitPlatos[2].equals(s[2]) && splitPlatos[1].equals("segon")) {
                            segons.clear();
                            segons.add(s);
                            for (Comanda obj_it : LogicaComandes.getLlistaComandes()) {
                                if (obj_it.getId() == Integer.parseInt(s[0])) {
                                    comandaObjeto = obj_it;
                                }
                            }
                            Date HoraActual = Date.from(Instant.now());
                            Date PlatoSalida = new Date(comandaObjeto.getDatacomanda().getTime() + (1 * 60 * 1000));
                            if (PlatoSalida.before(HoraActual)) {
                                comandaObjeto.setSegonHecho(s[2]);
                            }
                        }

                    }*/
 /*
                    posPostre++;
                    posSegon++;
                    if (posPostre % 3 != 0) {
                        if (posSegon % 2 == 0) {

                            segons.add(s);
                            for (Comanda obj_it : LogicaComandes.getLlistaComandes()) {
                                if (obj_it.getId() == Integer.parseInt(s[0])) {
                                    comandaObjeto = obj_it;
                                }
                            }
                            Date HoraActual = Date.from(Instant.now());
                            Date PlatoSalida = new Date(comandaObjeto.getDatacomanda().getTime() + (1 * 60 * 1000));
                            if (PlatoSalida.before(HoraActual)) {
                                comandaObjeto.setSegonHecho(s[2]);
                            }

                        } else {
                            primers.add(s);
                            for (Comanda obj_it : LogicaComandes.getLlistaComandes()) {
                                if (obj_it.getId() == Integer.parseInt(s[0])) {
                                    comandaObjeto = obj_it;
                                }
                            }
                            Date HoraActual = Date.from(Instant.now());
                            Date PlatoSalida = new Date(comandaObjeto.getDatacomanda().getTime() + (2 * 60 * 1000));
                            if (PlatoSalida.before(HoraActual)) {
                                comandaObjeto.setPrimerHecho(s[2]);
                            }
                        }
                    }
                     */
                }
            }
        }

        jTablePrimers.setModel(
                new CocinaTableModel(primers));
        jTableSegons.setModel(
                new CocinaTableModel(segons));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSegons = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePrimers = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableSegons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableSegons);

        jTablePrimers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablePrimers);

        jButton1.setText(org.openide.util.NbBundle.getMessage(JDiaCocina.class, "JDiaCocina.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < jTablePrimers.getRowCount(); i++) {
            if ((boolean) jTablePrimers.getValueAt(i, 6)) {
                for (Comanda comanda : LogicaComandes.getLlistaComandes()) {
                    if (comanda.getId() == Integer.parseInt((String) jTablePrimers.getValueAt(i, 0))) {
                        comanda.setPrimerSalido((String) jTablePrimers.getValueAt(i, 2));
                    }
                }
            }
        }
        for (int i = 0; i < jTableSegons.getRowCount(); i++) {
            if ((boolean) jTableSegons.getValueAt(i, 6)) {
                for (Comanda comanda : LogicaComandes.getLlistaComandes()) {
                    if (comanda.getId() == Integer.parseInt((String) jTableSegons.getValueAt(i, 0))) {
                        comanda.setSegonSalido((String) jTableSegons.getValueAt(i, 2));
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDiaCocina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDiaCocina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDiaCocina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDiaCocina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            JDiaCocina dialog = new JDiaCocina(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePrimers;
    private javax.swing.JTable jTableSegons;
    // End of variables declaration//GEN-END:variables
}
