package AT4_Rivera;

/*NOTE:
In calling each Java class to access their methods
(or call their JFrames), these naming conventions are used:
LoginUser class = v
WelcomeUser class = w
AddStudent class = x
UpdateStudent class = y
DeleteStudent class = z
*/

//Necessary imports are added here
import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import org.json.simple.*;
import org.json.simple.parser.*;

public class LoginUser extends javax.swing.JFrame {

    //Declares instances and variables to be used
    private static String uname, pass, type = "admin";
    private static final String FILE_PATH = "src\\AT4_Rivera\\Users.json";
    private static JSONParser jsonParse = new JSONParser();
    private static JSONObject data = new JSONObject();
    private static JSONArray userlist = new JSONArray();

    public LoginUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPnl = new javax.swing.JPanel();
        unameLbl = new javax.swing.JLabel();
        pswrdLbl = new javax.swing.JLabel();
        unameTF = new javax.swing.JTextField();
        pswrdTF = new javax.swing.JPasswordField();
        loginLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        unameLbl.setText("Enter Username: ");

        pswrdLbl.setText("Enter Password:");

        loginLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginLbl.setText("User Login");

        javax.swing.GroupLayout loginPnlLayout = new javax.swing.GroupLayout(loginPnl);
        loginPnl.setLayout(loginPnlLayout);
        loginPnlLayout.setHorizontalGroup(
            loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPnlLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswrdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unameTF)
                    .addComponent(pswrdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        loginPnlLayout.setVerticalGroup(
            loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(loginLbl)
                .addGap(30, 30, 30)
                .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pswrdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswrdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(loginPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Clears TextFields when clicked
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        unameTF.setText("");
        pswrdTF.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    //Login Button
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        //A try-catch statement for the possibilty for filecheck() to throw an exception
        try {
            //Grabs text from the TextFields and assigns to variables
            uname = unameTF.getText();
            pass = pswrdTF.getText();
            
            //Checks for json file, if not empty it parses it
            filecheck();
            
            //Checker count to see if user exists or not
            int check = 0;
            //Traverses userlist and checks if the username and password entered matches any users
            for (int a = 0; a < userlist.size(); a++) {
                JSONObject userObject = (JSONObject) userlist.get(a);
                String foundUname = (String) userObject.get("username");
                String foundPass = (String) userObject.get("password");
                String foundType = (String) userObject.get("type");

                if (uname.equals(foundUname) && pass.equals(foundPass) && type.equals(foundType)) {
                    check++;
                    break;
                }
            }
            
            //If user does not exist, a message is sent out and the TFs clears
            if (check == 0) {
                JOptionPane.showMessageDialog(this, "Incorrect username or password entered.");
                unameTF.setText("");
                pswrdTF.setText("");
            } else {
            //Otherwise, the program opens to the WelcomeUser Window
                WelcomeUser w = new WelcomeUser();
                w.setVisible(true);
                setVisible(false);

            }
        } catch (IOException | ParseException e) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_loginBtnActionPerformed
    
    //Function for WelcomeUser to retrieve uname
    public static String getuname() {
        return uname;
    }

    //Main class for the JFrame
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
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //This line schedules the display of LoginUser on the Event Dispatch Thread (EDT)
        //This updates the GUI in a thread-safe-manner
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }

    //Checks if the file is empty, if not, parses JSON file to Java Object
    private void filecheck() throws FileNotFoundException, IOException, ParseException {
        //To check if file exists and the length is not 0,
        //a File Object is created with the json file directory
        File jsonFile = new File(FILE_PATH);
        
        //Guard clause for when the file does not exist,
        //the file is empty or is null
        if (!(jsonFile.exists()) || jsonFile.length() == 0 || jsonFile.equals(null)) {
            JOptionPane.showMessageDialog(this, "Userlist is empty.");
        }
        
        //Try-with-resources to open and close the reader to parse JSON File
        try (FileReader reader = new FileReader(FILE_PATH)) {
            data = (JSONObject) jsonParse.parse(reader);
            userlist = (JSONArray) data.get("users");
        } catch (IOException | ParseException e) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPanel loginPnl;
    private javax.swing.JLabel pswrdLbl;
    private javax.swing.JPasswordField pswrdTF;
    private javax.swing.JLabel unameLbl;
    private javax.swing.JTextField unameTF;
    // End of variables declaration//GEN-END:variables
}
