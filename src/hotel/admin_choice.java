/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.github.sarxos.webcam.Webcam;
import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.OpenCVFrameGrabber;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage;
import com.sun.glass.events.KeyEvent;
import java.util.*;
import javax.swing.DefaultListModel;
import com.googlecode.javacv.cpp.opencv_core;
import com.googlecode.javacv.cpp.opencv_highgui;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class admin_choice extends javax.swing.JFrame {
    int i=1;
    Webcam webcam;
    int web1=0;
    /**
     * Creates new form home_page
     */
    public admin_choice() throws SQLException, ClassNotFoundException {
        this.setTitle("Check In Page");
        initComponents();
        currentDate();
        statusCheck();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lebl = new javax.swing.JLabel();
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
        Occupation = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        bookingdate = new javax.swing.JTextField();
        bookingtime = new javax.swing.JTextField();
        AGE = new javax.swing.JLabel();
        MaritalStatus = new javax.swing.JLabel();
        Religion = new javax.swing.JLabel();
        Purpose = new javax.swing.JLabel();
        BookingDate = new javax.swing.JLabel();
        BookingTime = new javax.swing.JLabel();
        RoomNumber = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        checkIn = new javax.swing.JButton();
        checkContact = new javax.swing.JButton();
        occupation = new javax.swing.JComboBox<>();
        purpose = new javax.swing.JComboBox<>();
        religion = new javax.swing.JComboBox<>();
        marital = new javax.swing.JComboBox<>();
        openCamera = new javax.swing.JButton();
        takePicture = new javax.swing.JButton();
        ImageInfo = new javax.swing.JLabel();
        imageInfo = new javax.swing.JTextField();
        Members = new javax.swing.JLabel();
        member = new javax.swing.JComboBox<>();
        roomComboBox = new javax.swing.JComboBox<>();
        clearComp = new javax.swing.JButton();
        Note = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        FatherName = new javax.swing.JLabel();
        fathername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        existingMember = new javax.swing.JList<>();
        CheckoutPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(56, 56, 56));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lebl, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lebl, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(124, 206, 150));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(85, 85, 85));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Hotel Bukshi LTD.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Name.setText("Name");

        Contact.setText("Contact");

        Address.setText("Address");

        Nationality.setText("Nationality");

        nationality.setText("Bangladeshi");

        passno.setText("Passport No.");

        national.setText("National ID");

        Occupation.setText("Occupation");

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

        AGE.setText("Age (Number)");

        MaritalStatus.setText("Marital Status");

        Religion.setText("Religion");

        Purpose.setText("Purpose");

        BookingDate.setText("Booking Date");

        BookingTime.setText("Booking Time");

        RoomNumber.setText("Room Number");

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        checkIn.setText("Check-in");
        checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInActionPerformed(evt);
            }
        });

        checkContact.setText("Check");
        checkContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkContactActionPerformed(evt);
            }
        });

        occupation.setMaximumRowCount(6);
        occupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Occupation...", "Teacher", "Student ", "Player", "Farmer", "Living abroad", "Govt ser", "Private serv", "Bussiness", "Lawer", "Student", "Housewife", "Player ", "Other" }));
        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });

        purpose.setMaximumRowCount(4);
        purpose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Purpose...", "Business", "Treatment", "Official", "Exam", "Tour" }));

        religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muslim", "Hindu", "Christian", "Buddha", "Other" }));

        marital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Marital Status...", "Married", "Unmarried" }));

        openCamera.setText("Open Camera");
        openCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCameraActionPerformed(evt);
            }
        });
        openCamera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                openCameraKeyPressed(evt);
            }
        });

        takePicture.setText("Take Picture");
        takePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takePictureActionPerformed(evt);
            }
        });

        ImageInfo.setText("Image Info");

        Members.setText("Members");

        member.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        roomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomComboBoxActionPerformed(evt);
            }
        });

        clearComp.setText("Clear");
        clearComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCompActionPerformed(evt);
            }
        });

        Note.setText("*Note: First Name Then Take Picture Then Check-in");

        back.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        FatherName.setText("Father/Husband Name");

        fathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathernameActionPerformed(evt);
            }
        });

        existingMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                existingMemberMouseClicked(evt);
            }
        });
        existingMember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                existingMemberKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(existingMember);

        CheckoutPage.setText("Checkout");
        CheckoutPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nationality)
                            .addComponent(passno)
                            .addComponent(Address)
                            .addComponent(Contact)
                            .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name)
                            .addComponent(Members)
                            .addComponent(national))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BookingTime)
                                .addComponent(checkIn)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Occupation)
                                    .addComponent(BookingDate)))
                            .addComponent(back))
                        .addGap(87, 87, 87)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(checkContact)
                        .addGap(134, 134, 134)
                        .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clearComp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(clear))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(CheckoutPage))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(address)
                                            .addComponent(nationality)
                                            .addComponent(passportno)
                                            .addComponent(nationalid)
                                            .addComponent(occupation, 0, 178, Short.MAX_VALUE)
                                            .addComponent(bookingdate)
                                            .addComponent(bookingtime)))))
                            .addComponent(Note, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(openCamera)
                                    .addComponent(ImageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RoomNumber)
                                    .addComponent(Purpose)
                                    .addComponent(Religion)
                                    .addComponent(MaritalStatus)
                                    .addComponent(AGE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(takePicture)
                                    .addComponent(marital, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(purpose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clearComp)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AGE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaritalStatus)
                            .addComponent(marital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Religion)
                            .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Purpose)
                            .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoomNumber)
                            .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openCamera)
                            .addComponent(takePicture)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckoutPage)
                            .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Members))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FatherName)
                            .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkContact)
                            .addComponent(Contact))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nationality))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passportno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(national))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImageInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Occupation))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookingDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookingTime))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkIn)
                            .addComponent(clear))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back)
                            .addComponent(Note))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void currentDate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        bookingdate.setText(year+"-"+month+"-"+day);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        bookingtime.setText(hour+":"+min+":"+sec);
    }
    public void clean(){
        name.setText("");
        passportno.setText("");
contact.setText("na");
        nationalid.setText("");
        nationality.setText("Bangladeshi");
        age.setText("");
        religion.setSelectedItem("Muslim");
        fathername.setText("");
    }
    private void checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInActionPerformed
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {

            int member1= member.getSelectedIndex()+1;
            String name1 = name.getText();
            String address1 = address.getText();
            String contact1 = contact.getText();
            String passportno1 = passportno.getText();
            String nationalid1 = nationalid.getText();
            String nationality1 = nationality.getText();
            String age1 = age.getText();
            String bookingdate1 = bookingdate.getText();
            String bookingtime1 = bookingtime.getText();
            String marital1 = marital.getSelectedItem().toString();
            String occupation1 = occupation.getSelectedItem().toString();
            String purpose1 = purpose.getSelectedItem().toString();
            String religion1 = religion.getSelectedItem().toString();
            String roomnumber1 = roomComboBox.getSelectedItem().toString();
            String fathername1 = fathername.getText();
            
            Statement st = null;
            ResultSet rs = null;
            st=connection.createStatement();
            String imagename;
            imagename = imageInfo.getText();
            String ins="INSERT INTO customer\n" +
"VALUES ('"+name1+"', '"+contact1+"', '"+address1+"', '"+nationality1+"', '"+passportno1+"', '"+occupation1+"', "+age1+", '"+marital1+"', '"+religion1+"', '"+purpose1+"', '"+bookingdate1+"', '"+bookingtime1+"', "+roomnumber1+", '"+nationalid1+"', 'null','"+imagename+"','"+fathername1+"');";
            st.executeUpdate(ins); 
            
            String upd="UPDATE Room SET Status=1 WHERE RoomNumber="+roomnumber1+"";
            st.executeUpdate(upd);
            
            String mins = "INSERT INTO RoomAvailable\n" +
"VALUES ("+roomnumber1+","+member1+" ,'"+contact1+"' ,'"+bookingdate1+"','"+name1+"');";
            st.executeUpdate(mins);
            
            
            if(member1>1){
               clean();
            }
            if(i==member1){
                    st =connection.createStatement();
                    String roomUpdate = "UPDATE \"Room\"\n" +
                    "SET \"Status\"='1'\n" +
                    "WHERE \"RoomNumber\"='"+roomnumber1+"';";
                    st.executeUpdate(roomUpdate);
                    JOptionPane.showMessageDialog(this, "Members Added");
                    
                    roomComboBox.removeAllItems();
                    clearActionPerformed(evt);
                    i=1;
                }
            else{
                i++;
            }
                
            if(web1==1){
                webcam.close();
            }
            JOptionPane.showMessageDialog(this, "Thanks For Reservation");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Inserting in Database");
            ex.printStackTrace();
        }      
    }//GEN-LAST:event_checkInActionPerformed
    public void statusCheck() throws SQLException, ClassNotFoundException{
        Class.forName("org.sqlite.JDBC"); 
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {

            Statement st = null;
            st=connection.createStatement();
            String ins = "SELECT * FROM Room\n"+
                    "WHERE \"Status\"= '0'"
                    + "order by roomnumber asc;";
            ResultSet rs = st.executeQuery(ins);
            while(rs.next()){
                roomComboBox.addItem(rs.getString("RoomNumber"));
            }
        }
    }
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        name.setText("");
        address.setText("");
        contact.setText("");
        passportno.setText("");
        nationalid.setText("");
        nationality.setText("Bangladeshi");
        age.setText("");
        bookingdate.setText("");
        bookingtime.setText("");
        marital.setSelectedItem("Select Marital Status...");
        religion.setSelectedItem("Muslim");
        purpose.setSelectedItem("Select Purpose...");
        occupation.setSelectedItem("Select Occupation...");
        fathername.setText("");
        try {
            roomComboBox.removeAllItems();
            statusCheck();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
        currentDate();
        imageInfo.setText("");
        existingMember.setListData(new String[0]);
        i=1;
    }//GEN-LAST:event_clearActionPerformed

    private void bookingtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingtimeActionPerformed

    private void bookingdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingdateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if(web1==1){
            webcam.close();
        }
        new selectionPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed
    public void openCam(){
        webcam = Webcam.getDefault();
        //webcam.setViewSize(new Dimension(176,144));
        webcam.open();
        boolean exit;
        Thread web = null;
        web = new Thread(){
            boolean ex= false;
            public void run(){
                while(!ex){
                Image image = webcam.getImage();
                lebl.setIcon(new ImageIcon(image));
                }
            }
        };
        web1=1;
        web.start();
        
    }
    private void openCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCameraActionPerformed

        
        /*
        Thread webcam;
        webcam = new Thread(){
            @Override
            public void run(){
                opencv_highgui.CvCapture capture = opencv_highgui.cvCreateCameraCapture(0);
                opencv_highgui.cvSetCaptureProperty(capture, opencv_highgui.CV_CAP_PROP_FRAME_HEIGHT, 400);
                opencv_highgui.cvSetCaptureProperty(capture, opencv_highgui.CV_CAP_PROP_FRAME_WIDTH, 400);
                
                opencv_core.IplImage grabbedImage= opencv_highgui.cvQueryFrame(capture);
                CanvasFrame frame = new CanvasFrame("Webcam");
                while(frame.isVisible() && (grabbedImage= opencv_highgui.cvQueryFrame(capture))!=null){
                    frame.showImage(grabbedImage);
                }
            }
        };
        webcam.start();
*/
       openCam();
    }//GEN-LAST:event_openCameraActionPerformed

    private void takePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takePictureActionPerformed
            Statement st = null;
            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
                    Class.forName("org.sqlite.JDBC"); 
                   
                    String name_image;
                    BufferedImage img=webcam.getImage();
                    if(img!=null){
                    st=connection.createStatement();
                    name_image=name.getText()+bookingdate.getText();
                    imageInfo.setText(name_image);
                    File output = new File("Image//"+name_image+".jpg");
                    ImageIO.write(img, "JPG", output);
                    
                    /*String ins ="UPDATE customer\n"+
	"SET \"ImageInfo\"='"+imageInfo.getText()+"'\n"+
	"WHERE \"Contact\"='"+contact.getText()+"';";
                    st.executeUpdate(ins);*/
                    JOptionPane.showMessageDialog(this, "Image Captured");
                    }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error! Image not Captured");
            }
            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
                Class.forName("org.sqlite.JDBC"); 
            int member1 = member.getSelectedIndex()+1;
            /*if(member1>1){
               clean();
            }*/
            //String roomnumber1 = roomComboBox.getSelectedItem().toString();
            //System.out.println(roomnumber1);
            /*if(i==member1){
                    st =connection.createStatement();
                    String roomUpdate = "UPDATE \"Room\"\n" +
                    "SET \"Status\"='1'\n" +
                    "WHERE \"RoomNumber\"='"+roomnumber1+"';";
                    st.executeUpdate(roomUpdate);
                    JOptionPane.showMessageDialog(this, "Members Added");
                    
                    roomComboBox.removeAllItems();
                    clearActionPerformed(evt);
                }
                i++;
                */
                if(web1==1){
                    webcam.close();
                }
            } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_takePictureActionPerformed

    private void openCameraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_openCameraKeyPressed
       /* if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
                    
            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
                    Class.forName("org.sqlite.JDBC"); 
                    Statement st = null;
                    grabber.start();
                    String name_image;
                    opencv_core.IplImage img=grabber.grab();
                    if(img!=null){
                    st=connection.createStatement();
                    name_image=contact.getText();
                    imageInfo.setText(name_image);
                    cvSaveImage("Image\\"+imageInfo.getText()+".jpg",img);
                    
                    String ins ="UPDATE customer\n"+
	"SET \"ImageInfo\"='"+imageInfo.getText()+"'\n"+
	"WHERE \"Contact\"="+contact.getText()+";";
                    st.executeUpdate(ins);
                    }
            }catch(Exception e){
                e.printStackTrace();
            }
       }*/
    }//GEN-LAST:event_openCameraKeyPressed

    private void existingMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_existingMemberMouseClicked
        
        Statement st = null;
        String name1 = existingMember.getSelectedValue();
        String contact1 = contact.getText();
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
            Class.forName("org.sqlite.JDBC"); 
            String ins="SELECT * FROM customer\n" +
            "WHERE \"Name\" = '"+name1+"' AND \"Contact\"='"+contact1+"';";
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(ins);
            while(rs.next()){
                name.setText(rs.getString("name"));
                address.setText(rs.getString("address"));
                passportno.setText(rs.getString("passportno"));
                nationalid.setText(rs.getString("nationalid"));
                nationality.setText(rs.getString("nationality"));
                age.setText(rs.getString("age"));
                //bookingdate.setText(rs.getString("bookingdate"));
                //bookingtime.setText(rs.getString("bookingtime"));
                marital.setSelectedItem(rs.getString("marital"));
                religion.setSelectedItem(rs.getString("religion"));
                purpose.setSelectedItem(rs.getString("purpose"));
                occupation.setSelectedItem(rs.getString("occupation"));
                fathername.setText(rs.getString("fathername"));
                String photoname = rs.getString("ImageInfo");
                imageInfo.setText(photoname);
                ImageIcon imageicon = new ImageIcon(new ImageIcon("Image//"+photoname+".jpg").getImage().getScaledInstance(227, 270, java.awt.Image.SCALE_DEFAULT));
                lebl.setIcon(imageicon);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_existingMemberMouseClicked

    private void existingMemberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existingMemberKeyPressed
        /*PreparedStatement ps = null;
        String name1 = existingMember.getSelectedValue();
        System.out.println(name1);
        String contact1 = contact.getText();
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
            Class.forName("org.sqlite.JDBC"); 
            String ins="SELECT * FROM customer\n" +
            "WHERE \"Name\" = '"+name1+"' AND \"Contact\"='"+contact1+"';";
            ps = connection.prepareStatement(ins);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            name.setText(rs.getString("name"));
            address.setText(rs.getString("address"));
            passportno.setText(rs.getString("passportno"));
            nationalid.setText(rs.getString("nationalid"));
            nationality.setText(rs.getString("nationality"));
            age.setText(rs.getString("age"));
            bookingdate.setText(rs.getString("bookingdate"));
            bookingtime.setText(rs.getString("bookingtime"));
            marital.setSelectedItem(rs.getString("marital"));
            religion.setSelectedItem(rs.getString("religion"));
            purpose.setSelectedItem(rs.getString("purpose"));
            occupation.setSelectedItem(rs.getString("occupation"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_existingMemberKeyPressed

    private void clearCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCompActionPerformed
        name.setText("");
        address.setText("");
        passportno.setText("");
        nationalid.setText("");
        nationality.setText("Bangladeshi");
        age.setText("");
        bookingdate.setText("");
        bookingtime.setText("");
        marital.setSelectedItem("Select Marital Status...");
        religion.setSelectedItem("Muslim");
        purpose.setSelectedItem("Select Purpose...");
        occupation.setSelectedItem("Select Occupation...");
        try {
            roomComboBox.removeAllItems();
            statusCheck();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
        currentDate();
        imageInfo.setText("");
        existingMember.setListData(new String[0]);
        i=1;
    }//GEN-LAST:event_clearCompActionPerformed

    private void roomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomComboBoxActionPerformed

    private void occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationActionPerformed

    private void CheckoutPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutPageActionPerformed
        try {
            new CheckOut().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(selectionPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(selectionPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_CheckoutPageActionPerformed

    private void fathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fathernameActionPerformed

    private void checkContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkContactActionPerformed
        PreparedStatement ps=null;
        Statement st = null;
        String contact1 = contact.getText();
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db")) {
            Class.forName("org.sqlite.JDBC");
            String ins="SELECT DISTINCT name FROM customer\n" +
            "WHERE \"Contact\" = '"+contact1+"';";
            ps = connection.prepareStatement(ins);
            //st.executeQuery(ins);
            ResultSet rs = ps.executeQuery();
            DefaultListModel listModel1 = new DefaultListModel();
            while(rs.next()){
                String data= rs.getString("Name");
                listModel1.addElement(data);
            }
            existingMember.setModel(listModel1);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkContactActionPerformed
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
            java.util.logging.Logger.getLogger(admin_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
   
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new admin_choice().setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(admin_choice.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGE;
    private javax.swing.JLabel Address;
    private javax.swing.JLabel BookingDate;
    private javax.swing.JLabel BookingTime;
    private javax.swing.JButton CheckoutPage;
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel ImageInfo;
    private javax.swing.JLabel MaritalStatus;
    private javax.swing.JLabel Members;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Nationality;
    private javax.swing.JLabel Note;
    private javax.swing.JLabel Occupation;
    private javax.swing.JLabel Purpose;
    private javax.swing.JLabel Religion;
    private javax.swing.JLabel RoomNumber;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JTextField bookingdate;
    private javax.swing.JTextField bookingtime;
    private javax.swing.JButton checkContact;
    private javax.swing.JButton checkIn;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearComp;
    private javax.swing.JTextField contact;
    private javax.swing.JList<String> existingMember;
    private javax.swing.JTextField fathername;
    private javax.swing.JTextField imageInfo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lebl;
    private javax.swing.JComboBox<String> marital;
    private javax.swing.JComboBox<String> member;
    private javax.swing.JTextField name;
    private javax.swing.JLabel national;
    private javax.swing.JTextField nationalid;
    private javax.swing.JTextField nationality;
    private javax.swing.JComboBox<String> occupation;
    private javax.swing.JButton openCamera;
    private javax.swing.JLabel passno;
    private javax.swing.JTextField passportno;
    private javax.swing.JComboBox<String> purpose;
    private javax.swing.JComboBox<String> religion;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JButton takePicture;
    // End of variables declaration//GEN-END:variables
}
