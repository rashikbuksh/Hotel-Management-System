/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Rafsan
 */
public class report extends javax.swing.JFrame {

    /**
     * Creates new form report
     */
    public report() {
        this.setTitle("Report Page");
        initComponents();
        currentDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkinDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        getReportbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        printTable = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = jTable1 = new javax.swing.JTable(){
            //add tooltip to display the full cell text when not displayed
            public String getToolTipText( java.awt.event.MouseEvent e )
            {
                int row = rowAtPoint( e.getPoint() );
                int column = columnAtPoint( e.getPoint() );
                Object value = getValueAt(row, column);
                return value == null ? null : value.toString();
            }
        };
        back = new javax.swing.JButton();
        lebl = new javax.swing.JLabel();
        normalPrint = new javax.swing.JButton();
        reportName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setText("Enter checkin Date");

        getReportbt.setText("OK");
        getReportbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getReportbtActionPerformed(evt);
            }
        });

        jLabel2.setText("(Press OK to get report)");

        printTable.setText("Police Report");
        printTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTableActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        normalPrint.setText("Record Report");
        normalPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getReportbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reportName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(printTable)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 159, Short.MAX_VALUE)
                        .addComponent(lebl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(normalPrint)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(getReportbt)
                    .addComponent(jLabel2)
                    .addComponent(printTable)
                    .addComponent(normalPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lebl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(reportName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getReportbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getReportbtActionPerformed
        String checkinDate1 = checkinDate.getText();
        try (Connection connection = dbConnection.getConnection()) {
            Statement st=connection.createStatement();
            String ins="SELECT * FROM customer\n" +
            "WHERE \"BookingDate\" = '"+checkinDate1+"'\n" + "ORDER BY roomnumber,TIME('%H:%M',bookingtime) asc;";
            
            //st.executeQuery(ins);
            ResultSet rs = st.executeQuery(ins);
            //st.executeUpdate(ins);               
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            //model.setColumnIdentifiers(columnsName);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            int row = jTable1.getSelectedRow();
            rs = st.executeQuery(ins);

            //System.out.println("asdasd");
            int loop=0;
            while(rs.next()){
                jTable1.setRowHeight(100);
                jTable1.getTableHeader().setReorderingAllowed(false);
                Object valueat = jTable1.getValueAt(loop, 17); 
                jTable1.getColumnModel().getColumn(17).setCellRenderer(new ImageRender(valueat));
                loop++;
                //loop++;
                //System.out.println(rs.getRow());
                //System.out.println(rs.getString("ImageInfo"));
            }

            JOptionPane.showMessageDialog(this, "Information Shown on Table");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Problem on Database Server");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_getReportbtActionPerformed
    private class ImageRender extends DefaultTableCellRenderer {

        private Object name;

        public ImageRender(Object name) {
            this.name=name;
            //System.out.println("name:"+name);
        }
        
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
            
            
            Object photoname = value+".jpg";
            //System.out.println(photoname);
            
            ImageIcon imageicon = new ImageIcon(new ImageIcon("Image//"+photoname).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT));
            return new JLabel(imageicon);
            
        }
    }
    
    private void printPDF (String path, String fileName) throws PrintException, FileNotFoundException, IOException {
        DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
        PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
        patts.add(Sides.DUPLEX);
        PrintService[] ps = PrintServiceLookup.lookupPrintServices(flavor, patts);
        if (ps.length == 0) {
            throw new IllegalStateException("No Printer found");
        }
        System.out.println("Available printers: " + Arrays.asList(ps));

        PrintService myService = null;
        for (PrintService printService : ps) {
            if (printService.getName().equals("HP Ink Tank 310 series")) {
                System.out.println(myService +"-" + printService);
                myService = printService;
                break;
            }
        }
        System.out.println("my service: "+myService);

        if (myService == null) {
            throw new IllegalStateException("Printer not found");
        }
        FileInputStream fis;
        if(path.equals("D:\\Police Report\\")){
            fis = new FileInputStream("D:\\Police Report\\"+fileName);
        }
        else{
            fis = new FileInputStream("D:\\Record Report\\"+fileName);
        }
        Doc pdfDoc = new SimpleDoc(fis, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
        DocPrintJob printJob = myService.createPrintJob();
        printJob.print(pdfDoc, patts);
        fis.close();
    }

    private void printTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTableActionPerformed
        reportName.setText("Hotel Bukshi LTD. Police Report of "+checkinDate.getText());
        jTable1.getTableHeader().setFont(new Font("Segoe UI", 1 , 25));
        jTable1.setFont(new Font("Serif", Font.PLAIN, 25));
        String path = "D:\\Police Report\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+checkinDate.getText()+".pdf"));
            doc.open();
            Paragraph para1 = new Paragraph("                                    "+reportName.getText());
            com.itextpdf.text.Font font= new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER, 20);
            para1.setFont(font);
            doc.add(para1);
            int i=0;
            float fntSize, lineSpacing;
            fntSize = 7f;
            lineSpacing = 3f;
            while(i<jTable1.getRowCount()){
                PdfPTable table = new PdfPTable(3);
                String j = jTable1.getValueAt(i,15).toString();
                if(i-1<0){
                     Paragraph para2 = new Paragraph(
                        new Phrase(lineSpacing,"Room Number: "+jTable1.getValueAt(i,15)+"\n\n",FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                     doc.add(para2);
                }
                else if(j.equalsIgnoreCase(jTable1.getValueAt(i-1,15).toString())){
                    //no condition because of same room.
                }
                else{
                    Paragraph para2 = new Paragraph(
                        new Phrase(lineSpacing,"Room Number: "+jTable1.getValueAt(i,15)+"\n\n",FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                     doc.add(para2);
                }
                table.addCell(new Phrase(lineSpacing,"Name: "+jTable1.getValueAt(i,1),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Father/Husband Name: "+jTable1.getValueAt(i,2),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Contact: "+jTable1.getValueAt(i,3),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Nationality: "+jTable1.getValueAt(i,8),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Passport: "+jTable1.getValueAt(i,5),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Occupation: "+jTable1.getValueAt(i,12),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Age: "+jTable1.getValueAt(i,7),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Marital Status: "+jTable1.getValueAt(i,11),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Religion: "+jTable1.getValueAt(i,14),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Purpose: "+jTable1.getValueAt(i,13),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Booking Time: "+jTable1.getValueAt(i,10),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"National ID Card: "+jTable1.getValueAt(i,6),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Address: "+jTable1.getValueAt(i,4),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Checkout Date: "+jTable1.getValueAt(i,16),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing," ",FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                doc.add(table);
                Paragraph para3 = new Paragraph("\n");
                doc.add(para3);
                i++;
            }
            doc.close();
        }catch(DocumentException | FileNotFoundException ex){
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            printPDF(path,checkinDate.getText()+".pdf");
        } catch (PrintException | IOException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_printTableActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new selectionPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void normalPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalPrintActionPerformed
        reportName.setText("Hotel Bukshi LTD. Record Report of "+checkinDate.getText());
        //TableColumn tcol10 = jTable1.getColumnModel().getColumn(10);
        //jTable1.removeColumn(tcol10);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", 1 , 18));
        jTable1.setFont(new Font("Serif", Font.BOLD, 18));
        String path = "D:\\Record Report\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document(PageSize.A4);
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+checkinDate.getText()+".pdf"));
            doc.open();
            Paragraph para1 = new Paragraph("                                    "+reportName.getText());
            com.itextpdf.text.Font font= new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER, 20);
            para1.setFont(font);
            doc.add(para1);
            int i=0;
            float fntSize, lineSpacing;
            fntSize = 7f;
            lineSpacing = 3f;
            while(i<jTable1.getRowCount()){
                PdfPTable table = new PdfPTable(4);
                String j = jTable1.getValueAt(i,11).toString();
                if(i-1<0){
                     Paragraph para2 = new Paragraph(
                        new Phrase(lineSpacing,"Room Number: "+jTable1.getValueAt(i,15)+"\n\n",FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                     doc.add(para2);
                }
                else if(j.equalsIgnoreCase(jTable1.getValueAt(i-1,15).toString())){
                    //no condition because of same room.
                }
                else{
                    Paragraph para2 = new Paragraph(
                        new Phrase(lineSpacing,"Room Number: "+jTable1.getValueAt(i,15)+"\n\n",FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                     doc.add(para2);
                }
                table.addCell(new Phrase(lineSpacing,"Name: "+jTable1.getValueAt(i,1),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Father/Husband Name: "+jTable1.getValueAt(i,2),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Contact: "+jTable1.getValueAt(i,3),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Nationality: "+jTable1.getValueAt(i,8),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Passport: "+jTable1.getValueAt(i,5),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Occupation: "+jTable1.getValueAt(i,12),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Age: "+jTable1.getValueAt(i,7),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Marital Status: "+jTable1.getValueAt(i,11),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Religion: "+jTable1.getValueAt(i,14),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Purpose: "+jTable1.getValueAt(i,13),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Booking Time: "+jTable1.getValueAt(i,10),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"National ID Card: "+jTable1.getValueAt(i,6),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Address: "+jTable1.getValueAt(i,4),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                table.addCell(new Phrase(lineSpacing,"Checkout Date: "+jTable1.getValueAt(i,16),FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                String imageFile = "Image\\"+jTable1.getValueAt(i,17)+".jpg";
                com.itextpdf.text.Image image;
                try{
                    image = com.itextpdf.text.Image.getInstance(imageFile);
                    table.addCell(image);
                }catch(Exception ex){
                    table.addCell(new Phrase(lineSpacing,"Image Not Found!",FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                }
                table.addCell(new Phrase(lineSpacing," ",FontFactory.getFont(FontFactory.HELVETICA, fntSize)));
                doc.add(table);
                Paragraph para3 = new Paragraph("\n");
                doc.add(para3);
                i++;
            }
            doc.close();
        }catch(DocumentException | FileNotFoundException ex){
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            printPDF(path,checkinDate.getText()+".pdf");
        } catch (PrintException | IOException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_normalPrintActionPerformed
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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new report().setVisible(true);
        });
    }
    public void currentDate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        checkinDate.setText(year+"-"+month+"-"+day);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField checkinDate;
    private javax.swing.JButton getReportbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lebl;
    private javax.swing.JButton normalPrint;
    private javax.swing.JButton printTable;
    private javax.swing.JLabel reportName;
    // End of variables declaration//GEN-END:variables
}
