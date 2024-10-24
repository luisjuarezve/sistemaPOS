package com.superventas.pos.view.components;
import com.superventas.pos.model.Carrito;
import com.superventas.pos.model.Empleados;
import com.superventas.pos.view.SuperPOS;
import com.superventas.pos.view.form_tasaDolar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Admin
 */
public class MenuPrincipal extends javax.swing.JPanel {
    private Carrito carrito = new Carrito();
    private JPanel body;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(JPanel body) {
        initComponents();
        this.body= body;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        ContenedorNorth = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        roundedButton8 = new com.superventas.pos.view.components.RoundedButton();
        jPanel6 = new javax.swing.JPanel();
        roundedButton2 = new com.superventas.pos.view.components.RoundedButton();
        jPanel7 = new javax.swing.JPanel();
        roundedButton3 = new com.superventas.pos.view.components.RoundedButton();
        ContenedorCenter = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        roundedButton4 = new com.superventas.pos.view.components.RoundedButton();
        jPanel4 = new javax.swing.JPanel();
        roundedButton5 = new com.superventas.pos.view.components.RoundedButton();
        jPanel5 = new javax.swing.JPanel();
        roundedButton6 = new com.superventas.pos.view.components.RoundedButton();
        jPanel9 = new javax.swing.JPanel();
        roundedButton7 = new com.superventas.pos.view.components.RoundedButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 944));
        setLayout(new java.awt.BorderLayout());

        Contenedor.setOpaque(false);
        Contenedor.setLayout(new java.awt.GridBagLayout());

        Menu.setBackground(new java.awt.Color(204, 204, 204));
        Menu.setOpaque(false);
        Menu.setLayout(new java.awt.BorderLayout());

        ContenedorNorth.setOpaque(false);
        ContenedorNorth.setPreferredSize(new java.awt.Dimension(800, 300));
        ContenedorNorth.setLayout(new java.awt.BorderLayout());

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        roundedButton8.setBackground(new java.awt.Color(41, 1, 138));
        roundedButton8.setBorder(null);
        roundedButton8.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton8.setIcon(new ImageIcon("src/main/java/com/superventas/pos/img/NewUser.png"));
        roundedButton8.setText("Clientes (F1)");
        roundedButton8.setFocusable(false);
        roundedButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundedButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedButton8.setPreferredSize(new java.awt.Dimension(215, 290));
        roundedButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        roundedButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(roundedButton8);

        ContenedorNorth.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        roundedButton2.setBackground(new java.awt.Color(168, 8, 72));
        roundedButton2.setBorder(null);
        roundedButton2.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton2.setIcon(new ImageIcon("src/main/java/com/superventas/pos/img/ComprasCar.png"));
        roundedButton2.setText("Facturar (F2)");
        roundedButton2.setFocusable(false);
        roundedButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundedButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedButton2.setPreferredSize(new java.awt.Dimension(440, 290));
        roundedButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        roundedButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(roundedButton2);

        ContenedorNorth.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        roundedButton3.setBackground(new java.awt.Color(41, 1, 138));
        roundedButton3.setBorder(null);
        roundedButton3.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton3.setIcon(new ImageIcon
            ("src/main/java/com/superventas/pos/img/CarInventario.png"));
        roundedButton3.setText("Inventario (F3)");
        roundedButton3.setFocusable(false);
        roundedButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundedButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedButton3.setPreferredSize(new java.awt.Dimension(215, 290));
        roundedButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(roundedButton3);

        ContenedorNorth.add(jPanel7, java.awt.BorderLayout.EAST);

        Menu.add(ContenedorNorth, java.awt.BorderLayout.PAGE_START);

        ContenedorCenter.setOpaque(false);
        ContenedorCenter.setLayout(new java.awt.GridLayout(1, 4));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        roundedButton4.setBackground(new java.awt.Color(168, 8, 72));
        roundedButton4.setBorder(null);
        roundedButton4.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton4.setIcon(new ImageIcon
            ("src/main/java/com/superventas/pos/img/Proveedore.png"));
        roundedButton4.setText("Proveedores (F4)");
        roundedButton4.setFocusable(false);
        roundedButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundedButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedButton4.setPreferredSize(new java.awt.Dimension(215, 290));
        roundedButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(roundedButton4);

        ContenedorCenter.add(jPanel3);

        jPanel4.setOpaque(false);

        roundedButton5.setBackground(new java.awt.Color(41, 1, 138));
        roundedButton5.setBorder(null);
        roundedButton5.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton5.setIcon(new ImageIcon
            ("src/main/java/com/superventas/pos/img/Reportes.png"));
        roundedButton5.setText("Reportes (F5)");
        roundedButton5.setFocusable(false);
        roundedButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundedButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedButton5.setPreferredSize(new java.awt.Dimension(215, 290));
        roundedButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(roundedButton5);

        ContenedorCenter.add(jPanel4);

        jPanel5.setOpaque(false);

        roundedButton6.setBackground(new java.awt.Color(41, 1, 138));
        roundedButton6.setBorder(null);
        roundedButton6.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton6.setIcon(new ImageIcon
            ("src/main/java/com/superventas/pos/img/Empleados.png"));
        roundedButton6.setText("Empleados (F6)");
        roundedButton6.setFocusable(false);
        roundedButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundedButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedButton6.setPreferredSize(new java.awt.Dimension(215, 290));
        roundedButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(roundedButton6);

        ContenedorCenter.add(jPanel5);

        jPanel9.setOpaque(false);

        roundedButton7.setBackground(new java.awt.Color(168, 8, 72));
        roundedButton7.setBorder(null);
        roundedButton7.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton7.setIcon(new ImageIcon
            ("src/main/java/com/superventas/pos/img/Ajustex.png"));
        roundedButton7.setText("Configuracion (F7)");
        roundedButton7.setFocusable(false);
        roundedButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roundedButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundedButton7.setPreferredSize(new java.awt.Dimension(215, 290));
        roundedButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel9.add(roundedButton7);

        ContenedorCenter.add(jPanel9);

        Menu.add(ContenedorCenter, java.awt.BorderLayout.CENTER);

        Contenedor.add(Menu, new java.awt.GridBagConstraints());

        add(Contenedor, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void roundedButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedButton8ActionPerformed
        //body.removeAll();
        //body.add(new PanelClientes(body.getSize()),new java.awt.BorderLayout().CENTER);
        //body.revalidate();
        //body.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedButton8ActionPerformed

    private void roundedButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedButton2ActionPerformed
        if (SuperPOS.getTasa() == 0) {
            form_tasaDolar ftd = new form_tasaDolar(body, carrito);
            ftd.setVisible(true);
        }else{
            body.removeAll();
            BillingSection bs = new BillingSection(carrito, SuperPOS.getTasa());
            body.add(new ProductsSection(carrito, bs, SuperPOS.getTasa()), new java.awt.BorderLayout().WEST);
            body.add(bs, new java.awt.BorderLayout().EAST);
            body.revalidate();
            body.repaint();  // TODO add your handling code here:
        }
    }//GEN-LAST:event_roundedButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel ContenedorCenter;
    private javax.swing.JPanel ContenedorNorth;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.superventas.pos.view.components.RoundedButton roundedButton2;
    private com.superventas.pos.view.components.RoundedButton roundedButton3;
    private com.superventas.pos.view.components.RoundedButton roundedButton4;
    private com.superventas.pos.view.components.RoundedButton roundedButton5;
    private com.superventas.pos.view.components.RoundedButton roundedButton6;
    private com.superventas.pos.view.components.RoundedButton roundedButton7;
    private com.superventas.pos.view.components.RoundedButton roundedButton8;
    // End of variables declaration//GEN-END:variables
}
