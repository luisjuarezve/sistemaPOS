package com.superventas.pos.view.components;

import com.superventas.pos.model.Carrito;
import com.superventas.pos.model.Categorias;
import com.superventas.pos.model.Inventario;
import com.superventas.pos.model.Productos;
import com.superventas.pos.persistence.InventarioDAO;
import com.superventas.pos.persistence.ProductosDAO;
import com.superventas.pos.view.menus.PanelFacturar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CategorieButton extends JButton {
    
    private ProductosDAO proD = new ProductosDAO();
    private InventarioDAO invD = new InventarioDAO();
    private final int cornerRadius;
    private JPanel row_items;
    private Categorias categoria;
    private Carrito carrito;
    private double tasa;
    private PanelFacturar panelFacturar;

    public CategorieButton(Categorias categoria, JPanel row_items, Carrito carrito, double tasa, PanelFacturar panelFacturar) {
        super(categoria.getNombre());
        this.categoria = categoria;
        this.panelFacturar = panelFacturar;
        this.row_items = row_items;
        this.carrito = carrito;
        this.tasa = tasa;
        this.cornerRadius = 10;
        this.setPreferredSize(new Dimension(123, 123));
        this.setForeground(Color.white);
        this.setBackground(new Color(168, 8, 72));
        this.setBorder(null);
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }

            private void btn_searchActionPerformed(ActionEvent evt) {
                if (categoria.getNombre() == "TODAS") {
                    cargarProductos(proD.LeerTodosProductos());
                }else{
                    cargarProductos(proD.LeerTodosProductosCategoria(categoria.getCategoria_id()));
                }
            }
        });
        setContentAreaFilled(false);
    }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        return new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius).contains(x, y);
    }
    
    
    public void cargarProductos(List<Productos> listaProductos){
        int cant_prod = listaProductos.size()-1;
        int row_prod = (cant_prod/6);
        
        row_items.removeAll();
        row_items.revalidate();
        row_items.repaint();
        
        if (cant_prod <= 17) {
            GridLayout gl = new GridLayout(3, 6, 10, 10);
            row_items.setLayout(gl);
            for (int i = 0; i <= 17; i++) {
                if (i<=cant_prod) {
                    Inventario inventario = invD.leerInventario(listaProductos.get(i).getProducto_id());
                    if (inventario.getCantidad()>0) {
                        Item item = new Item(listaProductos.get(i), inventario, carrito, tasa, panelFacturar);
                        row_items.add(item);
                    }
                }else{
                    JPanel njp = new JPanel();
                    njp.setOpaque(false);
                    row_items.add(njp);
                }
            }
        }else{
            if (row_prod % 2 != 0) {
                row_prod += 1;
            }
            GridLayout gl = new GridLayout(row_prod, 6, 10, 10);
            row_items.setLayout(gl);
            for (int i = 0; i < cant_prod; i++) {
                Inventario inventario = invD.leerInventario(listaProductos.get(i).getProducto_id());
                if (inventario.getCantidad()>0) {
                    row_items.add(new Item(listaProductos.get(i), inventario, carrito, tasa, panelFacturar));
                }
            }
        }
    }
}
