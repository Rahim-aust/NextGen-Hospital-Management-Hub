package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PatientSignUp extends javax.swing.JFrame
{
    public PatientSignUp()
    {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGpanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        psex = new javax.swing.JComboBox<>();
        pname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        pcontact = new javax.swing.JTextField();
        pblood = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        paddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pgname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pgcontact = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pusername = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ppass = new javax.swing.JPasswordField();
        psave = new javax.swing.JButton();
        pgoback = new javax.swing.JButton();
        BGlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setMinimumSize(new java.awt.Dimension(10, 10));
        setResizable(false);

        BGpanel.setBackground(new java.awt.Color(255, 255, 255));
        BGpanel.setLayout(null);

        backButton.setBackground(new java.awt.Color(255, 102, 0));
        backButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
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

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Patient's Information");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(title);
        title.setBounds(12, 0, 980, 70);

        bar1.setBackground(new java.awt.Color(255, 153, 153));
        bar1.setOpaque(true);
        BGpanel.add(bar1);
        bar1.setBounds(260, 40, 480, 30);

        bar2.setBackground(new java.awt.Color(255, 255, 153));
        bar2.setOpaque(true);
        BGpanel.add(bar2);
        bar2.setBounds(270, 50, 460, 30);

        jProgressBar1.setForeground(new java.awt.Color(0, 255, 0));
        BGpanel.add(jProgressBar1);
        jProgressBar1.setBounds(0, 114, 1000, 20);

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Patient's name:");
        BGpanel.add(jLabel8);
        jLabel8.setBounds(20, 150, 123, 30);

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Sex:");
        BGpanel.add(jLabel6);
        jLabel6.setBounds(640, 200, 35, 30);

        psex.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        psex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        BGpanel.add(psex);
        psex.setBounds(720, 200, 120, 30);

        pname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pname.setForeground(new java.awt.Color(204, 204, 204));
        pname.setText("Enter your name");
        pname.setToolTipText("");
        pname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnameFocusLost(evt);
            }
        });
        BGpanel.add(pname);
        pname.setBounds(170, 150, 400, 30);

        jLabel19.setBackground(java.awt.Color.white);
        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setText("Contact:");
        BGpanel.add(jLabel19);
        jLabel19.setBounds(640, 150, 70, 30);

        pcontact.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pcontact.setForeground(new java.awt.Color(204, 204, 204));
        pcontact.setText("Enter your number");
        pcontact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pcontact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pcontactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pcontactFocusLost(evt);
            }
        });
        BGpanel.add(pcontact);
        pcontact.setBounds(720, 150, 250, 30);

        pblood.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pblood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        BGpanel.add(pblood);
        pblood.setBounds(490, 200, 80, 30);

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Blood group:");
        BGpanel.add(jLabel3);
        jLabel3.setBounds(380, 200, 103, 30);

        page.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        page.setForeground(new java.awt.Color(204, 204, 204));
        page.setText("Age");
        page.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        page.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pageFocusLost(evt);
            }
        });
        BGpanel.add(page);
        page.setBounds(170, 200, 70, 30);

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Age:");
        BGpanel.add(jLabel7);
        jLabel7.setBounds(20, 200, 40, 30);

        jLabel15.setBackground(java.awt.Color.white);
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setText("Address:");
        BGpanel.add(jLabel15);
        jLabel15.setBounds(20, 250, 80, 30);

        paddress.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        paddress.setForeground(new java.awt.Color(204, 204, 204));
        paddress.setText("Enter your address");
        paddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        paddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                paddressFocusLost(evt);
            }
        });
        BGpanel.add(paddress);
        paddress.setBounds(170, 250, 800, 30);

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Guardian's name:");
        BGpanel.add(jLabel10);
        jLabel10.setBounds(20, 300, 140, 30);

        pgname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pgname.setForeground(new java.awt.Color(204, 204, 204));
        pgname.setText("Enter your guardian's name");
        pgname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pgname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pgnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pgnameFocusLost(evt);
            }
        });
        BGpanel.add(pgname);
        pgname.setBounds(170, 300, 400, 30);

        jLabel14.setBackground(java.awt.Color.white);
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setText("Contact:");
        BGpanel.add(jLabel14);
        jLabel14.setBounds(640, 300, 70, 30);

        pgcontact.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pgcontact.setForeground(new java.awt.Color(204, 204, 204));
        pgcontact.setText("Enter your guardian's number");
        pgcontact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pgcontact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pgcontactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pgcontactFocusLost(evt);
            }
        });
        BGpanel.add(pgcontact);
        pgcontact.setBounds(720, 300, 250, 30);

        jLabel17.setBackground(java.awt.Color.white);
        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel17.setText("New Username:");
        BGpanel.add(jLabel17);
        jLabel17.setBounds(300, 400, 125, 30);

        pusername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pusername.setForeground(new java.awt.Color(204, 204, 204));
        pusername.setText("Enter username");
        pusername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pusernameFocusLost(evt);
            }
        });
        BGpanel.add(pusername);
        pusername.setBounds(430, 400, 200, 30);

        jLabel18.setBackground(java.awt.Color.white);
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel18.setText("New Password:");
        BGpanel.add(jLabel18);
        jLabel18.setBounds(300, 450, 119, 30);

        ppass.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ppass.setForeground(new java.awt.Color(204, 204, 204));
        ppass.setText("password");
        ppass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ppassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ppassFocusLost(evt);
            }
        });
        BGpanel.add(ppass);
        ppass.setBounds(430, 450, 200, 30);

        psave.setBackground(new java.awt.Color(255, 102, 0));
        psave.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        psave.setText("Save");
        psave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psaveActionPerformed(evt);
            }
        });
        BGpanel.add(psave);
        psave.setBounds(450, 500, 100, 40);

        pgoback.setBackground(new java.awt.Color(204, 255, 204));
        pgoback.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pgoback.setText("Already have an account?  Sign in");
        pgoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgobackActionPerformed(evt);
            }
        });
        BGpanel.add(pgoback);
        pgoback.setBounds(325, 550, 350, 30);

        BGlabel.setBackground(new java.awt.Color(153, 153, 255));
        BGlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signupbg.jpg"))); // NOI18N
        BGlabel.setOpaque(true);
        BGpanel.add(BGlabel);
        BGlabel.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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
    
    private void psaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psaveActionPerformed

        String pNuser=pusername.getText();
        String pNpass=new String(ppass.getPassword());
        String pName=pname.getText();
        String pAge=page.getText();
        String pSex=(String) psex.getSelectedItem();
        String pContact=pcontact.getText();
        String pGname= pgname.getText();
        String pGcontact=pgcontact.getText();
        String pBlood=(String) pblood.getSelectedItem();
        String pAddress=paddress.getText();
        
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        
        try {
            dbc.connect();
            Statement insert = dbc.dbcon.createStatement();
            ResultSet answer = insert.executeQuery("select * from patientsignup where username=\""+pNuser+"\"");
            
            if(pNuser.equals("") || pNpass.equals("") || pName.equals("") || pAge.equals("") || pContact.equals("") || pGname.equals("") || pGcontact.equals("") || pAddress.equals(""))
            {
                infoMsg("You have to fill up all the  informations", "Attention!!");
            }
            else if(pNuser.equals("Username") || pNpass.equals("Password") || pName.equals("Enter your name") || pAge.equals("Age") || pContact.equals("Enter your number") || pGname.equals("Enter your guardian's name") || pGcontact.equals("Enter your guardian's number") || pAddress.equals("Enter your address"))
            {
                infoMsg("You have to fill up all the  informations", "Attention!!");
            }
            else if(!numCheck(pAge) || pAge.length() > 3 || (pAge.length()== 3 && !"100".equals(pAge)))
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
            else if(answer.next())
            {
                infoMsg("Username already exist. Try another username.", "Alert!!");
            }
            else
            {
                insert.executeUpdate("insert into patientsignup (Username,Password,Name,Age,Sex,Contact1,GuardianName,Contact2,BloodGroup,Address) values (\""+pNuser+"\", \""+pNpass+"\", \""+pName+"\", \""+pAge+"\", \""+pSex+"\", \""+pContact+"\", \""+pGname+"\", \""+pGcontact+"\", \""+pBlood+"\", \""+pAddress+"\")");
                dispose();
                PatientSignIn pSignInObj;
                try {
                    pSignInObj = new PatientSignIn(pNuser);
                    pSignInObj.setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }              
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_psaveActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void pgobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgobackActionPerformed
        
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_pgobackActionPerformed

    private void pnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnameFocusGained
        if(pname.getText().equals("Enter your name"))
        {
            pname.setText("");
            pname.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+12);
        }
    }//GEN-LAST:event_pnameFocusGained

    private void pnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnameFocusLost
        if(pname.getText().equals(""))
        {
            pname.setText("Enter your name");
            pname.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-12);
        }
    }//GEN-LAST:event_pnameFocusLost

    private void pcontactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pcontactFocusGained
        if(pcontact.getText().equals("Enter your number"))
        {
            pcontact.setText("");
            pcontact.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+12);
        }
    }//GEN-LAST:event_pcontactFocusGained

    private void pcontactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pcontactFocusLost
        if(pcontact.getText().equals(""))
        {
            pcontact.setText("Enter your number");
            pcontact.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-12);
        }
    }//GEN-LAST:event_pcontactFocusLost

    private void pageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pageFocusGained
        if(page.getText().equals("Age"))
        {
            page.setText("");
            page.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+12);
        }
    }//GEN-LAST:event_pageFocusGained

    private void pageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pageFocusLost
        if(page.getText().equals(""))
        {
            page.setText("Age");
            page.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-12);
        }
    }//GEN-LAST:event_pageFocusLost

    private void paddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paddressFocusGained
       if(paddress.getText().equals("Enter your address"))
        {
            paddress.setText("");
            paddress.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+12);
        }
    }//GEN-LAST:event_paddressFocusGained

    private void paddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paddressFocusLost
        if(paddress.getText().equals(""))
        {
            paddress.setText("Enter your address");
            paddress.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-12);
        }
    }//GEN-LAST:event_paddressFocusLost

    private void pgnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pgnameFocusGained
        if(pgname.getText().equals("Enter your guardian's name"))
        {
            pgname.setText("");
            pgname.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+12);
        }
    }//GEN-LAST:event_pgnameFocusGained

    private void pgnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pgnameFocusLost
        if(pgname.getText().equals(""))
        {
            pgname.setText("Enter your guardian's name");
            pgname.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-12);
        }
    }//GEN-LAST:event_pgnameFocusLost

    private void pgcontactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pgcontactFocusGained
        if(pgcontact.getText().equals("Enter your guardian's number"))
        {
            pgcontact.setText("");
            pgcontact.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+12);
        }
    }//GEN-LAST:event_pgcontactFocusGained

    private void pgcontactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pgcontactFocusLost
        if(pgcontact.getText().equals(""))
        {
            pgcontact.setText("Enter your guardian's number");
            pgcontact.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-12);
        }
    }//GEN-LAST:event_pgcontactFocusLost

    private void pusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pusernameFocusGained
        if(pusername.getText().equals("Enter username"))
        {
            pusername.setText("");
            pusername.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+14);
        }
    }//GEN-LAST:event_pusernameFocusGained

    private void pusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pusernameFocusLost
        if(pusername.getText().equals(""))
        {
            pusername.setText("Enter username");
            pusername.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-14);
        }
    }//GEN-LAST:event_pusernameFocusLost

    private void ppassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ppassFocusGained
        if(String.valueOf(ppass.getPassword()).equals("password"))
        {
            ppass.setText("");
            ppass.setForeground(Color.black);
            jProgressBar1.setValue(jProgressBar1.getValue()+14);
        }
    }//GEN-LAST:event_ppassFocusGained

    private void ppassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ppassFocusLost
        if(String.valueOf(ppass.getPassword()).equals(""))
        {
            ppass.setText("password");
            ppass.setForeground(Color.gray);
            jProgressBar1.setValue(jProgressBar1.getValue()-14);
        }
    }//GEN-LAST:event_ppassFocusLost

    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new PatientSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGlabel;
    private javax.swing.JPanel BGpanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField paddress;
    private javax.swing.JTextField page;
    private javax.swing.JComboBox<String> pblood;
    private javax.swing.JTextField pcontact;
    private javax.swing.JTextField pgcontact;
    private javax.swing.JTextField pgname;
    private javax.swing.JButton pgoback;
    private javax.swing.JTextField pname;
    private javax.swing.JPasswordField ppass;
    private javax.swing.JButton psave;
    private javax.swing.JComboBox<String> psex;
    private javax.swing.JTextField pusername;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}