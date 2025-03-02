package AT4_Rivera;

//All necessary imports are here, especially those that deal with the json file
import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane; //added here because it is not under the JFrame class
import javax.swing.table.DefaultTableModel; //added here because it is not under the JFrame class
import javax.swing.JTable;
import org.json.simple.*;
import org.json.simple.parser.*;

//JFrame inherits all properties from class javax.swingJFrame.
//This is why the import javax.swing.*; is not included in imports
public class AddStudent extends javax.swing.JFrame {

    //Initializes the needed instances and variables
    public static final String FILE_PATH = "src\\AT4_Rivera\\Record.json";
    private String addId, addFname, addLname, addGrade, addSection;
    public JSONParser jsonParse = new JSONParser();
    public JSONObject record = new JSONObject();
    private JSONObject newStudent = new JSONObject();
    public JSONArray students = new JSONArray();
    private DefaultTableModel dtm ;

    //All components are initialized and the JTable displays the student record
    public AddStudent() {
        initComponents();
        //showTable is responsible for displaying student record
        showTable(recordJTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJPnl = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        tableSPnl = new javax.swing.JScrollPane();
        recordJTable = new javax.swing.JTable();
        entriesPnl = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
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
        addJLbl = new javax.swing.JLabel();
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
        tableSPnl.setViewportView(recordJTable);

        addBtn.setText("Add Student");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        gradeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None Selected", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6" }));

        gradeLbl.setText("Grade:");

        sectionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None Selected", "Section 1", "Section 2", "Section 3", " " }));

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
                        .addComponent(sectionCB, 0, 136, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(gLevelPnlLayout.createSequentialGroup()
                        .addComponent(gradeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lnameLbl.setText("Last Name:");

        idLbl.setText("Student ID:");

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
                .addComponent(gLevelPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addJLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addJLbl.setText("Add New Student");
        addJLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        instructionsLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        instructionsLbl.setText("Enter the following:");

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
                        .addGap(102, 102, 102)
                        .addComponent(addJLbl)))
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
                        .addComponent(addJLbl)))
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

    //Back button clears all data from fields
    //Also opens 'Welcome' window and closes current one
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        clearData();
        WelcomeUser w = new WelcomeUser();
        w.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    //Add button adds the student info to the JSON file
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        try {
            //recordCheck() parses the JSON file to Java Objects
            recordCheck();
            //Assigns all entered/selected text to created variables
            addId = idTF.getText();
            addFname = fnameTF.getText();
            addLname = lnameTF.getText();
            //ComboBox items are converted to String
            addGrade = gradeCB.getSelectedItem().toString();
            addSection = sectionCB.getSelectedItem().toString();
            
            //if-else-if statement for missing fields or existing ID
            //Checks if all entries are filled, displays message if not
            if (addId.equals("") || addFname.equals("") || addLname.equals("") || addGrade.equals("None Selected") || addFname.equals("None Selected")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill all details.", "Some Data is Missing", 0);
            } else if (studentExists(addId)) {
                //If student already exists, displays this message
                JOptionPane.showMessageDialog(rootPane, "This student already exists in the database.", "Existing Student ID", 0);
                clearData();
            } else {
                //Places entered student info into new JSONObject
                newStudent.put("id", addId);
                newStudent.put("fname", addFname);
                newStudent.put("lname", addLname);
                newStudent.put("grade", addGrade);
                newStudent.put("section", addSection);
                
                //Adds new student to the JSONArray of students
                students.add(newStudent);
                //JSONObject (Student) Record is updated with new student
                record.put("students", students);
                //Saves Student Record into the JSON file
                saveStudents();
                
                //Adds New student data into the JTable
                dtm = (DefaultTableModel) recordJTable.getModel();
                dtm.addRow(new Object[]{addId, addFname, addLname, addGrade, addSection});
                //Clears all data from TextFields and ComboBoxes
                clearData();
                //Show message
                JOptionPane.showMessageDialog(rootPane, "Successfully Added into json file!");
            }
        } catch (IOException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    //Function checks if the JSONFile is empty, if not, parses the JSON file to Java Objects
    public void recordCheck() throws IOException, ParseException {
        //To perform a file check, a File Object is created with file directory
        File studentFile = new File(FILE_PATH);
        
        //Guard clause: Shows message if file is nonexistent, file length is 0, or file is null
        if (!(studentFile.exists()) || studentFile.length() == 0 || studentFile.equals(null)) {
            JOptionPane.showMessageDialog(this, "Student record is empty.");
        }

        //JSON file is parsed
        try (FileReader reader = new FileReader(FILE_PATH)) {
            record = (JSONObject) jsonParse.parse(reader);
            students = (JSONArray) record.get("students");
        } catch (IOException e) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, e);
        } catch (ParseException e) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //Function saves students to JSONFile using FileWriter
    public void saveStudents() throws IOException {

        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(record.toJSONString());
        } catch (IOException e) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //showTable function gets student record and displays it on JTable
    public void showTable(JTable table) {
        //A JTable must be passed so that UpdateStudent and DeleteStudent's JTables can use this method too
        //The model of the JTable is type casted into a Default Table Model to add new rows
        DefaultTableModel dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) table.getModel();
        
        //try-catch to safely retrieve student details from file
        try {
            recordCheck();
        } catch (ParseException | IOException e) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, e);
        }
        
        //Traverses through students and inserts the information of each into a row
        for (Object obj : students) {
            JSONObject student = (JSONObject) obj;
            dtm.addRow(new Object[]{student.get("id"), student.get("fname"), student.get("lname"), student.get("grade"), student.get("section")});
        }
    }

    //Clears all entries
    public void clearData() {
        idTF.setText("");
        fnameTF.setText("");
        lnameTF.setText("");
        gradeCB.setSelectedIndex(0);
        sectionCB.setSelectedIndex(0);
    }

    //Checks if the ID of the student to be added already exists
    public boolean studentExists(String addId) {
        for (Object obj : students) {
            JSONObject student = (JSONObject) obj;
            if (addId.equals(student.get("id"))) {
                return true; //returns true if student ID exists
            }
        }
        return false; //returns false if ID is not found
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel addJLbl;
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
    // End of variables declaration//GEN-END:variables
}
