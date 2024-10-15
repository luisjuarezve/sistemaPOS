/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.superventas.pos.view.components;

import java.awt.Font;
import javax.swing.ImageIcon;

/**
 *
 * @author conta
 */
public class Item extends javax.swing.JPanel {

    /**
     * Creates new form item
     */
    public Item(String nom, double precio) {
        initComponents();
        lbl_nom_art.setText(nom);
        lbl_precio_dolar.setText(String.valueOf(precio)+" $");
        btn_agregar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border_top = new javax.swing.JPanel();
        container_item = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_nom_art = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_precio_dolar = new javax.swing.JLabel();
        lbl_separador = new javax.swing.JLabel();
        lbl_precio_bs = new javax.swing.JLabel();
        btn_agregar = new com.superventas.pos.view.components.RoundedButtonGradient();

        setMaximumSize(new java.awt.Dimension(121, 190));
        setMinimumSize(new java.awt.Dimension(121, 190));
        setPreferredSize(new java.awt.Dimension(121, 190));
        setLayout(new java.awt.BorderLayout());

        border_top.setBackground(new java.awt.Color(163, 8, 72));
        border_top.setPreferredSize(new java.awt.Dimension(130, 2));

        javax.swing.GroupLayout border_topLayout = new javax.swing.GroupLayout(border_top);
        border_top.setLayout(border_topLayout);
        border_topLayout.setHorizontalGroup(
            border_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        border_topLayout.setVerticalGroup(
            border_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        add(border_top, java.awt.BorderLayout.PAGE_START);

        container_item.setBackground(new java.awt.Color(255, 255, 255));
        container_item.setPreferredSize(new java.awt.Dimension(121, 190));
        container_item.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\OneDrive\\Documentos\\NetBeansProjects\\POS\\src\\main\\java\\com\\superventas\\pos\\img\\producto_item.jpg")); // NOI18N
        lbl_img.setPreferredSize(new java.awt.Dimension(120, 118));
        container_item.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 15));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lbl_nom_art.setText("Nombre Articulo");
        jPanel3.add(lbl_nom_art);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        lbl_precio_dolar.setText("100$");
        jPanel2.add(lbl_precio_dolar);

        lbl_separador.setText("-");
        jPanel2.add(lbl_separador);

        lbl_precio_bs.setText("400 bs");
        jPanel2.add(lbl_precio_bs);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        container_item.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, -1, -1));

        btn_agregar.setBorder(null);
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar Carrito");
        btn_agregar.setPreferredSize(new java.awt.Dimension(120, 30));
        container_item.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, -1, -1));

        add(container_item, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel border_top;
    private com.superventas.pos.view.components.RoundedButtonGradient btn_agregar;
    private javax.swing.JPanel container_item;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_nom_art;
    private javax.swing.JLabel lbl_precio_bs;
    private javax.swing.JLabel lbl_precio_dolar;
    private javax.swing.JLabel lbl_separador;
    // End of variables declaration//GEN-END:variables
}