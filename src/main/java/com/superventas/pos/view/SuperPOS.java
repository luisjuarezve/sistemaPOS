package com.superventas.pos.view;

import com.superventas.pos.model.Carrito;
import com.superventas.pos.model.Empleados;
import com.superventas.pos.view.components.BillingSection;
import com.superventas.pos.view.components.MenuPrincipal;
import com.superventas.pos.view.components.PanelClientes;
import com.superventas.pos.view.components.ProductsSection;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class SuperPOS extends javax.swing.JFrame {
    
    private static double tasa;
    private Empleados empleado;

    
    
    public SuperPOS(Empleados empleado, double tasa) {
        initComponents();
        this.tasa = tasa;
        this.empleado = empleado;
        lbl_user.setText(empleado.getNombre()+" "+empleado.getApellido());
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        body.add(new MenuPrincipal(body, tasa), new java.awt.BorderLayout().CENTER);
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
        nav_menu.setPreferredSize(new java.awt.Dimension(500, 80));
        nav_menu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        nav_menu_options.setOpaque(false);
        nav_menu_options.setPreferredSize(new java.awt.Dimension(500, 70));
        nav_menu_options.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 13));

        btn_menu.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\menu.png"));
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

        nav_menu.add(nav_menu_options);

        header.add(nav_menu, java.awt.BorderLayout.WEST);

        nav_logout.setOpaque(false);
        nav_logout.setPreferredSize(new java.awt.Dimension(80, 80));
        nav_logout.setLayout(new java.awt.GridBagLayout());

        nav_logout_options.setOpaque(false);
        nav_logout_options.setRequestFocusEnabled(false);

        btn_logout.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\logout.png"));
        btn_logout.setText("jButton2");
        btn_logout.setBorderPainted(false);
        btn_logout.setContentAreaFilled(false);
        btn_logout.setFocusable(false);
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
        body.removeAll();
        body.add(new MenuPrincipal(body, tasa), new java.awt.BorderLayout().CENTER);
        body.revalidate();
        body.repaint();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

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
