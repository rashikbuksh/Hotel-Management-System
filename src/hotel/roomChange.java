/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class roomChange extends javax.swing.JFrame {

    /**
     * Creates new form home_page
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public roomChange() throws ClassNotFoundException, SQLException {
        this.setTitle("Room Change Page");
        initComponents();
        statuscheckfor1();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Name1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Contact = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        updateDB = new javax.swing.JButton();
        checkContact = new javax.swing.JButton();
        roomComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        roomnumber = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(56, 56, 56));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        Name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("Change Room Number");

        back.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(124, 206, 150));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(85, 85, 85));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/Image/hotelImage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 102));

        Name.setText("Name");

        name.setEditable(false);

        Contact.setText("Contact");

        contact.setEditable(false);
        contact.setPreferredSize(new java.awt.Dimension(28, 20));

        jLabel9.setText("Room Number (Previous)");

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        updateDB.setText("Update");
        updateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDBActionPerformed(evt);
            }
        });

        checkContact.setText("Check");
        checkContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkContactActionPerformed(evt);
            }
        });

        roomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("New Room");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(updateDB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(clear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contact))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(roomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(checkContact))
                            .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkContact, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateDB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        name.setText("");
        contact.setText("");
        roomnumber.removeAllItems();
        roomComboBox.removeAllItems();
        try {
            statusCheck();
            statuscheckfor1();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(roomChange.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearActionPerformed
public void statusCheck() throws SQLException, ClassNotFoundException{
         
        try (Connection connection = dbConnection.getConnection()) {

            Statement st=connection.createStatement();
            String ins = "SELECT * FROM Room\n"+
                    "WHERE \"Status\"= '0'"
                    + "order by roomnumber asc;";
            ResultSet rs = st.executeQuery(ins);
            while(rs.next()){
                roomComboBox.addItem(rs.getString("RoomNumber"));
            }
        }
    }
public void statuscheckfor1() throws ClassNotFoundException, SQLException{
     
        try (Connection connection = dbConnection.getConnection()) {

            Statement st=connection.createStatement();
            String ins = "SELECT * FROM Room\n"+
                    "WHERE \"Status\"= '1'"
                    + "order by roomnumber asc;";
            ResultSet rs = st.executeQuery(ins);
            while(rs.next()){
                roomnumber.addItem(rs.getString("RoomNumber"));
            }
        }
}
    private void checkContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkContactActionPerformed
        String room =roomnumber.getSelectedItem().toString();
        try (Connection connection = dbConnection.getConnection()) {
            Statement st=connection.createStatement();
            String ins="SELECT * FROM RoomAvailable";
            ResultSet rs=st.executeQuery(ins);
            DefaultListModel listModel1 = new DefaultListModel();
            if(rs!=null){
                
                /*if(rs.getString("contact").equals(contact1)){
                        name.setText(rs.getString("name"));
                        address.setText(rs.getString("address"));
                        contact.setText(rs.getString("contact"));
                        passportno.setText(rs.getString("passportno"));
                        nationalid.setText(rs.getString("nationalid"));
                        nationality.setText(rs.getString("nationality"));
                        age.setText(rs.getString("age"));
                        bookingdate.setText(rs.getString("bookingdate"));
                        bookingtime.setText(rs.getString("bookingtime"));
                        marital.setText(rs.getString("marital"));
                        religion.setText(rs.getString("religion"));
                        purpose.setText(rs.getString("purpose"));
                        occupation.setText(rs.getString("occupation"));
                        roomnumber.setText(rs.getString("roomnumber"));
                        /*opencv_core.IplImage image = cvLoadImage("D:\\EDU\\Programming\\Java Database Project\\Hotel Management(postgresql)\\Image\\"+rs.getString("ImageInfo")+".jpg");
                        System.out.println(rs.getString("ImageInfo"));
                        final CanvasFrame canvas = new CanvasFrame(rs.getString("Name"));
                        canvas.showImage(image);
                        JOptionPane.showMessageDialog(this, "Information Found in Application");
                    }*/
                while(rs.next()){
                    if(rs.getString("RoomNumber").equals(room)){
                        String data= rs.getString("Name");
                        listModel1.addElement(data);
                        /*opencv_core.IplImage image = cvLoadImage("D:\\EDU\\Programming\\Java Database Project\\Hotel Management(postgresql)\\Image\\"+rs.getString("ImageInfo")+".jpg");
                        System.out.println(rs.getString("ImageInfo"));
                        final CanvasFrame canvas = new CanvasFrame(rs.getString("Name"));
                        canvas.showImage(image);*/
                        
                    }
                }
                JOptionPane.showMessageDialog(this, "Information Found in Application");
                jList1.setModel(listModel1);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error Finding Data in Database");
            }
            
            //st.executeQuery(ins);
            //preparedStmt = connection.prepareStatement(ins);
            /*preparedStmt.setString (1, name1);
            preparedStmt.setString (2, contact1);
            preparedStmt.setString (3, address1);
            preparedStmt.setString (4, nationality1);
            preparedStmt.setString (5, passportno1);
            preparedStmt.setString (6, nationalid1);
            preparedStmt.setString (7, occupation1);
            preparedStmt.setString (8, age1);
            preparedStmt.setString (9, marital1);
            preparedStmt.setString (10, religion1);
            preparedStmt.setString (11, purpose1);
            preparedStmt.setString (12, bookingdate1);
            preparedStmt.setString (13, bookingtime1);
            preparedStmt.setString (14, roomnumber1);
            preparedStmt.execute();
            */
            //ResultSet resultSet = preparedStmt.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Finding Data in Database");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(roomChange.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            statusCheck();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(roomChange.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkContactActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new selectionPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void updateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDBActionPerformed
        try (Connection connection = dbConnection.getConnection()) {
            Statement st=connection.createStatement();
            String contact1 = contact.getText();
            String roomnumber1 = roomComboBox.getSelectedItem().toString();
            String roomnumber2 = roomnumber.getSelectedItem().toString();
            String ins="UPDATE customer SET  \"RoomNumber\"="+roomnumber1+" WHERE \"RoomNumber\"='"+roomnumber2+"';";
            //st.executeQuery(ins);
            st.executeUpdate(ins);
            
            String ins3="UPDATE RoomAvailable SET  \"RoomNumber\"="+roomnumber1+" WHERE \"RoomNumber\"='"+roomnumber2+"';";
            st.executeUpdate(ins3);
            
            
            
            String ins1="UPDATE Room SET Status='0' where RoomNumber="+roomnumber2+";";
            st.executeUpdate(ins1);
            String ins2="UPDATE Room SET Status='1' where RoomNumber="+roomnumber1+";";
            st.executeUpdate(ins2);
            //preparedStmt = connection.prepareStatement(ins);
            /*preparedStmt.setString (1, name1);
            preparedStmt.setString (2, contact1);
            preparedStmt.setString (3, address1);
            preparedStmt.setString (4, nationality1);
            preparedStmt.setString (5, passportno1);
            preparedStmt.setString (6, nationalid1);
            preparedStmt.setString (7, occupation1);
            preparedStmt.setString (8, age1);
            preparedStmt.setString (9, marital1);
            preparedStmt.setString (10, religion1);
            preparedStmt.setString (11, purpose1);
            preparedStmt.setString (12, bookingdate1);
            preparedStmt.setString (13, bookingtime1);
            preparedStmt.setString (14, roomnumber1);
            preparedStmt.execute();
            */
            //ResultSet resultSet = preparedStmt.executeQuery();
            JOptionPane.showMessageDialog(this, "Information Added to Database");
            roomComboBox.removeAllItems();
            roomnumber.removeAllItems();
            statusCheck();
            statuscheckfor1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Inserting in Database");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(roomChange.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_updateDBActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String roomnumber1;
                roomnumber1 =(String) roomnumber.getSelectedItem();
                String name1 = jList1.getSelectedValue();
                //System.out.println(name1);
        
        try (Connection connection = dbConnection.getConnection()) {
             
            String ins="SELECT * FROM RoomAvailable\n" +
            "WHERE \"Name\" = '"+name1+"' AND \"RoomNumber\"='"+roomnumber1+"';";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(ins);
            while(rs.next()){
            name.setText(rs.getString("name"));
            contact.setText(rs.getString("contact"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void roomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(roomChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
   
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new roomChange().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(roomChange.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JButton back;
    private javax.swing.JButton checkContact;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JComboBox<String> roomnumber;
    private javax.swing.JButton updateDB;
    // End of variables declaration//GEN-END:variables
}
