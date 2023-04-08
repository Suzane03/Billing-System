import java.sql.*;
import Project.ConnectionProvider;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class billing extends javax.swing.JFrame {
public int finalTotal=0;
 
    public billing() {
        initComponents();
        SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel5.setText(dformat.format(date));
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        jLabel6.setText(dtf.format(now));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(60, 60));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 6, -1, 88));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing frame.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 15, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Time:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 61, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1042, 15, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1042, 61, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 1164, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Buyer Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 128, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 174, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 171, 145, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Contact No.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 174, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 171, 146, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 174, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 171, 147, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 174, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(913, 171, 194, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 1164, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Product Details");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 221, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Product ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 255, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Product Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 255, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Rate");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 255, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Quantity");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 255, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Description");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 255, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 252, 71, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 252, 118, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 252, 90, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 252, 71, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 252, 195, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 292, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 327, 1164, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 590, 180));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Calculation Details:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 355, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Total Amount");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 423, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Paid Amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 470, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Return Amount");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 520, -1, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 420, 166, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 467, 166, -1));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 517, 166, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 405, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 459, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 517, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing background.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        try
        {
              Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from buyer where name like '"+name+"%'");
             if(rs.next())
             {
                 jTextField1.setText(rs.getString(1));
                  jTextField2.setText(rs.getString(2));
                   jTextField3.setText(rs.getString(3));
                    jTextField4.setText(rs.getString(4));
             }
             else
             {
                 jTextField2.setText("");
                 jTextField3.setText("");
                 jTextField4.setText("");
             }
        }
        catch(Exception e)
        {
             e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
         String contactNo=jTextField2.getText();
        try
        {
              Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from buyer where contactNo like '"+contactNo+"%'");
             if(rs.next())
             {
                 jTextField1.setText(rs.getString(1));
                  jTextField2.setText(rs.getString(2));
                   jTextField3.setText(rs.getString(3));
                    jTextField4.setText(rs.getString(4));
             }
             else
             {
                 jTextField1.setText("");
                 jTextField3.setText("");
                 jTextField4.setText("");
             }
        }
        catch(Exception e)
        {
             e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
        }                      
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String pid=jTextField5.getText();
        try
        {
              Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from product1 where pid like '"+pid+"%'");
             if(rs.next())
             {
                 jTextField6.setText(rs.getString(2));
                  jTextField7.setText(rs.getString(3));
                   jTextField8.setText("1");
                    jTextField9.setText(rs.getString(4));
             }
             else
             {
                 jTextField6.setText("");
                 jTextField7.setText("");
                 jTextField8.setText("");
                  jTextField9.setText("");
             }
        }
        catch(Exception e)
        {
             e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
        }                      
                           
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int price=Integer.parseInt(jTextField7.getText());
         int quantity=Integer.parseInt(jTextField8.getText());
         int total=price*quantity;
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
         model.addRow(new Object[]{jTextField6.getText(),jTextField9.getText(),price,quantity,total});
         finalTotal=finalTotal+total;
         String FinalTotal=String.valueOf(finalTotal);
         jTextField10.setText(FinalTotal);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
        String paidamount=jTextField11.getText();
        int z=Integer.parseInt(paidamount);
        finalTotal=z-finalTotal;
         String FinalTotal=String.valueOf(finalTotal);
          jTextField12.setText(FinalTotal);
            jTextField12.setEditable(false);
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        String contactNo=jTextField2.getText();
        String email=jTextField3.getText();
        String address=jTextField4.getText();
        String path="D://";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try
        {
            PdfWriter.getInstance(doc,new FileOutputStream(path+""+name+""+jLabel5.getText()+".pdf"));
            doc.open();
            Paragraph para1=new Paragraph("                   BILLING MANAGEMENT SYSTEM \n  \n                       ");
            doc.add(para1);
            Paragraph para2=new Paragraph("Date and Time"+jLabel5.getText()+" "+jLabel6.getText()+"\n Buyer Details \n \n Name:"+name+"\n Contact NO:"+contactNo+"\n Email:"+email+"\nAddress:"+address+"\n\n");
            doc.add(para2);
            PdfPTable tb1=new PdfPTable(5);
            tb1.addCell("Name");
            tb1.addCell("Description");
            tb1.addCell("Rate");
            tb1.addCell("Quantity");
            tb1.addCell("Subtotal");
            for(int i=0;i<jTable1.getRowCount();i++)
            {
                String n=jTable1.getValueAt(i, 0).toString();
                  String d=jTable1.getValueAt(i, 1).toString();
                    String r=jTable1.getValueAt(i, 2).toString();
                      String q=jTable1.getValueAt(i, 3).toString();
                        String s=jTable1.getValueAt(i, 4).toString();
                        tb1.addCell(n);
                        tb1.addCell(d);
                        tb1.addCell(r);
                        tb1.addCell(q);
                        tb1.addCell(s);
                        
            }
            doc.add(tb1);
            Paragraph para3=new Paragraph("\n\n TOTAL : "+jTextField10.getText()+"\n\n PAID AMOUNT: "+jTextField11.getText()+"\n\n RETURN AMOUNT : "+jTextField12.getText()+"\n\n\n         THANK YOU FOR VISITING OUR STORE");
            doc.add(para3);
            JOptionPane.showMessageDialog(null,"BILL GENERATED");
            doc.close();
            setVisible(false);
            new billing().setVisible(true);
            
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
