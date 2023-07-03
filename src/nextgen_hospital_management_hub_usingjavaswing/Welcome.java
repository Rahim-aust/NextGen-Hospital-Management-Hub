package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Welcome extends javax.swing.JFrame{
    public Welcome() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
        captchaPanel.setVisible(false);
    }
    
    int flag, personFlag, captchaFlag;
    String captcha;
    String puser, duser;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGpanel = new javax.swing.JPanel();
        aboutbutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        yellowBar = new javax.swing.JLabel();
        blueBar = new javax.swing.JLabel();
        chatbutton = new javax.swing.JButton();
        firstaidbutton = new javax.swing.JButton();
        patientSignUpButton = new javax.swing.JButton();
        captchaPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        captchaShow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        captchaInput = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        captchaEnterButton = new javax.swing.JButton();
        captchaIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signInPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        usericon = new javax.swing.JLabel();
        lockicon = new javax.swing.JLabel();
        duserinput = new javax.swing.JTextField();
        dpassinput = new javax.swing.JPasswordField();
        doctorSigninButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        usericon2 = new javax.swing.JLabel();
        lockicon2 = new javax.swing.JLabel();
        puserinput = new javax.swing.JTextField();
        ppassinput = new javax.swing.JPasswordField();
        patientSignInButton = new javax.swing.JButton();
        BGlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        BGpanel.setBackground(new java.awt.Color(255, 255, 255));
        BGpanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        BGpanel.setLayout(null);

        aboutbutton.setBackground(new java.awt.Color(255, 102, 0));
        aboutbutton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        aboutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about.png"))); // NOI18N
        aboutbutton.setBorder(null);
        aboutbutton.setOpaque(false);
        aboutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbuttonActionPerformed(evt);
            }
        });
        BGpanel.add(aboutbutton);
        aboutbutton.setBounds(940, 10, 50, 50);

        title.setBackground(new java.awt.Color(102, 51, 255));
        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("NextGen Hospital Management Hub");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(title);
        title.setBounds(9, 0, 980, 70);

        yellowBar.setBackground(new java.awt.Color(255, 255, 51));
        yellowBar.setOpaque(true);
        BGpanel.add(yellowBar);
        yellowBar.setBounds(120, 40, 780, 30);

        blueBar.setBackground(new java.awt.Color(102, 255, 255));
        blueBar.setOpaque(true);
        BGpanel.add(blueBar);
        blueBar.setBounds(130, 50, 780, 30);

        chatbutton.setBackground(new java.awt.Color(204, 255, 204));
        chatbutton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        chatbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chat3.gif"))); // NOI18N
        chatbutton.setText("Chat");
        chatbutton.setToolTipText("Chat");
        chatbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chatbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chatbutton.setIconTextGap(0);
        chatbutton.setMargin(new java.awt.Insets(5, 5, 5, 5));
        chatbutton.setMaximumSize(new java.awt.Dimension(101, 99));
        chatbutton.setMinimumSize(new java.awt.Dimension(101, 99));
        chatbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chatbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatbuttonActionPerformed(evt);
            }
        });
        BGpanel.add(chatbutton);
        chatbutton.setBounds(610, 180, 120, 130);

        firstaidbutton.setBackground(new java.awt.Color(204, 255, 204));
        firstaidbutton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        firstaidbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/firstAidBoxIcon.png"))); // NOI18N
        firstaidbutton.setText("First Aid");
        firstaidbutton.setToolTipText("First aid");
        firstaidbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        firstaidbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        firstaidbutton.setIconTextGap(0);
        firstaidbutton.setMargin(new java.awt.Insets(5, 5, 5, 5));
        firstaidbutton.setMaximumSize(new java.awt.Dimension(101, 99));
        firstaidbutton.setMinimumSize(new java.awt.Dimension(101, 99));
        firstaidbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        firstaidbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstaidbuttonActionPerformed(evt);
            }
        });
        BGpanel.add(firstaidbutton);
        firstaidbutton.setBounds(740, 180, 120, 130);

        patientSignUpButton.setBackground(new java.awt.Color(204, 255, 204));
        patientSignUpButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        patientSignUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newusersmall.png"))); // NOI18N
        patientSignUpButton.setText("New Patient");
        patientSignUpButton.setToolTipText("New patient registration");
        patientSignUpButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientSignUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        patientSignUpButton.setMargin(new java.awt.Insets(5, 5, 5, 5));
        patientSignUpButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        patientSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSignUpButtonActionPerformed(evt);
            }
        });
        BGpanel.add(patientSignUpButton);
        patientSignUpButton.setBounds(870, 180, 120, 130);

        captchaPanel.setBackground(new java.awt.Color(255, 255, 153));
        captchaPanel.setOpaque(false);
        captchaPanel.setLayout(null);

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        cancelButton.setBorder(null);
        cancelButton.setOpaque(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        captchaPanel.add(cancelButton);
        cancelButton.setBounds(500, 10, 20, 20);

        captchaShow.setBackground(new java.awt.Color(255, 153, 153));
        captchaShow.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        captchaShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        captchaShow.setText("captcha");
        captchaShow.setOpaque(true);
        captchaPanel.add(captchaShow);
        captchaShow.setBounds(10, 160, 220, 50);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter the captcha");
        captchaPanel.add(jLabel2);
        jLabel2.setBounds(300, 40, 230, 50);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Security question");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        captchaPanel.add(jLabel3);
        jLabel3.setBounds(0, 0, 540, 40);

        captchaInput.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        captchaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        captchaPanel.add(captchaInput);
        captchaInput.setBounds(330, 90, 180, 50);

        refreshButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        captchaPanel.add(refreshButton);
        refreshButton.setBounds(240, 160, 50, 50);

        captchaEnterButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        captchaEnterButton.setText("Enter");
        captchaEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captchaEnterButtonActionPerformed(evt);
            }
        });
        captchaPanel.add(captchaEnterButton);
        captchaEnterButton.setBounds(370, 160, 110, 40);

        captchaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        captchaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/captchaBig.png"))); // NOI18N
        captchaPanel.add(captchaIcon);
        captchaIcon.setBounds(10, 50, 210, 100);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setOpaque(true);
        captchaPanel.add(jLabel1);
        jLabel1.setBounds(300, 0, 230, 210);

        BGpanel.add(captchaPanel);
        captchaPanel.setBounds(450, 360, 540, 230);

        signInPanel.setOpaque(false);
        signInPanel.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setText("Doctor");
        signInPanel.add(jLabel5);
        jLabel5.setBounds(70, 40, 130, 50);

        usericon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        signInPanel.add(usericon);
        usericon.setBounds(40, 91, 30, 40);

        lockicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lockicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        signInPanel.add(lockicon);
        lockicon.setBounds(40, 140, 30, 40);

        duserinput.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        duserinput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N
        duserinput.setOpaque(false);
        signInPanel.add(duserinput);
        duserinput.setBounds(70, 90, 200, 40);

        dpassinput.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dpassinput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N
        dpassinput.setOpaque(false);
        signInPanel.add(dpassinput);
        dpassinput.setBounds(70, 140, 200, 40);

        doctorSigninButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        doctorSigninButton.setText("Sign In");
        doctorSigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorSigninButtonActionPerformed(evt);
            }
        });
        signInPanel.add(doctorSigninButton);
        doctorSigninButton.setBounds(80, 190, 100, 29);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel7.setText("Patient");
        signInPanel.add(jLabel7);
        jLabel7.setBounds(370, 40, 130, 50);

        usericon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usericon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        signInPanel.add(usericon2);
        usericon2.setBounds(339, 91, 31, 40);

        lockicon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lockicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        signInPanel.add(lockicon2);
        lockicon2.setBounds(340, 140, 30, 40);

        puserinput.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        puserinput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N
        puserinput.setOpaque(false);
        signInPanel.add(puserinput);
        puserinput.setBounds(370, 90, 200, 40);

        ppassinput.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ppassinput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N
        ppassinput.setOpaque(false);
        signInPanel.add(ppassinput);
        ppassinput.setBounds(370, 140, 200, 40);

        patientSignInButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        patientSignInButton.setText("Sign In");
        patientSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSignInButtonActionPerformed(evt);
            }
        });
        signInPanel.add(patientSignInButton);
        patientSignInButton.setBounds(380, 190, 100, 29);

        BGpanel.add(signInPanel);
        signInPanel.setBounds(410, 360, 580, 230);

        BGlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bgWelcome.png"))); // NOI18N
        BGpanel.add(BGlabel);
        BGlabel.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BGpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void patientSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSignUpButtonActionPerformed
        dispose();
        PatientSignUp pSignUpObj = new PatientSignUp();
        pSignUpObj.setVisible(true);
    }//GEN-LAST:event_patientSignUpButtonActionPerformed

    private void chatbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatbuttonActionPerformed
        try {
            dispose();
            Chat chatObj = new Chat();
            chatObj.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chatbuttonActionPerformed

    private void aboutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbuttonActionPerformed
        dispose();
        About aboutObj = new About();
        aboutObj.setVisible(true);
    }//GEN-LAST:event_aboutbuttonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        createCaptche();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void doctorSigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorSigninButtonActionPerformed
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        
        try{
            flag = 0;
            captchaFlag = 1;
            duser=duserinput.getText();
            String dpass=new String(dpassinput.getPassword());
            
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from doctorslist");
            
            while(answer.next())
            {
                if(answer.getString("username").equals(duser) && answer.getString("password").equals(dpass))
                {
                    createCaptche();
                    captchaPanel.setVisible(true);
                    signInPanel.setVisible(false);
                    flag = 1;
                    captchaFlag = 2;
                    personFlag = 2;                    
                }
            }

            if(flag == 0)
            {
                infoMsg("Incorrect username or password","Warning");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null,ex);
        }finally {
            duserinput.setText("");
            dpassinput.setText("");
        }
    }//GEN-LAST:event_doctorSigninButtonActionPerformed

    private void patientSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSignInButtonActionPerformed
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");

        try {
            flag = 0;
            captchaFlag = 1;
            puser=puserinput.getText();
            String ppass=new String(ppassinput.getPassword());
            
            dbc.connect();            
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from patientsignup");

            while(answer.next())
            {
                if(answer.getString("username").equals(puser) && answer.getString("password").equals(ppass))
                {
                    createCaptche();
                    captchaPanel.setVisible(true);
                    signInPanel.setVisible(false);
                    flag = 1;
                    captchaFlag = 2;
                    personFlag = 1;
                }
            }

            if(flag == 0)
            {
                infoMsg("Incorrect username or password","Warning");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null,ex);
        }
        finally
        {
            puserinput.setText("");
            ppassinput.setText("");
        }
    }//GEN-LAST:event_patientSignInButtonActionPerformed

    private void captchaEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captchaEnterButtonActionPerformed
        if(captcha.equals(captchaInput.getText()) && captchaFlag == 2)
        {
            try{
                if(personFlag == 1)
                {
                    dispose();
                    PatientSignIn pSignInObj = new PatientSignIn(puser);
                    pSignInObj.setVisible(true);
                }
                
                if(personFlag == 2)
                {                    
                    dispose();
                    DoctorSignIn dSignInObj = new DoctorSignIn(duser);
                    dSignInObj.setVisible(true);
                }
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
             infoMsg("Incorrect captcha. Retry","Warning");
        }
    }//GEN-LAST:event_captchaEnterButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        signInPanel.setVisible(true);
        captchaPanel.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void firstaidbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstaidbuttonActionPerformed
        dispose();
        FirstAid firstAidObj = new FirstAid();
        firstAidObj.setVisible(true);
    }//GEN-LAST:event_firstaidbuttonActionPerformed

    public void createCaptche()
    {
        Random random = new Random();
        int length = 7+(Math.abs(random.nextInt())%3);
        StringBuffer captchaStrBuffer = new StringBuffer();
        
        for(int i=0; i<length; i++)
        {
            int baseCharacterNumber = Math.abs(random.nextInt())%62;
            int characterNumber = 0;
            
            if(baseCharacterNumber < 26)
            {
                characterNumber = 65+baseCharacterNumber;
            }
            else if(baseCharacterNumber < 52)
            {
                characterNumber = 97+(baseCharacterNumber-26);
            }
            else
            {
                characterNumber = 48+(baseCharacterNumber-52);
            }
            
            captchaStrBuffer.append((char)characterNumber);
        }
        captcha = captchaStrBuffer.toString();
        captchaShow.setText(captcha);
    }
    
    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGlabel;
    private javax.swing.JPanel BGpanel;
    private javax.swing.JButton aboutbutton;
    private javax.swing.JLabel blueBar;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton captchaEnterButton;
    private javax.swing.JLabel captchaIcon;
    private javax.swing.JTextField captchaInput;
    private javax.swing.JPanel captchaPanel;
    private javax.swing.JLabel captchaShow;
    private javax.swing.JButton chatbutton;
    private javax.swing.JButton doctorSigninButton;
    private javax.swing.JPasswordField dpassinput;
    private javax.swing.JTextField duserinput;
    private javax.swing.JButton firstaidbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lockicon;
    private javax.swing.JLabel lockicon2;
    private javax.swing.JButton patientSignInButton;
    private javax.swing.JButton patientSignUpButton;
    private javax.swing.JPasswordField ppassinput;
    private javax.swing.JTextField puserinput;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel usericon;
    private javax.swing.JLabel usericon2;
    private javax.swing.JLabel yellowBar;
    // End of variables declaration//GEN-END:variables
}
