package nextgen_hospital_management_hub_usingjavaswing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import static java.awt.print.PageFormat.LANDSCAPE;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prescription extends javax.swing.JFrame {
    
    public Prescription() 
    {  
    }
    
    Date date = new Date();
    int trackID;
    String pusr, dusr;
    String apdate;//appointment date
    
    public Prescription(String dname, String dspec, String ddegree, String pname, String page, String tid)
    {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/pageIcon.png")));
        
        dName.setText(dname);
        dSpec.setText(dspec);
        dDegree.setText(ddegree);
        
        pName.setText(pname);
        pAge.setText(page);
        
        trackID = Integer.parseInt(tid);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bottompanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        BGpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dSpec = new javax.swing.JLabel();
        dName = new javax.swing.JLabel();
        dDegree = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        pAge = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        BGlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NextGen Hospital Management Hub");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(null);

        Bottompanel.setPreferredSize(new java.awt.Dimension(100, 12));
        Bottompanel.setLayout(null);

        cancelButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        Bottompanel.add(cancelButton);
        cancelButton.setBounds(290, 10, 120, 30);

        printButton.setBackground(new java.awt.Color(102, 255, 102));
        printButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        Bottompanel.add(printButton);
        printButton.setBounds(560, 10, 120, 30);

        jPanel1.add(Bottompanel);
        Bottompanel.setBounds(0, 552, 1000, 50);

        BGpanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        BGpanel.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(102, 51, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Management Hub");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(jLabel6);
        jLabel6.setBounds(620, 40, 380, 69);

        dSpec.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dSpec.setText("doctor'sSpeciality");
        BGpanel.add(dSpec);
        dSpec.setBounds(10, 50, 430, 30);

        dName.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        dName.setForeground(new java.awt.Color(255, 51, 51));
        dName.setText("doctor'sName");
        BGpanel.add(dName);
        dName.setBounds(10, 10, 440, 40);

        dDegree.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dDegree.setText("doctor'sDegree");
        dDegree.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BGpanel.add(dDegree);
        dDegree.setBounds(10, 80, 440, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pageIconSmall.png"))); // NOI18N
        BGpanel.add(jLabel1);
        jLabel1.setBounds(450, 10, 100, 100);

        jLabel7.setBackground(new java.awt.Color(102, 51, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NextGen Hospital");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGpanel.add(jLabel7);
        jLabel7.setBounds(620, 0, 380, 50);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setToolTipText("");
        jLabel8.setOpaque(true);
        BGpanel.add(jLabel8);
        jLabel8.setBounds(240, 180, 2, 320);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText(" days will be better");
        BGpanel.add(jLabel9);
        jLabel9.setBounds(520, 510, 160, 30);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDate(date);
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setEnabled(false);
        jDateChooser1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jDateChooser1.setIcon(null);
        jDateChooser1.setPreferredSize(new java.awt.Dimension(74, 30));
        BGpanel.add(jDateChooser1);
        jDateChooser1.setBounds(850, 120, 140, 30);

        pAge.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pAge.setForeground(new java.awt.Color(204, 0, 102));
        pAge.setText("pAge");
        BGpanel.add(pAge);
        pAge.setBounds(590, 120, 60, 30);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel11.setText("Date:");
        BGpanel.add(jLabel11);
        jLabel11.setBounds(790, 120, 60, 30);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel12.setText("Age:");
        BGpanel.add(jLabel12);
        jLabel12.setBounds(530, 120, 50, 30);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText(" Comment");
        jLabel13.setOpaque(true);
        BGpanel.add(jLabel13);
        jLabel13.setBounds(720, 180, 270, 25);

        pName.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pName.setForeground(new java.awt.Color(204, 0, 102));
        pName.setText("patient'sName");
        BGpanel.add(pName);
        pName.setBounds(90, 120, 330, 30);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("____________________________________________________________________________________________________________");
        BGpanel.add(jLabel15);
        jLabel15.setBounds(0, 480, 1000, 30);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("____________________________________________________________________________________________________________");
        BGpanel.add(jLabel16);
        jLabel16.setBounds(0, 90, 1000, 30);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel17.setText("Name:");
        BGpanel.add(jLabel17);
        jLabel17.setBounds(10, 120, 80, 30);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Symptoms");
        jLabel18.setOpaque(true);
        BGpanel.add(jLabel18);
        jLabel18.setBounds(10, 180, 220, 20);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tests");
        jLabel19.setOpaque(true);
        BGpanel.add(jLabel19);
        jLabel19.setBounds(10, 340, 220, 20);

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BGpanel.add(jTextField1);
        jTextField1.setBounds(480, 510, 40, 30);

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel20.setText("Next checkup after ");
        BGpanel.add(jLabel20);
        jLabel20.setBounds(320, 510, 160, 30);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText(" Dose");
        jLabel21.setOpaque(true);
        BGpanel.add(jLabel21);
        jLabel21.setBounds(580, 180, 130, 25);

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText(" Medicines");
        jLabel22.setOpaque(true);
        BGpanel.add(jLabel22);
        jLabel22.setBounds(250, 180, 320, 25);

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField2);
        jTextField2.setBounds(720, 300, 270, 25);

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField3);
        jTextField3.setBounds(580, 300, 130, 25);

        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField4);
        jTextField4.setBounds(250, 300, 320, 25);

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField5);
        jTextField5.setBounds(580, 260, 130, 25);

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField6);
        jTextField6.setBounds(250, 260, 320, 25);

        jTextField7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField7);
        jTextField7.setBounds(720, 260, 270, 25);

        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField8);
        jTextField8.setBounds(580, 460, 130, 25);

        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField9);
        jTextField9.setBounds(250, 460, 320, 25);

        jTextField10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField10);
        jTextField10.setBounds(720, 460, 270, 25);

        jTextField11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField11);
        jTextField11.setBounds(580, 340, 130, 25);

        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField12);
        jTextField12.setBounds(250, 340, 320, 25);

        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField13);
        jTextField13.setBounds(720, 340, 270, 25);

        jTextField14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField14);
        jTextField14.setBounds(580, 380, 130, 25);

        jTextField15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField15);
        jTextField15.setBounds(250, 380, 320, 25);

        jTextField16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField16);
        jTextField16.setBounds(720, 380, 270, 25);

        jTextField17.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField17);
        jTextField17.setBounds(580, 420, 130, 25);

        jTextField18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField18);
        jTextField18.setBounds(250, 420, 320, 25);

        jTextField19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField19);
        jTextField19.setBounds(720, 420, 270, 25);

        jTextField29.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField29);
        jTextField29.setBounds(580, 220, 130, 25);

        jTextField30.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        BGpanel.add(jTextField30);
        jTextField30.setBounds(10, 370, 220, 120);

        jTextField31.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField31);
        jTextField31.setBounds(720, 220, 270, 25);

        jTextField33.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BGpanel.add(jTextField33);
        jTextField33.setBounds(250, 220, 320, 25);

        jTextField32.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField32.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BGpanel.add(jTextField32);
        jTextField32.setBounds(10, 210, 220, 120);

        BGlabel.setBackground(new java.awt.Color(249, 248, 249));
        BGlabel.setOpaque(true);
        BGpanel.add(BGlabel);
        BGlabel.setBounds(0, 0, 1000, 550);

        jPanel1.add(BGpanel);
        BGpanel.setBounds(0, -1, 1000, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print prescription");
            
        job.setPrintable(new Printable()
        {
            @Override
            public int print(Graphics pg, PageFormat pf, int pageNum)
            {
                pf.setOrientation(LANDSCAPE);
                
                if(pageNum>0)
                {
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.5,0.5);
                BGpanel.paint(g2);
                return Printable.PAGE_EXISTS;  
            }
        });
         
        boolean ok = job.printDialog();
        
        if(ok)
        {
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Prescription.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        DBConnector dbc = new DBConnector("root", "", "nextgen", "localhost:3306");
        try {
            dbc.connect();
            Statement insert = dbc.dbcon.createStatement();
            insert.executeUpdate("delete from appointment where trackid = \""+trackID+"\"");            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PatientSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_printButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Prescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGlabel;
    private javax.swing.JPanel BGpanel;
    private javax.swing.JPanel Bottompanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dDegree;
    private javax.swing.JLabel dName;
    private javax.swing.JLabel dSpec;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel pAge;
    private javax.swing.JLabel pName;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables
}