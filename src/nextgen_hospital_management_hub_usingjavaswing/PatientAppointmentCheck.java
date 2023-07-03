package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatientAppointmentCheck extends javax.swing.JFrame 
{
    public PatientAppointmentCheck()
    {
    }
    
    String ppusername;
    
    public PatientAppointmentCheck(String pusername) throws ClassNotFoundException
    {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
        ppusername = pusername;
        pAppointmentShow(pusername);
    }

    public void pAppointmentShow(String pusername)
    { 
        DefaultTableModel tbm = (DefaultTableModel)jTable1.getModel();

        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");

        try {
            dbc.connect();
            Statement query1 = dbc.dbcon.createStatement();
            ResultSet answer1 = query1.executeQuery("select * from appointment where puser=\""+pusername+"\"");

            while(answer1.next())
            {
                String dt = answer1.getString("appointmentdate");
                String dusr= answer1.getString("duser");

                Statement query2 = dbc.dbcon.createStatement();
                ResultSet answer2 = query2.executeQuery("select * from doctorslist where username=\""+dusr+"\"");

                while(answer2.next())
                {
                    String trackid = String.valueOf(answer1.getInt("trackid"));
                    String serial = answer1.getString("personalserial");
                    String nm = answer2.getString("name");
                    String sp = answer2.getString("speciality");
                    String deg = answer2.getString("degree");
                    String exp = answer2.getString("experience");
                    String fee = answer2.getString("fee");                    

                    String rowData[]= {trackid, serial, dt, nm, sp, deg, exp, fee};
                    tbm.addRow(rowData);
                }
            }            
        } catch (SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PatientAppointmentCheck.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGpanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deletetButton = new javax.swing.JButton();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        BgLabel = new javax.swing.JLabel();

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
        title.setText("Your Appointments");
        title.setToolTipText("Welcome to NextGen Hospital Management Hub");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(title);
        title.setBounds(10, 0, 980, 69);

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TrackID", "Serial", "Date", "Doctor's name", "Speciality", "Degree", "Experience", "Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(4).setMinWidth(150);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(6).setMinWidth(80);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(7).setMinWidth(80);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(80);
        }

        BGpanel.add(jScrollPane1);
        jScrollPane1.setBounds(0, 160, 1000, 350);

        deletetButton.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        deletetButton.setText("Delete Appointment");
        deletetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetButtonActionPerformed(evt);
            }
        });
        BGpanel.add(deletetButton);
        deletetButton.setBounds(360, 520, 290, 70);

        bar1.setBackground(new java.awt.Color(255, 153, 153));
        bar1.setOpaque(true);
        BGpanel.add(bar1);
        bar1.setBounds(110, 40, 780, 30);

        bar2.setBackground(new java.awt.Color(255, 255, 153));
        bar2.setOpaque(true);
        BGpanel.add(bar2);
        bar2.setBounds(120, 50, 760, 30);

        BgLabel.setBackground(new java.awt.Color(204, 255, 204));
        BgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/appointmentbg.jpg"))); // NOI18N
        BgLabel.setOpaque(true);
        BGpanel.add(BgLabel);
        BgLabel.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }//GEN-LAST:event_backButtonActionPerformed

    private void deletetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetButtonActionPerformed
        
        DefaultTableModel tbm = (DefaultTableModel)jTable1.getModel();
        int row = jTable1.getSelectedRow();

        if(row==-1)
        {
            infoMsg("You must select one row", "Alert!!");
        }
        else
        {        
            String trackidd = jTable1.getModel().getValueAt(row, 0).toString();
            String appdate = jTable1.getModel().getValueAt(row, 2).toString();
            
            DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
            try {
                dbc.connect();
                Statement insert = dbc.dbcon.createStatement();
                insert.executeUpdate("delete from appointment where (trackid = \""+trackidd+"\" and appointmentdate = \""+appdate+"\")");
                
                tbm.setRowCount(0);
                pAppointmentShow(ppusername);
                        
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_deletetButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new PatientAppointmentCheck().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGpanel;
    private javax.swing.JLabel BgLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JButton deletetButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}