package com.superventas.pos.view;
import com.superventas.pos.model.Empleados;
import com.superventas.pos.persistence.EmpleadosDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormEmpleado extends javax.swing.JFrame {
    
    private EmpleadosDAO empDAO = new EmpleadosDAO();
    private Empleados acEmpleado;
    private JTable tabla;
    
    public FormEmpleado(String title, JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        LabelTOP.setText(title);
        this.tabla = tabla;
    }

    public FormEmpleado(String title, Empleados empleados, JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        acEmpleado= empleados;
        this.tabla = tabla;
        LabelTOP.setText(title);
        if (title.equals("Actualizar Empleado")) {
            txt_nombreEmpleado.setText(empleados.getNombre());
            txt_apellidoEmpleado.setText(empleados.getApellido());
            txt_correoEmpleado.setText(empleados.getCorreo_electronico());
            txt_usuario.setText(empleados.getUsuario());
            txt_contrasena.setText(empleados.getContrasena());
        }
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorFormulario = new javax.swing.JPanel();
        LabelTOP = new javax.swing.JLabel();
        ContenedorCenter = new javax.swing.JPanel();
        ContenedorFormularioInterno = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombreEmpleado = new com.superventas.pos.view.components.RoundedTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_apellidoEmpleado = new com.superventas.pos.view.components.RoundedTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_correoEmpleado = new com.superventas.pos.view.components.RoundedTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_usuario = new com.superventas.pos.view.components.RoundedTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_contrasena = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        ContenedorButtom = new javax.swing.JPanel();
        Button = new javax.swing.JPanel();
        btn_guardar = new com.superventas.pos.view.components.RoundedButton1_Invoice();
        btn_limpiarCampos = new com.superventas.pos.view.components.RoundedButton1_Invoice();
        btn_volver = new com.superventas.pos.view.components.RoundedButton1_Invoice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ContenedorFormulario.setBackground(new java.awt.Color(41, 1, 138));
        ContenedorFormulario.setPreferredSize(new java.awt.Dimension(400, 550));
        ContenedorFormulario.setLayout(new java.awt.BorderLayout());

        LabelTOP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LabelTOP.setForeground(new java.awt.Color(255, 255, 255));
        LabelTOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTOP.setText("Registrar Empleado");
        LabelTOP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        LabelTOP.setPreferredSize(new java.awt.Dimension(209, 60));
        ContenedorFormulario.add(LabelTOP, java.awt.BorderLayout.NORTH);

        ContenedorCenter.setOpaque(false);
        ContenedorCenter.setLayout(new java.awt.GridBagLayout());

        ContenedorFormularioInterno.setOpaque(false);
        ContenedorFormularioInterno.setPreferredSize(new java.awt.Dimension(300, 350));
        ContenedorFormularioInterno.setLayout(new java.awt.GridLayout(7, 1));

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ContenedorFormularioInterno.add(jPanel2);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");
        jPanel12.add(jLabel9);

        txt_nombreEmpleado.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_nombreEmpleado.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel12.add(txt_nombreEmpleado);

        ContenedorFormularioInterno.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido:");
        jPanel13.add(jLabel10);

        txt_apellidoEmpleado.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_apellidoEmpleado.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel13.add(txt_apellidoEmpleado);

        ContenedorFormularioInterno.add(jPanel13);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo:");
        jPanel15.add(jLabel12);

        txt_correoEmpleado.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_correoEmpleado.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel15.add(txt_correoEmpleado);

        ContenedorFormularioInterno.add(jPanel15);

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Usuario:");
        jPanel16.add(jLabel13);

        txt_usuario.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel16.add(txt_usuario);

        ContenedorFormularioInterno.add(jPanel16);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contraseña:");
        jPanel17.add(jLabel14);

        txt_contrasena.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_contrasena.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel17.add(txt_contrasena);

        ContenedorFormularioInterno.add(jPanel17);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ContenedorFormularioInterno.add(jPanel1);

        ContenedorCenter.add(ContenedorFormularioInterno, new java.awt.GridBagConstraints());

        ContenedorFormulario.add(ContenedorCenter, java.awt.BorderLayout.CENTER);

        ContenedorButtom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        ContenedorButtom.setOpaque(false);
        ContenedorButtom.setPreferredSize(new java.awt.Dimension(100, 130));
        ContenedorButtom.setLayout(new java.awt.GridBagLayout());

        Button.setOpaque(false);
        Button.setPreferredSize(new java.awt.Dimension(350, 80));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0);
        flowLayout1.setAlignOnBaseline(true);
        Button.setLayout(flowLayout1);

        btn_guardar.setBackground(new java.awt.Color(168, 8, 72));
        btn_guardar.setBorder(null);
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setIcon(new ImageIcon
            ("src/main/java/com/superventas/pos/img/Save.png"));
        btn_guardar.setText("");
        btn_guardar.setFocusable(false);
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_guardar.setPreferredSize(new java.awt.Dimension(100, 80));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        Button.add(btn_guardar);

        btn_limpiarCampos.setBackground(new java.awt.Color(168, 8, 72));
        btn_limpiarCampos.setBorder(null);
        btn_limpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiarCampos.setIcon(new ImageIcon("src/main/java/com/superventas/pos/img/Limpiar.png"));
        btn_limpiarCampos.setText("");
        btn_limpiarCampos.setFocusable(false);
        btn_limpiarCampos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_limpiarCampos.setPreferredSize(new java.awt.Dimension(100, 80));
        btn_limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarCamposActionPerformed(evt);
            }
        });
        Button.add(btn_limpiarCampos);

        btn_volver.setBackground(new java.awt.Color(168, 8, 72));
        btn_volver.setBorder(null);
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setIcon(new ImageIcon("src/main/java/com/superventas/pos/img/Atras.png"));
        btn_volver.setText("");
        btn_volver.setFocusable(false);
        btn_volver.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_volver.setPreferredSize(new java.awt.Dimension(100, 80));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        Button.add(btn_volver);

        ContenedorButtom.add(Button, new java.awt.GridBagConstraints());

        ContenedorFormulario.add(ContenedorButtom, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ContenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ContenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (LabelTOP.getText().equals("Registro de Empleado")) {
            Empleados empleado = new Empleados();
            String usuario = txt_usuario.getText();
            empleado.setRol_id(1);
            empleado.setNombre(txt_nombreEmpleado.getText());
            empleado.setApellido(txt_apellidoEmpleado.getText());
            empleado.setCorreo_electronico(txt_correoEmpleado.getText());
            empleado.setUsuario(txt_usuario.getText());
            empleado.setContrasena(new String(txt_contrasena.getPassword()));
            
            try {
                if (empDAO.leerEmpleadosUsuario(usuario) != null) {
                    JOptionPane.showMessageDialog(this, "El usuario ya esta registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }else{
                    empDAO.insertarEmpleados(empleado);
                    try {
                        rellenarTablaEmpleados(tabla);
                        this.dispose();
                    } catch (Exception e) {
                        this.dispose();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if (LabelTOP.getText().equals("Actualizar Empleado")) {
            empDAO.modificarEmpleados(String.valueOf(acEmpleado.getEmpleado_id()), new Empleados(0, acEmpleado.getRol_id(), txt_nombreEmpleado.getText(), txt_apellidoEmpleado.getText(), txt_correoEmpleado.getText(), txt_usuario.getText(), new String(txt_contrasena.getPassword())));
            this.dispose();
            JOptionPane.showMessageDialog(null, "Empleado actualizado exitosamente", "Empleado modificado exitosamente", JOptionPane.INFORMATION_MESSAGE);
            rellenarTablaEmpleados(tabla);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarCamposActionPerformed
       txt_nombreEmpleado.setText("");
       txt_apellidoEmpleado.setText("");
       txt_correoEmpleado.setText("");
       txt_usuario.setText("");
       txt_contrasena.setText("");
    }//GEN-LAST:event_btn_limpiarCamposActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button;
    private javax.swing.JPanel ContenedorButtom;
    private javax.swing.JPanel ContenedorCenter;
    private javax.swing.JPanel ContenedorFormulario;
    private javax.swing.JPanel ContenedorFormularioInterno;
    private javax.swing.JLabel LabelTOP;
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_guardar;
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_limpiarCampos;
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_volver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private com.superventas.pos.view.components.RoundedTextField txt_apellidoEmpleado;
    private javax.swing.JPasswordField txt_contrasena;
    private com.superventas.pos.view.components.RoundedTextField txt_correoEmpleado;
    private com.superventas.pos.view.components.RoundedTextField txt_nombreEmpleado;
    private com.superventas.pos.view.components.RoundedTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
    
    public void rellenarTablaEmpleados(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "rol", "Nombre", "Apellido", "Correo Electrónico", "usuario", "contrasena"
            }
        ) {

            public boolean isCellEditable(int row, int column) {
                return false; // All cells are not editable
            }
        };

        tabla.setModel(model);
        model.setRowCount(0); // Clear the table

        List<Empleados> listaEmpleados = empDAO.LeerTodosEmpleados();
        for (Empleados empleados : listaEmpleados) {
            Object[] fila = new Object[7];
            fila[0] = empleados.getEmpleado_id();
            fila[1] = empleados.getRol_id();
            fila[2] = empleados.getNombre();
            fila[3] = empleados.getApellido();
            fila[4] = empleados.getCorreo_electronico();
            fila[5] = empleados.getUsuario();
            fila[6] = empleados.getContrasena();
            model.addRow(fila);
        }
    }

}
