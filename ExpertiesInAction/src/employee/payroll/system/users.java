package employee.payroll.system;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;



public class users extends javax.swing.JFrame 
{
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public users() {
        initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2); 
        
        
        setTitle("Experties In Action");

        //setSize(size.width, size.height);
        ImageIcon icon = new ImageIcon(getClass().getResource("/employee/payroll/system/Images/inno.png"));

        setIconImage(icon.getImage());
        Fillcombo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cmd_add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        txt_combo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        cmd_delete = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmd_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Save-icon.png"))); // NOI18N
        cmd_add.setText("Add ");
        cmd_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_addActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login_Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 18))); // NOI18N

        jLabel1.setText("Select Users");

        txt_combo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                txt_comboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel3.setText("Password");

        jLabel2.setText("Username");

        jLabel4.setText("Id");

        txt_id.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        cmd_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/delete_16x16.gif"))); // NOI18N
        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmd_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/update icon.png"))); // NOI18N
        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/erase-128.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmd_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cmd_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
        
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
         String sql ="delete from Users where username=? ";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Record Deleted");
            
            
        }catch(HeadlessException | SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
        }finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(SQLException e){
                
            }
        }
        
        }
        
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void txt_comboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_txt_comboPopupMenuWillBecomeInvisible
        
         String tmp =(String) txt_combo.getSelectedItem();
         String sql="select * from Users where username=?";
        
        
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs=pst.executeQuery();
            
            if(rs.next()){
                
                String add1 =rs.getString("username");
                txt_username.setText(add1);
                
                String add2 =rs.getString("password");
                txt_password.setText(add2);
                
                String add3 =rs.getString("id");
                txt_id.setText(add3);
                
//                String add4 =rs.getString("division");
//                
//                txt_dep.setText("temp");
                
               
            }
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(SQLException e){
                
            }
        }// TODO add your handling code here:
        Fillcombo();
       
    }//GEN-LAST:event_txt_comboPopupMenuWillBecomeInvisible

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update record?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
         try{
            
            String value1 = txt_id.getText();
            String value2 = txt_username.getText();
            String value3 = txt_password.getText();
            String value4 = "temp";
            
            
            String sql= "update Users set id='"+value1+"', username='"+value2+"', password='"+value3+"',division='"+value4+"' where id='"+value1+"' ";
            
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");
            
        }catch(HeadlessException | SQLException e){
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
       Fillcombo();
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt_username.setText("");
        txt_password.setText("");
        //txt_dep.setText("");
        txt_id.setText("");
     

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmd_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_addActionPerformed
   int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){        // TODO add your handling code here:

        try {

            String sql ="insert into Users (username,password,division) values (?,?,?) ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_username.getText());
            pst.setString(2,txt_password.getText());
            pst.setString(3,"temp");

            pst.execute();
            JOptionPane.showMessageDialog(null,"Data is saved successfully");

        }
        catch (HeadlessException | SQLException e)

        {
            JOptionPane.showMessageDialog(null,e);
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
      Fillcombo();

    }//GEN-LAST:event_cmd_addActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new users().setVisible(true);
        });
    }
private void Fillcombo(){
        
        try {
            String sql ="select * from Users";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()) {
                String name =rs.getString("username");
                txt_combo.addItem(name);
                
                
            }
            
        }catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, e);  
        } finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(SQLException e){
                
            }
        }
    
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_add;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox txt_combo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
