package com.superventas.pos.view;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new com.superventas.pos.view.components.RoundedPanel();
        Main_logo = new com.superventas.pos.view.components.RoundedPanel();
        Title = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Main_form = new com.superventas.pos.view.components.RoundedPanel();
        Main_options = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Main_body = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contrasena = new javax.swing.JLabel();
        txt_usuario = new com.superventas.pos.view.components.RoundedTextField();
        txt_contrasena = new com.superventas.pos.view.components.RoundedPasswordField();
        btn_login = new com.superventas.pos.view.components.RoundedButtonGradient();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Main.setPreferredSize(new java.awt.Dimension(600, 300));
        Main.setRoundBottomLeft(20);
        Main.setRoundBottomRight(20);
        Main.setRoundTopLeft(20);
        Main.setRoundTopRight(20);
        Main.setLayout(new java.awt.BorderLayout());

        Main_logo.setPreferredSize(new java.awt.Dimension(300, 400));
        Main_logo.setRoundBottomLeft(20);
        Main_logo.setRoundTopLeft(20);
        Main_logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Super POS");
        Main_logo.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\logo.png")); // NOI18N
        Main_logo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\background.png")); // NOI18N
        Main_logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Main.add(Main_logo, java.awt.BorderLayout.WEST);

        Main_form.setBackground(new java.awt.Color(255, 255, 255));
        Main_form.setPreferredSize(new java.awt.Dimension(300, 400));
        Main_form.setRoundBottomRight(20);
        Main_form.setRoundTopRight(20);
        Main_form.setLayout(new java.awt.BorderLayout());

        Main_options.setFocusable(false);
        Main_options.setOpaque(false);
        Main_options.setPreferredSize(new java.awt.Dimension(300, 50));
        Main_options.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\close.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Main_options.add(jButton1);

        Main_form.add(Main_options, java.awt.BorderLayout.PAGE_START);

        Main_body.setOpaque(false);
        Main_body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_usuario.setText("Usuario:");
        Main_body.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lbl_contrasena.setText("Contraseña:");
        Main_body.add(lbl_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 235, 254));
        txt_usuario.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuario.setText("usuario");
        txt_usuario.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_usuario.setPreferredSize(new java.awt.Dimension(200, 25));
        txt_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usuarioFocusLost(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        Main_body.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txt_contrasena.setBackground(new java.awt.Color(255, 235, 254));
        txt_contrasena.setForeground(new java.awt.Color(102, 102, 102));
        txt_contrasena.setText("*********");
        txt_contrasena.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_contrasena.setPreferredSize(new java.awt.Dimension(200, 25));
        txt_contrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_contrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_contrasenaFocusLost(evt);
            }
        });
        Main_body.add(txt_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        btn_login.setBorder(null);
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Iniciar Sesion");
        btn_login.setFocusPainted(false);
        btn_login.setPreferredSize(new java.awt.Dimension(200, 40));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        Main_body.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Inicio de Sesión");
        Main_body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 20, -1, -1));

        Main_form.add(Main_body, java.awt.BorderLayout.CENTER);

        Main.add(Main_form, java.awt.BorderLayout.EAST);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioFocusGained
        if (txt_usuario.getText().equals("usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_usuarioFocusGained

    private void txt_usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioFocusLost
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("usuario");
            txt_usuario.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txt_usuarioFocusLost

    private void txt_contrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contrasenaFocusGained
        if (new String(txt_contrasena.getPassword()).equals("*********")) {
            txt_contrasena.setText("");
        }
    }//GEN-LAST:event_txt_contrasenaFocusGained

    private void txt_contrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contrasenaFocusLost
        if (new String(txt_contrasena.getPassword()).equals("")) {
            txt_contrasena.setText("*********");
        }
    }//GEN-LAST:event_txt_contrasenaFocusLost

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (txt_usuario.getText().equals("admin") && new String(txt_contrasena.getPassword()).equals("123456")) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Inicio de Sesión exitoso!", "Inicio Exitoso!",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private com.superventas.pos.view.components.RoundedPanel Main;
    private javax.swing.JPanel Main_body;
    private com.superventas.pos.view.components.RoundedPanel Main_form;
    private com.superventas.pos.view.components.RoundedPanel Main_logo;
    private javax.swing.JPanel Main_options;
    private javax.swing.JLabel Title;
    private com.superventas.pos.view.components.RoundedButtonGradient btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_usuario;
    private com.superventas.pos.view.components.RoundedPasswordField txt_contrasena;
    private com.superventas.pos.view.components.RoundedTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
