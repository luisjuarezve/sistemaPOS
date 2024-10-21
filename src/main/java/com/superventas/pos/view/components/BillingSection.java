package com.superventas.pos.view.components;

import com.superventas.pos.model.Carrito;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class BillingSection extends javax.swing.JPanel {
    
    private Carrito carrito;
    
    public BillingSection(Carrito carrito) {
        this.carrito = carrito;
        initComponents();
        responsive();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoice_section = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(440, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invoice_section.setOpaque(false);
        invoice_section.setPreferredSize(new java.awt.Dimension(420, 904));
        invoice_section.setLayout(new java.awt.BorderLayout());
        add(invoice_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel invoice_section;
    // End of variables declaration//GEN-END:variables
   
    public void responsive(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension billingSize = billingSize = new Dimension((int) (screenSize.width*0.30), screenSize.height-80);
        setPreferredSize(billingSize);
        Dimension invoiceSize = new Dimension((int) ((screenSize.width*0.30)-20), screenSize.height-120);
        invoice_section.setPreferredSize(invoiceSize);
        invoice_section.removeAll();
        invoice_section.add(new Invoice(invoiceSize, carrito, this));
        invoice_section.revalidate();
        invoice_section.repaint();
    }
    
}
