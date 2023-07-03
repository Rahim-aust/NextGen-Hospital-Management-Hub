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
import javax.swing.table.DefaultTableModel;

public class DoctorSignIn extends javax.swing.JFrame 
{
    public DoctorSignIn()
    {
    }
    
    Date date = new Date();
    String dusername;
    String pusr, pusr2;
    String apdate;

    public DoctorSignIn(String username) throws ClassNotFoundException, SQLException
    {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
        
        dInfoShow(username);
        dusername = username;   
    }

    public void dInfoShow(String username) throws ClassNotFoundException, SQLException
    {   
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        
        try {
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from doctorslist where username=\""+username+"\"");
            
            while(answer.next())
            {
                title.setText(answer.getString("name"));   
            }            
        } catch (SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
        
    public void pInfoShow(String username, String apdate) throws ClassNotFoundException, SQLException
    {
        int i = 0;
        DefaultTableModel tbm = (DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0); 

        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        try {
            int check = 0;
            
            dbc.connect();
            Statement query1 = dbc.dbcon.createStatement();
            ResultSet answer1 = query1.executeQuery("select * from appointment");

            while(answer1.next())
            {
                if(answer1.getString("duser").equals(username) && answer1.getString("appointmentdate").equals(apdate))
                {         
                    Statement query2 = dbc.dbcon.createStatement();
                    pusr= answer1.getString("puser");
                    ResultSet answer2 = query2.executeQuery("select * from patientsignup where username=\""+pusr+"\"");
                
                    while(answer2.next())
                    {
                        while(check == 0)
                        {
                            pusr2 = answer2.getString("username");
                            check = 1;
                        }
                        String tid = String.valueOf(answer1.getInt("trackid"));
                        String nm = answer2.getString("name");
                        String ag = answer2.getString("age");
                        String bgrp = answer2.getString("bloodgroup");
                        String sx = answer2.getString("sex");
                        String cn1 = answer2.getString("contact1");
                        String gnm = answer2.getString("guardianname");
                        String cn2 = answer2.getString("contact2");
                        String adr = answer2.getString("address");
                        
                        i++;
                        String serial=String.valueOf(i);
                        String rowData[]= {tid, serial, nm, ag, bgrp, sx, cn1, gnm, cn2, adr};
                        tbm.addRow(rowData);     
                    }
                }
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
        title = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        treatmentButton = new javax.swing.JButton();
        dateConfirmButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BgLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        BGpanel.setBackground(new java.awt.Color(255, 255, 255));
        BGpanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        BGpanel.setLayout(null);

        backButton.setBackground(new java.awt.Color(255, 0, 51));
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
        title.setText("Hello Doctor");
        title.setToolTipText("Welcome to NextGen Hospital Management Hub");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(title);
        title.setBounds(10, 0, 980, 70);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel12.setText("Select Date:");
        BGpanel.add(jLabel12);
        jLabel12.setBounds(690, 80, 140, 30);

        bar1.setBackground(new java.awt.Color(255, 153, 153));
        bar1.setOpaque(true);
        BGpanel.add(bar1);
        bar1.setBounds(100, 40, 800, 30);

        bar2.setBackground(new java.awt.Color(255, 255, 153));
        bar2.setOpaque(true);
        BGpanel.add(bar2);
        bar2.setBounds(110, 50, 780, 30);

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jDateChooser1.setMinSelectableDate(date);
        jDateChooser1.setPreferredSize(new java.awt.Dimension(74, 30));
        BGpanel.add(jDateChooser1);
        jDateChooser1.setBounds(830, 80, 160, 30);

        treatmentButton.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        treatmentButton.setText("Treatment");
        treatmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentButtonActionPerformed(evt);
            }
        });
        BGpanel.add(treatmentButton);
        treatmentButton.setBounds(420, 520, 160, 70);

        dateConfirmButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dateConfirmButton.setText("Refresh");
        dateConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateConfirmButtonActionPerformed(evt);
            }
        });
        BGpanel.add(dateConfirmButton);
        dateConfirmButton.setBounds(830, 120, 160, 29);

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TrackID", "Serial", "Patient's name", "Age", "Blood group", "Sex", "Contact", "Guardian's name", "Contact", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(3).setMinWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(4).setMinWidth(60);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(5).setMinWidth(50);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(6).setMinWidth(130);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(130);
            jTable1.getColumnModel().getColumn(7).setMinWidth(150);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(8).setMinWidth(130);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(130);
        }

        BGpanel.add(jScrollPane1);
        jScrollPane1.setBounds(0, 160, 1000, 350);

        BgLabel.setBackground(new java.awt.Color(204, 255, 204));
        BgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctorbg.jpg"))); // NOI18N
        BgLabel.setOpaque(true);
        BGpanel.add(BgLabel);
        BgLabel.setBounds(0, 0, 1000, 600);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");
        BGpanel.add(jLabel1);
        jLabel1.setBounds(310, 270, 170, 40);

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setDate(date);
        jDateChooser3.setDateFormatString("dd/MM/yyyy");
        jDateChooser3.setEnabled(false);
        jDateChooser3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jDateChooser3.setIcon(null);
        jDateChooser3.setPreferredSize(new java.awt.Dimension(74, 30));
        BGpanel.add(jDateChooser3);
        jDateChooser3.setBounds(850, 120, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
        
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void treatmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentButtonActionPerformed
        
        DefaultTableModel tbm = (DefaultTableModel)jTable1.getModel();
        int row = jTable1.getSelectedRow();

        JTextField apd=(JTextField)jDateChooser1.getDateEditor().getUiComponent();
        String apdate= apd.getText();
        
        JTextField tod=(JTextField)jDateChooser3.getDateEditor().getUiComponent();
        String todate= tod.getText();

        if(row == -1)
        {
            infoMsg("You must select one row", "Alert!!");
        }
        else if(!(apdate.equals(todate)))
        {
            infoMsg("You must select a patient from today's appointments", "Alert!!");
        }
        else
        {
            String tID = jTable1.getModel().getValueAt(row, 0).toString();
            DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
            try {
                dbc.connect();
                Statement query = dbc.dbcon.createStatement();
                ResultSet answer = query.executeQuery("select * from doctorslist where username=\""+dusername+"\"");

                while(answer.next())
                {
                    String dname = answer.getString("name");
                    String dspec = answer.getString("speciality");
                    String ddegree = answer.getString("degree");

                    String pname = jTable1.getModel().getValueAt(row, 2).toString();
                    String page = jTable1.getModel().getValueAt(row, 3).toString();
                    
                    Prescription prescriptionObj = new Prescription(dname, dspec, ddegree, pname, page, tID);
                    prescriptionObj.setVisible(true);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DoctorSignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_treatmentButtonActionPerformed

    private void dateConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateConfirmButtonActionPerformed
        
        JTextField apd=(JTextField)jDateChooser1.getDateEditor().getUiComponent();
        apdate= apd.getText();
        
        try {
            pInfoShow(dusername, apdate);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DoctorSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateConfirmButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new DoctorSignIn().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGpanel;
    private javax.swing.JLabel BgLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JButton dateConfirmButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    private javax.swing.JButton treatmentButton;
    // End of variables declaration//GEN-END:variables
}