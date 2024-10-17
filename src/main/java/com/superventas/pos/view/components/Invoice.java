package com.superventas.pos.view.components;

import javax.swing.ImageIcon;

public class Invoice extends javax.swing.JPanel {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        jsp_products.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header_invoice = new com.superventas.pos.view.components.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        content_text = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_nota = new javax.swing.JLabel();
        lbl_nro_nota = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_cliente = new javax.swing.JLabel();
        lbl_cliente_nombre = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_cedula_cliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        products_invoice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        products_container = new javax.swing.JPanel();
        jsp_products = new javax.swing.JScrollPane();
        items = new javax.swing.JPanel();
        itemInvoice7 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice8 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice9 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice10 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice11 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice12 = new com.superventas.pos.view.components.ItemInvoice();
        Contenedor_montoaPagar = new javax.swing.JPanel();
        Contenedor_totalPagar = new javax.swing.JPanel();
        Contenedor_totalapagar = new com.superventas.pos.view.components.RoundedPanel();
        lbl_totalApagar = new javax.swing.JLabel();
        contenedor_subtotalImpuestoTotal = new javax.swing.JPanel();
        Contenedor = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_subtotal = new javax.swing.JLabel();
        lbl_precioSubtotalDolares = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_precioSubtotalBolivares = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_porcentajeImpuesto = new javax.swing.JLabel();
        lbl_precioImpuestoDolares = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_precioImpuestoBolivares = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_precioTotalapagarDolares = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_PrecioTotalapagarBolivares = new javax.swing.JLabel();
        Separador = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        payment_invoice = new javax.swing.JPanel();
        contenedor_buttom = new javax.swing.JPanel();
        roundedButton1_Invoice1 = new com.superventas.pos.view.components.RoundedButton1_Invoice();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(420, 984));
        setLayout(new java.awt.BorderLayout());

        header_invoice.setBackground(new java.awt.Color(41, 1, 138));
        header_invoice.setPreferredSize(new java.awt.Dimension(430, 100));
        header_invoice.setRoundTopLeft(5);
        header_invoice.setRoundTopRight(5);
        header_invoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\bill.png"));
        header_invoice.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        content_text.setOpaque(false);
        content_text.setPreferredSize(new java.awt.Dimension(300, 80));
        content_text.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_nota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nota.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nota.setText("Nota de Entrega: N°");
        jPanel2.add(lbl_nota);

        lbl_nro_nota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nro_nota.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nro_nota.setText("00001");
        jPanel2.add(lbl_nro_nota);

        jPanel1.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_cliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cliente.setText("Nombre Cliente:");
        jPanel3.add(lbl_cliente);

        lbl_cliente_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_cliente_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cliente_nombre.setText("Luis Juarez");
        jPanel3.add(lbl_cliente_nombre);

        jPanel1.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_cedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cedula.setText("Cedula Cliente:");
        jPanel4.add(lbl_cedula);

        lbl_cedula_cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_cedula_cliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cedula_cliente.setText("V.-00.000.000");
        jPanel4.add(lbl_cedula_cliente);

        jPanel1.add(jPanel4);

        content_text.add(jPanel1);

        header_invoice.add(content_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jButton1.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\close.png"));
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        header_invoice.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        add(header_invoice, java.awt.BorderLayout.PAGE_START);

        products_invoice.setOpaque(false);
        products_invoice.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Articulos Seleccionados");
        jLabel1.setPreferredSize(new java.awt.Dimension(141, 50));
        products_invoice.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        products_container.setOpaque(false);
        products_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jsp_products.setBorder(null);
        jsp_products.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsp_products.setPreferredSize(new java.awt.Dimension(376, 465));

        items.setBackground(new java.awt.Color(255, 255, 255));
        items.setLayout(new java.awt.GridLayout(6, 0, 0, 10));
        items.add(itemInvoice7);
        items.add(itemInvoice8);
        items.add(itemInvoice9);
        items.add(itemInvoice10);
        items.add(itemInvoice11);
        items.add(itemInvoice12);

        jsp_products.setViewportView(items);

        products_container.add(jsp_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, -1, -1));

        products_invoice.add(products_container, java.awt.BorderLayout.CENTER);

        Contenedor_montoaPagar.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor_montoaPagar.setPreferredSize(new java.awt.Dimension(430, 177));
        Contenedor_montoaPagar.setLayout(new java.awt.BorderLayout());

        Contenedor_totalPagar.setOpaque(false);
        Contenedor_totalPagar.setPreferredSize(new java.awt.Dimension(430, 78));
        Contenedor_totalPagar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor_totalapagar.setBackground(new java.awt.Color(168, 8, 72));
        Contenedor_totalapagar.setPreferredSize(new java.awt.Dimension(400, 68));
        Contenedor_totalapagar.setRoundBottomLeft(10);
        Contenedor_totalapagar.setRoundBottomRight(10);
        Contenedor_totalapagar.setRoundTopLeft(10);
        Contenedor_totalapagar.setRoundTopRight(10);
        Contenedor_totalapagar.setLayout(new java.awt.BorderLayout());

        lbl_totalApagar.setBackground(new java.awt.Color(255, 255, 255));
        lbl_totalApagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_totalApagar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_totalApagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_totalApagar.setText("Monto a pagar");
        lbl_totalApagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Contenedor_totalapagar.add(lbl_totalApagar, java.awt.BorderLayout.CENTER);

        Contenedor_totalPagar.add(Contenedor_totalapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        Contenedor_montoaPagar.add(Contenedor_totalPagar, java.awt.BorderLayout.NORTH);

        contenedor_subtotalImpuestoTotal.setOpaque(false);
        contenedor_subtotalImpuestoTotal.setPreferredSize(new java.awt.Dimension(430, 69));

        Contenedor.setOpaque(false);
        Contenedor.setPreferredSize(new java.awt.Dimension(320, 68));
        Contenedor.setLayout(new java.awt.GridLayout(3, 0));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        lbl_subtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_subtotal.setText("Subtotal:");
        lbl_subtotal.setToolTipText("");
        jPanel6.add(lbl_subtotal);

        lbl_precioSubtotalDolares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_precioSubtotalDolares.setText("1000$");
        jPanel6.add(lbl_precioSubtotalDolares);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("-");
        jPanel6.add(jLabel7);

        lbl_precioSubtotalBolivares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_precioSubtotalBolivares.setText("400bs");
        jPanel6.add(lbl_precioSubtotalBolivares);

        Contenedor.add(jPanel6);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Impuesto");
        jPanel8.add(jLabel4);

        lbl_porcentajeImpuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_porcentajeImpuesto.setText("16% :");
        jPanel8.add(lbl_porcentajeImpuesto);

        lbl_precioImpuestoDolares.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_precioImpuestoDolares.setText("1000$");
        jPanel8.add(lbl_precioImpuestoDolares);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("-");
        jPanel8.add(jLabel6);

        lbl_precioImpuestoBolivares.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_precioImpuestoBolivares.setText("4000bs");
        jPanel8.add(lbl_precioImpuestoBolivares);

        Contenedor.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Total a pagar:");
        jPanel9.add(jLabel5);

        lbl_precioTotalapagarDolares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_precioTotalapagarDolares.setText("10000$");
        jPanel9.add(lbl_precioTotalapagarDolares);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("-");
        jPanel9.add(jLabel8);

        lbl_PrecioTotalapagarBolivares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_PrecioTotalapagarBolivares.setText("40000bs");
        jPanel9.add(lbl_PrecioTotalapagarBolivares);

        Contenedor.add(jPanel9);

        contenedor_subtotalImpuestoTotal.add(Contenedor);

        Contenedor_montoaPagar.add(contenedor_subtotalImpuestoTotal, java.awt.BorderLayout.CENTER);

        Separador.setBackground(new java.awt.Color(255, 255, 255));
        Separador.setOpaque(false);
        Separador.setPreferredSize(new java.awt.Dimension(420, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(400, 1));
        Separador.add(jLabel3);

        Contenedor_montoaPagar.add(Separador, java.awt.BorderLayout.SOUTH);

        products_invoice.add(Contenedor_montoaPagar, java.awt.BorderLayout.SOUTH);

        add(products_invoice, java.awt.BorderLayout.CENTER);

        payment_invoice.setOpaque(false);
        payment_invoice.setPreferredSize(new java.awt.Dimension(430, 100));

        contenedor_buttom.setOpaque(false);
        contenedor_buttom.setPreferredSize(new java.awt.Dimension(400, 90));
        contenedor_buttom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        roundedButton1_Invoice1.setBackground(new java.awt.Color(41, 1, 138));
        roundedButton1_Invoice1.setBorder(null);
        roundedButton1_Invoice1.setForeground(new java.awt.Color(255, 255, 255));
        roundedButton1_Invoice1.setText("Cobrar");
        roundedButton1_Invoice1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        roundedButton1_Invoice1.setPreferredSize(new java.awt.Dimension(400, 90));
        contenedor_buttom.add(roundedButton1_Invoice1);

        payment_invoice.add(contenedor_buttom);

        add(payment_invoice, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Contenedor_montoaPagar;
    private javax.swing.JPanel Contenedor_totalPagar;
    private com.superventas.pos.view.components.RoundedPanel Contenedor_totalapagar;
    private javax.swing.JPanel Separador;
    private javax.swing.JPanel contenedor_buttom;
    private javax.swing.JPanel contenedor_subtotalImpuestoTotal;
    private javax.swing.JPanel content_text;
    private com.superventas.pos.view.components.RoundedPanel header_invoice;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice10;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice11;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice12;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice7;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice8;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice9;
    private javax.swing.JPanel items;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jsp_products;
    private javax.swing.JLabel lbl_PrecioTotalapagarBolivares;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cedula_cliente;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_cliente_nombre;
    private javax.swing.JLabel lbl_nota;
    private javax.swing.JLabel lbl_nro_nota;
    private javax.swing.JLabel lbl_porcentajeImpuesto;
    private javax.swing.JLabel lbl_precioImpuestoBolivares;
    private javax.swing.JLabel lbl_precioImpuestoDolares;
    private javax.swing.JLabel lbl_precioSubtotalBolivares;
    private javax.swing.JLabel lbl_precioSubtotalDolares;
    private javax.swing.JLabel lbl_precioTotalapagarDolares;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_totalApagar;
    private javax.swing.JPanel payment_invoice;
    private javax.swing.JPanel products_container;
    private javax.swing.JPanel products_invoice;
    private com.superventas.pos.view.components.RoundedButton1_Invoice roundedButton1_Invoice1;
    // End of variables declaration//GEN-END:variables
}
