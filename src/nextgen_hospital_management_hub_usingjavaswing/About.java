package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Toolkit;

public class About extends javax.swing.JFrame {

    public About() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        phoneIcon = new javax.swing.JLabel();
        mailIcon = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        BGlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

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

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("About");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(title);
        title.setBounds(6, 0, 990, 70);

        bar1.setBackground(new java.awt.Color(255, 153, 153));
        bar1.setOpaque(true);
        BGpanel.add(bar1);
        bar1.setBounds(430, 40, 140, 30);

        bar2.setBackground(new java.awt.Color(255, 255, 153));
        bar2.setOpaque(true);
        BGpanel.add(bar2);
        bar2.setBounds(440, 50, 120, 30);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("This software can be used for maintaining a hospital's doctors' list, patients' list and most importantly patients' appointment");
        BGpanel.add(jLabel3);
        jLabel3.setBounds(0, 500, 1000, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("This is a SOFTWARE DEVELOPMENT project based on different functions and framework of JAVA language");
        BGpanel.add(jLabel4);
        jLabel4.setBounds(0, 460, 1000, 40);

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Project members");
        BGpanel.add(jLabel30);
        jLabel30.setBounds(10, 350, 140, 30);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("Abdur Rahim");
        BGpanel.add(jLabel10);
        jLabel10.setBounds(170, 310, 260, 30);

        jLabel26.setBackground(new java.awt.Color(255, 153, 153));
        jLabel26.setOpaque(true);
        BGpanel.add(jLabel26);
        jLabel26.setBounds(150, 150, 10, 90);

        jLabel31.setBackground(new java.awt.Color(153, 255, 255));
        jLabel31.setForeground(new java.awt.Color(102, 255, 255));
        jLabel31.setOpaque(true);
        BGpanel.add(jLabel31);
        jLabel31.setBounds(150, 310, 10, 110);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Project advisors");
        BGpanel.add(jLabel25);
        jLabel25.setBounds(10, 180, 140, 30);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("190104019");
        BGpanel.add(jLabel27);
        jLabel27.setBounds(420, 310, 140, 30);

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("190104020");
        BGpanel.add(jLabel28);
        jLabel28.setBounds(420, 350, 140, 30);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("190104024");
        BGpanel.add(jLabel29);
        jLabel29.setBounds(420, 390, 140, 30);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Abdullah Al Mamun");
        BGpanel.add(jLabel8);
        jLabel8.setBounds(170, 390, 260, 30);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("Abdullah-Al-Sajid");
        BGpanel.add(jLabel9);
        jLabel9.setBounds(170, 350, 260, 30);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("nextgen904@gmail.com");
        BGpanel.add(jLabel15);
        jLabel15.setBounds(230, 550, 270, 40);

        phoneIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoneicon.png"))); // NOI18N
        BGpanel.add(phoneIcon);
        phoneIcon.setBounds(560, 550, 40, 40);

        mailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mailicon.png"))); // NOI18N
        BGpanel.add(mailIcon);
        mailIcon.setBounds(180, 550, 40, 40);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("+8890400123");
        BGpanel.add(jLabel17);
        jLabel17.setBounds(610, 550, 150, 40);

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 153));
        jLabel20.setText("Ms. Raqeebir Rab");
        BGpanel.add(jLabel20);
        jLabel20.setBounds(170, 140, 300, 50);

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Assistant Professor, Dept. of CSE, AUST");
        BGpanel.add(jLabel22);
        jLabel22.setBounds(480, 150, 340, 30);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 153));
        jLabel19.setText("Mr. Saaduddin Mahmud");
        BGpanel.add(jLabel19);
        jLabel19.setBounds(170, 200, 400, 40);

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Lecturer, Dept. of CSE, AUST");
        BGpanel.add(jLabel23);
        jLabel23.setBounds(570, 210, 320, 30);

        BGlabel.setBackground(new java.awt.Color(204, 255, 204));
        BGlabel.setForeground(new java.awt.Color(153, 255, 255));
        BGlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bgAbout.png"))); // NOI18N
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new About().setVisible(true);
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mailIcon;
    private javax.swing.JLabel phoneIcon;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
