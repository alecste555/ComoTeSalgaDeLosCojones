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
    ArrayList<String[]> primers = new ArrayList<>();
    ArrayList<String[]> segons = new ArrayList<>();

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
        
        Comanda comandaObjeto = null;
        for (Comanda comanda : LogicaComandes.getLlistaComandes()) {
            for (ArrayList<String[]> a : comanda.exportDataArrayCocina().values()) {
                for (String[] s : a) {
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
                            Date HoraActual = Date.from(Instant.now());
                            Date PlatoSalida = new Date(comandaObjeto.getDatacomanda().getTime() + (2 * 60 * 1000));
                            if (PlatoSalida.before(HoraActual)) {
                                comandaObjeto.setPrimerHecho(s[2]);
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

                    }
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePrimers;
    private javax.swing.JTable jTableSegons;
    // End of variables declaration//GEN-END:variables
}
