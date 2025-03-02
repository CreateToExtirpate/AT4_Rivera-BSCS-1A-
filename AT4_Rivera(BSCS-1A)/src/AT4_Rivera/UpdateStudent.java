package AT4_Rivera;

//All necessary imports are here, especially those that deal with the json file.
import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane; //added here because it is not under the JFrame class.
import javax.swing.table.DefaultTableModel; //added here because it is not under the JFrame class.
import org.json.simple.*;
import org.json.simple.parser.*;

public class UpdateStudent extends javax.swing.JFrame {

    //Initializes the needed instances and variables
    private String upId, upFname, upLname, upGrade, upSection;
    private DefaultTableModel dtm;
    private int row;
    //Methods from AddStudent will be used, so an instance is created
    private AddStudent x = new AddStudent();

    //Initializes all components, disables all entries, and shows student record
    public UpdateStudent() {
        initComponents();
        disableAll();
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
        upBtn = new javax.swing.JButton();
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
        upJLbl = new javax.swing.JLabel();
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

        upBtn.setText("Update Student");
        upBtn.setToolTipText("");
        upBtn.setEnabled(false);
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
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

        lnameTF.setEnabled(false);

        fnameTF.setEnabled(false);

        lnameLbl.setText("Last Name:");

        idLbl.setText("Student ID:");

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
                .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        upJLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        upJLbl.setText("Update Existing Student");
        upJLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        instructionsLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        instructionsLbl.setText("Select Student to Edit:");

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
                        .addGap(75, 75, 75)
                        .addComponent(upJLbl)))
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
                        .addComponent(upJLbl)))
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

    //Returns user to Welcome window 
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        WelcomeUser w = new WelcomeUser();
        w.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    //Update Button updates selected student info
    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        try {
            //Parses JSON file
            x.recordCheck();
            //Assigns entered info to variables
            upId = idTF.getText();
            upFname = fnameTF.getText();
            upLname = lnameTF.getText();
            upGrade = gradeCB.getSelectedItem().toString();
            upSection = sectionCB.getSelectedItem().toString();

            //Checks if any entries are empty, dialog message is shown if so
            if (upFname.equals("") || upLname.equals("") || upGrade.equals("None Selected") || upSection.equals("None Selected")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill all details.", "Some Data is Missing", 0);
            } else {
                //Updates selected student
                updateStudent();
                
                //Saves student record
                x.saveStudents();
                
                //Resets JTable by setting rows to 0
                dtm = (DefaultTableModel) recordJTable.getModel();
                dtm.setRowCount(0);
                
                //Displays updated student record
                x.showTable(recordJTable);
                
                //Disables all TextFields and ComboBoxes
                disableAll();
                
                //Shows message for a successful update
                JOptionPane.showMessageDialog(rootPane, "Successfully updated!", "Student Updated", 1);
            }
        } catch (IOException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_upBtnActionPerformed

    //Event for when a student is selected
    private void recordJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordJTableMouseClicked
        //All entries are enabled for updating except for ID TF (should not be updated)
        fnameTF.setEnabled(true);
        lnameTF.setEnabled(true);
        gradeCB.setEnabled(true);
        sectionCB.setEnabled(true);
        upBtn.setEnabled(true);

        //Code block to display selected student info in appropriate TFs and CBs:
        //Index of selected row is assigned to String 'row'
        row = recordJTable.getSelectedRow();
        //TF and CB text are set to their respective values from the row
        idTF.setText("" + recordJTable.getValueAt(row, 0));
        fnameTF.setText("" + recordJTable.getValueAt(row, 1));
        lnameTF.setText("" + recordJTable.getValueAt(row, 2));
        gradeCB.setSelectedItem(recordJTable.getValueAt(row, 3));
        sectionCB.setSelectedItem(recordJTable.getValueAt(row, 4));

    }//GEN-LAST:event_recordJTableMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    //Function updates student
    private void updateStudent() {
        //Traverses JSONArray for the ID of selected student
        //When found, uses .put method to append existing values
        for (Object obj : x.students) {
            JSONObject student = (JSONObject) obj;
            if (upId.equals(student.get("id"))) {
                student.put("fname", upFname);
                student.put("lname", upLname);
                student.put("grade", upGrade);
                student.put("section", upSection);
                break;
            }
        }
    }
    
    //Function clears and disables all TFs and CBs
    private void disableAll() {
        idTF.setText("");
        fnameTF.setText("");
        lnameTF.setText("");
        gradeCB.setSelectedIndex(0);
        sectionCB.setSelectedIndex(0);
        upBtn.setEnabled(false);
        fnameTF.setEnabled(false);
        lnameTF.setEnabled(false);
        gradeCB.setEnabled(false);
        sectionCB.setEnabled(false);
        upBtn.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
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
    private javax.swing.JButton upBtn;
    private javax.swing.JLabel upJLbl;
    // End of variables declaration//GEN-END:variables
}
