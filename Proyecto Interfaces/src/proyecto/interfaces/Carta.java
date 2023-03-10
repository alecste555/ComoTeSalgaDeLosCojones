/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto.interfaces;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import proyecto.classes.Comanda;
import proyecto.classes.LogicaComandes;
import proyecto.classes.LogicaMenu;
import proyecto.classes.MenuTableModel;
import proyecto.classes.Plat;
import proyecto.classes.tipo;

/**
 *
 * @author Icheclin
 */
public class Carta extends javax.swing.JDialog {

    private final int mesa;
    private final Taula taula;
    /**
     * Creates new form Carta
     * @param parent
     * @param modal
     * @param mesa
     */
    public Carta(java.awt.Frame parent, boolean modal, int mesa,Taula t) {
        super(parent, modal);
        this.taula=t;
        this.mesa = mesa;
        this.setTitle("Carta"+mesa);
        initComponents();
        updateTable();
    }

    private void updateTable() {
        ArrayList<String[]> menulineas = new ArrayList<>();
        for (Plat obj_it : LogicaMenu.getMenu()) {
            if(!((carnButton.isSelected() && obj_it.isCarn())||(peixButton.isSelected() && obj_it.isPeix())||(glutenButton.isSelected() && obj_it.isGluten())||(lacticButton.isSelected() && obj_it.isLàctics())||(ouButton.isSelected() && obj_it.isOu()))){
            menulineas.add(obj_it.exportDataArray());}
        }
        jTable1.setModel(new MenuTableModel(menulineas));
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
        jTable1 = new javax.swing.JTable();
        addComanda = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        carnButton = new javax.swing.JToggleButton();
        peixButton = new javax.swing.JToggleButton();
        glutenButton = new javax.swing.JToggleButton();
        lacticButton = new javax.swing.JToggleButton();
        ouButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        addComanda.setText(org.openide.util.NbBundle.getMessage(Carta.class, "Carta.addComanda.text")); // NOI18N
        addComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addComandaActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        carnButton.setText(org.openide.util.NbBundle.getMessage(Carta.class, "Carta.carnButton.text")); // NOI18N
        carnButton.setFocusable(false);
        carnButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        carnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTable(evt);
            }
        });
        jToolBar1.add(carnButton);

        peixButton.setText(org.openide.util.NbBundle.getMessage(Carta.class, "Carta.peixButton.text")); // NOI18N
        peixButton.setFocusable(false);
        peixButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        peixButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        peixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTable(evt);
            }
        });
        jToolBar1.add(peixButton);

        glutenButton.setText(org.openide.util.NbBundle.getMessage(Carta.class, "Carta.glutenButton.text")); // NOI18N
        glutenButton.setToolTipText(org.openide.util.NbBundle.getMessage(Carta.class, "Carta.glutenButton.toolTipText")); // NOI18N
        glutenButton.setFocusable(false);
        glutenButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        glutenButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        glutenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTable(evt);
            }
        });
        jToolBar1.add(glutenButton);

        lacticButton.setText(org.openide.util.NbBundle.getMessage(Carta.class, "Carta.lacticButton.text")); // NOI18N
        lacticButton.setFocusable(false);
        lacticButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lacticButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lacticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTable(evt);
            }
        });
        jToolBar1.add(lacticButton);

        ouButton.setText(org.openide.util.NbBundle.getMessage(Carta.class, "Carta.ouButton.text")); // NOI18N
        ouButton.setFocusable(false);
        ouButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ouButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ouButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTable(evt);
            }
        });
        jToolBar1.add(ouButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addComanda)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addComandaActionPerformed
        Comanda c = new Comanda(mesa, Date.from(Instant.now()));
        boolean newcomanda = false;
        for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {
            if (Integer.parseInt((String) jTable1.getModel().getValueAt(i, 8)) > 0) {
                newcomanda = true;
                try {
                    switch (tipo.valueOf((String) jTable1.getModel().getValueAt(i, 0))) {
                    case primer -> c.addprimer((String) jTable1.getModel().getValueAt(i, 1), Integer.valueOf((String) jTable1.getModel().getValueAt(i, 8)));
                    case segon -> c.addsegon((String) jTable1.getModel().getValueAt(i, 1), Integer.valueOf((String) jTable1.getModel().getValueAt(i, 8)));
                    case postre -> c.addpostre((String) jTable1.getModel().getValueAt(i, 1), Integer.valueOf((String) jTable1.getModel().getValueAt(i, 8)));
                    default -> throw new AssertionError();
                }
                } catch (NumberFormatException e) {
                }
            }
        }
        if (newcomanda) {
            LogicaComandes.afegirComanda(c);
            System.out.println(LogicaComandes.getLlistaComandes());
            taula.updateTable();
            this.dispose();
        }
    }//GEN-LAST:event_addComandaActionPerformed

    private void filterTable(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTable
        updateTable();
    }//GEN-LAST:event_filterTable

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
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Carta dialog = new Carta(new javax.swing.JFrame(), true, 0,new Taula(new javax.swing.JFrame(), true,0));
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
    private javax.swing.JButton addComanda;
    private javax.swing.JToggleButton carnButton;
    private javax.swing.JToggleButton glutenButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToggleButton lacticButton;
    private javax.swing.JToggleButton ouButton;
    private javax.swing.JToggleButton peixButton;
    // End of variables declaration//GEN-END:variables

}
