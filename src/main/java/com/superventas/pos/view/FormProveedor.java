package com.superventas.pos.view;
import com.superventas.pos.model.Proveedor;
import com.superventas.pos.persistence.ProveedorDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormProveedor extends javax.swing.JFrame {
    
    private ProveedorDAO proDAO = new ProveedorDAO();
    private Proveedor acProveedor;
    private JTable tabla;
    
    public FormProveedor(String title, JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        LabelTOP.setText(title);
        this.tabla = tabla;
    }

    public FormProveedor(String title, Proveedor proveedor, JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        acProveedor = proveedor;
        this.tabla = tabla;
        LabelTOP.setText(title);
        if (title.equals("Actualizar Proveedor")) {
            //falta esto
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
        cmb_tipo = new javax.swing.JComboBox<>();
        txt_nroDoc = new com.superventas.pos.view.components.RoundedTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_razonSocial = new com.superventas.pos.view.components.RoundedTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_telefonoProveedor = new com.superventas.pos.view.components.RoundedTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_direccionProveedor = new com.superventas.pos.view.components.RoundedTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_correoProveedor = new com.superventas.pos.view.components.RoundedTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_encargadProveedor = new com.superventas.pos.view.components.RoundedTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_telefonoEncargado = new com.superventas.pos.view.components.RoundedTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmb_tipoPago = new javax.swing.JComboBox<>();
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
        LabelTOP.setText("Registro de Proveedor");
        LabelTOP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        LabelTOP.setPreferredSize(new java.awt.Dimension(209, 60));
        ContenedorFormulario.add(LabelTOP, java.awt.BorderLayout.NORTH);

        ContenedorCenter.setOpaque(false);
        ContenedorCenter.setLayout(new java.awt.GridBagLayout());

        ContenedorFormularioInterno.setOpaque(false);
        ContenedorFormularioInterno.setPreferredSize(new java.awt.Dimension(300, 350));
        ContenedorFormularioInterno.setLayout(new java.awt.GridLayout(8, 1));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "J", "V", "E", "P", "G" }));
        jPanel11.add(cmb_tipo);

        txt_nroDoc.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_nroDoc.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel11.add(txt_nroDoc);

        ContenedorFormularioInterno.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Razon Social:");
        jPanel12.add(jLabel9);

        txt_razonSocial.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_razonSocial.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanel12.add(txt_razonSocial);

        ContenedorFormularioInterno.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefono:");
        jPanel13.add(jLabel10);

        txt_telefonoProveedor.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_telefonoProveedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel13.add(txt_telefonoProveedor);

        ContenedorFormularioInterno.add(jPanel13);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dirección:");
        jPanel14.add(jLabel11);

        txt_direccionProveedor.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_direccionProveedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel14.add(txt_direccionProveedor);

        ContenedorFormularioInterno.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo:");
        jPanel15.add(jLabel12);

        txt_correoProveedor.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_correoProveedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel15.add(txt_correoProveedor);

        ContenedorFormularioInterno.add(jPanel15);

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Encargado:");
        jPanel16.add(jLabel13);

        txt_encargadProveedor.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_encargadProveedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel16.add(txt_encargadProveedor);

        ContenedorFormularioInterno.add(jPanel16);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tel Encargado:");
        jPanel17.add(jLabel14);

        txt_telefonoEncargado.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_telefonoEncargado.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel17.add(txt_telefonoEncargado);

        ContenedorFormularioInterno.add(jPanel17);

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo de pago:");
        jPanel18.add(jLabel15);

        cmb_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "TRANSFERENCIA", "DIVISA", "MIXTO" }));
        jPanel18.add(cmb_tipoPago);

        ContenedorFormularioInterno.add(jPanel18);

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
        //esto   
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarCamposActionPerformed
        //falta esto
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
    private javax.swing.JComboBox<String> cmb_tipo;
    private javax.swing.JComboBox<String> cmb_tipoPago;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private com.superventas.pos.view.components.RoundedTextField txt_correoProveedor;
    private com.superventas.pos.view.components.RoundedTextField txt_direccionProveedor;
    private com.superventas.pos.view.components.RoundedTextField txt_encargadProveedor;
    private com.superventas.pos.view.components.RoundedTextField txt_nroDoc;
    private com.superventas.pos.view.components.RoundedTextField txt_razonSocial;
    private com.superventas.pos.view.components.RoundedTextField txt_telefonoEncargado;
    private com.superventas.pos.view.components.RoundedTextField txt_telefonoProveedor;
    // End of variables declaration//GEN-END:variables
    
    public void rellenarTablaProveedor(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo_doc", "Nro Doc", "Razón Social", "Teléfono", "Dirección", "Correo Electrónico",  "Fecha Registro", "Encagado", "Tel Encagado", "Comentario", "Tipo pago"
            }
        ) {

            public boolean isCellEditable(int row, int column) {
                return false; // All cells are not editable
            }
        };

        tabla.setModel(model);
        model.setRowCount(0); // Clear the table

        List<Proveedor> listaProveedores = proDAO.LeerTodosProveedor();
        for (Proveedor proveedor : listaProveedores) {
            Object[] fila = new Object[12];
            fila[0] = proveedor.getProveedor_id();
            fila[1] = proveedor.getTipo_doc();
            fila[2] = proveedor.getNro_doc();
            fila[3] = proveedor.getRazon_social();
            fila[4] = proveedor.getTelefono();
            fila[5] = proveedor.getCorreo_electronico();
            fila[6] = proveedor.getDireccion();
            fila[7] = proveedor.getFecha_registro();
            fila[8] = proveedor.getEncargado();
            fila[9] = proveedor.getTelefono_encargado();
            fila[10] = proveedor.getComentario();
            fila[11] = proveedor.getTipo_pago();
            model.addRow(fila);
        }
    }

}
