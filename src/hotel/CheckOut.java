/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.googlecode.javacv.CanvasFrame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class CheckOut extends javax.swing.JFrame {

    /**
     * Creates new form home_page
     */
    public CheckOut() throws SQLException, ClassNotFoundException {
        this.setTitle("Check Out Page");
        initComponents();
        currentDate();
        statusCheck_prime();
    }

   public void currentDate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        checkoutDate.setText(year+"-"+month+"-"+day);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Contact = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        Nationality = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        passno = new javax.swing.JLabel();
        passportno = new javax.swing.JTextField();
        national = new javax.swing.JLabel();
        nationalid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        bookingdate = new javax.swing.JTextField();
        bookingtime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        updateDB = new javax.swing.JButton();
        checkContact = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        checkoutDate = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        marital = new javax.swing.JTextField();
        religion = new javax.swing.JTextField();
        purpose = new javax.swing.JTextField();
        roomComboBox = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        fathername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        membersInARoom = new javax.swing.JList<>();
        checkInPage = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(56, 56, 56));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Hotel Bukshi LTD.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(613, 613, 613))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Name.setText("Name");

        Contact.setText("Contact");

        Address.setText("Address");

        Nationality.setText("Nationality");

        passno.setText("Passport No.");

        national.setText("National ID ");

        jLabel1.setText("Occupation");

        bookingdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingdateActionPerformed(evt);
            }
        });

        bookingtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingtimeActionPerformed(evt);
            }
        });

        jLabel2.setText("Age (Number)");

        jLabel3.setText("Marital Status");

        jLabel4.setText("Religion");

        jLabel5.setText("Purpose");

        jLabel6.setText("Booking Date");

        jLabel7.setText("Booking Time");

        jLabel9.setText("Room Number (Number)");

        clear.setText("All Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        updateDB.setText("Checkout");
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

        jLabel12.setText("Check Out Date");

        back.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel14.setText("Father/Husband Name");

        membersInARoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                membersInARoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(membersInARoom);

        checkInPage.setText("Check In ");
        checkInPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(purpose, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(religion)
                            .addComponent(marital)
                            .addComponent(age)
                            .addComponent(bookingtime, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkInPage))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Contact)
                                    .addComponent(Address)
                                    .addComponent(passno)
                                    .addComponent(national)
                                    .addComponent(jLabel1)
                                    .addComponent(Nationality)
                                    .addComponent(jLabel14)
                                    .addComponent(Name)
                                    .addComponent(jLabel9))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkContact))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(occupation)
                                            .addComponent(nationalid)
                                            .addComponent(passportno)
                                            .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(bookingdate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkoutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkContact)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(marital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Name)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Contact)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(bookingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(bookingtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkoutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nationality))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passportno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(national)
                            .addComponent(nationalid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkInPage)
                            .addComponent(clear)
                            .addComponent(updateDB)
                            .addComponent(back))
                        .addGap(47, 47, 47))))
        );

        jPanel1.setBackground(new java.awt.Color(56, 56, 56));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkInPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInPageActionPerformed
        try {
            new admin_choice().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(selectionPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(selectionPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_checkInPageActionPerformed

    private void membersInARoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membersInARoomMouseClicked
        Statement st = null;
        String roomnumber1;
        roomnumber1 =(String) roomComboBox.getSelectedItem();
        String name1 = membersInARoom.getSelectedValue();

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
            Class.forName("org.sqlite.JDBC");
            String ins="SELECT * FROM customer\n" +
            "WHERE \"Name\" = '"+name1+"' AND \"Roomnumber\"='"+roomnumber1+"';";
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(ins);
            while(rs.next()){
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
                fathername.setText(rs.getString("fathername"));
                String photoname = rs.getString("ImageInfo");
                ImageIcon imageicon = new ImageIcon(new ImageIcon("Image//"+photoname+".jpg").getImage().getScaledInstance(373, 423, java.awt.Image.SCALE_DEFAULT));
                jLabel15.setIcon(imageicon);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_membersInARoomMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new selectionPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void checkContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkContactActionPerformed
        String roomnumber1;
        roomnumber1 =(String) roomComboBox.getSelectedItem();
        PreparedStatement ps=null;
        PreparedStatement ps1=null;
        Statement st = null;
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
            Class.forName("org.sqlite.JDBC");
            String ins1="SELECT name FROM RoomAvailable\n" +
            "WHERE \"Roomnumber\" = "+roomnumber1+";";
            ps1 = connection.prepareStatement(ins1);
            ResultSet rs1 = ps1.executeQuery();

            /*ins="SELECT DISTINCT name FROM customer\n" +
            "WHERE \"name\" = '"+data1+"' AND \"Roomnumber\" = "+roomnumber1+";";
            ps = connection.prepareStatement(ins);
            //st.executeQuery(ins);
            ResultSet rs = ps.executeQuery();*/
            DefaultListModel listModel1 = new DefaultListModel();
            while(rs1.next()){
                String data= rs1.getString("name");
                listModel1.addElement(data);
                //System.out.println(data);
            }
            membersInARoom.setModel(listModel1);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkContactActionPerformed

    private void updateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDBActionPerformed
        Statement st = null;
        PreparedStatement preparedStmt=null;
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
            String roomnumber1 =(String) roomComboBox.getSelectedItem();

            st=connection.createStatement();
            String checkoutdate = checkoutDate.getText();
            String contact1= contact.getText();
            String ins="UPDATE customer SET \"CheckoutDate\"='"+checkoutdate+"'\n" +"WHERE \"RoomNumber\"='"+roomnumber1+"'";
            //st.executeQuery(ins);
            String mins = "DELETE FROM \"RoomAvailable\"\n" +
            "WHERE \"RoomNumber\"='"+roomnumber1+"';";
            String roomUpdate = "UPDATE \"Room\"\n" +
            "SET \"Status\"='0'\n" +
            "WHERE \"RoomNumber\"='"+roomnumber1+"';";
            st.executeUpdate(ins);
            st.executeUpdate(mins);
            st.executeUpdate(roomUpdate);

            roomComboBox.removeAllItems();
            statusCheck_prime();
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
            clearActionPerformed(evt);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error Inserting in Database");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_updateDBActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        name.setText("");
        address.setText("");
        contact.setText("");
        passportno.setText("");
        nationalid.setText("");
        nationality.setText("");
        age.setText("");
        bookingdate.setText("");
        bookingtime.setText("");
        marital.setText("");
        religion.setText("");
        purpose.setText("");
        occupation.setText("");
        fathername.setText("");
        try {
            roomComboBox.removeAllItems();
            statusCheck_prime();
        } catch (SQLException ex) {
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        currentDate();
        membersInARoom.setListData(new String[0]);
    }//GEN-LAST:event_clearActionPerformed

    private void bookingtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingtimeActionPerformed

    private void bookingdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingdateActionPerformed
        public void statusCheck_prime() throws SQLException, ClassNotFoundException{
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
            Statement st = null;
            st=connection.createStatement();
            String ins = "SELECT * FROM Room\n"+
                    "WHERE \"Status\"= '1'"
                    + "order by roomnumber asc;";
            ResultSet rs = st.executeQuery(ins);
            while(rs.next()){
                roomComboBox.addItem(rs.getString("RoomNumber"));
            }
        }
    }
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CheckOut().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Nationality;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JTextField bookingdate;
    private javax.swing.JTextField bookingtime;
    private javax.swing.JButton checkContact;
    private javax.swing.JButton checkInPage;
    private javax.swing.JTextField checkoutDate;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField fathername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marital;
    private javax.swing.JList<String> membersInARoom;
    private javax.swing.JTextField name;
    private javax.swing.JLabel national;
    private javax.swing.JTextField nationalid;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField occupation;
    private javax.swing.JLabel passno;
    private javax.swing.JTextField passportno;
    private javax.swing.JTextField purpose;
    private javax.swing.JTextField religion;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JButton updateDB;
    // End of variables declaration//GEN-END:variables
}
