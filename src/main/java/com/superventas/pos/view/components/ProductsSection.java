package com.superventas.pos.view.components;

import com.superventas.pos.model.Productos;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class ProductsSection extends javax.swing.JPanel {

    public ProductsSection() {
        initComponents();
        List<Productos> listaProductos = new ArrayList<>();
        listaProductos.add(new Productos(1, 123, "Leche en polvo", "", "", "UNIDAD", 10.0, 0.30, 13.0, 12.0, 0.0, 1, 1));
        listaProductos.add(new Productos(2, 456, "Mantequilla", "", "", "UNIDAD", 20.0, 0.30, 26.0, 24.0, 0.0, 1, 1));
        cargarProductos(listaProductos);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        jsp_categoria.getHorizontalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        section_search = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        searchBar1 = new com.superventas.pos.view.components.SearchBar();
        btn_search = new javax.swing.JButton();
        section_items = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        row_items = new javax.swing.JPanel();
        section_categories = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jsp_categoria = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        categorieButton8 = new com.superventas.pos.view.components.CategorieButton();
        categorieButton9 = new com.superventas.pos.view.components.CategorieButton();
        categorieButton10 = new com.superventas.pos.view.components.CategorieButton();
        categorieButton11 = new com.superventas.pos.view.components.CategorieButton();
        categorieButton12 = new com.superventas.pos.view.components.CategorieButton();
        categorieButton13 = new com.superventas.pos.view.components.CategorieButton();
        categorieButton14 = new com.superventas.pos.view.components.CategorieButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(840, 944));
        setLayout(new java.awt.BorderLayout());

        section_search.setBackground(new java.awt.Color(204, 204, 204));
        section_search.setOpaque(false);
        section_search.setPreferredSize(new java.awt.Dimension(840, 100));
        section_search.setLayout(new java.awt.GridBagLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        searchBar1.setText("ESCRIBE EL NOMBRE O CODIGO DEL PRODUCTO A BUSCAR");
        searchBar1.setPreferredSize(new java.awt.Dimension(735, 60));
        jPanel3.add(searchBar1);

        btn_search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\SistemaPOS\\sistemaPOS\\src\\main\\java\\com\\superventas\\pos\\img\\search.png")); // NOI18N
        btn_search.setBorder(null);
        btn_search.setBorderPainted(false);
        btn_search.setContentAreaFilled(false);
        btn_search.setFocusable(false);
        btn_search.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel3.add(btn_search);

        section_search.add(jPanel3, new java.awt.GridBagConstraints());

        add(section_search, java.awt.BorderLayout.PAGE_START);

        section_items.setBackground(new java.awt.Color(255, 255, 255));
        section_items.setOpaque(false);
        section_items.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(800, 687));

        row_items.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout row_itemsLayout = new javax.swing.GroupLayout(row_items);
        row_items.setLayout(row_itemsLayout);
        row_itemsLayout.setHorizontalGroup(
            row_itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        row_itemsLayout.setVerticalGroup(
            row_itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(row_items);

        section_items.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(section_items, java.awt.BorderLayout.CENTER);

        section_categories.setBackground(new java.awt.Color(255, 255, 255));
        section_categories.setOpaque(false);
        section_categories.setPreferredSize(new java.awt.Dimension(100, 137));
        section_categories.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(776, 137));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jsp_categoria.setBackground(new java.awt.Color(255, 255, 255));
        jsp_categoria.setBorder(null);
        jsp_categoria.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jsp_categoria.setFocusable(false);
        jsp_categoria.setPreferredSize(new java.awt.Dimension(840, 137));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        categorieButton8.setBackground(new java.awt.Color(168, 8, 72));
        categorieButton8.setBorder(null);
        categorieButton8.setForeground(new java.awt.Color(255, 255, 255));
        categorieButton8.setText("Categoria1");
        categorieButton8.setPreferredSize(new java.awt.Dimension(123, 123));
        jPanel1.add(categorieButton8);

        categorieButton9.setBackground(new java.awt.Color(168, 8, 72));
        categorieButton9.setBorder(null);
        categorieButton9.setForeground(new java.awt.Color(255, 255, 255));
        categorieButton9.setText("Categoria1");
        categorieButton9.setPreferredSize(new java.awt.Dimension(123, 123));
        jPanel1.add(categorieButton9);

        categorieButton10.setBackground(new java.awt.Color(168, 8, 72));
        categorieButton10.setBorder(null);
        categorieButton10.setForeground(new java.awt.Color(255, 255, 255));
        categorieButton10.setText("Categoria1");
        categorieButton10.setPreferredSize(new java.awt.Dimension(123, 123));
        jPanel1.add(categorieButton10);

        categorieButton11.setBackground(new java.awt.Color(168, 8, 72));
        categorieButton11.setBorder(null);
        categorieButton11.setForeground(new java.awt.Color(255, 255, 255));
        categorieButton11.setText("Categoria1");
        categorieButton11.setPreferredSize(new java.awt.Dimension(123, 123));
        jPanel1.add(categorieButton11);

        categorieButton12.setBackground(new java.awt.Color(168, 8, 72));
        categorieButton12.setBorder(null);
        categorieButton12.setForeground(new java.awt.Color(255, 255, 255));
        categorieButton12.setText("Categoria1");
        categorieButton12.setPreferredSize(new java.awt.Dimension(123, 123));
        jPanel1.add(categorieButton12);

        categorieButton13.setBackground(new java.awt.Color(168, 8, 72));
        categorieButton13.setBorder(null);
        categorieButton13.setForeground(new java.awt.Color(255, 255, 255));
        categorieButton13.setText("Categoria1");
        categorieButton13.setPreferredSize(new java.awt.Dimension(123, 123));
        jPanel1.add(categorieButton13);

        categorieButton14.setBackground(new java.awt.Color(168, 8, 72));
        categorieButton14.setBorder(null);
        categorieButton14.setForeground(new java.awt.Color(255, 255, 255));
        categorieButton14.setText("Categoria1");
        categorieButton14.setPreferredSize(new java.awt.Dimension(123, 123));
        jPanel1.add(categorieButton14);

        jsp_categoria.setViewportView(jPanel1);

        jPanel2.add(jsp_categoria, java.awt.BorderLayout.CENTER);

        section_categories.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 0, -1, -1));

        add(section_categories, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private com.superventas.pos.view.components.CategorieButton categorieButton10;
    private com.superventas.pos.view.components.CategorieButton categorieButton11;
    private com.superventas.pos.view.components.CategorieButton categorieButton12;
    private com.superventas.pos.view.components.CategorieButton categorieButton13;
    private com.superventas.pos.view.components.CategorieButton categorieButton14;
    private com.superventas.pos.view.components.CategorieButton categorieButton8;
    private com.superventas.pos.view.components.CategorieButton categorieButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jsp_categoria;
    private javax.swing.JPanel row_items;
    private com.superventas.pos.view.components.SearchBar searchBar1;
    private javax.swing.JPanel section_categories;
    private javax.swing.JPanel section_items;
    private javax.swing.JPanel section_search;
    // End of variables declaration//GEN-END:variables
   
    
    private void cargarProductos(List<Productos> listaProductos){
        int cant_prod = listaProductos.size()-1;
        int row_prod = (cant_prod/6);
        if (cant_prod <= 17) {
            GridLayout gl = new GridLayout(3, 6, 10, 10);
            row_items.setLayout(gl);
            for (int i = 0; i <= 17; i++) {
                if (i<=cant_prod) {
                    row_items.add(new Item(listaProductos.get(i).getNombre(), listaProductos.get(i).getPrecio_venta()));
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
                row_items.add(new Item("Nombre Articulo " + (i+1), 100.00));
            }
        }
    }
}
