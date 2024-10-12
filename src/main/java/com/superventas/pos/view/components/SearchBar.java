package com.superventas.pos.view.components;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class SearchBar extends JTextField {

    public SearchBar() {
        super(20);
        setBackground(new Color(102,0,255));
        setOpaque(false); // Hacer el fondo transparente automáticamente
        setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE)); // Borde inferior de 2px blanco
        setForeground(Color.WHITE); // Establecer el color del texto a blanco
        setCaretColor(Color.WHITE); // Establecer el color del cursor a blanco
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
        }
        super.paintComponent(g);
    }
    
    
    @Override
    protected void paintBorder(Graphics g) {
        // No default border painting
    }

}
