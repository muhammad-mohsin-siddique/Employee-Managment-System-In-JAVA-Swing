package employee.payroll.system;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public final class login extends javax.swing.JFrame 
{

   Connection conn = null;
   ResultSet rs = null;
   PreparedStatement pst = null;

   public login() 
   {

       initComponents();

       conn = db.java_db();

       Toolkit toolkit = getToolkit();

       Dimension size = toolkit.getScreenSize();

       setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

       setTitle("Experties In Action");

       //setSize(size.width, size.height);
       ImageIcon icon = new ImageIcon(getClass().getResource("/employee/payroll/system/Images/inno.png"));

       setIconImage(icon.getImage());

       currentDate();
   }

   public void currentDate() {

       Calendar cal = new GregorianCalendar();
       int month = cal.get(Calendar.MONTH);
       int year = cal.get(Calendar.YEAR);
       int day = cal.get(Calendar.DAY_OF_MONTH);

       txt_date.setText((month + 1) + "/" + day + "/" + year);

       int second = cal.get(Calendar.SECOND);
       int minute = cal.get(Calendar.MINUTE);
       int hour = cal.get(Calendar.HOUR);

       lbl_time.setText(hour + ":" + (minute) + ":" + second);
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        cmd_Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        txt_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        cmd_Login.setBackground(new java.awt.Color(102, 255, 204));
        cmd_Login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_Login.setText("Login");
        cmd_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_LoginActionPerformed(evt);
            }
        });
        cmd_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmd_LoginKeyPressed(evt);
            }
        });
        jPanel2.add(cmd_Login);
        cmd_Login.setBounds(160, 420, 70, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 330, 80, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 380, 80, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Please enter your username and password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 264, 300, 30);

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 102)));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_username);
        txt_username.setBounds(130, 320, 140, 30);

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        txt_password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel2.add(txt_password);
        txt_password.setBounds(130, 370, 140, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/image-4.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-200, 110, 1050, 400);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel5.setText(" Expertise In Action");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("By: Shair Muhammad Saqib & Muhammad Mohsin Siddique");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/EIA.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel8.setMinimumSize(new java.awt.Dimension(200, 100));
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 850, 100);

        jMenu2.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Exit.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);

        txt_date.setText("Date");
        jMenuBar1.add(txt_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:#
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cmd_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_LoginActionPerformed
        // TODO add your handling code here:

        if (txt_username.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Username Field is empty");

        } else if (txt_password.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Password Field is empty");

        } else if(!Character.isLetter(txt_username.getText().charAt(0))){

            JOptionPane.showMessageDialog(this, "Username must start with a letter", "Invalid Username", JOptionPane.WARNING_MESSAGE);

            txt_username.setText("");
        }
        else {

            String sql = "select id,username,password from Users Where (username = ? and password =?)";

            //"select * from Employeeinfo where username=? and password=? and division=? and id=?";
            try{

                int count =0;

                pst = conn.prepareStatement(sql);

                pst.setString(1,txt_username.getText());
                pst.setString(2,txt_password.getText());

                //pst.setString(3, txt_combo.getSelectedItem().toString());

                rs=pst.executeQuery();
                {
                }
                while(rs.next()){
                    int id = rs.getInt(1);
                    Emp.empId = id;
                    count =count+1;
                }
                String access= "Admin";

                if("Admin".equals(access)) {

                    if(count==1){
                        
                        JOptionPane.showMessageDialog(null,"Sucess" );
                        MainMenu j = new MainMenu();
                        
                        j.setVisible(true);

                        this.dispose();

                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String dateString = df.format(currentDate);

                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String timeString = sdf.format(d);

                        String value0 = timeString;
                        String values = dateString;

                        int value = Emp.empId;
                        String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                        pst=conn.prepareStatement(reg);
                        pst.execute();
                        this.dispose();

                    }
                    else if(count>1){
                        JOptionPane.showMessageDialog(null,"Duplicate Username or Password Access denied");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Username and Password is not correct");
                    }
                }
            }

            catch(HeadlessException | SQLException e)

            {
                JOptionPane.showMessageDialog(null, e);

            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(SQLException e){

                }
            }

        }
    }//GEN-LAST:event_cmd_LoginActionPerformed

    private void cmd_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmd_LoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_LoginKeyPressed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
        String username = txt_username.getText();

        if (!username.isEmpty() && !Character.isLetter(username.charAt(0))) {

            JOptionPane.showMessageDialog(this, "Username must start with a letter", "Invalid Username", JOptionPane.WARNING_MESSAGE);

            txt_username.setText("");
        }
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String sql = "select id,username,password from Users Where (username =? and password =?)";

            //"select * from Employeeinfo where username=? and password=? and id=?";
            try{

                int count =0;

                pst = conn.prepareStatement(sql);

                pst.setString(1,txt_username.getText());
                pst.setString(2,txt_password.getText());
                //pst.setString(3, txt_combo.getSelectedItem().toString());

                rs = pst.executeQuery();

                {
                }
                while(rs.next()){
                    int id = rs.getInt(1);
                    Emp.empId = id;
                    count =count+1;
                }

                String access= "Admin";

                if("Admin".equals(access)) {

                    if(count==1){

                        JOptionPane.showMessageDialog(null,"Success" );
                        MainMenu j = new MainMenu();
                        j.setVisible(true);
                        this.dispose();

                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String dateString = df.format(currentDate);

                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String timeString = sdf.format(d);

                        String value0 = timeString;
                        String values = dateString;

                        int value = Emp.empId;
                        String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                        pst=conn.prepareStatement(reg);
                        pst.execute();
                        this.dispose();
                    }
                    else if(count>1){
                        JOptionPane.showMessageDialog(null,"Duplicate Username or Password Access denied");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Username and Password is not correct");
                    }
                }
            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(SQLException e){

                }
            }

        }

    }//GEN-LAST:event_txt_passwordKeyPressed

    public static void main(String args[]) {
        
        splashScreenExample sp = new splashScreenExample();
        
        sp.setVisible(true);
        
        try 
        {
            
            sp.LoadingBar.setForeground(Color.CYAN);
            
            for(int i =0; i<=100; i=i+2){
                
               Thread.sleep(100);
                
               sp.LoadingValue.setText(i + "%");
                
               if(i==10){
                   sp.LoadingHeading.setText("Turning On Modules......");
               }
               if(i==20){
                   sp.LoadingHeading.setText("Loading Modules......");
               }
               if(i==50){
                   sp.LoadingHeading.setText("Connecting to DataBase......");
               }
               if(i==70){
                   sp.LoadingHeading.setText("Connection Successful......");
               }
               if(i==80){
                   sp.LoadingHeading.setText("Launching Application......");
               }
                
               sp.LoadingBar.setValue(i);
                
                
            }
        } catch(InterruptedException e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        sp.dispose();
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JMenu txt_date;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
