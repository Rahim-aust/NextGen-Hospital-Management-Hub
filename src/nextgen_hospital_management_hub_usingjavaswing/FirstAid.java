package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FirstAid extends javax.swing.JFrame {

    public FirstAid() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGpanel = new javax.swing.JPanel();
        backbutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disname = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        distype = new javax.swing.JComboBox<>();
        BGlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

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
        title.setText("First Aid");
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setText("Symptoms:");
        BGpanel.add(jLabel3);
        jLabel3.setBounds(50, 220, 130, 41);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setText("Suspected Disease Info:");
        BGpanel.add(jLabel4);
        jLabel4.setBounds(50, 320, 260, 36);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setText("Self Treatment(If emergency):");
        BGpanel.add(jLabel5);
        jLabel5.setBounds(50, 470, 380, 32);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setOpaque(true);
        BGpanel.add(jLabel6);
        jLabel6.setBounds(50, 506, 900, 80);

        disname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        disname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        disname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disnameActionPerformed(evt);
            }
        });
        BGpanel.add(disname);
        disname.setBounds(50, 260, 900, 45);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setOpaque(true);
        BGpanel.add(jLabel7);
        jLabel7.setBounds(47, 355, 900, 90);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel8.setText("Types of Symptoms:");
        BGpanel.add(jLabel8);
        jLabel8.setBounds(50, 130, 230, 33);

        distype.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        distype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose types of Suffering", "Abdomen", "Ear Nose Related", "Special Disease", "Random" }));
        distype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distypeActionPerformed(evt);
            }
        });
        BGpanel.add(distype);
        distype.setBounds(50, 170, 900, 40);

        BGlabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/firstaidbg.jpg"))); // NOI18N
        BGpanel.add(BGlabel);
        BGlabel.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void disnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disnameActionPerformed
        try {
            DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
            
            dbc.connect();
            Statement query = dbc.dbcon.createStatement();
            ResultSet answer = query.executeQuery("select * from firstaid where dicename=\""+disname.getSelectedItem()+"\"");

            while(answer.next())
            {
                jLabel7.setText(answer.getString("dicedes"));
                jLabel6.setText(answer.getString("diceinfo"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FirstAid.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_disnameActionPerformed

    private void distypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distypeActionPerformed
        try{
            if(distype.getSelectedItem().equals("Abdomen"))
            {
                disname.removeAllItems();
                disname.setSelectedItem(null);
                disname.addItem("Diarrhoea");
                disname.addItem("Abdominal Pain");
                disname.addItem("Inflammation in Stomach");
                jLabel7.setText("");
                jLabel6.setText("");
            }
            else if(distype.getSelectedItem().equals("Ear Nose Related"))
            {
                disname.removeAllItems();
                disname.setSelectedItem(null);
                disname.addItem("Flu");
                disname.addItem("Cough(more than 3 weeks)");
                disname.addItem("Cough");
                jLabel7.setText("");
                jLabel6.setText("");
            }
            else if(distype.getSelectedItem().equals("Random"))
            {
                disname.removeAllItems();
                disname.setSelectedItem(null);
                disname.addItem("Fracture");
                disname.addItem("Burn");
                disname.addItem("High Blood Pressure");
                disname.addItem("Fever with shivering");
                disname.addItem("Frequent Urination");
                disname.addItem("Cut & Bleeding");
                jLabel7.setText("");
                jLabel6.setText("");
            }
            else if(distype.getSelectedItem().equals("Special Disease"))
            {
                disname.removeAllItems();
                disname.setSelectedItem(null);
                disname.addItem("Covid 19");
                jLabel7.setText("");
                jLabel6.setText("");
            }
            else
            {
                disname.removeAllItems();
                disname.setSelectedItem(null);
                jLabel7.setText("");
                jLabel6.setText("");
            }
        }
        catch(Exception ex)
        {
            infoMsg("The Symptoms is not in our Hub","Alert");
        }
    }//GEN-LAST:event_distypeActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new FirstAid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGlabel;
    private javax.swing.JPanel BGpanel;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JComboBox<String> disname;
    private javax.swing.JComboBox<String> distype;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
