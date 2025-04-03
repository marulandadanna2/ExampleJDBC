/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.examplejdbc.view;

import co.edu.sena.examplejdbc.controllers.EmployeeController;
import co.edu.sena.examplejdbc.controllers.EmployeeTypeController;
import co.edu.sena.examplejdbc.controllers.IEmployeeController;
import co.edu.sena.examplejdbc.controllers.IEmployeeTypeController;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aprendiz
 */
public class JFrameEmployee extends javax.swing.JFrame {
    private IEmployeeController employeeController = new EmployeeController();
    private IEmployeeTypeController employeeTypeController  = new EmployeeTypeController();
            

    /**
     * Creates new form JFrameEmployee
     */
    public JFrameEmployee() {
        initComponents();
        fillcomboTypes();
        fillTable();
    }
    
    public void fillcomboTypes()
    {
        try {
            List<EmployeeType> types = employeeTypeController.findAll();
            DefaultComboBoxModel model  = new DefaultComboBoxModel();
            jComboBoxType.setModel(model);
            model.addAll(types);
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }
    
    public void fillTable()
    {
        
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableEmployeees.setModel(model);
            model.addColumn("   Documento");
            model.addColumn("Nombre Completo");
            model.addColumn("Tipo de empleado");

            
            String[] rows = new String[3];
            List<Employee> employees = employeeController.FindAll();
            for (Employee e : employees){
                rows[0] = String.valueOf(e.getDocument());
                rows[1] = e.getFullname();
                rows[2] = e.getEmployeeType().getDescript();
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

        jLabelTitle = new javax.swing.JLabel();
        jLabelDocument = new javax.swing.JLabel();
        jTextFieldDocument = new javax.swing.JTextField();
        jLabelFullname = new javax.swing.JLabel();
        jTextFieldFullname = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabelPhone = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployeees = new javax.swing.JTable();
        jLabelType = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTitle.setText("Empleado");

        jLabelDocument.setText("Documento:");

        jTextFieldDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDocumentActionPerformed(evt);
            }
        });

        jLabelFullname.setText("Nombre completo:");

        jLabelAddress.setText("Direccion:");

        jLabelPhone.setText("Telefono:");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTableEmployeees.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEmployeees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployeees);

        jLabelType.setText("Tipo:");

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonInsert.setBackground(new java.awt.Color(181, 224, 197));
        jButtonInsert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonInsert.setText("Crear");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(196, 224, 255));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUpdate.setText("Modificar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAddress)
                                    .addComponent(jLabelType))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAddress)
                                    .addComponent(jComboBoxType, 0, 183, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonUpdate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDocument)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPhone)
                                    .addComponent(jLabelFullname))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFullname)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButtonInsert)
                            .addGap(306, 306, 306)
                            .addComponent(jButtonDelete)
                            .addGap(100, 100, 100)
                            .addComponent(jButtonClean))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDocument)
                    .addComponent(jTextFieldDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFullname)
                    .addComponent(jTextFieldFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhone)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelType)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDocumentActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            Employee employee = new Employee();
            employee.setDocument(Long.parseLong(jTextFieldDocument.getText()));
            employee.setFullname(jTextFieldFullname.getText());
            employee.setAddress(jTextFieldAddress.getText());
            employee.setPhone(jTextFieldPhone.getText());
            //FK
            EmployeeType type = (EmployeeType) jComboBoxType.getSelectedItem();
            employee.setEmployeeType(type);
            
            employeeController.update(employee);
            MessageUtils.showInfoMessage("Empleado modificado exitosamente");
            fillTable();
            clean();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clean();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
       try {
            Employee employee = new Employee();
            employee.setDocument(Long.parseLong(jTextFieldDocument.getText()));
            employee.setFullname(jTextFieldFullname.getText());
            employee.setAddress(jTextFieldAddress.getText());
            employee.setPhone(jTextFieldPhone.getText());
            //FK
            EmployeeType type = (EmployeeType) jComboBoxType.getSelectedItem();
            employee.setEmployeeType(type);
            
            employeeController.insert(employee);
            MessageUtils.showInfoMessage("Empleado creado exitosamente");
            fillTable();
            clean();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jTableEmployeeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeesMouseClicked
        int rowSelected = jTableEmployeees.getSelectedRow();
        if (rowSelected != -1) 
        {
            long documentSelected = Long.parseLong(jTableEmployeees.getValueAt(rowSelected, 0).toString());
            
            try {
                Employee employee = employeeController.findById(documentSelected);
                jTextFieldDocument.setText(String.valueOf(documentSelected));
                jTextFieldFullname.setText(employee.getFullname());
                jTextFieldAddress.setText(employee.getAddress());
                jTextFieldPhone.setText(employee.getPhone());
                jComboBoxType.getModel().setSelectedItem(employee.getEmployeeType());
                
                jButtonInsert.setEnabled(false);
                jButtonDelete.setEnabled(true);
                jButtonUpdate.setEnabled(true);
            } catch (Exception e) {
            }
            
        }
        
    }//GEN-LAST:event_jTableEmployeeesMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de eliminar el registro","Confirmacion",
                    JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
            {
                employeeController.delete(Long.parseLong(jTextFieldDocument.getText()));
                MessageUtils.showInfoMessage("Empleado eliminado exitosamente");
                fillTable();
            }
            clean();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    public void clean()
    {
        jTextFieldAddress.setText("");
        jTextFieldDocument.setText("");
        jTextFieldFullname.setText("");
        jTextFieldPhone.setText("");
        jTableEmployeees.clearSelection();
        jComboBoxType.setSelectedIndex(0);
        jButtonInsert.setEnabled(true);
        jButtonDelete.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        
        
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
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelDocument;
    private javax.swing.JLabel jLabelFullname;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployeees;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldDocument;
    private javax.swing.JTextField jTextFieldFullname;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables

    
}
