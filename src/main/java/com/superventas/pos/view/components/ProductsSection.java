package com.superventas.pos.view.components;

import com.superventas.pos.model.Carrito;
import com.superventas.pos.model.Categorias;
import com.superventas.pos.model.Inventario;
import com.superventas.pos.model.Productos;
import com.superventas.pos.persistence.CategoriasDAO;
import com.superventas.pos.persistence.InventarioDAO;
import com.superventas.pos.persistence.ProductosDAO;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class ProductsSection extends javax.swing.JPanel {
    private ProductosDAO proD = new ProductosDAO();
    private InventarioDAO invD = new InventarioDAO();
    private Carrito carrito;
    private BillingSection bs;
    private double tasa;
    private CategoriasDAO catDAO = new CategoriasDAO();
    
    public ProductsSection(Carrito carrito, BillingSection bs, double tasa) {
        this.carrito = carrito;
        this.bs = bs;
        this.tasa = tasa;
        initComponents();
        responsive();
        cargarProductos(proD.LeerTodosProductos());
        cargarCategorias(catDAO.LeerTodosCategorias());
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

        btn_search.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\search.png"));
        btn_search.setBorder(null);
        btn_search.setBorderPainted(false);
        btn_search.setContentAreaFilled(false);
        btn_search.setFocusable(false);
        btn_search.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
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
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));
        jsp_categoria.setViewportView(jPanel1);

        jPanel2.add(jsp_categoria, java.awt.BorderLayout.CENTER);

        section_categories.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        add(section_categories, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
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
                    Inventario inventario = invD.leerInventario(listaProductos.get(i).getProducto_id());
                    Item item = new Item(listaProductos.get(i), inventario, carrito, bs, tasa);
                    row_items.add(item);
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
                row_items.add(new Item(listaProductos.get(i), inventario, carrito,bs, tasa));
            }
        }
    }
    
    private void responsive(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ProductsSectionSize = null;
        setPreferredSize(ProductsSectionSize = new Dimension((int) (screenSize.width*0.70), screenSize.height-80));
        int sectionSize = (int)(screenSize.width*0.70);
        section_search.setPreferredSize(new Dimension(sectionSize-30,60));
        jScrollPane2.setPreferredSize(new Dimension(sectionSize-20, screenSize.height-327));
        jPanel2.setPreferredSize(new Dimension(sectionSize-20, 137));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        jsp_categoria.getHorizontalScrollBar().setUnitIncrement(16);
    }

    private void cargarCategorias(List<Categorias> listaCategorias) {
        jPanel1.add(new CategorieButton(new Categorias(0, "TODAS", ""), row_items, carrito, bs, tasa));
        for (Categorias categoria : listaCategorias) {
            jPanel1.add(new CategorieButton(categoria, row_items, carrito, bs, tasa));
        }
    }
    
}
