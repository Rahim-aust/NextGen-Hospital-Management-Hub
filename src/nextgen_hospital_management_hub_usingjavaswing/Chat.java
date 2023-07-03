package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Chat extends javax.swing.JFrame {

    public Chat() throws ClassNotFoundException, SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
        dNamecombo();
    }
    
    int buttonflag;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGpanel = new javax.swing.JPanel();
        backbutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        Heart = new javax.swing.JButton();
        ENT = new javax.swing.JButton();
        Fracture = new javax.swing.JButton();
        Head = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        whiteRound = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        searchtDoctorPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dspeciality = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        dname = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        Yes = new javax.swing.JButton();
        No = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BGlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setSize(new java.awt.Dimension(1000, 600));

        BGpanel.setToolTipText("");
        BGpanel.setLayout(null);

        backbutton.setBackground(new java.awt.Color(255, 102, 0));
        backbutton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbuttonicon.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.setOpaque(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        BGpanel.add(backbutton);
        backbutton.setBounds(20, 70, 40, 40);

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Chat");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(title);
        title.setBounds(0, 0, 1000, 69);

        bar1.setBackground(new java.awt.Color(255, 153, 153));
        bar1.setOpaque(true);
        BGpanel.add(bar1);
        bar1.setBounds(110, 40, 780, 30);

        bar2.setBackground(new java.awt.Color(255, 255, 153));
        bar2.setOpaque(true);
        BGpanel.add(bar2);
        bar2.setBounds(120, 50, 760, 30);

        buttonPanel.setBackground(new java.awt.Color(0, 204, 255));
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(null);

        Heart.setBackground(new java.awt.Color(204, 255, 204));
        Heart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hicon.png"))); // NOI18N
        Heart.setToolTipText("Heart problem");
        Heart.setBorder(null);
        Heart.setOpaque(false);
        Heart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeartActionPerformed(evt);
            }
        });
        buttonPanel.add(Heart);
        Heart.setBounds(210, 0, 120, 110);

        ENT.setBackground(new java.awt.Color(204, 255, 204));
        ENT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ENTicon.png"))); // NOI18N
        ENT.setToolTipText("ENT problem");
        ENT.setBorder(null);
        ENT.setOpaque(false);
        ENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTActionPerformed(evt);
            }
        });
        buttonPanel.add(ENT);
        ENT.setBounds(330, 100, 110, 110);

        Fracture.setBackground(new java.awt.Color(204, 255, 204));
        Fracture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ficon.png"))); // NOI18N
        Fracture.setToolTipText("Fracture");
        Fracture.setBorder(null);
        Fracture.setOpaque(false);
        Fracture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FractureActionPerformed(evt);
            }
        });
        buttonPanel.add(Fracture);
        Fracture.setBounds(210, 210, 120, 110);

        Head.setBackground(new java.awt.Color(204, 255, 204));
        Head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bicon.png"))); // NOI18N
        Head.setToolTipText("Brain problem");
        Head.setBorder(null);
        Head.setOpaque(false);
        Head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeadActionPerformed(evt);
            }
        });
        buttonPanel.add(Head);
        Head.setBounds(110, 100, 110, 110);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        buttonPanel.add(jLabel21);
        jLabel21.setBounds(20, 320, 500, 30);

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Button");
        buttonPanel.add(jLabel23);
        jLabel23.setBounds(230, 160, 80, 30);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Press");
        buttonPanel.add(jLabel24);
        jLabel24.setBounds(230, 120, 80, 30);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Any");
        buttonPanel.add(jLabel25);
        jLabel25.setBounds(230, 140, 80, 30);

        whiteRound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/whiteround.png"))); // NOI18N
        buttonPanel.add(whiteRound);
        whiteRound.setBounds(170, 60, 200, 200);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        buttonPanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 360, 510, 110);

        BGpanel.add(buttonPanel);
        buttonPanel.setBounds(0, 120, 530, 480);

        searchtDoctorPanel.setBackground(new java.awt.Color(0, 204, 255));
        searchtDoctorPanel.setOpaque(false);
        searchtDoctorPanel.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search doctor");
        jLabel2.setOpaque(true);
        searchtDoctorPanel.add(jLabel2);
        jLabel2.setBounds(30, 100, 430, 42);

        dspeciality.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dspeciality.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dspecialityItemStateChanged(evt);
            }
        });
        searchtDoctorPanel.add(dspeciality);
        dspeciality.setBounds(160, 160, 300, 30);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setText("Doctor's name:");
        jLabel13.setOpaque(true);
        searchtDoctorPanel.add(jLabel13);
        jLabel13.setBounds(30, 210, 120, 30);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setText("Speciality:");
        jLabel14.setOpaque(true);
        searchtDoctorPanel.add(jLabel14);
        jLabel14.setBounds(30, 160, 120, 30);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setText("Degree:");
        jLabel15.setOpaque(true);
        searchtDoctorPanel.add(jLabel15);
        jLabel15.setBounds(30, 360, 120, 30);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setOpaque(true);
        searchtDoctorPanel.add(jLabel19);
        jLabel19.setBounds(160, 310, 300, 30);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setText("Experience:");
        jLabel16.setOpaque(true);
        searchtDoctorPanel.add(jLabel16);
        jLabel16.setBounds(30, 260, 120, 30);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel29.setOpaque(true);
        searchtDoctorPanel.add(jLabel29);
        jLabel29.setBounds(160, 260, 300, 30);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel31.setText("Fee:");
        jLabel31.setOpaque(true);
        searchtDoctorPanel.add(jLabel31);
        jLabel31.setBounds(30, 310, 120, 30);

        dname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dnameItemStateChanged(evt);
            }
        });
        searchtDoctorPanel.add(dname);
        dname.setBounds(160, 210, 300, 30);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        searchtDoctorPanel.add(jScrollPane2);
        jScrollPane2.setBounds(160, 360, 300, 120);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("->Do you feel any of the above problem?");
        searchtDoctorPanel.add(jLabel18);
        jLabel18.setBounds(40, 0, 420, 39);

        Yes.setBackground(new java.awt.Color(0, 255, 153));
        Yes.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Yes.setText("Yes");
        Yes.setBorder(null);
        Yes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });
        searchtDoctorPanel.add(Yes);
        Yes.setBounds(140, 50, 70, 29);

        No.setBackground(new java.awt.Color(0, 255, 153));
        No.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        No.setText("No");
        No.setBorder(null);
        No.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        searchtDoctorPanel.add(No);
        No.setBounds(280, 50, 70, 29);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        searchtDoctorPanel.add(jLabel1);
        jLabel1.setBounds(10, 0, 10, 500);

        jLabel3.setOpaque(true);
        searchtDoctorPanel.add(jLabel3);
        jLabel3.setBounds(30, 0, 430, 90);

        BGpanel.add(searchtDoctorPanel);
        searchtDoctorPanel.setBounds(520, 100, 480, 490);

        BGlabel.setBackground(new java.awt.Color(0, 204, 255));
        BGlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chatbg.jpg"))); // NOI18N
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
    
    public void dNamecombo() throws ClassNotFoundException, SQLException
    {
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        try {
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select DISTINCT(speciality) from doctorslist");
            
            while(answer.next())
            {
                dspeciality.addItem(answer.getString("speciality"));
            }
        } catch (SQLException ex) {
        Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed
    
    private void HeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeartActionPerformed
        buttonflag = 1;
        jLabel21.setText("Here is the symptoms of your selected items.");
        jTextArea1.setText("");
        if(jTextArea1.getText().equals(""))
        {
            jTextArea1.setText("1.Chest pain\n2.Shortness of breath\n3.Heart palpitations\n4.Extreme Dizziness\n5.Loss conciousness");
        }
    }//GEN-LAST:event_HeartActionPerformed

    private void ENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTActionPerformed
        // TODO add your handling code here:
        buttonflag = 3;
        jLabel21.setText("Here is the symptoms of your selected items.");
        jTextArea1.setText("");
        if(jTextArea1.getText().equals(""))
        {
            jTextArea1.setText("1.Runny Nose.\n2.Sore Throat.\n3.Coughing/Sneezing.\n4.Ear Pain.\n5.Hearing Loss.\n6.Snoring.\n7.Obstructive Sleep Apnea.\n8.Airway Issues/Difficulty Breathing/Mouth Breathing.");
        }
    }//GEN-LAST:event_ENTActionPerformed

    private void FractureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FractureActionPerformed
        buttonflag = 4;
        jLabel21.setText("Here is the symptoms of your selected items.");
        jTextArea1.setText("");
        if(jTextArea1.getText().equals(""))
        {
            jTextArea1.setText("1.Inability to use the hand or walk\n2.Morning stiffness\n3.Malaise and a feeling tiredness\n4.Weight loss\n5.Poor sleep\n6.Muscle aches and pains\n7.Tenderness\n8.Difficulty moving the joint");
        }
    }//GEN-LAST:event_FractureActionPerformed

    private void HeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeadActionPerformed
        buttonflag = 2;
        jLabel21.setText("Here is the symptoms of your selected items.");
        jTextArea1.setText("");
        if(jTextArea1.getText().equals(""))
        {
            jTextArea1.setText("1.Headache\n2.Memory problems\n3.Abnormal movements\n4.Stroke\n5.Sleep disorders\n6.Neuropathy\n7.Epilepsy\n8.Unsteadness ataxia");
        }
    }//GEN-LAST:event_HeadActionPerformed

    private void dspecialityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dspecialityItemStateChanged
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        try {
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();

            ResultSet answer = query.executeQuery("select name from doctorslist where speciality='"+dspeciality.getSelectedItem()+"'");
            dname.removeAllItems();
           
            while(answer.next())
            {
                dname.addItem(answer.getString("name"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dspecialityItemStateChanged

    private void dnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dnameItemStateChanged
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        try {
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from doctorslist where name='"+dname.getSelectedItem()+"'");
            
            while(answer.next())
            {
                jTextArea2.setText(answer.getString("degree"));
                jLabel29.setText(answer.getString("experience"));
                jLabel19.setText(answer.getString("fee"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dnameItemStateChanged

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
        if(buttonflag==1)
        {
            infoMsg("We advise you to go a cardiologist.","Notification");
        }
        else if(buttonflag==2)
        {
            infoMsg("We advise you to go a neurologist.","Notification");
        }
        else if(buttonflag==3)
        {
            infoMsg("We advise you to go an ENT specialist.","Notification");
        }
        else if(buttonflag==4)
        {
            infoMsg("We advise you to go an orthopadics specialist.","Notification");
        }
        else
        {
            infoMsg("You haven't pressed any button from left.","Notification");
        }
    }//GEN-LAST:event_YesActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        if(buttonflag==1 || buttonflag==2 || buttonflag==3 || buttonflag==4)
        {
            infoMsg("We advise you to go a medicine specialist.","Notification");
        }
        else
        {
            infoMsg("You haven't pressed any button from left.","Notification");
        }
    }//GEN-LAST:event_NoActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    new Chat().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGlabel;
    private javax.swing.JPanel BGpanel;
    private javax.swing.JButton ENT;
    private javax.swing.JButton Fracture;
    private javax.swing.JButton Head;
    private javax.swing.JButton Heart;
    private javax.swing.JButton No;
    private javax.swing.JButton Yes;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JComboBox<String> dname;
    private javax.swing.JComboBox<String> dspeciality;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel searchtDoctorPanel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel whiteRound;
    // End of variables declaration//GEN-END:variables
}
