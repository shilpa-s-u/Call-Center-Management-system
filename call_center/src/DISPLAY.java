
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
public class DISPLAY extends javax.swing.JFrame {
public static int d;
    /**
     * Creates new form DISPLAY
     */
    public DISPLAY() {
        initComponents();
        show_user();  
                  
    }

           public ArrayList<User4> userList() {
        ArrayList<User4> usersList=new ArrayList<>();
          try{
          Class.forName("com.mysql.jdbc.Driver");
       
          com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection)
          DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center?zeroDateTimeBehavior=convertToNull","root","");
          String query1="SELECT * FROM DISPLAY ";
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery(query1);
          User4 user;
          while(rs.next())
          {
              user=new User4(rs.getString("PROBLEMID"),rs.getString("PROBLEMTYPE"));
              usersList.add(user);
          }
        
    }
          catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
          return usersList;
    }
    public void show_user() {
        ArrayList<User4> list=userList();
        DefaultTableModel model=(DefaultTableModel) Table4.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getPid();
            row[1]=list.get(i).getPtype();
            
            model.addRow(row);
            
        }
    }
    public ArrayList<User5> userList1() {
        ArrayList<User5> usersList1=new ArrayList<>();
          try{
          Class.forName("com.mysql.jdbc.Driver");
       
          com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection)
          DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center?zeroDateTimeBehavior=convertToNull","root","");
          String query1="SELECT * FROM DISPLAY where PROBLEMID='"+d+"'";
          Statement st=con.createStatement();

          ResultSet rs=st.executeQuery(query1);
          User5 user;
          while(rs.next())
          {
              user=new User5(rs.getString("PROBLEMID"),rs.getString("PROBLEMTYPE"));
              usersList1.add(user);
          }
        
    }
          catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
          return usersList1;
    }
    public void show_user1() {
        ArrayList<User5> list=userList1();
        DefaultTableModel model=(DefaultTableModel) Table4.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getPid();
            row[1]=list.get(i).getPtype();
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        ptype = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table4 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PROBELM ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 103, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PROBLEM TYPE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 210, 125, 22);

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        jPanel1.add(pid);
        pid.setBounds(190, 130, 164, 22);

        ptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptypeActionPerformed(evt);
            }
        });
        jPanel1.add(ptype);
        ptype.setBounds(190, 210, 164, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 370, 101, 31);

        Table4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROBLEM ID", "PROBLEM TYPE"
            }
        ));
        jScrollPane1.setViewportView(Table4);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(586, 0, 464, 543);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 380, 81, 31);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(296, 30, 70, 0);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(581, 37, 0, 0);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("DISPLAY");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 10, 210, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Pictures\\2.JPG")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -60, 590, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

try{
          Class.forName("com.mysql.jdbc.Driver");
       
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center?zeroDateTimeBehavior=convertToNull","root","");
        String sql="INSERT INTO display(PROBLEMID,PROBLEMTYPE) VALUES (?,?)";
       PreparedStatement pst=conn.prepareStatement(sql);
              d=Integer.parseInt(pid.getText());
         pst.setInt(1,Integer.parseInt(pid.getText()));
          pst.setString(2,ptype.getText());
         
          pst.executeUpdate();
         
          JOptionPane.showMessageDialog(this, "INSERTED SUCCESSFULLY");
         show_user1();
          conn.close();
          
      }
       
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this, "VALUE IS NOT INSERTED");
        }       















        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


ADMIN lg3=new ADMIN();
lg3.setVisible(true);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DISPLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISPLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISPLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISPLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISPLAY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField ptype;
    // End of variables declaration//GEN-END:variables
}
