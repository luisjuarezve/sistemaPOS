package com.superventas.pos.view.components;

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
        itemInvoice2 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice1 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice3 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice4 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice5 = new com.superventas.pos.view.components.ItemInvoice();
        itemInvoice6 = new com.superventas.pos.view.components.ItemInvoice();
        payment_invoice = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(420, 984));
        setLayout(new java.awt.BorderLayout());

        header_invoice.setBackground(new java.awt.Color(41, 1, 138));
        header_invoice.setPreferredSize(new java.awt.Dimension(430, 100));
        header_invoice.setRoundTopLeft(5);
        header_invoice.setRoundTopRight(5);
        header_invoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\bill (4) (1).png")); // NOI18N
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

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\close.png")); // NOI18N
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

        jsp_products.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsp_products.setPreferredSize(new java.awt.Dimension(376, 465));

        items.setBackground(new java.awt.Color(255, 255, 255));
        items.setLayout(new java.awt.GridLayout(6, 0, 0, 10));

        javax.swing.GroupLayout itemInvoice2Layout = new javax.swing.GroupLayout(itemInvoice2);
        itemInvoice2.setLayout(itemInvoice2Layout);
        itemInvoice2Layout.setHorizontalGroup(
            itemInvoice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        itemInvoice2Layout.setVerticalGroup(
            itemInvoice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        items.add(itemInvoice2);

        javax.swing.GroupLayout itemInvoice1Layout = new javax.swing.GroupLayout(itemInvoice1);
        itemInvoice1.setLayout(itemInvoice1Layout);
        itemInvoice1Layout.setHorizontalGroup(
            itemInvoice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        itemInvoice1Layout.setVerticalGroup(
            itemInvoice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        items.add(itemInvoice1);

        javax.swing.GroupLayout itemInvoice3Layout = new javax.swing.GroupLayout(itemInvoice3);
        itemInvoice3.setLayout(itemInvoice3Layout);
        itemInvoice3Layout.setHorizontalGroup(
            itemInvoice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        itemInvoice3Layout.setVerticalGroup(
            itemInvoice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        items.add(itemInvoice3);

        javax.swing.GroupLayout itemInvoice4Layout = new javax.swing.GroupLayout(itemInvoice4);
        itemInvoice4.setLayout(itemInvoice4Layout);
        itemInvoice4Layout.setHorizontalGroup(
            itemInvoice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        itemInvoice4Layout.setVerticalGroup(
            itemInvoice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        items.add(itemInvoice4);

        javax.swing.GroupLayout itemInvoice5Layout = new javax.swing.GroupLayout(itemInvoice5);
        itemInvoice5.setLayout(itemInvoice5Layout);
        itemInvoice5Layout.setHorizontalGroup(
            itemInvoice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        itemInvoice5Layout.setVerticalGroup(
            itemInvoice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        items.add(itemInvoice5);

        javax.swing.GroupLayout itemInvoice6Layout = new javax.swing.GroupLayout(itemInvoice6);
        itemInvoice6.setLayout(itemInvoice6Layout);
        itemInvoice6Layout.setHorizontalGroup(
            itemInvoice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        itemInvoice6Layout.setVerticalGroup(
            itemInvoice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        items.add(itemInvoice6);

        jsp_products.setViewportView(items);

        products_container.add(jsp_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, -1, -1));

        products_invoice.add(products_container, java.awt.BorderLayout.CENTER);

        add(products_invoice, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout payment_invoiceLayout = new javax.swing.GroupLayout(payment_invoice);
        payment_invoice.setLayout(payment_invoiceLayout);
        payment_invoiceLayout.setHorizontalGroup(
            payment_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        payment_invoiceLayout.setVerticalGroup(
            payment_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(payment_invoice, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content_text;
    private com.superventas.pos.view.components.RoundedPanel header_invoice;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice1;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice2;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice3;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice4;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice5;
    private com.superventas.pos.view.components.ItemInvoice itemInvoice6;
    private javax.swing.JPanel items;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jsp_products;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cedula_cliente;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_cliente_nombre;
    private javax.swing.JLabel lbl_nota;
    private javax.swing.JLabel lbl_nro_nota;
    private javax.swing.JPanel payment_invoice;
    private javax.swing.JPanel products_container;
    private javax.swing.JPanel products_invoice;
    // End of variables declaration//GEN-END:variables
}
