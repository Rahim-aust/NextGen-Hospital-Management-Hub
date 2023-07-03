package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PatientSignIn extends javax.swing.JFrame
{
    
    public PatientSignIn()
    {
    }
    
    int trackID, serialCount = 1;
    String pusr;
    Date date = new Date();
    
    public PatientSignIn(String username) throws ClassNotFoundException, SQLException
    {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
        
        dNamecombo();
        pusr = username;
        pInfoShow(username);
    }

    public void dNamecombo() throws ClassNotFoundException, SQLException
    {
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        
        try {
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select name from doctorslist");
            
            while(answer.next())
            {
                jComboBox1.addItem(answer.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void pInfoShow(String username) throws ClassNotFoundException, SQLException
    {
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        
        try {
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from patientsignup where username=\""+username+"\"");
           
            while(answer.next())
            {
                title.setText(answer.getString("name"));
                jTextField1.setText(answer.getString("name"));
                jTextField2.setText(answer.getString("contact1"));
                jComboBox3.setSelectedItem(answer.getString("sex"));
                jTextField4.setText(answer.getString("age"));
                jComboBox2.setSelectedItem(answer.getString("bloodgroup"));
                jTextField6.setText(answer.getString("address"));
                jTextField7.setText(answer.getString("guardianname"));
                jTextField8.setText(answer.getString("contact2"));
                hiddenPuser.setText(answer.getString("username"));  
            } 
        } catch (SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGpanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        selectDoctorPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        checkAppoinment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        confirmAppoinment = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        selectDoctorBGlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pInfoUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        BGlabel = new javax.swing.JLabel();
        hiddenPuser = new javax.swing.JLabel();
        hiddenDuser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        BGpanel.setBackground(new java.awt.Color(255, 255, 255));
        BGpanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        BGpanel.setLayout(null);

        backButton.setBackground(new java.awt.Color(255, 51, 102));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbuttonicon.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setOpaque(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        BGpanel.add(backButton);
        backButton.setBounds(20, 70, 40, 40);

        selectDoctorPanel.setBackground(new java.awt.Color(102, 255, 102));
        selectDoctorPanel.setOpaque(false);
        selectDoctorPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Select Doctor");
        selectDoctorPanel.add(jLabel2);
        jLabel2.setBounds(210, 10, 170, 29);

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        selectDoctorPanel.add(jComboBox1);
        jComboBox1.setBounds(140, 60, 400, 30);

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel28.setOpaque(true);
        selectDoctorPanel.add(jLabel28);
        jLabel28.setBounds(140, 100, 400, 30);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setText("Select Date:");
        selectDoctorPanel.add(jLabel12);
        jLabel12.setBounds(10, 320, 110, 30);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setText("Doctor's name:");
        selectDoctorPanel.add(jLabel13);
        jLabel13.setBounds(10, 60, 119, 30);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setText("Speciality:");
        selectDoctorPanel.add(jLabel14);
        jLabel14.setBounds(10, 100, 85, 30);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setText("Degree:");
        selectDoctorPanel.add(jLabel15);
        jLabel15.setBounds(10, 250, 64, 30);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setOpaque(true);
        selectDoctorPanel.add(jLabel19);
        jLabel19.setBounds(140, 190, 400, 30);

        checkAppoinment.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        checkAppoinment.setText("Check appointment");
        checkAppoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAppoinmentActionPerformed(evt);
            }
        });
        selectDoctorPanel.add(checkAppoinment);
        checkAppoinment.setBounds(220, 440, 200, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        selectDoctorPanel.add(jScrollPane1);
        jScrollPane1.setBounds(140, 230, 400, 80);

        confirmAppoinment.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        confirmAppoinment.setText("Confirm appointment");
        confirmAppoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAppoinmentActionPerformed(evt);
            }
        });
        selectDoctorPanel.add(confirmAppoinment);
        confirmAppoinment.setBounds(200, 370, 240, 40);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setText("Experience:");
        selectDoctorPanel.add(jLabel16);
        jLabel16.setBounds(10, 150, 97, 30);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel29.setOpaque(true);
        selectDoctorPanel.add(jLabel29);
        jLabel29.setBounds(140, 150, 400, 30);

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel31.setText("Fee:");
        selectDoctorPanel.add(jLabel31);
        jLabel31.setBounds(10, 190, 36, 30);

        jDateChooser2.setDate(date);
        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jDateChooser2.setMinSelectableDate(date);
        selectDoctorPanel.add(jDateChooser2);
        jDateChooser2.setBounds(140, 320, 180, 30);

        selectDoctorBGlabel.setBackground(new java.awt.Color(204, 255, 204));
        selectDoctorBGlabel.setOpaque(true);
        selectDoctorPanel.add(selectDoctorBGlabel);
        selectDoctorBGlabel.setBounds(0, 0, 580, 500);

        BGpanel.add(selectDoctorPanel);
        selectDoctorPanel.setBounds(420, 100, 580, 500);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jComboBox3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(90, 140, 300, 30);

        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(90, 220, 300, 30);

        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jTextField8);
        jTextField8.setBounds(150, 380, 240, 30);

        jTextField7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jTextField7);
        jTextField7.setBounds(150, 340, 240, 30);

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jTextField6);
        jTextField6.setBounds(90, 260, 300, 30);

        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jTextField4);
        jTextField4.setBounds(90, 180, 300, 30);

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jTextField2);
        jTextField2.setBounds(90, 100, 300, 30);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(90, 60, 300, 30);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("Your Information");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 10, 200, 29);

        pInfoUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pInfoUpdate.setText("Update");
        pInfoUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pInfoUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(pInfoUpdate);
        pInfoUpdate.setBounds(90, 440, 200, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Name:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 60, 51, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Contact:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 100, 70, 30);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Sex:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 140, 35, 30);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Age:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 180, 37, 30);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Address:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 260, 69, 30);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Blood:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 220, 52, 30);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Guardian's name:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 340, 137, 30);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Contact:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 380, 70, 30);

        BGpanel.add(jPanel2);
        jPanel2.setBounds(0, 100, 400, 500);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Hello Patient");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(title);
        title.setBounds(11, 0, 980, 69);

        bar1.setBackground(new java.awt.Color(255, 153, 153));
        bar1.setOpaque(true);
        BGpanel.add(bar1);
        bar1.setBounds(110, 40, 780, 30);

        bar2.setBackground(new java.awt.Color(255, 255, 153));
        bar2.setOpaque(true);
        BGpanel.add(bar2);
        bar2.setBounds(120, 50, 760, 30);

        BGlabel.setBackground(new java.awt.Color(255, 204, 51));
        BGlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg25.png"))); // NOI18N
        BGlabel.setOpaque(true);
        BGpanel.add(BGlabel);
        BGlabel.setBounds(0, 0, 1000, 600);
        BGpanel.add(hiddenPuser);
        hiddenPuser.setBounds(20, 550, 100, 30);
        BGpanel.add(hiddenDuser);
        hiddenDuser.setBounds(840, 550, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    boolean numCheck(String str)
    {
        int strLength=str.length();
        for(int i=0; i<strLength; i++)
        {
            if(!(str.charAt(i)>='0' && str.charAt(i)<='9'))
            {
               return false;
            }
        }
        return true;
    }
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        
        try {
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from doctorslist where name=\""+jComboBox1.getSelectedItem()+"\"");
            
            while(answer.next())
            {
                jLabel28.setText(answer.getString("speciality"));
                jTextArea1.setText(answer.getString("degree"));
                jLabel29.setText(answer.getString("experience"));
                jLabel19.setText(answer.getString("fee"));
                hiddenDuser.setText(answer.getString("username"));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PatientSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void confirmAppoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAppoinmentActionPerformed
   
        String puser= hiddenPuser.getText();
        String duser= hiddenDuser.getText();
        JTextField apd=(JTextField)jDateChooser2.getDateEditor().getUiComponent();
        String apdate= apd.getText();
        int apcheck = 0;
        
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        try { 
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from appointment");
            
            while(answer.next())
            {
                if(answer.getString("duser").equals(duser) && answer.getString("puser").equals(puser) && answer.getString("appointmentdate").equals(apdate))
                {
                    apcheck = 1;
                }
                trackID = answer.getInt("trackid");
            }
            
            if(apcheck == 1)
            {
                infoMsg("Your have already an appointment at the same date to the same doctor", "Alert!!");
            }
            else if(apcheck == 0)
            {
                try {
                    dbc.connect();
                    Statement insert = dbc.dbcon.createStatement();
                    Statement query2 = dbc.dbcon.createStatement();
                    trackID++;
                     ResultSet answer2 = query2.executeQuery("select * from appointment where duser=\""+duser+"\" && appointmentdate=\""+apdate+"\"");
                    while(answer2.next())
                    {
                        serialCount++;
                    }
                    insert.executeUpdate("insert into appointment (trackid,puser,duser,appointmentdate,personalserial) values (\""+trackID+"\", \""+puser+"\", \""+duser+"\", \""+apdate+"\", \""+String.valueOf(serialCount)+"\")");
  
                            
                            
                    infoMsg("Your appointment has been confirmed. Your serial number is: "+serialCount, "Notification");

                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PatientSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmAppoinmentActionPerformed

    private void checkAppoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAppoinmentActionPerformed

        try {
            String pusr = hiddenPuser.getText();
            PatientAppointmentCheck pAppCheckObj = new PatientAppointmentCheck(pusr);
            pAppCheckObj.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PatientSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_checkAppoinmentActionPerformed

    private void pInfoUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pInfoUpdateActionPerformed
        String pName = jTextField1.getText();
        title.setText(pName);
        String pContact = jTextField2.getText();
        String pSex = (String) jComboBox3.getSelectedItem();
        String pAge = jTextField4.getText();
        String pBlood = (String) jComboBox2.getSelectedItem();
        String pAddress = jTextField6.getText();
        String pGname = jTextField7.getText();
        String pGcontact = jTextField8.getText();
       
        
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        try {
            dbc.connect();
            Statement update = dbc.dbcon.createStatement();
            if(pName.equals("") || pAge.equals("") || pContact.equals("") || pGname.equals("") || pGcontact.equals("") || pAddress.equals(""))
            {
                infoMsg("You have to fill up all the  informations", "Attention!!");
            }
            else if(!numCheck(pAge) || pAge.length() > 3 || pAge.length()== 3 && !"100".equals(pAge))
            {
                infoMsg("Invalid age. Enter again.","Alert!!");
            }
            else if(!numCheck(pContact) || pContact.length()!=11 || pContact.charAt(0)!='0' || pContact.charAt(1)!='1')
            {
                infoMsg("Invalid patient's contact. It must be 11 digits and start with 01...","Alert!!");
            }
            else if(!numCheck(pGcontact) || pGcontact.length()!=11 || pGcontact.charAt(0)!='0' || pGcontact.charAt(1)!='1')
            {
                infoMsg("Invalid guardian's contact. It must be 11 digits and start with 01...","Alert!!");
            }
            else
            {
                update.executeUpdate("update patientsignup set Name=\""+pName+"\", Age=\""+pAge+"\", Sex=\""+pSex+"\", Contact1=\""+pContact+"\", GuardianName=\""+pGname+"\", Contact2=\""+pGcontact+"\", BloodGroup=\""+pBlood+"\", Address=\""+pAddress+"\" where username=\""+pusr+"\"");
                infoMsg("Your info has been updated.", "Notification");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_pInfoUpdateActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new PatientSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGlabel;
    private javax.swing.JPanel BGpanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JButton checkAppoinment;
    private javax.swing.JButton confirmAppoinment;
    private javax.swing.JLabel hiddenDuser;
    private javax.swing.JLabel hiddenPuser;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton pInfoUpdate;
    private javax.swing.JLabel selectDoctorBGlabel;
    private javax.swing.JPanel selectDoctorPanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}