
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class LAST extends javax.swing.JFrame {
    public static String abc,STATUS1;
    

    /**
     * Creates new form LAST
     */
    public LAST() {
        initComponents();
    show_user2();
    }
        public ArrayList<User2> userList() {
        ArrayList<User2> usersList=new ArrayList<>();
          try{
          Class.forName("com.mysql.jdbc.Driver");
       
          com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection)
          DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center?zeroDateTimeBehavior=convertToNull","root","");
          String query1="SELECT `PID`, `PTYPE`, `PDATE`, `STATUS` FROM COMPLAINT where CID='"+abc+"'";
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery(query1);
          User2 user;
          while(rs.next())
          {
              user=new User2(rs.getString("PID"),rs.getString("PTYPE"),rs.getString("PDATE"),rs.getString("STATUS"));
              usersList.add(user);
          }
        
    }
          catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
          return usersList;
    }
    public void show_user2() {
        ArrayList<User2> list=userList();
        DefaultTableModel model=(DefaultTableModel) Table2.getModel();
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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        ptype = new javax.swing.JTextField();
        pdate = new javax.swing.JTextField();
        PROCEDED = new javax.swing.JRadioButton();
        PENDING = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 410, 105, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 450, 81, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(310, 450, 90, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PROBLEM ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 90, 130, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PROBLEM TYPE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 150, 150, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PROBLEM DATE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 230, 150, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("STATUS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 290, 120, 30);
        jPanel1.add(pid);
        pid.setBounds(240, 90, 150, 30);
        jPanel1.add(ptype);
        ptype.setBounds(240, 160, 150, 40);
        jPanel1.add(pdate);
        pdate.setBounds(240, 230, 150, 30);

        buttonGroup1.add(PROCEDED);
        PROCEDED.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PROCEDED.setText("PROCEDED");
        jPanel1.add(PROCEDED);
        PROCEDED.setBounds(240, 280, 160, 31);

        buttonGroup1.add(PENDING);
        PENDING.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PENDING.setText("PENDING");
        jPanel1.add(PENDING);
        PENDING.setBounds(240, 330, 130, 31);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Pictures\\S (2).JPG")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 690, 490);

        Table2.setModel(new javax.swing.table.DefaultTableModel(
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
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

  System.exit(0);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     SOLVECOMPLAINT lg10=new SOLVECOMPLAINT();
lg10.setVisible(true);
this.setVisible(false);



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try
       {
           Class.forName("com.mysql.jdbc.Driver");
          
       
          Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center?zeroDateTimeBehavior=convertToNull","root","");
       
       
          String sql="update complaint set STATUS=?,PTYPE=?,PDATE=? where  PID=? ";
          PreparedStatement pst=conn.prepareStatement(sql);
       

           if(PROCEDED.isSelected())
          {
              STATUS1="PROCEDED";
              
          }
          if(PENDING.isSelected())
          {
              STATUS1="PENDING";
              
          }
          pst.setString(1,STATUS1);
         pst.setString(2,ptype.getText());
         pst.setString(3,pdate.getText());
         
          pst.setString(4,pid.getText());
          
          
             
             pst.executeUpdate();
      
          
          JOptionPane.showMessageDialog(this, " UPDATED SUCCESSFULLY");
     
       show_user2();
          conn.close();
          
      }
        catch(Exception cnf)
           {
           JOptionPane.showMessageDialog(this, "NOT UPDATED ");
       

        }         // TODO add your handling code here:





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked

        int i=Table2.getSelectedRow();
     TableModel model=Table2.getModel();
     pid.setText(model.getValueAt(i,0).toString());
        ptype.setText(model.getValueAt(i,1).toString());
           pdate.setText(model.getValueAt(i,2).toString());
           String STATUS=model.getValueAt(i,3).toString();
           if(STATUS.equals("PROCEDED"))
           {
               PROCEDED.setSelected(true);
           }
         else
           {
               PENDING.setSelected(true);
           }
           
     
// TODO add your handling code here:
    }//GEN-LAST:event_Table2MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LAST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LAST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LAST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LAST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LAST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PENDING;
    private javax.swing.JRadioButton PROCEDED;
    private javax.swing.JTable Table2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pdate;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField ptype;
    // End of variables declaration//GEN-END:variables
}
