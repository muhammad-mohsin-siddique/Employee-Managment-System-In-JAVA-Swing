package employee.payroll.system;

//import java.awt.Color;
import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;


public class splashScreenExample extends javax.swing.JFrame {

    
    public splashScreenExample() {
        initComponents();
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/employee/payroll/system/Images/inno.png"));

        setIconImage(icon.getImage());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        BackgroundPanel = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingHeading = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 102));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingBar.setBackground(new java.awt.Color(0, 0, 102));
        LoadingBar.setForeground(new java.awt.Color(0, 0, 153));
        BackgroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 620, 20));

        LoadingHeading.setBackground(new java.awt.Color(255, 255, 255));
        LoadingHeading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoadingHeading.setForeground(new java.awt.Color(255, 255, 255));
        LoadingHeading.setText("Loading.......");
        BackgroundPanel.add(LoadingHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        Heading.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText(" Expertise In Action");
        BackgroundPanel.add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 70));

        LoadingValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setText("0 %");
        BackgroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 40, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/BackgroundColor.png"))); // NOI18N
        BackgroundPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashScreenExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         java.awt.EventQueue.invokeLater(() -> {
            new splashScreenExample().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel BackgroundPanel;
    public javax.swing.JLabel Heading;
    public javax.swing.JProgressBar LoadingBar;
    public javax.swing.JLabel LoadingHeading;
    public javax.swing.JLabel LoadingValue;
    public javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
