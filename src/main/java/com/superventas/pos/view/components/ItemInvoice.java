package com.superventas.pos.view.components;
import com.superventas.pos.model.Carrito;
import com.superventas.pos.model.Inventario;
import com.superventas.pos.model.Productos;
import com.superventas.pos.view.SuperPOS;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author conta
 */
public class ItemInvoice extends javax.swing.JPanel {
    
    private Carrito carrito;
    private Productos productos;
    private BillingSection bs;
    private Inventario inventario;
    
    public ItemInvoice(Dimension size, Productos producto, int cantidad, Inventario inventario, Carrito carrito, BillingSection bs) {
        initComponents();
        this.bs = bs;
        this.productos = producto;
        this.carrito = carrito;
        this.inventario = inventario;
        this.setPreferredSize(size);
        double tasa = 39.0;
        lbl_img.setIcon(redimensionarIcon(producto.getFoto(), 65, 65));
        lbl_cantidad.setText(String.valueOf(cantidad));
        lbl_cantidad_existencia.setText(String.valueOf(inventario.getCantidad()));
        lbl_nombreArticulo.setText(producto.getNombre());
        lbl_precioDolares.setText(String.valueOf(producto.getPrecio_venta())+" $");
        lbl_precioBolivares.setText(String.valueOf(producto.getPrecio_venta()*tasa)+" Bs");
        lbl_totalPrecioDolares.setText(String.valueOf(producto.getPrecio_venta()*cantidad)+" $");
        lbl_totalPrecioBolivares.setText(String.valueOf(producto.getPrecio_venta()*cantidad*tasa)+" Bs");
        jPanel1.setPreferredSize(new Dimension(size.width-20, size.height-10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_menos = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_nombreArticulo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_precioDolares = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_precioBolivares = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        lbl_asd = new javax.swing.JLabel();
        lbl_existencia1 = new javax.swing.JLabel();
        lbl_cantidad_existencia = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_totalPrecioDolares = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_totalPrecioBolivares = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(356, 85));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(336, 75));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel8.setOpaque(false);

        btn_menos.setBackground(new java.awt.Color(168, 8, 72));
        btn_menos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_menos.setForeground(new java.awt.Color(255, 255, 255));
        btn_menos.setText("+");
        btn_menos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_menos.setFocusable(false);
        btn_menos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_menos.setPreferredSize(new java.awt.Dimension(35, 35));
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });
        jPanel8.add(btn_menos);

        btn_mas.setBackground(new java.awt.Color(41, 1, 138));
        btn_mas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_mas.setForeground(new java.awt.Color(255, 255, 255));
        btn_mas.setText("-");
        btn_mas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_mas.setFocusable(false);
        btn_mas.setPreferredSize(new java.awt.Dimension(35, 35));
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });
        jPanel8.add(btn_mas);

        jPanel3.add(jPanel8, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(4, 0));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_nombreArticulo.setText("Nombre Articulo");
        jPanel2.add(lbl_nombreArticulo);

        jPanel4.add(jPanel2);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jLabel3.setText("Precio:");
        jPanel5.add(jLabel3);

        lbl_precioDolares.setText("10$");
        jPanel5.add(lbl_precioDolares);

        jLabel2.setText("-");
        jPanel5.add(jLabel2);

        lbl_precioBolivares.setText("100bs");
        jPanel5.add(lbl_precioBolivares);

        jPanel4.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jLabel4.setText("Und");
        jPanel6.add(jLabel4);

        lbl_cantidad.setText("10");
        jPanel6.add(lbl_cantidad);

        lbl_asd.setText("-");
        jPanel6.add(lbl_asd);

        lbl_existencia1.setText("Existencia:");
        jPanel6.add(lbl_existencia1);

        lbl_cantidad_existencia.setText("0");
        jPanel6.add(lbl_cantidad_existencia);

        jPanel4.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jLabel5.setText("Total:");
        jPanel7.add(jLabel5);

        lbl_totalPrecioDolares.setText("100$");
        jPanel7.add(lbl_totalPrecioDolares);

        jLabel6.setText("-");
        jPanel7.add(jLabel6);

        lbl_totalPrecioBolivares.setText("1000bs");
        jPanel7.add(lbl_totalPrecioBolivares);

        jPanel4.add(jPanel7);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        lbl_img.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\producto_item_invoice.jpg")
        );
        lbl_img.setPreferredSize(new java.awt.Dimension(65, 65));
        jPanel1.add(lbl_img, java.awt.BorderLayout.WEST);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setPreferredSize(new java.awt.Dimension(365, 2));
        add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        carrito.disminuirProducto(productos);
        bs.responsive();
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        carrito.agregarProducto(productos, inventario);
        bs.responsive();
    }//GEN-LAST:event_btn_menosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_asd;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_cantidad_existencia;
    private javax.swing.JLabel lbl_existencia1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_nombreArticulo;
    private javax.swing.JLabel lbl_precioBolivares;
    private javax.swing.JLabel lbl_precioDolares;
    private javax.swing.JLabel lbl_totalPrecioBolivares;
    private javax.swing.JLabel lbl_totalPrecioDolares;
    // End of variables declaration//GEN-END:variables
    
    public ImageIcon redimensionarIcon (String url, int width,int height){
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
