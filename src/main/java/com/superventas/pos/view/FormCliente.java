/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.superventas.pos.view;
import com.superventas.pos.model.Cliente;
import com.superventas.pos.persistence.ClienteDAO;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormCliente extends javax.swing.JFrame {
    
    private ClienteDAO cli = new ClienteDAO();
    private Cliente acCliente;
    private JTable tabla;
    
    public FormCliente(String title, JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        LabelTOP.setText(title);
        this.tabla = tabla;
    }

    public FormCliente(String title,Cliente cliente, JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        acCliente= cliente;
        this.tabla = tabla;
        LabelTOP.setText(title);
        if (title.equals("Actualizar Cliente")) {
            jPanel11.removeAll();
            
            txt_nombreCliente.setText(cliente.getNombre());
            txt_apellidoCliente.setText(cliente.getApellido());
            txt_telefonoCliente.setText(cliente.getTelefono());
            txt_correoCliente.setText(cliente.getCorreoElectronico());
            txt_direccionCliente.setText(cliente.getDireccion());
            txt_comentarioCliente.setText(cliente.getComentarios());
        }
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorFormulario = new javax.swing.JPanel();
        LabelTOP = new javax.swing.JLabel();
        ContenedorCenter = new javax.swing.JPanel();
        ContenedorFormularioInterno = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_cedulaCliente = new com.superventas.pos.view.components.RoundedTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombreCliente = new com.superventas.pos.view.components.RoundedTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_apellidoCliente = new com.superventas.pos.view.components.RoundedTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_telefonoCliente = new com.superventas.pos.view.components.RoundedTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_correoCliente = new com.superventas.pos.view.components.RoundedTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_direccionCliente = new com.superventas.pos.view.components.RoundedTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_comentarioCliente = new com.superventas.pos.view.components.RoundedTextField();
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
        LabelTOP.setText("Crear cliente");
        LabelTOP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        LabelTOP.setPreferredSize(new java.awt.Dimension(209, 60));
        ContenedorFormulario.add(LabelTOP, java.awt.BorderLayout.NORTH);

        ContenedorCenter.setOpaque(false);
        ContenedorCenter.setLayout(new java.awt.GridBagLayout());

        ContenedorFormularioInterno.setOpaque(false);
        ContenedorFormularioInterno.setPreferredSize(new java.awt.Dimension(300, 350));
        ContenedorFormularioInterno.setLayout(new java.awt.GridLayout(7, 1));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cedula:");
        jPanel11.add(jLabel8);

        txt_cedulaCliente.setBorder(null);
        txt_cedulaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_cedulaCliente.setMargin(new java.awt.Insets(5, 10, 2, 6));
        txt_cedulaCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel11.add(txt_cedulaCliente);

        ContenedorFormularioInterno.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");
        jPanel12.add(jLabel9);

        txt_nombreCliente.setBorder(null);
        txt_nombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nombreCliente.setMargin(new java.awt.Insets(5, 10, 2, 6));
        txt_nombreCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel12.add(txt_nombreCliente);

        ContenedorFormularioInterno.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido:");
        jPanel13.add(jLabel10);

        txt_apellidoCliente.setBorder(null);
        txt_apellidoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_apellidoCliente.setMargin(new java.awt.Insets(5, 10, 2, 6));
        txt_apellidoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel13.add(txt_apellidoCliente);

        ContenedorFormularioInterno.add(jPanel13);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefono:");
        jPanel14.add(jLabel11);

        txt_telefonoCliente.setBorder(null);
        txt_telefonoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_telefonoCliente.setMargin(new java.awt.Insets(5, 10, 2, 6));
        txt_telefonoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel14.add(txt_telefonoCliente);

        ContenedorFormularioInterno.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo:");
        jPanel15.add(jLabel12);

        txt_correoCliente.setBorder(null);
        txt_correoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_correoCliente.setMargin(new java.awt.Insets(5, 10, 2, 6));
        txt_correoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel15.add(txt_correoCliente);

        ContenedorFormularioInterno.add(jPanel15);

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Direccion:");
        jPanel16.add(jLabel13);

        txt_direccionCliente.setBorder(null);
        txt_direccionCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_direccionCliente.setMargin(new java.awt.Insets(5, 10, 2, 6));
        txt_direccionCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel16.add(txt_direccionCliente);

        ContenedorFormularioInterno.add(jPanel16);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Comentario:");
        jPanel17.add(jLabel14);

        txt_comentarioCliente.setBorder(null);
        txt_comentarioCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_comentarioCliente.setMargin(new java.awt.Insets(5, 6, 2, 6));
        txt_comentarioCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel17.add(txt_comentarioCliente);

        ContenedorFormularioInterno.add(jPanel17);

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
        if (LabelTOP.getText().equals("Registro de Cliente")) {
            Cliente cliente = new Cliente();
            // Asignar valores del formulario al objeto cliente
            String cedula = txt_cedulaCliente.getText();
            if (!cedula.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "La cédula debe ser numérica.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String telefono = txt_telefonoCliente.getText();
            if (!telefono.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "El telefono debe ser numérico.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            cliente.setCedula(cedula);
            cliente.setNombre(txt_nombreCliente.getText());
            cliente.setApellido(txt_apellidoCliente.getText());
            cliente.setTelefono(txt_telefonoCliente.getText());
            cliente.setCorreoElectronico(txt_correoCliente.getText());
            cliente.setDireccion(txt_direccionCliente.getText());
            cliente.setComentarios(txt_comentarioCliente.getText());
            try {
                if (cli.leerClienteCedula(cedula) != null) {
                    JOptionPane.showMessageDialog(this, "La cédula ya está registrada.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }else{
                    cli.insertarCliente(cliente);
                    rellenarTablaClientes(tabla);
                    this.dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if (LabelTOP.getText().equals("Actualizar Cliente")) {
            cli.modificarCliente(acCliente.getCedula(), new Cliente(0, "0", txt_nombreCliente.getText(),txt_apellidoCliente.getText(), txt_telefonoCliente.getText(), txt_correoCliente.getText(), txt_direccionCliente.getText(), txt_comentarioCliente.getText()));
            this.dispose();
            JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente", "Cliente modificado exitosamente", JOptionPane.INFORMATION_MESSAGE);
            rellenarTablaClientes(tabla);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarCamposActionPerformed
        txt_cedulaCliente.setText("");
        txt_nombreCliente.setText("");
        txt_apellidoCliente.setText("");
        txt_telefonoCliente.setText("");
        txt_correoCliente.setText("");
        txt_direccionCliente.setText("");
        txt_comentarioCliente.setText("");
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private com.superventas.pos.view.components.RoundedTextField txt_apellidoCliente;
    private com.superventas.pos.view.components.RoundedTextField txt_cedulaCliente;
    private com.superventas.pos.view.components.RoundedTextField txt_comentarioCliente;
    private com.superventas.pos.view.components.RoundedTextField txt_correoCliente;
    private com.superventas.pos.view.components.RoundedTextField txt_direccionCliente;
    private com.superventas.pos.view.components.RoundedTextField txt_nombreCliente;
    private com.superventas.pos.view.components.RoundedTextField txt_telefonoCliente;
    // End of variables declaration//GEN-END:variables
    
    public void rellenarTablaClientes(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cédula", "Nombre", "Apellido", "Teléfono", "Correo Electrónico", "Dirección", "Comentarios"
            }
        ) {

            public boolean isCellEditable(int row, int column) {
                return false; // All cells are not editable
            }
        };

        tabla.setModel(model);
        model.setRowCount(0); // Clear the table

        List<Cliente> listaClientes = cli.LeerTodosClientes();
        for (Cliente cliente : listaClientes) {
            Object[] fila = new Object[8];
            fila[0] = cliente.getCliente_id(); 
            fila[1] = cliente.getCedula();
            fila[2] = cliente.getNombre();
            fila[3] = cliente.getApellido();
            fila[4] = cliente.getTelefono();
            fila[5] = cliente.getCorreoElectronico();
            fila[6] = cliente.getDireccion();
            fila[7] = cliente.getComentarios();
            model.addRow(fila);
        }
    }

}
