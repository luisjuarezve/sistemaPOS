package com.superventas.pos.view.forms;
import com.superventas.pos.model.Cliente;
import com.superventas.pos.model.Inventario;
import com.superventas.pos.model.Productos;
import com.superventas.pos.persistence.InventarioDAO;
import com.superventas.pos.persistence.ProductosDAO;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormInventario extends javax.swing.JFrame {
    
    private InventarioDAO invDAO = new InventarioDAO();
    private ProductosDAO productoDAO = new ProductosDAO();
    private Inventario inventario;
    private JTable tabla;
    
    public FormInventario(String title, Inventario inventario, JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.inventario = inventario;
        this.tabla = tabla;
        LabelTOP.setText(title);
        if (title.equals("Actualizar Cliente")) {
            jPanel11.removeAll();
            txt_cantidad.setText(String.format(Locale.US, "%.2f", inventario.getCantidad()));
            txt_invMinimo.setText(String.format(Locale.US, "%.2f", inventario.getInventario_min()));
            txt_invMaximo.setText(String.format(Locale.US, "%.2f", inventario.getInventario_max()));
        }
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorFormulario = new javax.swing.JPanel();
        LabelTOP = new javax.swing.JLabel();
        ContenedorCenter = new javax.swing.JPanel();
        ContenedorFormularioInterno = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_cantidad = new com.superventas.pos.view.components.RoundedTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_invMinimo = new com.superventas.pos.view.components.RoundedTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_invMaximo = new com.superventas.pos.view.components.RoundedTextField();
        jPanel2 = new javax.swing.JPanel();
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
        LabelTOP.setText("Actualizar Inventario");
        LabelTOP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        LabelTOP.setPreferredSize(new java.awt.Dimension(209, 60));
        ContenedorFormulario.add(LabelTOP, java.awt.BorderLayout.NORTH);

        ContenedorCenter.setOpaque(false);
        ContenedorCenter.setLayout(new java.awt.GridBagLayout());

        ContenedorFormularioInterno.setOpaque(false);
        ContenedorFormularioInterno.setPreferredSize(new java.awt.Dimension(300, 350));
        ContenedorFormularioInterno.setLayout(new java.awt.GridLayout(7, 1));

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ContenedorFormularioInterno.add(jPanel4);

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

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad:");
        jPanel11.add(jLabel8);

        txt_cantidad.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_cantidad.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel11.add(txt_cantidad);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel3);

        ContenedorFormularioInterno.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Inventario Minimo:");
        jPanel12.add(jLabel9);

        txt_invMinimo.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_invMinimo.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel12.add(txt_invMinimo);

        ContenedorFormularioInterno.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Inventario Maximo:");
        jPanel13.add(jLabel10);

        txt_invMaximo.setMargin(new java.awt.Insets(2, 12, 2, 6));
        txt_invMaximo.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel13.add(txt_invMaximo);

        ContenedorFormularioInterno.add(jPanel13);

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
            String cantidad = txt_cantidad.getText();
            String invMinimo = txt_invMinimo.getText();
            String invMaximo = txt_invMaximo.getText();
            if (!cantidad.isEmpty() && !invMinimo.isEmpty() && !invMaximo.isEmpty()) {
                if (!cantidad.matches("\\d+")) {
                    JOptionPane.showMessageDialog(this, "La cantidad debe ser numérica.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!invMinimo.matches("\\d+")) {
                    JOptionPane.showMessageDialog(this, "El inventario minimo debe ser numérico.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!invMaximo.matches("\\d+")) {
                    JOptionPane.showMessageDialog(this, "El inventario maximo debe ser numérico.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                inventario.setCantidad(Double.valueOf(cantidad));
                inventario.setInventario_min(Double.valueOf(invMinimo));
                inventario.setInventario_max(Double.valueOf(invMaximo));
                invDAO.modificarInventario(String.valueOf(inventario.getProducto_id()), inventario);
                JOptionPane.showMessageDialog(null, "Inventario modificado exitosamente", "modificacion exitosa", JOptionPane.INFORMATION_MESSAGE);
                rellenarTablaProductos(tabla);
            }
            
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarCamposActionPerformed
        txt_cantidad.setText("");
        txt_invMinimo.setText("");
        txt_invMaximo.setText("");
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.superventas.pos.view.components.RoundedTextField txt_cantidad;
    private com.superventas.pos.view.components.RoundedTextField txt_invMaximo;
    private com.superventas.pos.view.components.RoundedTextField txt_invMinimo;
    // End of variables declaration//GEN-END:variables
    
   public void rellenarTablaProductos(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "id", "Producto", "Cantidad", "Inventario Minimo", "Inventario Maximo",  "Precio Compra", "Precio Venta", "Utilidad", "Total Inversion", "Total Utilidad", "Total Inversion + Utilidad"
                }
        ) {

            public boolean isCellEditable(int row, int column) {
                return false; // All cells are not editable
            }
        };

        tabla.setModel(model);
        model.setRowCount(0); // Clear the table

        List<Inventario> inventario = invDAO.leerTodosInventario();

        for (Inventario producto : inventario) {
            Productos p = productoDAO.leerProducto(String.valueOf(producto.getProducto_id()));
            Inventario i = invDAO.leerInventario(p.getProducto_id());
            double utilidad = p.getPrecio_venta()-p.getPrecio_compra();;
            Object[] fila = new Object[11];
            fila[0] = p.getProducto_id();
            fila[1] = p.getNombre();
            fila[2] = String.format(Locale.US, "%.2f", i.getCantidad());
            fila[3] = String.format(Locale.US, "%.2f", i.getInventario_min());
            fila[4] = String.format(Locale.US, "%.2f", i.getInventario_max());
            fila[5] = String.format(Locale.US, "%.2f", p.getPrecio_compra())+" $";
            fila[6] = String.format(Locale.US, "%.2f", p.getPrecio_venta())+" $";
            fila[7] = String.format(Locale.US, "%.2f", utilidad)+" $";
            fila[8] = String.format(Locale.US, "%.2f", i.getCantidad()*p.getPrecio_compra())+" $";
            fila[9] = String.format(Locale.US, "%.2f", i.getCantidad()*utilidad)+" $";
            fila[10] = String.format(Locale.US, "%.2f", i.getCantidad()*p.getPrecio_compra()+i.getCantidad()*utilidad)+" $";
            model.addRow(fila);
        }
    }

}
