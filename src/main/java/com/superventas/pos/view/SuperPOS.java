package com.superventas.pos.view;

import com.superventas.pos.view.components.BillingSection;
import com.superventas.pos.view.components.ProductsSection;
import javax.swing.JOptionPane;

public class SuperPOS extends javax.swing.JFrame {

    public SuperPOS() {
        initComponents();
        this.setLocationRelativeTo(null);
        body.add(new ProductsSection(), new java.awt.BorderLayout().WEST);
        body.add(new BillingSection(), new java.awt.BorderLayout().EAST);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        nav_menu = new javax.swing.JPanel();
        nav_menu_options = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        nav_logout = new javax.swing.JPanel();
        nav_logout_options = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 1024));

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.setPreferredSize(new java.awt.Dimension(1280, 80));
        header.setLayout(new java.awt.BorderLayout());

        nav_menu.setOpaque(false);
        nav_menu.setPreferredSize(new java.awt.Dimension(213, 80));
        nav_menu.setLayout(new java.awt.GridBagLayout());

        nav_menu_options.setOpaque(false);
        nav_menu_options.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        btn_menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\menu.png")); // NOI18N
        btn_menu.setText("jButton1");
        btn_menu.setBorderPainted(false);
        btn_menu.setContentAreaFilled(false);
        btn_menu.setFocusable(false);
        btn_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_menu.setPreferredSize(new java.awt.Dimension(40, 37));
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        nav_menu_options.add(btn_menu);

        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Super POS - ");
        nav_menu_options.add(lbl_title);

        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("LUIS JUAREZ");
        nav_menu_options.add(lbl_user);

        nav_menu.add(nav_menu_options, new java.awt.GridBagConstraints());

        header.add(nav_menu, java.awt.BorderLayout.WEST);

        nav_logout.setOpaque(false);
        nav_logout.setPreferredSize(new java.awt.Dimension(80, 80));
        nav_logout.setLayout(new java.awt.GridBagLayout());

        nav_logout_options.setOpaque(false);
        nav_logout_options.setRequestFocusEnabled(false);

        btn_logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\logout.png")); // NOI18N
        btn_logout.setText("jButton2");
        btn_logout.setBorderPainted(false);
        btn_logout.setContentAreaFilled(false);
        btn_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_logout.setPreferredSize(new java.awt.Dimension(40, 37));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        nav_logout_options.add(btn_logout);

        nav_logout.add(nav_logout_options, new java.awt.GridBagConstraints());

        header.add(nav_logout, java.awt.BorderLayout.EAST);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        body.setLayout(new java.awt.BorderLayout());
        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        JOptionPane.showMessageDialog(null, "Activar menu");
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(SuperPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_menu;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPanel nav_logout;
    private javax.swing.JPanel nav_logout_options;
    private javax.swing.JPanel nav_menu;
    private javax.swing.JPanel nav_menu_options;
    // End of variables declaration//GEN-END:variables
}
