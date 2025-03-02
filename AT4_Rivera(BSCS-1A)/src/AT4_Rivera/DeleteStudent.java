package AT4_Rivera;

//All necessary imports are here, especially those that deal with the json file.
import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane; //added here because it is not under the JFrame class.
import javax.swing.table.DefaultTableModel; //added here because it is not under the JFrame class.
import org.json.simple.*;
import org.json.simple.parser.*;

public class DeleteStudent extends javax.swing.JFrame {

    //Initializes the needed instances and variables
    private String delId;
    private DefaultTableModel dtm;
    private int row, choice;
    //Methods from both AddStudent and UpdateStudent will be used
    //Instances of each class are created here
    private AddStudent x = new AddStudent();
    private UpdateStudent y = new UpdateStudent();

    //Initializes components and shows student record in JTable
    public DeleteStudent() {
        initComponents();
        x.showTable(recordJTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJPnl = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        tableSPnl = new javax.swing.JScrollPane();
        recordJTable = new javax.swing.JTable();
        entriesPnl = new javax.swing.JPanel();
        delBtn = new javax.swing.JButton();
        gLevelPnl = new javax.swing.JPanel();
        gradeCB = new javax.swing.JComboBox<>();
        gradeLbl = new javax.swing.JLabel();
        sectionCB = new javax.swing.JComboBox<>();
        sectionLbl = new javax.swing.JLabel();
        namePnl = new javax.swing.JPanel();
        fnameLbl = new javax.swing.JLabel();
        lnameTF = new javax.swing.JTextField();
        fnameTF = new javax.swing.JTextField();
        lnameLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        delJLbl = new javax.swing.JLabel();
        instructionsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        recordJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Grade", "Section"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordJTableMouseClicked(evt);
            }
        });
        tableSPnl.setViewportView(recordJTable);

        delBtn.setText("Delete Student");
        delBtn.setToolTipText("");
        delBtn.setEnabled(false);
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        gradeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None Selected", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6" }));
        gradeCB.setEnabled(false);

        gradeLbl.setText("Grade:");

        sectionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None Selected", "Section 1", "Section 2", "Section 3", " " }));
        sectionCB.setEnabled(false);

        sectionLbl.setText("Section:");

        javax.swing.GroupLayout gLevelPnlLayout = new javax.swing.GroupLayout(gLevelPnl);
        gLevelPnl.setLayout(gLevelPnlLayout);
        gLevelPnlLayout.setHorizontalGroup(
            gLevelPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gLevelPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gLevelPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gradeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sectionLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(gLevelPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gLevelPnlLayout.createSequentialGroup()
                        .addComponent(sectionCB, 0, 130, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(gLevelPnlLayout.createSequentialGroup()
                        .addComponent(gradeCB, 0, 1, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );
        gLevelPnlLayout.setVerticalGroup(
            gLevelPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gLevelPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gLevelPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(gLevelPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fnameLbl.setText("First Name:");

        lnameTF.setEditable(false);
        lnameTF.setEnabled(false);

        fnameTF.setEditable(false);
        fnameTF.setEnabled(false);

        lnameLbl.setText("Last Name:");

        idLbl.setText("Student ID:");

        idTF.setEditable(false);
        idTF.setEnabled(false);

        javax.swing.GroupLayout namePnlLayout = new javax.swing.GroupLayout(namePnl);
        namePnl.setLayout(namePnlLayout);
        namePnlLayout.setHorizontalGroup(
            namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(namePnlLayout.createSequentialGroup()
                        .addComponent(lnameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(namePnlLayout.createSequentialGroup()
                        .addComponent(fnameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(namePnlLayout.createSequentialGroup()
                        .addComponent(idLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        namePnlLayout.setVerticalGroup(
            namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(namePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout entriesPnlLayout = new javax.swing.GroupLayout(entriesPnl);
        entriesPnl.setLayout(entriesPnlLayout);
        entriesPnlLayout.setHorizontalGroup(
            entriesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entriesPnlLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(namePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(gLevelPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        entriesPnlLayout.setVerticalGroup(
            entriesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entriesPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(entriesPnlLayout.createSequentialGroup()
                .addGroup(entriesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entriesPnlLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(gLevelPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entriesPnlLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        delJLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        delJLbl.setText("Delete Existing Student");
        delJLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        instructionsLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        instructionsLbl.setText("Select Student to Delete:");

        javax.swing.GroupLayout mainJPnlLayout = new javax.swing.GroupLayout(mainJPnl);
        mainJPnl.setLayout(mainJPnlLayout);
        mainJPnlLayout.setHorizontalGroup(
            mainJPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(mainJPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entriesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableSPnl)
                    .addGroup(mainJPnlLayout.createSequentialGroup()
                        .addGroup(mainJPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionsLbl)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(delJLbl)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        mainJPnlLayout.setVerticalGroup(
            mainJPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPnlLayout.createSequentialGroup()
                .addGroup(mainJPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainJPnlLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainJPnlLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(delJLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entriesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainJPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Returns to Welcome window
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        WelcomeUser w = new WelcomeUser();
        w.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    //Event when student is selected
    private void recordJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordJTableMouseClicked
        
        //Enables all TFs but not CBs, this is purely for aesthetic purposes
        //(Also CBs cannot be unselectable unless disabled)
        idTF.setEnabled(true);
        fnameTF.setEnabled(true);
        lnameTF.setEnabled(true);
        delBtn.setEnabled(true);

        //Code block retrieves selected student info and places in appropriate fields
        row = recordJTable.getSelectedRow();
        idTF.setText("" + recordJTable.getValueAt(row, 0));
        fnameTF.setText("" + recordJTable.getValueAt(row, 1));
        lnameTF.setText("" + recordJTable.getValueAt(row, 2));
        gradeCB.setSelectedItem(recordJTable.getValueAt(row, 3));
        sectionCB.setSelectedItem(recordJTable.getValueAt(row, 4));
    }//GEN-LAST:event_recordJTableMouseClicked

    //Event for student deletion
    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        
        //Displays a confirmation dialog before allowing user to delete student
        choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete this student?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            //If yes is selected, ID is searched in student record
            //Student is deleted, student record is saved, and dialog box is shown
            delId = idTF.getText();
            try {
                x.recordCheck(); //parses json file
                for (Object obj : x.students) {
                    JSONObject student = (JSONObject) obj;
                    if (delId.equals(student.get("id"))) {
                        x.students.remove(obj);
                        x.saveStudents();
                        JOptionPane.showMessageDialog(rootPane, "Student successfully deleted.", "Student Deleted", 1);
                        break; //break loop to avoid NullPointerException
                    }
                }
                //All fields are disabled
                disableAll();
                //JTable is wiped
                dtm = (DefaultTableModel) recordJTable.getModel();
                dtm.setRowCount(0);
                //JTable is displayed with new info
                x.showTable(recordJTable);
            } catch (IOException ex) {
                Logger.getLogger(DeleteStudent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DeleteStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            disableAll();
        }
    }//GEN-LAST:event_delBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudent().setVisible(true);
            }
        });
    }
    
    //Clears and disables all entry fields
    private void disableAll() {
        idTF.setText("");
        fnameTF.setText("");
        lnameTF.setText("");
        gradeCB.setSelectedIndex(0);
        sectionCB.setSelectedIndex(0);
        delBtn.setEnabled(false);
        idTF.setEnabled(false);
        fnameTF.setEnabled(false);
        lnameTF.setEnabled(false);
        gradeCB.setEnabled(false);
        sectionCB.setEnabled(false);
        delBtn.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JLabel delJLbl;
    private javax.swing.JPanel entriesPnl;
    private javax.swing.JLabel fnameLbl;
    private javax.swing.JTextField fnameTF;
    private javax.swing.JPanel gLevelPnl;
    private javax.swing.JComboBox<String> gradeCB;
    private javax.swing.JLabel gradeLbl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel instructionsLbl;
    private javax.swing.JLabel lnameLbl;
    private javax.swing.JTextField lnameTF;
    private javax.swing.JPanel mainJPnl;
    private javax.swing.JPanel namePnl;
    private javax.swing.JTable recordJTable;
    private javax.swing.JComboBox<String> sectionCB;
    private javax.swing.JLabel sectionLbl;
    private javax.swing.JScrollPane tableSPnl;
    // End of variables declaration//GEN-END:variables
}
