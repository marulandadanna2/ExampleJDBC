/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.examplejdbc.view;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.controllers.IKeyController;
import co.edu.sena.examplejdbc.controllers.KeyController;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aprendiz
 */
public class JFrameKey extends javax.swing.JFrame {
    private IKeyController keyController = new KeyController();

    /**
     * Creates new form JFrameKey
     */
    public JFrameKey() {
        initComponents();
        fillTable();
        
    }
    
    public void fillTable()
    {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableKey.setModel(model);
            model.addColumn("id");
            model.addColumn("Nombre");
            model.addColumn("Aula");
            model.addColumn("Cantidad");
            model.addColumn("Observacion");
            
            String[] rows = new String[5];
            List<Key> keys = keyController.findAll();
            for (Key k : keys){
                rows[0] = String.valueOf(k.getId());
                rows[1] = String.valueOf(k.getName());
                rows[2] = String.valueOf(k.getRoom());
                rows[3] = String.valueOf(k.getCount());
                rows[4] = String.valueOf(k.getObservation());
                model.addRow(rows);
            }
        } catch (Exception e) {
             MessageUtils.showErrorMessage(e.getMessage());
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelFullName = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelRoom = new javax.swing.JLabel();
        jTextFieldRoom = new javax.swing.JTextField();
        jLabelCount = new javax.swing.JLabel();
        jTextFieldCount = new javax.swing.JTextField();
        jLabelObservation = new javax.swing.JLabel();
        jTextFieldObservation = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jScrollPaneKey = new javax.swing.JScrollPane();
        jTableKey = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTitle.setText("Llaves");

        jLabelID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelID.setText("ID:");

        jTextFieldID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jTextFieldID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelFullName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFullName.setText("Nombre:");

        jTextFieldFullName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabelRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRoom.setText("Aula:");

        jTextFieldRoom.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabelCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCount.setText("Cantidad:");

        jTextFieldCount.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabelObservation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelObservation.setText("Observacion:");

        jTextFieldObservation.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jButtonInsert.setBackground(new java.awt.Color(181, 224, 197));
        jButtonInsert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonInsert.setText("Crear");
        jButtonInsert.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 102), null, null));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(196, 224, 255));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUpdate.setText("Modificar");
        jButtonUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 153, 255), null, null));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(172, 72, 72));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClean.setBackground(new java.awt.Color(239, 239, 239));
        jButtonClean.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonClean.setText("Limpiar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jTableKey.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKeyMouseClicked(evt);
            }
        });
        jScrollPaneKey.setViewportView(jTableKey);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelObservation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldObservation))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelID)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelRoom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldRoom)))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFullName)
                                    .addComponent(jLabelCount))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jButtonDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonClean))
                            .addComponent(jScrollPaneKey))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitle)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFullName)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRoom)
                    .addComponent(jTextFieldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCount)
                    .addComponent(jTextFieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelObservation))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPaneKey, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clear();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        
             
            try {
            Key key = new Key();
            key.setName(jTextFieldFullName.getText());
            key.setRoom(jTextFieldRoom.getText());
            key.setCount(Integer.parseInt(jTextFieldCount.getText()));
            key.setObservation(jTextFieldObservation.getText());
            keyController.insert(key);
            MessageUtils.showInfoMessage("Llave creada exitosamente");
            fillTable();
            clear();
            } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
            
            
        
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jTableKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKeyMouseClicked
        int rowSelected = jTableKey.getSelectedRow();
        if (rowSelected != -1) 
        {
            String idSelected = jTableKey.getValueAt(rowSelected, 0).toString();
            String fullNameSelected = jTableKey.getValueAt(rowSelected, 1).toString();
            String roomSelected = jTableKey.getValueAt(rowSelected, 2).toString();
            String countSelected = jTableKey.getValueAt(rowSelected, 3).toString();
            String observationSelected = jTableKey.getValueAt(rowSelected, 4).toString();
            
            
            jTextFieldID.setText(idSelected);
            jTextFieldFullName.setText(fullNameSelected);
            jTextFieldRoom.setText(roomSelected);
            jTextFieldCount.setText(countSelected);
            jTextFieldObservation.setText(observationSelected);
            jButtonInsert.setEnabled(false);
            jButtonDelete.setEnabled(true);
            jButtonUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_jTableKeyMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de eliminar el registro","Confirmacion",
                    JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
            {
                keyController.delete(Integer.parseInt(jTextFieldID.getText()));
                MessageUtils.showInfoMessage("La llave fue eliminada exitosamente");
                fillTable();
            }
            clear();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            Key key = new Key();
            key.setId(Integer.parseInt(jTextFieldID.getText()));
            key.setName(jTextFieldFullName.getText());
            key.setRoom(jTextFieldRoom.getText());
            key.setCount(Integer.parseInt(jTextFieldCount.getText()));
            key.setObservation(jTextFieldObservation.getText());
            keyController.update(key);
            MessageUtils.showInfoMessage("Llave modificada exitosamente");
            fillTable();
            clear();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    public void clear()
    {
        jTextFieldID.setText("");
        jTextFieldFullName.setText("");
        jTextFieldRoom.setText("");
        jTextFieldCount.setText("");
        jTextFieldObservation.setText("");
        jTableKey.clearSelection();
        jButtonInsert.setEnabled(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
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
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCount;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelObservation;
    private javax.swing.JLabel jLabelRoom;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPaneKey;
    private javax.swing.JTable jTableKey;
    private javax.swing.JTextField jTextFieldCount;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldObservation;
    private javax.swing.JTextField jTextFieldRoom;
    // End of variables declaration//GEN-END:variables

   
}
