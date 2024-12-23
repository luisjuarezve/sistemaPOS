package com.superventas.pos.view.menus;

import com.superventas.pos.model.Cliente;
import com.superventas.pos.model.Proveedor;
import com.superventas.pos.persistence.ClienteDAO;
import com.superventas.pos.persistence.ProveedorDAO;
import com.superventas.pos.view.forms.FormCliente;
import com.superventas.pos.view.forms.FormProveedor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class PanelProveedor extends javax.swing.JPanel {
    
    ProveedorDAO proDAO = new ProveedorDAO();
    
    public PanelProveedor(Dimension tamaño) {
        initComponents();
        this.setPreferredSize(tamaño);
        responsive(tamaño);
        rellenarTablaProveedor(jTable2); 
    }
    
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
            if (proveedor.getProveedor_id()>0) {
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor_Principal = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Contenedor_table = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Contenedor_Button = new javax.swing.JPanel();
        roundedPanel2 = new com.superventas.pos.view.components.RoundedPanel();
        btn_nuevoCliente = new com.superventas.pos.view.components.RoundedButton1_Invoice();
        btn_eliminarCliente = new com.superventas.pos.view.components.RoundedButton1_Invoice();
        btn_modificarCliente = new com.superventas.pos.view.components.RoundedButton1_Invoice();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 944));
        setLayout(new java.awt.GridBagLayout());

        Contenedor_Principal.setOpaque(false);
        Contenedor_Principal.setPreferredSize(new java.awt.Dimension(900, 600));
        Contenedor_Principal.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(41, 1, 138));
        Header.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Header.setPreferredSize(new java.awt.Dimension(900, 80));
        Header.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de proveedores");
        Header.add(jLabel1, new java.awt.GridBagConstraints());

        Contenedor_Principal.add(Header, java.awt.BorderLayout.NORTH);

        Contenedor_table.setBackground(new java.awt.Color(41, 1, 138));
        Contenedor_table.setPreferredSize(new java.awt.Dimension(750, 500));
        Contenedor_table.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(700, 402));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo Doc", "Nro Doc", "Razon Social", "Telefono", "Direccion", "Correo Electronico", "Fecha Registro", "Encargado", "Telefono Encargado", "Comentario", "Tipo Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setOpaque(false);
        jTable2.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(jTable2);

        Contenedor_table.add(jScrollPane2, new java.awt.GridBagConstraints());

        Contenedor_Principal.add(Contenedor_table, java.awt.BorderLayout.CENTER);

        Contenedor_Button.setBackground(new java.awt.Color(41, 1, 138));
        Contenedor_Button.setLayout(new java.awt.GridBagLayout());

        roundedPanel2.setBackground(new java.awt.Color(41, 1, 138));
        roundedPanel2.setOpaque(true);
        roundedPanel2.setPreferredSize(new java.awt.Dimension(100, 350));
        roundedPanel2.setRoundBottomLeft(20);
        roundedPanel2.setRoundBottomRight(20);
        roundedPanel2.setRoundTopLeft(20);
        roundedPanel2.setRoundTopRight(20);
        roundedPanel2.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        btn_nuevoCliente.setBackground(new java.awt.Color(168, 8, 72));
        btn_nuevoCliente.setBorder(null);
        btn_nuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevoCliente.setText("Nuevo");
        btn_nuevoCliente.setFocusable(false);
        btn_nuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_nuevoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevoCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoClienteActionPerformed(evt);
            }
        });
        roundedPanel2.add(btn_nuevoCliente);

        btn_eliminarCliente.setBackground(new java.awt.Color(168, 8, 72));
        btn_eliminarCliente.setBorder(null);
        btn_eliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarCliente.setText("Eliminar");
        btn_eliminarCliente.setFocusable(false);
        btn_eliminarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarClienteActionPerformed(evt);
            }
        });
        roundedPanel2.add(btn_eliminarCliente);

        btn_modificarCliente.setBackground(new java.awt.Color(168, 8, 72));
        btn_modificarCliente.setBorder(null);
        btn_modificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificarCliente.setText("Modificar");
        btn_modificarCliente.setFocusable(false);
        btn_modificarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_modificarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarClienteActionPerformed(evt);
            }
        });
        roundedPanel2.add(btn_modificarCliente);

        Contenedor_Button.add(roundedPanel2, new java.awt.GridBagConstraints());

        Contenedor_Principal.add(Contenedor_Button, java.awt.BorderLayout.EAST);

        add(Contenedor_Principal, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoClienteActionPerformed
        new FormProveedor("Registro de Proveedor", jTable2);
    }//GEN-LAST:event_btn_nuevoClienteActionPerformed

    private void btn_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarClienteActionPerformed
         if (jTable2.getRowCount()>0) {
            if(jTable2.getSelectedRow()!=-1){
                int id_proveedor = Integer.parseInt(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0)));
                new FormProveedor("Actualizar Proveedor",proDAO.leerProveedor(id_proveedor), jTable2);
            }
        }
    }//GEN-LAST:event_btn_modificarClienteActionPerformed

    private void btn_eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarClienteActionPerformed
        if (jTable2.getRowCount()>0) {
            if(jTable2.getSelectedRow()!=-1){
                int id_proveedor = Integer.parseInt(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0)));
                proDAO.eliminarProveedor(id_proveedor);
                JOptionPane.showMessageDialog(null, "Proveedor eliminado exitosamente", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
                rellenarTablaProveedor(jTable2);
            }
           
        }
    }//GEN-LAST:event_btn_eliminarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor_Button;
    private javax.swing.JPanel Contenedor_Principal;
    private javax.swing.JPanel Contenedor_table;
    private javax.swing.JPanel Header;
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_eliminarCliente;
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_modificarCliente;
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_nuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private com.superventas.pos.view.components.RoundedPanel roundedPanel2;
    // End of variables declaration//GEN-END:variables

    private void responsive(Dimension tamaño){
        int contPriW = (int)(tamaño.getWidth()*0.9);
        int contPriH = (int)(tamaño.getHeight()*0.7);
        int contTablW = (int)(tamaño.getWidth()*0.8);
        int contTablH = (int)(tamaño.getHeight()*0.7)-80;
        int contBtnW =  (int) (tamaño.getWidth()*0.2);
        int contBtnH =  (int) (tamaño.getHeight()*0.7)-80;
        
        Contenedor_Principal.setPreferredSize(new Dimension(contPriW, contPriH));
        Contenedor_table.setPreferredSize(new Dimension(contTablW, contTablH));
        jScrollPane2.setPreferredSize(new Dimension((int) (contTablW*0.8), (int) (contTablH*0.8)));
        Contenedor_Button.setPreferredSize(new Dimension(contBtnW, contBtnH));
        roundedPanel2.setPreferredSize(new Dimension((int)(contBtnW*0.8),(int)(contBtnH*0.8)));
        btn_nuevoCliente.setIcon(redimensionarIcon("src\\main\\java\\com\\superventas\\pos\\img\\NewUser.png", 32, 32));
        btn_modificarCliente.setIcon(redimensionarIcon("src\\main\\java\\com\\superventas\\pos\\img\\Modify.png", 32, 32));
        btn_eliminarCliente.setIcon(redimensionarIcon("src\\main\\java\\com\\superventas\\pos\\img\\DeletUser.png", 32, 32));
    }
    
    private static ImageIcon redimensionarIcon (String url, int width,int height){
        ImageIcon icon = new ImageIcon(url);
        // Obtener la imagen original
        Image img = icon.getImage();
        // Redimensionar la imagen
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon newIcon = new ImageIcon(newImg);
        return newIcon;
    }
}
