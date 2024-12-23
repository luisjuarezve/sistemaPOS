package com.superventas.pos.view.menus;
import com.superventas.pos.model.Carrito;
import com.superventas.pos.model.Categorias;
import com.superventas.pos.model.Cliente;
import com.superventas.pos.model.Detalle_nota_entrega;
import com.superventas.pos.model.Empleados;
import com.superventas.pos.model.Inventario;
import com.superventas.pos.model.ItemCarrito;
import com.superventas.pos.model.Notas_de_entrega;
import com.superventas.pos.model.Productos;
import com.superventas.pos.persistence.CategoriasDAO;
import com.superventas.pos.persistence.ClienteDAO;
import com.superventas.pos.persistence.Detalle_nota_entregaDAO;
import com.superventas.pos.persistence.InventarioDAO;
import com.superventas.pos.persistence.Notas_de_entregaDAO;
import com.superventas.pos.persistence.ProductosDAO;
import com.superventas.pos.view.SuperPOS;
import com.superventas.pos.view.components.CategorieButton;
import com.superventas.pos.view.components.Item;
import com.superventas.pos.view.components.ItemInvoice;
import com.superventas.pos.view.forms.FormCliente;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/**
 *
 * @author Admin
 */
public class PanelFacturar extends javax.swing.JPanel {
    private Dimension tamano;
    private CategoriasDAO catDAO = new CategoriasDAO();
    private Carrito carrito = new Carrito();
    private JPanel body;
    private Empleados empleado;
    private InventarioDAO invD = new InventarioDAO();
    private ProductosDAO proDAO = new ProductosDAO();
    private Timer timer = new Timer();
    private ClienteDAO cliDAO = new ClienteDAO();
    private Cliente cliente = null;
    private Notas_de_entregaDAO notaDAO = new Notas_de_entregaDAO();
    private Detalle_nota_entregaDAO detalleDAO = new Detalle_nota_entregaDAO();
    private InventarioDAO invDAO = new InventarioDAO();
    /**
     * Creates new form MenuPrincipal
     */
    

    public PanelFacturar(Dimension tamano, JPanel body, Empleados empleado) {
        initComponents();
        this.tamano = tamano;
        this.body= body;
        this.empleado = empleado;
        this.setPreferredSize(tamano);
        responsive(tamano);
        cargarMontoFactura(carrito);
        cargarCategorias(catDAO.LeerTodosCategorias());
        cargarProductos(proDAO.LeerTodosProductos());
        jsp_categoria.getVerticalScrollBar().setUnitIncrement(16);
        jsp_products.getVerticalScrollBar().setUnitIncrement(16);
        lbl_nro_nota.setText(String.valueOf(notaDAO.contarNotasDeEntrega() + 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        section_search = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        searchBar1 = new com.superventas.pos.view.components.SearchBar();
        section_items = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        row_items = new javax.swing.JPanel();
        section_categories = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jsp_categoria = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        invoice_section = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        header_invoice = new com.superventas.pos.view.components.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        content_text = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_nota = new javax.swing.JLabel();
        lbl_nro_nota = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl_cliente = new javax.swing.JLabel();
        lbl_cliente_nombre = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_cedula_cliente = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        products_invoice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        products_container = new javax.swing.JPanel();
        jsp_products = new javax.swing.JScrollPane();
        items = new javax.swing.JPanel();
        Contenedor_montoaPagar = new javax.swing.JPanel();
        Contenedor_totalPagar = new javax.swing.JPanel();
        Contenedor_totalapagar = new com.superventas.pos.view.components.RoundedPanel();
        lbl_totalApagar = new javax.swing.JLabel();
        contenedor_subtotalImpuestoTotal = new javax.swing.JPanel();
        Contenedor = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lbl_exento = new javax.swing.JLabel();
        lbl_exento_dolar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_exento_bs = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbl_big = new javax.swing.JLabel();
        lbl_big_dolar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_big_bs = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbl_iva = new javax.swing.JLabel();
        lbl_iva_dolar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_iva_bs = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_precioTotalapagarDolares = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_PrecioTotalapagarBolivares = new javax.swing.JLabel();
        Separador = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        payment_invoice = new javax.swing.JPanel();
        contenedor_buttom = new javax.swing.JPanel();
        btn_pagar = new com.superventas.pos.view.components.RoundedButton1_Invoice();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 944));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 944));
        jPanel1.setLayout(new java.awt.BorderLayout());

        section_search.setBackground(new java.awt.Color(204, 204, 204));
        section_search.setOpaque(false);
        section_search.setPreferredSize(new java.awt.Dimension(840, 100));
        section_search.setLayout(new java.awt.GridBagLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        searchBar1.setText("ESCRIBE EL NOMBRE O CODIGO DEL PRODUCTO A BUSCAR");
        searchBar1.setPreferredSize(new java.awt.Dimension(735, 60));
        searchBar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBar1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBar1FocusLost(evt);
            }
        });
        searchBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar1KeyReleased(evt);
            }
        });
        jPanel3.add(searchBar1);

        section_search.add(jPanel3, new java.awt.GridBagConstraints());

        jPanel1.add(section_search, java.awt.BorderLayout.PAGE_START);

        section_items.setBackground(new java.awt.Color(255, 255, 255));
        section_items.setOpaque(false);
        section_items.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setBorder(null);
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

        section_items.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(section_items, java.awt.BorderLayout.CENTER);

        section_categories.setBackground(new java.awt.Color(255, 255, 255));
        section_categories.setPreferredSize(new java.awt.Dimension(100, 137));
        section_categories.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(776, 130));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jsp_categoria.setBackground(new java.awt.Color(255, 255, 255));
        jsp_categoria.setBorder(null);
        jsp_categoria.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jsp_categoria.setFocusable(false);
        jsp_categoria.setPreferredSize(new java.awt.Dimension(840, 137));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jsp_categoria.setViewportView(jPanel10);

        jPanel2.add(jsp_categoria, java.awt.BorderLayout.CENTER);

        section_categories.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(section_categories, java.awt.BorderLayout.PAGE_END);

        add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(440, 1024));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invoice_section.setOpaque(false);
        invoice_section.setPreferredSize(new java.awt.Dimension(420, 904));
        invoice_section.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(420, 984));
        jPanel5.setLayout(new java.awt.BorderLayout());

        header_invoice.setBackground(new java.awt.Color(41, 1, 138));
        header_invoice.setPreferredSize(new java.awt.Dimension(430, 100));
        header_invoice.setRoundTopLeft(5);
        header_invoice.setRoundTopRight(5);
        header_invoice.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\bill.png"));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        header_invoice.add(jLabel2, java.awt.BorderLayout.WEST);

        content_text.setOpaque(false);
        content_text.setPreferredSize(new java.awt.Dimension(300, 80));
        content_text.setLayout(new java.awt.GridBagLayout());

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_nota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nota.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nota.setText("Nota de Entrega: N°");
        jPanel7.add(lbl_nota);

        lbl_nro_nota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nro_nota.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nro_nota.setText("000000");
        jPanel7.add(lbl_nro_nota);

        jPanel6.add(jPanel7);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_cliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cliente.setText("Nombre Cliente:");
        jPanel8.add(lbl_cliente);

        lbl_cliente_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_cliente_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(lbl_cliente_nombre);

        jPanel6.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_cedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cedula.setText("Cedula Cliente:");
        jPanel9.add(lbl_cedula);

        lbl_cedula_cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_cedula_cliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cedula_cliente.setText("V.-00000000");
        jPanel9.add(lbl_cedula_cliente);

        jPanel6.add(jPanel9);

        content_text.add(jPanel6, new java.awt.GridBagConstraints());

        header_invoice.add(content_text, java.awt.BorderLayout.CENTER);

        jPanel11.setOpaque(false);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jButton1.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\search_user.png"));
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1);

        jButton3.setIcon(new ImageIcon("src\\main\\java\\com\\superventas\\pos\\img\\close.png"));
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton3);

        jPanel11.add(jPanel12);

        header_invoice.add(jPanel11, java.awt.BorderLayout.EAST);

        jPanel5.add(header_invoice, java.awt.BorderLayout.PAGE_START);

        products_invoice.setOpaque(false);
        products_invoice.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Articulos Seleccionados");
        jLabel1.setPreferredSize(new java.awt.Dimension(141, 50));
        products_invoice.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        products_container.setBackground(new java.awt.Color(255, 255, 255));
        products_container.setOpaque(false);
        products_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jsp_products.setBorder(null);
        jsp_products.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsp_products.setPreferredSize(new java.awt.Dimension(376, 465));

        items.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout itemsLayout = new javax.swing.GroupLayout(items);
        items.setLayout(itemsLayout);
        itemsLayout.setHorizontalGroup(
            itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        itemsLayout.setVerticalGroup(
            itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jsp_products.setViewportView(items);

        products_container.add(jsp_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, -1, -1));

        products_invoice.add(products_container, java.awt.BorderLayout.CENTER);

        Contenedor_montoaPagar.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor_montoaPagar.setPreferredSize(new java.awt.Dimension(430, 177));
        Contenedor_montoaPagar.setLayout(new java.awt.BorderLayout());

        Contenedor_totalPagar.setBackground(new java.awt.Color(255, 51, 51));
        Contenedor_totalPagar.setOpaque(false);
        Contenedor_totalPagar.setPreferredSize(new java.awt.Dimension(430, 58));
        Contenedor_totalPagar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor_totalapagar.setBackground(new java.awt.Color(168, 8, 72));
        Contenedor_totalapagar.setPreferredSize(new java.awt.Dimension(400, 48));
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
        lbl_totalApagar.setPreferredSize(new java.awt.Dimension(158, 25));
        Contenedor_totalapagar.add(lbl_totalApagar, java.awt.BorderLayout.CENTER);

        Contenedor_totalPagar.add(Contenedor_totalapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        Contenedor_montoaPagar.add(Contenedor_totalPagar, java.awt.BorderLayout.NORTH);

        contenedor_subtotalImpuestoTotal.setOpaque(false);
        contenedor_subtotalImpuestoTotal.setPreferredSize(new java.awt.Dimension(430, 69));

        Contenedor.setOpaque(false);
        Contenedor.setPreferredSize(new java.awt.Dimension(320, 68));
        Contenedor.setLayout(new java.awt.GridLayout(4, 0));

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_exento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_exento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exento.setText("EXENTO:");
        lbl_exento.setToolTipText("");
        jPanel13.add(lbl_exento);

        lbl_exento_dolar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_exento_dolar.setText("200$");
        jPanel13.add(lbl_exento_dolar);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("-");
        jPanel13.add(jLabel9);

        lbl_exento_bs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_exento_bs.setText("8000 bs");
        jPanel13.add(lbl_exento_bs);

        Contenedor.add(jPanel13);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_big.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_big.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_big.setText("BI G:");
        lbl_big.setToolTipText("");
        jPanel14.add(lbl_big);

        lbl_big_dolar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_big_dolar.setText("800$");
        jPanel14.add(lbl_big_dolar);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("-");
        jPanel14.add(jLabel7);

        lbl_big_bs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_big_bs.setText("280000 Bs");
        jPanel14.add(lbl_big_bs);

        Contenedor.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbl_iva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_iva.setText("IVA 16% :");
        jPanel15.add(lbl_iva);

        lbl_iva_dolar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_iva_dolar.setText("128$");
        jPanel15.add(lbl_iva_dolar);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("-");
        jPanel15.add(jLabel10);

        lbl_iva_bs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_iva_bs.setText("5000 bs");
        jPanel15.add(lbl_iva_bs);

        Contenedor.add(jPanel15);

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL A PAGAR:");
        jPanel16.add(jLabel5);

        lbl_precioTotalapagarDolares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_precioTotalapagarDolares.setText("1128$");
        jPanel16.add(lbl_precioTotalapagarDolares);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("-");
        jPanel16.add(jLabel8);

        lbl_PrecioTotalapagarBolivares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_PrecioTotalapagarBolivares.setText("40000bs");
        jPanel16.add(lbl_PrecioTotalapagarBolivares);

        Contenedor.add(jPanel16);

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

        jPanel5.add(products_invoice, java.awt.BorderLayout.CENTER);

        payment_invoice.setOpaque(false);
        payment_invoice.setPreferredSize(new java.awt.Dimension(430, 100));

        contenedor_buttom.setOpaque(false);
        contenedor_buttom.setPreferredSize(new java.awt.Dimension(400, 90));
        contenedor_buttom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        btn_pagar.setBackground(new java.awt.Color(41, 1, 138));
        btn_pagar.setBorder(null);
        btn_pagar.setForeground(new java.awt.Color(255, 255, 255));
        btn_pagar.setText("Cobrar");
        btn_pagar.setEnabled(false);
        btn_pagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_pagar.setPreferredSize(new java.awt.Dimension(400, 90));
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });
        contenedor_buttom.add(btn_pagar);

        payment_invoice.add(contenedor_buttom);

        jPanel5.add(payment_invoice, java.awt.BorderLayout.SOUTH);

        invoice_section.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel4.add(invoice_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(jPanel4, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBar1FocusGained
        if (searchBar1.getText().equals("ESCRIBE EL NOMBRE O CODIGO DEL PRODUCTO A BUSCAR")) {
            searchBar1.setText("");
        }
    }//GEN-LAST:event_searchBar1FocusGained

    private void searchBar1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBar1FocusLost
        if (searchBar1.getText().equals("")) {
            searchBar1.setText("ESCRIBE EL NOMBRE O CODIGO DEL PRODUCTO A BUSCAR");
        }
    }//GEN-LAST:event_searchBar1FocusLost

    private void searchBar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar1KeyReleased
        timer.cancel(); // Cancelar el temporizador anterior
        timer = new Timer(); // Crear un nuevo temporizador
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    row_items.removeAll();
                    row_items.revalidate();
                    row_items.repaint();
                    cargarProductos(proDAO.LeerTodosProductosBuscador(searchBar1.getText()));
                });
            }
        }, 300);
    }//GEN-LAST:event_searchBar1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedula = JOptionPane.showInputDialog(null, "Digite la cedula del cliente", "Leer Cedula", JOptionPane.QUESTION_MESSAGE);

        cliente = cliDAO.leerClienteCedula(cedula);
        if (cliente != null) {
            verificarEstadoBotonPagar();
        } else {
            JOptionPane.showMessageDialog(null, "Cedula no registrada en el Sistema", "Registrar cliente", JOptionPane.QUESTION_MESSAGE);
            FormCliente fr = new FormCliente(cedula);
            fr.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    boolean ventanaCerrada = true;
                    if (ventanaCerrada) {
                        cliente = cliDAO.leerClienteCedula(cedula);
                        verificarEstadoBotonPagar();
                    }
                }
            });
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cliente.limpiar();
        verificarEstadoBotonPagar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
        try {
            notaDAO.insertarNotasDeEntrega(new Notas_de_entrega(0, cliente.getCliente_id(), empleado.getEmpleado_id(), "PAGADO", LocalDate.now(), carrito.calcularBIG()+carrito.calcularExcento(), carrito.calcularIVA(), carrito.calcularBIG()+carrito.calcularExcento()+carrito.calcularIVA()));
            JOptionPane.showMessageDialog(this, "Nota de entrega registrada Exitosamente!", "Registro Exitoso!", JOptionPane.INFORMATION_MESSAGE);
            try {
                ArrayList<ItemCarrito> listaProductos = carrito.getItems();
                for (ItemCarrito Producto : listaProductos) {
                    Detalle_nota_entrega dnt = new Detalle_nota_entrega();
                    dnt.setNota_id(Integer.parseInt(lbl_nro_nota.getText()));
                    dnt.setProducto_id(Producto.getProducto().getProducto_id());
                    dnt.setCantidad(Producto.getCantidad());
                    dnt.setImpuesto(Producto.getProducto().getImpuesto());
                    dnt.setPrecio_unitario(Producto.getProducto().getPrecio_venta());
                    detalleDAO.insertarDetalle_nota_entrega(dnt);
                    invDAO.modificarInventario(String.valueOf(Producto.getInventario().getId()), new Inventario(0, invDAO.leerInventario(Producto.getProducto().getProducto_id()).getCantidad()-Double.parseDouble(String.valueOf(Producto.getCantidad())), Producto.getInventario().getInventario_min(), Producto.getInventario().getInventario_max(), Producto.getProducto().getProducto_id()));
                }
                cliente.limpiar();
                carrito.limpiarCarrito();
                verificarEstadoBotonPagar();
                cargarProductosFactura(carrito);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al insertar los detalles!", "Error de registro", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Contenedor_montoaPagar;
    private javax.swing.JPanel Contenedor_totalPagar;
    private com.superventas.pos.view.components.RoundedPanel Contenedor_totalapagar;
    private javax.swing.JPanel Separador;
    private com.superventas.pos.view.components.RoundedButton1_Invoice btn_pagar;
    private javax.swing.JPanel contenedor_buttom;
    private javax.swing.JPanel contenedor_subtotalImpuestoTotal;
    private javax.swing.JPanel content_text;
    private com.superventas.pos.view.components.RoundedPanel header_invoice;
    private javax.swing.JPanel invoice_section;
    private javax.swing.JPanel items;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jsp_categoria;
    private javax.swing.JScrollPane jsp_products;
    private javax.swing.JLabel lbl_PrecioTotalapagarBolivares;
    private javax.swing.JLabel lbl_big;
    private javax.swing.JLabel lbl_big_bs;
    private javax.swing.JLabel lbl_big_dolar;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cedula_cliente;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_cliente_nombre;
    private javax.swing.JLabel lbl_exento;
    private javax.swing.JLabel lbl_exento_bs;
    private javax.swing.JLabel lbl_exento_dolar;
    private javax.swing.JLabel lbl_iva;
    private javax.swing.JLabel lbl_iva_bs;
    private javax.swing.JLabel lbl_iva_dolar;
    private javax.swing.JLabel lbl_nota;
    private javax.swing.JLabel lbl_nro_nota;
    private javax.swing.JLabel lbl_precioTotalapagarDolares;
    private javax.swing.JLabel lbl_totalApagar;
    private javax.swing.JPanel payment_invoice;
    private javax.swing.JPanel products_container;
    private javax.swing.JPanel products_invoice;
    private javax.swing.JPanel row_items;
    private com.superventas.pos.view.components.SearchBar searchBar1;
    private javax.swing.JPanel section_categories;
    private javax.swing.JPanel section_items;
    private javax.swing.JPanel section_search;
    // End of variables declaration//GEN-END:variables
    private void responsive(Dimension tamano){
        //############# panel izquierdo (productos) ##############
            jPanel1.setPreferredSize(new Dimension((int) (tamano.width*0.7), tamano.height));
            //----- parte centro seccion de productos
            section_items.setPreferredSize(new Dimension((int) (tamano.width*0.7), tamano.height-237));
            jScrollPane2.setPreferredSize(new Dimension((int) (tamano.width*0.7)-20, tamano.height-257));
            //----- parte de abajo abajo categorias -----
            section_categories.setPreferredSize(new Dimension((int) ((tamano.width*0.7)), 130));
            jPanel2.setPreferredSize(new Dimension((int) ((tamano.width*0.7)-20), 137));
        //########### panel izquierdo (productos) #############
        
        //########### panel derecho (facturar) ##############
            jPanel4.setPreferredSize(new Dimension((int) (tamano.width*0.3), tamano.height));
            invoice_section.setPreferredSize(new Dimension((int) ((tamano.width*0.3)-20), tamano.height-20));
            //------- parte items -------
            products_container.setPreferredSize(new Dimension((int) ((tamano.getSize().width*0.30)), tamano.getSize().height-447));
            content_text.setPreferredSize(new Dimension((int) ((tamano.getSize().width*0.30)), 80));
            jLabel1.setPreferredSize(new Dimension(new Dimension((int) ((tamano.getSize().width*0.30)), 50)));
            Contenedor_montoaPagar.setPreferredSize(new Dimension((int) ((tamano.getSize().width*0.30)), 177));
            payment_invoice.setPreferredSize(new Dimension((int) ((tamano.getSize().width*0.30)), 100));
            jsp_products.setPreferredSize(new Dimension((int) ((tamano.getSize().width*0.30)-50), tamano.getSize().height-447));
            
            //########### panel derecho (facturar) ##############
            System.out.println(tamano.getSize().height-447);
    }
    
    public void cargarProductosFactura(Carrito carrito) {
        items.removeAll();
        int cant_prod = carrito.getItems().size();
        if (cant_prod<3) {
            GridLayout gl = new GridLayout(3, 1, 10, 10);
            items.setLayout(gl);
            for (ItemCarrito item : carrito.getItems()) {
                items.add(new ItemInvoice(new Dimension((int) ((tamano.getSize().width*0.30)-40), 75), item.getProducto(), item.getCantidad(), item.getInventario(), carrito, SuperPOS.getTasa(), this));
                items.revalidate();
                items.repaint();
            }
        }else{
            GridLayout gl = new GridLayout(cant_prod, 1, 10, 10);
            items.setLayout(gl);
            for (ItemCarrito item : carrito.getItems()) {
                items.add(new ItemInvoice(new Dimension((int) ((tamano.getSize().width*0.30)-40), 75), item.getProducto(), item.getCantidad(), item.getInventario(), carrito, SuperPOS.getTasa(), this));
                
            }
        }
        items.revalidate();
        items.repaint();
        cargarMontoFactura(carrito);
        verificarEstadoBotonPagar();
    }
    
    private void cargarCategorias(List<Categorias> listaCategorias) {
        jPanel10.add(new CategorieButton(new Categorias(0, "TODAS", ""),row_items, carrito, SuperPOS.getTasa(), this));
        for (Categorias categoria : listaCategorias) {
            jPanel10.add(new CategorieButton(categoria, row_items, carrito, SuperPOS.getTasa(), this));
        }
    }
    
    private void cargarProductos(List<Productos> listaProductos){
        int cant_prod = listaProductos.size()-1;
        int row_prod = (cant_prod/6);
        if (cant_prod <= 17) {
            GridLayout gl = new GridLayout(3, 6, 10, 10);
            row_items.setLayout(gl);
            for (int i = 0; i <= 17; i++) {
                if (i<=cant_prod) {
                    Inventario inventario = invD.leerInventario(listaProductos.get(i).getProducto_id());
                    if (inventario.getCantidad()>0) {
                        Item item = new Item(listaProductos.get(i), inventario, carrito, SuperPOS.getTasa(), this);
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
                    row_items.add(new Item(listaProductos.get(i), inventario, carrito, SuperPOS.getTasa(), this));
                }
            }
        }
    }
    
    private void verificarEstadoBotonPagar() {
        if (cliente != null) {
            lbl_cliente_nombre.setText(cliente.getNombre().toUpperCase() + " " + cliente.getApellido().toUpperCase());
            lbl_cedula_cliente.setText("V.-" + cliente.getCedula());
            double monto_total = carrito.calcularBIG()+carrito.calcularExcento()+carrito.calcularIVA();
            if (monto_total > 0 && !lbl_cliente_nombre.getText().isBlank()) {
                btn_pagar.setEnabled(true);
                btn_pagar.setText("Cobrar (" + String.format("%.2f", monto_total) + ") $");
            } else {
                btn_pagar.setText("Cobrar");
                btn_pagar.setEnabled(false);
            }
        }
    }

    private void cargarMontoFactura(Carrito carrito) {
        lbl_exento_dolar.setText(String.format(Locale.US,"%.2f", carrito.calcularExcento())+" $");
        lbl_exento_bs.setText(String.format(Locale.US,"%.2f", carrito.calcularExcento()*SuperPOS.getTasa())+" Bs");
        lbl_big_dolar.setText(String.format(Locale.US,"%.2f", carrito.calcularBIG())+" $");
        lbl_big_bs.setText(String.format(Locale.US,"%.2f", carrito.calcularBIG()*SuperPOS.getTasa())+" Bs");
        lbl_iva_dolar.setText(String.format(Locale.US,"%.2f", carrito.calcularIVA())+" $");
        lbl_iva_bs.setText(String.format(Locale.US,"%.2f", carrito.calcularIVA())+" Bs");
        lbl_precioTotalapagarDolares.setText(String.format(Locale.US,"%.2f", carrito.calcularBIG()+carrito.calcularExcento()+carrito.calcularIVA())+" $");
        lbl_PrecioTotalapagarBolivares.setText(String.format(Locale.US,"%.2f", carrito.calcularBIG()+carrito.calcularExcento()+carrito.calcularIVA()*SuperPOS.getTasa())+" Bs");
    }
}
