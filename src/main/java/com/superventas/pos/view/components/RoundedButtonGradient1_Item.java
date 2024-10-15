package com.superventas.pos.view.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

public class RoundedButtonGradient1_Item extends JButton {
    private final int cornerRadius;

    public RoundedButtonGradient1_Item() {
        super("Button Rounded");
        this.setFont(new java.awt.Font("Segoe UI", 0, 14));
        this.cornerRadius = 40;
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Define los colores del gradiente
        Color startColor = new Color(38, 1, 135); // #260187
        Color endColor = new Color(163, 8, 74);  // #A3084A

        // Crea un gradiente lineal horizontal
        GradientPaint gradient = new GradientPaint(0, 0, startColor, getWidth(), 0, endColor);
        g2.setPaint(gradient);

        // Rellena el rectángulo redondeado con el gradiente
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));

        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        return new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius).contains(x, y);
    }
}
