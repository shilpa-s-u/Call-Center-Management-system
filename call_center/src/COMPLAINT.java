
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class COMPLAINT extends javax.swing.JFrame {
    String STATUS,a;
    public static String abc;

    /**
     * Creates new form TEN
     */
    public COMPLAINT() {
        initComponents();
                  
    }
        public ArrayList<User6> userList() {
        ArrayList<User6> usersList=new ArrayList<>();
          try{
          Class.forName("com.mysql.jdbc.Driver");
       
          com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection)
          DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center?zeroDateTimeBehavior=convertToNull","root","");
          String query1="SELECT `PID`, `PTYPE`, `PDATE`, `STATUS` FROM COMPLAINT where CID='"+abc+"'";
          
           
        Statement st=con.createStatement();
          ResultSet rs=st.executeQuery(query1);
          
          User6 user;
          while(rs.next())
          {
              user=new User6(rs.getString("PID"),rs.getString("PTYPE"),rs.getString("PDATE"),rs.getString("STATUS"));
              usersList.add(user);
          }
        
    }
          catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
          return usersList;
    }
    public void show_user() {
        ArrayList<User6> list=userList();
        DefaultTableModel model=(DefaultTableModel) Table3.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getPid();
            row[1]=list.get(i).getPtype();
            row[2]=list.get(i).getPdate();
            row[3]=list.get(i).getStatus();
            
            model.addRow(row);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pdate = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        PENDING = new javax.swing.JRadioButton();
        PROCEDED = new javax.swing.JRadioButton();
        ptype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setText("COMPLAINT FORM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 10, 250, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PROBLEM ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("PROBLEM TYPE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 170, 140, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PROBLEM DATE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 230, 140, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 400, 97, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 400, 85, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("BACK ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 451, 110, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(520, 440, 71, 31);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("STATUS");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 300, 160, 22);
        jPanel1.add(pdate);
        pdate.setBounds(210, 230, 150, 30);
        jPanel1.add(pid);
        pid.setBounds(210, 100, 150, 30);

        buttonGroup1.add(PENDING);
        PENDING.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PENDING.setText("PENDING");
        jPanel1.add(PENDING);
        PENDING.setBounds(220, 300, 100, 30);

        buttonGroup1.add(PROCEDED);
        PROCEDED.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PROCEDED.setText("PROCEDED");
        PROCEDED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROCEDEDActionPerformed(evt);
            }
        });
        jPanel1.add(PROCEDED);
        PROCEDED.setBounds(370, 300, 120, 30);
        jPanel1.add(ptype);
        ptype.setBounds(210, 170, 150, 30);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 70, 0, 0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\3D Objects\\pp\\0.JPG")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 560);

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 330, 41, 16);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(460, 100, 41, 16);

        Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROBLEM ID", "PROBLEM TYPE", "PROBLEM DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       pid.setText("");
       ptype.setText("");
       pdate.setText("");
      



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
PROBELMDISPLAY lg3=new PROBELMDISPLAY();
lg3.setVisible(true);
this.setVisible(false);




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PROCEDEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROCEDEDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROCEDEDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
          try{
          Class.forName("com.mysql.jdbc.Driver");
          
       a=(pid.getText());
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center?zeroDateTimeBehavior=convertToNull","root","");
          String sql="insert into COMPLAINT  values('"+abc+"','"+a+"',?,?,?)";
       PreparedStatement pst=conn.prepareStatement(sql);
          
          
          pst.setString(1,ptype.getText());
         
          pst.setString(2,pdate.getText());
          if(PROCEDED.isSelected())
          {
              STATUS="PENDING";
              
          }
          if(PENDING.isSelected())
          {
              STATUS="PENDING";
              
          }
          pst.setString(3,STATUS);
            
          
          pst.executeUpdate();
         
         
          JOptionPane.showMessageDialog(this, "SUBMITTED SUCCESSFULLY");
         show_user();
          conn.close();
          
      }
       
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this, "VALUE IS NOT INSERTED");
        }       

    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
      abc=args[0];
        
        
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
            java.util.logging.Logger.getLogger(COMPLAINT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COMPLAINT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COMPLAINT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COMPLAINT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMPLAINT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PENDING;
    private javax.swing.JRadioButton PROCEDED;
    private javax.swing.JTable Table3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pdate;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField ptype;
    // End of variables declaration//GEN-END:variables
}
