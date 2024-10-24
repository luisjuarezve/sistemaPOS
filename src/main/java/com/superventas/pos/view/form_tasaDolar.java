package com.superventas.pos.view;

import com.superventas.pos.model.Empleados;
import java.awt.Color;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class form_tasaDolar extends javax.swing.JFrame {

    private  Empleados empleado;
    
    public form_tasaDolar(Empleados empleado) {
        initComponents();
        this.empleado = empleado;
        this.setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
        
        txt_tasa.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateInput();
            }
            
            private void validateInput(){
                try{
                    Double.parseDouble(txt_tasa.getText());
                    btn_guardar.setEnabled(true);
                }catch (NumberFormatException ex){
                    btn_guardar.setEnabled(false);
                }
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new com.superventas.pos.view.components.RoundedPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_tasa = new com.superventas.pos.view.components.RoundedTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_guardar = new com.superventas.pos.view.components.RoundedButton1_Invoice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        roundedPanel1.setBackground(new java.awt.Color(168, 8, 72));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        roundedPanel1.setRoundBottomLeft(20);
        roundedPanel1.setRoundBottomRight(20);
        roundedPanel1.setRoundTopLeft(20);
        roundedPanel1.setRoundTopRight(20);
        roundedPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 120));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tasa del dia");
        jLabel2.setPreferredSize(new java.awt.Dimension(126, 100));
        jPanel2.add(jLabel2);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        txt_tasa.setBorder(null);
        txt_tasa.setForeground(new java.awt.Color(204, 204, 204));
        txt_tasa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tasa.setText("0.00 Bs");
        txt_tasa.setPreferredSize(new java.awt.Dimension(120, 25));
        txt_tasa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_tasaFocusGained(evt);
            }
        });
        jPanel4.add(txt_tasa);

        jPanel2.add(jPanel4);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        btn_guardar.setBackground(new java.awt.Color(41, 1, 138));
        btn_guardar.setBorder(null);
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setFocusable(false);
        btn_guardar.setPreferredSize(new java.awt.Dimension(120, 30));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_guardar);

        jPanel2.add(jPanel3);

        jPanel1.add(jPanel2, new java.awt.GridBagConstraints());

        roundedPanel1.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        double tasa = Double.valueOf(txt_tasa.getText());
        SuperPOS sp = new SuperPOS(empleado, tasa);
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_tasaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tasaFocusGained
        if (txt_tasa.getText().equals("0.00 Bs")) {
            txt_tasa.setText("");
            txt_tasa.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_tasaFocusGained

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.superventas.pos.view.components.RoundedPanel roundedPanel1;
    private com.superventas.pos.view.components.RoundedTextField txt_tasa;
    // End of variables declaration//GEN-END:variables
}